package com.example;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.cloud.service.common.OracleServiceInfo;
import org.springframework.cloud.service.relational.OracleDataSourceCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Profile("cloud")
@EnableRedisHttpSession
@EntityScan("com.example.domain")
@EnableJpaRepositories("com.example.repository")
public class CloudConfiguration {

	@Primary
	@Bean
	public DataSource dataSource() {
		Cloud cloud = new CloudFactory().getCloud();
		OracleServiceInfo serviceInfo = (OracleServiceInfo) cloud.getServiceInfo("oracle-db-service"); 
		DataSource dataSource = new OracleDataSourceCreator().create(serviceInfo, null);
		return dataSource;
	}
}
