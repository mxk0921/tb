package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30305a;
    public final String b;
    public final Map<String, String> c;
    public final String d;

    static {
        t2o.a(815793287);
    }

    public vwq(String str, String str2, String str3, Map<String, String> map) {
        this.f30305a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
    }

    public static vwq a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vwq) ipChange.ipc$dispatch("a137a0c0", new Object[]{str, str2, str3, map});
        }
        return new vwq(str, str2, str3, map);
    }
}
