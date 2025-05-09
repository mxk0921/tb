package com.taobao.themis.open.ability;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import kotlin.Metadata;
import tb.a07;
import tb.bbs;
import tb.c8;
import tb.ckf;
import tb.h9;
import tb.j8s;
import tb.jht;
import tb.n8;
import tb.n9;
import tb.nbf;
import tb.q9s;
import tb.s2d;
import tb.t2o;
import tb.u8;
import tb.xds;
import tb.xhv;
import tb.y7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0015\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0003¨\u0006\u001b"}, d2 = {"Lcom/taobao/themis/open/ability/TMSMegaBridge;", "Ltb/j8s;", "<init>", "()V", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "megaAbilityName", "megaApiName", "bindingID", "Lcom/alibaba/fastjson/JSONObject;", "megaParams", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "Ltb/xhv;", "abilityHub", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "url", "", "tapEnable", "appxParams", "openLightPage", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;ZLcom/alibaba/fastjson/JSONObject;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "onInitialized", "onFinalized", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSMegaBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public AbilityHubAdapter f13607a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055111);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13608a;

        public b(BridgeCallback bridgeCallback) {
            this.f13608a = bridgeCallback;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            if (executeResult.getStatusCode() == 0) {
                if (q9s.g1()) {
                    this.f13608a.sendJSONResponse(new JSONObject(executeResult.toFormattedData()), true);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "result", (String) executeResult.toFormattedData());
                this.f13608a.sendJSONResponse(jSONObject, true);
            } else if (executeResult.getStatusCode() == 1) {
                if (executeResult.getType() != "result" || executeResult.getData() != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put((JSONObject) "result", (String) executeResult.toFormattedData());
                    this.f13608a.sendJSONResponse(jSONObject2, true);
                }
            } else if (executeResult.getStatusCode() != 99 && executeResult.getStatusCode() > 100) {
                this.f13608a.sendBridgeResponse(new BridgeResponse.Error(-1, JSON.toJSONString(executeResult.toFormattedData())));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13609a;

        public c(BridgeCallback bridgeCallback) {
            this.f13609a = bridgeCallback;
        }

        @Override // tb.u8
        public final void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            } else {
                this.f13609a.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    static {
        t2o.a(843055110);
        t2o.a(839909427);
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
            return;
        }
        AbilityHubAdapter abilityHubAdapter = this.f13607a;
        if (abilityHubAdapter != null) {
            abilityHubAdapter.n();
        }
        this.f13607a = null;
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void openLightPage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"url"}) String str, @BindingParam(booleanDefault = true, name = {"tapEnable"}) boolean z, @BindingParam(name = {"params"}) JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        Double d;
        Double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ca6297", new Object[]{this, apiContext, str, new Boolean(z), jSONObject, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "url");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (apiContext.a() == null || TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10, "params error"));
            return;
        }
        if (q9s.k1()) {
            Uri parse = Uri.parse(str);
            if (apiContext.b() != null) {
                ckf.d(parse);
                bbs b2 = apiContext.b();
                ckf.d(b2);
                parse = xds.a(parse, b2);
            }
            str = parse.toString();
            ckf.f(str, "uri.toString()");
        }
        n9 n9Var = new n9();
        n9Var.i(apiContext.a());
        n9Var.m(apiContext.a().getWindow().getDecorView());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "type", jht.actionShowWindVanePop);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "url", str);
        bbs b3 = apiContext.b();
        jSONObject3.put((JSONObject) "popId", b3 == null ? null : b3.L());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "animation", nbf.STDPOP_ANIMATION_BOTTOM);
        jSONObject4.put((JSONObject) "tapEnable", (String) Boolean.valueOf(z));
        jSONObject4.put((JSONObject) "pushType", "outterJump");
        double d3 = 0.6d;
        jSONObject4.put((JSONObject) "originHeight", (String) Double.valueOf((jSONObject == null || (d2 = jSONObject.getDouble("pageHeight")) == null) ? 0.6d : d2.doubleValue()));
        if (!(jSONObject == null || (d = jSONObject.getDouble("pageHeight")) == null)) {
            d3 = d.doubleValue();
        }
        jSONObject4.put((JSONObject) "maxHeight", (String) Double.valueOf(d3));
        xhv xhvVar = xhv.INSTANCE;
        jSONObject3.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject4);
        jSONObject2.put((JSONObject) "params", (String) jSONObject3);
        new y7().b(new n8(jSONObject2), n9Var, new c(bridgeCallback));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127  */
    @com.taobao.themis.kernel.ability.base.annotation.ThreadType(com.taobao.themis.kernel.executor.ExecutorType.NORMAL)
    @com.taobao.themis.kernel.ability.base.annotation.APIMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void abilityHub(@com.taobao.themis.kernel.ability.base.annotation.BindingApiContext com.taobao.themis.kernel.ability.base.ApiContext r16, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"megaAbilityName"}) java.lang.String r17, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"megaApiName"}) java.lang.String r18, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"bindingID"}) java.lang.String r19, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"megaParams"}) com.alibaba.fastjson.JSONObject r20, @com.taobao.themis.kernel.ability.base.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r21) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.TMSMegaBridge.abilityHub(com.taobao.themis.kernel.ability.base.ApiContext, java.lang.String, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }
}
