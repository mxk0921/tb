package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import tb.hgc;
import tb.rg7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ms2 implements hgc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f24269a;
    public final rg7 b;

    static {
        t2o.a(468714265);
        t2o.a(468714267);
    }

    public ms2(FluidContext fluidContext, rg7 rg7Var) {
        this.f24269a = fluidContext;
        this.b = rg7Var;
    }

    @Override // tb.hgc
    public Future a(hgc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("39ef4909", new Object[]{this, aVar});
        }
        nq6 nq6Var = (nq6) aVar;
        tg7 b = nq6Var.b();
        rg7.c a2 = nq6Var.a();
        boolean c = c(b, a2);
        ir9.b("CacheInterceptor", "fetchWithCache useCache=" + c);
        if (!c) {
            return nq6Var.c(b, a2);
        }
        return null;
    }

    public final yao<Pair<a, MediaMixContentDetail>> b(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        MediaContentDetailData mediaContentDetailData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yao) ipChange.ipc$dispatch("38c02227", new Object[]{this, str, jSONObject, jSONObject2});
        }
        try {
            mediaContentDetailData = hnn.e(jSONObject2);
        } catch (Throwable th) {
            ir9.b("CacheInterceptor", "buildSuccessResult failed:" + th.getMessage());
            mediaContentDetailData = null;
        }
        return yao.h(str, new Pair(new a(mediaContentDetailData, jSONObject2), hrl.a(jSONObject).data));
    }

    public final void e(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf682e5", new Object[]{this, new Boolean(z)});
            return;
        }
        String b = pto.b(this.f24269a);
        ryr.b(this.b.d(), b, "gg_videoMutiTab_hitRate");
        HashMap hashMap = new HashMap();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("hitCache", str);
        ryr.d(this.b.d(), b, "gg_videoMutiTab_hitRate", hashMap);
    }

    public final boolean c(tg7 tg7Var, rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ad865c4", new Object[]{this, tg7Var, cVar})).booleanValue();
        }
        if (tg7Var == null) {
            return false;
        }
        ir9.b("CacheInterceptor", "fetchWithCache...");
        ntm k = ((IUsePreloadService) this.f24269a.getService(IUsePreloadService.class)).getConfig().k();
        if (k == null || !d(tg7Var.b(), tg7Var.d(), k)) {
            e(false);
            return false;
        } else if (!(k.e instanceof JSONObject) || !(k.d instanceof JSONObject)) {
            ir9.b("CacheInterceptor", "fetchWithCache，播控数据匹配");
            if (tg7Var.d() == null) {
                tg7Var.i(new HashMap());
            }
            tg7Var.d().put("needRequestCDN", Boolean.FALSE);
            e(true);
            return false;
        } else {
            ir9.b("CacheInterceptor", "fetchWithCache，detail数据匹配");
            this.b.h(cVar, b(null, (JSONObject) k.e, (JSONObject) k.d));
            e(true);
            return true;
        }
    }

    public final boolean d(String str, Map map, ntm ntmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16e04ae3", new Object[]{this, str, map, ntmVar})).booleanValue();
        }
        String str2 = ntmVar.b;
        if (wyr.a(map, ntmVar.h)) {
            if (TextUtils.equals(str, str2)) {
                ir9.b("CacheInterceptor", "preloadVideoMatched, 相同的内容Id:" + str);
                return true;
            } else if (!ntmVar.r && !ntmVar.j && TextUtils.equals(str, sg7.FAKE_CONTENT_ID)) {
                ir9.b("CacheInterceptor", "preloadVideoMatched, 预加载视频非缓存内容，请求推荐内容匹配");
                return true;
            }
        }
        return false;
    }
}
