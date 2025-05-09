package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.f64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l8j implements f64.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pvh f23174a;

    static {
        t2o.a(993002146);
        t2o.a(993001803);
    }

    public l8j(pvh pvhVar) {
        this.f23174a = pvhVar;
    }

    public static f64.a a(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f64.a) ipChange.ipc$dispatch("13df8fe2", new Object[]{pvhVar});
        }
        if (pvhVar != null) {
            return new l8j(pvhVar);
        }
        return null;
    }

    @Override // tb.f64.a
    public void invoke(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
        } else {
            this.f23174a.b(obj);
        }
    }
}
