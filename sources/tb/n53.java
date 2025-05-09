package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class n53 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile Map<String, String> f24517a;
    public final Map<String, String> b;
    public String c;

    static {
        t2o.a(481296746);
    }

    public n53(Map<String, String> map, String str) {
        ckf.g(map, "_params");
        this.f24517a = map;
        Map<String, String> map2 = this.f24517a;
        String str2 = map2.get("pssource");
        String str3 = "";
        e(str2 == null ? str3 : str2);
        int e = qrl.e(map2.get("toindex"), -1);
        int i = 1;
        if (e >= 0 ? e == 1 : qrl.a(map2.get("fromScan"), false)) {
            i = 0;
        }
        c(i);
        String str4 = map2.get("pageSpm");
        d(str4 != null ? str4 : str3);
        this.b = map2;
    }

    public final Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b02a625", new Object[]{this});
        }
        return this.c;
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320107cd", new Object[]{this, new Integer(i)});
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38992730", new Object[]{this, str});
        } else {
            ckf.g(str, "<set-?>");
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02f78f1", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.c = str;
    }
}
