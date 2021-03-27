
package com.ecodation.project;

import java.sql.Connection;
import java.util.ArrayList;

public interface ICrudInterface<T> {
	// CRUD
	void create(T t);

	void update(T t);

	void delete(T t);

	ArrayList<T> list();

	default Connection getConnection() {
		DatabaseConnectionDb connectionDb = new DatabaseConnectionDb();
		return connectionDb.dbSuccessConnection();
	}
}
