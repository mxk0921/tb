package com.taobao.themis.open.ability;

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
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.fmi;
import tb.j8s;
import tb.mmi;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\u000b2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u000b2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0003¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/open/ability/TMSBroadCastBridge;", "Ltb/j8s;", "<init>", "()V", "", "instanceId", "name", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "Ltb/xhv;", "tbBroadcastCreateChannel", "(Ljava/lang/String;Ljava/lang/String;Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "message", "tbBroadcastPostMessage", "(Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "tbBroadcastClose", "(Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "onInitialized", "onFinalized", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSBroadCastBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, mmi> f13605a = new HashMap();
    public final String b = "TMSBroadCastBridge";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f13606a;
        public final /* synthetic */ String b;

        public a(ITMSPage iTMSPage, String str) {
            this.f13606a = iTMSPage;
            this.b = str;
        }

        @Override // tb.fmi
        public final void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "data", (String) obj);
            ITMSPage iTMSPage = this.f13606a;
            if (iTMSPage != null) {
                iTMSPage.y(ckf.p("tbBroadcastOnMessage_", this.b), jSONObject);
            }
        }
    }

    static {
        t2o.a(843055107);
        t2o.a(839909427);
    }

    public final void a(String str, ITMSPage iTMSPage) {
        mmi mmiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82c8a92", new Object[]{this, str, iTMSPage});
            return;
        }
        Map<String, mmi> map = this.f13605a;
        if (map != null && (mmiVar = (mmi) ((HashMap) map).get(str)) != null) {
            mmiVar.e(new a(iTMSPage, str));
        }
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
            return;
        }
        Map<String, mmi> map = this.f13605a;
        if (map != null) {
            map.clear();
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
    public final void tbBroadcastClose(@BindingParam(name = {"instanceId"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b9a3e6", new Object[]{this, str, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        mmi remove = this.f13605a.remove(str);
        if (remove != null) {
            remove.a();
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public final void tbBroadcastCreateChannel(@BindingParam(name = {"instanceId"}) String str, @BindingParam(name = {"name"}) String str2, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc32cb0", new Object[]{this, str, str2, apiContext, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-1, "channel args error"));
            return;
        }
        bbs b = apiContext.b();
        ITMSPage c = apiContext.c();
        if (b == null || c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b(this.b, "access failed! instance is null");
            return;
        }
        synchronized (this) {
            try {
                if (this.f13605a == null) {
                    this.f13605a = new HashMap();
                }
                if (((HashMap) this.f13605a).get(str) != null) {
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-1, "channel error token has been used"));
                    return;
                }
                ((HashMap) this.f13605a).put(str, new mmi(b.I(), str2, null));
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                a(str, c);
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public final void tbBroadcastPostMessage(@BindingParam(name = {"instanceId"}) String str, @BindingParam(name = {"message"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fb17ed", new Object[]{this, str, str2, bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-1, "channel args error"));
            return;
        }
        Map<String, mmi> map = this.f13605a;
        if (map == null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-1, "message queue is null"));
            return;
        }
        mmi mmiVar = map.get(str);
        if (mmiVar == null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-1, "channel token not exist"));
            return;
        }
        mmiVar.d(str2);
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
    }
}
