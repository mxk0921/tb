package com.alibaba.android.icart.core.performance.cache;

import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MtopResponse;
import tb.c9x;
import tb.fsb;
import tb.hav;
import tb.n8v;
import tb.na3;
import tb.op6;
import tb.qa3;
import tb.smc;
import tb.t2o;
import tb.u55;
import tb.vav;
import tb.w55;
import tb.zv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CartFirstPageCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile CartGlobal sCartGlobalCache;
    private static volatile op6 sDataCache;
    private static byte[] sFirstPageCacheByteData;
    private static volatile fsb sIdmContext;
    private static volatile MtopResponse sMtopResponse;
    private static String TAG = "CartFirstPageCache";
    private static volatile JSONObject sFirstPageCacheData = null;
    private static boolean sIsFinished = false;
    private static final AtomicBoolean sHasStart = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final fsb f2212a;

        static {
            t2o.a(479199500);
        }

        public /* synthetic */ b(fsb fsbVar, MtopResponse mtopResponse, a aVar) {
            this(fsbVar, mtopResponse);
        }

        public b(fsb fsbVar, MtopResponse mtopResponse) {
            this.f2212a = fsbVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(479199501);
        }

        public abstract void a(String str);

        public abstract void b(b bVar);
    }

    static {
        t2o.a(479199497);
    }

    public static /* synthetic */ byte[] access$002(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e1492fdd", new Object[]{bArr});
        }
        sFirstPageCacheByteData = bArr;
        return bArr;
    }

    public static /* synthetic */ boolean access$102(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        sIsFinished = z;
        return z;
    }

    public static /* synthetic */ JSONObject access$202(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b6d67075", new Object[]{jSONObject});
        }
        sFirstPageCacheData = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ fsb access$302(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsb) ipChange.ipc$dispatch("395a2c9a", new Object[]{fsbVar});
        }
        sIdmContext = fsbVar;
        return fsbVar;
    }

    public static /* synthetic */ MtopResponse access$402(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("1f66b99", new Object[]{mtopResponse});
        }
        sMtopResponse = mtopResponse;
        return mtopResponse;
    }

    public static /* synthetic */ CartGlobal access$502(CartGlobal cartGlobal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartGlobal) ipChange.ipc$dispatch("8bbca618", new Object[]{cartGlobal});
        }
        sCartGlobalCache = cartGlobal;
        return cartGlobal;
    }

    public static void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
            return;
        }
        sFirstPageCacheData = null;
        sFirstPageCacheByteData = null;
        sDataCache = null;
        sMtopResponse = null;
        sIdmContext = null;
    }

    public static CartGlobal getAndRemoveCartGlobal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartGlobal) ipChange.ipc$dispatch("8faebcb1", new Object[0]);
        }
        CartGlobal cartGlobal = sCartGlobalCache;
        sCartGlobalCache = null;
        return cartGlobal;
    }

    public static op6 getAndRemoveDataCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (op6) ipChange.ipc$dispatch("a7a71b1", new Object[0]);
        }
        op6 op6Var = sDataCache;
        sDataCache = null;
        return op6Var;
    }

    public static fsb getAndRemoveDmContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsb) ipChange.ipc$dispatch("fe2955a8", new Object[0]);
        }
        fsb fsbVar = sIdmContext;
        sIdmContext = null;
        return fsbVar;
    }

    public static byte[] getAndRemoveFirstPageCacheByteData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8500413c", new Object[0]);
        }
        byte[] bArr = sFirstPageCacheByteData;
        sFirstPageCacheByteData = null;
        return bArr;
    }

    public static JSONObject getAndRemoveFirstPageCacheData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8c5f75b9", new Object[0]);
        }
        JSONObject jSONObject = sFirstPageCacheData;
        sFirstPageCacheData = null;
        return jSONObject;
    }

    public static MtopResponse getAndRemoveMtopResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("28949f26", new Object[0]);
        }
        MtopResponse mtopResponse = sMtopResponse;
        sMtopResponse = null;
        return mtopResponse;
    }

    public static boolean hasPreloadFinishedAndDataValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("348c4b27", new Object[0])).booleanValue();
        }
        if (!sIsFinished || sMtopResponse == null || sIdmContext == null) {
            return false;
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements n8v.c<byte[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f2210a;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.android.icart.core.performance.cache.CartFirstPageCache$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class C0068a implements smc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0068a() {
            }

            @Override // tb.smc
            public void a(MtopResponse mtopResponse, boolean z, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d7688b66", new Object[]{this, mtopResponse, new Boolean(z), map});
                    return;
                }
                hav.d(c9x.CART_BIZ_NAME, "预加载首页缓存失败");
                CartFirstPageCache.access$102(true);
                a.this.f2210a.a("ExecuteFailed");
            }

            @Override // tb.smc
            public void b(MtopResponse mtopResponse, fsb fsbVar, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("53fb2e9b", new Object[]{this, mtopResponse, fsbVar, map});
                    return;
                }
                hav.d(c9x.CART_BIZ_NAME, "预加载首页缓存成功");
                try {
                    CartFirstPageCache.access$102(true);
                    CartFirstPageCache.access$302(fsbVar);
                    CartFirstPageCache.access$402(mtopResponse);
                    u55 u55Var = (u55) fsbVar;
                    JSONObject z = u55Var.z();
                    if (z == null) {
                        z = u55Var.v().g();
                    }
                    CartFirstPageCache.access$502(CartGlobal.parseCartGlobal(z.getJSONObject("global")));
                    if (mtopResponse != null) {
                        a.this.f2210a.b(new b(fsbVar, mtopResponse, null));
                    } else {
                        a.this.f2210a.a("MtopResponseIsNull");
                    }
                } catch (Throwable th) {
                    hav.b(c9x.CART_BIZ_NAME, "首屏缓存获取失败", th.getMessage());
                }
            }
        }

        public a(c cVar) {
            this.f2210a = cVar;
        }

        @Override // tb.n8v.c
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            } else {
                this.f2210a.a(str);
            }
        }

        /* renamed from: a */
        public void onSuccess(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2663c9b2", new Object[]{this, bArr});
                return;
            }
            try {
                CartFirstPageCache.access$002(bArr);
                if (bArr == null) {
                    CartFirstPageCache.access$102(true);
                    this.f2210a.a("FirstPageCacheByteDataIsNull");
                    return;
                }
                JSONObject jSONObject = (JSONObject) JSON.parseObject(bArr, JSONObject.class, new Feature[0]);
                qa3.c(TBMainHost.b().getContext(), jSONObject);
                CartFirstPageCache.access$202(jSONObject);
                new w55(Globals.getApplication()).f(false).a(jSONObject, new zv.a().b(bArr), new C0068a());
            } catch (Throwable th) {
                this.f2210a.a("ExecuteException");
                hav.b(c9x.CART_BIZ_NAME, "首屏缓存获取异常", th.getMessage());
            }
        }
    }

    public static void loadFirstPageCacheData(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fb4278", new Object[]{cVar});
        } else if (sHasStart.getAndSet(true)) {
            hav.d(TAG, "skip");
        } else {
            hav.d(TAG, "预加载首屏缓存");
            if (sFirstPageCacheByteData == null) {
                try {
                    if (sDataCache == null) {
                        sDataCache = new op6(Globals.getApplication());
                    }
                    sDataCache.c(vav.a(c9x.CART_BIZ_NAME, na3.sGetCacheDataOnSameThread, true), new a(cVar));
                } catch (Exception unused) {
                    cVar.a("loadFirstPageCacheDataException");
                }
            }
        }
    }
}
