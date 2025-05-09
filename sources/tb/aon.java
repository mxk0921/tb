package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class aon {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f15903a;
    public a b;

    static {
        t2o.a(468714213);
    }

    public aon(pep pepVar) {
        Map<String, String> a2 = pepVar.a();
        JSONObject b = hxf.b(pepVar.j);
        b = b == null ? new JSONObject() : b;
        if (a2 != null) {
            b.putAll(a2);
        }
        b.put("page", (Object) pepVar.c);
        if (!TextUtils.isEmpty(pepVar.s)) {
            b.put(yj4.PARAM_UT_PARAMS, (Object) pepVar.s);
        }
        b.put("tbvs_version", (Object) 31);
        if (pepVar.c() != null) {
            b.putAll(pepVar.c());
        }
        sj4.a(b);
        this.f15903a = b;
    }

    public static aon g(pep pepVar, ncp ncpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("7bcf06e0", new Object[]{pepVar, ncpVar});
        }
        aon aonVar = new aon(pepVar);
        if (ncpVar != null) {
            aonVar.p(ncpVar.h());
        }
        return aonVar;
    }

    public aon a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("d6407942", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        this.f15903a.put("actionParam", (Object) map);
        return this;
    }

    public aon b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("4f65c03", new Object[]{this, new Integer(i)});
        }
        try {
            this.f15903a.put(c4o.COLLECTION_ORDER, (Object) Integer.valueOf(i));
        } catch (Throwable unused) {
        }
        return this;
    }

    public aon c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("7ee4148a", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        this.f15903a.put(c4o.KEY_CONTENT_PASSPARAMS, (Object) map);
        return this;
    }

    public aon d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("e72ee6e1", new Object[]{this, fluidContext});
        }
        try {
            this.f15903a.put(c4o.KEY_TAB3COMPONENTSOURCE, (Object) fluidContext.getInstanceConfig().getTab3ComponentSource());
        } catch (Throwable unused) {
        }
        return this;
    }

    public aon e(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("1def979f", new Object[]{this, map});
        }
        if (map != null) {
            this.f15903a.putAll(map);
        }
        return this;
    }

    public aon f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("43b4f75", new Object[]{this});
        }
        try {
            if (ief.f()) {
                String a2 = cp2.a();
                ir9.b("RecommendParams", "cflog bxFeatures " + a2);
                if (!TextUtils.isEmpty(a2)) {
                    this.f15903a.put("bxFeature", (Object) a2);
                }
            }
        } catch (Throwable unused) {
        }
        return this;
    }

    public aon h(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("e15971c6", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        this.f15903a.put("edgeComputeParam", (Object) map);
        return this;
    }

    public aon i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("35768470", new Object[]{this});
        }
        try {
            this.f15903a.put(c4o.KEY_ENABLE_SERVER_ABR, (Object) Boolean.TRUE);
        } catch (Exception unused) {
        }
        return this;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4aa333c5", new Object[]{this});
        }
        return this.f15903a.toJSONString();
    }

    public aon l(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("99ce5c0", new Object[]{this, fluidContext});
        }
        this.f15903a.put("forceWeex", (Object) Boolean.valueOf(((IInteractionService) fluidContext.getService(IInteractionService.class)).getConfig().e()));
        return this;
    }

    public aon m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("1acecd2f", new Object[]{this});
        }
        try {
            if (ief.c()) {
                String c = cp2.c();
                ir9.b("RecommendParams", "cflog ggBxFeatures " + c);
                if (!TextUtils.isEmpty(c)) {
                    this.f15903a.put("bxFeature", (Object) c);
                }
            }
        } catch (Throwable unused) {
        }
        return this;
    }

    public aon n(FluidContext fluidContext) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("acb2f86c", new Object[]{this, fluidContext});
        }
        IDataService iDataService = (IDataService) fluidContext.getService(IDataService.class);
        if (!(iDataService == null || iDataService.getConfig() == null || iDataService.getConfig().j() == null)) {
            z = zk1.e(iDataService.getConfig().j().f);
        }
        this.f15903a.put(c4o.KEY_ISAUTOSLIDE, (Object) Boolean.valueOf(z));
        return this;
    }

    public aon o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("cd9312ff", new Object[]{this});
        }
        try {
            this.f15903a.put(c4o.KEY_LBS_DATA, (Object) hxf.d(sjg.b()));
        } catch (Throwable unused) {
        }
        return this;
    }

    public aon p(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("aebca1ed", new Object[]{this, map});
        }
        if (map != null) {
            this.f15903a.put("module", (Object) map);
        }
        return this;
    }

    public aon q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("e8fec42c", new Object[]{this});
        }
        try {
            int l = z5r.l();
            ir9.b("mtop", "request recommend buildExtendParameters netSpeedValue=" + l);
            this.f15903a.put(c4o.KEY_NETWORK_SPEED, (Object) Integer.valueOf(l));
        } catch (Exception unused) {
        }
        return this;
    }

    public aon r(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("4c95a0a9", new Object[]{this, fluidContext});
        }
        try {
            String detailRequestRefreshType = ((IDataService) fluidContext.getService(IDataService.class)).getDetailRequestRefreshType();
            if (detailRequestRefreshType != null) {
                this.f15903a.put(c4o.KEY_REFRESH_TYPE, (Object) detailRequestRefreshType);
            }
        } catch (Throwable unused) {
        }
        return this;
    }

    public aon s(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("35f73f01", new Object[]{this, new Boolean(z)});
        }
        JSONObject jSONObject = this.f15903a;
        if (z) {
            str = "up";
        } else {
            str = "down";
        }
        jSONObject.put("slideAction", (Object) str);
        return this;
    }

    public aon t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("db5b5b72", new Object[]{this});
        }
        this.f15903a.put(kf3.REQ_SUPPORTWEEX, (Object) Boolean.TRUE);
        return this;
    }

    public aon u(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("2eaea175", new Object[]{this, map});
        }
        if (map != null) {
            this.f15903a.putAll(map);
        }
        return this;
    }

    public aon v(miv mivVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("1d91a072", new Object[]{this, mivVar});
        }
        if (mivVar != null && !mivVar.c()) {
            this.f15903a.put("negFeedback", (Object) mivVar.b());
        }
        return this;
    }

    public aon w(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("e592353e", new Object[]{this, fluidContext});
        }
        this.f15903a.put(c4o.KEY_VERTICAL_LAYOUT, (Object) Boolean.valueOf(b93.n(fluidContext)));
        return this;
    }

    public aon k(LruCache<String, f59> lruCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aon) ipChange.ipc$dispatch("664a7b2b", new Object[]{this, lruCache});
        }
        if (lruCache == null) {
            return this;
        }
        ArrayList arrayList = new ArrayList(lruCache.snapshot().values());
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", ((f59) arrayList.get(i)).c());
            hashMap.put(AdvertisementOption.PRIORITY_VALID_TIME, String.valueOf(Long.parseLong(((f59) arrayList.get(i)).e()) / 1000));
            hashMap.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, String.valueOf(Long.parseLong(((f59) arrayList.get(i)).g()) / 1000));
            arrayList2.add(hashMap);
        }
        if (arrayList2.size() != 0) {
            this.f15903a.put("feedBackList", (Object) arrayList2);
        }
        return this;
    }
}
