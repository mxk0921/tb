package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qho implements k4d<o0d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x2k f26761a;
    public o0d b;

    static {
        t2o.a(614465633);
        t2o.a(614465630);
    }

    public qho(Context context, String str) {
        this.f26761a = new y2k().d(context).e(str).a();
    }

    /* renamed from: c */
    public o0d a(Context context, u55 u55Var, u3o u3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o0d) ipChange.ipc$dispatch("a78ae37e", new Object[]{this, context, u55Var, u3oVar});
        }
        w55 a2 = s8v.a(context, u3oVar);
        if (a2 != null) {
            return a2.g(u55Var);
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
        o0d o0dVar = this.b;
        if (o0dVar != null) {
            o0dVar.cancel();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        x2k x2kVar = this.f26761a;
        if (x2kVar != null) {
            x2kVar.destroy();
        }
    }

    /* renamed from: e */
    public void b(o0d o0dVar, Object obj, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2991889b", new Object[]{this, o0dVar, obj, uxVar});
        } else if (o0dVar != null) {
            this.b = o0dVar;
            o0dVar.a(this.f26761a, obj, uxVar);
        }
    }
}
