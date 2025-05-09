package com.taobao.android.abilitykit.ability.pop.render;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import tb.a8;
import tb.a9;
import tb.ckf;
import tb.hp6;
import tb.iab;
import tb.jpu;
import tb.pr;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AKFragmentPopRender$onCreateView$1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AKFragmentPopRender f6262a;
    public final /* synthetic */ iab b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ a9 e;

    public AKFragmentPopRender$onCreateView$1(AKFragmentPopRender aKFragmentPopRender, iab iabVar, Context context, int i, a9 a9Var) {
        this.f6262a = aKFragmentPopRender;
        this.b = iabVar;
        this.c = context;
        this.d = i;
        this.e = a9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iab iabVar = this.b;
        FrameLayout frameLayout = new FrameLayout(this.c);
        frameLayout.setId(this.d);
        this.f6262a.s(frameLayout);
        xhv xhvVar = xhv.INSTANCE;
        iabVar.onRenderSuccess(frameLayout);
        if (((FragmentActivity) this.c).findViewById(this.d) != null) {
            try {
                final Fragment d = AKFragmentPopRender.d(this.f6262a);
                if (d == null) {
                    Object newInstance = Class.forName(this.e.i()).newInstance();
                    if (newInstance != null) {
                        d = (Fragment) newInstance;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.Fragment");
                    }
                }
                Bundle a2 = hp6.a(d.getArguments(), this.e.g);
                String str = this.e.e;
                if (str != null && !wsq.a0(str)) {
                    a2.putString("url", this.e.e);
                }
                a2.putBoolean(AKFragmentPopRender.UT_PAGE_FLAG_KEY, true);
                d.setArguments(a2);
                AKFragmentPopRender.e(this.f6262a, d);
                this.f6262a.t((FragmentActivity) this.c);
                FragmentManager supportFragmentManager = ((FragmentActivity) this.c).getSupportFragmentManager();
                if (!this.e.f20479a.h0()) {
                    new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.taobao.android.abilitykit.ability.pop.render.AKFragmentPopRender$onCreateView$1$$special$$inlined$also$lambda$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* renamed from: a  reason: collision with root package name */
                        public String f6261a;
                        public String b;

                        public static /* synthetic */ Object ipc$super(AKFragmentPopRender$onCreateView$1$$special$$inlined$also$lambda$1 aKFragmentPopRender$onCreateView$1$$special$$inlined$also$lambda$1, String str2, Object... objArr) {
                            str2.hashCode();
                            int hashCode = str2.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/render/AKFragmentPopRender$onCreateView$1$$special$$inlined$also$lambda$1");
                        }

                        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("69b9df5f", new Object[]{this, fragmentManager, fragment, context});
                            } else if (ckf.b(fragment, d)) {
                                UTAnalytics instance = UTAnalytics.getInstance();
                                ckf.f(instance, "UTAnalytics.getInstance()");
                                UTTracker defaultTracker = instance.getDefaultTracker();
                                AKFragmentPopRender aKFragmentPopRender = AKFragmentPopRender$onCreateView$1.this.f6262a;
                                String str2 = null;
                                if (!(context instanceof FragmentActivity)) {
                                    context = null;
                                }
                                Object c = AKFragmentPopRender.c(aKFragmentPopRender, (FragmentActivity) context);
                                Map<String, String> pageProperties = defaultTracker.getPageProperties(c);
                                this.f6261a = pageProperties != null ? pageProperties.get("spm-cnt") : null;
                                Map<String, String> pageProperties2 = defaultTracker.getPageProperties(c);
                                if (pageProperties2 != null) {
                                    str2 = pageProperties2.get("spm-url");
                                }
                                this.b = str2;
                                defaultTracker.pageDisAppear(c);
                            }
                        }

                        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("d62d7dfb", new Object[]{this, fragmentManager, fragment});
                            } else if (ckf.b(fragment, d)) {
                                UTAnalytics instance = UTAnalytics.getInstance();
                                ckf.f(instance, "UTAnalytics.getInstance()");
                                UTTracker defaultTracker = instance.getDefaultTracker();
                                AKFragmentPopRender$onCreateView$1 aKFragmentPopRender$onCreateView$1 = AKFragmentPopRender$onCreateView$1.this;
                                AKFragmentPopRender aKFragmentPopRender = aKFragmentPopRender$onCreateView$1.f6262a;
                                Context context = aKFragmentPopRender$onCreateView$1.c;
                                if (!(context instanceof FragmentActivity)) {
                                    context = null;
                                }
                                defaultTracker.pageAppear(AKFragmentPopRender.c(aKFragmentPopRender, (FragmentActivity) context));
                            }
                        }

                        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
                            } else if (ckf.b(fragment, d)) {
                                UTAnalytics instance = UTAnalytics.getInstance();
                                ckf.f(instance, "UTAnalytics.getInstance()");
                                instance.getDefaultTracker().pageDisAppear(d);
                            }
                        }

                        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                            Uri uri;
                            String str2;
                            String str3;
                            String str4;
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
                            } else if (ckf.b(fragment, d)) {
                                String str5 = null;
                                try {
                                    uri = Uri.parse(AKFragmentPopRender$onCreateView$1.this.e.e);
                                } catch (Throwable unused) {
                                    uri = null;
                                }
                                UTAnalytics instance = UTAnalytics.getInstance();
                                ckf.f(instance, "UTAnalytics.getInstance()");
                                UTTracker defaultTracker = instance.getDefaultTracker();
                                Fragment fragment2 = d;
                                if (uri == null || (str2 = uri.getQueryParameter("pageName")) == null) {
                                    str2 = d.getTag();
                                }
                                defaultTracker.pageAppearDonotSkip(fragment2, str2);
                                Fragment fragment3 = d;
                                if (uri != null) {
                                    str5 = uri.getQueryParameter("spm-cnt");
                                }
                                Pair a3 = jpu.a("spm-cnt", str5);
                                if (uri == null || (str3 = uri.getQueryParameter("spm-url")) == null) {
                                    str3 = this.f6261a;
                                }
                                Pair a4 = jpu.a("spm-url", str3);
                                if (uri == null || (str4 = uri.getQueryParameter("spm-pre")) == null) {
                                    str4 = this.b;
                                }
                                defaultTracker.updatePageProperties(fragment3, a.j(a3, a4, jpu.a("spm-pre", str4)));
                            }
                        }
                    };
                }
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                int i = this.d;
                String g = this.e.g();
                if (g == null) {
                    g = "StdPopFragment-" + this.e.f;
                }
                beginTransaction.replace(i, d, g).commitNowAllowingStateLoss();
            } catch (Throwable th) {
                this.f6262a.r();
                this.b.a(new a8(10000, "FragmentPop exp:" + pr.d(th)), new PopErrorView(this.c, this.f6262a.c));
            }
        }
    }
}
