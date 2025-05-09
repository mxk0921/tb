package com.taobao.themis.web.runtime;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.pcp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWebViewClient$detectAndNotifyServerError$1$onError$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ pcp $serverError;
    public final /* synthetic */ WebView $webview;
    public final /* synthetic */ TMSWebViewClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWebViewClient$detectAndNotifyServerError$1$onError$1(TMSWebViewClient tMSWebViewClient, WebView webView, pcp pcpVar) {
        super(0);
        this.this$0 = tMSWebViewClient;
        this.$webview = webView;
        this.$serverError = pcpVar;
    }

    public static /* synthetic */ Object ipc$super(TMSWebViewClient$detectAndNotifyServerError$1$onError$1 tMSWebViewClient$detectAndNotifyServerError$1$onError$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/runtime/TMSWebViewClient$detectAndNotifyServerError$1$onError$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            TMSWebViewClient.a(this.this$0, this.$webview, this.$serverError);
        }
    }
}
