package sungmincompany.dragtrip2;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yunseongmin on 2017. 8. 8..
 */

public class LoginRequest extends StringRequest {
    final static private String URL = "http://ymss98.cafe24.com/UserLogin.php";
    private Map<String, String> parameters;

    public LoginRequest(String userID, String userPassword, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);

    }



    @Override
    public Map<String, String> getParams(){
        return parameters;
    }

}
