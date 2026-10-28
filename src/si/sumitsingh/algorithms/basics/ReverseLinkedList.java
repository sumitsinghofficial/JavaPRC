package si.sumitsingh.algorithms.basics;

public class ReverseLinkedList {
	public static void main(String[] args) {
		
	}
	
	public ListNode reverseBetween(ListNode head, int left, int right) {
		
		// Edge case: no reversal needed if range contains a single node or less
        if (head == null || left == right) {
            return head;
        }

        // Dummy node handles cases where the reversal starts at the very first node (left = 1)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Step 1: Reach the node right before the 'left' position
        ListNode prev = dummy;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // Step 2: Initialize 'curr' as the first node of the sub-list to be reversed
        ListNode curr = prev.next;

        // Step 3: Rearrange connections within the range
        for (int i = 0; i < right - left; i++) {
            ListNode nextNode = curr.next;
            
            // Cut out nextNode and re-link curr to the node after nextNode
            curr.next = nextNode.next;
            
            // Splice nextNode into the front of the reversed section
            nextNode.next = prev.next;
            
            // Connect the boundary node to the newly moved node
            prev.next = nextNode;
        }

        return dummy.next;
		
		
	}

}
