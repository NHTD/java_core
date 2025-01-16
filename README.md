**1. Abstract**
- Tính trừu tượng là quá trình ẩn đi các chi tiết được thực hiện trong phương thức và chỉ show cho người dùng các chức năng.
- Có 2 cách để đạt được tính trừu tượng trong java:
  1. Sử dụng abstract class.
  2. Sử dụng interface.
- 1 abstract class phải được khai báo với từ khóa abstract.
- Phương thức có thể có abstract hoặc non-abstract.
- Abstract cũng có thể có các phương thức static và constructor.
- Abstract cũng có thể có các phương thức final => lớp con không thể overide.
- Sử dụng extend để kế thừa lớp abstract.
- Abstract không hỗ trợ đa kế thừa.
  
**2. Interface**
  - Interface là cớ chế để đạt được abstract.
  - Interface sử dụng từ khóa implements để kế thừa.
  - Interface hỗ trợ đa kế thừa.
  - Các phương thức trong interface không có body.
  - 1 Interface có thể implements nhiều interface khác.
