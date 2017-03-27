package onlinejudge.contest.client;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import onlinejudge.domain.Problem;
import onlinejudge.domain.Submit;

@FeignClient(name = "onlinejudge-ms-contest")
@RequestMapping("/onlinejudge-ms-contest")
public interface  SubmitClient {
	@RequestMapping(value="/contests/team/submit", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Submit submit(@RequestBody Submit submit);
	
	/**
	 * String problemForContestId
	 * @param param
	 * @return
	 */
	@RequestMapping(value ="/contests/problem_for_contest/problem",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Problem getProblemByProblemForContestId(@RequestParam Map<String, Object> param);
}
