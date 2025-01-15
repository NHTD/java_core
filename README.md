**1. Tìm hiểu các khái niệm cơ bản về: Object, Class, Methods, Variables. Syntax của các đối tượng trên.**
- Object là một thực thế trong thế giới thực bao gồm các trạng thái và hành vi của đối tượng
**- Các đặc tính của object bao gồm:**
  State: mô tả giá trị của object
  Behavior: Mô tả hành vi của một đối tượng
  Identity: Một đối tượng thường được thể hiện thông qua một unique id

- Class: một đối tượng là một instance của một class. Một lớp là một mẫu hoặc bản thiết kế mà từ đó các đối tượng được tạo ra.

- Variables: là một vùng nhớ để lưu trữ dữ liệu. Biến có thể được lưu trữ trong object class.
  Các loại biến:
  - static variable: biến chỉ được lấy ra khỏi bộ nhớ một lần duy nhất tại thời điểm class loading
  - final variable: không thể thay đổi giá trị của biến final, biến final sẽ là một constant
  - local variable: được khai báo trong một hàm
  - instance variable: biến được định nghĩa trong một lớp
  
**2. Tìm hiểu về các Access Modifier của java, phạm vi.** 
- Các access modifier bao gồm:
  - public: có thể truy cập ở bất kỳ đâu.
  - protected: chỉ được truy cập ở phạm vi lớp cha và lớp con.
  - default: phạm vi truy cập nằm trong 1 package.
  - private: phạm vi truy cập nằm trong 1 class, không thể được truy cập từ bên ngoài class.

**3. Comments trong java**
- Comments là các dòng chú thích trong mã nguồn, không được biên dịch bởi trình biên dịch.
  syntax:
  - comment trong 1 dòng: // 123
  - comment trong nhiều dòng:
    /*
    123
    456
    789
    */
