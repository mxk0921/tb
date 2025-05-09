package com.taobao.themis.open.ability;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.extension.IJSRuntimeFactoryExtension;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import tb.bbs;
import tb.c7o;
import tb.ckf;
import tb.ekd;
import tb.j8s;
import tb.q9s;
import tb.t2o;
import tb.tsq;
import tb.wsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u0003¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/open/ability/EnginePluginBridge;", "Ltb/j8s;", "<init>", "()V", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "path", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "Ltb/xhv;", "requirePlugin", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "onInitialized", "onFinalized", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class EnginePluginBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(843055105);
        t2o.a(839909427);
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

    @ThreadType(ExecutorType.SYNC)
    @APIMethod
    public final void requirePlugin(@BindingApiContext ApiContext apiContext, @BindingParam(required = true, value = {"path"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e4476", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(str, "path");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (!q9s.Q()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        String str2 = null;
        bbs b = apiContext == null ? null : apiContext.b();
        if (b == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (wsq.a0(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(0, "Context Empty"));
        } else {
            TMSMetaInfoWrapper U = b.U();
            List<PluginModel> g = U == null ? null : U.g();
            if (g == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.newError(0, "PluginModel Empty"));
                return;
            }
            Iterator<T> it = g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (ckf.b(((PluginModel) obj).getPluginType(), "2")) {
                    break;
                }
            }
            PluginModel pluginModel = (PluginModel) obj;
            if (pluginModel == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.newError(0, "Engine Plugin not found"));
                return;
            }
            ekd ekdVar = (ekd) b.getExtension(ekd.class);
            if (ekdVar == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                return;
            }
            IJSRuntimeFactoryExtension iJSRuntimeFactoryExtension = (IJSRuntimeFactoryExtension) b.getExtension(IJSRuntimeFactoryExtension.class);
            if (iJSRuntimeFactoryExtension != null && iJSRuntimeFactoryExtension.q() == IJSRuntimeFactoryExtension.Type.Qking) {
                String E = tsq.E(str, ".js", ".v20.wlm", false, 4, null);
                String appId = pluginModel.getAppId();
                ckf.f(appId, "enginePlugin.appId");
                c7o n = ekdVar.n(appId, E);
                byte[] bytes = n == null ? null : n.getBytes();
                if (bytes != null) {
                    ITMSPage c = apiContext.c();
                    if (c != null) {
                        c.r(bytes, E);
                    }
                    bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                    return;
                }
            }
            String appId2 = pluginModel.getAppId();
            ckf.f(appId2, "enginePlugin.appId");
            c7o n2 = ekdVar.n(appId2, str);
            if (n2 != null) {
                str2 = n2.getString();
            }
            if (str2 == null || wsq.a0(str2)) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.newError(0, "Context Empty"));
                return;
            }
            ITMSPage c2 = apiContext.c();
            if (c2 != null) {
                c2.n(str2, str);
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }
}
