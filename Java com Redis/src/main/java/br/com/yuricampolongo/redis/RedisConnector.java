package br.com.yuricampolongo.redis;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import br.com.redis.client.redisquerysimplifier.RedisQuery;

@Startup
@Singleton
public class RedisConnector {

	@PostConstruct
	public void init() {
		String server = "localhost";
		Integer port = 6379;
		RedisQuery.init(server, port, 5000);
	}

}
