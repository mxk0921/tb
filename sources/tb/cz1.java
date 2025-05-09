package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class cz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "BasePop";

    /* renamed from: a  reason: collision with root package name */
    public qpu f17458a;
    public cgm b;
    public d1a<xhv> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455582);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455581);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BasePop", "dismiss " + this, null, 4, null);
    }

    public final d1a<xhv> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("d448677d", new Object[]{this});
        }
        d1a<xhv> d1aVar = this.c;
        if (d1aVar != null) {
            return d1aVar;
        }
        ckf.y("dismissCallback");
        throw null;
    }

    public final qpu c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpu) ipChange.ipc$dispatch("410e9e8c", new Object[]{this});
        }
        qpu qpuVar = this.f17458a;
        if (qpuVar != null) {
            return qpuVar;
        }
        ckf.y("engineContext");
        throw null;
    }

    public final cgm d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cgm) ipChange.ipc$dispatch("c939d136", new Object[]{this});
        }
        cgm cgmVar = this.b;
        if (cgmVar != null) {
            return cgmVar;
        }
        ckf.y("popMsg");
        throw null;
    }

    public abstract int e();

    public abstract View f(Context context, cgm cgmVar);

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BasePop", "onDismiss " + this, null, 4, null);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BasePop", "onShow " + this, null, 4, null);
    }

    public void i(qpu qpuVar, cgm cgmVar, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85852c", new Object[]{this, qpuVar, cgmVar, d1aVar});
            return;
        }
        ckf.g(qpuVar, "context");
        ckf.g(cgmVar, "msg");
        ckf.g(d1aVar, "dismissCallback");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BasePop", "show pop " + this, null, 4, null);
        this.f17458a = qpuVar;
        this.b = cgmVar;
        this.c = d1aVar;
    }
}
