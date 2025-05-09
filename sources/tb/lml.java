package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23422a;
    public final Map<String, String> b;
    public final Map<String, String> c;

    static {
        t2o.a(993001679);
    }

    public lml(String str, boolean z, Map<String, String> map, Map<String, String> map2) {
        this.f23422a = str;
        this.b = map;
        this.c = map2;
    }

    public static lml a(String str, boolean z, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lml) ipChange.ipc$dispatch("43473c52", new Object[]{str, new Boolean(z), map, map2});
        }
        return new lml(str, z, map, map2);
    }
}
