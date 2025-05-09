package com.taobao.themis.container.splash;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.Map;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.eas;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DefaultSplashView implements ISplashView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final bbs f13495a;
    public final ViewGroup b;
    public ISplashView.Status c = ISplashView.Status.LAUNCH;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715151);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(835715150);
        t2o.a(839909513);
    }

    public DefaultSplashView(bbs bbsVar, ViewGroup viewGroup) {
        ckf.g(bbsVar, "mInstance");
        ckf.g(viewGroup, "mSplashView");
        this.f13495a = bbsVar;
        this.b = viewGroup;
    }

    public static final /* synthetic */ bbs c(DefaultSplashView defaultSplashView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("6a045ced", new Object[]{defaultSplashView});
        }
        return defaultSplashView.f13495a;
    }

    public static final /* synthetic */ ViewGroup d(DefaultSplashView defaultSplashView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("43448f99", new Object[]{defaultSplashView});
        }
        return defaultSplashView.b;
    }

    public static final /* synthetic */ ISplashView.Status e(DefaultSplashView defaultSplashView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView.Status) ipChange.ipc$dispatch("cb78a7bb", new Object[]{defaultSplashView});
        }
        return defaultSplashView.c;
    }

    public static final /* synthetic */ void f(DefaultSplashView defaultSplashView, ISplashView.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94560913", new Object[]{defaultSplashView, status});
        } else {
            defaultSplashView.c = status;
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f837597", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
    public void b(eas easVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d6354b", new Object[]{this, easVar, map});
            return;
        }
        ckf.g(easVar, "error");
        CommonExtKt.o(new DefaultSplashView$onLaunchError$1(this, easVar));
    }

    @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
    public void exit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81677ea5", new Object[]{this});
        } else {
            CommonExtKt.o(new DefaultSplashView$exit$1(this));
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
    public ISplashView.Status getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView.Status) ipChange.ipc$dispatch("5cc62b68", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        }
    }
}
