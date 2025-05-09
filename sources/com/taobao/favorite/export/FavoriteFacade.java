package com.taobao.favorite.export;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteGuideResultData;
import com.taobao.android.abilityidl.ability.FavoriteResultData;
import com.taobao.android.favoritesdk.goods.response.CheckCollectResponseData;
import com.taobao.statistic.TBS;
import tb.e39;
import tb.f39;
import tb.g39;
import tb.h39;
import tb.jzo;
import tb.k5c;
import tb.l5c;
import tb.m39;
import tb.m5c;
import tb.s39;
import tb.t2o;
import tb.tao;
import tb.tzo;
import tb.uzo;
import tb.voh;
import tb.woh;
import tb.xoh;
import tb.y1i;
import tb.y29;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FavoriteFacade {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final m39 coreService = new m39("detail");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements jzo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m5c f10528a;

        public a(m5c m5cVar) {
            this.f10528a = m5cVar;
        }

        @Override // tb.jzo
        public void onError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fed7cd43", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                FavoriteFacade.access$000(this.f10528a, "-1", str2);
            }
        }

        @Override // tb.jzo
        public void onSuccess(int i, tzo tzoVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35f22ba", new Object[]{this, new Integer(i), tzoVar, obj});
            } else if (this.f10528a != null) {
                FavoriteResultData favoriteResultData = new FavoriteResultData();
                favoriteResultData.favorite = Boolean.TRUE;
                this.f10528a.q0(favoriteResultData);
            }
        }

        @Override // tb.jzo
        public void onSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffc91052", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                FavoriteFacade.access$000(this.f10528a, "-1", str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements jzo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m5c f10529a;

        public b(m5c m5cVar) {
            this.f10529a = m5cVar;
        }

        @Override // tb.jzo
        public void onError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fed7cd43", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                FavoriteFacade.access$000(this.f10529a, "-1", str2);
            }
        }

        @Override // tb.jzo
        public void onSuccess(int i, tzo tzoVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35f22ba", new Object[]{this, new Integer(i), tzoVar, obj});
            } else if (this.f10529a != null) {
                FavoriteResultData favoriteResultData = new FavoriteResultData();
                favoriteResultData.favorite = Boolean.FALSE;
                this.f10529a.q0(favoriteResultData);
            }
        }

        @Override // tb.jzo
        public void onSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffc91052", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                FavoriteFacade.access$000(this.f10529a, "-1", str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements jzo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m5c f10530a;

        public c(m5c m5cVar) {
            this.f10530a = m5cVar;
        }

        @Override // tb.jzo
        public void onError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fed7cd43", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                FavoriteFacade.access$000(this.f10530a, "-1", str2);
            }
        }

        @Override // tb.jzo
        public void onSuccess(int i, tzo tzoVar, Object obj) {
            CheckCollectResponseData checkCollectResponseData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35f22ba", new Object[]{this, new Integer(i), tzoVar, obj});
            } else if (this.f10530a != null) {
                if (tzoVar != null) {
                    checkCollectResponseData = (CheckCollectResponseData) tzoVar.e;
                } else {
                    checkCollectResponseData = null;
                }
                FavoriteResultData favoriteResultData = new FavoriteResultData();
                if (checkCollectResponseData == null || !checkCollectResponseData.isFavItem) {
                    favoriteResultData.favorite = Boolean.FALSE;
                } else {
                    favoriteResultData.favorite = Boolean.TRUE;
                }
                this.f10530a.q0(favoriteResultData);
            }
        }

        @Override // tb.jzo
        public void onSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffc91052", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                FavoriteFacade.access$000(this.f10530a, "-1", str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements l5c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k5c f10531a;

        public d(k5c k5cVar) {
            this.f10531a = k5cVar;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9b609d1", new Object[]{this, new Boolean(z)});
                return;
            }
            FavoriteGuideResultData favoriteGuideResultData = new FavoriteGuideResultData();
            favoriteGuideResultData.needShowGuide = Boolean.valueOf(z);
            this.f10531a.L(favoriteGuideResultData);
        }
    }

    static {
        t2o.a(463470661);
    }

    public static /* synthetic */ void access$000(m5c m5cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73763fa9", new Object[]{m5cVar, str, str2});
        } else {
            considerDispatchError(m5cVar, str, str2);
        }
    }

    public static void addFavoriteItem(h39 h39Var, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cc66e1", new Object[]{h39Var, m5cVar});
            return;
        }
        TBS.Ext.commitEvent("Page_MyTB_favorite", 2101, "/mytaobao.favorite.add", null, null, "bizCode=" + h39Var.f20385a, "ID=" + h39Var.b, "type=" + h39Var.c);
        if (uzo.d()) {
            s39.INSTANCE.a(new xoh(h39Var.f20385a, h39Var.b, h39Var.c, h39Var.d), new y1i(m5cVar));
        } else if (checkRequestParamsLegal(h39Var, m5cVar)) {
            coreService.c(h39Var.b, 2, h39Var.d, null, new a(m5cVar));
        }
    }

    private static void considerDispatchError(m5c m5cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a3a644", new Object[]{m5cVar, str, str2});
        } else if (m5cVar != null) {
            if (str2 == null) {
                str2 = "";
            }
            m5cVar.O(new ErrorResult(str, str2));
        }
    }

    public static tao<String, ErrorResult> getFavoriteCount(h39 h39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("d8378546", new Object[]{h39Var});
        }
        if (uzo.d()) {
            return new tao<>(y29.INSTANCE.a(new xoh(h39Var.f20385a, h39Var.b, h39Var.c, h39Var.d)));
        }
        return new tao<>("", null);
    }

    public static tao<String, ErrorResult> getFavoriteCountWithDefaultCount(f39 f39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("f465f4cf", new Object[]{f39Var});
        }
        if (uzo.d()) {
            return new tao<>(y29.INSTANCE.b(new voh(f39Var.f18970a, f39Var.b, f39Var.c, f39Var.d, f39Var.e)));
        }
        return new tao<>("", null);
    }

    public static tao<Boolean, ErrorResult> getFavoriteStatus(h39 h39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("51243f5f", new Object[]{h39Var});
        }
        if (uzo.d()) {
            return new tao<>(Boolean.valueOf(s39.INSTANCE.b(new xoh(h39Var.f20385a, h39Var.b, h39Var.c, h39Var.d))));
        }
        return new tao<>(Boolean.FALSE);
    }

    public static void markFavorite(h39 h39Var, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdec19a", new Object[]{h39Var, m5cVar});
        } else if (uzo.d()) {
            s39.INSTANCE.c(new xoh(h39Var.f20385a, h39Var.b, h39Var.c, h39Var.d), new y1i(m5cVar));
        } else if (checkRequestParamsLegal(h39Var, m5cVar)) {
            coreService.m(h39Var.b);
            if (m5cVar != null) {
                FavoriteResultData favoriteResultData = new FavoriteResultData();
                favoriteResultData.favorite = Boolean.TRUE;
                m5cVar.q0(favoriteResultData);
            }
        }
    }

    public static void needShowGuide(g39 g39Var, k5c k5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36968d95", new Object[]{g39Var, k5cVar});
        } else if (!uzo.d()) {
            FavoriteGuideResultData favoriteGuideResultData = new FavoriteGuideResultData();
            favoriteGuideResultData.needShowGuide = Boolean.FALSE;
            k5cVar.L(favoriteGuideResultData);
        } else {
            e39.INSTANCE.a(new woh(g39Var.f19708a, Boolean.TRUE.equals(g39Var.b)), new d(k5cVar));
        }
    }

    public static void removeFavorite(h39 h39Var, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2077711", new Object[]{h39Var, m5cVar});
            return;
        }
        TBS.Ext.commitEvent("Page_MyTB_favorite", 2101, "/mytaobao.favorite.delegate", null, null, "bizCode=" + h39Var.f20385a, "ID=" + h39Var.b, "type=" + h39Var.c);
        if (uzo.d()) {
            s39.INSTANCE.d(new xoh(h39Var.f20385a, h39Var.b, h39Var.c, h39Var.d), new y1i(m5cVar));
        } else if (checkRequestParamsLegal(h39Var, m5cVar)) {
            coreService.f(h39Var.b, new b(m5cVar));
        }
    }

    public static void requestFavoriteStatus(h39 h39Var, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9715642e", new Object[]{h39Var, m5cVar});
        } else if (uzo.d()) {
            s39.INSTANCE.e(new xoh(h39Var.f20385a, h39Var.b, h39Var.c, h39Var.d), new y1i(m5cVar));
        } else if (checkRequestParamsLegal(h39Var, m5cVar)) {
            coreService.k(h39Var.b, new c(m5cVar));
        }
    }

    private static boolean checkRequestParamsLegal(h39 h39Var, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4eaba5c1", new Object[]{h39Var, m5cVar})).booleanValue();
        }
        if (h39Var == null || !"ITEM".equals(h39Var.c)) {
            considerDispatchError(m5cVar, "-1000", "收藏物品类型不支持");
            return false;
        } else if (!TextUtils.isEmpty(h39Var.b)) {
            return true;
        } else {
            considerDispatchError(m5cVar, "-1001", "主key不可用");
            return false;
        }
    }
}
