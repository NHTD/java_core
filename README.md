**1. Character**
- Một đối tượng có kiểu Character chứa một trường duy nhất có kiểu là char. Lớp ký tự cung cấp một số phương thức lớp (tức là static) hữu ích để thao tác các ký tự. Bạn có thể tạo một đối tượng ký tự bằng constructor.
- Character là immutable vì vậy, ta không thể thay đổi giá trị của nó.
- Character cung cấp một số phương thức để dễ dàng thao tác bao gồm:
  - boolean isLetter(char ch);
  - boolean isDigit(char ch);
  - boolean isWhitespace(char ch);
  - boolean isUpperCase(char ch);
  - boolean isLowerCase(char ch);
  - ...

**2. String**
- String trong java bao gồm:
  1. Immutable
     - String literal
     - String object
  2. Mutable
     - StringBuilder
     - StringBuffer
- Đối với String literal và object:
  - String là chuỗi, tập các ký tự
  - Các cách khai báo:<br>
    String literal: String s1 = "Hello";<br>
    String object: String s2 = new String("Hello");<br>
- String literal và object:
  1. Giống nhau:
     - Cả 2 đều là tham chiếu.
     - Thuộc kiểu dữ liệu đối tượng là String.
  2. Khác nhau:
     - new String("Hello");
       - Luốn tạo mới một tham chiếu, địa chỉ.
       - Không quan tâm tới việc giá trị đã tồn tại hay chưa.
       - Lưu giá trị trong heap.
     - s = "Hello";
       - Tăng khả năng tái sử dụng các instance từ vùng nhớ String constant pool.
       - Tiết kiệm bộ nhớ hơn.
      
- String constant pool:
  - String pool được lưu trữ trong heap memory.
  - String pool giúp tiết kiệm rất nhiều không gian cho Java Runtime mặc dù mất nhiều thời gian hơn để tạo String.
  - Khi sử dụng dấu ngoặc kép – chuỗi ký tự để tạo một String, trước tiên nó sẽ tìm String có cùng giá trị trong nhóm String, nếu tìm thấy nó chỉ trả về tham chiếu, nếu không nó sẽ tạo một String mới trong pool rồi trả về tham chiếu.
  - Khi sử dụng toán tử new – đối tượng string, chúng ta buộc lớp String tạo một đối tượng String mới trong không gian heap. Chúng ta có thể sử dụng phương thức intern() để đưa nó vào pool hoặc tham chiếu đến các đối tượng String khác từ nhóm string có cùng giá trị.

- String Mutable:
  - Immutable String: không thể thay thế giá trị của string gốc trong heap.
  - Mutable String: có thể thay đổi giá trị string gốc trong heap.
 
- So sánh StringBuilder và StringBuffer:
  - StringBuilder: single-thread, không đồng bộ, không an toàn. Vì là single-thread nên tốc độ xử lý nhanh hơn StringBuffer
  - StringBuffer: multi-thread, đông bộ, tránh được xung đột giữa các thread, nhanh hơn String

**3. Arrays**
- Mảng là một cấu trúc dữ liệu, lưu trữ 1 tập các phần tử với độ dài cố định
- Mỗi phần tử trong array được truy xuất thông qua index
- Các cách khai báo array
  - data_type arr[]
  - data_type[] arr
  - dataType[] arrayRefVar = new dataType[arraySize];
  - dataType[] arrayRefVar = {value0, value1, ..., valuek};
- Lợi ích của việc sử dụng array:
  - Cho phép quản lý nhiều phần tử có cùng kiểu dữ liệu tại một thời điểm.
  - Lưu trữ các phần tử liên tiếp nhau trong ô nhớ
  - Mảng là kiểu dữ liệu đối tượng.
  - Bộ nhớ heap được cấp phép cho mảng chỉ khi mảng thực sự được sử dụng. Do đó, bộ nhớ không bị tiêu tốn ngay khi khai báo mảng.
- Thao tác với biến:
  - Phần tử đầu luôn có chỉ số là 0.
  - Phần tử cuối luôn có chỉ số là lengthOfArray-1.
  - Truy cập ngoài phạm vi xuất hiện 1 exception: IndexOutOfBoundException.
- Khai báo mảng 1 chiều:
  - int[] array = {1,2,3,4,5};
- Khai báo mảng 2 chiều:
  - int[][] array = new int[2][3];
