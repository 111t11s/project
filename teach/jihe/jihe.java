/**
 * 集合：ArrayList
 * add 添加  remove 删除  set 修改元素  get 查看元素
 */

package jihe;

import java.util.ArrayList;

public class jihe {
    public static void main(String[] args) {
        //定义一个集合
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.remove("a");
        System.out.println(list);
        list.set(0, "c");
        System.out.println(list);
        list.remove("c");   //删除遇到的第一个符合条件的数据
        System.out.println(list);
        // 修改元素
        list.set(1, "e");
        System.out.println(list);
        // 查看元素
        System.out.println(list.get(1));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
