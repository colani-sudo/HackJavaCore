public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null || list2==null) return null;
        //ListNode head = null;
        ListNode newNode = new ListNode();
        if(newNode == null){
            if(list1!=null){
                newNode.val = list1.val;
                newNode.next = null;
            }
        }
        return newNode;
    }
}


