package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final yxo f32409a = new yxo();

    static {
        t2o.a(993001812);
    }

    public static yxo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yxo) ipChange.ipc$dispatch("2efda6dd", new Object[0]);
        }
        return f32409a;
    }
}
