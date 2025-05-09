package android.taobao.windvane.extra.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.JSInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kpw;
import tb.nsw;
import tb.vpw;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $callToken;
    public final /* synthetic */ String $currentUrl;
    public final /* synthetic */ JSInterface.JSRoute $jsRoute;
    public final /* synthetic */ String $methodName;
    public final /* synthetic */ String $methodParam;
    public final /* synthetic */ String $nameSpace;
    public final /* synthetic */ CommonAsyncJSAPIBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1(CommonAsyncJSAPIBridge commonAsyncJSAPIBridge, String str, String str2, String str3, String str4, JSInterface.JSRoute jSRoute, String str5) {
        super(0);
        this.this$0 = commonAsyncJSAPIBridge;
        this.$nameSpace = str;
        this.$methodName = str2;
        this.$methodParam = str3;
        this.$callToken = str4;
        this.$jsRoute = jSRoute;
        this.$currentUrl = str5;
    }

    public static /* synthetic */ Object ipc$super(CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/jsbridge/CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1");
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
            ((kpw) jsObject).executeSafe(this.$methodName, this.$methodParam, new WVCallBackContext(this.this$0.getWebView()) { // from class: android.taobao.windvane.extra.jsbridge.CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    this.currentUrlFromAsyncChannel = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$currentUrl;
                    this.wvMegaBridgeContext = new WVMegaBridgeContext(vpw.commonConfig.C2, CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.$callToken, CommonAsyncJSAPIBridge.access$getParentId$p(CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this.this$0));
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/jsbridge/CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1$1");
                }

                @Override // android.taobao.windvane.jsbridge.WVCallBackContext
                public void error() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1392128f", new Object[]{this});
                        return;
                    }
                    CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this;
                    CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this$0;
                    String str = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$callToken;
                    JSInterface.JSRoute jSRoute = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$jsRoute;
                    ckf.f(jSRoute, "jsRoute");
                    CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str, jSRoute, false, null, false, 24, null);
                }

                @Override // android.taobao.windvane.jsbridge.WVCallBackContext
                public void onFailure(nsw nswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4c5c5b7a", new Object[]{this, nswVar});
                    } else {
                        error(nswVar);
                    }
                }

                @Override // android.taobao.windvane.jsbridge.WVCallBackContext
                public void onSuccess(nsw nswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43640fe1", new Object[]{this, nswVar});
                    } else {
                        success(nswVar);
                    }
                }

                @Override // android.taobao.windvane.jsbridge.WVCallBackContext
                public void success() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4550b0a", new Object[]{this});
                        return;
                    }
                    CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this;
                    CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this$0;
                    String str = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$callToken;
                    JSInterface.JSRoute jSRoute = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$jsRoute;
                    ckf.f(jSRoute, "jsRoute");
                    CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str, jSRoute, false, nsw.RET_SUCCESS.m(), false, 20, null);
                }

                @Override // android.taobao.windvane.jsbridge.WVCallBackContext
                public void error(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("72e35699", new Object[]{this, str});
                        return;
                    }
                    CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this;
                    CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this$0;
                    String str2 = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$callToken;
                    JSInterface.JSRoute jSRoute = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$jsRoute;
                    ckf.f(jSRoute, "jsRoute");
                    CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str2, jSRoute, false, new nsw(str).m(), false, 16, null);
                }

                @Override // android.taobao.windvane.jsbridge.WVCallBackContext
                public void error(nsw nswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5660aa7d", new Object[]{this, nswVar});
                        return;
                    }
                    if (nswVar != null) {
                        nswVar.j("HY_FAILED");
                    }
                    CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this;
                    CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this$0;
                    String str = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$callToken;
                    JSInterface.JSRoute jSRoute = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$jsRoute;
                    ckf.f(jSRoute, "jsRoute");
                    CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str, jSRoute, false, nswVar != null ? nswVar.m() : null, false, 16, null);
                }

                @Override // android.taobao.windvane.jsbridge.WVCallBackContext
                public void error(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
                        return;
                    }
                    nsw nswVar = new nsw("HY_FAILED");
                    nswVar.b(str, str2);
                    CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this;
                    CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this$0;
                    String str3 = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$callToken;
                    JSInterface.JSRoute jSRoute = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$jsRoute;
                    ckf.f(jSRoute, "jsRoute");
                    CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str3, jSRoute, false, nswVar.m(), false, 16, null);
                }

                @Override // android.taobao.windvane.jsbridge.WVCallBackContext
                public void success(nsw nswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e095322", new Object[]{this, nswVar});
                        return;
                    }
                    if (nswVar != null) {
                        nswVar.j("HY_SUCCESS");
                    }
                    CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this;
                    CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this$0;
                    String str = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$callToken;
                    JSInterface.JSRoute jSRoute = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$jsRoute;
                    ckf.f(jSRoute, "jsRoute");
                    CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str, jSRoute, false, nswVar != null ? nswVar.m() : null, nswVar != null ? nswVar.f() : false, 4, null);
                }

                @Override // android.taobao.windvane.jsbridge.WVCallBackContext
                public void success(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6b54654", new Object[]{this, str});
                        return;
                    }
                    CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 = CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this;
                    CommonAsyncJSAPIBridge commonAsyncJSAPIBridge = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.this$0;
                    String str2 = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$callToken;
                    JSInterface.JSRoute jSRoute = commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1.$jsRoute;
                    ckf.f(jSRoute, "jsRoute");
                    CommonAsyncJSAPIBridge.sendJSResult$default(commonAsyncJSAPIBridge, str2, jSRoute, false, str, false, 20, null);
                }
            });
        }
    }
}
