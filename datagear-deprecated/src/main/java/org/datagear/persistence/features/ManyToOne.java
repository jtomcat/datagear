/*
 * Copyright 2018 datagear.tech. All Rights Reserved.
 */

package org.datagear.persistence.features;

import org.datagear.model.Model;
import org.datagear.model.Property;
import org.datagear.model.PropertyFeature;
import org.datagear.model.support.MU;
import org.datagear.persistence.PersistenceFeature;

/**
 * 多对一关联。
 * <p>
 * 它可用于如下场景：
 * </p>
 * <ul>
 * <li>单元（{@linkplain MU#isSingleProperty(Property)}）属性：
 * <p>
 * 表明模型与属性是多对一关联。
 * </p>
 * </li>
 * </ul>
 * <p>
 * 此特性可以与其他特性结合使用，具体规则如下所示：
 * </p>
 * <ul>
 * <li>有{@linkplain MappedBy}
 * <p>
 * 由属性端决定关联关系的存储结构，属性端的映射属性必须无{@linkplain MappedBy}。
 * </p>
 * </li>
 * <li>无{@linkplain MappedBy}，有{@linkplain PointType#JOIN}值的
 * {@linkplain RelationPoint}
 * <p>
 * 关联关系存储在单独的关联表中，关联表名称默认或者使用{@linkplain TableName}指定，必须有模型端外键列，列名称默认或者使用
 * {@linkplain ModelKeyColumnName}指定，对应模型端外键属性默认为ID属性或者使用
 * {@linkplain ModelKeyPropertyName}指定，必须有属性端外键列，列名称默认或者使用
 * {@linkplain PropertyKeyColumnName}指定，对应属性端外键属性默认为ID属性或者使用
 * {@linkplain PropertyKeyPropertyName}指定。
 * </p>
 * </li>
 * <li>无{@linkplain MappedBy}、有{@linkplain PointType#MODEL}值的
 * {@linkplain RelationPoint}或者无{@linkplain RelationPoint}
 * <p>
 * 关联关系存储在模型表中，必须有属性端外键列，列名称默认或者使用{@linkplain PropertyKeyColumnName}
 * 自定义，对应属性端外键属性默认为ID属性或者使用{@linkplain PropertyKeyPropertyName}指定。
 * </p>
 * </li>
 * </ul>
 * <p>
 * 对于非{@linkplain MappedBy}属性，可选使用{@linkplain PropertyConcreteColumnName}
 * 在表（关联表、模型表）内定义属性端具象列，列值默认为{@linkplain Property#getModel()}的
 * {@linkplain Model#getName()}或者使用 {@linkplain PropertyConcreteColumnValue}自定义；
 * 可选使用{@linkplain ModelConcreteColumnName}在表（关联表、模型表）内定义模型端具象列，列值默认为
 * {@linkplain Model#getName()}或者使用{@linkplain ModelConcreteColumnValue}自定义。
 * </p>
 * <p>
 * 对于非{@linkplain MappedBy}属性，可选使用{@linkplain ModelOrderColumnName}
 * 在表（关联表、属性表）内定义模型端元素值排序列。
 * </p>
 * <p>
 * 此类的设计参考自{@code javax.persistence.ManyToOne}。
 * </p>
 * 
 * @author datagear@163.com
 *
 */
public interface ManyToOne extends PropertyFeature, PersistenceFeature
{
}
