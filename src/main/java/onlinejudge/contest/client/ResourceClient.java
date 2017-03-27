package onlinejudge.contest.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import onlinejudge.dto.MyResponse;
import onlinejudge.file.dto.GroupResource;

@FeignClient(name = "onlinejudge-ms-resources")
@RequestMapping("/onlinejudge-ms-resources")
public interface ResourceClient {
	
	@RequestMapping(value = "/upfiles", method=RequestMethod.POST)
	@ResponseBody
	public MyResponse upfile(@RequestBody GroupResource groupResource);
	
	@RequestMapping( value = "/downfiles", method=RequestMethod.POST)
	public @ResponseBody GroupResource downfile(@RequestBody GroupResource groupResource);
}
