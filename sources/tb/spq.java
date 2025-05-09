package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class spq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lpq f28210a;

    static {
        t2o.a(83886133);
    }

    public spq(Context context, String str) {
        this.f28210a = new mpq().c(context).d(str).a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f28210a.destroy();
        }
    }

    public void b(etd etdVar, Object obj, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb01ffb", new Object[]{this, etdVar, obj, uxVar});
        } else {
            etdVar.a(this.f28210a, obj, uxVar);
        }
    }

    public void c(etd etdVar, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2bf29f", new Object[]{this, etdVar, uxVar});
        } else {
            etdVar.b(this.f28210a, uxVar);
        }
    }
}
