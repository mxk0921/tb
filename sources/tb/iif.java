package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.task.MtopTaobaoGiuliaIntimacyActionEventResponse;
import com.taobao.ju.track.server.JTrackParams;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.TLiveMsg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iif implements dgc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f21326a;
    public final alv b = new alv(new a());
    public final ux9 c;
    public ukr d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo instanceof MtopTaobaoGiuliaIntimacyActionEventResponse) {
                TLiveMsg tLiveMsg = new TLiveMsg();
                tLiveMsg.type = 10015;
                tLiveMsg.data = ((MtopTaobaoGiuliaIntimacyActionEventResponse) netBaseOutDo).getData().getBytes();
                tLiveMsg.topic = iif.c(iif.this);
                iif.d(iif.this).t().k(tLiveMsg);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }
    }

    static {
        t2o.a(295699852);
        t2o.a(806356559);
    }

    public iif(ux9 ux9Var, ukr ukrVar) {
        this.c = ux9Var;
        this.d = ukrVar;
    }

    public static /* synthetic */ String c(iif iifVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5204561", new Object[]{iifVar});
        }
        return iifVar.f21326a;
    }

    public static /* synthetic */ ux9 d(iif iifVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("e5fdb280", new Object[]{iifVar});
        }
        return iifVar.c;
    }

    @Override // tb.dgc
    public void a(String str, JSONObject jSONObject, String str2, FandomInfo fandomInfo) {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88a1610", new Object[]{this, str, jSONObject, str2, fandomInfo});
            return;
        }
        if (!(v2s.o().u() == null || !v2s.o().u().checkSessionValid() || fandomInfo == null || (accountInfo = fandomInfo.broadCaster) == null)) {
            this.f21326a = fandomInfo.topic;
            this.b.L(str, accountInfo.accountId, fandomInfo.id, str2);
        }
        if (!TextUtils.isEmpty(str)) {
            h("TBLiveWVPlugin.Event.actionReport", e(str, jSONObject, g(null)));
        }
    }

    @Override // tb.dgc
    public void b(String str, JSONObject jSONObject, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68be4c95", new Object[]{this, str, jSONObject, videoInfo});
            return;
        }
        if (!(v2s.o().u() == null || !v2s.o().u().checkSessionValid() || videoInfo == null || videoInfo.broadCaster == null)) {
            this.b.K(str, jSONObject.toString(), g(videoInfo).toString(), "970", videoInfo.broadCaster.accountId + "_1_" + videoInfo.liveId);
        }
        if (!TextUtils.isEmpty(str)) {
            h("TBLiveWVPlugin.Event.actionReport", e(str, jSONObject, g(videoInfo)));
        }
    }

    public final String e(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("632a7de3", new Object[]{this, str, jSONObject, jSONObject2});
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("action", (Object) str);
        jSONObject3.put("params", (Object) jSONObject);
        jSONObject3.put(JTrackParams.TRACK_PARAMS, (Object) jSONObject2);
        return jSONObject3.toString();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        alv alvVar = this.b;
        if (alvVar != null) {
            alvVar.destroy();
        }
        this.d = null;
    }

    public final JSONObject g(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f4bc0d2b", new Object[]{this, videoInfo});
        }
        JSONObject jSONObject = new JSONObject();
        if (!(videoInfo == null || videoInfo.broadCaster == null)) {
            jSONObject.put("activityId", (Object) videoInfo.liveId);
            jSONObject.put("broadcasterId", (Object) videoInfo.broadCaster.accountId);
        }
        if (gq0.i() != null) {
            jSONObject.put("userId", (Object) gq0.i().getUserId());
        }
        return jSONObject;
    }

    public final void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1675fe", new Object[]{this, str, str2});
            return;
        }
        ukr ukrVar = this.d;
        if (ukrVar != null) {
            ukrVar.o(str, str2);
            if (tws.l()) {
                this.d.f0(str, str2);
            }
        }
    }
}
