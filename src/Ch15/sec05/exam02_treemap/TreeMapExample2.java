package Ch15.sec05.exam02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		TreeMap<Integer, String>scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박실순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		NavigableMap<Integer, String>descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>>descendingEnrtySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry:descendingEnrtySet ) {
			System.out.print(entry.getKey()+"-"+entry.getValue()+ " ");
		}System.out.println();
		
		NavigableMap<Integer, String>ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>>ascendingEnrtySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry:ascendingEnrtySet ) {
			System.out.print(entry.getKey()+"-"+entry.getValue()+ " ");
		}
		
	}

}
