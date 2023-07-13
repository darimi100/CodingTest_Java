import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        User[] u = new User[n];
        
        // 배열 값 입력
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            
            u[i] = new User(age, name); 
        }
        
        // 정렬
        Arrays.sort(u, new Comparator<User>() {
            public int compare(User u1, User u2) {
                return u1.age - u2.age;
           }
        });
        
        // 출력
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            // 객체 배열의 객체를 출력하면 해당 인덱스의 객체의 toString()이 출력
            sb.append(u[i]);
        }
        
        System.out.println(sb);
    }
    
}

class User {
    int age;
    String name;
    
    public User (int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    // toString() 메소드로 객체 출력 시 사용자의 임의로 출력하고자 하는 문자열을 지정할 수 있음
    public String toString() {
        return age + " " + name + "\n";
    }
}