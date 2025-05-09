package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f30520a;
    public static final Method b;

    public static void a(String str, int i, int i2, Map<String, String> map) {
        Method method;
        String str2;
        try {
            Object obj = f30520a;
            if (obj != null && (method = b) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) str);
                jSONObject.put("imageWidth", (Object) Integer.valueOf(i));
                jSONObject.put("imageHeight", (Object) Integer.valueOf(i2));
                if (map == null) {
                    str2 = Boolean.FALSE;
                } else {
                    str2 = map.get("local_file");
                }
                jSONObject.put(ImageStatistics.KEY_READ_LOCAL_FILE, str2);
                method.invoke(obj, "fcanvas_resources", jSONObject.toJSONString());
            }
        } catch (Throwable unused) {
            TMSLogger.b("AtsPerformanceUtils", "send fcanvas resources error!");
        }
    }

    static {
        t2o.a(834666508);
        try {
            Constructor<?> declaredConstructor = Class.forName("com.taobao.aboat.ReceivePerformance").getDeclaredConstructor(Context.class);
            IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
            if (iEnvironmentService != null) {
                f30520a = declaredConstructor.newInstance(iEnvironmentService.getApplicationContext());
            }
            b = f30520a.getClass().getDeclaredMethod("onReceiveWindmillPerformanceLog", String.class, String.class);
        } catch (Throwable unused) {
        }
    }
}
