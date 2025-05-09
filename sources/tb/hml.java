package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f20749a;

    static {
        t2o.a(993001675);
    }

    public hml(int i) {
        this.f20749a = i;
    }

    public static hml a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hml) ipChange.ipc$dispatch("ddd85d1f", new Object[]{new Integer(i)});
        }
        return new hml(i);
    }
}
