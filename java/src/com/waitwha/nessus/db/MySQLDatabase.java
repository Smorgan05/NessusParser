package com.waitwha.nessus.db;

import com.waitwha.nessus.NessusClientData;

/**
 * <b>Nessus Trend Analyzer</b>: MySQLDatabase<br/>
 * <small>Copyright (c)2013 Mike Duncan &lt;<a href="mailto:mike.duncan@waitwha.com">mike.duncan@waitwha.com</a>&gt;</small><p />
 *
 * <pre>
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * </pre>
 *
 * TODO Document this class/interface.
 *
 * @author Mike Duncan <mike.duncan@waitwha.com>
 * @version $Id$
 * @package com.waitwha.nessus.trendanalyzer.db
 */
public class MySQLDatabase extends Database {
	
	public static final int DEFAULT_PORT = 3306;
	
	/**
	 * Fully customizable constructor.
	 *
	 * @param host
	 * @param port
	 * @param database
	 * @param username
	 * @param password
	 * @throws DatabaseInitializationException
	 */
	public MySQLDatabase(String host, int port, String database, String username, String password) throws DatabaseInitializationException  {
		super("com.mysql.jdbc.Driver", "jdbc:mysql://"+ host +":"+ port +"/"+ database, username, password, false);
	}
	
	/**
	 * Constructor using default port of 3306.
	 *
	 * @param host
	 * @param database
	 * @param username
	 * @param password
	 * @throws DatabaseInitializationException
	 */
	public MySQLDatabase(String host, String database, String username, String password) throws DatabaseInitializationException  {
		this(host, DEFAULT_PORT, database, username, password);
	}
	
	/**
	 * Constructor using default port 3306 and host of localhost.
	 *
	 * @param database
	 * @param username
	 * @param password
	 * @throws DatabaseInitializationException
	 */
	public MySQLDatabase(String database, String username, String password) throws DatabaseInitializationException  {
		this("localhost", DEFAULT_PORT, database, username, password);
	}

	/**
	 * @see com.waitwha.nessus.db.Database#importScan(com.waitwha.nessus.NessusClientData)
	 */
	@Override
	public void importScan(NessusClientData scan) {
	}

}
