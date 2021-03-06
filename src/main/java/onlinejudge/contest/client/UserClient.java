package onlinejudge.contest.client;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "onlinejudge-ms-user")
@RequestMapping("/onlinejudge-ms-user")
public interface UserClient {
	@RequestMapping("/get-user-id-by-email")
	public @ResponseBody String getUserIDByEmail(@RequestParam Map<String, Object> param);
}
