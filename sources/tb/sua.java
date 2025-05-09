package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(856686604);
    }

    public static Map<String, String> a(z24 z24Var, hfh hfhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("461ade2f", new Object[]{z24Var, hfhVar});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = hfhVar.b;
        if (str != null) {
            linkedHashMap.put(uj4.appKeyName, str);
        }
        String str2 = hfhVar.c;
        if (str2 != null) {
            linkedHashMap.put(uj4.appIdName, str2);
        }
        String str3 = hfhVar.f20602a;
        if (str3 != null) {
            linkedHashMap.put(uj4.deviceIdName, str3);
        }
        String str4 = z24Var.b;
        if (str4 != null) {
            linkedHashMap.put(uj4.requestIdName, str4);
        }
        linkedHashMap.put(uj4.replyIdName, ten.a());
        linkedHashMap.put(uj4.sessionIdName, ten.a());
        linkedHashMap.put(uj4.opCodeName, hfhVar.d);
        String str5 = hfhVar.e;
        if (str5 != null) {
            linkedHashMap.put(uj4.replyCode, str5);
        }
        String str6 = hfhVar.f;
        if (str6 != null) {
            linkedHashMap.put(uj4.replyMsg, str6);
        }
        return linkedHashMap;
    }
}
