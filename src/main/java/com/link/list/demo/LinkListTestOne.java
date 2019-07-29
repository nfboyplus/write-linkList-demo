package com.link.list.demo;

import com.link.list.demo.ext.ExtLinkedList;

/**
 * 纯手写LinkedList
 * 1.LinkedList底层的数据结构是基于双向循环链表的，且头结点中不存放数据
 */
public class LinkListTestOne {

    public static void main(String[] args) {
        ExtLinkedList<String> linkList = new ExtLinkedList<String>();
        linkList.add("A");
        linkList.add("B");
        linkList.add("C");
        linkList.add("D");
        System.out.println("添加之前:" + linkList.get(2));
        linkList.add(2, "E");
        System.out.println("添加之后:" + linkList.get(2));
        //其实从头查到尾：效率不高，查询算法：折半查找
        for (int i = 0; i < linkList.getSize(); i++) {
            System.out.println(linkList.get(i));
        }
        System.out.println("删除之前:" + linkList.get(2));
        linkList.remove(1);
        System.out.println("删除之后:" + linkList.get(2));
    }

    /**
     * 数据结构：数组、链表、二叉树、红黑树
     */

    /**
     *  * LinkedList 与 ArrayList存储或者删除哪个效率高？
     *  1.ArrayList集合实现添加或者删除的时候,数组扩容问题
     *  2.LinkedList 是基于链表实现的（通过名字也能区分开来），所以它的插入和删除操作比 ArrayList 更加高效
     *  3.也是由于其为基于链表的，所以随机访问的效率要比 ArrayList 差
     */

    /**
     * 数组：
     * 1.数组是将元素在内存中连续存放，由于每个元素占用内存相同，可以通过下标迅速访问数组中任何元素；
     * 2.如果要在数组中增加一个元素，需要移动大量元素，在内存中空出一个元素的空间，然后将要增加的元素放在其中；
     * 3.如果想删除一个元素，同样需要移动大量元素去填掉被移动的元素；
     * 4.如果应用需要快速访问数据，很少插入和删除元素，就应该用数组。
     */

    /**
     * 链表：
     * 1.链表中的元素在内存中不是顺序存储的，而是通过存在元素中的指针联系到一起；
     * 2.每个结点包括两个部分：一个是存储数据元素的数据域，另一个是存储下一个结点地址的指针；
     * 3.如果要访问链表中一个元素，需要从第一个元素开始，一直找到需要的元素位置；
     * 4.如果增加和删除一个元素对于链表数据结构就非常简单了，只要修改元素中的指针就可以了；
     * 5.如果应用需要经常插入和删除元素你就需要用链表。
     */

}
