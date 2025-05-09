package com.taobao.themis.taobao.container;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.splash.ISplashViewFactory;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.pub.splash.PubGameLoadingPage;
import com.taobao.themis.pub.splash.PubGameLoadingTitleBar;
import com.taobao.themis.pub.splash.PubLoadingPage;
import com.taobao.themis.pub.splash.PubLoadingTitleBar;
import kotlin.Metadata;
import tb.a3c;
import tb.bbs;
import tb.ckf;
import tb.gas;
import tb.qmc;
import tb.t2o;
import tb.y0e;
import tb.y2c;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/taobao/container/TMSTBSplashViewFactory;", "Lcom/taobao/themis/container/splash/ISplashViewFactory;", "<init>", "()V", "Ltb/bbs;", "instance", "Ltb/y0e;", "createTitleBar", "(Ltb/bbs;)Ltb/y0e;", "Ltb/qmc;", "createLoadingPage", "(Ltb/bbs;)Ltb/qmc;", "Ltb/y2c;", "createErrorPage", "(Ltb/bbs;)Ltb/y2c;", "Ltb/a3c;", "createErrorWidget", "(Ltb/bbs;)Ltb/a3c;", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTBSplashViewFactory implements ISplashViewFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(847249426);
            int[] iArr = new int[TMSSolutionType.values().length];
            iArr[TMSSolutionType.MIX.ordinal()] = 1;
            iArr[TMSSolutionType.MINIGAME.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(847249425);
        t2o.a(835715154);
    }

    @Override // com.taobao.themis.container.splash.ISplashViewFactory
    public y2c createErrorPage(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y2c) ipChange.ipc$dispatch("9e30c76", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        Activity I = bbsVar.I();
        ckf.f(I, "instance.activity");
        return new TMSErrorPage(I);
    }

    @Override // com.taobao.themis.container.splash.ISplashViewFactory
    public a3c createErrorWidget(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3c) ipChange.ipc$dispatch("178ea087", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        Activity I = bbsVar.I();
        ckf.f(I, "instance.activity");
        return new gas(I);
    }

    @Override // com.taobao.themis.container.splash.ISplashViewFactory
    public qmc createLoadingPage(bbs bbsVar) {
        int i;
        qmc pubLoadingPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qmc) ipChange.ipc$dispatch("67d248aa", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        TMSSolutionType a0 = bbsVar.a0();
        if (a0 == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[a0.ordinal()];
        }
        if (i == 1) {
            Activity I = bbsVar.I();
            ckf.f(I, "instance.activity");
            pubLoadingPage = new PubLoadingPage(I);
        } else if (i != 2) {
            return null;
        } else {
            Activity I2 = bbsVar.I();
            ckf.f(I2, "instance.activity");
            pubLoadingPage = new PubGameLoadingPage(I2);
        }
        return pubLoadingPage;
    }

    @Override // com.taobao.themis.container.splash.ISplashViewFactory
    public y0e createTitleBar(bbs bbsVar) {
        int i;
        y0e pubLoadingTitleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0e) ipChange.ipc$dispatch("f793fd4a", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        TMSSolutionType a0 = bbsVar.a0();
        if (a0 == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[a0.ordinal()];
        }
        if (i == 1) {
            Activity I = bbsVar.I();
            ckf.f(I, "instance.activity");
            pubLoadingTitleBar = new PubLoadingTitleBar(I);
        } else if (i != 2) {
            return null;
        } else {
            Activity I2 = bbsVar.I();
            ckf.f(I2, "instance.activity");
            pubLoadingTitleBar = new PubGameLoadingTitleBar(I2);
        }
        return pubLoadingTitleBar;
    }
}
