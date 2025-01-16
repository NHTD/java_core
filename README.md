**1. Collection**
- Collection trong java là một framework mà cung cấp 1 kiến trúc để lưu trữ và thao tác với một nhóm các đối tượng.
- Collection cung cấp nhiều interfaces như Set, List, Queue và các lớp như: Arraylist, LinkedList, PriorityQueue, HashSet, TreeSet, LinkedHashSet
1. List interface:
   
   - List trong java kế thừa từ Collection interface.
   - Duy trì thứ tự chèn.
   - Không đồng bộ.
   - Có thể chứa các phần tử trùng lặp.
   - Các lớp implement List interface bao gồm: ArrayList, LinkedList, Vector và Stack.
    - ArrayList: Sử dụng dynamic array để lưu trữ các phần tử, vì ArrayList không có fixed length nên có thể thêm bất cứ phần tử nào vào ArrayList. Trong các trường hợp như thêm hay xóa phần tử (nếu dịch các phần tử trong mảng) thì ArrayList chậm hơn LinkedList. Nhưng khi tìm kiếm thì ArrayList nhanh  hơn vì sử dụng index.
    - LinkedList: Sử dụng cấu trúc dữ liệu doubly linked list để lưu trữ các phần tử. Các thao tác như thêm vào đầu list, xóa ở đầu list, chèn vào vị trí bất kỳ trong list sẽ nhanh hơn ArrayList.
    - Stack: Sử dụng cấu trúc LIFO (Last In First Out), nơi mà có thể thêm vào hoặc đẩy phần tử ở đỉnh của stack.
      - Các phương thức phổ biến của stack bao gồm: push(), pop(), peek(), isEmpty().
3.  Set interface:
   - Set interface implement collection interface
   - Set không chứa phần tử trùng lặp.
   - Không đồng bộ.
   - Set trong interface bao gồm các lớp như: HashSet, LinkedHashSet và TreeSet.
     - HashSet: lưu trữ các phần tử trong hash table, không duy trì thứ tự sắp xếp, có thể chứa các phần tử null.
     - LinkedHashSet: có thể chứa các phần tử null, duy trì thứ tự sắp xếp
     - TreeSet: không cho phép chứa các phần tử null, sắp xếp các phần tử theo thứ tự tăng dần, sử dụng cấu trúc dữ liệu Tree.
3. Queue interface:
  - Queue sử dụng cơ chế FIFO(First-In-First-Out).
  - Queue đảm bảo rằng các phần tử được thêm vào đầu cũng sẽ bị gỡ khỏi danh sách đầu tiên.
  - Các phương thức phổ biến của Queue bao gồm: add(), offer(), poll(), peek().
  - PriorityQueue implement từ Queue:
    - PriorityQueue được xử lý theo mức độ ưu tiên. Mặc dù các phần tử của PriorityQueue không được sắp xếp nhưng các phần tử luôn được lấy ra theo thứ tự sắp xếp.
