package com.taobao.android.fluid.framework.preload.task;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ar9;
import tb.atb;
import tb.e9b;
import tb.ejf;
import tb.eub;
import tb.g7m;
import tb.g8w;
import tb.grm;
import tb.hnn;
import tb.ir9;
import tb.lv7;
import tb.ntm;
import tb.nwv;
import tb.od0;
import tb.omm;
import tb.ryr;
import tb.sg7;
import tb.sv2;
import tb.t2o;
import tb.usm;
import tb.vrl;
import tb.vt6;
import tb.wbd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class BasePreloadTaskImpl implements IPreloadTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f7899a;
    public final Context b;
    public final FluidContext c;
    public boolean d = false;
    public ntm e;
    public final JSONObject f;
    public boolean g;
    public final int h;
    public Map<String, Object> i;
    public final grm j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ntm f7900a;

        public a(BasePreloadTaskImpl basePreloadTaskImpl, ntm ntmVar) {
            this.f7900a = ntmVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                return;
            }
            ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "onComplete下载首帧");
            this.f7900a.m = bitmapDrawable;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements eub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.eub
        public void onVideoRecycled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3803834", new Object[]{this});
                return;
            }
            ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "onVideoRecycled: " + BasePreloadTaskImpl.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements wbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f7902a;
        public final /* synthetic */ DetailCacheData b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Map f;
        public final /* synthetic */ sv2 g;

        public c(Map map, DetailCacheData detailCacheData, JSONObject jSONObject, boolean z, String str, Map map2, sv2 sv2Var) {
            this.f7902a = map;
            this.b = detailCacheData;
            this.c = jSONObject;
            this.d = z;
            this.e = str;
            this.f = map2;
            this.g = sv2Var;
        }

        @Override // tb.wbd
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                return;
            }
            ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]PickPreloadControllerNew,preDownload finish. downloadSize=" + i);
            Map map = this.f7902a;
            if (map != null) {
                map.put("downloadSize", String.valueOf(i));
            }
            if (i > 0) {
                ryr.d(BasePreloadTaskImpl.this.b, null, "gg_pickpreload_preDownload", this.f7902a);
            } else {
                FluidException.throwException(BasePreloadTaskImpl.this.c, ar9.PRELOAD_SERVICE_DOWNLOAD_VIDEO_ERROR);
                ryr.c(BasePreloadTaskImpl.this.b, null, "gg_pickpreload_preDownload", "length<=0", this.f7902a);
            }
            BasePreloadTaskImpl.this.o(this.b, this.c, this.d, this.e, this.f, this.f7902a, this.g);
        }

        @Override // tb.wbd
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.wbd
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageLoader.e f7903a;

        public d(BasePreloadTaskImpl basePreloadTaskImpl, ImageLoader.e eVar) {
            this.f7903a = eVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            } else {
                this.f7903a.onImageLoadFailed();
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
            } else {
                this.f7903a.onImageLoaded(bitmapDrawable);
            }
        }
    }

    static {
        t2o.a(468714691);
        t2o.a(468714699);
    }

    public BasePreloadTaskImpl(FluidContext fluidContext, Context context, JSONObject jSONObject, grm grmVar) {
        this.h = 1;
        this.c = fluidContext;
        this.b = context;
        this.f = jSONObject;
        this.j = grmVar;
        if (jSONObject != null) {
            this.f7899a = jSONObject.getJSONObject("extraParams");
            this.h = nwv.t(jSONObject.get("type"), 1);
        }
        ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo] init PreloadTask, this=" + this + ",mPreloadABConfig=" + grmVar);
    }

    public static /* synthetic */ void d(BasePreloadTaskImpl basePreloadTaskImpl, DetailCacheData detailCacheData, JSONObject jSONObject, boolean z, boolean z2, Map map, Map map2, sv2 sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd36daa", new Object[]{basePreloadTaskImpl, detailCacheData, jSONObject, new Boolean(z), new Boolean(z2), map, map2, sv2Var});
        } else {
            basePreloadTaskImpl.f(detailCacheData, jSONObject, z, z2, map, map2, sv2Var);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public void a(ntm ntmVar, sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d77ad0", new Object[]{this, ntmVar, sv2Var});
            return;
        }
        this.g = true;
        ntm ntmVar2 = this.e;
        if (ntmVar == ntmVar2) {
            if (ntmVar2 != null) {
                ntmVar2.b();
            }
            this.e = null;
        }
        ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "cancel preload Task:" + this);
        if (sv2Var != null) {
            sv2Var.a(this.e);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b8bf722", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = this.f;
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject != null) {
            return jSONObject.equals(jSONObject2);
        }
        return false;
    }

    public void e(DetailCacheData detailCacheData, Map map, boolean z, boolean z2, sv2<ntm> sv2Var) {
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c542aec9", new Object[]{this, detailCacheData, map, new Boolean(z), new Boolean(z2), sv2Var});
            return;
        }
        if (detailCacheData != null && detailCacheData.checkUpdateValidOrNot()) {
            z3 = true;
        }
        ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo] detail cache valid ? " + z3);
        if (z3) {
            this.d = true;
            f(detailCacheData, detailCacheData.getDetailResponseData(this.c), z, z2, map, null, sv2Var);
        } else if (this.j.l) {
            g(null, 15000, map, z, z2, sv2Var);
        }
    }

    public final void f(DetailCacheData detailCacheData, JSONObject jSONObject, boolean z, boolean z2, Map map, Map map2, sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6d7757", new Object[]{this, detailCacheData, jSONObject, new Boolean(z), new Boolean(z2), map, map2, sv2Var});
            return;
        }
        String h = hnn.h(jSONObject);
        if (TextUtils.isEmpty(h) && detailCacheData != null) {
            h = detailCacheData.getVideoResourceStr();
        }
        ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]dealCacheOrDetailData,  preDownload=" + z + " ; cacheData=" + detailCacheData + " videoResourceStr=" + h);
        if (TextUtils.isEmpty(h)) {
            l(null, null, jSONObject, h, detailCacheData, sv2Var);
        } else if (!z || !usm.o(this.j.f)) {
            o(detailCacheData, jSONObject, z2, h, map2, map, sv2Var);
        } else {
            ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]PickPreloadControllerNew,start preDownload");
            ryr.b(this.b, null, "gg_pickpreload_preDownload");
            lv7.c(this.b, "guangguang_pick", this.j.b, h, new c(map, detailCacheData, jSONObject, z2, h, map2, sv2Var));
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public ntm getPreloadVideoData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("d066531a", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public final int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public Map i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("785c604d", new Object[]{this});
        }
        return this.i;
    }

    public void l(atb atbVar, String str, Map map, String str2, DetailCacheData detailCacheData, sv2<ntm> sv2Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b90d31", new Object[]{this, atbVar, str, map, str2, detailCacheData, sv2Var});
            return;
        }
        StringBuilder sb = new StringBuilder("[preloadvideo]onCompleteWithDWInstance. idwInstance != null ");
        if (atbVar == null) {
            z = false;
        }
        sb.append(z);
        sb.append("  videoId:");
        sb.append(str);
        sb.append(" mCanceled=");
        sb.append(this.g);
        ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", sb.toString());
        if (!this.g) {
            k(new ntm(atbVar, str), map, str2, detailCacheData, sv2Var);
            return;
        }
        ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "Task canceld:" + this);
    }

    public void m(sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e396e696", new Object[]{this, sv2Var});
            return;
        }
        ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "preloadTask onFailed " + this);
        sv2Var.a(null);
    }

    public void n(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f009b2", new Object[]{this, str, obj});
            return;
        }
        if (this.i == null) {
            this.i = new HashMap();
        }
        this.i.put(str, obj);
    }

    public void o(DetailCacheData detailCacheData, JSONObject jSONObject, boolean z, String str, Map map, Map map2, sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("469c3574", new Object[]{this, detailCacheData, jSONObject, new Boolean(z), str, map, map2, sv2Var});
            return;
        }
        String e = vrl.e(str);
        ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]useCreateDWInstance videoId=" + e + " createPlayer=" + z);
        Pair<atb, String> pair = new Pair<>(null, e);
        if (z) {
            pair = omm.a(this.c, this.b, true, e, null, str, null, map, detailCacheData);
            if (pair.first == null) {
                FluidException.throwException(this.c, ar9.CREATE_DWINSTANCE_ERROR);
            }
        }
        l((atb) pair.first, (String) pair.second, jSONObject, str, detailCacheData, sv2Var);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreloadTask: {type=" + this.h + ", preloadArgs=" + this.f + '}';
    }

    public boolean h(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1f0aa69", new Object[]{this, map})).booleanValue();
        }
        try {
            JSONObject jSONObject = ((JSONObject) map).getJSONObject("data").getJSONArray("sectionList").getJSONObject(0);
            return ejf.f(new com.taobao.android.fluid.framework.data.datamodel.a(hnn.e(jSONObject), jSONObject).e(), true);
        } catch (Throwable th) {
            ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "filerAD failed:" + th.getMessage());
            return false;
        }
    }

    public void k(ntm ntmVar, Map map, String str, DetailCacheData detailCacheData, sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebc22f5", new Object[]{this, ntmVar, map, str, detailCacheData, sv2Var});
            return;
        }
        ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]preloadTask onCompleted.  preloadedVideo: " + ntmVar);
        if (!this.g && ntmVar != null) {
            ntmVar.h = this.f7899a;
            ntmVar.i(str);
            String str2 = null;
            if (map != null) {
                try {
                    JSONArray d2 = vt6.d((JSONObject) map, "data", "sectionList");
                    ntmVar.d = (d2 == null || d2.isEmpty()) ? null : d2.getJSONObject(0);
                    ntmVar.e = map;
                    ntmVar.g = (JSONObject) ((JSONObject) map).getJSONObject("data").get("config");
                } catch (Throwable th) {
                    FluidException.throwException(this.c, ar9.COMPLETE_PARSE_VIDEO_RES_ERROR, th);
                    ir9.c("PickPreloadController_BasePreloadTask_PreloadVideoModule", th.getMessage(), th);
                }
            }
            if (this instanceof IconStreamPreloadTask) {
                ntmVar.p = true;
            }
            if (this instanceof e9b) {
                ntmVar.s = true;
                ntmVar.q = true;
            }
            if (this.j.j) {
                if (map != null) {
                    str2 = hnn.g((JSONObject) map);
                }
                if (TextUtils.isEmpty(str2) && str != null) {
                    str2 = vrl.b(str);
                }
            }
            if (str2 != null) {
                j(this.b, str2, new a(this, ntmVar));
            }
            ntmVar.l = str2;
            ntmVar.t = detailCacheData;
            if (ntmVar.f24942a != null) {
                ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "watchDWInstanceRecycled: " + ntmVar);
                ntmVar.f24942a.A(new b());
            }
            this.e = ntmVar;
            if (sv2Var != null) {
                ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]execute back,preloadVideoData=" + this.e + " , this=" + this);
                sv2Var.a(this.e);
            }
        }
    }

    public void g(final JSONObject jSONObject, int i, final Map map, final boolean z, final boolean z2, final sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabe4661", new Object[]{this, jSONObject, new Integer(i), map, new Boolean(z), new Boolean(z2), sv2Var});
            return;
        }
        ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]fetchContentDetail requestRecommendDetail preloadWithDetail");
        ryr.b(this.b, null, "gg_pickpreload_request_detail");
        n("status_request_detail", Boolean.TRUE);
        g8w.g(jSONObject, sg7.FAKE_CONTENT_ID, false, true, i > 0 ? i : 15000, null, true, new IRemoteBaseListener() { // from class: com.taobao.android.fluid.framework.preload.task.BasePreloadTaskImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]requestRecommendDetail onError,code:" + mtopResponse.getRetCode());
                BasePreloadTaskImpl.this.m(sv2Var);
                FluidException.throwException(BasePreloadTaskImpl.this.c, ar9.PRELOAD_WITH_DETAIL_ERROR, mtopResponse.getRetCode());
                ryr.c(BasePreloadTaskImpl.this.b, null, "gg_pickpreload_request_detail", mtopResponse.getRetCode(), map);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    return;
                }
                ryr.d(BasePreloadTaskImpl.this.b, null, "gg_pickpreload_request_detail", map);
                BasePreloadTaskImpl.d(BasePreloadTaskImpl.this, null, JSON.parseObject(new String(mtopResponse.getBytedata())), z, z2, map, jSONObject, sv2Var);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                ir9.b("PickPreloadController_BasePreloadTask_PreloadVideoModule", "[preloadvideo]fetchContentDetail requestRecommendDetail onSystemError");
                BasePreloadTaskImpl.this.m(sv2Var);
                FluidException.throwException(BasePreloadTaskImpl.this.c, ar9.PRELOAD_WITH_DETAIL_ERROR, mtopResponse.getRetCode());
                ryr.c(BasePreloadTaskImpl.this.b, null, "gg_pickpreload_request_detail", mtopResponse.getRetCode(), map);
            }
        }, this.c);
    }

    public final void j(Context context, String str, ImageLoader.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("650d6f2a", new Object[]{this, context, str, eVar});
        } else if (!TextUtils.isEmpty(str)) {
            ImageLoader.b d2 = ImageLoader.b.d(0, ImageAdapter.IMAGE_QUALITY_Q90, "", "", g7m.image_test_biz_name, 9103, ImageLoader.Scene.FIRST_FRAME);
            String b2 = od0.D().a().b(str, 1200, 1200, d2);
            od0.D().a().c(new ImageLoader.c(null, context, b2, b2, 1200, 1200, d2, false), new d(this, eVar));
        }
    }
}
