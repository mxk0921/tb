package com.taobao.android.detail2.core.framework.data;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.biz.superitemcard.viewholder.SuperItemViewHolder;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.MtopResponse;
import tb.avn;
import tb.bf7;
import tb.btm;
import tb.bxj;
import tb.byj;
import tb.cxj;
import tb.dxj;
import tb.el8;
import tb.fr6;
import tb.gxq;
import tb.h5o;
import tb.hsm;
import tb.ja7;
import tb.kk8;
import tb.ktm;
import tb.ltm;
import tb.mp8;
import tb.nd2;
import tb.nyj;
import tb.o2r;
import tb.otm;
import tb.p0i;
import tb.pt1;
import tb.q0j;
import tb.r19;
import tb.rl8;
import tb.s0m;
import tb.sut;
import tb.t2o;
import tb.txj;
import tb.u0i;
import tb.ue7;
import tb.vnj;
import tb.wg7;
import tb.x3w;
import tb.ygj;
import tb.ynm;
import tb.yq0;
import tb.zgj;
import tb.zxu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailDataManager implements rl8<bf7> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RECOMMEND_ERROR_CODE_COMMON = 3;
    public static final int RECOMMEND_ERROR_CODE_ITEM_ID_EMPTY = 4;
    public static final int RECOMMEND_ERROR_CODE_LAST_PAGE = 1;
    public static final int RECOMMEND_ERROR_CODE_LOADING = 2;

    /* renamed from: a  reason: collision with root package name */
    public final cxj f7115a;
    public final RecInfoManager e;
    public d g;
    public boolean b = false;
    public boolean c = false;
    public h5o d = new h5o();
    public final HashMap<String, Integer> f = new HashMap<>();
    public final fr6 h = new fr6();
    public final HashMap<String, x3w> j = new HashMap<>();
    public boolean l = true;
    public final dxj i = x();
    public final otm k = ygj.d(H().B());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class LimitedQueue<E> extends LinkedList<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mLimit;

        static {
            t2o.a(352321775);
        }

        public LimitedQueue(int i) {
            this.mLimit = i;
        }

        public static String getComplexIdsString(LimitedQueue<mp8> limitedQueue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e0fed6e3", new Object[]{limitedQueue});
            }
            StringBuilder sb = new StringBuilder();
            Iterator<mp8> it = limitedQueue.iterator();
            while (it.hasNext()) {
                mp8 next = it.next();
                if (next != null) {
                    sb.append(",");
                    sb.append(next.c);
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(0);
            }
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object ipc$super(LimitedQueue limitedQueue, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -667118713) {
                return super.remove();
            }
            if (hashCode == 195222152) {
                return new Boolean(super.add(objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail2/core/framework/data/DetailDataManager$LimitedQueue");
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
            }
            super.add(e);
            while (size() > this.mLimit) {
                super.remove();
            }
            return true;
        }

        public String getAppendString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2e7e5f58", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (next != null) {
                    sb.append(",");
                    sb.append(next.toString());
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(0);
            }
            return sb.toString();
        }

        public void resetMaxSize(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("475db5e6", new Object[]{this, new Integer(i)});
            } else {
                this.mLimit = i;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ja7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;

        public a(boolean z) {
            this.c = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/data/DetailDataManager$1");
        }

        @Override // tb.ja7
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("638dfb32", new Object[]{this})).longValue();
            }
            return 2L;
        }

        @Override // tb.ja7
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "DataManager fetchRecommendListForNextPage";
        }

        @Override // tb.ja7
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
                return;
            }
            o2r.a("firstRequest1");
            if (!this.c) {
                DetailDataManager.b(DetailDataManager.this, true);
            } else {
                DetailDataManager detailDataManager = DetailDataManager.this;
                detailDataManager.v(DetailDataManager.c(detailDataManager).u(), false, false, true);
            }
            o2r.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements RecInfoManager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7117a;
        public final /* synthetic */ d b;

        public c(String str, d dVar) {
            this.f7117a = str;
            this.b = dVar;
        }

        @Override // com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager.b
        public void a(boolean z, JSONArray jSONArray, JSONObject jSONObject, MtopResponse mtopResponse, String str) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7063c768", new Object[]{this, new Boolean(z), jSONArray, jSONObject, mtopResponse, str});
                return;
            }
            txj.e(txj.TAG_DATA, "NdInsertCard 实时插卡 onLoadSuccess requestToken:" + this.f7117a + " cbRequestToken:" + str);
            HashMap hashMap = new HashMap();
            if (jSONArray == null) {
                i = 0;
            } else {
                i = jSONArray.size();
            }
            hashMap.put("effectItemCount", String.valueOf(i));
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_INSERT_CARD_REQ_CALLBACK, hashMap);
            List<x3w> d = DetailDataManager.d(DetailDataManager.this, false, jSONObject, zxu.g(mtopResponse), jSONArray, this.b, true);
            DetailDataManager.e(DetailDataManager.this, jSONArray, d);
            d dVar = this.b;
            if (dVar != null) {
                dVar.c(false, DetailDataManager.this.D(false), jSONObject, d, -1, false);
            }
        }

        @Override // com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager.b
        public void b(boolean z, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1590bc2", new Object[]{this, new Boolean(z), new Integer(i), str});
                return;
            }
            d dVar = this.b;
            if (dVar != null) {
                dVar.e(false, i, 3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        boolean a(boolean z, String str, int i, x3w x3wVar);

        void b(boolean z, String str, x3w x3wVar, boolean z2);

        boolean c(boolean z, int i, JSONObject jSONObject, List<x3w> list, int i2, boolean z2);

        boolean d(boolean z, String str, int i, x3w x3wVar);

        void e(boolean z, int i, int i2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f7119a;
        public boolean b;

        static {
            t2o.a(352321776);
        }
    }

    static {
        t2o.a(352321767);
        t2o.a(723517460);
    }

    public DetailDataManager(cxj cxjVar) {
        o2r.a("init_DetailDataManager");
        this.f7115a = cxjVar;
        this.e = new RecInfoManager(cxjVar);
        e0();
        U();
        o2r.b();
    }

    public static boolean W(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92a3e675", new Object[]{new Boolean(z), new Integer(i)})).booleanValue();
        }
        if (z || i != 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean b(DetailDataManager detailDataManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b7a2e9d", new Object[]{detailDataManager, new Boolean(z)})).booleanValue();
        }
        detailDataManager.b = z;
        return z;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.global.a c(DetailDataManager detailDataManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("7875601e", new Object[]{detailDataManager});
        }
        return detailDataManager.H();
    }

    public static /* synthetic */ List d(DetailDataManager detailDataManager, boolean z, JSONObject jSONObject, String str, JSONArray jSONArray, d dVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3893fa7b", new Object[]{detailDataManager, new Boolean(z), jSONObject, str, jSONArray, dVar, new Boolean(z2)});
        }
        return detailDataManager.a0(z, jSONObject, str, jSONArray, dVar, z2);
    }

    public static /* synthetic */ void e(DetailDataManager detailDataManager, JSONArray jSONArray, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f41b5ea3", new Object[]{detailDataManager, jSONArray, list});
        } else {
            detailDataManager.p0(jSONArray, list);
        }
    }

    public static /* synthetic */ boolean f(DetailDataManager detailDataManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f5df1f", new Object[]{detailDataManager})).booleanValue();
        }
        return detailDataManager.c;
    }

    public static /* synthetic */ cxj g(DetailDataManager detailDataManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("8d53760b", new Object[]{detailDataManager});
        }
        return detailDataManager.f7115a;
    }

    public static /* synthetic */ ue7 i(DetailDataManager detailDataManager, JSONObject jSONObject, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ue7) ipChange.ipc$dispatch("4fa31d1d", new Object[]{detailDataManager, jSONObject, new Boolean(z), str});
        }
        return detailDataManager.z(jSONObject, z, str);
    }

    public static /* synthetic */ d j(DetailDataManager detailDataManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("cc3f069", new Object[]{detailDataManager});
        }
        return detailDataManager.g;
    }

    public static /* synthetic */ void k(DetailDataManager detailDataManager, boolean z, JSONArray jSONArray, JSONObject jSONObject, String str, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914f7dce", new Object[]{detailDataManager, new Boolean(z), jSONArray, jSONObject, str, new Integer(i), new Boolean(z2)});
        } else {
            detailDataManager.s(z, jSONArray, jSONObject, str, i, z2);
        }
    }

    public static /* synthetic */ void l(DetailDataManager detailDataManager, boolean z, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8aec3b", new Object[]{detailDataManager, new Boolean(z), str, str2, new Integer(i)});
        } else {
            detailDataManager.c0(z, str, str2, i);
        }
    }

    public static /* synthetic */ void m(DetailDataManager detailDataManager, boolean z, JSONArray jSONArray, JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb66504", new Object[]{detailDataManager, new Boolean(z), jSONArray, jSONObject, str, new Integer(i)});
        } else {
            detailDataManager.r(z, jSONArray, jSONObject, str, i);
        }
    }

    public x3w A(String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("6befada7", new Object[]{this, str, str2});
        }
        x3w y = y(false, null, str);
        if (y == null) {
            y = new ue7(H());
            y.h = str;
            y.b = str2;
            y.f31127a = 0;
            y.F = false;
            y.I = false;
            this.j.put(str, y);
        }
        if (!H().R().E) {
            jSONObject = ynm.m(ynm.i(H().R().t, H().R().x), String.valueOf(H().R().D), "generateFirstNodeWhenError");
        } else {
            jSONObject = ynm.g(ynm.a(str, H().R().x), "generateFirstNodeWhenError");
        }
        if (jSONObject != null) {
            y.k0(jSONObject, false);
            y.z = false;
            H().m0(y);
            return y;
        }
        JSONObject L = H().L();
        String E = H().E(str2);
        if (L == null || TextUtils.isEmpty(E) || gxq.EXP_ITEM_ARTICLE.equals(H().R().m)) {
            y.z = true;
        } else {
            y.t0(E, L);
            y.z = false;
        }
        return y;
    }

    public int D(boolean z) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9ebb5a0", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (z) {
            fVar = this.d.f20425a;
        } else {
            fVar = this.d.b;
        }
        return fVar.f7119a;
    }

    public LimitedQueue<String> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LimitedQueue) ipChange.ipc$dispatch("e29a6fbd", new Object[]{this});
        }
        return this.d.e;
    }

    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e04fb6c", new Object[]{this})).intValue();
        }
        return this.d.g;
    }

    public LimitedQueue<String> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LimitedQueue) ipChange.ipc$dispatch("f26598c5", new Object[]{this});
        }
        return this.d.c;
    }

    public final com.taobao.android.detail2.core.framework.data.global.a H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        return this.f7115a.j();
    }

    public x3w I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("28cd0d77", new Object[]{this, str});
        }
        return this.j.get(str);
    }

    public int J(boolean z) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c9b4203", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (z) {
            fVar = this.d.f20425a;
        } else {
            fVar = this.d.b;
        }
        return fVar.f7119a + 1;
    }

    public final byj K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byj) ipChange.ipc$dispatch("75ad75a4", new Object[]{this});
        }
        return H().N();
    }

    public otm L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otm) ipChange.ipc$dispatch("cc9877c9", new Object[]{this});
        }
        return this.k;
    }

    public final void M(JSONObject jSONObject, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6063345e", new Object[]{this, jSONObject, new Boolean(z), new Integer(i)});
        } else if (jSONObject != null && W(z, i)) {
            H().O0(jSONObject.getJSONObject(AtmosParams.KEY_ATMOS_FEED_PARAMS));
        }
    }

    public final void Q(bf7 bf7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fe53ea", new Object[]{this, bf7Var});
        } else if (bf7Var.d != null && H() != null) {
            String string = bf7Var.d.getString("operateType");
            String string2 = bf7Var.d.getString(VideoControllerManager.KEY_CACHEKEY);
            Object obj = bf7Var.d.get("cacheValue");
            if (TextUtils.equals(string, "set")) {
                H().Z0(string2, obj);
            } else if (TextUtils.equals(string, "get")) {
                Object y = H().y(string2);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(VideoControllerManager.KEY_CACHEKEY, (Object) string2);
                if (y != null) {
                    jSONObject2.put("cacheValue", y);
                }
                jSONObject.put("feedCacheCallback", (Object) jSONObject2);
                pt1.a aVar = bf7Var.b;
                if (aVar != null) {
                    aVar.a(jSONObject);
                }
            } else if (TextUtils.equals(string, "delete")) {
                H().c(string2);
            }
        }
    }

    @Override // tb.rl8
    public ThreadMode R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public final void S(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df93e08", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.e.t(jSONObject.getString("bizId"), jSONObject.getJSONObject("requestParams"));
        }
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6686f1", new Object[]{this});
        } else {
            el8.b(this.f7115a.h(), H().B(), kk8.a(bf7.class, ""), this);
        }
    }

    public boolean V(boolean z) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23d9b5d", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            fVar = this.d.f20425a;
        } else {
            fVar = this.d.b;
        }
        return fVar.b;
    }

    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94117106", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void Y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812d7339", new Object[]{this, new Boolean(z)});
            return;
        }
        dxj dxjVar = this.i;
        if (dxjVar != null) {
            dxjVar.d(z);
        }
    }

    public final List<x3w> Z(boolean z, JSONObject jSONObject, String str, JSONArray jSONArray, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d5441456", new Object[]{this, new Boolean(z), jSONObject, str, jSONArray, dVar});
        }
        return a0(z, jSONObject, str, jSONArray, dVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<tb.x3w> a0(boolean r25, com.alibaba.fastjson.JSONObject r26, java.lang.String r27, com.alibaba.fastjson.JSONArray r28, com.taobao.android.detail2.core.framework.data.DetailDataManager.d r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.data.DetailDataManager.a0(boolean, com.alibaba.fastjson.JSONObject, java.lang.String, com.alibaba.fastjson.JSONArray, com.taobao.android.detail2.core.framework.data.DetailDataManager$d, boolean):java.util.List");
    }

    public final void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1687bf7", new Object[]{this});
            return;
        }
        this.h.b("item", ue7.y0());
        this.h.b(SuperItemViewHolder.VIEWHOLDER_KEY, ue7.y0());
    }

    public void f0(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("495eefaa", new Object[]{this, dVar});
        } else {
            this.g = dVar;
        }
    }

    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306d5460", new Object[]{this});
            return;
        }
        f fVar = this.d.b;
        fVar.f7119a = -1;
        fVar.b = false;
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4451d9", new Object[]{this});
            return;
        }
        f fVar = this.d.f20425a;
        fVar.f7119a = -1;
        fVar.b = false;
    }

    public void j0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be62fa7", new Object[]{this, new Boolean(z)});
        } else if (z) {
            f fVar = this.d.f20425a;
            fVar.f7119a--;
            fVar.b = false;
        } else {
            f fVar2 = this.d.b;
            fVar2.f7119a--;
            fVar2.b = false;
        }
    }

    public void k0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b1e1ef", new Object[]{this, new Long(j)});
        } else if (H() != null) {
            H().e1(j);
        }
    }

    public void l0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852f2e85", new Object[]{this, new Integer(i)});
        } else {
            this.d.g = i;
        }
    }

    public final void n() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0478d06", new Object[]{this});
            return;
        }
        bxj h = this.f7115a.h();
        try {
            Activity i = this.f7115a.i();
            if (i == null) {
                intent = null;
            } else {
                intent = i.getIntent();
            }
            if (intent == null) {
                q0j.a(h, "extraFrameAnimNdReason", "activityIntentIsNull");
                return;
            }
            String stringExtra = intent.getStringExtra("extraFrameAnimType");
            String stringExtra2 = intent.getStringExtra("extraFrameAnimReason");
            String stringExtra3 = intent.getStringExtra("extraFrameAnimHitFixed");
            String stringExtra4 = intent.getStringExtra("extraFrameAnimNdReason");
            if (stringExtra != null) {
                q0j.a(h, "extraFrameAnimType", stringExtra);
            }
            if (stringExtra2 != null) {
                q0j.a(h, "extraFrameAnimReason", stringExtra2);
            }
            if (stringExtra3 != null) {
                q0j.a(h, "extraFrameAnimHitFixed", stringExtra3);
            }
            if (stringExtra4 != null) {
                q0j.a(h, "extraFrameAnimNdReason", stringExtra4);
            }
        } catch (Exception e2) {
            q0j.a(h, "extraFrameAnimNdReason", "ndAddPropertyError:" + e2.getCause());
        }
    }

    public final void n0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e966d2c", new Object[]{this, str});
            return;
        }
        zgj.a a2 = zgj.a(str);
        if (a2 != null && a2.c != -1) {
            zgj.b(str);
            q0j.a(this.f7115a.h(), "preRequestReadNum", Integer.valueOf(a2.d));
            q0j.y(this.f7115a.h(), q0j.SECTION_START_REQUEST_TO_CLICK, sut.a(a2.c), "");
            q0j.x(this.f7115a.h(), q0j.SECTION_START_REQUEST_TO_CLICK, "");
            long j = a2.c;
            q0j.w(this.f7115a.h(), q0j.SECTION_OPEN_IMMED_HP_TO_REAL_REQUEST, sut.a(j), "");
            nyj.z().N(this.f7115a.j().G(), "preRequestEndTs", Long.valueOf(j));
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c098cd", new Object[]{this, new Integer(i)});
            return;
        }
        this.d.g += i;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        RecInfoManager recInfoManager = this.e;
        if (recInfoManager != null) {
            recInfoManager.m();
        }
        this.g = null;
    }

    public final void q0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8434eaf", new Object[]{this, str, str2});
            return;
        }
        q0j.q("recommend", q0j.ERROR_CODE_RECOMMEND_SECTION_DUPLICATE_ID, "推荐数据sectionList里面有重复的id" + str, H().T(), "", str2);
    }

    public final void r(boolean z, JSONArray jSONArray, JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f909327", new Object[]{this, new Boolean(z), jSONArray, jSONObject, str, new Integer(i)});
        } else {
            s(z, jSONArray, jSONObject, str, i, false);
        }
    }

    public final void r0(List<x3w> list) {
        x3w x3wVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c267e74", new Object[]{this, list});
            return;
        }
        H().c1(H().F0());
        if (list != null) {
            if (list.size() > 1) {
                H().f1(true);
            }
            if (list.size() > 0 && (x3wVar = list.get(0)) != null && H().B0()) {
                bxj h = this.f7115a.h();
                if (!H().J0(0, x3wVar.b) && !H().K0(0, x3wVar.b)) {
                    z = false;
                }
                q0j.a(h, "halfScreenGuide", Boolean.valueOf(z));
            }
        }
    }

    public final void s0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a039cb8d", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("serverAPMParams")) != null) {
            for (String str : jSONObject2.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    q0j.a(this.f7115a.h(), str, jSONObject2.getString(str));
                }
            }
        }
    }

    public void t(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1720c8f8", new Object[]{this, str, new Boolean(z)});
        } else {
            u(str, z, false);
        }
    }

    public final void t0(x3w x3wVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6b477e", new Object[]{this, x3wVar, str, new Integer(i), str2});
        } else if (!(x3wVar instanceof ue7) || !((ue7) x3wVar).O0()) {
        } else {
            if (!"0".equals(str) || i != 0) {
                q0j.q(q0j.SCENE_WEEX_CONTAINER, q0j.ERROR_CODE_SERVER_WEEX_URL_NULL, "非首卡服务端下发weexurl为空", this.f7115a.j().T(), "", str2);
            } else {
                q0j.q(q0j.SCENE_WEEX_CONTAINER, q0j.ERROR_CODE_FIRST_SERVER_WEEX_URL_NULL, "首卡服务端下发weexurl为空", this.f7115a.j().T(), "", str2);
            }
        }
    }

    public void u(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf908dc", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
        } else {
            v(str, z, z2, false);
        }
    }

    public final dxj x() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dxj) ipChange.ipc$dispatch("e25a6cc4", new Object[]{this});
        }
        Activity i = this.f7115a.i();
        if (i == null || (intent = i.getIntent()) == null) {
            return null;
        }
        return yq0.c(intent.getData());
    }

    public final x3w y(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("8db2f858", new Object[]{this, new Boolean(z), str, str2});
        }
        if (!z) {
            return this.j.get(str2);
        }
        x3w remove = this.j.remove(str);
        this.j.put(str2, remove);
        return remove;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements RecInfoManager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7116a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a extends ja7 {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ MtopResponse c;
            public final /* synthetic */ boolean d;
            public final /* synthetic */ JSONArray e;
            public final /* synthetic */ JSONObject f;

            public a(MtopResponse mtopResponse, boolean z, JSONArray jSONArray, JSONObject jSONObject) {
                this.c = mtopResponse;
                this.d = z;
                this.e = jSONArray;
                this.f = jSONObject;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/data/DetailDataManager$2$1");
            }

            @Override // tb.ja7
            public String b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
                }
                return "DetailDataManager nextPage directProcessLoadSuccess";
            }

            @Override // tb.ja7
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9425d337", new Object[]{this});
                    return;
                }
                o2r.a("directProcessLoadSuccess1");
                String g = zxu.g(this.c);
                b bVar = b.this;
                DetailDataManager.m(DetailDataManager.this, this.d, this.e, this.f, g, bVar.e);
                o2r.b();
            }
        }

        public b(String str, String str2, String str3, boolean z, int i, String str4) {
            this.f7116a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = i;
            this.f = str4;
        }

        @Override // com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager.b
        public void b(boolean z, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1590bc2", new Object[]{this, new Boolean(z), new Integer(i), str});
                return;
            }
            nyj.z().d(this.f7116a, "processFailedData", this.b);
            DetailDataManager.l(DetailDataManager.this, z, str, this.f, this.e);
            nyj.z().t(this.f7116a, "processFailedData", true, this.b);
            nyj.z().u(this.f7116a, this.b, "ndRequestData", false);
        }

        @Override // com.taobao.android.detail2.core.framework.data.net.recommend.RecInfoManager.b
        public void a(boolean z, JSONArray jSONArray, JSONObject jSONObject, MtopResponse mtopResponse, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7063c768", new Object[]{this, new Boolean(z), jSONArray, jSONObject, mtopResponse, str});
                return;
            }
            nyj.z().d(this.f7116a, "processSuccessData", this.b);
            o2r.a("onLoadSuccess");
            txj.e(txj.TAG_DATA, "NdInsertCard 下一页请求 onLoadSuccess nextPageRequestToken:" + this.c + " cbRequestToken:" + str);
            if (DetailDataManager.g(DetailDataManager.this) == null || DetailDataManager.g(DetailDataManager.this).l() == null || !DetailDataManager.g(DetailDataManager.this).l().e() || (!this.d ? !DetailDataManager.g(DetailDataManager.this).j().N().k() : !DetailDataManager.g(DetailDataManager.this).j().N().j())) {
                o2r.a("directProcessLoadSuccess2");
                DetailDataManager.m(DetailDataManager.this, z, jSONArray, jSONObject, zxu.g(mtopResponse), this.e);
                o2r.b();
            } else {
                DetailDataManager.g(DetailDataManager.this).l().b(new a(mtopResponse, z, jSONArray, jSONObject));
            }
            o2r.b();
            nyj.z().t(this.f7116a, "processSuccessData", true, this.b);
            nyj.z().u(this.f7116a, this.b, "ndRequestData", true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements NavPreRequestManager.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f7118a;
        public final boolean b;

        static {
            t2o.a(352321774);
            t2o.a(352322196);
        }

        public e(boolean z, boolean z2) {
            this.b = z2;
            this.f7118a = z;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6465eaef", new Object[]{this, jSONObject});
            } else {
                b(jSONObject);
            }
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("309c1f6", new Object[]{this, str});
            } else {
                DetailDataManager.l(DetailDataManager.this, false, str, "", 0);
            }
        }

        public void d(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5b208b7", new Object[]{this, jSONObject, str});
            } else if (this.f7118a) {
                o2r.a("onRealDataSuccess");
                o2r.b();
                txj.e(txj.TAG_RENDER, "onRealDataSuccess");
                if (jSONObject != null) {
                    DetailDataManager.k(DetailDataManager.this, false, jSONObject.getJSONArray("sectionList"), jSONObject, str, 0, true);
                }
            }
        }

        public final void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80bfb9af", new Object[]{this, jSONObject});
            } else if (this.b) {
                o2r.a("onOpenImmedDataSuccess");
                o2r.b();
                txj.e(txj.TAG_RENDER, "onOpenImmedDataSuccess");
                if (jSONObject == null) {
                    txj.e(txj.TAG_RENDER, "onOpenImmedDataSuccess data == null return");
                } else if (DetailDataManager.c(DetailDataManager.this).D0()) {
                    txj.e(txj.TAG_RENDER, "onOpenImmedDataSuccess , but now isOpenImmediatelyMode return");
                } else if (DetailDataManager.f(DetailDataManager.this)) {
                    txj.e(txj.TAG_RENDER, "onOpenImmedDataSuccess , 正式请求已经返回，不处理");
                } else {
                    q0j.a(DetailDataManager.g(DetailDataManager.this).h(), "navOpenImmedValid", "true");
                    ktm a2 = ltm.a("new_detail");
                    String a3 = ynm.a(DetailDataManager.c(DetailDataManager.this).u(), DetailDataManager.c(DetailDataManager.this).R().x);
                    JSONObject jSONObject2 = jSONObject.getJSONObject(DetailDataManager.c(DetailDataManager.this).u());
                    a2.d(new btm.b().n("preload").l("low").m(a3).o(jSONObject2).p("NDNavPre").k());
                    DetailDataManager detailDataManager = DetailDataManager.this;
                    ue7 i = DetailDataManager.i(detailDataManager, jSONObject2, true, DetailDataManager.c(detailDataManager).u());
                    i.r0(x3w.l0);
                    p0i p0iVar = i.w0;
                    if (p0iVar != null && ((ArrayList) p0iVar.b).size() > 0) {
                        u0i u0iVar = (u0i) ((ArrayList) i.w0.b).get(0);
                        if (u0iVar != null) {
                            String d = hsm.d(DetailDataManager.g(DetailDataManager.this).i(), u0iVar.d(), i.Q0());
                            s0m.B().T(d).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).heightScale(i.Q0()).fetch();
                            txj.e(txj.TAG_RENDER, "onOpenImmedDataSuccess 发起首张图片图片预加载: " + d);
                        }
                        q0j.a(DetailDataManager.g(DetailDataManager.this).h(), "navOpenImmedHasPic", Boolean.valueOf(i.w0.d));
                    }
                    if (DetailDataManager.j(DetailDataManager.this) != null) {
                        DetailDataManager.j(DetailDataManager.this).b(true, DetailDataManager.c(DetailDataManager.this).u(), i, false);
                    }
                }
            }
        }
    }

    public final void P(bf7 bf7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d12b260a", new Object[]{this, bf7Var});
        } else if (bf7Var != null && bf7Var.d != null) {
            avn avnVar = new avn(bf7Var.d);
            if (!avnVar.c()) {
                wg7.b("handleFeedRefresh", "parse DetailDataManagerEvent error" + bf7Var.d);
                return;
            }
            this.f7115a.j().j1(avnVar);
            i0();
            h0();
            t(H().u(), false);
        }
    }

    public final void a() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        try {
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b46c4ccd", new Object[]{this});
                return;
            }
            try {
                txj.e(txj.TAG_RENDER, "try Lock. abandonOpenImmedRequest");
                z = NavPreRequestManager.l().m().tryLock(1000L, TimeUnit.MILLISECONDS);
                if (z) {
                    txj.e(txj.TAG_RENDER, "Lock acquired. abandonOpenImmedRequest");
                    NavPreRequestManager.l().a(H().G());
                }
                if (!z) {
                    return;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                txj.e(txj.TAG_RENDER, "abandonOpenImmedRequest Thread was interrupted.");
                if (!z) {
                    return;
                }
            }
            NavPreRequestManager.l().m().unlock();
        } catch (Throwable th) {
            if (z) {
                NavPreRequestManager.l().m().unlock();
            }
            throw th;
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9563f6e", new Object[]{this});
            return;
        }
        String G = H().G();
        if (B()) {
            ygj.b(H().B());
            q0j.a(this.f7115a.h(), "immediatelyDataHit", "true");
            nyj.z().N(G, "immediatelyDataHit", "true");
            this.l = false;
        } else if (com.taobao.android.detail2.core.framework.data.global.a.NO_ID_DEFAULT.equals(H().u())) {
            q0j.a(this.f7115a.h(), "immediatelyNoId", "true");
            nyj.z().N(G, "immediatelyNoId", "true");
        } else {
            q0j.a(this.f7115a.h(), "immediatelyDataHit", "false");
            nyj.z().N(G, "immediatelyDataHit", "false");
            C();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0113, code lost:
        r3 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0115, code lost:
        if (r3 == null) goto L_0x0024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0119, code lost:
        if (r1.c != null) goto L_0x011d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        r3 = r9.d.c.indexOf(r3.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0127, code lost:
        if (r3 < 0) goto L_0x0024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0131, code lost:
        if (r3 >= r9.d.c.size()) goto L_0x0024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013b, code lost:
        if (r3 < r9.d.e.size()) goto L_0x013f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013f, code lost:
        r9.j.remove(r1.b.h);
        r4 = r9.j;
        r5 = r1.c;
        r4.put(r5.h, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0151, code lost:
        if (r10 == false) goto L_0x018e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0153, code lost:
        r4 = new tb.mp8();
        r5 = r1.c;
        r4.f24203a = r5.h;
        r4.b = r5.L("_");
        r4.c = r1.c.i;
        r2 = r9.d.f.indexOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
        if (r2 < 0) goto L_0x0187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017c, code lost:
        if (r2 < r9.d.f.size()) goto L_0x017f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017f, code lost:
        r9.d.f.set(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0187, code lost:
        r9.d.f.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018e, code lost:
        r9.d.c.remove(r1.b.h);
        r9.d.c.add(r3, r1.c.h);
        r9.d.e.remove(r1.b.c);
        r9.d.e.add(r3, r1.c.c);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5 A[Catch: Exception -> 0x0106, TryCatch #0 {Exception -> 0x0106, blocks: (B:40:0x00b3, B:43:0x00be, B:44:0x00d1, B:46:0x00e5, B:49:0x00f0, B:50:0x00fb), top: B:73:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fb A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d0(boolean r10, java.util.List<com.taobao.android.detail2.core.framework.view.feeds.DetailRecyclerViewAdapter.d> r11) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.data.DetailDataManager.d0(boolean, java.util.List):void");
    }

    public final void m0(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f2f99c", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("pageParams")) != null) {
            if ("y".equalsIgnoreCase(jSONObject2.getString("isLastPage"))) {
                if (z) {
                    this.d.f20425a.b = true;
                } else {
                    this.d.b.b = true;
                }
            }
            String string = jSONObject2.getString("pageNum");
            try {
                if (z) {
                    this.d.f20425a.f7119a = Integer.parseInt(string);
                } else {
                    this.d.b.f7119a = Integer.parseInt(string);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void o0(zgj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddbb161", new Object[]{this, aVar});
        } else if (aVar == null) {
            q0j.a(this.f7115a.h(), "preRequestStatus", 0);
            q0j.a(this.f7115a.h(), "preRequestPreStatus", 0);
        } else {
            q0j.a(this.f7115a.h(), "preRequestStatus", Integer.valueOf(aVar.b));
            q0j.a(this.f7115a.h(), "preRequestPreStatus", Integer.valueOf(aVar.f32757a));
        }
    }

    public final void p0(JSONArray jSONArray, List<x3w> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9331bf86", new Object[]{this, jSONArray, list});
            return;
        }
        int size = jSONArray == null ? 0 : jSONArray.size();
        if (list != null) {
            i = list.size();
        }
        if (i != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("ratio", String.valueOf(size / i));
            q0j.g("eventProcess", "Monitor_NewDetail_InsertCardRequestUseRatio_" + this.f7115a.j().p().a(), hashMap);
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_INSERT_CARD_REQUEST_USE_RATIO_NEW, hashMap);
        }
    }

    public void w(RecRequestParamsV2 recRequestParamsV2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f03458c", new Object[]{this, recRequestParamsV2, dVar});
            return;
        }
        String str = "realtime_insert_token_" + System.currentTimeMillis();
        txj.e(txj.TAG_DATA, "NdInsertCard 实时插卡的网络请求开始发起。requestToken:" + str);
        this.e.p(false, J(false), recRequestParamsV2, new c(str, dVar), false, true, str);
    }

    public final boolean B() {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532a3a2a", new Object[]{this})).booleanValue();
        }
        if (this.g == null) {
            return false;
        }
        if (!H().R().E) {
            str = ynm.i(H().R().t, H().R().x);
            jSONObject = ynm.m(str, String.valueOf(H().R().D), "generateOpenImmediatelyNodeNew");
        } else {
            str = ynm.a(H().u(), H().R().x);
            jSONObject = ynm.g(str, "generateOpenImmediatelyNodeNew");
        }
        if (jSONObject == null) {
            ygj.c(H().B());
            H().q0();
            zgj.a a2 = zgj.a(str);
            if (a2 != null && a2.b == 5) {
                zgj.c(str, 4);
            }
            o0(a2);
            n0(str);
            return false;
        }
        if (!jSONObject.containsKey("hasVisitPreRequest")) {
            jSONObject.put("hasVisitPreRequest", "true");
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_PRE_REQUEST_VISIT, null);
        }
        ue7 z = z(jSONObject, false, H().u());
        n0(str);
        this.g.b(true, H().u(), z, false);
        q0j.a(this.f7115a.h(), "InitPreRequestHit", "true");
        a();
        txj.e(txj.TAG_RENDER, "generateOpenImmediatelyNodeNew,对应id: " + str + "首卡数据创建成功");
        return true;
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f6a32d", new Object[]{this});
            return;
        }
        String s = H().s();
        String E = H().E(s);
        txj.e(txj.TAG_RENDER, "预创建卡片old, cardType: " + s + ", cacheMainPicUrl: " + E + ", contentExp: " + H().R().m);
        if (this.g != null) {
            ue7 b2 = ygj.b(H().B());
            if (b2 == null) {
                b2 = vnj.a(H());
            }
            if (!(!H().M().b(H().R().x) || H().Y() == null || H().b0() == null)) {
                txj.e(txj.TAG_RENDER, "generateOpenImmediatelyNodeOld simpleDeliverData不为空");
                q0j.a(this.f7115a.h(), "navDeliverDataHit", "true");
            }
            this.j.put(b2.h, b2);
            this.g.b(true, H().u(), b2, false);
        }
    }

    public final void O(boolean z, int i, boolean z2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d80b39d", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2), new Integer(i2)});
        } else if (this.g != null) {
            int T = K().T();
            if (i2 >= T) {
                q0j.p("recommend", q0j.ERROR_CODE_RECOMMEND_FAIL_EXCEED_MAX_COUNT, "推荐接口请求失败次数大于" + T, H().T());
                this.g.e(z, i, 1);
            } else if (z2) {
                this.g.e(z, i, 1);
            } else {
                this.g.e(z, i, 3);
            }
        }
    }

    public void T(String str) {
        boolean z;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e007beb", new Object[]{this, str});
            return;
        }
        String e2 = nyj.z().e(str, "managerInitData");
        nyj.z().d(str, "preCreateFirstCardDataForPerf", e2);
        o2r.a("preCreateFirstCardDataForPerf");
        b0();
        o2r.b();
        nyj.z().t(str, "preCreateFirstCardDataForPerf", true, e2);
        boolean p = p(this.j.get(H().u()));
        if (this.f7115a.l() == null) {
            str2 = this.f7115a.g();
            z = false;
        } else {
            z = this.f7115a.l().f();
            str2 = this.f7115a.l().g();
        }
        n();
        q0j.a(this.f7115a.h(), "ndAnimErrMsgStr", str2);
        q0j.a(this.f7115a.h(), "ndTransitionHit", String.valueOf(z));
        nyj.z().d(str, "managerRequest", e2);
        if (this.f7115a.l() == null || !this.f7115a.l().e() || !this.f7115a.j().N().i()) {
            o2r.a("firstRequest2");
            if (!p) {
                this.b = true;
            } else {
                v(H().u(), false, false, true);
            }
            o2r.b();
        } else {
            this.f7115a.l().b(new a(p));
        }
        nyj.z().t(str, "managerRequest", true, e2);
        nyj.z().u(str, e2, "managerInitData", true);
    }

    public final void c0(boolean z, String str, String str2, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36feaf74", new Object[]{this, new Boolean(z), str, str2, new Integer(i)});
            return;
        }
        txj.e(txj.TAG_RENDER, "列表请求失败：" + str);
        this.b = false;
        this.c = true;
        H().a1(true);
        Integer num = this.f.get(str2);
        if (num != null) {
            i2 = num.intValue();
        }
        if (W(z, i)) {
            q0j.x(this.f7115a.h(), q0j.SECTION_FIRST_TPP_REQUEST_PARSE, "");
        }
        O(z, i, V(z), i2);
        this.f7115a.j().Q0();
    }

    public final boolean p(x3w x3wVar) {
        Throwable th;
        boolean z = false;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffe2d44b", new Object[]{this, x3wVar})).booleanValue();
        }
        try {
            try {
                txj.e(txj.TAG_RENDER, "try Lock. 初始化请求状态");
                boolean tryLock = NavPreRequestManager.l().m().tryLock(1000L, TimeUnit.MILLISECONDS);
                try {
                    try {
                        if (tryLock) {
                            txj.e(txj.TAG_RENDER, "Lock acquired. 初始化请求状态");
                            try {
                                if (NavPreRequestManager.l().q(H().G())) {
                                    this.d = NavPreRequestManager.l().k(H().G());
                                    txj.e(txj.TAG_RENDER, "findRequestParamStatusModel, token: " + H().G() + ", result: " + this.d);
                                    if (this.d == null) {
                                        NavPreRequestManager.l().b(H().G());
                                        this.d = com.taobao.android.detail2.core.optimize.preload.a.d(H(), x3wVar);
                                        q0j.a(this.f7115a.h(), "navRequestNoExe", "true");
                                    } else {
                                        z2 = false;
                                        NavPreRequestManager.l().w(H().G(), new e(!z2, this.l));
                                        txj.e(txj.TAG_RENDER, "registerNavPreRequestCallback, token: " + H().G());
                                    }
                                } else {
                                    NavPreRequestManager.l().b(H().G());
                                    this.d = com.taobao.android.detail2.core.optimize.preload.a.d(H(), x3wVar);
                                }
                                NavPreRequestManager.l().w(H().G(), new e(!z2, this.l));
                                txj.e(txj.TAG_RENDER, "registerNavPreRequestCallback, token: " + H().G());
                            } catch (InterruptedException unused) {
                                z = tryLock;
                                Thread.currentThread().interrupt();
                                txj.e(txj.TAG_RENDER, "checkAndInitPreRequestStatus Thread was interrupted.");
                                if (z) {
                                    NavPreRequestManager.l().m().unlock();
                                }
                                return z2;
                            }
                            z2 = true;
                        } else {
                            txj.e(txj.TAG_RENDER, "Lock unacquired. 初始化请求状态");
                            NavPreRequestManager.l().b(H().G());
                            this.d = com.taobao.android.detail2.core.optimize.preload.a.d(H(), x3wVar);
                            z2 = true;
                        }
                        this.e.u(this.d);
                        q0j.a(this.f7115a.h(), "requestZstd", Boolean.valueOf(H().M().f(H().R().x)));
                        q0j.a(this.f7115a.h(), "navNormalRequest", Boolean.valueOf(!z2));
                        bxj h = this.f7115a.h();
                        if (!H().D0() && NavPreRequestManager.l().p(H().G())) {
                            z = true;
                        }
                        q0j.a(h, "navPreloadRequest", Boolean.valueOf(z));
                        if (!tryLock) {
                            return z2;
                        }
                        NavPreRequestManager.l().m().unlock();
                        return z2;
                    } catch (Throwable th2) {
                        th = th2;
                        z = tryLock;
                        if (z) {
                            NavPreRequestManager.l().m().unlock();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused2) {
                }
            } catch (InterruptedException unused3) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final ue7 z(JSONObject jSONObject, boolean z, String str) {
        ue7 ue7Var;
        cxj cxjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ue7) ipChange.ipc$dispatch("1c154464", new Object[]{this, jSONObject, new Boolean(z), str});
        }
        txj.e(txj.TAG_RENDER, "generateFirstNode: " + H().B());
        ue7 c2 = ygj.c(H().B());
        if (c2 != null) {
            txj.e(txj.TAG_RENDER, "首卡节点拿到nav节点预加载的model");
            this.j.put(c2.h, c2);
            if (c2.O0()) {
                q0j.p(q0j.SCENE_WEEX_CONTAINER, q0j.ERROR_CODE_FIRST_SERVER_WEEX_URL_NULL, "瞬开首卡数据缺失weexurl", H().T());
            }
            return c2;
        }
        if (z) {
            txj.e(txj.TAG_RENDER, "首卡节点没拿到nav节点预加载的model，尝试从feedsMapData中取");
            ue7Var = (ue7) this.j.get(str);
        } else {
            ue7Var = null;
        }
        if (ue7Var == null) {
            txj.e(txj.TAG_RENDER, "首卡节点没拿到nav节点预加载的model，重新创建");
            ue7Var = new ue7(H());
        }
        boolean z2 = r19.X0() || (byj.J0() && (cxjVar = this.f7115a) != null && cxjVar.l() != null && this.f7115a.l().c());
        txj.e(txj.TAG_RENDER, "generateFirstNodeProcessRecommendInfo");
        ue7Var.j0(jSONObject, false, z2, z);
        ue7Var.z = false;
        ue7Var.f31127a = 0;
        ue7Var.F = true;
        ue7Var.I = true;
        H().m0(ue7Var);
        this.j.put(ue7Var.h, ue7Var);
        if (ue7Var.O0()) {
            q0j.p(q0j.SCENE_WEEX_CONTAINER, q0j.ERROR_CODE_FIRST_SERVER_WEEX_URL_NULL, "瞬开首卡数据缺失weexurl", H().T());
        }
        com.taobao.android.detail2.core.optimize.preload.a.i(H(), ue7Var, z);
        return ue7Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r3.equals(tb.bf7.OPERATE_FEED_CACHE) == false) goto L_0x0025;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.gl8 h(tb.bf7 r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail2.core.framework.data.DetailDataManager.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "ed2d4f54"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            tb.gl8 r7 = (tb.gl8) r7
            return r7
        L_0x0018:
            java.lang.String r3 = r7.c
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1720601445: goto L_0x003c;
                case -1670206332: goto L_0x0033;
                case 1156462179: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            r0 = -1
            goto L_0x0047
        L_0x0027:
            java.lang.String r0 = "refreshFeedData"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0031
            goto L_0x0025
        L_0x0031:
            r0 = 2
            goto L_0x0047
        L_0x0033:
            java.lang.String r1 = "feedCache"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0047
            goto L_0x0025
        L_0x003c:
            java.lang.String r0 = "setRecommendRequestParams"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0046
            goto L_0x0025
        L_0x0046:
            r0 = 0
        L_0x0047:
            switch(r0) {
                case 0: goto L_0x0053;
                case 1: goto L_0x004f;
                case 2: goto L_0x004b;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0058
        L_0x004b:
            r6.P(r7)
            goto L_0x0058
        L_0x004f:
            r6.Q(r7)
            goto L_0x0058
        L_0x0053:
            com.alibaba.fastjson.JSONObject r7 = r7.d
            r6.S(r7)
        L_0x0058:
            tb.gl8 r7 = tb.gl8.SUCCESS
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.data.DetailDataManager.h(tb.bf7):tb.gl8");
    }

    public final boolean g0(String str, boolean z, int i) {
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b5a0e8c", new Object[]{this, str, new Boolean(z), new Integer(i)})).booleanValue();
        }
        boolean V = V(z);
        if (TextUtils.isEmpty(str)) {
            q0j.q("recommend", q0j.ERROR_CODE_RECOMMEND_ITEM_ID_EMPTY, "请求推荐列表时itemid为空", H().T(), "", "");
            i2 = 4;
        } else if (!this.b) {
            i2 = V ? 1 : -1;
        }
        if (i2 == -1) {
            return true;
        }
        try {
            d dVar = this.g;
            if (dVar != null) {
                dVar.e(z, i, i2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public void v(String str, boolean z, boolean z2, boolean z3) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d228c578", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        String G = this.f7115a.j().G();
        String e2 = nyj.z().e(G, "fetchRecPage");
        o2r.a("fetchRecommendListForNextPage");
        o2r.b();
        int J = J(z2);
        if (!g0(str, z2, J)) {
            nyj.z().u(G, e2, "fetchRecPage", false);
            return;
        }
        this.b = true;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (z2) {
            str2 = "up";
        } else {
            str2 = "down";
        }
        sb.append(str2);
        String sb2 = sb.toString();
        if (z) {
            Integer num = this.f.get(sb2);
            if (num == null) {
                this.f.put(sb2, 1);
            } else {
                this.f.put(sb2, Integer.valueOf(num.intValue() + 1));
            }
        }
        txj.e(txj.TAG_RENDER, "开始请求推荐列表：" + str);
        nyj.z().d(G, "generateRequestParams", e2);
        RecRequestParamsV2 b2 = com.taobao.android.detail2.core.optimize.preload.a.b(H(), this.d, z2);
        nyj.z().t(G, "generateRequestParams", true, e2);
        nyj.z().d(G, "getRecData", e2);
        String e3 = nyj.z().e(G, "ndRequestData");
        String str3 = "next_page_token_" + System.currentTimeMillis();
        txj.e(txj.TAG_DATA, "NdInsertCard 下一页网络请求开始发起。nextPageRequestToken:" + str3);
        this.e.p(z2, J, b2, new b(G, e3, str3, z3, J, sb2), H().M().f(H().R().x), false, str3);
        nyj.z().t(G, "getRecData", true, e2);
        nyj.z().u(this.f7115a.j().G(), e2, "fetchRecPage", true);
    }

    public final void s(boolean z, JSONArray jSONArray, JSONObject jSONObject, String str, int i, boolean z2) {
        boolean z3;
        int i2;
        boolean z4;
        x3w x3wVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c282848d", new Object[]{this, new Boolean(z), jSONArray, jSONObject, str, new Integer(i), new Boolean(z2)});
            return;
        }
        txj.e(txj.TAG_RENDER, "列表请求成功，个数：" + jSONArray.size());
        m0(jSONObject, z);
        M(jSONObject, z, i);
        H().h1(null);
        List<x3w> Z = Z(z, jSONObject, str, jSONArray, this.g);
        if (!(Z.isEmpty() || (x3wVar = Z.get(0)) == null || x3wVar.j == null)) {
            H().k1(x3wVar.j.getString("uniqID"));
            if (z2 && (x3wVar instanceof ue7)) {
                ue7 ue7Var = (ue7) x3wVar;
                if (ue7Var.w0 != null) {
                    q0j.a(this.f7115a.h(), "navRealHasPic", Boolean.valueOf(ue7Var.w0.d));
                }
            }
        }
        H().i1(jSONObject.getJSONObject("utparams"));
        if (W(z, i)) {
            r0(Z);
            q0j.x(this.f7115a.h(), q0j.SECTION_FIRST_TPP_REQUEST_PARSE, "");
        }
        d dVar = this.g;
        if (dVar != null) {
            z3 = false;
            z4 = true;
            i2 = i;
            if (!dVar.c(z, D(z), jSONObject, Z, -1, V(z))) {
                j0(z);
            }
        } else {
            i2 = i;
            z4 = true;
            z3 = false;
        }
        if (W(z, i2)) {
            s0(jSONObject);
        }
        this.d.d.resetMaxSize(H().x());
        this.f7115a.j().Q0();
        this.b = z3;
        this.c = z4;
        if (H().h() && W(z, i2)) {
            u(H().u(), z4, z4);
        }
    }
}
