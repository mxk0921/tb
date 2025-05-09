package com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl;

import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl.ExpansionRPGetter;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;
import tb.a1u;
import tb.b0d;
import tb.fkx;
import tb.hha;
import tb.kkr;
import tb.m3s;
import tb.nt1;
import tb.pfa;
import tb.t2o;
import tb.xea;
import tb.yga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ExpansionRPGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ExpansionRPData implements INetDataObject {
        public JSONArray expansionRedPacketList;
        public String msgInfo;
        public String result;

        static {
            t2o.a(295698981);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ExpansionRPRequest implements INetDataObject {
        public String anchorId;
        public String entryLiveSource;
        public JSONObject interactJson;
        public String liveId;
        public String API_NAME = "mtop.iliad.interact.task.trigger";
        public String VERSION = "1.0";
        public boolean NEED_ECODE = true;
        public boolean NEED_SESSION = true;
        public String liveSource = "";

        static {
            t2o.a(295698982);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ExpansionRPResponse extends NetBaseOutDo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ExpansionRPData data;

        static {
            t2o.a(295698983);
        }

        public static /* synthetic */ Object ipc$super(ExpansionRPResponse expansionRPResponse, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/hanlerimpl/ExpansionRPGetter$ExpansionRPResponse");
        }

        @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
        public ExpansionRPData getData() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExpansionRPData) ipChange.ipc$dispatch("e05d9ae9", new Object[]{this}) : this.data;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f8492a;
        public final /* synthetic */ JSONObject b;

        public a(ExpansionRPGetter expansionRPGetter, xea xeaVar, JSONObject jSONObject) {
            this.f8492a = xeaVar;
            this.b = jSONObject;
        }

        public static /* synthetic */ void b(ExpansionRPData expansionRPData, xea xeaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0681aa1", new Object[]{expansionRPData, xeaVar});
            } else {
                pfa.Z((LiveItem) fkx.f(expansionRPData.toString(), LiveItem.class), xeaVar);
            }
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            if (netResponse != null) {
                hha.b("ExpandAwardGetter", "onError | code=" + netResponse.getRetCode() + " msg=" + netResponse.getRetMsg());
            } else {
                hha.b("ExpandAwardGetter", "onError.");
            }
            a1u.a(this.f8492a.i(), "活动太火爆了，请稍后再试");
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if ((netBaseOutDo instanceof ExpansionRPResponse) && netBaseOutDo.getData() != null) {
                final ExpansionRPData data = ((ExpansionRPResponse) netBaseOutDo).getData();
                hha.b("ExpandAwardGetter", "getExpansionRP | success. msg=" + data.msgInfo + " result=" + data.result);
                if (!TextUtils.isEmpty(data.msgInfo)) {
                    a1u.a(this.f8492a.i(), data.msgInfo);
                }
                if (data.expansionRedPacketList != null) {
                    for (int i2 = 0; i2 < data.expansionRedPacketList.size(); i2++) {
                        Object obj2 = data.expansionRedPacketList.get(i2);
                        if ((obj2 instanceof JSONObject) && ExpansionRPGetter.a((JSONObject) obj2, this.b)) {
                            break;
                        }
                    }
                }
                this.f8492a.j().T(this.b);
                Handler w = this.f8492a.w();
                final xea xeaVar = this.f8492a;
                w.postDelayed(new Runnable() { // from class: tb.co8
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExpansionRPGetter.a.b(ExpansionRPGetter.ExpansionRPData.this, xeaVar);
                    }
                }, yga.v0());
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            if (netResponse != null) {
                hha.b("ExpandAwardGetter", "onSystemError | code=" + netResponse.getRetCode() + " msg=" + netResponse.getRetMsg());
            } else {
                hha.b("ExpandAwardGetter", "onSystemError.");
            }
            a1u.a(this.f8492a.i(), "活动太火爆了，请稍后再试");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(ExpansionRPGetter expansionRPGetter) {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                hha.b("ExpandAwardGetter", "onError.");
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else {
                hha.b("ExpandAwardGetter", "onSuccess.");
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                hha.b("ExpandAwardGetter", "onSystemError.");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c extends nt1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295698980);
        }

        public c(b0d b0dVar) {
            super(b0dVar);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/hanlerimpl/ExpansionRPGetter$ExpansionRPBusiness");
        }

        public void K(xea xeaVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12230093", new Object[]{this, xeaVar, jSONObject, str});
            } else if (xeaVar == null) {
                hha.b("ExpandAwardGetter", "getCoupon | param is null.");
            } else {
                ExpansionRPRequest expansionRPRequest = new ExpansionRPRequest();
                expansionRPRequest.anchorId = xeaVar.g();
                expansionRPRequest.liveId = xeaVar.u();
                expansionRPRequest.interactJson = jSONObject;
                if (jSONObject == null) {
                    expansionRPRequest.interactJson = new JSONObject();
                }
                expansionRPRequest.interactJson.put("reportType", (Object) str);
                C(1, expansionRPRequest, ExpansionRPResponse.class);
            }
        }
    }

    static {
        t2o.a(295698977);
    }

    public static /* synthetic */ boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e9febbb", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        return e(jSONObject, jSONObject2);
    }

    public static void b(JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d39db75", new Object[]{jSONObject, map});
            return;
        }
        HashMap<String, String> b2 = m3s.b(jSONObject);
        if (!b2.isEmpty()) {
            map.putAll(b2);
        }
    }

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26cc137a", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (!(jSONObject == null || jSONObject2 == null)) {
            String string = jSONObject.getString("acceleratorCode");
            String string2 = jSONObject2.getString("acceleratorCode");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                return TextUtils.equals(string, string2);
            }
        }
        return false;
    }

    public void d(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f74aa1c1", new Object[]{this, xeaVar});
        } else if (xeaVar != null && xeaVar.m.g) {
            hha.b("ExpandAwardGetter", "hideReport | report ExpansionRP.");
            xeaVar.m.g = false;
            new c(new b(this)).K(xeaVar, null, "collect");
        }
    }

    public void c(xea xeaVar, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd96dbf", new Object[]{this, xeaVar, objArr});
        } else if (xeaVar == null) {
            hha.b("ExpandAwardGetter", "getExpandAward | goodLiveContext error.");
        } else if (objArr == null || objArr.length < 2) {
            hha.b("ExpandAwardGetter", "getExpandAward | args error.");
        } else {
            Object obj = objArr[1];
            JSONObject jSONObject = null;
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                JSONObject jSONObject3 = jSONObject2.getJSONObject("nativeConfigInfos");
                if (jSONObject3 != null) {
                    jSONObject = jSONObject3.getJSONObject("expansionRedPacket");
                }
                jSONObject = jSONObject2;
            } else {
                jSONObject = null;
            }
            if (jSONObject == null || jSONObject == null) {
                hha.b("ExpandAwardGetter", "getExpandAward | awardInfo error.");
                return;
            }
            xeaVar.m.g = true;
            new c(new a(this, xeaVar, jSONObject)).K(xeaVar, jSONObject, "acceler");
            if (kkr.i().o() != null) {
                HashMap<String, String> hashMap = new HashMap<>();
                b(jSONObject, hashMap);
                kkr.i().o().c("guide_expansionPacket", hashMap);
            }
        }
    }
}
