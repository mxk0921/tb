package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f33079a;

    static {
        t2o.a(993001813);
    }

    public zxo(int i) {
        this.f33079a = i;
    }

    public static zxo a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxo) ipChange.ipc$dispatch("3b1f7c2a", new Object[]{new Integer(i)});
        }
        return new zxo(i);
    }
}
