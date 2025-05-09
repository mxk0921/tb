package tb;

import android.app.Application;
import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q3q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499277);
    }

    public static JSONObject a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5819a445", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("countryCode", (Object) xcu.b(context));
        jSONObject.put("lbsInfo", (Object) xcu.c(context));
        jSONObject.put(upx.APDIDTOKEN, (Object) xcu.a(context));
        jSONObject.put("websiteLanguage", (Object) xcu.g(context));
        jSONObject.put("user_token", (Object) xcu.d(context));
        jSONObject.put("bc_fl_src", (Object) xcu.f());
        jSONObject.put("user_token_type", (Object) "tbsid");
        return jSONObject;
    }

    public static Application b() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Throwable unused) {
            return null;
        }
    }
}
