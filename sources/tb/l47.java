package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.n4d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class l47 implements n4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f23104a = new AtomicBoolean(false);
    public bbs b;

    static {
        t2o.a(847249415);
        t2o.a(839909570);
    }

    @Override // tb.n4d
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403e9ec4", new Object[]{this});
        } else {
            this.f23104a.set(true);
        }
    }

    @Override // tb.n4d
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8226c848", new Object[]{this});
            return;
        }
        bbs bbsVar = this.b;
        if (bbsVar != null) {
            if (!q9s.j() || this.f23104a.compareAndSet(false, true)) {
                TMSLogger.f("DefaultOutLinkLaunchExtension", ckf.p("LinkBackX.jump ", bbsVar.e0()));
                wpg.d(Uri.parse(bbsVar.e0()), bbsVar.I());
                return;
            }
            TMSLogger.f("DefaultOutLinkLaunchExtension", ckf.p("LinkBackX.jump skip ", bbsVar.e0()));
        }
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        n4d.a.a(this, bbsVar);
        this.b = bbsVar;
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            n4d.a.b(this);
        }
    }
}
