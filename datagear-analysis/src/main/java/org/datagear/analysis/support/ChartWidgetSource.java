/*
 * Copyright (c) 2018 datagear.tech. All Rights Reserved.
 */

package org.datagear.analysis.support;

import org.datagear.analysis.RenderContext;

/**
 * {@linkplain ChartWidget}源。
 * 
 * @author datagear@163.com
 *
 */
public interface ChartWidgetSource
{
	/**
	 * 获取指定ID的{@linkplain ChartWidget}，没有则返回{@code null}。
	 * 
	 * @param id
	 * @return
	 * @throws Throwable
	 */
	<T extends RenderContext> ChartWidget<T> getChartWidget(String id) throws Throwable;
}
