package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.recommendLives.MtopMediaplatformAliveRecommendLivesRequest;
import com.taobao.taolive.room.business.recommendLives.MtopMediaplatformAliveRecommendLivesResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d3h extends nt1 implements amc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final cba l;

    static {
        t2o.a(779092824);
        t2o.a(806354964);
    }

    public d3h(b0d b0dVar, cba cbaVar) {
        super(b0dVar, true);
        this.l = cbaVar;
    }

    public static /* synthetic */ Object ipc$super(d3h d3hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/mess/LiveRecBusiness");
    }

    public void K(e3h e3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5290881", new Object[]{this, e3hVar});
            return;
        }
        MtopMediaplatformAliveRecommendLivesRequest mtopMediaplatformAliveRecommendLivesRequest = new MtopMediaplatformAliveRecommendLivesRequest();
        if (pvs.M1()) {
            mtopMediaplatformAliveRecommendLivesRequest.API_NAME = "mtop.tblive.recommend.updown.lives";
            mtopMediaplatformAliveRecommendLivesRequest.VERSION = "1.0";
        } else {
            mtopMediaplatformAliveRecommendLivesRequest.API_NAME = "mtop.mediaplatform.alive.recommend.lives";
            mtopMediaplatformAliveRecommendLivesRequest.VERSION = "1.0";
        }
        if (!TextUtils.isEmpty(iba.G(this.l))) {
            mtopMediaplatformAliveRecommendLivesRequest.setSource(iba.G(this.l));
        } else {
            mtopMediaplatformAliveRecommendLivesRequest.setSource("source_live");
        }
        mtopMediaplatformAliveRecommendLivesRequest.setS(e3hVar.c);
        mtopMediaplatformAliveRecommendLivesRequest.setN(e3hVar.d);
        mtopMediaplatformAliveRecommendLivesRequest.setAccountStays(e3hVar.e);
        if (TextUtils.isDigitsOnly(e3hVar.f18243a)) {
            mtopMediaplatformAliveRecommendLivesRequest.setLiveId(yqq.m(e3hVar.f18243a));
        }
        mtopMediaplatformAliveRecommendLivesRequest.setLastBroadCastId(e3hVar.f);
        String str = e3hVar.g;
        if (str != null) {
            JSONObject d = fkx.d(str);
            if (pvs.B1()) {
                d.put("entryLiveSourcePre", (Object) iba.p(this.l));
            }
            if (d != null) {
                if (hw0.l()) {
                    mtopMediaplatformAliveRecommendLivesRequest.mockUserId = d.getString("mockUserId");
                    d.remove("mockUserId");
                    e3hVar.g = JSON.toJSONString(d);
                }
                if (pvs.o0()) {
                    d.put("queryTimeMoving", (Object) "true");
                    e3hVar.g = JSON.toJSONString(d);
                }
            }
            mtopMediaplatformAliveRecommendLivesRequest.tppParam = e3hVar.g;
        }
        E(e3hVar.b, mtopMediaplatformAliveRecommendLivesRequest, MtopMediaplatformAliveRecommendLivesResponse.class, false, true);
    }

    @Override // tb.amc
    public amc a(b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (amc) ipChange.ipc$dispatch("30a2f79b", new Object[]{this, b0dVar});
        }
        return new d3h(b0dVar, null);
    }

    @Override // tb.amc
    public void b(int i, String str, long j, long j2, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d259523", new Object[]{this, new Integer(i), str, new Long(j), new Long(j2), str2, str3, str4});
            return;
        }
        e3h e3hVar = new e3h();
        e3hVar.b = i;
        e3hVar.f18243a = str;
        e3hVar.c = j;
        e3hVar.d = j2;
        e3hVar.e = str2;
        e3hVar.f = str3;
        e3hVar.g = str4;
        K(e3hVar);
    }
}
