package com.taobao.themis.container.splash;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.qmc;
import tb.r8s;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TinyAppSplashView$updateLoadingInfo$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TinyAppSplashView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TinyAppSplashView$updateLoadingInfo$1(TinyAppSplashView tinyAppSplashView) {
        super(0);
        this.this$0 = tinyAppSplashView;
    }

    public static /* synthetic */ Object ipc$super(TinyAppSplashView$updateLoadingInfo$1 tinyAppSplashView$updateLoadingInfo$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/splash/TinyAppSplashView$updateLoadingInfo$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (TinyAppSplashView.e(this.this$0).compareTo(ISplashView.Status.LOADING) <= 0) {
            TinyAppSplashView.d(this.this$0).setVisibility(0);
            View findViewById = TinyAppSplashView.d(this.this$0).findViewById(R.id.tms_loading_view);
            qmc qmcVar = findViewById instanceof qmc ? (qmc) findViewById : null;
            if (qmcVar != null) {
                TinyAppSplashView tinyAppSplashView = this.this$0;
                String f = r8s.f(TinyAppSplashView.c(tinyAppSplashView));
                String str = "";
                if (f == null) {
                    f = str;
                }
                qmcVar.setAppName(f);
                String e = r8s.e(TinyAppSplashView.c(tinyAppSplashView));
                if (e == null) {
                    e = str;
                }
                qmcVar.setLogo(e);
                String l = r8s.l(TinyAppSplashView.c(tinyAppSplashView));
                if (l != null) {
                    str = l;
                }
                qmcVar.setDeveloper(str);
            }
        }
    }
}
