package com.alibaba.triver.triver_shop.web;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.JSInterface;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kpw;
import tb.nsw;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AsyncJSAPIBridge$invokeNativeMethod$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $callToken;
    public final /* synthetic */ JSInterface.JSRoute $jsRoute;
    public final /* synthetic */ String $methodName;
    public final /* synthetic */ String $methodParam;
    public final /* synthetic */ String $nameSpace;
    public final /* synthetic */ AsyncJSAPIBridge this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends WVCallBackContext {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AsyncJSAPIBridge f3359a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSInterface.JSRoute c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AsyncJSAPIBridge asyncJSAPIBridge, String str, JSInterface.JSRoute jSRoute, ShopBaseWebView shopBaseWebView) {
            super(shopBaseWebView);
            this.f3359a = asyncJSAPIBridge;
            this.b = str;
            this.c = jSRoute;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/web/AsyncJSAPIBridge$invokeNativeMethod$1$1");
        }

        @Override // android.taobao.windvane.jsbridge.WVCallBackContext
        public void error() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1392128f", new Object[]{this});
                return;
            }
            AsyncJSAPIBridge asyncJSAPIBridge = this.f3359a;
            String str = this.b;
            JSInterface.JSRoute jSRoute = this.c;
            ckf.f(jSRoute, "jsRoute");
            AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str, jSRoute, false, null, null, null, 56, null);
        }

        @Override // android.taobao.windvane.jsbridge.WVCallBackContext
        public void success() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4550b0a", new Object[]{this});
                return;
            }
            AsyncJSAPIBridge asyncJSAPIBridge = this.f3359a;
            String str = this.b;
            JSInterface.JSRoute jSRoute = this.c;
            ckf.f(jSRoute, "jsRoute");
            AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str, jSRoute, false, null, null, null, 60, null);
        }

        @Override // android.taobao.windvane.jsbridge.WVCallBackContext
        public void error(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
                return;
            }
            AsyncJSAPIBridge asyncJSAPIBridge = this.f3359a;
            String str2 = this.b;
            JSInterface.JSRoute jSRoute = this.c;
            ckf.f(jSRoute, "jsRoute");
            AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str2, jSRoute, false, null, null, str, 24, null);
        }

        @Override // android.taobao.windvane.jsbridge.WVCallBackContext
        public void error(nsw nswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5660aa7d", new Object[]{this, nswVar});
                return;
            }
            AsyncJSAPIBridge asyncJSAPIBridge = this.f3359a;
            String str = this.b;
            JSInterface.JSRoute jSRoute = this.c;
            ckf.f(jSRoute, "jsRoute");
            AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str, jSRoute, false, null, null, nswVar == null ? null : nswVar.m(), 24, null);
        }

        @Override // android.taobao.windvane.jsbridge.WVCallBackContext
        public void error(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
                return;
            }
            AsyncJSAPIBridge asyncJSAPIBridge = this.f3359a;
            String str3 = this.b;
            JSInterface.JSRoute jSRoute = this.c;
            ckf.f(jSRoute, "jsRoute");
            AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str3, jSRoute, false, null, str, str2, 8, null);
        }

        @Override // android.taobao.windvane.jsbridge.WVCallBackContext
        public void success(nsw nswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e095322", new Object[]{this, nswVar});
                return;
            }
            AsyncJSAPIBridge asyncJSAPIBridge = this.f3359a;
            String str = this.b;
            JSInterface.JSRoute jSRoute = this.c;
            ckf.f(jSRoute, "jsRoute");
            AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str, jSRoute, false, nswVar == null ? null : nswVar.m(), null, null, 52, null);
        }

        @Override // android.taobao.windvane.jsbridge.WVCallBackContext
        public void success(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
                return;
            }
            AsyncJSAPIBridge asyncJSAPIBridge = this.f3359a;
            String str2 = this.b;
            JSInterface.JSRoute jSRoute = this.c;
            ckf.f(jSRoute, "jsRoute");
            AsyncJSAPIBridge.sendJSResult$default(asyncJSAPIBridge, str2, jSRoute, false, str, null, null, 52, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncJSAPIBridge$invokeNativeMethod$1(AsyncJSAPIBridge asyncJSAPIBridge, String str, String str2, String str3, String str4, JSInterface.JSRoute jSRoute) {
        super(0);
        this.this$0 = asyncJSAPIBridge;
        this.$nameSpace = str;
        this.$methodName = str2;
        this.$methodParam = str3;
        this.$callToken = str4;
        this.$jsRoute = jSRoute;
    }

    public static /* synthetic */ Object ipc$super(AsyncJSAPIBridge$invokeNativeMethod$1 asyncJSAPIBridge$invokeNativeMethod$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/web/AsyncJSAPIBridge$invokeNativeMethod$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        Object jsObject = this.this$0.getWebView().getJsObject(this.$nameSpace);
        if (jsObject instanceof kpw) {
            ((kpw) jsObject).executeSafe(this.$methodName, this.$methodParam, new a(this.this$0, this.$callToken, this.$jsRoute, this.this$0.getWebView()));
        }
    }
}
