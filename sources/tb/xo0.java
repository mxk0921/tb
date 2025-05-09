package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xo0 implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wo0 f31491a;

    static {
        t2o.a(613416962);
        t2o.a(613416995);
    }

    public xo0(wo0 wo0Var) {
        this.f31491a = wo0Var;
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        Objects.toString(map);
        this.f31491a.onConfigUpdate(str, map);
    }
}
