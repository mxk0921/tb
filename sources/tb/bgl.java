package tb;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.taolive.room.business.commission.request.OuterTraceInfo;
import com.taobao.taolive.room.business.commission.request.OuterTraceLocalInfo;
import com.taobao.taolive.room.business.commission.request.OuterTraceResponse;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bgl implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "OuterTraceLogic";

    /* renamed from: a  reason: collision with root package name */
    public agl f16374a;
    public final air b;

    static {
        t2o.a(779092792);
        t2o.a(806355932);
    }

    public bgl(air airVar) {
        this.b = airVar;
    }

    public final void a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            StringBuilder sb = new StringBuilder();
            air airVar = this.b;
            if (airVar != null) {
                str2 = airVar.p();
            } else {
                str2 = "";
            }
            sb.append(str2);
            sb.append(" - ");
            sb.append(str);
            A.a(TAG, sb.toString());
        }
    }

    public final void b(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c81d5f", new Object[]{this, jSONObject, str, str2, str3, str4, str5});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("liveToken", this.b.p());
            hashMap.put(RVStartParams.KEY_FROM_TYPE, str);
            hashMap.put("liveId", str2);
            hashMap.put("outerTraceContext", jSONObject.toJSONString());
            hashMap.put("entryLiveSource", str3);
            hashMap.put("actionSource", str4);
            hashMap.put("liveSource", str5);
            if (v2s.o().E() != null) {
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", "outerTraceMonitor", hashMap);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else if (ejr.j()) {
            a(DMComponent.RESET);
            agl aglVar = this.f16374a;
            if (aglVar != null) {
                aglVar.destroy();
                this.f16374a = null;
            }
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            a("onError");
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            a("onSystemError");
        }
    }

    public void d(VideoInfo videoInfo) {
        OuterTraceLocalInfo outerTraceLocalInfo;
        List<OuterTraceLocalInfo.LocalOuterParam> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1574ede", new Object[]{this, videoInfo});
        } else if (ejr.j()) {
            a("send");
            if (!(this.b == null || videoInfo == null)) {
                String str = "1";
                if (!videoInfo.roomStatus.equals(str)) {
                    a("send not live");
                    return;
                }
                String str2 = videoInfo.liveId;
                String r = up6.r(this.b);
                String B = iba.B(vx9.f(this.b));
                JSONObject jSONObject = null;
                String str3 = (this.b.w0() == null || this.b.w0().initParams == null) ? null : this.b.w0().initParams.get(yj4.PARAM_TCP_OUTER_PARAM);
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject = new JSONObject();
                    jSONObject.put(yj4.PARAM_TCP_OUTER_PARAM, (Object) str3);
                    a("send from url outerTraceContext = " + jSONObject);
                }
                if (jSONObject == null) {
                    String a2 = u6t.a(TAG);
                    if (!TextUtils.isEmpty(a2) && (outerTraceLocalInfo = (OuterTraceLocalInfo) JSON.parseObject(a2, OuterTraceLocalInfo.class)) != null && (list = outerTraceLocalInfo.localCacheContext) != null && !list.isEmpty()) {
                        for (int i = 0; i < outerTraceLocalInfo.localCacheContext.size(); i++) {
                            OuterTraceLocalInfo.LocalOuterParam localOuterParam = outerTraceLocalInfo.localCacheContext.get(i);
                            if (localOuterParam != null && System.currentTimeMillis() <= localOuterParam.expireTime) {
                                if (jSONObject == null) {
                                    jSONObject = new JSONObject();
                                }
                                jSONObject.put(localOuterParam.key, (Object) localOuterParam.value);
                            }
                        }
                    }
                    a("send from cache outerTraceContext = " + jSONObject);
                    str = "2";
                }
                if (jSONObject != null) {
                    agl aglVar = new agl(this);
                    this.f16374a = aglVar;
                    aglVar.K(str, str2, jSONObject, r, "enterLive", B);
                    b(jSONObject, str, str2, r, "enterLive", B);
                    a("send getUrlList outerTraceContext = " + jSONObject);
                }
            }
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        OuterTraceInfo.OuterTraceResult outerTraceResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        a("onSuccess");
        if (netBaseOutDo instanceof OuterTraceResponse) {
            OuterTraceInfo data = ((OuterTraceResponse) netBaseOutDo).getData();
            long currentTimeMillis = System.currentTimeMillis();
            if (!(data == null || (outerTraceResult = data.result) == null || outerTraceResult.localCacheContext == null)) {
                OuterTraceLocalInfo outerTraceLocalInfo = new OuterTraceLocalInfo();
                outerTraceLocalInfo.localCacheContext = new ArrayList();
                for (int i2 = 0; i2 < data.result.localCacheContext.size(); i2++) {
                    OuterTraceInfo.OuterParam outerParam = data.result.localCacheContext.get(i2);
                    if (outerParam != null) {
                        outerTraceLocalInfo.localCacheContext.add(new OuterTraceLocalInfo.LocalOuterParam(outerParam.expireTime + currentTimeMillis, outerParam.key, outerParam.value));
                    }
                }
                String jSONString = JSON.toJSONString(outerTraceLocalInfo);
                u6t.d(TAG, jSONString);
                a("onSuccess cacheStr = " + jSONString);
            }
        }
    }
}
