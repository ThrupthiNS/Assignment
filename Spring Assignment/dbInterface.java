package com.sonata.casestudy;

import java.sql.Connection;

public interface dbInterface {
	public Connection getConnection();
	public void closeConnection();
}
