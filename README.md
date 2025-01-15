**1. Constructors, Variables**
- Constructors: constructor trong java là một khối code giống với method. Nó được gọi khi instance của một class được gọi. Tại thời điểm gọi constructor, nó sẽ được gọi trong bộ nhớ. Mỗi lần constructor được tạo sẽ sử dụng một từ khóa new

**2. Primitive Data Types**
- là các kiểu dữ liệu cơ bản trong Java, không phải đối tượng và có kích thước cố định.
- Java hỗ trợ 8 loại primitive data types:
  - boolean: 0 byte
  - byte: 1 byte
  - int: 4 bytes
  - long: 8 bytes
  - float: 4 bytes
  - double: 8 bytes
  - char: 2 bytes
  - short: 2 bytes

**3. Reference/Object Data Types**
- Tham chiếu đến đối tượng, nó lưu trữ 8 bytes và tham chiếu đến 1 đối tượng được lưu trữ trong heap và bộ nhớ này được quản lý bởi JVM và được thu dọn qua garbage collection (GC) khi không còn tham chiếu đến đối tượng.
- Ví dụ: A a = new A(), a ở đây sẽ được lưu vào vùng nhớ stack và biến a trong vùng nhớ stack sẽ tham chiếu đến A() được lưu trong heap.

**4. Special escape sequences**
- Các tổ hợp ký tự bao gồm dấu gạch chéo ngược (\) theo sau là một chữ cái hoặc tổ hợp các chữ số được gọi là "escape sequences".
  
  ![image](https://github.com/user-attachments/assets/3c7a2fc6-7c9c-4cbe-add3-01515ed2c162)
