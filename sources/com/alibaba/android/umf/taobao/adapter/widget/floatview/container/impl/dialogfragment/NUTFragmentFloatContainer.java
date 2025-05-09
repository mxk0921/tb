package com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.NUTFloatViewManager;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.assembler.impl.draggable.NUTFloatViewsRecyclerViewDraggableAssembler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.ayc;
import tb.b4e;
import tb.bh;
import tb.byc;
import tb.ck;
import tb.cyc;
import tb.cyu;
import tb.dxu;
import tb.dyc;
import tb.eyc;
import tb.gyc;
import tb.hdv;
import tb.hij;
import tb.j4e;
import tb.jij;
import tb.mi;
import tb.rbb;
import tb.t2o;
import tb.uj;
import tb.xk;
import tb.zhj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NUTFragmentFloatContainer extends AppCompatDialogFragment implements cyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public NUTFloatViewManager.Builder f2415a;
    public cyc.b c;
    public cyc.d d;
    public dyc e;
    public gyc f;
    public final zhj g = new zhj();
    public final List<cyc.a> h = new ArrayList();
    public hij i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements cyc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.cyc.a
        public boolean onClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e155e364", new Object[]{this})).booleanValue();
            }
            return NUTFragmentFloatContainer.p2(NUTFragmentFloatContainer.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements cyc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.cyc.b
        public void onDismiss(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c369e62", new Object[]{this, new Boolean(z)});
            } else if (z) {
                NUTFragmentFloatContainer.r2(NUTFragmentFloatContainer.this);
            } else {
                NUTFragmentFloatContainer.this.C1();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements eyc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f2419a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements byc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.byc
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("97f869b2", new Object[]{this});
                } else {
                    NUTFragmentFloatContainer.this.C1();
                }
            }

            @Override // tb.byc
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4e1f0bb2", new Object[]{this});
                } else if (NUTFragmentFloatContainer.v2(NUTFragmentFloatContainer.this) != null) {
                    NUTFragmentFloatContainer.v2(NUTFragmentFloatContainer.this).onShow();
                }
            }
        }

        public c(FragmentActivity fragmentActivity) {
            this.f2419a = fragmentActivity;
        }

        public final boolean a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2736a4cf", new Object[]{this, context})).booleanValue();
            }
            if (context instanceof Activity) {
                return ((Activity) context).isFinishing();
            }
            return false;
        }

        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96e7e22e", new Object[]{this, miVar});
                return;
            }
            if (miVar.f() == 0) {
                NUTFragmentFloatContainer.this.C1();
            }
            b4e a2 = dxu.a();
            a2.e("NUTFragmentFloatContainer", "onRenderFailed#error=" + miVar);
            e(miVar);
        }

        public void c(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
            } else if (!a(this.f2419a) && !NUTFragmentFloatContainer.this.isAdded()) {
                NUTFragmentFloatContainer.s2(NUTFragmentFloatContainer.this).f(view, NUTFragmentFloatContainer.A2(NUTFragmentFloatContainer.this));
                try {
                    NUTFragmentFloatContainer nUTFragmentFloatContainer = NUTFragmentFloatContainer.this;
                    FragmentManager B2 = NUTFragmentFloatContainer.B2(nUTFragmentFloatContainer, this.f2419a);
                    NUTFragmentFloatContainer.C2(nUTFragmentFloatContainer, B2, "NUTFragmentFloatContainer" + System.currentTimeMillis());
                } catch (IllegalStateException e) {
                    rbb g = ck.g();
                    g.f("显示浮层报错:" + e.getMessage(), ck.b.b().l("NUTFragmentFloatContainer").a());
                }
                j4e a2 = NUTFragmentFloatContainer.s2(NUTFragmentFloatContainer.this).a();
                if (a2 instanceof View) {
                    d((View) a2);
                } else {
                    dxu.a().e("NUTFragmentFloatContainer", "onRenderSuccess#contentWrapperLayout is null");
                }
                f();
            }
        }

        public final void d(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b87f65b", new Object[]{this, view});
            } else {
                NUTFragmentFloatContainer.z2(NUTFragmentFloatContainer.this).i(view, NUTFragmentFloatContainer.s2(NUTFragmentFloatContainer.this).d(), new a());
            }
        }

        public final void e(mi miVar) {
            cyc.c renderListener;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f6fda02", new Object[]{this, miVar});
            } else if (NUTFragmentFloatContainer.u2(NUTFragmentFloatContainer.this) != null && (renderListener = NUTFragmentFloatContainer.u2(NUTFragmentFloatContainer.this).getRenderListener()) != null) {
                renderListener.b(miVar);
            }
        }

        public final void f() {
            cyc.c renderListener;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1c234b", new Object[]{this});
            } else if (NUTFragmentFloatContainer.u2(NUTFragmentFloatContainer.this) != null && (renderListener = NUTFragmentFloatContainer.u2(NUTFragmentFloatContainer.this).getRenderListener()) != null) {
                renderListener.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements byc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.byc
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97f869b2", new Object[]{this});
            } else if (NUTFragmentFloatContainer.this.getFragmentManager() != null) {
                NUTFragmentFloatContainer.r2(NUTFragmentFloatContainer.this);
            }
        }

        @Override // tb.byc
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e1f0bb2", new Object[]{this});
            } else {
                NUTFragmentFloatContainer.r2(NUTFragmentFloatContainer.this);
            }
        }
    }

    static {
        t2o.a(81789320);
        t2o.a(81789308);
    }

    public static /* synthetic */ hij A2(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hij) ipChange.ipc$dispatch("91b7f9d9", new Object[]{nUTFragmentFloatContainer});
        }
        return nUTFragmentFloatContainer.i;
    }

    public static /* synthetic */ FragmentManager B2(NUTFragmentFloatContainer nUTFragmentFloatContainer, FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("21239b35", new Object[]{nUTFragmentFloatContainer, fragmentActivity});
        }
        return nUTFragmentFloatContainer.M2(fragmentActivity);
    }

    public static /* synthetic */ void C2(NUTFragmentFloatContainer nUTFragmentFloatContainer, FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668ab26", new Object[]{nUTFragmentFloatContainer, fragmentManager, str});
        } else {
            super.show(fragmentManager, str);
        }
    }

    public static /* synthetic */ void D2(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f78778e", new Object[]{nUTFragmentFloatContainer});
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    public static /* synthetic */ Object ipc$super(NUTFragmentFloatContainer nUTFragmentFloatContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -596517775:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
                return null;
            case 937454072:
                super.dismissAllowingStateLoss();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/widget/floatview/container/impl/dialogfragment/NUTFragmentFloatContainer");
        }
    }

    public static /* synthetic */ boolean p2(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db72bf1c", new Object[]{nUTFragmentFloatContainer})).booleanValue();
        }
        return nUTFragmentFloatContainer.J2();
    }

    public static /* synthetic */ void r2(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae299f7", new Object[]{nUTFragmentFloatContainer});
        } else {
            nUTFragmentFloatContainer.E2();
        }
    }

    public static /* synthetic */ gyc s2(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gyc) ipChange.ipc$dispatch("f30f051c", new Object[]{nUTFragmentFloatContainer});
        }
        return nUTFragmentFloatContainer.K2();
    }

    public static /* synthetic */ NUTFloatViewManager.Builder u2(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NUTFloatViewManager.Builder) ipChange.ipc$dispatch("d4daa0b0", new Object[]{nUTFragmentFloatContainer});
        }
        return nUTFragmentFloatContainer.f2415a;
    }

    public static /* synthetic */ cyc.d v2(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyc.d) ipChange.ipc$dispatch("e0f26b22", new Object[]{nUTFragmentFloatContainer});
        }
        return nUTFragmentFloatContainer.d;
    }

    public static /* synthetic */ zhj z2(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zhj) ipChange.ipc$dispatch("724560e2", new Object[]{nUTFragmentFloatContainer});
        }
        return nUTFragmentFloatContainer.g;
    }

    @Override // tb.cyc
    public boolean C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd82c17d", new Object[]{this})).booleanValue();
        }
        return T2();
    }

    public final void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafc8055", new Object[]{this});
            return;
        }
        uj.a(getView());
        try {
            D2(this);
        } catch (Exception unused) {
            ck.g().f("浮层消失时报错", ck.b.b().l("NUTFragmentFloatContainer").a());
        }
    }

    public final boolean J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f7ebb54", new Object[]{this})).booleanValue();
        }
        Iterator it = ((ArrayList) this.h).iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((cyc.a) it.next()).onClose()) {
                z = true;
            }
            if (xk.a("auraRemoveCloseClickListenerWhenDispatch", false)) {
                it.remove();
            }
        }
        return z;
    }

    public final gyc K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gyc) ipChange.ipc$dispatch("c7768a25", new Object[]{this});
        }
        gyc gycVar = this.f;
        if (gycVar != null) {
            return gycVar;
        }
        if (this.f2415a != null) {
            Boolean i = this.i.i();
            if (i == null || !i.booleanValue()) {
                this.f = new jij();
            } else {
                this.f = new NUTFloatViewsRecyclerViewDraggableAssembler();
            }
        } else {
            N2();
            this.f = new jij();
        }
        this.f.g(new a());
        this.f.e(new b());
        return this.f;
    }

    @Override // tb.cyc
    public void L1(dyc dycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ff3b97", new Object[]{this, dycVar});
        } else {
            this.e = dycVar;
        }
    }

    public final FragmentManager M2(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("647748ba", new Object[]{this, fragmentActivity});
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        List<Fragment> fragments = supportFragmentManager.getFragments();
        if (bh.a(fragments)) {
            return supportFragmentManager;
        }
        return fragments.get(0).getChildFragmentManager();
    }

    public final void N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70072c53", new Object[]{this});
            return;
        }
        try {
            ck.g().c("NUTFragmentFloatContainer", "getFloatViewsAssembler", "mBuilder is null");
            hdv.a().logError("AURAMonitor", "NUTFloat", "float", null, "nut-builder-npe", "mBuilder is null", new HashMap(), cyu.c("mBuilder is null"));
            hdv.a().commitFailure("float", "AURAMonitor", "1.0", "AURAMonitor", "NUTFloat", new HashMap(), "nut-builder-npe", "mBuilder is null");
        } catch (Exception e) {
            ck.g().b("NUTFragmentFloatContainer", "reportBuilderNpeError-exception", e.getMessage());
        }
    }

    public void O2(ayc aycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694d5cb9", new Object[]{this, aycVar});
        } else {
            this.g.h(aycVar);
        }
    }

    public void Q2(cyc.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b19387", new Object[]{this, bVar});
        } else {
            this.c = bVar;
        }
    }

    public void R2(cyc.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce5be25", new Object[]{this, dVar});
        } else {
            this.d = dVar;
        }
    }

    public final boolean S2(FragmentActivity fragmentActivity) {
        dyc dycVar;
        NUTFloatViewManager.Builder builder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7f3a91", new Object[]{this, fragmentActivity})).booleanValue();
        }
        if (this.g.f() || (dycVar = this.e) == null || (builder = this.f2415a) == null) {
            return false;
        }
        return dycVar.b(fragmentActivity, builder.getFloatParams(), new c(fragmentActivity));
    }

    public final boolean T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("897e93fc", new Object[]{this})).booleanValue();
        }
        return this.g.c(new d());
    }

    @Override // tb.cyc
    public void c0(NUTFloatViewManager.Builder builder, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af10b2a", new Object[]{this, builder, hijVar});
            return;
        }
        rbb g = ck.g();
        g.c("NUTFragmentFloatContainer", "setConfigBuilder", "builder=" + builder);
        this.f2415a = builder;
        this.i = hijVar;
    }

    @Override // tb.cyc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        dyc dycVar = this.e;
        if (dycVar != null) {
            dycVar.destroy();
            this.e = null;
        }
        ((ArrayList) this.h).clear();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Deprecated
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            C1();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @Deprecated
    public void dismissAllowingStateLoss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e069f8", new Object[]{this});
        } else {
            C1();
        }
    }

    @Override // tb.cyc
    public void j1(ayc aycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("542c2b6d", new Object[]{this, aycVar});
        } else {
            this.g.g(aycVar);
        }
    }

    @Override // tb.cyc
    public void n(cyc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89558af", new Object[]{this, aVar});
        } else if (!((ArrayList) this.h).contains(aVar)) {
            ((ArrayList) this.h).add(aVar);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(1, R.style.NUTFloatViewTheme_Dialog_Transparent);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("cc7a75a5", new Object[]{this, bundle});
        }
        AppCompatDialog appCompatDialog = new AppCompatDialog(getContext(), getTheme()) { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.NUTFragmentFloatContainer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/widget/floatview/container/impl/dialogfragment/NUTFragmentFloatContainer$3");
            }

            @Override // androidx.activity.ComponentDialog, android.app.Dialog
            public void onBackPressed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88afc63", new Object[]{this});
                } else if (!NUTFragmentFloatContainer.s2(NUTFragmentFloatContainer.this).onBackPressed() && !NUTFragmentFloatContainer.p2(NUTFragmentFloatContainer.this)) {
                    NUTFragmentFloatContainer.this.C1();
                }
            }
        };
        Window window = appCompatDialog.getWindow();
        if (window != null) {
            window.clearFlags(131072);
            window.setSoftInputMode(3);
        }
        return appCompatDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        return K2().h(getContext());
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        NUTFloatViewManager.Builder builder = this.f2415a;
        if (builder != null && builder.isInternalRecycleOnDismiss()) {
            destroy();
        }
        K2().b();
        cyc.b bVar = this.c;
        if (bVar != null) {
            bVar.onDismiss(false);
        }
    }

    @Override // tb.cyc
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        this.f.c(this.i);
        S2(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @Deprecated
    public int show(FragmentTransaction fragmentTransaction, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b31bd3", new Object[]{this, fragmentTransaction, str})).intValue();
        }
        U(getContext());
        return -1;
    }

    @Override // tb.cyc
    public boolean U(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c358026", new Object[]{this, context})).booleanValue();
        }
        if (isAdded()) {
            dxu.a().e("NUTFragmentFloatContainer", "showFloat#float is already showing");
            return false;
        } else if (context instanceof FragmentActivity) {
            return S2((FragmentActivity) context);
        } else {
            dxu.a().e("NUTFragmentFloatContainer", "showFloat#make sure context is FragmentActivity");
            return false;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @Deprecated
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc71dc71", new Object[]{this, fragmentManager, str});
        } else {
            U(getContext());
        }
    }
}
