package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.cache.IDetailCache;
import com.taobao.android.fluid.framework.preload.task.BasePreloadTaskImpl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p7k extends BasePreloadTaskImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public DetailCacheData n = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements sv2<ntm> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25920a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;
        public final /* synthetic */ sv2 d;

        public a(String str, Map map, String str2, sv2 sv2Var) {
            this.f25920a = str;
            this.b = map;
            this.c = str2;
            this.d = sv2Var;
        }

        /* renamed from: b */
        public void a(ntm ntmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d92f2e01", new Object[]{this, ntmVar});
                return;
            }
            ir9.b("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "normalTaskCallBack,videoData:" + ntmVar);
            p7k.p(p7k.this, ntmVar, this.f25920a, this.b, this.c, this.d);
        }
    }

    static {
        t2o.a(468714704);
    }

    public p7k(FluidContext fluidContext, Context context, JSONObject jSONObject, grm grmVar) {
        super(fluidContext, context, jSONObject, grmVar);
        this.k = false;
        this.l = true;
        this.m = false;
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("info");
            if (jSONObject2 != null) {
                this.k = nwv.o(jSONObject2.get("isRedPointExpired"), false);
                this.l = nwv.o(jSONObject2.get("createPlayer"), true);
                this.m = nwv.o(jSONObject2.get("preDownload"), false);
            }
            ir9.b("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "NormalPreloadTask isRedPointExpired: " + this.k);
        }
    }

    public static /* synthetic */ Object ipc$super(p7k p7kVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return p7kVar.toString();
            case -798600422:
                return p7kVar.getPreloadVideoData();
            case -512593800:
                return p7kVar.getContext();
            case 299334352:
                p7kVar.a((ntm) objArr[0], (sv2) objArr[1]);
                return null;
            case 462157602:
                return new Boolean(p7kVar.b((JSONObject) objArr[0]));
            case 1421413681:
                super.l((atb) objArr[0], (String) objArr[1], (Map) objArr[2], (String) objArr[3], (DetailCacheData) objArr[4], (sv2) objArr[5]);
                return null;
            case 1777338802:
                p7kVar.n((String) objArr[0], objArr[1]);
                return null;
            case 2019319885:
                return p7kVar.i();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/task/NormalPreloadTask");
        }
    }

    public static /* synthetic */ void p(p7k p7kVar, ntm ntmVar, String str, Map map, String str2, sv2 sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3699c", new Object[]{p7kVar, ntmVar, str, map, str2, sv2Var});
        } else {
            p7kVar.q(ntmVar, str, map, str2, sv2Var);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public void c(sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d7286e", new Object[]{this, sv2Var});
            return;
        }
        ir9.b("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "[preloadvideo]NormalPreloadTask execute. isRedPointExpired=" + this.k);
        if (!this.k || aps.p()) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", Integer.valueOf(getType()));
            ryr.b(this.b, null, "gg_pickpreload_use_cache");
            long currentTimeMillis = System.currentTimeMillis();
            DetailCacheData e = qe7.e(null);
            this.n = e;
            re7.b(e, hashMap);
            hashMap.put("useCacheScene", "normaltask");
            ryr.d(this.b, null, "gg_pickpreload_use_cache", hashMap);
            ir9.b("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "[preloadvideo][stagecost]useCache. cost=" + (System.currentTimeMillis() - currentTimeMillis) + "; cacheData=" + this.n);
            e(this.n, hashMap, this.m, this.l, sv2Var);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.BasePreloadTaskImpl
    public void l(atb atbVar, String str, Map map, String str2, DetailCacheData detailCacheData, sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b90d31", new Object[]{this, atbVar, str, map, str2, detailCacheData, sv2Var});
        } else {
            super.l(atbVar, str, map, str2, detailCacheData, r(str, map, str2, sv2Var));
        }
    }

    public final sv2<ntm> r(String str, Map map, String str2, sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sv2) ipChange.ipc$dispatch("bbf5e9c9", new Object[]{this, str, map, str2, sv2Var});
        }
        return new a(str, map, str2, sv2Var);
    }

    public final void q(ntm ntmVar, String str, Map map, String str2, sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7726e847", new Object[]{this, ntmVar, str, map, str2, sv2Var});
            return;
        }
        if (!this.d) {
            if (!h(map)) {
                DetailCacheData m = new DetailCacheData.a().n(this.c).o(str).t(str2).p((JSONObject) map).m();
                ir9.b("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "[preloadvideo] NormalTask，onComplete，存detail数据");
                qe7.j(m);
            } else {
                ir9.b("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "NormalTask，onComplete，被过滤广告：" + str);
            }
        }
        if (!(ntmVar == null || ntmVar.e == null)) {
            ntmVar.f = this.d;
        }
        DetailCacheData detailCacheData = this.n;
        if (detailCacheData != null && TextUtils.equals(detailCacheData.getSceneName(), IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_UNEXPOSED)) {
            ir9.b("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "来自后台存储的未曝光的缓存不为null，设置isFromCache，isExposed");
            ntmVar.r = true;
            ntmVar.o = false;
        }
        if (sv2Var != null) {
            ir9.b("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "handleDetailCacheAfterComplete,callBack:" + sv2Var + ",videoData:" + ntmVar);
            sv2Var.a(ntmVar);
        }
    }
}
