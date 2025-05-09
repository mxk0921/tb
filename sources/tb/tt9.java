package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tt9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_MESSAGE_KEY = "errorMessage";

    static {
        t2o.a(759169029);
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e313bcb1", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            jSONObject2.put(WVResultWrapper.EXCEPTION, (Object) jSONObject);
        } else {
            jSONObject2.put(WVResultWrapper.EXCEPTION, (Object) new JSONObject());
        }
        return jSONObject2;
    }

    public static JSONObject b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c44e3cf9", new Object[]{objArr});
        }
        if (objArr == null) {
            return a(new JSONObject());
        }
        if (objArr.length % 2 == 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < objArr.length; i += 2) {
                jSONObject.put((String) objArr[i], objArr[i + 1]);
            }
            return a(jSONObject);
        }
        throw new IllegalArgumentException(" key and value are not match");
    }

    public static JSONObject c(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb8b4f6d", new Object[]{objArr});
        }
        if (objArr == null) {
            return d(new JSONObject());
        }
        if (objArr.length % 2 == 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < objArr.length; i += 2) {
                jSONObject.put((String) objArr[i], objArr[i + 1]);
            }
            return d(jSONObject);
        }
        throw new IllegalArgumentException(" key and value are not match");
    }

    public static JSONObject d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e039e65", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            jSONObject2.put("HY_SUCCESS", (Object) jSONObject);
        } else {
            jSONObject2.put("HY_SUCCESS", (Object) new JSONObject());
        }
        return jSONObject2;
    }
}
