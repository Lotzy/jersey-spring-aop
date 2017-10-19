package com.lotzy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * <pre>
 * Title: ObjToJsonTest
 * Description: JUnit test for JSON transformations
 * </pre>
 *
 * @author Lotzy
 * @version 1.0
 */
public class ObjToJsonTest {

	@Test
	public void testObjToJsonWithGenericsAndMapper() throws Exception {

		Map<Object, Object> map = new HashMap<>();
		map.put("test1", "value1");
		map.put("test2", "value2");

		Map<Object, Object> map2 = new HashMap<>();
		map2.put("key1", "value1");
		map2.put("key2", "value2");

		map.put("map", map2);

		List<Object> list1 = new ArrayList<>();
		list1.add("li1");
		list1.add("li2");

		map.put("list", list1);

		Object[] arObj = new Object[2];
		arObj[0] = "ar1";
		arObj[1] = "ar2";

		map.put("array", arObj);

		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(map);
		assertNotNull(json);
		System.out.println("With Jackson a ObjectMapper:\n" + json);

	}

	@Test
	public void testObjToJsonWithObjectBuilder() {

		JsonObjectBuilder job = Json.createObjectBuilder();
		job.add("test1", "value1");
		job.add("test2", "value2");

		JsonObjectBuilder job2 = Json.createObjectBuilder();
		job2.add("key1", "value1");
		job2.add("key2", "value2");
		job.add("obj", job2);

		JsonObject jo = job.build();
		System.out.println("With javax.json:\n" + jo.toString());

	}

	@Test
	public void testObjToJsonWithNodeFatory() {

		JsonNodeFactory jnf = JsonNodeFactory.instance;
		ObjectNode root = jnf.objectNode();
		root.put("test1", "value1");
		ArrayNode an = jnf.arrayNode();
		an.add("ar1");
		an.add("ar2");
		root.set("array", an);
		ObjectNode on = jnf.objectNode();
		on.put("key1", "kv1");
		on.put("key2", "kv2");
		root.set("obj", on);
		System.out.println("With Jackson and ObjectNode:\n" + root.toString());

	}

}
