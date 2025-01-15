**1. Arithmetic Operators**
- Arithmetic Operators trong Java được sử dụng để thực hiện các phép toán cơ bản như cộng, trừ, nhân, chia, và lấy phần dư.
- Các loại arithmetic operators trong java bao gồm:
  1. Addition Operator (+)
  2. Subtraction Operator (-)
  3. Multiplication Operator (*)
  4. Division Operator (/)
  5. Modulus Operator(%)
  6. Increment Operator (++)
  7. Decrement Operator (--)

**2. Relational Operators**
  - Relational Operators java là một tập hợp các toán tử nhị phân được sử dụng để kiểm tra mối quan hệ giữa hai toán hạng, bao gồm đẳng thức, lớn hơn, nhỏ hơn, v.v.
  - Các loại toán tử quan hệ trong java bao gồm:
    1. Toán từ "==": toán tử này được sử dụng để kiểm tra xem hai toán hạng đã cho có bằng nhau hay không. Toán tử trả về true nếu toán hạng ở vế trái bằng vế phải, nếu không thì trả về false.
    2. Toán tử "!=": toán tử này được sử dụng để kiểm tra xem hai toán hạng đã cho có khác nhau hay không. Nó hoạt động ngược lại với toán tử bằng. nó trả về true nếu toán hạng ở bên trái không bằng bên phải, nếu không thì trả về false.
    3. Toán tử ">": được sử dụng để kiểm tra xem toán hạng thứ nhất có lớn hơn toán hạng thứ hai hay không. Kết quả trả về true khi toán hạng ở bên trái lớn hơn bên phải.
    4. Toán tử: "<": được sử dụng để kiểm tra xem toán hạng thứ nhất có nhỏ hơn toán hạng thứ hai hay không. Kết quả trả về true khi toán hạng ở bên trái nhỏ hơn bên phải. nó hoạt động ngược lại với toán tử lớn hơn.
    5. Toán tử: ">=": được sử dụng để kiểm tra xem toán hạng đầu tiên có lớn hơn hoặc bằng toán hạng thứ hai hay không. Kết quả trả về true khi toán hạng ở vế trái lớn hơn hoặc bằng vế phải.
    6. Toán tử: "<=": được sử dụng để kiểm tra xem toán hạng đầu tiên có nhỏ hơn hoặc bằng toán hạng thứ hai hay không. Kết quả trả về true khi toán hạng ở vế trái nhỏ hơn hoặc bằng vế phải.

**3. Other Operators**
  1. Logical Operators:
     - AND (&&): toán tử && trả về true nếu cả hai toán hạng đều đúng, nếu không nó trả về false.
     - OR (||): toán tử || trả về true nếu ít nhất một trong các toán hạng là đúng, nếu không thì trả về false.
     - NOT (!): toán tử ! được sử dụng để đảo ngược giá trị của biểu thức boolean. Nếu biểu thức true thì toán tử not trả về false và nếu biểu thức false thì toán tử not trả về true.
       
  2. Bitwise Operators:
     - Bitwise OR (|): toán tử này là toán tử nhị phân, ký hiệu là "|". Nó trả về từng bit hoặc các giá trị đầu vào, tức là nếu một trong hai bit là 1 thì nó trả về 1, nếu không thì nó hiển thị 0.
     - Bitwise AND (&): toán tử này là toán tử nhị phân, ký hiệu là "&". Nó trả về từng bit và các giá trị đầu vào, tức là nếu cả hai bit là 1 thì nó cho 1, nếu không thì nó hiển thị 0.
     - Bitwise XOR (^): Toán tử này là toán tử nhị phân, được ký hiệu là "^". Nó trả về từng bit xor của các giá trị đầu vào, tức là nếu các bit tương ứng khác nhau, nó sẽ trả về 1, nếu không thì nó hiển thị 0.
     - Bitwise Complement (~): Toán tử này là toán tử một ngôi, được ký hiệu là "~". Nó trả về biểu diễn phần bù một của giá trị đầu vào, tức là với tất cả các bit được đảo ngược, có nghĩa là nó tạo ra mọi số 0 thành 1 và mọi số 1 thành 0.
       
  3. Shift Operators:
     - Signed Right shift operator (>>): dịch các bit của giá trị sang phải một số vị trí nhất định.
     - Unsigned Right shift operator (>>>): dịch các bit của giá trị sang phải một số vị trí nhất định.
     - Left shift operator(<<): dịch các bit sang phải, không chú ý đến dấu của số (mảng bit trái sẽ được điền bằng 0).
       
  4. Assignment operators:
     - Các loại phép gán trong operators bao gồm:
      1. +=: thêm 1 giá trị vào biến và gán vào kết quả.<br>
         Ví dụ: a += 3; => a = a + 3;
      2. -=: trừ 1 giá trị của biến và gán vào kết quả.<br>
         Ví dụ: a -= 2; => a = a - 2;
      3. /=: chia một giá trị của biến và gán vào kết quả.<br>
         Ví dụ: a/=2; => a = a / 2;
      4. *=: nhân một giá trị của biến và gán vào kết quả.<br>
         Ví dụ: a*=3; => a = a * 3;
      5. %=: tính số dư của phép chia và gán vào kết quả.<br>
         Ví dụ: a%=3; => a = a % 3;
      6. =: được dùng để gán giá trị ở bên phải cho biến ở bên trái.
         
  5. Ternary Operator:
     - Ternary Operator có thể sử dụng thay cho điều kiện if-else hoặc thậm chí chuyển đổi điều kiện bằng cách sử dụng toán tử bậc ba lồng nhau.
