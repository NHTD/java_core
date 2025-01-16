**1. Exception**
- Exception trong java là các sự kiện xảy ra trong quá trình thực thi code, khi bị exception thì chương trình sẽ dừng lại ngay lập tức, không thực thi những đoạn code phía sau.
- Khi bị exception thì java sẽ quăng ra thông tin exception và các loại exception, các exception đều kế thừa từ lớp Exception.
- Một số loại exception bao gồm:
  - NullpointerException: xảy ra khi cố gắng truy cập vào đối tượng có giá trị là null.
  - ArithmeticException: xảy ra khi có một số lỗi về phép toán, ví dụ như phép chia cho 0.
  - ArrayIndexOutOfBoundException: xảy ra khi cố gắng truy cập vào 1 index không tồn tại trong mảng.
- Có 2 loại exception trong java là checked và unchecked.
  - Checked Exception: kế thừa lớp Throwable, yêu cầu người code phải tự xử lý và được kiểm tra ở compile-time
  - Unchecked Exception: kế thừa RuntimeException, trình biên dịch tự xử lý và xảy ra ở runtime
- Exception với try-catch:
  1. try:
     - try là chứa một tập hợp các câu lệnh trong đó có thể xảy ra ngoại lệ; khối này được dùng để bao quanh mã có thể gây ra ngoại lệ.
     - Luôn có 1 khối catch ở phía sau
  2. catch:
     - Khối catch bắt và xử lý các ngoại lệ của khối try bằng cách khai báo loại ngoại lệ trong tham số.
     - Khối catch bao gồm mã và được thực thi nếu xảy ra ngoại lệ bên trong khối try.
  3. Sử dụng throw và throws để ném ngoại lệ:
     - throw: là lớp con của Throwable, chỉ ném 1 ngoại lệ 1 lần duy nhất, sử dụng từ khóa new để tạo đối tượng.
     - throws: được sử dụng để ném 1 ngoại lệ ở method, có thể ném nhiều ngoại lệ cùng lúc.
