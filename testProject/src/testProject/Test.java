package testProject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Test {

	
	public static void main(String[] args) {
		User user=new User("jack",23);
		User user2=new User("jack2",23);
		User user3=new User("jack3",23);
		
		List<User> list=new ArrayList<User>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		Gson gson=new Gson();
		String useString=gson.toJson(list);
		System.out.println(useString);

		Type type = new TypeToken<List<User>>(){}.getType();
		List<User> list2=gson.fromJson(useString, type);
		for (User user4 : list2) {
			System.out.println(user4.getUsername());
		}
		
	}
}
