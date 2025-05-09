package com.taobao.themis.kernel.extension.page;

import android.os.Build;
import android.view.WindowManager;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a07;
import tb.ckf;
import tb.dyd;
import tb.iud;
import tb.njg;
import tb.q9s;
import tb.qml;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class SystemWindowPageExtension implements iud {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f13574a;
    public boolean b;
    public final boolean c;
    public boolean d;
    public final boolean e;
    public final njg f;
    public final njg g;
    public final njg h;
    public final AtomicBoolean i;
    public final b j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(839909670);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements ITMSPage.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24ebcc1e", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            if (!q9s.o() || !(iTMSPage.getInstance().a0() == TMSSolutionType.WEB_SINGLE_PAGE || iTMSPage.getInstance().a0() == TMSSolutionType.WEEX)) {
                SystemWindowPageExtension.f(SystemWindowPageExtension.this);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void f(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b96e2075", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.c(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void g(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("485e7409", new Object[]{this, iTMSPage});
            } else {
                ckf.g(iTMSPage, "page");
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void h(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3516433", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.d(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void l(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7a6418b", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            a(iTMSPage);
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void n(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b526f91", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.f(this, iTMSPage);
            }
        }
    }

    static {
        t2o.a(839909669);
        t2o.a(839909649);
    }

    public SystemWindowPageExtension(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f13574a = iTMSPage;
        this.b = qml.v(iTMSPage);
        this.c = iTMSPage.getPageParams().i();
        this.d = qml.k(iTMSPage) == Window.Theme.LIGHT;
        this.e = qml.b(iTMSPage);
        this.f = kotlin.a.b(new SystemWindowPageExtension$mWindow$2(this));
        this.g = kotlin.a.b(new SystemWindowPageExtension$mStatusBarColor$2(this));
        this.h = kotlin.a.b(new SystemWindowPageExtension$mHomeIndicatorColor$2(this));
        this.i = new AtomicBoolean(false);
        this.j = new b();
    }

    public static final /* synthetic */ android.view.Window a(SystemWindowPageExtension systemWindowPageExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.view.Window) ipChange.ipc$dispatch("db56178d", new Object[]{systemWindowPageExtension});
        }
        return systemWindowPageExtension.h();
    }

    public static final /* synthetic */ void f(SystemWindowPageExtension systemWindowPageExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f402ceb", new Object[]{systemWindowPageExtension});
        } else {
            systemWindowPageExtension.s();
        }
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        this.f13574a.C(this.j);
    }

    @Override // tb.iud
    public void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f36f29", new Object[]{this, new Boolean(z)});
        } else if (!this.c) {
            this.d = false;
            s();
        } else {
            this.d = z;
            s();
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            this.f13574a.u(this.j);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1650a9", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 28 && !this.i.get()) {
            try {
                WindowManager.LayoutParams attributes = h().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                h().setAttributes(attributes);
            } catch (Throwable th) {
                TMSLogger.c("SystemWindowPageExtension", ckf.p("fitsNotchScreen error: ", th.getMessage()), th);
            }
        }
    }

    public final android.view.Window h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.view.Window) ipChange.ipc$dispatch("e6cfa1e5", new Object[]{this});
        }
        Object value = this.f.getValue();
        ckf.f(value, "<get-mWindow>(...)");
        return (android.view.Window) value;
    }

    public final ITMSPage l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("b17e45f5", new Object[]{this});
        }
        return this.f13574a;
    }

    public final int n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2beeac22", new Object[]{this, new Integer(i)})).intValue();
        }
        boolean z = this.b;
        if (z && this.e) {
            i |= 518;
        } else if (z && !this.e) {
            i |= yj4.VIEW_TYPE_NEW_HOMEPAGE_ONLOOK_HEAD;
        } else if (!z && this.e) {
            i |= 514;
        }
        return i | 4096;
    }

    public final int r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56f32f4b", new Object[]{this, new Integer(i)})).intValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return i;
        }
        if (this.d) {
            return i | 8192;
        }
        return i;
    }

    public final synchronized void s() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b56ee79", new Object[]{this});
            return;
        }
        g();
        if (this.c) {
            h().setStatusBarColor(0);
            i = 1280;
        } else {
            i = 256;
        }
        h().clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        h().getDecorView().setSystemUiVisibility(n(r(i)));
        this.i.set(true);
    }

    @Override // tb.iud
    public void s0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9b116c", new Object[]{this, new Boolean(z)});
        } else if (!this.c) {
            this.d = false;
            s();
        } else {
            this.b = z;
            s();
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else if (this.f13574a.getExtension(dyd.class) == null) {
            s();
        }
    }
}
