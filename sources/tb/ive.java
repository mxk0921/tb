package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ive {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539745);
    }

    public static void a(zue zueVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a52b4de", new Object[]{zueVar});
            return;
        }
        String b = zueVar.b();
        String e = zueVar.e();
        Map<String, String> b2 = b(zueVar);
        tve.b(b, e, "2.0", "InfoFlow", "InfoFlow", b2, zueVar.c() + "", zueVar.d());
        StringBuilder sb = new StringBuilder("commitError : ");
        sb.append(zueVar.toString());
        fve.e("InfoFlowMonitorUtils", sb.toString());
    }

    public static Map<String, String> b(zue zueVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4f93bbbc", new Object[]{zueVar});
        }
        String a2 = zueVar.a();
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("reason", a2);
        return hashMap;
    }
}
