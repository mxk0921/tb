package com.taobao.themis.taobao.impl;

import android.app.Activity;
import android.taobao.windvane.extra.jsbridge.WVApplication;
import android.taobao.windvane.jsbridge.WVH5PP;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.jsbridge.ScancodeCallback;
import com.taobao.browser.jsbridge.TBWVDialog;
import com.taobao.browser.jsbridge.TBWVSecurity;
import com.taobao.browser.jsbridge.TBWeakNetStatus;
import com.taobao.browser.jsbridge.WVCameraPlus;
import com.taobao.browser.jsbridge.WVClient;
import com.taobao.browser.jsbridge.WVLocationProxy;
import com.taobao.browser.jsbridge.WVTBLocation;
import com.taobao.browser.jsbridge.WVUICityList;
import com.taobao.browser.jsbridge.WVUIImagepreview;
import com.taobao.browser.jsbridge.WebAppInterface;
import com.taobao.themis.inside.adapter.DefaultWebAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.dpw;
import tb.ed7;
import tb.fsw;
import tb.fu;
import tb.ic1;
import tb.kab;
import tb.njg;
import tb.rbe;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/taobao/impl/TBWebAdapter;", "Lcom/taobao/themis/inside/adapter/DefaultWebAdapter;", "<init>", "()V", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "", "url", "", "shouldOverrideUrlLoading", "(Lcom/taobao/themis/kernel/page/ITMSPage;Ljava/lang/String;)Z", "Ltb/xhv;", "registerPlugins", "Companion", "a", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TBWebAdapter extends DefaultWebAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final njg c = kotlin.a.b(TBWebAdapter$bizInterceptorConfig$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(847249483);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(847249482);
    }

    public static /* synthetic */ Object ipc$super(TBWebAdapter tBWebAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/impl/TBWebAdapter");
    }

    public final boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeeb9c16", new Object[]{this, str, str2})).booleanValue();
        }
        String[] strArr = d().get(str);
        if (strArr != null && ic1.B(strArr, str2)) {
            return true;
        }
        return false;
    }

    public final Map<String, String[]> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30da4566", new Object[]{this});
        }
        return (Map) this.c.getValue();
    }

    @Override // com.taobao.themis.inside.adapter.DefaultWebAdapter
    public boolean shouldOverrideUrlLoading(ITMSPage iTMSPage, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6edbe04c", new Object[]{this, iTMSPage, str})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        ckf.g(str, "url");
        kab kabVar = (kab) iTMSPage.getExtension(kab.class);
        if (kabVar != null) {
            kabVar.H();
        }
        rbe rbeVar = (rbe) iTMSPage.getExtension(rbe.class);
        fu F0 = rbeVar == null ? null : rbeVar.F0();
        Activity I = iTMSPage.getInstance().I();
        ckf.f(I, "page.getInstance().activity");
        if (F0 == null || !c(F0.b(), str) || !((ed7.b.RunnableC0913b.C0914b) F0).a(I, str)) {
            return getGlobalUrlInterceptor().a(I, str);
        }
        return true;
    }

    @Override // com.taobao.themis.inside.adapter.DefaultWebAdapter, com.taobao.themis.web.runtime.IWebAdapter
    public void registerPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3583184", new Object[]{this});
        } else if (this.b.compareAndSet(false, true)) {
            dpw.a();
            fsw.h("WVApplication", WVApplication.class);
            fsw.i("WVLocation", WVLocationProxy.class, true);
            fsw.i("WVClient", WVClient.class, true);
            fsw.i("TBWVDialog", TBWVDialog.class, true);
            fsw.i("TBWVSecurity", TBWVSecurity.class, true);
            fsw.i("Scancode", ScancodeCallback.class, true);
            fsw.i("TBWeakNetStatus", TBWeakNetStatus.class, true);
            fsw.i("WebAppInterface", WebAppInterface.class, true);
            fsw.i("WVCameraPlus", WVCameraPlus.class, true);
            fsw.f("WVCamera", "takePhotoPlus", "WVCameraPlus", "takePhotoPlus");
            fsw.i("WVTBLocation", WVTBLocation.class, true);
            fsw.i("WVUICityList", WVUICityList.class, true);
            fsw.i("WVUIImagepreview", WVUIImagepreview.class, true);
            fsw.h("WVPerformance", WVH5PP.class);
        }
    }
}
