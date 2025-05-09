package com.taobao.themis.open.ability;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.ariver.resource.api.models.TemplateExtModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.permission.check.PermissionResult;
import com.taobao.themis.open.permission.check.TMSPermissionManager;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.j8s;
import tb.olb;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u000b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/open/ability/TMSCommonBridge;", "Ltb/j8s;", "<init>", "()V", "Ltb/xhv;", "onInitialized", "onFinalized", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "apiName", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "checkJSPermission", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "getExtConfig", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "callback", "requestRenderLayout", "(Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;Lcom/taobao/themis/kernel/ability/base/ApiContext;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSCommonBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(843055109);
        t2o.a(839909427);
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse checkJSPermission(@BindingApiContext ApiContext apiContext, @BindingParam({"checkJSName"}) String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("8ba23abe", new Object[]{this, apiContext, str});
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "apiName");
        TMSPermissionManager tMSPermissionManager = TMSPermissionManager.INSTANCE;
        if (!tMSPermissionManager.e(apiContext.b(), str, new JSONObject())) {
            BridgeResponse bridgeResponse = BridgeResponse.SUCCESS;
            ckf.f(bridgeResponse, "SUCCESS");
            return bridgeResponse;
        }
        PermissionResult b = tMSPermissionManager.b(str, new JSONObject(), apiContext);
        if (b != PermissionResult.IGNORE && b != PermissionResult.ALLOW) {
            return new BridgeResponse.Error(4, BridgeResponse.ERROR_MSG_FORBIDDEN_ERROR, b.getSignature());
        }
        BridgeResponse bridgeResponse2 = BridgeResponse.SUCCESS;
        ckf.f(bridgeResponse2, "{\n            BridgeResponse.SUCCESS\n        }");
        return bridgeResponse2;
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse getExtConfig(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("415c2c01", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        bbs b = apiContext.b();
        TMSMetaInfoWrapper U = b == null ? null : b.U();
        if (U == null) {
            BridgeResponse.Error newError = BridgeResponse.newError(20, "appModel is null");
            ckf.f(newError, "newError(\n            20…pModel is null\"\n        )");
            return newError;
        }
        TemplateConfigModel y = U.y();
        if (y == null || !y.isTemplateValid() || y.getExtModel() == null) {
            BridgeResponse.Error newError2 = BridgeResponse.newError(20, "templateConfigModel is null");
            ckf.f(newError2, "newError(20, \"templateConfigModel is null\")");
            return newError2;
        }
        TemplateExtModel extModel = y.getExtModel();
        ckf.d(extModel);
        if (!extModel.isExtEnable()) {
            return new BridgeResponse.Error(21, "templateConfig disabled");
        }
        JSONObject jSONObject = new JSONObject();
        TemplateExtModel extModel2 = y.getExtModel();
        ckf.d(extModel2);
        jSONObject.put((JSONObject) "data", (String) extModel2.getExtObj());
        return new BridgeResponse(jSONObject);
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

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse requestRenderLayout(@BindingCallback BridgeCallback bridgeCallback, @BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("552e42d3", new Object[]{this, bridgeCallback, apiContext});
        }
        if (apiContext == null || apiContext.a() == null || apiContext.c() == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        ITMSPage c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        olb olbVar = (olb) c.getExtension(olb.class);
        if (olbVar == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse3, "FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        olbVar.requestLayout();
        BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
        ckf.f(bridgeResponse4, "SUCCESS");
        return bridgeResponse4;
    }
}
