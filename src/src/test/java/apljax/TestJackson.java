package apljax;

import static org.junit.Assert.*;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.github.apljax.os.Bowl;
import com.github.apljax.process.DefaultBuilder;

public class TestJackson {

    //private final Logger log=LoggerFactory.getLogger(TestJackson.class);

	@Test
	public void test() {

		DefaultBuilder builder=new DefaultBuilder();
		Bowl bowl=builder.pour();

		ObjectMapper mapper=new ObjectMapper();
		ObjectWriter writer=mapper.writerWithDefaultPrettyPrinter();
		try {
			System.out.println(writer.writeValueAsString(bowl));
		} catch (Exception e) {

		}

		assertNotNull(bowl);
	}

}
