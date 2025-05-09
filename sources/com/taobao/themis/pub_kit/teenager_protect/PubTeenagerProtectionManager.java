package com.taobao.themis.pub_kit.teenager_protect;

import android.app.Activity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.pub_kit.teenager_protect.PubTimeLock;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.iqw;
import tb.jqw;
import tb.kqw;
import tb.lqw;
import tb.t2o;
import tb.xhv;
import tb.xpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubTeenagerProtectionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Activity f13734a;
    public final PubTeenagerProtectionGuide b;
    public final b c = new b(this);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final c e = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152351);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class b implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PubTeenagerProtectionManager f13735a;

        static {
            t2o.a(845152352);
            t2o.a(989856388);
        }

        public b(PubTeenagerProtectionManager pubTeenagerProtectionManager) {
            ckf.g(pubTeenagerProtectionManager, "this$0");
            this.f13735a = pubTeenagerProtectionManager;
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
            Object obj;
            String string;
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            ckf.g(objArr, "args");
            if (i != 3005) {
                return null;
            }
            Object obj2 = objArr[0];
            if (!(obj2 instanceof String)) {
                return null;
            }
            TMSLogger.f("PubTeenagerProtectionManager", ckf.p("teenager protection event params:", obj2));
            try {
                obj = Result.m1108constructorimpl(JSON.parseObject((String) obj2));
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                TMSLogger.c("PubTeenagerProtectionManager", "teenager protection event params error", th2);
            }
            if (Result.m1114isFailureimpl(obj)) {
                obj = null;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2 == null || (string = jSONObject2.getString("event")) == null || (jSONObject = jSONObject2.getJSONObject("param")) == null || !ckf.b(string, "ITAO_YOUNG_CLOSE_LOCK_SUCCESS") || !ckf.b(jSONObject.getString("bizCode"), "tinyApp")) {
                return null;
            }
            TMSLogger.f("PubTeenagerProtectionManager", "teenager protection unLock");
            xpr.n(PubTeenagerProtectionManager.a(this.f13735a));
            PubTimeLock pubTimeLock = PubTimeLock.INSTANCE;
            pubTimeLock.G();
            pubTimeLock.E();
            pubTimeLock.z(PubTeenagerProtectionManager.c(this.f13735a));
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements PubTimeLock.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.themis.pub_kit.teenager_protect.PubTimeLock.b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3adb69e6", new Object[]{this, new Integer(i)});
                return;
            }
            TMSLogger.f("PubTeenagerProtectionManager", ckf.p("timeLockListener onLock, lock type:", PubTimeLock.c.i(i)));
            PubTimeLock.c.a aVar = PubTimeLock.c.Companion;
            if (PubTimeLock.c.g(i, aVar.a())) {
                PubTeenagerProtectionManager.b(PubTeenagerProtectionManager.this).f(PubTeenagerProtectionManager.a(PubTeenagerProtectionManager.this), aVar.a());
            } else if (PubTimeLock.c.g(i, aVar.b())) {
                PubTeenagerProtectionManager.b(PubTeenagerProtectionManager.this).f(PubTeenagerProtectionManager.a(PubTeenagerProtectionManager.this), aVar.b());
            }
        }
    }

    static {
        t2o.a(845152350);
    }

    public PubTeenagerProtectionManager(Activity activity, d1a<xhv> d1aVar) {
        ckf.g(activity, "activity");
        ckf.g(d1aVar, "onClose");
        this.f13734a = activity;
        this.b = new PubTeenagerProtectionGuide(new PubTeenagerProtectionManager$teenagerProtectionGuide$1(this), d1aVar);
    }

    public static final /* synthetic */ Activity a(PubTeenagerProtectionManager pubTeenagerProtectionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("ab21f66a", new Object[]{pubTeenagerProtectionManager});
        }
        return pubTeenagerProtectionManager.f13734a;
    }

    public static final /* synthetic */ PubTeenagerProtectionGuide b(PubTeenagerProtectionManager pubTeenagerProtectionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubTeenagerProtectionGuide) ipChange.ipc$dispatch("773018fa", new Object[]{pubTeenagerProtectionManager});
        }
        return pubTeenagerProtectionManager.b;
    }

    public static final /* synthetic */ c c(PubTeenagerProtectionManager pubTeenagerProtectionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("c6c754f2", new Object[]{pubTeenagerProtectionManager});
        }
        return pubTeenagerProtectionManager.e;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76c7f726", new Object[]{this})).booleanValue();
        }
        if (!xpr.y(this.f13734a) || xpr.A(this.f13734a)) {
            return false;
        }
        return true;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (!this.d.get()) {
            TMSLogger.b("PubTeenagerProtectionManager", "teenager protection not init");
        } else {
            TMSLogger.f("PubTeenagerProtectionManager", "onStart");
            PubTimeLock.INSTANCE.u(new PubTeenagerProtectionManager$onStart$1(this));
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else if (!this.d.get()) {
            TMSLogger.b("PubTeenagerProtectionManager", "teenager protection not init");
        } else {
            TMSLogger.f("PubTeenagerProtectionManager", "onStop");
            PubTimeLock.INSTANCE.y();
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        TMSLogger.f("PubTeenagerProtectionManager", "teenager protection release");
        lqw.d().h(this.c);
        PubTimeLock.INSTANCE.H(this.e);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!e()) {
            TMSLogger.f("PubTeenagerProtectionManager", "teenager protection not in mode");
        } else if (this.d.compareAndSet(false, true)) {
            PubTimeLock.INSTANCE.u(new PubTeenagerProtectionManager$init$1(this));
            lqw.d().b(this.c);
            f();
        }
    }
}
