package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.pub.extension.TinyAppExtension;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.n4d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class zwt implements n4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public bbs f33069a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(844103697);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(844103696);
        t2o.a(839909570);
    }

    @Override // tb.n4d
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403e9ec4", new Object[]{this});
        } else {
            this.b.set(true);
        }
    }

    @Override // tb.n4d
    public void K() {
        TinyAppExtension tinyAppExtension;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8226c848", new Object[]{this});
            return;
        }
        TMSLogger.f("TinyAppOutLinkLaunchExtension", "TinyAppOutLinkLaunchExtension.onActivityFinish");
        bbs bbsVar = this.f33069a;
        if (bbsVar != null && (tinyAppExtension = (TinyAppExtension) bbsVar.getExtension(TinyAppExtension.class)) != null) {
            if (tinyAppExtension.z()) {
                TMSLogger.f("TinyAppOutLinkLaunchExtension", "TinyAppOutLinkLaunchExtension.onActivityFinish skip because hasTriggerBackHome");
                return;
            }
            if (q9s.j() && this.b.get()) {
                TMSLogger.f("TinyAppOutLinkLaunchExtension", "TinyAppOutLinkLaunchExtension.onActivityFinish skip because disableBackJumpAllowed");
            }
            Activity I = bbsVar.I();
            ckf.f(I, "instance.activity");
            String L = bbsVar.L();
            ckf.f(L, "instance.appId");
            ner.q(I, L, true, false, null, null, null, 96, null);
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
        this.f33069a = bbsVar;
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
