package chang.cloud;

import chang.cloud.common.launch.AppConstant;
import chang.cloud.common.launch.BladeApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ChangApplication {

	/*public static void main(String[] args) {
		SpringApplication.run(ChangApplication.class, args);
	}*/
	public static void main(String[] args) {
		BladeApplication.run(AppConstant.SYSTEM_PREFIX, ChangApplication.class, args);
	}
}