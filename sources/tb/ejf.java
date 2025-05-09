package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ejf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18614a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements wbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18615a;

        public a(String str) {
            this.f18615a = str;
        }

        @Override // tb.wbd
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                return;
            }
            ir9.b("PickPreloadController_InternalDetailCacheController", "preDownloadCurrent =====>" + this.f18615a + " onfinish size=" + i);
            if (i <= 0) {
                ir9.b("PickPreloadController_InternalDetailCacheController", "preDownloadCurrent 下载失败，清除缓存后return");
            }
        }

        @Override // tb.wbd
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                return;
            }
            ir9.a("PickPreloadController_InternalDetailCacheController", "preDownloadCurrent ------" + this.f18615a + " onProgress。 i = " + i);
        }

        @Override // tb.wbd
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                return;
            }
            ir9.b("PickPreloadController_InternalDetailCacheController", "preDownloadCurrent IPreDownloadListener.onstart id=" + this.f18615a + " s=" + str);
        }
    }

    static {
        t2o.a(468714710);
    }

    public static void a(FluidContext fluidContext, com.taobao.android.fluid.framework.data.datamodel.a aVar, List<DetailCacheData> list) {
        a.d e;
        DetailCacheData b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c8b61e", new Object[]{fluidContext, aVar, list});
        } else if (aVar != null && (e = aVar.e()) != null && !f(e, d()) && !e.g().hasExposed && (b = b(fluidContext, aVar)) != null) {
            list.add(b);
            ir9.b("PickPreloadController_InternalDetailCacheController", "[cachevideo]updateUnExposeDetailCache, newdata contentid:" + b.contentId);
        }
    }

    public static DetailCacheData b(FluidContext fluidContext, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        a.d e;
        a.e K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("c105fa27", new Object[]{fluidContext, aVar});
        }
        if (aVar == null || (e = aVar.e()) == null || (K = e.K()) == null) {
            return null;
        }
        DetailCacheData.a s = new DetailCacheData.a().n(fluidContext).o(e.O()).t(K.m()).q(K.e()).s(aVar);
        if (b93.i()) {
            s.r(e);
        }
        return s.m();
    }

    public static void c(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ad89505", new Object[]{context, str, str2, str3});
        } else if (usm.m()) {
            long j = hrm.a().b().b;
            if (j <= 0) {
                ir9.b("PickPreloadController_InternalDetailCacheController", "预下载大小小于0 return");
            } else {
                lv7.c(context, str2, j, str3, new a(str));
            }
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaad3b57", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableFilterUnexposedADVideo", true);
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d961772", new Object[]{str});
            return;
        }
        ir9.b("PickPreloadController_InternalDetailCacheController", "[cachevideo]exposedDeleteCacheData, contentId=" + str);
        qe7.a(str);
    }

    public static void g(FluidContext fluidContext, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        a.e K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31cdd21", new Object[]{fluidContext, aVar});
            return;
        }
        ISceneConfigService iSceneConfigService = (ISceneConfigService) fluidContext.getService(ISceneConfigService.class);
        if (iSceneConfigService != null) {
            pep sessionParams = iSceneConfigService.getSessionParams();
            if (sessionParams == null || aVar == null || aVar.e() == null) {
                ir9.b("PickPreloadController_InternalDetailCacheController", "preLoadNextVideo不满足条件，直接返回__");
                return;
            }
            a.d e = aVar.e();
            if (f(e, d())) {
                ir9.b("PickPreloadController_InternalDetailCacheController", "[cachevideo]saveMediaDataAndDownloadVideo, 广告内容，不缓存. " + e.O());
                return;
            }
            qe7.i(b(fluidContext, aVar));
            if (!aps.z() && (K = e.K()) != null && !TextUtils.isEmpty(K.m())) {
                c(fluidContext.getContext(), e.O(), sessionParams.c, K.m());
            }
        }
    }

    public static boolean h(FluidContext fluidContext, List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de3d1d25", new Object[]{fluidContext, list})).booleanValue();
        }
        if (!sz3.d(list)) {
            return false;
        }
        boolean i = aps.i();
        ArrayList arrayList = new ArrayList();
        if (i) {
            for (int i2 = 0; i2 < list.size() - 1; i2++) {
                a(fluidContext, list.get(i2), arrayList);
            }
        } else {
            for (int size = list.size() - 1; size >= 0; size--) {
                a(fluidContext, list.get(size), arrayList);
            }
        }
        qe7.k(arrayList);
        return !arrayList.isEmpty();
    }

    public static void i(FluidContext fluidContext, List<com.taobao.android.fluid.framework.data.datamodel.a> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48064fcd", new Object[]{fluidContext, list, new Integer(i)});
        } else if (list != null && list.size() > i && i >= 0 && h(fluidContext, list.subList(i, list.size())) && !f18614a) {
            ggs.e("TAB2_VIDEO_PRELOAD_STAGE", "cachedDetail");
            f18614a = true;
        }
    }

    public static boolean f(a.d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f31cd86c", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        if (dVar == null || dVar.g() == null || !dVar.y() || !"VIDEO".equalsIgnoreCase(dVar.g().type)) {
            return true;
        }
        if (!z || sz3.b(dVar.g().contentAdParams) || sz3.b(dVar.g().utPairs) || !TextUtils.equals(String.valueOf(dVar.g().utPairs.get("is_ad")), "1")) {
            a.e K = dVar.K();
            if (K != null) {
                if (TextUtils.equals(K.v(), "url")) {
                    return true;
                }
                String m = K.m();
                if (TextUtils.isEmpty(m) || TextUtils.equals(m, "null")) {
                    return true;
                }
            }
            return false;
        }
        ir9.b("PickPreloadController_InternalDetailCacheController", "PickPreloadControllerNew，当前视频是广告，跳过，contentid=" + dVar.f());
        return true;
    }
}
