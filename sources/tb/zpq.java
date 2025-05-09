package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zpq implements k4d<etd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final spq f32937a;
    public etd b;

    static {
        t2o.a(614465634);
        t2o.a(614465630);
    }

    public zpq(Context context, String str) {
        this.f32937a = new spq(context, str);
    }

    /* renamed from: c */
    public etd a(Context context, u55 u55Var, u3o u3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (etd) ipChange.ipc$dispatch("6e878e1e", new Object[]{this, context, u55Var, u3oVar});
        }
        w55 a2 = s8v.a(context, u3oVar);
        if (a2 != null) {
            return a2.k(u55Var);
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
        etd etdVar = this.b;
        if (etdVar != null) {
            etdVar.cancel();
        }
    }

    /* renamed from: d */
    public void b(etd etdVar, Object obj, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb01ffb", new Object[]{this, etdVar, obj, uxVar});
        } else if (etdVar != null) {
            this.b = etdVar;
            this.f32937a.b(etdVar, obj, uxVar);
        }
    }
}
