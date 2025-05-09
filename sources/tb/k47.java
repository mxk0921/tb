package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class k47 implements b4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331643);
        t2o.a(676331644);
    }

    @Override // tb.b4d
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2a58283", new Object[]{this, str});
        }
        return hbi.b(new File(str));
    }

    @Override // tb.b4d
    public boolean b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c81d05d3", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        if (str == null || str2 == null || str3 == null || str4 == null) {
            return false;
        }
        if (a(str).equals(str4)) {
            return true;
        }
        wli wliVar = new wli();
        wliVar.d = new File(str3);
        wliVar.f = str4;
        wliVar.e = a(str);
        ((urd) d62.a(urd.class, new Object[0])).a(new File(str), new File(str2), wliVar);
        return wliVar.f30765a;
    }
}
