package tb;

import android.os.Process;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Method f27267a;
    public static boolean b;

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d81e1a25", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            int c = c(Process.myPid());
            jSONObject.put("currendMemory", (Object) Integer.valueOf(c));
            if (c < 2600000) {
                jSONObject.put("evaluatedStatus", (Object) "good");
            } else if (c >= 2600000) {
                jSONObject.put("evaluatedStatus", (Object) "normal");
            } else if (c >= 3000000) {
                jSONObject.put("evaluatedStatus", (Object) "dangerous");
            } else if (c >= 3200000) {
                jSONObject.put("evaluatedStatus", (Object) "fatal");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static final int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85259d5f", new Object[]{new Integer(i)})).intValue();
        }
        long[] jArr = {-1};
        d("/proc/" + i + "/status", new String[]{"VmSize:"}, jArr);
        return (int) jArr[0];
    }

    public static void d(String str, String[] strArr, long[] jArr) {
        a();
        Method method = f27267a;
        if (method != null) {
            try {
                method.invoke(null, str, strArr, jArr);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6083d81", new Object[0]);
        } else if (!b) {
            try {
                Method declaredMethod = Process.class.getDeclaredMethod("readProcLines", String.class, String[].class, long[].class);
                f27267a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
    }
}
