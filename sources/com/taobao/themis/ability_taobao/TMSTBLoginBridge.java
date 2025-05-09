package com.taobao.themis.ability_taobao;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.ability.taobao.impl.TMSTBLoginAbility;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import tb.j8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSTBLoginBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements TMSTBLoginAbility.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13461a;

        public a(TMSTBLoginBridge tMSTBLoginBridge, BridgeCallback bridgeCallback) {
            this.f13461a = bridgeCallback;
        }

        @Override // com.taobao.themis.ability.taobao.impl.TMSTBLoginAbility.b
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8e3a222", new Object[]{this, jSONObject});
                return;
            }
            BridgeCallback bridgeCallback = this.f13461a;
            if (bridgeCallback != null) {
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }

        @Override // com.taobao.themis.ability.taobao.impl.TMSTBLoginAbility.b
        public void onFailed(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
            } else {
                this.f13461a.sendBridgeResponse(BridgeResponse.newError(i, str));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements TMSTBLoginAbility.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13462a;

        public b(TMSTBLoginBridge tMSTBLoginBridge, BridgeCallback bridgeCallback) {
            this.f13462a = bridgeCallback;
        }

        @Override // com.taobao.themis.ability.taobao.impl.TMSTBLoginAbility.b
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8e3a222", new Object[]{this, jSONObject});
                return;
            }
            BridgeCallback bridgeCallback = this.f13462a;
            if (bridgeCallback != null) {
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }

        @Override // com.taobao.themis.ability.taobao.impl.TMSTBLoginAbility.b
        public void onFailed(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
            } else {
                this.f13462a.sendBridgeResponse(BridgeResponse.newError(i, str));
            }
        }
    }

    static {
        t2o.a(832569369);
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

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public void tbIsLogin(@BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b58fa24", new Object[]{this, bridgeCallback});
        } else {
            TMSTBLoginAbility.b(new b(this, bridgeCallback));
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public void tbLogin(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135f37bd", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            TMSTBLoginAbility.c(apiContext.a(), new a(this, bridgeCallback));
        }
    }
}
