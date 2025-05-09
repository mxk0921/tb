package com.etao.feimagesearch.struct;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.njg;
import tb.t2o;
import tb.v9e;
import tb.vz;
import tb.xfw;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: ROOT_VIEW extends android.view.View
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:80)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:52)
    */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ViewWidget<ROOT_VIEW extends View, MODEL, SELF> extends vz implements v9e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final MODEL d;
    public final xfw e;
    public final boolean f;
    public final boolean g;
    public volatile boolean h;
    public volatile ROOT_VIEW i;
    public volatile ViewGroup j;
    public final njg k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewWidget<ROOT_VIEW, MODEL, SELF> f4867a;
        public final /* synthetic */ xfw b;
        public final /* synthetic */ ROOT_VIEW c;

        public a(ViewWidget<ROOT_VIEW, MODEL, SELF> viewWidget, xfw xfwVar, ROOT_VIEW root_view) {
            this.f4867a = viewWidget;
            this.b = xfwVar;
            this.c = root_view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f4867a.g0(this.b.a(this.c));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewWidget<ROOT_VIEW, MODEL, SELF> f4868a;

        public b(ViewWidget<ROOT_VIEW, MODEL, SELF> viewWidget) {
            this.f4868a = viewWidget;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ViewWidget.R(this.f4868a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewWidget<ROOT_VIEW, MODEL, SELF> f4869a;

        public c(ViewWidget<ROOT_VIEW, MODEL, SELF> viewWidget) {
            this.f4869a = viewWidget;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ViewWidget<ROOT_VIEW, MODEL, SELF> viewWidget = this.f4869a;
            viewWidget.c0(viewWidget);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f4870a;

        public d(Runnable runnable) {
            this.f4870a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f4870a.run();
            }
        }
    }

    static {
        t2o.a(481297465);
        t2o.a(481297462);
    }

    public /* synthetic */ ViewWidget(Activity activity, Object obj, Object obj2, xfw xfwVar, boolean z, boolean z2, int i, a07 a07Var) {
        this(activity, obj, obj2, (i & 8) != 0 ? null : xfwVar, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2);
    }

    public static final /* synthetic */ void R(ViewWidget viewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20088d17", new Object[]{viewWidget});
        } else {
            viewWidget.Z();
        }
    }

    public static /* synthetic */ void T(ViewWidget viewWidget, xfw xfwVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15251cdf", new Object[]{viewWidget, xfwVar, new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 1) != 0) {
                xfwVar = null;
            }
            viewWidget.S(xfwVar);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attachToContainer");
        }
    }

    public static /* synthetic */ Object ipc$super(ViewWidget viewWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1250151579) {
            super.G();
            return null;
        } else if (hashCode == 1316643293) {
            super.P();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/struct/ViewWidget");
        }
    }

    @Override // tb.vz
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        if (this.g) {
            e0(new b(this));
        } else {
            Z();
        }
        super.G();
        e0(new c(this));
    }

    @Override // tb.vz
    public void P() {
        xfw xfwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7a61dd", new Object[]{this});
            return;
        }
        super.P();
        ROOT_VIEW root_view = this.i;
        if (!(root_view == null || (xfwVar = this.e) == null)) {
            xfwVar.b(root_view);
        }
        Y().removeCallbacksAndMessages(null);
    }

    public final void S(xfw xfwVar) {
        ROOT_VIEW U;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc601e08", new Object[]{this, xfwVar});
        } else if (!this.h && (U = U()) != null) {
            if (xfwVar == null) {
                xfwVar = this.e;
            }
            if (xfwVar != null) {
                this.j = xfwVar.a(U);
                this.h = true;
            }
        }
    }

    public final ROOT_VIEW U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ROOT_VIEW) ((View) ipChange.ipc$dispatch("c4555c8c", new Object[]{this}));
        }
        ROOT_VIEW root_view = this.i;
        if (root_view != null) {
            return root_view;
        }
        ROOT_VIEW b0 = b0();
        this.i = b0;
        return b0;
    }

    public final ViewGroup V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c9c16903", new Object[]{this});
        }
        return this.j;
    }

    public final MODEL W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MODEL) ipChange.ipc$dispatch("b4c825f8", new Object[]{this});
        }
        return this.d;
    }

    public final ROOT_VIEW X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ROOT_VIEW) ((View) ipChange.ipc$dispatch("17b33166", new Object[]{this}));
        }
        return this.i;
    }

    public final Handler Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4ab77f48", new Object[]{this});
        }
        return (Handler) this.k.getValue();
    }

    public final void Z() {
        ROOT_VIEW U;
        xfw xfwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16df57c", new Object[]{this});
        } else if (!this.h && (U = U()) != null && this.f && (xfwVar = this.e) != null) {
            e0(new a(this, xfwVar, U));
            this.h = true;
        }
    }

    public final boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f518279", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public abstract ROOT_VIEW b0();

    public void c0(SELF self) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92051cb", new Object[]{this, self});
        }
    }

    public final void e0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{this, runnable});
        } else if (runnable != null) {
            if (ckf.b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                runnable.run();
            } else {
                Y().post(new d(runnable));
            }
        }
    }

    public final void f0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d64ac7", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public final void g0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c358585", new Object[]{this, viewGroup});
        } else {
            this.j = viewGroup;
        }
    }

    public void q(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e855e03", new Object[]{this, str, obj});
        } else {
            ckf.g(str, "action");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewWidget(Activity activity, Object obj, MODEL model, xfw xfwVar, boolean z, boolean z2) {
        super(activity, obj);
        ckf.g(activity, "activity");
        this.d = model;
        this.e = xfwVar;
        this.f = z;
        this.g = z2;
        this.k = kotlin.a.b(ViewWidget$widgetMainHandler$2.INSTANCE);
    }
}
