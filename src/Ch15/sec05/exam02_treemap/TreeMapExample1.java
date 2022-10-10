package Ch15.sec05.exam02_treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String>scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박실순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		Map.Entry<Integer, String>entry = null;
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores.lowerEntry(95);
		System.out.println("95점 아래 점수: "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores.higherEntry(95);
		System.out.println("95점 위에 점수: "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores.floorEntry(95);
		System.out.println("95점이거나 바로 아래 점수: "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores.ceilingEntry(95);
		System.out.println("95점이거나 바로 위의 점수: "+entry.getKey()+"-"+entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollLastEntry();
			System.out.println(entry.getKey()+"-"+entry.getValue()+" 남은 객체수: "+scores.size());
		}
	}

}