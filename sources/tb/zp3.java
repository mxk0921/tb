package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.goods.response.CheckCollectResponseData;
import com.taobao.android.favoritesdk.goods.response.CollectionidsGetResponseData;
import com.taobao.android.favoritesdk.goods.response.ItemListModel;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zp3 implements mnd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_ERROR_CODE = "favorite_sdk";
    public static ItemListModel e;
    public static nnd f;
    public static ond g;

    /* renamed from: a  reason: collision with root package name */
    public hs6 f32920a;
    public String c;
    public int b = 0;
    public long d = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements jzo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tzo f32921a;

        public a(tzo tzoVar) {
            this.f32921a = tzoVar;
        }

        @Override // tb.jzo
        public void onError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fed7cd43", new Object[]{this, new Integer(i), str, str2, obj});
                return;
            }
            TLog.logd("FAVSDK_CheckCollectBusiness", "hit model mtop request is onError");
            AppMonitor.Alarm.commitFail("Favorite_SDK", "MtopApiCall", "mtop.taobao.mercury.checkCollect_" + zp3.d(zp3.this), str, str2);
        }

        @Override // tb.jzo
        public void onSuccess(int i, tzo tzoVar, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35f22ba", new Object[]{this, new Integer(i), tzoVar, obj});
                return;
            }
            AppMonitor.Alarm.commitSuccess("Favorite_SDK", "MtopApiCall", "mtop.taobao.mercury.checkCollect_" + zp3.d(zp3.this));
            if (tzoVar != null) {
                tzo tzoVar2 = this.f32921a;
                if (tzoVar2.c && tzoVar.c) {
                    if (((CheckCollectResponseData) tzoVar2.e).isFavItem == ((CheckCollectResponseData) tzoVar.e).isFavItem) {
                        TLog.logd("FAVSDK_CheckCollectBusiness", "item collected in cache is right");
                        str = Constants.VAL_YES;
                    } else {
                        TLog.logd("FAVSDK_CheckCollectBusiness", "item collected in cache is wrong");
                        str = "no";
                    }
                    AppMonitor.Counter.commit("Favorite_SDK", "FavoriteStateCacheCorrect", str, 1.0d);
                }
            }
        }

        @Override // tb.jzo
        public void onSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffc91052", new Object[]{this, new Integer(i), str, str2, obj});
                return;
            }
            TLog.logd("FAVSDK_CheckCollectBusiness", "hit model mtop request is onSystemError");
            AppMonitor.Alarm.commitFail("Favorite_SDK", "MtopApiCall", "mtop.taobao.mercury.checkCollect_" + zp3.d(zp3.this), str, str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements psk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.psk
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0a545a6", new Object[]{this, new Boolean(z)});
                return;
            }
            TLog.logd("FAVSDK_CheckCollectBusiness", "cacheFavItemList isSuccess = " + z);
            if (z) {
                zp3.B("writeVfs");
            } else {
                zp3.A("writeVfs");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements psk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.psk
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0a545a6", new Object[]{this, new Boolean(z)});
                return;
            }
            TLog.logd("FAVSDK_CheckCollectBusiness", "cleanCache isSuccess = " + z);
            if (z) {
                zp3.B("writeVfs");
            } else {
                zp3.A("writeVfs");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32922a;
        public final /* synthetic */ String b;

        public d(String str, String str2) {
            this.f32922a = str;
            this.b = str2;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/favoritesdk/goods/business/CheckCollectBusiness$4");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            zp3 zp3Var = new zp3();
            zp3.e(zp3Var, this.f32922a);
            zp3.f(zp3Var);
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("213d104", new Object[]{this, r5});
                return;
            }
            super.onPostExecute(r5);
            if (zp3.z()) {
                zp3.h(this.b, zp3.g());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32923a;
        public final /* synthetic */ String b;

        public e(String str, String str2) {
            this.f32923a = str;
            this.b = str2;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/favoritesdk/goods/business/CheckCollectBusiness$5");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            zp3 zp3Var = new zp3();
            zp3.e(zp3Var, this.f32923a);
            zp3.f(zp3Var);
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("213d104", new Object[]{this, r5});
                return;
            }
            super.onPostExecute(r5);
            if (zp3.z()) {
                zp3.i(this.b, zp3.g());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f extends AsyncTask<String, Void, tzo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public jzo f32924a;

        static {
            t2o.a(463470609);
        }

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/favoritesdk/goods/business/CheckCollectBusiness$IsFavAsyncTask");
        }

        /* renamed from: a */
        public tzo doInBackground(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tzo) ipChange.ipc$dispatch("76adb4a2", new Object[]{this, strArr});
            }
            return zp3.this.w(strArr[0]);
        }

        /* renamed from: b */
        public void onPostExecute(tzo tzoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d28643", new Object[]{this, tzoVar});
                return;
            }
            super.onPostExecute(tzoVar);
            TLog.logd("FAVSDK_CheckCollectBusiness", "sdkResponse = " + tzoVar.toString());
            if (tzoVar.c) {
                jzo jzoVar = this.f32924a;
                zp3 zp3Var = zp3.this;
                jzoVar.onSuccess(zp3Var.b, tzoVar, zp3.c(zp3Var));
            } else if (tzoVar.d) {
                jzo jzoVar2 = this.f32924a;
                zp3 zp3Var2 = zp3.this;
                jzoVar2.onSystemError(zp3Var2.b, tzoVar.f29047a, tzoVar.b, zp3.c(zp3Var2));
            } else {
                jzo jzoVar3 = this.f32924a;
                zp3 zp3Var3 = zp3.this;
                int i = zp3Var3.b;
                String str = tzoVar.f29047a;
                jzoVar3.onError(i, str, str, zp3.c(zp3Var3));
            }
        }

        public /* synthetic */ f(zp3 zp3Var, a aVar) {
            this();
        }
    }

    static {
        t2o.a(463470603);
        t2o.a(463470647);
    }

    public zp3() {
        f = k39.b();
        g = k39.c();
    }

    public static void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f407e9", new Object[]{str});
        } else {
            AppMonitor.Alarm.commitFail("Favorite_SDK", "LocalStorage", str, "", "");
        }
    }

    public static void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5ee3a4", new Object[]{str});
        } else {
            AppMonitor.Alarm.commitSuccess("Favorite_SDK", "LocalStorage", str);
        }
    }

    public static void C(String str, ItemListModel itemListModel) {
        HashSet<String> hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3cf33", new Object[]{str, itemListModel});
            return;
        }
        TLog.logd("FAVSDK_CheckCollectBusiness", "setFavItemIdInCache");
        if (itemListModel != null && (hashSet = itemListModel.itemList) != null && hashSet.add(str)) {
            l(itemListModel);
        }
    }

    public static /* synthetic */ Object c(zp3 zp3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("152e57f", new Object[]{zp3Var});
        }
        zp3Var.getClass();
        return null;
    }

    public static /* synthetic */ String d(zp3 zp3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f33c524c", new Object[]{zp3Var});
        }
        return zp3Var.c;
    }

    public static /* synthetic */ String e(zp3 zp3Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4b0580", new Object[]{zp3Var, str});
        }
        zp3Var.c = str;
        return str;
    }

    public static /* synthetic */ ItemListModel f(zp3 zp3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemListModel) ipChange.ipc$dispatch("106ce23f", new Object[]{zp3Var});
        }
        return zp3Var.v();
    }

    public static /* synthetic */ ItemListModel g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemListModel) ipChange.ipc$dispatch("dfcc7a25", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ void h(String str, ItemListModel itemListModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e41634", new Object[]{str, itemListModel});
        } else {
            o(str, itemListModel);
        }
    }

    public static /* synthetic */ void i(String str, ItemListModel itemListModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8558d3", new Object[]{str, itemListModel});
        } else {
            C(str, itemListModel);
        }
    }

    public static void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc47bc23", new Object[]{str, str2});
            return;
        }
        TLog.logd("FAVSDK_CheckCollectBusiness", "cacheFavItemInside");
        ond ondVar = g;
        if (ondVar != null && !TextUtils.isEmpty(ondVar.getUserId()) && !TextUtils.isEmpty(str)) {
            if (z()) {
                C(str, e);
            } else {
                new e(str2, str).execute(new Void[0]);
            }
        }
    }

    public static void l(ItemListModel itemListModel) {
        ond ondVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9979369", new Object[]{itemListModel});
        } else if (itemListModel != null && (ondVar = g) != null && !TextUtils.isEmpty(ondVar.getUserId())) {
            try {
                nnd nndVar = f;
                nndVar.a("item_list_key-" + g.getUserId(), itemListModel, new b());
            } catch (Exception unused) {
                m();
                A("writeVfs");
            }
        }
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b90ec0", new Object[0]);
            return;
        }
        try {
            nnd nndVar = f;
            nndVar.b("item_list_key-" + g.getUserId(), new c());
        } catch (Exception e2) {
            e2.printStackTrace();
            A("writeVfs");
        }
    }

    public static void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d170537", new Object[]{str, str2});
            return;
        }
        ond ondVar = g;
        if (ondVar != null && !TextUtils.isEmpty(ondVar.getUserId()) && !TextUtils.isEmpty(str)) {
            if (z()) {
                o(str, e);
            } else {
                new d(str2, str).execute(new Void[0]);
            }
        }
    }

    public static void o(String str, ItemListModel itemListModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7405dc", new Object[]{str, itemListModel});
            return;
        }
        TLog.logd("FAVSDK_CheckCollectBusiness", "deleteFavItemsInCache");
        if (itemListModel != null && itemListModel.itemList != null && !TextUtils.isEmpty(str)) {
            try {
                String[] split = str.substring(1, str.length() - 1).split(",");
                if (split.length > 0) {
                    for (String str2 : split) {
                        if (!TextUtils.isEmpty(str2)) {
                            str2 = str2.trim();
                        }
                        itemListModel.itemList.remove(str2);
                    }
                }
                l(itemListModel);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a5d1467", new Object[0])).booleanValue();
        }
        if (e != null) {
            if (System.currentTimeMillis() - e.cacheTime < Long.parseLong(OrangeConfig.getInstance().getConfig("favorite_sdk", uzo.FAV_ORANGE_INVALID_TIME, "86400")) * 1000) {
                z = true;
            }
            if (!z) {
                TLog.logd("FAVSDK_CheckCollectBusiness", "isStaticItemListModelValid invalid so cleanCache");
                m();
            }
            TLog.logd("FAVSDK_CheckCollectBusiness", "isStaticItemListModelValid is " + z);
            return z;
        }
        TLog.logd("FAVSDK_CheckCollectBusiness", "isStaticItemListModelValid is false");
        return false;
    }

    @Override // tb.mnd
    public tzo a(ljd ljdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("1482e794", new Object[]{this, ljdVar, str});
        }
        TLog.logd("FAVSDK_CheckCollectBusiness", "syncRequest");
        this.c = str;
        this.f32920a = ljdVar.a();
        return w(((bq3) ljdVar).b());
    }

    @Override // tb.mnd
    public void b(int i, ljd ljdVar, String str, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426a3b2c", new Object[]{this, new Integer(i), ljdVar, str, jzoVar});
            return;
        }
        TLog.logd("FAVSDK_CheckCollectBusiness", "asyncRequest");
        this.b = i;
        this.c = str;
        this.f32920a = ljdVar.a();
        String b2 = ((bq3) ljdVar).b();
        szo szoVar = new szo();
        f fVar = new f(this, null);
        fVar.f32924a = jzoVar;
        fVar.execute(b2);
        szoVar.b = fVar;
        this.f32920a.d().n(szoVar);
    }

    public final void j(String str, tzo tzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a5510", new Object[]{this, str, tzoVar});
            return;
        }
        TLog.logd("FAVSDK_CheckCollectBusiness", "hit model is on");
        bq3 bq3Var = new bq3();
        bq3Var.c(str);
        j39.i().r(true).b(1, bq3Var, this.c, new a(tzoVar));
    }

    public final tzo p(String str, ItemListModel itemListModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("28fb4268", new Object[]{this, str, itemListModel});
        }
        tzo tzoVar = new tzo();
        CheckCollectResponseData checkCollectResponseData = new CheckCollectResponseData();
        if (itemListModel == null) {
            TLog.logd("FAVSDK_CheckCollectBusiness", "item not collected because network failed");
            tzoVar.c = true;
            checkCollectResponseData.isFavItem = false;
            tzoVar.e = checkCollectResponseData;
        } else if (x(itemListModel.itemList, str)) {
            TLog.logd("FAVSDK_CheckCollectBusiness", "item collected");
            tzoVar.c = true;
            checkCollectResponseData.isFavItem = true;
            tzoVar.e = checkCollectResponseData;
        } else {
            TLog.logd("FAVSDK_CheckCollectBusiness", "item not collected");
            tzoVar.c = true;
            checkCollectResponseData.isFavItem = false;
            tzoVar.e = checkCollectResponseData;
        }
        return tzoVar;
    }

    public final tzo q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("9489b385", new Object[]{this});
        }
        tzo tzoVar = new tzo();
        AppMonitor.Counter.commit("Favorite_SDK", "FavoriteStateProvider", "directReturn", 1.0d);
        TLog.logd("FAVSDK_CheckCollectBusiness", "direct return false");
        CheckCollectResponseData checkCollectResponseData = new CheckCollectResponseData();
        tzoVar.c = true;
        tzoVar.f29047a = "favorite_sdk_direct_return";
        checkCollectResponseData.isFavItem = false;
        tzoVar.e = checkCollectResponseData;
        return tzoVar;
    }

    public final ItemListModel r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemListModel) ipChange.ipc$dispatch("ba64d973", new Object[]{this});
        }
        ond ondVar = g;
        if (ondVar == null || TextUtils.isEmpty(ondVar.getUserId())) {
            TLog.logd("FAVSDK_CheckCollectBusiness", "getFavItemListFromCache not login");
            return null;
        }
        try {
            nnd nndVar = f;
            ItemListModel itemListModel = (ItemListModel) nndVar.c("item_list_key-" + g.getUserId());
            if (itemListModel == null) {
                TLog.logd("FAVSDK_CheckCollectBusiness", "getFavItemListFromCache has not cache data ");
            } else {
                TLog.logd("FAVSDK_CheckCollectBusiness", "getFavItemListFromCache has cache data");
            }
            B("readVfs");
            return itemListModel;
        } catch (Exception unused) {
            m();
            A("readVfs");
            return null;
        }
    }

    public final tzo t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("a904c8d0", new Object[]{this});
        }
        tzo tzoVar = new tzo();
        AppMonitor.Counter.commit("Favorite_SDK", "FavoriteStateProvider", "loginOffDirectReturn", 1.0d);
        tzoVar.c = false;
        tzoVar.f29047a = "favorite_sdk_login_invalid";
        return tzoVar;
    }

    public final ItemListModel v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemListModel) ipChange.ipc$dispatch("f3126191", new Object[]{this});
        }
        ItemListModel r = r();
        if (r == null) {
            TLog.logd("FAVSDK_CheckCollectBusiness", "getUsefulFavItemList is null so go to getFavItemListFromNet");
            r = s();
            AppMonitor.Counter.commit("Favorite_SDK", "FavoriteStateProvider", "listItemsApi", 1.0d);
        } else if (System.currentTimeMillis() - r.cacheTime < Long.parseLong(OrangeConfig.getInstance().getConfig("favorite_sdk", uzo.FAV_ORANGE_INVALID_TIME, "86400")) * 1000) {
            TLog.logd("FAVSDK_CheckCollectBusiness", "getUsefulFavItemList valid");
            AppMonitor.Counter.commit("Favorite_SDK", "FavoriteStateProvider", "localCache", 1.0d);
        } else {
            TLog.logd("FAVSDK_CheckCollectBusiness", "getUsefulFavItemList invalid so go to getFavItemListFromNet");
            r = s();
            AppMonitor.Counter.commit("Favorite_SDK", "FavoriteStateProvider", "listItemsApi", 1.0d);
        }
        if (r != null) {
            e = r;
        } else {
            TLog.logd("FAVSDK_CheckCollectBusiness", "getUsefulFavItemList return itemListModel = null ");
        }
        return r;
    }

    public final boolean x(HashSet<String> hashSet, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39e06e68", new Object[]{this, hashSet, str})).booleanValue();
        }
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        return hashSet.contains(str);
    }

    public final boolean y(String str, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a5c67ca", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (g == null || str == null || str.length() == 0) {
            StringBuilder sb = new StringBuilder("CheckCollectBusiness.isRightUser return default, mSdkLoginIsNull?");
            if (g != null) {
                z2 = false;
            }
            sb.append(z2);
            sb.append(",switchValue=");
            sb.append(str);
            sb.append(",defaultValue=");
            sb.append(z);
            TLog.loge(v29.TLOG_TAG, sb.toString());
            return z;
        }
        String str2 = null;
        try {
            int parseInt = Integer.parseInt(str);
            str2 = g.getUserId();
            if (!TextUtils.isEmpty(str2)) {
                if (Long.parseLong(str2) % 1000 < parseInt) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } catch (NumberFormatException e2) {
            TLog.loge(v29.TLOG_TAG, "CheckCollectBusiness.isRightUser parse userId error, switchValue=" + str + ",userId=" + str2 + ",defaultValue=" + z + ", error=" + e2.toString());
            e2.printStackTrace();
        }
        if (!z) {
            TLog.loge(v29.TLOG_TAG, "CheckCollectBusiness.isRightUser false, userIdString=" + str2 + ",switchValue=" + str);
        }
        return z;
    }

    public final ItemListModel s() {
        ond ondVar;
        String str;
        String str2;
        Exception e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemListModel) ipChange.ipc$dispatch("7346eb8e", new Object[]{this});
        }
        ItemListModel itemListModel = null;
        if (!y(OrangeConfig.getInstance().getConfig("favorite_sdk", uzo.FAV_ORANGE_IS_USE_COLLECTIONS_IDS_RIGHT_USER, "1000"), true) || (ondVar = g) == null || !ondVar.isSessionValid()) {
            AppMonitor.Counter.commit("Favorite_SDK", "FavoriteStateProvider", "directReturn", 1.0d);
            return null;
        } else if (Math.abs(System.currentTimeMillis() - this.d) < 1000 && !uzo.d()) {
            return null;
        } else {
            this.d = System.currentTimeMillis();
            ez3 ez3Var = new ez3();
            ez3Var.b(200L);
            tzo a2 = j39.i().a(ez3Var, this.c);
            if (a2 == null || !a2.c) {
                if (a2 != null) {
                    str = a2.f29047a;
                    str2 = a2.b;
                } else {
                    str = "";
                    str2 = str;
                }
                TLog.logd("FAVSDK_CheckCollectBusiness", "get itemListModel from net error");
                AppMonitor.Alarm.commitFail("Favorite_SDK", "MtopApiCall", "mtop.taobao.mercury.collectionids.get_" + this.c, str, str2);
            } else {
                Object obj = a2.e;
                if (obj != null) {
                    try {
                        HashSet<String> hashSet = ((CollectionidsGetResponseData) obj).result;
                        if (hashSet == null) {
                            hashSet = new HashSet<>();
                        }
                        ItemListModel itemListModel2 = new ItemListModel();
                        try {
                            itemListModel2.itemList = hashSet;
                            itemListModel2.cacheTime = System.currentTimeMillis();
                            TLog.logd("FAVSDK_CheckCollectBusiness", "get itemListModel from net success");
                            l(itemListModel2);
                            itemListModel = itemListModel2;
                        } catch (Exception e3) {
                            e2 = e3;
                            itemListModel = itemListModel2;
                            e2.printStackTrace();
                            AppMonitor.Alarm.commitSuccess("Favorite_SDK", "MtopApiCall", "mtop.taobao.mercury.collectionids.get_" + this.c);
                            return itemListModel;
                        }
                    } catch (Exception e4) {
                        e2 = e4;
                    }
                }
                AppMonitor.Alarm.commitSuccess("Favorite_SDK", "MtopApiCall", "mtop.taobao.mercury.collectionids.get_" + this.c);
            }
            return itemListModel;
        }
    }

    public final tzo u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("8d8d28f9", new Object[]{this, str});
        }
        AppMonitor.Counter.commit("Favorite_SDK", "FavoriteStateProvider", "singleItemApi", 1.0d);
        TLog.logd("FAVSDK_CheckCollectBusiness", "go network check collect");
        bq3 bq3Var = new bq3();
        bq3Var.c(str);
        j39 i = j39.i();
        i.r(true);
        tzo a2 = i.a(bq3Var, this.c);
        if (a2 == null) {
            a2 = new tzo();
        } else {
            CheckCollectResponseData checkCollectResponseData = (CheckCollectResponseData) a2.e;
            if (checkCollectResponseData != null) {
                TLog.logd("FAVSDK_CheckCollectBusiness", a2.toString() + " CheckCollectResponseData isFavItem  = " + checkCollectResponseData.isFavItem);
            }
        }
        AppMonitor.Alarm.commitSuccess("Favorite_SDK", "MtopApiCall", "mtop.taobao.mercury.checkCollect_" + this.c);
        return a2;
    }

    public tzo w(String str) {
        ItemListModel itemListModel;
        ond ondVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("8219f6d2", new Object[]{this, str});
        }
        try {
            AppMonitor.Counter.commit("Favorite_SDK", "FavoriteStateProvider", "isFavoriteItem_" + this.c, 1.0d);
            ond ondVar2 = g;
            if (ondVar2 != null && ondVar2.isSessionValid()) {
                String config = OrangeConfig.getInstance().getConfig("favorite_sdk", uzo.FAV_ORANGE_IS_FAV_RIGHT_USER, "1000");
                TLog.logd("FAVSDK_CheckCollectBusiness", "isFavoriteItem switchValue = " + config);
                if (!y(config, false)) {
                    return q();
                }
                if (y(OrangeConfig.getInstance().getConfig("favorite_sdk", uzo.FAV_ORANGE_IS_FAV_CACHE_RIGHT_USER, "1000"), true)) {
                    TLog.logd("FAVSDK_CheckCollectBusiness", "can use cache");
                    if (z()) {
                        TLog.logd("FAVSDK_CheckCollectBusiness", "static itemList model valid");
                        itemListModel = e;
                        AppMonitor.Counter.commit("Favorite_SDK", "FavoriteStateProvider", "localCache", 1.0d);
                    } else {
                        itemListModel = v();
                    }
                    tzo p = p(str, itemListModel);
                    if (y(OrangeConfig.getInstance().getConfig("favorite_sdk", uzo.FAV_ORANGE_IS_FAV_HIT_MODE_RIGHT_USER, "0"), false) && (ondVar = g) != null && ondVar.isSessionValid()) {
                        j(str, p);
                    }
                    return p;
                }
                TLog.loge(v29.TLOG_TAG, "CheckCollectBusiness.isFavoriteItem empty error code");
                return u(str);
            }
            StringBuilder sb = new StringBuilder("CheckCollectBusiness.isFavoriteItem login_invalid error, mSdkLoginIsNull?");
            if (g != null) {
                z = false;
            }
            sb.append(z);
            sb.append(",isSessionValid=");
            ond ondVar3 = g;
            sb.append(ondVar3 == null ? null : Boolean.valueOf(ondVar3.isSessionValid()));
            TLog.loge(v29.TLOG_TAG, sb.toString());
            return t();
        } catch (Exception e2) {
            e2.printStackTrace();
            return q();
        }
    }
}
