package com.example.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.config.Task;

import com.example.demo.al.*;
import com.example.demo.hashset.HashSetUserDefinedObjectExample;
import com.example.demo.ll.CreateLinkedListExample;
import com.example.demo.ll.IterateOverLinkedListExample;
import com.example.demo.pqueue.PriorityQueueCustomComparatorExample;
import com.example.demo.pqueue.PriorityQueueUserDefinedObjectExample;
import com.example.demo.que.QueueExample;
import com.example.demo.que.QueueSizeSearchFrontExample;
import com.example.demo.treemap.CreateTreeMapExample;
import com.example.demo.treeset.CreateTreeSetExample;
import com.example.demo.treeset.TreeSetDescendingOrderExample;
import com.example.demo.treeset.TreeSetUserDefinedObjectExample;


@SpringBootApplication
public class CollectionsApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(CollectionsApplication.class, args);
		AccessElementFromArrayList al = new AccessElementFromArrayList();
		//al.accessElementFromAL();
		ArrayListCollectionsSortExample ls = new ArrayListCollectionsSortExample();
		//ls.arrayListCollectionsSort();
		ArrayListIteratorRemoveExample ar = new ArrayListIteratorRemoveExample();
		//ar.ArrayListIteratorRemove();
		
		ArrayListObjectSortExample example = new ArrayListObjectSortExample();
        example.addPerson("Sachin", 47);
        example.addPerson("John", 30);
        example.addPerson("Jane", 25);

        // Printing the list of people
//        for (Person person : example.getPeople()) {
//            System.out.println(person);
//        }
        
     // Use the custom comparator to sort the list based on age
     example.sortPeopleByAge();
     
//     for (Person person : example.getPeople()) {
//         System.out.println(person);
//     }
     
//     ArrayListSortExample alse = new ArrayListSortExample();
//     alse.nameAdd("Lisa");
//     alse.nameAdd("Jennifer");
//     alse.nameAdd("Mark");
//     alse.nameAdd("David");
//     
//     for (String string : alse.getName()) {
//    	 System.out.println("before sorting ::"+string);
//		
//	}
//     
//     alse.sortNames();
//     for (String string : alse.getName()) {
//    	 System.out.println("After sorting"+string);
//	}
     
//     IterateOverArrayListExample ioal = new IterateOverArrayListExample();
//     	ioal.addShows("Breaking Bad");
//         ioal.addShows("Game Of Thrones");
//         ioal.addShows("Friends");
//         ioal.addShows("Prison break");
//         
//         ioal.forEac();
//         ioal.forremaining();
//         ioal.iter();
//         ioal.listIter();
//         ioal.simpleFor();
     
//     
//     SynchronizedArrayListExample sal = new SynchronizedArrayListExample();
//     sal.addNum(1);
//     sal.addNum(2);
//     sal.addNum(3);
//     
//     sal.syncArr();
     
     
     // LinkedList
     
//     CreateLinkedListExample ll = new CreateLinkedListExample();
//     ll.linkedList(0,"Rajeev");
//     ll.linkedList(1,"John");
//     ll.linkedList(2,"David");
//     ll.linkedList(3,"Chris");
//    
//     // Adding an element at the specified position in the LinkedList
//     
//     ll.linkedList(3, "ss");
//     // Adding an element at the beginning of the LinkedList
//     ll.linkedListAddFirst("FF");
//     
//     // Adding an element at the beginning of the LinkedList
//       ll.linkedListAddLast("LL");
     
     
//	
//     IterateOverLinkedListExample  il = new IterateOverLinkedListExample();
//     il.addNames("Homo Sapiens");
//       il.addNames("Homo Neanderthalensis");
//       il.addNames("Homo Erectus");
//      il.addNames("Home Habilis");
//      
//      il.descOrder();
//      il.forEac();
//      il.forEacRe();
//      il.forwardBackward();
     
//     QueueExample qe = new QueueExample();
//     qe.addNames("Rajeev");
//       qe.addNames("Chris");
//        qe.addNames("John");
//       qe.addNames("Mark");
//      qe.addNames("Steven");
//      qe.addNames("Steven");
//      
//      qe.removeName();
//      
//      qe.simfor();
//      qe.removepoll();
//      qe.simfor();
//      QueueSizeSearchFrontExample qs= new QueueSizeSearchFrontExample();
//      
//      qs.addNames("Rajeev");
//      qs.addNames("Chris");
//      qs.addNames("John");
//      qs.addNames("Mark");
//      qs.addNames("Steven");
//      qs.addNames("Steven");
//      
//      qs.pee();
//      qs.searchEle();
//      qs.searchName("Marks");
     
//     PriorityQueueCustomComparatorExample pcc = new PriorityQueueCustomComparatorExample();
//     
//		pcc.nameAdd("Lisa");
//		pcc.nameAdd("Robert");
//		pcc.nameAdd("John");
//		pcc.nameAdd("Chris");
//		pcc.nameAdd("Angelina");
//		pcc.nameAdd("Joe");
//		
//		pcc.removeItem();
     
   
     
//     PriorityQueueUserDefinedObjectExample pqd = new PriorityQueueUserDefinedObjectExample();
//     pqd.addTasks();
//    pqd.removeItem();
     
     // treeset
//     CreateTreeSetExample ct = new CreateTreeSetExample();
//     ct.addFruit();
//    ct.simfor();
//     
//     TreeSetDescendingOrderExample td = new TreeSetDescendingOrderExample();
//     td.addFruit();
//     td.simFor();
     
//     TreeSetUserDefinedObjectExample tu = new TreeSetUserDefinedObjectExample();
//     
//     tu.addEmp();
//     tu.simFor();
     
//     CreateTreeMapExample tm = new CreateTreeMapExample();
//     tm.addKeyValues();
//     tm.print();
     
     HashSetUserDefinedObjectExample hs = new HashSetUserDefinedObjectExample();
     hs.addCust();
     hs.print();
     
     
	}
	

}
