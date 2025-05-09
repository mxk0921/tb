package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n9g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static zic f24587a;

    static {
        t2o.a(511705535);
    }

    public static void a(String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d46405", new Object[]{str, str2, str3, hashMap});
            return;
        }
        zic zicVar = f24587a;
        if (zicVar != null) {
            zicVar.b(str, str2, str3, hashMap);
        }
    }

    public static void b(String str, String str2, long j, boolean z, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ee7f6b5", new Object[]{str, str2, new Long(j), new Boolean(z), hashMap});
            return;
        }
        zic zicVar = f24587a;
        if (zicVar != null) {
            zicVar.a(str, str2, j, z, hashMap);
        }
    }

    public static void c(zic zicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a77190c", new Object[]{zicVar});
        } else {
            f24587a = zicVar;
        }
    }
}
