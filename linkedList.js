class Node{
    constructor(value){
        this.value = value
        this.next = null;
    }
}
class Linkedlist{
    constructor(){
        this.head = null
        this.size = 0;
    }

    isEmpty(){
        return this.size===0        
    }
    getSize(){
        return this.size
    }

    prepend(value){
        const node = new Node(value)
        if(this.isEmpty()){
            this.head = node
        } else{
            node.next = this.head
            this.head = node
        }
        this.size++
    }

    print(){
        if(this.isEmpty())
        {
            console.log("List is empty")
        }else{
            let current = this.head
            let printList = ''
            while(current!=null){
                printList += ' '+current.value
                current = current.next
            }
            return printList
        }
    }

    append(value){
        const node = new Node(value)
        if(this.isEmpty()){
            this.head = node
        } else{
            let previous = this.head
            while(previous.next != null){
                previous = previous.next
            }
            previous.next = node;
        }
        this.size++
    }

    addElement(value,index){
        if(index<0 || index > this.size){
            return
        }
        if(index===0){
            this.prepend(value) 
        } else{
            const node = new Node(value)
            let prev = this.head
            for(let i=0;i<index-1;i++){
                prev = prev.next
            }
            node.next = prev.next
            prev.next = node
        }
        this.size++
    }

    removeFrom(index){
        if(index<0||index>this.size){
            return null
        }
        let removedNode
        if(index===0){
            removedNode = this.head
            this.head = this.head.next
        } else {
            let prev = this.head
            for(let i=0;i<index-1;i++){
                prev = prev.next
            }
            removedNode = prev.next
            prev.next = removedNode.next
        }
        this.size--
        return removedNode.value
    }
    removeValue(value){
        if(this.isEmpty()){
            return null
        }
        if(value === this.head.value){
            this.head = this.head.next
            this.size--
            return value
        } else{
            let prev = this.head
            while(prev.next && prev.next.value !== value){
                prev = prev.next
            }
            if(prev.next){
                const removedNode = prev.next
                prev.next = removedNode.next
                this.size--
                return value
            }
            return null
        }
    }
}

let list = new Linkedlist()
console.log("isEmpty? "+list.isEmpty())
console.log("Size of the list: "+list.getSize())
list.prepend(49)
list.prepend(33)
list.prepend(99)
console.log("prepend '49','33','99' :"+list.print())
list.append(1000)
list.append(83)
console.log("append '1000','83' :"+list.print())
console.log("linked list: "+list.print())
list.addElement(100,4)
list.addElement(74,1)
console.log("Adding element 100 and 74 at index 4 and 1 -"+list.print())
console.log("size of the list "+list.getSize())
console.log("removed from index 2: "+list.removeFrom(2))
console.log("removed the value : "+list.removeValue(1000))
console.log("Size of the list "+list.getSize())
console.log("Linked List "+list.print())
