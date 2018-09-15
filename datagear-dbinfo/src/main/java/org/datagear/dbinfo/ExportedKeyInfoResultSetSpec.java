/*
 * Copyright (c) 2018 by datagear.org.
 */

package org.datagear.dbinfo;

/**
 * {@linkplain ExportedKeyInfo}结果集规范。
 * 
 * @author datagear@163.com
 *
 */
public class ExportedKeyInfoResultSetSpec extends ResultSetSpec<ExportedKeyInfo>
{
	public static final RsColumnSpec<?, ?>[] RS_COLUMN_SPECS = new RsColumnSpec[] {
			new RsColumnSpec<String, String>("PKCOLUMN_NAME", String.class, true, false, "pkColumnName"),
			new RsColumnSpec<String, String>("FKTABLE_NAME", String.class, true, false, "fkTableName"),
			new RsColumnSpec<String, String>("FKCOLUMN_NAME", String.class, true, false, "fkColumnName"),
			new RsColumnSpec<Integer, Integer>("KEY_SEQ", Integer.class, false, true, 0, "keySeq"),
			new RsColumnSpec<Integer, ImportedKeyRule>("UPDATE_RULE", Integer.class, false, true, "updateRule",
					ImportedKeyInfoResultSetSpec.IMPORTED_KEY_RULE_CONVERTER),
			new RsColumnSpec<Integer, ImportedKeyRule>("DELETE_RULE", Integer.class, false, true, "deleteRule",
					ImportedKeyInfoResultSetSpec.IMPORTED_KEY_RULE_CONVERTER),
			new RsColumnSpec<String, String>("FK_NAME", String.class, false, true, "", "fkName"),
			new RsColumnSpec<String, String>("PK_NAME", String.class, false, true, "", "pkName") };

	public ExportedKeyInfoResultSetSpec()
	{
		super();
	}

	@Override
	protected Class<ExportedKeyInfo> getRowType()
	{
		return ExportedKeyInfo.class;
	}

	@Override
	protected RsColumnSpec<?, ?>[] getRsColumnSpecs()
	{
		return RS_COLUMN_SPECS;
	}
}