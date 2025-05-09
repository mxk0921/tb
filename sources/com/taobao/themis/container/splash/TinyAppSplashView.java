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
public class TinyAppSplashView implements ISplashView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final bbs f13497a;
    public final ViewGroup b;
    public ISplashView.Status c = ISplashView.Status.LAUNCH;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715158);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(835715157);
        t2o.a(839909513);
    }

    public TinyAppSplashView(bbs bbsVar, ViewGroup viewGroup) {
        ckf.g(bbsVar, "mInstance");
        ckf.g(viewGroup, "mSplashView");
        this.f13497a = bbsVar;
        this.b = viewGroup;
    }

    public static final /* synthetic */ bbs c(TinyAppSplashView tinyAppSplashView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("7e9ea5ad", new Object[]{tinyAppSplashView});
        }
        return tinyAppSplashView.f13497a;
    }

    public static final /* synthetic */ ViewGroup d(TinyAppSplashView tinyAppSplashView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a7392859", new Object[]{tinyAppSplashView});
        }
        return tinyAppSplashView.b;
    }

    public static final /* synthetic */ ISplashView.Status e(TinyAppSplashView tinyAppSplashView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView.Status) ipChange.ipc$dispatch("d76e6fb", new Object[]{tinyAppSplashView});
        }
        return tinyAppSplashView.c;
    }

    public static final /* synthetic */ void f(TinyAppSplashView tinyAppSplashView, ISplashView.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921fb1d3", new Object[]{tinyAppSplashView, status});
        } else {
            tinyAppSplashView.c = status;
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f837597", new Object[]{this});
        } else {
            CommonExtKt.o(new TinyAppSplashView$showLaunch$1(this));
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
        CommonExtKt.o(new TinyAppSplashView$onLaunchError$1(this, easVar));
    }

    @Override // com.taobao.themis.kernel.container.ui.splash.ISplashView
    public void exit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81677ea5", new Object[]{this});
        } else {
            CommonExtKt.o(new TinyAppSplashView$exit$1(this));
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
        } else {
            CommonExtKt.o(new TinyAppSplashView$showLoading$1(this));
        }
    }
}
