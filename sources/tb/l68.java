package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l68 implements ze4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<m68<?>> f23131a;

    static {
        t2o.a(615514205);
        t2o.a(615514190);
    }

    public l68(String str) {
        this.f23131a = k68.a(str);
    }

    @Override // tb.ze4
    public boolean a(tx8 tx8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db23870d", new Object[]{this, tx8Var})).booleanValue();
        }
        return k68.b(tx8Var, this.f23131a);
    }
}
