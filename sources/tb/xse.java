package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.task.BasePreloadTaskImpl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xse extends BasePreloadTaskImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean k = true;

    static {
        t2o.a(468714703);
    }

    public xse(FluidContext fluidContext, Context context, JSONObject jSONObject, grm grmVar) {
        super(fluidContext, context, jSONObject, grmVar);
        ir9.b("PickPreloadController_InactivePreloadCacheTas", "PickPreloadControllerNew,InactivePreloadCacheTask 初始化");
    }

    public static /* synthetic */ Object ipc$super(xse xseVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return xseVar.toString();
            case -798600422:
                return xseVar.getPreloadVideoData();
            case -512593800:
                return xseVar.getContext();
            case 299334352:
                xseVar.a((ntm) objArr[0], (sv2) objArr[1]);
                return null;
            case 462157602:
                return new Boolean(xseVar.b((JSONObject) objArr[0]));
            case 1777338802:
                xseVar.n((String) objArr[0], objArr[1]);
                return null;
            case 2019319885:
                return xseVar.i();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/task/InactivePreloadCacheTask");
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public void c(sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d7286e", new Object[]{this, sv2Var});
            return;
        }
        ir9.b("PickPreloadController_InactivePreloadCacheTas", "[preloadvideo] InactivePreloadCacheTask execute. preDownload=" + this.k);
        ryr.b(this.b, null, "gg_pickpreload_use_cache");
        long currentTimeMillis = System.currentTimeMillis();
        DetailCacheData e = qe7.e(null);
        HashMap hashMap = new HashMap();
        re7.b(e, hashMap);
        hashMap.put("useCacheScene", "inactiveTask");
        ryr.d(this.b, null, "gg_pickpreload_use_cache", hashMap);
        ir9.b("PickPreloadController_InactivePreloadCacheTas", "[preloadvideo][stagecost]useCache. cost=" + (System.currentTimeMillis() - currentTimeMillis) + "; execute. cacheData=" + e);
        e(e, hashMap, this.k, false, sv2Var);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.BasePreloadTaskImpl
    public void l(atb atbVar, String str, Map map, String str2, DetailCacheData detailCacheData, sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b90d31", new Object[]{this, atbVar, str, map, str2, detailCacheData, sv2Var});
            return;
        }
        ir9.b("PickPreloadController_InactivePreloadCacheTas", "[preloadvideo]低活人群请求detail，onComplete，fromCache：" + this.d);
        if (this.d) {
            return;
        }
        if (!h(map)) {
            DetailCacheData m = new DetailCacheData.a().n(this.c).o(str).t(str2).p((JSONObject) map).m();
            ir9.b("PickPreloadController_InactivePreloadCacheTas", "低活人群请求detail，onComplete，存detail数据");
            qe7.j(m);
            return;
        }
        ir9.b("PickPreloadController_InactivePreloadCacheTas", "低活人群请求detail，onComplete，被过滤广告：" + str);
    }
}
