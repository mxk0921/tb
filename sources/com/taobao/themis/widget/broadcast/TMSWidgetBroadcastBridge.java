package com.taobao.themis.widget.broadcast;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.i8s;
import tb.j8s;
import tb.sl2;
import tb.t2o;
import tb.tl2;
import tb.tsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J-\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ9\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/widget/broadcast/TMSWidgetBroadcastBridge;", "Ltb/j8s;", "<init>", "()V", "Ltb/xhv;", "onInitialized", "onFinalized", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "token", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "joinChannel", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "exitChannel", "Lcom/alibaba/fastjson/JSONObject;", "msg", "sendChannelMessage", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "Companion", "a", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWidgetBroadcastBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f13807a;
    public final CopyOnWriteArrayList<String> b = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(852492320);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements sl2.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ BridgeCallback c;
        public final /* synthetic */ JSONObject d;

        public b(String str, BridgeCallback bridgeCallback, JSONObject jSONObject) {
            this.b = str;
            this.c = bridgeCallback;
            this.d = jSONObject;
        }

        @Override // tb.sl2.a
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            this.d.put((JSONObject) "errorCode", (String) 14);
            this.d.put((JSONObject) "errorMessage", str);
            this.c.sendJSONResponse(this.d);
        }

        @Override // tb.sl2.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            TMSWidgetBroadcastBridge.access$getMJoinedTokens$p(TMSWidgetBroadcastBridge.this).remove(this.b);
            this.c.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements sl2.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // tb.sl2.a
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
            }
        }

        @Override // tb.sl2.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                TMSWidgetBroadcastBridge.access$getMJoinedTokens$p(TMSWidgetBroadcastBridge.this).add(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements tl2.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f13810a;

        public d(ITMSPage iTMSPage) {
            this.f13810a = iTMSPage;
        }

        @Override // tb.tl2.a
        public void a(ArrayList<BroadcastMsg> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc2e1b5b", new Object[]{this, arrayList});
            } else {
                this.f13810a.w("onChannelMessage", JSON.parseArray(JSON.toJSONString(arrayList)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements sl2.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13811a;
        public final /* synthetic */ JSONObject b;

        public e(BridgeCallback bridgeCallback, JSONObject jSONObject) {
            this.f13811a = bridgeCallback;
            this.b = jSONObject;
        }

        @Override // tb.sl2.a
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            this.b.put((JSONObject) "errorCode", (String) 14);
            this.b.put((JSONObject) "errorMessage", str);
            this.f13811a.sendJSONResponse(this.b);
        }

        @Override // tb.sl2.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                this.f13811a.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    static {
        t2o.a(852492319);
        t2o.a(839909427);
    }

    public static final /* synthetic */ CopyOnWriteArrayList access$getMJoinedTokens$p(TMSWidgetBroadcastBridge tMSWidgetBroadcastBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("2cbe4872", new Object[]{tMSWidgetBroadcastBridge});
        }
        return tMSWidgetBroadcastBridge.b;
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aa6e900", new Object[]{this, str})).booleanValue();
        }
        String a2 = i8s.a("canal_channel_ky", "canal_channel_iv", str);
        if (a2 != null && tsq.I(a2, "canal_channel", false, 2, null)) {
            return true;
        }
        return false;
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        } else if (this.f13807a != null) {
            for (String str : this.b) {
                sl2 a2 = sl2.Companion.a();
                ckf.f(str, AdvanceSetting.NETWORK_TYPE);
                String str2 = this.f13807a;
                ckf.d(str2);
                a2.c(str, str2, null);
            }
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @APIMethod
    public final void exitChannel(@BindingApiContext ApiContext apiContext, @BindingParam({"token"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3398bac9", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "token");
        ckf.g(bridgeCallback, "bridgeCallback");
        JSONObject jSONObject = new JSONObject();
        bbs b2 = apiContext.b();
        ITMSPage c2 = apiContext.c();
        if (b2 == null || !TMSInstanceExtKt.u(b2) || c2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        sl2 a2 = sl2.Companion.a();
        String Q = b2.Q();
        ckf.f(Q, "instance.instanceId");
        a2.c(str, Q, new b(str, bridgeCallback, jSONObject));
    }

    @APIMethod
    public final void sendChannelMessage(@BindingApiContext ApiContext apiContext, @BindingParam({"token"}) String str, @BindingParam({"msg"}) JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d617e86", new Object[]{this, apiContext, str, jSONObject, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "token");
        ckf.g(bridgeCallback, "bridgeCallback");
        JSONObject jSONObject2 = new JSONObject();
        bbs b2 = apiContext.b();
        ITMSPage c2 = apiContext.c();
        if (b2 == null || !TMSInstanceExtKt.u(b2) || c2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (jSONObject == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            BroadcastMsg broadcastMsg = new BroadcastMsg(str, jSONObject, System.currentTimeMillis());
            sl2 a2 = sl2.Companion.a();
            String Q = b2.Q();
            ckf.f(Q, "instance.instanceId");
            a2.f(Q, str, broadcastMsg, new e(bridgeCallback, jSONObject2));
        }
    }

    @APIMethod
    public final void joinChannel(@BindingApiContext ApiContext apiContext, @BindingParam({"token"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255819d5", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "token");
        ckf.g(bridgeCallback, "bridgeCallback");
        JSONObject jSONObject = new JSONObject();
        bbs b2 = apiContext.b();
        ITMSPage c2 = apiContext.c();
        if (b2 == null || !TMSInstanceExtKt.u(b2) || c2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        this.f13807a = b2.g;
        if (!a(str)) {
            jSONObject.put((JSONObject) "errorCode", (String) 12);
            jSONObject.put((JSONObject) "errorMessage", "token is invalid");
            bridgeCallback.sendJSONResponse(jSONObject);
        } else if (this.b.size() < 2 || this.b.contains(str)) {
            String Q = b2.Q();
            ckf.f(Q, "instance.instanceId");
            sl2.Companion.a().d(str, new tl2(Q, new d(c2)), new c(str));
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        } else {
            jSONObject.put((JSONObject) "errorCode", (String) 13);
            jSONObject.put((JSONObject) "errorMessage", "has reached the maximum number of channels");
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }
}
