package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class iml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21429a;
    public final boolean b;

    static {
        t2o.a(993001676);
    }

    public iml(String str, boolean z) {
        this.f21429a = str;
        this.b = z;
    }

    public static iml a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iml) ipChange.ipc$dispatch("b2e7b850", new Object[]{str});
        }
        return new iml(str, false);
    }

    public static iml b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iml) ipChange.ipc$dispatch("5a30a02a", new Object[]{str, new Boolean(z)});
        }
        return new iml(str, z);
    }
}
