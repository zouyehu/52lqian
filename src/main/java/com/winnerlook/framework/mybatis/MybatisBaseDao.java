package com.winnerlook.framework.mybatis;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.winnerlook.framework.base.BaseObject;
import com.winnerlook.framework.base.Page;

/**
 * myBatis基类Dao
 * 
 * @author Hu
 * @date 2017-03-29 新增基于自定义的SQL语句分页方法
 *
 */
public abstract class MybatisBaseDao<T extends BaseObject> extends SqlSessionDaoSupport {

	// 接口泛型T对应的Class字节码
	private Class<T> clazz;

	// 基类Dao接口实现构造函数，主要用于获取接口泛型T对应的Class字节码
	@SuppressWarnings("unchecked")
	public MybatisBaseDao() {
		ParameterizedType parameterizedType = (ParameterizedType) getClass()
				.getGenericSuperclass();
		Type[] typeArguments = parameterizedType.getActualTypeArguments();
		clazz = (Class<T>) typeArguments[0];
	}

	// 查询单个接口泛型对象T
	public T selectOne(String sqlId, Object parameter) {
		String statement = constructStatement(sqlId);
		if (parameter != null) {
			return super.getSqlSession().selectOne(statement, parameter);
		} else {
			return super.getSqlSession().selectOne(statement);
		}

	}

	// 查询单个非接口泛型对象
	public Object selectOneByParameter(String sqlId, Object parameter) {
		String statement = constructStatement(sqlId);
		if (parameter != null) {
			return super.getSqlSession().selectOne(statement, parameter);
		} else {
			return super.getSqlSession().selectOne(statement);
		}
	}

	// 查询接口泛型对象T列表
	public List<T> selectList(String sqlId, Object parameter) {
		String statement = constructStatement(sqlId);
		if (parameter != null) {
			return super.getSqlSession().selectList(statement, parameter);
		} else {
			return super.getSqlSession().selectList(statement);
		}
	}

	// 查询非接口泛型对象T列表
	public List<?> selectListByParameter(String sqlId, Object parameter) {
		String statement = constructStatement(sqlId);
		if (parameter != null) {
			return super.getSqlSession().selectList(statement, parameter);
		} else {
			return super.getSqlSession().selectList(statement);
		}
	}

	// 根据接口泛型对象T插入
	public int insert(String sqlId, T T) {
		String statement = constructStatement(sqlId);
		if (T == null) {
			throw new IllegalArgumentException("接口泛型对象T不能为空");
		} else {
			return super.getSqlSession().insert(statement, T);
		}
	}

	// 根据非接口泛型对象参数插入
	public int insertObject(String sqlId, Object parameter) {
		String statement = constructStatement(sqlId);
		if (parameter != null) {
			return super.getSqlSession().insert(statement, parameter);
		} else {
			return super.getSqlSession().insert(statement);
		}
	}

	// 根据接口泛型对象T更新
	public int update(String sqlId, T T) {
		String statement = constructStatement(sqlId);
		if (T == null) {
			throw new IllegalArgumentException("接口泛型对象T不能为空！");
		} else {
			return super.getSqlSession().update(statement, T);
		}
	}

	// 根据非接口泛型对象参数更新
	public int updateByParameter(String sqlId, Object parameter) {
		String statement = constructStatement(sqlId);
		if (parameter != null) {
			return super.getSqlSession().update(statement, parameter);
		} else {
			return super.getSqlSession().update(statement);
		}
	}

	// 根据接口泛型对象T删除
	public int delete(String sqlId, T T) {
		String statement = constructStatement(sqlId);
		if (T == null) {
			throw new IllegalArgumentException("接口泛型对象T不能为空！");
		} else {
			return super.getSqlSession().delete(statement, T);
		}
	}

	// 根据非接口泛型对象参数删除
	public int deleteByParameter(String sqlId, Object parameter) {
		String statement = constructStatement(sqlId);
		if (parameter != null) {
			return super.getSqlSession().delete(statement, parameter);
		} else {
			return super.getSqlSession().delete(statement);
		}
	}

	// 分页查询（基于方言的分页）
	public Page<T> selectForPage(String sqlId, Page<T> page) {
		String statement = constructStatement(sqlId);
		// 设置分页统计标识为true，让分页插件执行分页统计
		Map<String, Object> paramMap = page.getParamMap();
		paramMap.put("pageCountFlag", true);
		List<T> resultList = super.getSqlSession().selectList(statement, page);
		page.setResultList(resultList);
		
		return page;
	}

	// 分页查询（基于自定义的SQL语句分页）
	public Page<T> selectForPage(String pageCountSqlId, String pageSqlId,
			Page<T> page) {
		// 1.查询总记录数，设置总页数
		String statement = constructStatement(pageCountSqlId);
		Long totalCount = super.getSqlSession().selectOne(statement, page);
		page.setTotalCount(totalCount);
		long totalPage = Page.computeTotalPage(totalCount, page.getPageSize());
		page.setTotalPage(totalPage);

		// 2.通过分页插件查询分页记录（设置分页统计标识为false，让分页插件不执行分页统计）
		statement = constructStatement(pageSqlId);
		Map<String, Object> paramMap = page.getParamMap();
		paramMap.put("pageCountFlag", false);
		List<T> resultList = super.getSqlSession().selectList(statement, page);
		page.setResultList(resultList);

		return page;
	}

	// 构造SQL语句表达式
	private String constructStatement(String sqlId) {
		if (StringUtils.isBlank(sqlId)) {
			throw new IllegalArgumentException("SQL语句id不能为空！");
		} else {
			return clazz.getName() + "." + sqlId;
		}
	}
}
