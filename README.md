**1. Loop:**
   - Vòng lặp (loop) được sử dụng để thực hiện một đoạn mã nhiều lần.
   - Loop trong java bao gồm:
     1. for: vòng lặp java for được sử dụng để lặp lại một phần của chương trình nhiều lần. nếu số lần lặp là cố định.
     2. while: vòng lặp java while được sử dụng để lặp đi lặp lại một phần của chương trình cho đến khi điều kiện boolean được chỉ định là đúng. ngay khi điều kiện boolean trở thành sai, vòng lặp sẽ tự động dừng.
     3. do while: vòng lặp do-while java được sử dụng để lặp đi lặp lại một phần của chương trình cho đến khi điều kiện được chỉ định là đúng. nếu số lần lặp không cố định và bạn phải thực hiện vòng lặp ít nhất một lần thì nên sử dụng vòng lặp do-while.
     4. for-each: Dùng để duyệt qua các phần tử của mảng hoặc Collection.
        
**2. Các Class kiểu số tương ứng các kiểu dữ liệu nguyên thủy: Integer, Double...**
-  Các Class kiểu số tương ứng các kiểu dữ liệu nguyên thủy được gọi là Wrapper Class, có thể chứa null, nó bao gồm:
  - Integer
  - Character
  - Byte
  - Short
  - Long
  - Float
  - Double
  - Boolean
- Wrapper classes sẽ được lưu trên heap thay vì stack như primitive data types
- Wrapper classes chứa chứa giá trị null trong khi primitive data types thì không
- Truy cập tới Wrapper classes chậm hơn do phải tham chiếu tới heap, còn primitive data types thì sẽ truy cập trưc tiếp vào stack nên nhanh hơn.
