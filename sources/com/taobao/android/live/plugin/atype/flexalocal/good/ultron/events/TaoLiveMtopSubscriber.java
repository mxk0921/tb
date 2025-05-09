package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import tb.b0d;
import tb.b8v;
import tb.jk;
import tb.nt1;
import tb.t2o;
import tb.u22;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveMtopSubscriber extends u22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class MtopResponse extends NetBaseOutDo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private MtopResponseData data;

        static {
            t2o.a(295699199);
        }

        private MtopResponse() {
        }

        public static /* synthetic */ Object ipc$super(MtopResponse mtopResponse, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/events/TaoLiveMtopSubscriber$MtopResponse");
        }

        @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
        public Object getData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
            }
            return this.data;
        }

        public void setData(MtopResponseData mtopResponseData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5891f6f4", new Object[]{this, mtopResponseData});
            } else {
                this.data = mtopResponseData;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class MtopResponseData implements INetDataObject {
        static {
            t2o.a(295699200);
            t2o.a(806355930);
        }

        private MtopResponseData() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends TypeReference<HashMap<String, String>> {
        public a(TaoLiveMtopSubscriber taoLiveMtopSubscriber, Type... typeArr) {
            super(typeArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f8534a;
        public final /* synthetic */ JSONObject b;

        public b(b8v b8vVar, JSONObject jSONObject) {
            this.f8534a = b8vVar;
            this.b = jSONObject;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                TaoLiveMtopSubscriber.this.y(this.f8534a, "onFail", this.b, a(netResponse));
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else {
                TaoLiveMtopSubscriber.this.y(this.f8534a, "onSuccess", this.b, a(netResponse));
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                TaoLiveMtopSubscriber.this.y(this.f8534a, "onFail", this.b, a(netResponse));
            }
        }

        public final JSONObject a(NetResponse netResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("a4a65283", new Object[]{this, netResponse});
            }
            try {
                JSONObject jSONObject = (JSONObject) JSON.parse(netResponse.getBytedata(), new Feature[0]);
                if (jSONObject == null || !(jSONObject.get("data") instanceof JSONObject)) {
                    return null;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (netResponse.getRetMsg() != null) {
                    jSONObject2.put(jk.KEY_RET_MSG, (Object) netResponse.getRetMsg());
                }
                return jSONObject2;
            } catch (Throwable th) {
                v7t.d("LiveMtopApi", th.toString());
                return null;
            }
        }
    }

    static {
        t2o.a(295699196);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveMtopSubscriber taoLiveMtopSubscriber, String str, Object... objArr) {
        if (str.hashCode() == -2105903856) {
            super.t((b8v) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/events/TaoLiveMtopSubscriber");
    }

    @Override // tb.u22, tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        super.t(b8vVar);
        v7t.i("LiveMtopApi", "handle");
        JSONObject z = z(b8vVar);
        NetRequest netRequest = new NetRequest();
        String string = z.getString("inputParams");
        if (string != null) {
            netRequest.dataParams = (Map) JSON.parseObject(string, new a(this, String.class, String.class), new Feature[0]);
        }
        netRequest.setData(string);
        netRequest.setApiName(z.getString("api"));
        netRequest.setVersion(z.getString("v"));
        netRequest.setNeedEcode(true);
        new nt1(new b(b8vVar, z)).G(1, netRequest, MtopResponse.class);
    }
}
