package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IHttpNetAdapter;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.a;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.layoutmanager.module.MtopModule;
import java.util.Map;
import java.util.concurrent.Future;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.MtopStatistics;
import tb.hgc;
import tb.rg7;
import tb.t19;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nvh implements hgc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_CDN_PRE_URL = "https://fullscreen-detail.alicdn.com/";
    public static final String POINT_CDN_ERROR = "ggvideo_cdn_url_error";
    public static final String POINT_CDN_REQ = "ggvideo_cdn_url_req";
    public static final String POINT_CDN_RESP = "ggvideo_cdn_url_resp";

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f24977a;
    public final rg7 b;
    public t19.b c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends jrf<MediaMixContentDetailResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f24978a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ rg7.c c;
        public final /* synthetic */ String d;

        public a(long j, boolean z, rg7.c cVar, String str) {
            this.f24978a = j;
            this.b = z;
            this.c = cVar;
            this.d = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/data/request/detail/interceptor/MTopInterceptor$1");
        }

        /* renamed from: c */
        public void b(MtopResponse mtopResponse, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4c54449", new Object[]{this, mtopResponse, jSONObject, mediaMixContentDetailResponse});
                return;
            }
            ir9.b("MTopInterceptor", "[dataRequest]detail back success, getMtopStat:" + mtopResponse.getMtopStat());
            if (!nvh.d(nvh.this, mtopResponse, jSONObject, mediaMixContentDetailResponse, this.f24978a, this.c) && this.b) {
                nvh.c(nvh.this, this.d, this.c);
            }
        }

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void onError(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
                return;
            }
            boolean b = nvh.b(nvh.this, mtopResponse, this.f24978a, this.b, this.c);
            ir9.b("MTopInterceptor", "[dataRequest]detail back error,fallback=" + b + "; getMtopStat:" + mtopResponse.getMtopStat());
            if (b) {
                String str = this.d;
                if (rg7.ERROR_CODE_I_008.equalsIgnoreCase(mtopResponse.getRetCode()) && !TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                    str = mtopResponse.getRetMsg();
                }
                nvh.c(nvh.this, str, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements IMTopAdapter.a<MediaMixContentDetailResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(nvh nvhVar) {
        }

        /* renamed from: b */
        public MediaMixContentDetailResponse a(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaMixContentDetailResponse) ipChange.ipc$dispatch("373d1124", new Object[]{this, bArr, cls});
            }
            if (ws6.d()) {
                return null;
            }
            return hrl.b(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements MtopModule.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.layoutmanager.module.MtopModule.c
        public void a(MtopBuilder mtopBuilder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("870f15ae", new Object[]{this, mtopBuilder});
            } else {
                s19.y(nvh.e(nvh.this), mtopBuilder);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements IHttpNetAdapter.a<MediaMixContentDetailResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rg7.c f24980a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public d(rg7.c cVar, String str, long j) {
            this.f24980a = cVar;
            this.b = str;
            this.c = j;
        }

        /* renamed from: c */
        public void b(byte[] bArr, MediaMixContentDetailResponse mediaMixContentDetailResponse) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cc0e23b", new Object[]{this, bArr, mediaMixContentDetailResponse});
                return;
            }
            try {
                jSONObject = JSON.parseObject(new String(bArr));
            } catch (Exception e) {
                e.printStackTrace();
                jSONObject = null;
            }
            if (jSONObject != null && mediaMixContentDetailResponse == null) {
                mediaMixContentDetailResponse = hrl.a(jSONObject);
            }
            ir9.b("MTopInterceptor", "[dataRequest]getDetailCdnData onSuccess. data=" + jSONObject);
            if (jSONObject == null || mediaMixContentDetailResponse.data == 0) {
                onError(-1, "data为空");
                return;
            }
            boolean h = nvh.h(nvh.this, null, jSONObject, mediaMixContentDetailResponse, this.f24980a, true);
            ir9.b("MTopInterceptor", "getDetailCdnData成功");
            xau.N(nvh.g(nvh.this), h, this.b, "");
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.L(nvh.g(nvh.this), nvh.POINT_CDN_RESP, this.b, System.currentTimeMillis() - this.c);
        }

        /* renamed from: d */
        public MediaMixContentDetailResponse a(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaMixContentDetailResponse) ipChange.ipc$dispatch("373d1124", new Object[]{this, bArr, cls});
            }
            if (ws6.d()) {
                return null;
            }
            return hrl.b(bArr);
        }

        @Override // com.taobao.android.fluid.framework.adapter.IHttpNetAdapter.a
        public void onError(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                return;
            }
            ir9.b("MTopInterceptor", "[dataRequest]getDetailCdnData onError httpCode=" + i);
            nvh.f(nvh.this).h(this.f24980a, yao.a(String.valueOf(i), str, null));
            xau.N(nvh.g(nvh.this), false, this.b, "onError");
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.J(nvh.g(nvh.this), nvh.POINT_CDN_ERROR, this.b, i, str, System.currentTimeMillis() - this.c);
        }
    }

    static {
        t2o.a(468714270);
        t2o.a(468714267);
    }

    public nvh(FluidContext fluidContext, rg7 rg7Var) {
        this.f24977a = fluidContext;
        this.b = rg7Var;
    }

    public static /* synthetic */ boolean b(nvh nvhVar, MtopResponse mtopResponse, long j, boolean z, rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("962894eb", new Object[]{nvhVar, mtopResponse, new Long(j), new Boolean(z), cVar})).booleanValue();
        }
        return nvhVar.q(mtopResponse, j, z, cVar);
    }

    public static /* synthetic */ void c(nvh nvhVar, String str, rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98efdcb1", new Object[]{nvhVar, str, cVar});
        } else {
            nvhVar.k(str, cVar);
        }
    }

    public static /* synthetic */ boolean d(nvh nvhVar, MtopResponse mtopResponse, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse, long j, rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc2035ee", new Object[]{nvhVar, mtopResponse, jSONObject, mediaMixContentDetailResponse, new Long(j), cVar})).booleanValue();
        }
        return nvhVar.r(mtopResponse, jSONObject, mediaMixContentDetailResponse, j, cVar);
    }

    public static /* synthetic */ t19.b e(nvh nvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19.b) ipChange.ipc$dispatch("12d4e464", new Object[]{nvhVar});
        }
        return nvhVar.c;
    }

    public static /* synthetic */ rg7 f(nvh nvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rg7) ipChange.ipc$dispatch("e7d83a59", new Object[]{nvhVar});
        }
        return nvhVar.b;
    }

    public static /* synthetic */ FluidContext g(nvh nvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("3bd5f30e", new Object[]{nvhVar});
        }
        return nvhVar.f24977a;
    }

    public static /* synthetic */ boolean h(nvh nvhVar, MtopResponse mtopResponse, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse, rg7.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50441c0", new Object[]{nvhVar, mtopResponse, jSONObject, mediaMixContentDetailResponse, cVar, new Boolean(z)})).booleanValue();
        }
        return nvhVar.o(mtopResponse, jSONObject, mediaMixContentDetailResponse, cVar, z);
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bd42bb7", new Object[0]);
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("detailCDN", DETAIL_CDN_PRE_URL);
    }

    public static String m(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("803aa353", new Object[]{fluidContext, str});
        }
        String str2 = "";
        String str3 = str + "_" + FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("detailCdnToken", str2);
        String b2 = uuq.b(fluidContext);
        if (!TextUtils.isEmpty(b2)) {
            str2 = b2;
        }
        return "fs_detail_" + str2 + dbi.a(str3);
    }

    public static String n(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47d19974", new Object[]{fluidContext, str});
        }
        String j = j();
        return j + m(fluidContext, str);
    }

    public final void k(String str, rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb5bff3", new Object[]{this, str, cVar});
            return;
        }
        String n = n(this.f24977a, str);
        ir9.b("MTopInterceptor", "[dataRequest]走CDN兜底，getDetailCdnData" + n);
        long currentTimeMillis = System.currentTimeMillis();
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.K(this.f24977a, POINT_CDN_REQ, n);
        FluidSDK.getHttpNetAdapter().send(new IHttpNetAdapter.c(n), new d(cVar, n, currentTimeMillis), MediaMixContentDetailResponse.class);
    }

    public void l(tg7 tg7Var, boolean z, rg7.c cVar) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b70ff4", new Object[]{this, tg7Var, new Boolean(z), cVar});
        } else if (tg7Var != null && !sz3.b(tg7Var.build())) {
            pep sessionParams = ((ISceneConfigService) this.f24977a.getService(ISceneConfigService.class)).getSessionParams();
            String b2 = tg7Var.b();
            long currentTimeMillis = System.currentTimeMillis();
            ((IDataService) this.f24977a.getService(IDataService.class)).setBeforeDetailMtopTime(currentTimeMillis);
            a aVar = new a(currentTimeMillis, z, cVar, b2);
            njd c2 = jwi.c(this.f24977a, tg7Var, sessionParams, false);
            b bVar = new b(this);
            IMTOPRequest mtopRequest = c2.getMtopRequest();
            JSONObject build = c2.build();
            ir9.b("MTopInterceptor", "[dataRequest]fetchWithMtop, fallback2CDN:" + z + ";requestArgs:" + mtopRequest);
            a.b r = a.b.m().s(mtopRequest).t(build).k(aVar).r(bVar);
            if (ws6.n() != 2) {
                z2 = false;
            }
            a.b<MediaMixContentDetailResponse> n = r.p(z2).l(MediaMixContentDetailResponse.class).q(new c()).n(new ug7());
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.P(this.f24977a, "detail_mtop_start", mtopRequest.getApi(), ws6.n());
            RenderTrackUtils.a(this.f24977a, RenderTrackUtils.detailStart);
            p(n);
        }
    }

    public final boolean o(MtopResponse mtopResponse, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse, rg7.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fe855d2", new Object[]{this, mtopResponse, jSONObject, mediaMixContentDetailResponse, cVar, new Boolean(z)})).booleanValue();
        }
        ir9.a("MTopInterceptor", "handleContentDetail");
        Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail> i = i(jSONObject, mediaMixContentDetailResponse);
        if (i == null) {
            ir9.a("MTopInterceptor", "handleContentDetail, mediaSetData为空");
            this.b.h(cVar, yao.a("data null", "data null", mtopResponse));
            return false;
        }
        com.taobao.android.fluid.framework.data.datamodel.a aVar = (com.taobao.android.fluid.framework.data.datamodel.a) i.first;
        if (!(aVar == null || aVar.e() == null)) {
            aVar.e().j = z;
        }
        MediaMixContentDetail mediaMixContentDetail = (MediaMixContentDetail) mediaMixContentDetailResponse.data;
        Map<String, Object> map = mediaMixContentDetail.transmission;
        if (map != null && !map.isEmpty()) {
            ((IDataService) this.f24977a.getService(IDataService.class)).setTransmission(mediaMixContentDetail.transmission);
            ((IDataService) this.f24977a.getService(IDataService.class)).setTransmissionUp(mediaMixContentDetail.transmission);
        }
        String preCoverKey = this.f24977a.getInstanceConfig().getPreCoverKey();
        if (ogi.e().a(preCoverKey)) {
            g7m.o().N(mediaMixContentDetail.config);
        }
        a.d e = aVar.e();
        if (!(e == null || !e.C() || e.K() == null)) {
            a.e K = e.K();
            if (ogi.e().f(preCoverKey) != null) {
                K.r(ogi.e().f(preCoverKey));
            }
        }
        this.b.h(cVar, yao.i("", i, mtopResponse));
        return true;
    }

    public final void p(a.b<MediaMixContentDetailResponse> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38714d6", new Object[]{this, bVar});
            return;
        }
        ryr.b(this.b.d(), pto.b(this.f24977a), s0j.GG_VIDEOTAB_MTOP_REQUEST);
        ((IDataService) this.f24977a.getService(IDataService.class)).setPreloadUseCacheValue("0");
        FluidSDK.getMTopAdapter().sendWithPrefetch(bVar.j());
    }

    public final Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail> i(JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("480ed3b5", new Object[]{this, jSONObject, mediaMixContentDetailResponse});
        }
        if (!(mediaMixContentDetailResponse == null || (t = mediaMixContentDetailResponse.data) == 0)) {
            MediaMixContentDetail mediaMixContentDetail = (MediaMixContentDetail) t;
            MediaContentDetailData mediaContentDetailData = (MediaContentDetailData) vt6.b(mediaMixContentDetail.list);
            JSONArray d2 = vt6.d(jSONObject, "data", "sectionList");
            JSONObject jSONObject2 = (d2 == null || d2.isEmpty()) ? null : d2.getJSONObject(0);
            if (!(com.taobao.android.fluid.framework.data.datamodel.a.k(mediaContentDetailData) == -1 || jSONObject2 == null)) {
                return new Pair<>(new com.taobao.android.fluid.framework.data.datamodel.a(mediaContentDetailData, jSONObject2), mediaMixContentDetail);
            }
        }
        return null;
    }

    @Override // tb.hgc
    public Future a(hgc.a aVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("39ef4909", new Object[]{this, aVar});
        }
        this.c = s19.k(this.f24977a);
        nq6 nq6Var = (nq6) aVar;
        tg7 b2 = nq6Var.b();
        rg7.c a2 = nq6Var.a();
        if (b93.p(this.f24977a)) {
            ir9.b("MTopInterceptor", "[dataRequest]竖版UI，不走cdn逻辑");
            z = false;
        } else if (b2.d() != null) {
            Object obj = b2.d().get("needRequestCDN");
            if (obj instanceof Boolean) {
                z = ((Boolean) obj).booleanValue();
            }
        }
        l(b2, z, a2);
        return null;
    }

    public final boolean q(MtopResponse mtopResponse, long j, boolean z, rg7.c cVar) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcaf9ca", new Object[]{this, mtopResponse, new Long(j), new Boolean(z), cVar})).booleanValue();
        }
        ir9.b("MTopInterceptor", "onDetailResponseFail，code=" + mtopResponse.getRetCode());
        String retCode = mtopResponse.getRetCode();
        if (rg7.ERROR_CODE_I_007.equalsIgnoreCase(retCode) || a6o.b(retCode)) {
            z2 = true;
        }
        ryr.c(this.b.d(), pto.b(this.f24977a), s0j.GG_VIDEOTAB_MTOP_REQUEST, mtopResponse.getRetCode(), com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.g(this.f24977a, ""));
        boolean z3 = z & (!z2);
        if (!z3) {
            this.b.h(cVar, yao.a(retCode, mtopResponse.getRetMsg(), mtopResponse));
        }
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.M(this.f24977a, "detail_mtop_error", mtopResponse, System.currentTimeMillis() - j, ws6.n());
        s19.j(true, this.c, mtopResponse);
        return z3;
    }

    public final boolean r(MtopResponse mtopResponse, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse, long j, rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34890d0c", new Object[]{this, mtopResponse, jSONObject, mediaMixContentDetailResponse, new Long(j), cVar})).booleanValue();
        }
        boolean l = pto.l(this.f24977a);
        MediaMixContentDetailResponse a2 = (jSONObject == null || mediaMixContentDetailResponse != null) ? mediaMixContentDetailResponse : hrl.a(jSONObject);
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (l) {
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.G(this.f24977a, true, mtopStat.isPrefetch);
            ((IDataService) this.f24977a.getService(IDataService.class)).setTab3LauncherHitMtopPrefetch(mtopStat.isPrefetch);
        }
        ir9.a("MTopInterceptor", "onDetailResponseSuccess, 使用预请求命中缓存，" + mtopStat.isPrefetch + ",isFromLauncher:" + l);
        ryr.d(this.b.d(), pto.b(this.f24977a), s0j.GG_VIDEOTAB_MTOP_REQUEST, com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.g(this.f24977a, ""));
        long currentTimeMillis = System.currentTimeMillis() - j;
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.S(this.f24977a, "detail_mtop_end", mtopResponse, currentTimeMillis, ws6.n());
        s19.j(false, this.c, mtopResponse);
        RenderTrackUtils.a(this.f24977a, RenderTrackUtils.detailEnd);
        ((IDataService) this.f24977a.getService(IDataService.class)).setDetailMtopSuccessTIme(System.currentTimeMillis());
        ((IDataService) this.f24977a.getService(IDataService.class)).setDetailMtopCost(currentTimeMillis);
        if (jSONObject != null && a2 != null && a2.data != 0) {
            return o(mtopResponse, jSONObject, a2, cVar, false);
        }
        ir9.a("MTopInterceptor", "onDetailResponseSuccess, 数据为空");
        return false;
    }
}
