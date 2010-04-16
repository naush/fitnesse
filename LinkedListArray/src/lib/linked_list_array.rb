require 'linked_list_node'

class LinkedListArray

  def initialize(size)
    @header = LinkedListNode.new(0)
    temp = LinkedListNode.new(0)
    @header.next(temp)
    while size
      next_node = LinkedListNode.new(0)
      temp.next(next_node)
      temp = next_node
      size -= 1
    end
  end

  def get(index)
    return nil if index = 0
    while index
      node = @header.next
      
      index -= 1
    end
  end

end
