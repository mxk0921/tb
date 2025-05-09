package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n19 implements w24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final g1r f24439a;
    public final loq b;

    public n19(g1r g1rVar, loq loqVar) {
        this.f24439a = g1rVar;
        this.b = loqVar;
    }

    @Override // tb.w24
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8140e3", new Object[]{this, application});
        } else if (this.f24439a.a("useFastSp", this.b.a())) {
            o19.a(application, new HashMap());
        }
    }
}
