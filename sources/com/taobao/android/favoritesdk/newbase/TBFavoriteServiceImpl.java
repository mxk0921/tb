package com.taobao.android.favoritesdk.newbase;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.content.response.IsUserCollectedResponseData;
import com.taobao.android.favoritesdk.goods.response.CheckCollectResponseData;
import java.util.Map;
import tb.e29;
import tb.jzo;
import tb.m39;
import tb.oud;
import tb.pud;
import tb.qud;
import tb.rud;
import tb.t2o;
import tb.tzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBFavoriteServiceImpl implements rud, qud, jzo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int REQUEST_TYPE_ADD_CONTENT = 5;
    public static final int REQUEST_TYPE_ADD_GOODS = 2;
    private static final int REQUEST_TYPE_DELETE_CONTENT = 6;
    private static final int REQUEST_TYPE_DELETE_GOODS = 3;
    private static final int REQUEST_TYPE_DELETE_MANY_GOODS = 4;
    private m39 favoriteService = new m39();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements jzo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ oud f7642a;

        public a(TBFavoriteServiceImpl tBFavoriteServiceImpl, oud oudVar) {
            this.f7642a = oudVar;
        }

        @Override // tb.jzo
        public void onError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fed7cd43", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f7642a.a(str, str2);
            }
        }

        @Override // tb.jzo
        public void onSuccess(int i, tzo tzoVar, Object obj) {
            CheckCollectResponseData checkCollectResponseData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35f22ba", new Object[]{this, new Integer(i), tzoVar, obj});
                return;
            }
            if (tzoVar != null) {
                checkCollectResponseData = (CheckCollectResponseData) tzoVar.e;
            } else {
                checkCollectResponseData = null;
            }
            if (checkCollectResponseData != null) {
                this.f7642a.c(checkCollectResponseData.isFavItem);
            } else {
                this.f7642a.c(false);
            }
        }

        @Override // tb.jzo
        public void onSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffc91052", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f7642a.b(str, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements jzo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ oud f7643a;

        public b(TBFavoriteServiceImpl tBFavoriteServiceImpl, oud oudVar) {
            this.f7643a = oudVar;
        }

        @Override // tb.jzo
        public void onError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fed7cd43", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f7643a.a(str, str2);
            }
        }

        @Override // tb.jzo
        public void onSuccess(int i, tzo tzoVar, Object obj) {
            IsUserCollectedResponseData isUserCollectedResponseData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35f22ba", new Object[]{this, new Integer(i), tzoVar, obj});
                return;
            }
            if (tzoVar != null) {
                isUserCollectedResponseData = (IsUserCollectedResponseData) tzoVar.e;
            } else {
                isUserCollectedResponseData = null;
            }
            if (isUserCollectedResponseData != null) {
                this.f7643a.c(isUserCollectedResponseData.result);
            } else {
                this.f7643a.c(false);
            }
        }

        @Override // tb.jzo
        public void onSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffc91052", new Object[]{this, new Integer(i), str, str2, obj});
            } else {
                this.f7643a.b(str, str2);
            }
        }
    }

    static {
        t2o.a(463470641);
        t2o.a(463470638);
    }

    private void dealError(int i, String str, String str2, Object obj, pud pudVar) {
        Object obj2;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facac794", new Object[]{this, new Integer(i), str, str2, obj, pudVar});
            return;
        }
        if (obj instanceof e29) {
            e29 e29Var = (e29) obj;
            i2 = e29Var.c;
            obj2 = e29Var.f18225a;
        } else {
            obj2 = null;
        }
        if ((i == 2 || i == 5) && "ALREADY_COLLECT".equals(str)) {
            pudVar.onFavSuccess(i2, obj2);
        } else if ((i == 3 || i == 6) && "IS_NOT_EXIT".equals(str)) {
            pudVar.onFavSuccess(i2, obj2);
        } else if (i != 6 || !"DELETE_ERROR".equals(str)) {
            pudVar.onFavError(i2, str, str2, obj2);
        } else {
            pudVar.onFavSuccess(i2, obj2);
        }
    }

    public void addFavoriteContent(int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj, pud pudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef950457", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, new Integer(i2), obj, pudVar});
            return;
        }
        e29 e29Var = new e29();
        e29Var.b = pudVar;
        e29Var.f18225a = obj;
        e29Var.c = i2;
        this.favoriteService.a(i, str, str2, str3, str4, str5, 5, e29Var, this);
    }

    public void addFavoriteItem(String str, int i, Object obj, pud pudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3b585c6", new Object[]{this, str, new Integer(i), obj, pudVar});
            return;
        }
        e29 e29Var = new e29();
        e29Var.b = pudVar;
        e29Var.f18225a = obj;
        e29Var.c = i;
        this.favoriteService.b(str, 2, e29Var, this);
    }

    @Override // tb.rud
    public void addFavoriteItemV2(String str, int i, Map map, Object obj, pud pudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1c5289", new Object[]{this, str, new Integer(i), map, obj, pudVar});
            return;
        }
        e29 e29Var = new e29();
        e29Var.b = pudVar;
        e29Var.f18225a = obj;
        e29Var.c = i;
        this.favoriteService.c(str, 2, map, e29Var, this);
    }

    public void deleteFavoriteContent(int i, String str, int i2, Object obj, pud pudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e346139", new Object[]{this, new Integer(i), str, new Integer(i2), obj, pudVar});
            return;
        }
        e29 e29Var = new e29();
        e29Var.b = pudVar;
        e29Var.f18225a = obj;
        e29Var.c = i2;
        this.favoriteService.d(i, str, 6, e29Var, this);
    }

    @Override // tb.rud
    public void deleteFavoriteItem(String str, int i, Object obj, pud pudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120d5bd0", new Object[]{this, str, new Integer(i), obj, pudVar});
            return;
        }
        e29 e29Var = new e29();
        e29Var.b = pudVar;
        e29Var.f18225a = obj;
        e29Var.c = i;
        this.favoriteService.e(str, 3, e29Var, this);
    }

    public void deleteFavoriteItems(String[] strArr, int i, Object obj, pud pudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bdb6524", new Object[]{this, strArr, new Integer(i), obj, pudVar});
            return;
        }
        e29 e29Var = new e29();
        e29Var.b = pudVar;
        e29Var.f18225a = obj;
        e29Var.c = i;
        this.favoriteService.g(strArr, 4, e29Var, this);
    }

    @Override // tb.qud
    public void isFavoriteContent(int i, String str, oud oudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2901e1a4", new Object[]{this, new Integer(i), str, oudVar});
        } else {
            this.favoriteService.i(i, str, new b(this, oudVar));
        }
    }

    @Override // tb.rud
    public void isFavoriteItem(String str, oud oudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fff62ad", new Object[]{this, str, oudVar});
        } else {
            this.favoriteService.k(str, new a(this, oudVar));
        }
    }

    @Override // tb.jzo
    public void onError(int i, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed7cd43", new Object[]{this, new Integer(i), str, str2, obj});
        } else if (obj != null) {
            if (obj instanceof e29) {
                e29 e29Var = (e29) obj;
                dealError(i, str, str2, e29Var, e29Var.b);
            } else if (obj instanceof pud) {
                dealError(i, str, str2, null, (pud) obj);
            }
        }
    }

    @Override // tb.jzo
    public void onSuccess(int i, tzo tzoVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35f22ba", new Object[]{this, new Integer(i), tzoVar, obj});
        } else if (obj != null) {
            if (obj instanceof e29) {
                e29 e29Var = (e29) obj;
                e29Var.b.onFavSuccess(e29Var.c, e29Var.f18225a);
            } else if (obj instanceof pud) {
                ((pud) obj).onFavSuccess(0, null);
            }
        }
    }

    @Override // tb.jzo
    public void onSystemError(int i, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc91052", new Object[]{this, new Integer(i), str, str2, obj});
        } else if (obj != null) {
            if (obj instanceof e29) {
                e29 e29Var = (e29) obj;
                e29Var.b.onFavSystemError(e29Var.c, str, str2, e29Var.f18225a);
            } else if (obj instanceof pud) {
                ((pud) obj).onFavSystemError(0, str, str2, null);
            }
        }
    }

    @Override // tb.rud, tb.qud
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.favoriteService.l(str);
        }
    }

    public void updateFavoriteItemCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb508f3b", new Object[]{this, str});
        } else {
            this.favoriteService.m(str);
        }
    }

    @Override // tb.qud
    public void addFavoriteContent(int i, String str, String str2, String str3, String str4, String str5, pud pudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aaaf8b2", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, pudVar});
        } else {
            this.favoriteService.a(i, str, str2, str3, str4, str5, 5, pudVar, this);
        }
    }

    @Override // tb.rud
    public void addFavoriteItem(String str, pud pudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ee87a3", new Object[]{this, str, pudVar});
        } else {
            this.favoriteService.b(str, 2, pudVar, this);
        }
    }

    @Override // tb.qud
    public void deleteFavoriteContent(int i, String str, pud pudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5e1310", new Object[]{this, new Integer(i), str, pudVar});
        } else {
            this.favoriteService.d(i, str, 6, pudVar, this);
        }
    }

    @Override // tb.rud
    public void deleteFavoriteItem(String str, pud pudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b2a9d9", new Object[]{this, str, pudVar});
        } else {
            this.favoriteService.e(str, 3, pudVar, this);
        }
    }

    public void deleteFavoriteItems(String[] strArr, pud pudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de91905", new Object[]{this, strArr, pudVar});
        } else {
            this.favoriteService.g(strArr, 4, pudVar, this);
        }
    }
}
