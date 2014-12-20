import java.util.HashMap;


public class LLMain {

	/**
	 * @param args
	 */
	
	public ListStruct tempNode,tPrev=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    HashMap<Integer, Boolean> hasIt=new HashMap<Integer, Boolean>();	
		ListStruct head,stail,tail,cur = null,next,prev = null,mid1,mid2,mid3,mid4,node,node1,node2,node3,node4,node5,node6,node7,node8;
		//node=tempNode;
		LLMain llm=new LLMain();
	   
		node=llm.createNode(0);
//		
		head=node;
		tail=node;
		while(node.link!=null)
		{
//		
			node=node.link;
			
		}
		
		node.link=llm.createNode(17);
		node=node.link;
		node.link=llm.createNode(18);
		node=node.link;
		node.link=llm.createNode(19);
		node=node.link;
		node.link=llm.createNode(19);
		node=node.link;
		node.link=llm.createNode(20);
		node=node.link;
		node.link=llm.createNode(21);
		node=node.link;
		node.link=llm.createNode(22);
		node=node.link;
		node.link=llm.createNode(22);
		node=tail;
		stail=tail;
		//code for removing node
//		while(node.data!=19)
//		{
//			prev=node;
//			node=node.link;
//		}
////		
//		prev.link=node.link;

//		System.out.println("prev:"+prev.data+" node:"+node.data);
		System.out.println("Original List");
		while(head!=null)
		{
			System.out.print(head.data+"->");
			head=head.link;
			
		}
		while(node!=null)
		{
			stail=tail;
			prev=node;

			if(!hasIt.containsKey(node.data))
				hasIt.put(node.data, true);
			else
			{
				while(stail.data!=node.data)
				{
					prev=stail;
					stail=stail.link;
				}
				prev.link=stail.link;
			}
			node=node.link;
		}
		head=tail;
		System.out.println();
		System.out.println("truncated list");
		while(head!=null)
		{
			System.out.print(head.data+"->");
			head=head.link;
			
		}
		
		//code to delete middle list
		System.out.println("\nmiddle node deletion is:");
		head=tail;
		mid1=tail;
		mid2=tail;
		while(mid2.link!=null)
		{
			prev=mid1;
			mid1=mid1.link;
			mid2=mid2.link.link;
		}
		prev.link=mid1.link;
		while(head!=null)
		{
			System.out.print(head.data+"->");
			head=head.link;
			
		}
		//code to reverse list
		System.out.println("\nList reversal:");
		mid1=tail;
		mid2=llm.createNode(99);
		mid3=mid2;
		head=tail;
//		cur=head;
		prev=cur;
		mid1=head;
		mid2=head.link;
		mid3=mid2.link;
		mid1.link=null;
		mid2.link=mid1;
		prev=mid2;
		cur=mid3;
		
		while(cur!=null)
		{
			next=cur.link;
			cur.link=prev;
			prev=cur;
			cur=next;
			
		}
		
		mid3=prev;
		head=prev;
		while(mid3!=null)
		{
			System.out.print(mid3.data+"->");
			mid3=mid3.link;
			
		}
		
		llm.sortList(head);
	}
	
	public void sortList(ListStruct head)
	{
		int temp=0;
		ListStruct index1,index2,tlink,finalLink,ultimate;
		index1=head;index2=head.link;
		ultimate=index1;
		System.out.println();
		finalLink=index1;
		for(;index1!=null;index1=index1.link)
		{
			for(;index1!=null;index1=index1.link)
			{
				if(index1.data>index1.link.data)
				{
					tlink=index1;
					index1.link=index1.link.link;
                    index1.link.link=tlink;
					finalLink=index2;
//					index2=finalLink;
//					System.out.println("\nfnallink here:");
//					while(finalLink!=null)
//					{
//						System.out.print(finalLink.data+"->");
//						finalLink=finalLink.link;
//					}
					
					//System.out.print(finalLink.data+"-");
//					System.out.println("index1.data after:"+index1.data);
//					System.out.println("index2.data after:"+index2.data);
				}
			}
			//finalLink.link=ultimate;
		}
		
		System.out.println("\nSort sahi hai kya?:");
		while(ultimate!=null)
		{
			System.out.print(ultimate.data+"->");
			ultimate=ultimate.link;
		}
		
	}
	
	public ListStruct createNode(int data)
	{
		
		  ListStruct node;
		  ListStruct lst=new ListStruct();
		  lst.data=data;
		  lst.link=null;
		  node=lst;
		return node;
	}

}
