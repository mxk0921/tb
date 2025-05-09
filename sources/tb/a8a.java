package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.getredpacket.GetPacketRequest;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a8a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f15591a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f15592a;

        public a(xea xeaVar) {
            this.f15592a = xeaVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            hha.b("GetRedPacket", "onError.");
            a1u.a(this.f15592a.i(), "活动太火爆了，请稍后再试");
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            if (!TextUtils.isEmpty(a8a.this.f15591a) && a8a.this.f15591a.contains("refreshTopRights")) {
                hha.b("GetRedPacket", "onSuccess | refreshTopRights.");
                sjr.g().c("com.taobao.taolive.room.gl.refresh.topright", null, xea.E(this.f15592a));
            }
            if (!TextUtils.isEmpty(a8a.this.f15591a) && a8a.this.f15591a.contains("refreshGoodsList")) {
                hha.b("GetRedPacket", "onSuccess | refreshGoodsList.");
                sjr.g().c("com.taobao.taolive.room.gl.refresh.showinglist", null, xea.E(this.f15592a));
            }
            if (netResponse != null && netResponse.getDataJsonObject() != null) {
                JSONObject dataJsonObject = netResponse.getDataJsonObject();
                String optString = dataJsonObject.optString("msgInfo");
                boolean optBoolean = dataJsonObject.optBoolean("msgCode");
                hha.b("GetRedPacket", "onSuccess | success=" + optBoolean + "    msgInfo=" + optString);
                if (!TextUtils.isEmpty(optString)) {
                    a1u.a(this.f15592a.i(), optString);
                }
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            hha.b("GetRedPacket", "onSystemError.");
            a1u.a(this.f15592a.i(), "活动太火爆了，请稍后再试");
        }
    }

    static {
        t2o.a(295698984);
    }

    public void a(xea xeaVar, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77754a83", new Object[]{this, xeaVar, objArr});
        } else if (xeaVar == null || objArr == null || objArr.length < 4) {
            hha.b("GetRedPacket", "getRedPacket | params empty, context=" + xeaVar);
        } else {
            Object obj = objArr[3];
            if (obj instanceof String) {
                this.f15591a = (String) obj;
            }
            if (objArr.length >= 5) {
                Object obj2 = objArr[4];
                if (obj2 instanceof String) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("bizCode", (String) obj2);
                    zha.a(xeaVar, hashMap);
                    if (kkr.i().o() != null) {
                        kkr.i().o().c("goodslist_redPacket", hashMap);
                    }
                }
            }
            GetPacketRequest getPacketRequest = new GetPacketRequest();
            getPacketRequest.liveId = xeaVar.u();
            getPacketRequest.anchorId = xeaVar.g();
            getPacketRequest.liveSource = xeaVar.v();
            getPacketRequest.entryLiveSource = xeaVar.m();
            getPacketRequest.spmCnt = xeaVar.A();
            getPacketRequest.spmUrl = xeaVar.z();
            getPacketRequest.entrySpm = xeaVar.n();
            Object obj3 = objArr[2];
            if (obj3 instanceof com.alibaba.fastjson.JSONObject) {
                com.alibaba.fastjson.JSONObject jSONObject = (com.alibaba.fastjson.JSONObject) obj3;
                getPacketRequest.transParams = jSONObject;
                getPacketRequest.asac = jSONObject.getString("asac");
            }
            new v7a(new a(xeaVar)).K(getPacketRequest);
        }
    }
}
