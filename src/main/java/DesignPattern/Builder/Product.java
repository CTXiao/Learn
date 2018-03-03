package DesignPattern.Builder;

import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import util.Printer;

public class Product {
	private Map<String, String> parts = new HashMap<String, String>();

	public void add(String key, String value) {
		parts.put(key, value);
	}

	public void show() {
		Printer.Print("-Product Detials-");
		//普通遍历
		Printer.Print("---------------普通遍历----------------");
		for (String key : parts.keySet()) {
			Printer.Print(key + ":" + parts.get(key));
		}
		//iterator遍历
		Printer.Print("---------------iterator遍历-------------");
		Iterator<Map.Entry<String, String>> iterator= parts.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<String, String> entry = iterator.next();
			Printer.Print(entry.getKey()+":"+entry.getValue());
		}
		//Map.entrySet遍历
		Printer.Print("---------------Map.entrySet遍历-------");
		for(Map.Entry<String, String> entry:parts.entrySet())
		{
			Printer.Print(entry.getKey()+":"+entry.getValue());
		}
		//Map.valus()遍历(
		Printer.Print("---------------Map.entrySet遍历-------（无key值）");
		for(String value:parts.values())
		{
			Printer.Print(value);
		}
	}
}
