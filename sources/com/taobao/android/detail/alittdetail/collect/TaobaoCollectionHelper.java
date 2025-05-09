package com.taobao.android.detail.alittdetail.collect;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteResultData;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor;
import com.taobao.android.msoa.annotation.MSOAServiceInvoke;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.favorite.export.FavoriteFacade;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.b5m;
import tb.fyn;
import tb.h39;
import tb.m5c;
import tb.pos;
import tb.rrh;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.vrh;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TaobaoCollectionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ITEM_ID = "itemId";
    public static final String KEY_X = "x";
    public static final String KEY_Y = "y";
    public static final String MSOA_SCENE_NAME = "taobao_detail";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Boolean> f6549a = new HashMap(0);
    public static boolean b = false;

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.addFavoriteItem")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class AddCollectRequest extends vrh {
        static {
            t2o.a(354418733);
        }

        public AddCollectRequest(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.deleteFavoriteItem")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class CancelCollectRequest extends vrh {
        static {
            t2o.a(354418734);
        }

        public CancelCollectRequest(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.isFavoriteItem")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class QueryCollectRequest extends vrh {
        static {
            t2o.a(354418735);
        }

        public QueryCollectRequest(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.showCategoryList")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ShowCategoryListRequest extends vrh {
        static {
            t2o.a(354418736);
        }

        public ShowCategoryListRequest(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements b5m.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6550a;
        public final /* synthetic */ b5m.k b;

        public a(String str, b5m.k kVar) {
            this.f6550a = str;
            this.b = kVar;
        }

        @Override // tb.b5m.k
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            TaobaoCollectionHelper.b(this.f6550a, null);
            b5m.k kVar = this.b;
            if (kVar != null) {
                kVar.onFailure(str, str2);
            }
        }

        @Override // tb.b5m.k
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            TaobaoCollectionHelper.b(this.f6550a, Boolean.FALSE);
            b5m.k kVar = this.b;
            if (kVar != null) {
                kVar.onSuccess();
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements b5m.p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6551a;
        public final /* synthetic */ b5m.p b;

        public b(String str, b5m.p pVar) {
            this.f6551a = str;
            this.b = pVar;
        }

        @Override // tb.b5m.p
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            TaobaoCollectionHelper.b(this.f6551a, null);
            b5m.p pVar = this.b;
            if (pVar != null) {
                pVar.onFailure(str, str2);
            }
        }

        @Override // tb.b5m.p
        public void onSuccess(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
                return;
            }
            TaobaoCollectionHelper.b(this.f6551a, Boolean.valueOf(z));
            b5m.p pVar = this.b;
            if (pVar != null) {
                pVar.onSuccess(z);
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6552a;
        public final /* synthetic */ b5m.p b;

        public c(String str, b5m.p pVar) {
            this.f6552a = str;
            this.b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TaobaoCollectionHelper.a(this.f6552a, this.b);
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b5m.p f6553a;

        public d(b5m.p pVar) {
            this.f6553a = pVar;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            b5m.p pVar = this.f6553a;
            if (pVar != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                pVar.onFailure(str, str2);
            }
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map == null || !(map.get("isFavorite") instanceof Boolean)) {
                b5m.p pVar = this.f6553a;
                if (pVar != null) {
                    pVar.onFailure("query collect failed", "invalid result");
                }
            } else {
                boolean booleanValue = ((Boolean) map.get("isFavorite")).booleanValue();
                b5m.p pVar2 = this.f6553a;
                if (pVar2 != null) {
                    pVar2.onSuccess(booleanValue);
                }
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b5m.k f6554a;

        public e(b5m.k kVar) {
            this.f6554a = kVar;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
            } else if (this.f6554a != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                if (TextUtils.isEmpty(str2) || !z) {
                    str2 = TaobaoCollectionHelper.r();
                }
                this.f6554a.onFailure(str, str2);
            }
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map == null || !(map.get("deleteResult") instanceof Boolean) || !((Boolean) map.get("deleteResult")).booleanValue()) {
                b5m.k kVar = this.f6554a;
                if (kVar != null) {
                    kVar.onFailure("cancel collect failed", "invalid result");
                }
            } else {
                b5m.k kVar2 = this.f6554a;
                if (kVar2 != null) {
                    kVar2.onSuccess();
                }
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b5m.k f6555a;

        public f(b5m.k kVar) {
            this.f6555a = kVar;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
            } else if (this.f6555a != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                if (TextUtils.isEmpty(str2) || !z) {
                    str2 = TaobaoCollectionHelper.r();
                }
                this.f6555a.onFailure(str, str2);
            }
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map == null || !(map.get("addResult") instanceof Boolean) || !((Boolean) map.get("addResult")).booleanValue()) {
                b5m.k kVar = this.f6555a;
                if (kVar != null) {
                    kVar.onFailure("add collect failed", "invalid result");
                }
            } else {
                b5m.k kVar2 = this.f6555a;
                if (kVar2 != null) {
                    kVar2.onSuccess();
                }
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b5m.s f6556a;

        public g(b5m.s sVar) {
            this.f6556a = sVar;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
            } else {
                ((CollectorImplementor.c) this.f6556a).onFailure(str, str2);
            }
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                return;
            }
            b5m.s sVar = this.f6556a;
            if (sVar != null) {
                ((CollectorImplementor.c) sVar).a(map);
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class h implements m5c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b5m.k f6557a;

        public h(b5m.k kVar) {
            this.f6557a = kVar;
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            b5m.k kVar = this.f6557a;
            if (kVar != null) {
                String str2 = "unknown";
                if (errorResult == null) {
                    kVar.onFailure(str2, TaobaoCollectionHelper.r());
                    return;
                }
                if (!TextUtils.isEmpty(errorResult.getCode())) {
                    str2 = errorResult.getCode();
                }
                if (TextUtils.isEmpty(errorResult.getMsg())) {
                    str = TaobaoCollectionHelper.r();
                } else {
                    str = errorResult.getMsg();
                }
                this.f6557a.onFailure(str2, str);
            }
        }

        @Override // tb.m5c
        public void q0(FavoriteResultData favoriteResultData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7700a9d", new Object[]{this, favoriteResultData});
                return;
            }
            b5m.k kVar = this.f6557a;
            if (kVar != null) {
                kVar.onSuccess();
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class i implements m5c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b5m.k f6558a;

        public i(b5m.k kVar) {
            this.f6558a = kVar;
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            b5m.k kVar = this.f6558a;
            if (kVar != null) {
                String str2 = "unknown";
                if (errorResult == null) {
                    kVar.onFailure(str2, TaobaoCollectionHelper.r());
                    return;
                }
                if (!TextUtils.isEmpty(errorResult.getCode())) {
                    str2 = errorResult.getCode();
                }
                if (TextUtils.isEmpty(errorResult.getMsg())) {
                    str = TaobaoCollectionHelper.r();
                } else {
                    str = errorResult.getMsg();
                }
                this.f6558a.onFailure(str2, str);
            }
        }

        @Override // tb.m5c
        public void q0(FavoriteResultData favoriteResultData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7700a9d", new Object[]{this, favoriteResultData});
                return;
            }
            b5m.k kVar = this.f6558a;
            if (kVar != null) {
                kVar.onSuccess();
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class j implements m5c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b5m.p f6559a;

        public j(b5m.p pVar) {
            this.f6559a = pVar;
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            b5m.p pVar = this.f6559a;
            if (pVar != null) {
                String str2 = "unknown";
                if (errorResult == null) {
                    pVar.onFailure(str2, TaobaoCollectionHelper.r());
                    return;
                }
                if (!TextUtils.isEmpty(errorResult.getCode())) {
                    str2 = errorResult.getCode();
                }
                if (TextUtils.isEmpty(errorResult.getMsg())) {
                    str = TaobaoCollectionHelper.r();
                } else {
                    str = errorResult.getMsg();
                }
                this.f6559a.onFailure(str2, str);
            }
        }

        @Override // tb.m5c
        public void q0(FavoriteResultData favoriteResultData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7700a9d", new Object[]{this, favoriteResultData});
                return;
            }
            b5m.p pVar = this.f6559a;
            if (pVar != null) {
                pVar.onSuccess(favoriteResultData.favorite.booleanValue());
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class k implements b5m.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6560a;
        public final /* synthetic */ b5m.k b;

        public k(String str, b5m.k kVar) {
            this.f6560a = str;
            this.b = kVar;
        }

        @Override // tb.b5m.k
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            TaobaoCollectionHelper.b(this.f6560a, null);
            b5m.k kVar = this.b;
            if (kVar != null) {
                kVar.onFailure(str, str2);
            }
        }

        @Override // tb.b5m.k
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            TaobaoCollectionHelper.b(this.f6560a, Boolean.TRUE);
            b5m.k kVar = this.b;
            if (kVar != null) {
                kVar.onSuccess();
            }
        }
    }

    static {
        t2o.a(354418721);
    }

    public static /* synthetic */ void a(String str, b5m.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdfe209f", new Object[]{str, pVar});
        } else {
            s(str, pVar);
        }
    }

    public static /* synthetic */ void b(String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c8bd8b", new Object[]{str, bool});
        } else {
            y(str, bool);
        }
    }

    public static void c(String str, Map<String, String> map, b5m.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b319457", new Object[]{str, map, kVar});
            return;
        }
        try {
            k kVar2 = new k(str, kVar);
            if (vbl.q()) {
                f(str, map, kVar2);
            } else {
                e(str, kVar2);
            }
        } catch (Throwable th) {
            tgh.c("TaobaoCollectionHelper", "addCollect exception", th);
        }
    }

    public static void d(String str, Map<String, String> map, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97990b5e", new Object[]{str, map, m5cVar});
        } else if (!t()) {
            m5cVar.O(new ErrorResult("code not download", r()));
        } else {
            FavoriteFacade.addFavoriteItem(p(str, map), m5cVar);
        }
    }

    public static void e(String str, b5m.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf3af8d", new Object[]{str, kVar});
        } else {
            rrh.e().o(k(MSOA_SCENE_NAME, str), new f(kVar));
        }
    }

    public static void f(String str, Map<String, String> map, b5m.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a44fb3", new Object[]{str, map, kVar});
        } else {
            d(str, map, new h(kVar));
        }
    }

    public static void g(String str, b5m.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e794261", new Object[]{str, kVar});
            return;
        }
        try {
            a aVar = new a(str, kVar);
            if (vbl.q()) {
                j(str, aVar);
            } else {
                i(str, aVar);
            }
        } catch (Throwable th) {
            tgh.c("TaobaoCollectionHelper", "cancelCollect exception", th);
        }
    }

    public static void h(String str, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb5a7bc", new Object[]{str, m5cVar});
        } else if (!t()) {
            m5cVar.O(new ErrorResult("code not download", r()));
        } else {
            FavoriteFacade.removeFavorite(o(str), m5cVar);
        }
    }

    public static void i(String str, b5m.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a49066", new Object[]{str, kVar});
        } else {
            rrh.e().o(l(MSOA_SCENE_NAME, str), new e(kVar));
        }
    }

    public static void j(String str, b5m.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88265845", new Object[]{str, kVar});
        } else {
            h(str, new i(kVar));
        }
    }

    public static vrh k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrh) ipChange.ipc$dispatch("494a672e", new Object[]{str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str2);
        return new AddCollectRequest(str, hashMap);
    }

    public static vrh l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrh) ipChange.ipc$dispatch("39123611", new Object[]{str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str2);
        return new CancelCollectRequest(str, hashMap);
    }

    public static vrh m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrh) ipChange.ipc$dispatch("1e2b5815", new Object[]{str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str2);
        return new QueryCollectRequest(str, hashMap);
    }

    public static vrh n(String str, String str2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrh) ipChange.ipc$dispatch("72caa93e", new Object[]{str, str2, new Integer(i2), new Integer(i3)});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str2);
        hashMap.put("x", Integer.valueOf(i2));
        hashMap.put("y", Integer.valueOf(i3));
        return new ShowCategoryListRequest(str, hashMap);
    }

    public static h39 o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h39) ipChange.ipc$dispatch("bcea83e6", new Object[]{str});
        }
        return h39.a(str, "ITEM");
    }

    public static h39 p(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h39) ipChange.ipc$dispatch("d4ac00c3", new Object[]{str, map});
        }
        h39 a2 = h39.a(str, "ITEM");
        if (a2 == null) {
            return null;
        }
        a2.d = map;
        return a2;
    }

    public static synchronized Boolean q(String str) {
        synchronized (TaobaoCollectionHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("ea73903e", new Object[]{str});
            } else if (TextUtils.isEmpty(str)) {
                return null;
            } else {
                return (Boolean) ((HashMap) f6549a).get(str);
            }
        }
    }

    public static String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e16c96ed", new Object[0]);
        }
        return Localization.q(R.string.tt_detail_app_busy_system_tired);
    }

    public static void s(String str, b5m.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a24dd7", new Object[]{str, pVar});
        } else {
            rrh.e().o(m(MSOA_SCENE_NAME, str), new d(pVar));
        }
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d9bd2ff", new Object[0])).booleanValue();
        }
        if (!b) {
            long currentTimeMillis = System.currentTimeMillis();
            if (fyn.a("taobao_favorite_aar")) {
                b = true;
            }
            tgh.b("favoriteSDKDownload", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        return b;
    }

    public static void u(String str, b5m.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af37d0d", new Object[]{str, pVar});
            return;
        }
        if (pVar == null) {
            try {
                y(str, null);
            } catch (Throwable th) {
                tgh.c("TaobaoCollectionHelper", "queryCollect exception", th);
                return;
            }
        }
        Boolean q = q(str);
        if (q == null) {
            b bVar = new b(str, pVar);
            if (vbl.q()) {
                x(str, bVar);
            } else {
                w(str, bVar);
            }
        } else if (pVar != null) {
            pVar.onSuccess(q.booleanValue());
        }
    }

    public static void v(String str, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6419d2e", new Object[]{str, m5cVar});
        } else if (!t()) {
            m5cVar.O(new ErrorResult("code not download", r()));
        } else {
            FavoriteFacade.requestFavoriteStatus(o(str), m5cVar);
        }
    }

    public static void w(String str, b5m.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d517012", new Object[]{str, pVar});
        } else {
            pos.a(new c(str, pVar));
        }
    }

    public static void x(String str, b5m.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62836171", new Object[]{str, pVar});
        } else {
            v(str, new j(pVar));
        }
    }

    public static synchronized void y(String str, Boolean bool) {
        synchronized (TaobaoCollectionHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af8ec8b8", new Object[]{str, bool});
            } else if (!TextUtils.isEmpty(str)) {
                ((HashMap) f6549a).put(str, bool);
            }
        }
    }

    public static void z(String str, int i2, int i3, b5m.s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca415c5", new Object[]{str, new Integer(i2), new Integer(i3), sVar});
        } else {
            rrh.e().o(n(MSOA_SCENE_NAME, str, i2, i3), new g(sVar));
        }
    }
}
