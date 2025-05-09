package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r1d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, h1d> f27045a = new HashMap();
    public static final Map<String, l2d> b = new HashMap();

    static {
        t2o.a(737149014);
    }

    public static /* synthetic */ void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca32a86", new Object[]{strArr});
        } else {
            c(strArr);
        }
    }

    public static /* synthetic */ void b(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e7c7da5", new Object[]{strArr});
        } else {
            d(strArr);
        }
    }

    public static void c(String[] strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd71861", new Object[]{strArr});
            return;
        }
        if (!(strArr.length == 0 || (str = strArr[0]) == null)) {
            HashMap hashMap = (HashMap) f27045a;
            if (hashMap.containsKey(str)) {
                String str2 = strArr[0];
                s1d.a(str2, (h1d) hashMap.get(str2));
                String str3 = strArr[0];
                String c = n1d.c((h1d) hashMap.get(str3));
                TLog.loge(yr2.MODULE, "IOSetupMonitor", "[" + str3 + "] " + c);
                for (int i = 1; i < strArr.length; i++) {
                    String str4 = strArr[i];
                    if (str4 != null) {
                        HashMap hashMap2 = (HashMap) f27045a;
                        if (hashMap2.containsKey(str4)) {
                            h1d h1dVar = (h1d) hashMap2.get(strArr[i]);
                            h1d h1dVar2 = (h1d) hashMap2.get(strArr[i - 1]);
                            s1d.c(strArr[i], h1dVar, h1dVar2);
                            String str5 = strArr[i];
                            String e = n1d.e(h1dVar, h1dVar2);
                            TLog.loge(yr2.MODULE, "IOSetupMonitor", "[" + str5 + "] " + e);
                        }
                    }
                    String str6 = strArr[i];
                    TLog.loge(yr2.MODULE, "IOSetupMonitor", "commitSetupIoInfo: scene tags commit witch exception, with scene tag " + str6 + " ,exit!");
                    return;
                }
                return;
            }
        }
        String str7 = strArr[0];
        TLog.loge(yr2.MODULE, "IOSetupMonitor", "commitSetupIoInfo: the first scene tags must not be empty, with tag " + str7 + ", commit exit!");
    }

    public static void d(String[] strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec008ac", new Object[]{strArr});
            return;
        }
        if (!(strArr.length == 0 || (str = strArr[0]) == null)) {
            HashMap hashMap = (HashMap) b;
            if (hashMap.containsKey(str)) {
                String str2 = strArr[0];
                s1d.b(str2, (l2d) hashMap.get(str2));
                String str3 = strArr[0];
                String d = n1d.d((l2d) hashMap.get(str3));
                TLog.loge(yr2.MODULE, "IOSetupMonitor", "[" + str3 + "] " + d);
                for (int i = 1; i < strArr.length; i++) {
                    String str4 = strArr[i];
                    if (str4 != null) {
                        HashMap hashMap2 = (HashMap) b;
                        if (hashMap2.containsKey(str4)) {
                            l2d l2dVar = (l2d) hashMap2.get(strArr[i]);
                            l2d l2dVar2 = (l2d) hashMap2.get(strArr[i - 1]);
                            s1d.d(strArr[i], l2dVar, l2dVar2);
                            String str5 = strArr[i];
                            String f = n1d.f(l2dVar, l2dVar2);
                            TLog.loge(yr2.MODULE, "IOSetupMonitor", "[" + str5 + "] " + f);
                        }
                    }
                    String str6 = strArr[i];
                    TLog.loge(yr2.MODULE, "IOSetupMonitor", "commitSetupIoWaitInfo: scene tags commit witch exception, with scene tag " + str6 + " ,exit!");
                    return;
                }
                return;
            }
        }
        String str7 = strArr[0];
        TLog.loge(yr2.MODULE, "IOSetupMonitor", "commitSetupIoWaitInfo: the first scene tags must not be empty, with tag " + str7 + ", commit exit!");
    }
}
