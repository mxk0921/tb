package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f23030a;
    public static Method b;

    public static void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        Class<?> cls;
        try {
            if (c() != null && (cls = f23030a) != null) {
                b.invoke(cls, str, Integer.valueOf(i), obj, obj2, obj3, strArr);
            }
        } catch (Exception e) {
            TBSdkLog.e("MtopWVPlugin.UTAdapter", "UTAdapter commit(String pageName,int eventId, Object arg1,Object arg2,Object arg3,String ... kvs) failed ---" + e.toString());
        }
    }

    public static void b(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e202bb4c", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            a(str, i, str2, str3, str4, d(map));
        } catch (Throwable unused) {
        }
    }

    public static Method c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("6e8cf0ca", new Object[0]);
        }
        Method method = b;
        if (method != null) {
            return method;
        }
        try {
            Class<?> loadClass = kzu.class.getClassLoader().loadClass("com.taobao.statistic.TBS$Ext");
            f23030a = loadClass;
            if (loadClass != null) {
                b = loadClass.getDeclaredMethod("commitEvent", String.class, Integer.TYPE, Object.class, Object.class, Object.class, String[].class);
            }
        } catch (Exception e) {
            TBSdkLog.e("MtopWVPlugin.UTAdapter", "Connot Found \"TBS.Ext.commitEvent(String, int, Object, Object, Object, String...)\" Method ---" + e.toString());
        }
        return b;
    }

    public static String[] d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8e8b620b", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return new String[0];
        }
        String[] strArr = new String[map.size()];
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                strArr[0] = "";
            } else {
                strArr[0] = key + "=" + value;
            }
        }
        return strArr;
    }
}
