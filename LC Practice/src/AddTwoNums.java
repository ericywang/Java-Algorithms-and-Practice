/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 

/*
 * Runtime: 2 ms, faster than 67.52% of Java online submissions for Add Two Numbers.
 * Memory Usage: 43.2 MB, less than 88.71% of Java online submissions for Add Two Numbers.
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int sumData = 0, sumRemainder = 0;
        ListNode returnNode = new ListNode(0);
        
        ListNode current = returnNode;
        
        while (l1 != null){
            if(l2 == null){
                sumData = l1.val + sumData;
                if(sumData >= 10){
                    sumRemainder = sumData % 10;
                    sumData = sumData / 10;
                    
                    current.next = new ListNode(sumRemainder);
                    
                }

                else{
                    current.next = new ListNode(sumData);
                    sumData=0;
                }
                
                l1 = l1.next;
                current = current.next;
            }
            
            else{
                sumData = l1.val + l2.val + sumData;

                if(sumData >= 10){
                    sumRemainder = sumData % 10;
                    sumData = sumData / 10;

                    current.next = new ListNode(sumRemainder);
                }

                else{
                    current.next = new ListNode(sumData);
                    sumData = 0; 
                }

                l1 = l1.next;
                l2 = l2.next;
                current = current.next;
            } 
        }
        
        if(l2 != null){
            while (l2 != null){
                sumData = l2.val + sumData;
                if(sumData >= 10){
                    sumRemainder = sumData % 10;
                    sumData = sumData / 10;

                    current.next = new ListNode(sumRemainder);
                    
                }

                else{
                    current.next = new ListNode(sumData);
                    sumData = 0;
                }
                l2 = l2.next;
                current = current.next;
            }
        }
        
        if(sumData != 0){
            current.next = new ListNode(sumData);
        }
        
        return returnNode.next;
    }
        
        
        
    
}
    