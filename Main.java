package list04_03;


import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name; /*}*/  /* equals()をオーバーライドしていない */

	//	ここは自分で記述	/*①	*/
public boolean equals(Object o) {
	if(o==this)return true;
	if(o==null)return false;
	if(!(o instanceof Hero))return false;
	Hero h = (Hero)o;
	if(!this.name.trim().equals(h.name.trim())) {return false;}
	return true;
}

//@Override
//public String toString() {
//	return "Hero [name=" + name + "]";
//	}
}
/*---------*/

public class Main {
    public static void main(String[] args) {
//        Hero型のリストを作る
        List<Hero> list = new ArrayList<Hero>();
        Hero h1 = new Hero();h1.name="test";
//        Hero h2 = new Hero();h1.name="test";
        list.add(h1);
        list.add(h1);
        list.add(h1);
        list.add(h1);
        System.out.println("要素数=" + list.size());
        h1 = new Hero();
        h1.name="test";
        list.add(h1);
        System.out.println("要素数=" + list.size());
        int hoken = 0;
        while(list.size()>0 || hoken==10) {
        	System.out.println(list.remove(h1));
            System.out.println("要素数=" + list.size());
            hoken++;
        }
    }
}
//これだと上手くいくが、h2、h3、など新インスタンスを作り、addすると失敗するのはなぜ？
// public boolean equals(Object o) のif(o==this)return true;をなくせばh2,h3でも行けると思ったがむりだった。
