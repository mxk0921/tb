package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.base.service.multitab.ITabStyleListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class tkq implements ITabStyleListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final qpu f28773a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455576);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455575);
        t2o.a(916455449);
    }

    public tkq(qpu qpuVar) {
        ckf.g(qpuVar, "turboEngineContext");
        this.f28773a = qpuVar;
    }

    @Override // com.taobao.android.turbo.base.service.multitab.ITabStyleListener
    public void a(int i, float f, boolean z, boolean z2, ITabStyleListener.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a0ff61", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Boolean(z2), triggerType});
            return;
        }
        ckf.g(triggerType, "triggerType");
        if (triggerType != ITabStyleListener.TriggerType.TAB_SCROLLED || f < 0.001d) {
            b(z);
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd862353", new Object[]{this, new Boolean(z)});
            return;
        }
        Context context = this.f28773a.getContext();
        if (context instanceof Activity) {
            r6o.Companion.i((Activity) context, z);
        }
    }
}
