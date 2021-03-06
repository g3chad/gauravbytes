package com.gauravbytes.springjdbc;

import java.util.logging.Logger;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gauravbytes.springjdbc.ds.JdbcDataSourceUtils;

/**
 * Examples of basic querying in JdbcTemplate
 * @author Gaurav Rai Mazra
 * <a href="https://gauravbytes.com">My blog</a>
 * <a href="https://lineofcode.in">Website</a>
 */
public class JdbcTemplateExample {
	private static final Logger log = Logger.getGlobal();
	
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcDataSourceUtils.getH2Database());
		jdbcTemplate.afterPropertiesSet();
		Integer count = jdbcTemplate.queryForObject("select count(*) from product", Integer.class);
		log.info(() -> String.format("There are total %d products", count));
	}
}
