package io.pivotal.stubrunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"stubrunner.repositoryRoot=https://foo", "stubrunner.username=foo", "stubrunner.password=bar"})
public class CfStubRunnerBootApplicationTests {

	@Test
	public void contextLoads() {
	}

}
