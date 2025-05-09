package com.taobao.themis.open.permission.auth;

import android.app.Activity;
import android.graphics.Color;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.permission.auth.TMSAuthHelper;
import com.taobao.themis.open.permission.sendmtop.SendMtopParams;
import com.taobao.themis.open.permission.sendmtop.SendMtopResponse;
import com.taobao.themis.open.permission.sendmtop.SendMtopUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import tb.arf;
import tb.bbs;
import tb.ckf;
import tb.j8s;
import tb.jpu;
import tb.ov2;
import tb.r8s;
import tb.rwd;
import tb.t2o;
import tb.t8s;
import tb.uj3;
import tb.why;
import tb.yj1;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003Ja\u0010\u0012\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JU\u0010\u0016\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JU\u0010\u0018\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J/\u0010\u001b\u001a\u00020\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u00192\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u00192\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/taobao/themis/open/permission/auth/TMSAuthBridge;", "Ltb/j8s;", "<init>", "()V", "Ltb/xhv;", "onInitialized", "onFinalized", "", "scopeNicks", "isvAppId", ov2.ALIPAY_ACCOUNT_SITE, ParamsConstants.Key.PARAM_SCENE_CODE, "Lcom/alibaba/fastjson/JSONObject;", "extInfo", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "getAuthorize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "getAuthUserInfo", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "getBusinessAuth", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "getComponentAuth", "", "withSubscriptions", "getSetting", "(ZLcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "openSetting", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSAuthBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements TMSAuthHelper.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13654a;

        public a(BridgeCallback bridgeCallback) {
            this.f13654a = bridgeCallback;
        }

        @Override // com.taobao.themis.open.permission.auth.TMSAuthHelper.a
        public void a(boolean z, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6002e1c7", new Object[]{this, new Boolean(z), jSONObject});
                return;
            }
            ckf.g(jSONObject, "result");
            this.f13654a.sendJSONResponse(jSONObject);
        }
    }

    static {
        t2o.a(843055319);
        t2o.a(839909427);
    }

    public final void a(String str, String str2, String str3, String str4, String str5, ApiContext apiContext, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        bbs bbsVar;
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9923712b", new Object[]{this, str, str2, str3, str4, str5, apiContext, jSONObject, bridgeCallback});
            return;
        }
        Activity activity = null;
        if (apiContext == null) {
            bbsVar = null;
        } else {
            bbsVar = apiContext.b();
        }
        if (bbsVar != null) {
            bbs b2 = apiContext.b();
            if (b2 != null) {
                activity = b2.I();
            }
            if (activity != null) {
                bbs b3 = apiContext.b();
                ckf.d(b3);
                if (!TMSInstanceExtKt.b(b3)) {
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(4, "Authorization cannot be initiated before interaction"));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                List h = arf.h(str2, String.class);
                if (h == null) {
                    list = yz3.i();
                } else {
                    list = h;
                }
                arrayList.addAll(list);
                yj1 yj1Var = new yj1();
                yj1Var.f(str4);
                yj1Var.j(str5);
                yj1Var.g(str);
                yj1Var.i(str3);
                yj1Var.h(jSONObject);
                yj1Var.k(arrayList);
                Activity I = b3.I();
                ckf.f(I, "instance.activity");
                new TMSAuthHelper(I, yj1Var, b3, apiContext.c(), new a(bridgeCallback)).k();
                return;
            }
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void getAuthorize(@BindingParam({"scopeNicks"}) String str, @BindingParam({"isvAppId"}) String str2, @BindingParam({"accountSite"}) String str3, @BindingParam({"sceneCode"}) String str4, @BindingParam({"extInfo"}) JSONObject jSONObject, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf08d11", new Object[]{this, str, str2, str3, str4, jSONObject, apiContext, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        a("getAuthorize", str, str2, str3, str4, apiContext, jSONObject, bridgeCallback);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void getBusinessAuth(@BindingParam({"scopeNicks"}) String str, @BindingParam({"isvAppId"}) String str2, @BindingParam({"accountSite"}) String str3, @BindingParam({"extInfo"}) JSONObject jSONObject, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf80212", new Object[]{this, str, str2, str3, jSONObject, apiContext, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        a("getBusinessAuth", str, str2, str3, null, apiContext, jSONObject, bridgeCallback);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void getComponentAuth(@BindingParam({"scopeNicks"}) String str, @BindingParam({"isvAppId"}) String str2, @BindingParam({"accountSite"}) String str3, @BindingParam({"extInfo"}) JSONObject jSONObject, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34783923", new Object[]{this, str, str2, str3, jSONObject, apiContext, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        a("getComponentAuth", str, str2, str3, null, apiContext, jSONObject, bridgeCallback);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void getSetting(@BindingParam({"withSubscriptions"}) boolean z, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        bbs bbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da66b2c", new Object[]{this, new Boolean(z), apiContext, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        if (apiContext == null) {
            bbsVar = null;
        } else {
            bbsVar = apiContext.b();
        }
        if (bbsVar == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        bbs b2 = apiContext.b();
        ckf.d(b2);
        AuthUtils authUtils = AuthUtils.INSTANCE;
        String j = r8s.j(b2);
        String L = b2.L();
        ckf.f(L, "instance.appId");
        bridgeCallback.sendJSONResponse(authUtils.j(b2, j, L, z));
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public final void openSetting(@BindingParam({"withSubscriptions"}) boolean z, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        bbs bbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6b98b8", new Object[]{this, new Boolean(z), apiContext, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        if (apiContext == null) {
            bbsVar = null;
        } else {
            bbsVar = apiContext.b();
        }
        if (bbsVar == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        rwd V = bbsVar.V();
        ckf.f(V, "instance.pageFactory");
        String b2 = t8s.b();
        ckf.f(b2, "getAuthUrl()");
        bbsVar.W().a(rwd.a.a(V, b2, new Window(null, null, null, null, Integer.valueOf(Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR)), Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, 131023, null), null, null, 8, null));
        getSetting(z, apiContext, bridgeCallback);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void getAuthUserInfo(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da776781", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        SendMtopParams sendMtopParams = new SendMtopParams();
        sendMtopParams.setApi("mtop.taobao.openlink.fusionapp.user.get");
        sendMtopParams.setV("1.0");
        sendMtopParams.setNeedLogin(true);
        sendMtopParams.setAddISVHeader(AuthUtils.INSTANCE.q(b2, "", sendMtopParams.getApi()));
        sendMtopParams.setHeaders(SendMtopUtils.d(b2));
        bbs b3 = apiContext.b();
        ckf.d(b3);
        SendMtopUtils.l(b3, sendMtopParams, new b(bridgeCallback));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements SendMtopUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13655a;

        public b(BridgeCallback bridgeCallback) {
            this.f13655a = bridgeCallback;
        }

        @Override // com.taobao.themis.open.permission.sendmtop.SendMtopUtils.a
        public void a(SendMtopResponse sendMtopResponse) {
            String str;
            String errorMsg;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53ed6a7f", new Object[]{this, sendMtopResponse});
            } else if (sendMtopResponse == null || !sendMtopResponse.getSuccess() || sendMtopResponse.getData() == null) {
                BridgeCallback bridgeCallback = this.f13655a;
                Pair a2 = jpu.a("success", Boolean.FALSE);
                Pair a3 = jpu.a("error", -1);
                String str2 = "invalid parameter!";
                if (sendMtopResponse == null || (str = sendMtopResponse.getErrorCode()) == null) {
                    str = str2;
                }
                Pair a4 = jpu.a("errorCode", str);
                if (!(sendMtopResponse == null || (errorMsg = sendMtopResponse.getErrorMsg()) == null)) {
                    str2 = errorMsg;
                }
                bridgeCallback.sendJSONResponse(arf.b(a2, a3, a4, jpu.a("errorMessage", str2)));
            } else {
                byte[] data = sendMtopResponse.getData();
                ckf.d(data);
                JSONObject i = arf.i(new String(data, uj3.UTF_8));
                this.f13655a.sendJSONResponse(i == null ? null : i.getJSONObject("data"));
            }
        }
    }
}
