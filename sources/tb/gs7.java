package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gs7 implements k4d<hsb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hsb f20186a;

    static {
        t2o.a(614465628);
        t2o.a(614465630);
    }

    /* renamed from: c */
    public hsb a(Context context, u55 u55Var, u3o u3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hsb) ipChange.ipc$dispatch("6bf3b1bb", new Object[]{this, context, u55Var, u3oVar});
        }
        w55 a2 = s8v.a(context, u3oVar);
        if (a2 != null) {
            return a2.h(u55Var);
        }
        throw new IllegalArgumentException("context or request config can't be null");
    }

    @Override // tb.k4d
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        hsb hsbVar = this.f20186a;
        if (hsbVar != null) {
            hsbVar.cancel();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    /* renamed from: e */
    public void b(hsb hsbVar, Object obj, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e426a03a", new Object[]{this, hsbVar, obj, uxVar});
        } else if (hsbVar != null) {
            this.f20186a = hsbVar;
            hsbVar.a(obj, uxVar);
        }
    }
}
