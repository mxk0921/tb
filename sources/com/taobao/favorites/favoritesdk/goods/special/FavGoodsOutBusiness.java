package com.taobao.favorites.favoritesdk.goods.special;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.favorites.favoritesdk.base.ModelSdkBusiness;
import com.taobao.favorites.favoritesdk.base.ResultListener;
import com.taobao.favorites.favoritesdk.goods.response.MtopTaobaoMercuryAddCollectResponse;
import com.taobao.favorites.favoritesdk.goods.response.MtopTaobaoMercuryCheckCollectResponse;
import com.taobao.favorites.favoritesdk.goods.response.MtopTaobaoMercuryCheckCollectResponseData;
import com.taobao.favorites.favoritesdk.goods.response.MtopTaobaoMercuryDelCollectsResponse;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import org.json.JSONObject;
import tb.fdb;
import tb.op;
import tb.t2o;
import tb.tha;
import tb.v29;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FavGoodsOutBusiness implements ResultListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_ERROR_CODE = "favorite_offer_error";
    private static final long DEFAULT_INVALID_TIME = 86400;
    private static final String FAV_ORANGE_CACHE_MODE = "FavCacheMode";
    private static final String FAV_ORANGE_GROUP_NAME = "favorites";
    private static final String FAV_ORANGE_HIT_SWTICH = "IsFavHitMode";
    private static final String FAV_ORANGE_INVALID_TIME = "FavListInvalidTime";
    private static final String FAV_ORANGE_IS_FAV_CACHE_RIGHT_USER = "IsFavCacheRightUser";
    private static final String FAV_ORANGE_IS_FAV_HIT_MODE_RIGHT_USER = "IsFavHitModeRightUser";
    private static final String FAV_ORANGE_IS_FAV_RIGHT_USER = "IsFavRightUser";
    private static final String FAV_ORANGE_IS_USE_COLLECTIONS_IDS = "IsUseCollectionIds";
    private static final String FAV_ORANGE_IS_USE_COLLECTIONS_IDS_RIGHT_USER = "IsUseCollectionIdsRightUser";
    private static final String ITEM_LIST_KEY = "item_list_key";
    private static final int REQUEST_ADD_FAV_ITEM = 2;
    private static final int REQUEST_DELETE_FAV_ITEM = 3;
    private static final int REQUEST_ITEM_FAV = 1;
    private static final int REQUEST_ITEM_FAV_CALCULATE = 4;
    private static final String TAG = "FavGoodsOutBusiness";
    private static ItemListModel mItemlistModel;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends AsyncTask<Void, Void, h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10548a;
        public final /* synthetic */ g b;

        public a(String str, g gVar) {
            this.f10548a = str;
            this.b = gVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/favoritesdk/goods/special/FavGoodsOutBusiness$1");
        }

        /* renamed from: b */
        public void onPostExecute(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f94af67", new Object[]{this, hVar});
                return;
            }
            super.onPostExecute(hVar);
            this.b.a(hVar);
            String config = OrangeConfig.getInstance().getConfig("favorites", FavGoodsOutBusiness.FAV_ORANGE_HIT_SWTICH, "false");
            boolean access$300 = FavGoodsOutBusiness.access$300(FavGoodsOutBusiness.this, OrangeConfig.getInstance().getConfig("favorites", "IsFavHitModeRightUser", "1000"), false);
            if (Boolean.parseBoolean(config) && access$300 && Login.checkSessionValid()) {
                TLog.logd(FavGoodsOutBusiness.TAG, "isFavoriteItem hit rate open");
                ModelSdkBusiness.b(tha.b(Arrays.toString(new String[]{this.f10548a}), 1L)).d(hVar).g(4, MtopTaobaoMercuryCheckCollectResponse.class, FavGoodsOutBusiness.this);
            }
        }

        /* renamed from: a */
        public h doInBackground(Void... voidArr) {
            ItemListModel itemListModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("b253a7cb", new Object[]{this, voidArr});
            }
            h hVar = new h(FavGoodsOutBusiness.this);
            if (FavGoodsOutBusiness.access$000()) {
                TLog.logd(FavGoodsOutBusiness.TAG, "isFavoriteItem use static cache ");
                itemListModel = FavGoodsOutBusiness.access$100();
                AppMonitor.Counter.commit("Favorite", "FavoriteStateProvider", "localCache", 1.0d);
            } else {
                TLog.logd(FavGoodsOutBusiness.TAG, "isFavoriteItem not use static cache ");
                itemListModel = FavGoodsOutBusiness.this.getUsefulFavItemList();
            }
            if (itemListModel == null) {
                TLog.logd(FavGoodsOutBusiness.TAG, "isFavoriteItem get itemlist fail so return false");
                hVar.f10552a = true;
                HashMap hashMap = new HashMap();
                hVar.c = hashMap;
                hashMap.put("isFavorite", Boolean.FALSE);
                hVar.d = "未收藏";
            } else if (FavGoodsOutBusiness.access$200(FavGoodsOutBusiness.this, itemListModel.itemList, this.f10548a)) {
                hVar.f10552a = true;
                HashMap hashMap2 = new HashMap();
                hVar.c = hashMap2;
                hashMap2.put("isFavorite", Boolean.TRUE);
                hVar.d = "已收藏";
            } else {
                hVar.f10552a = true;
                HashMap hashMap3 = new HashMap();
                hVar.c = hashMap3;
                hashMap3.put("isFavorite", Boolean.FALSE);
                hVar.d = "未收藏";
            }
            return hVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements fdb.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.fdb.g
        public void onObjectRemoveCallback(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbe537fc", new Object[]{this, str, new Boolean(z)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/favoritesdk/goods/special/FavGoodsOutBusiness$3");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            if (FavGoodsOutBusiness.access$000()) {
                return null;
            }
            FavGoodsOutBusiness.this.getUsefulFavItemList();
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements fdb.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.fdb.i
        public void onObjectSetCallback(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c2b525a", new Object[]{this, str, new Boolean(z)});
            } else if (z) {
                TLog.logd(FavGoodsOutBusiness.TAG, "itemList cached in disk ");
                FavGoodsOutBusiness.localStorageSuccess("writeVfs");
            } else {
                TLog.logd(FavGoodsOutBusiness.TAG, "itemList cached error ");
                FavGoodsOutBusiness.localStorageError("writeVfs");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10550a;

        public e(String str) {
            this.f10550a = str;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/favoritesdk/goods/special/FavGoodsOutBusiness$5");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            new FavGoodsOutBusiness().getUsefulFavItemList();
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
            if (FavGoodsOutBusiness.access$000()) {
                FavGoodsOutBusiness.setFavItemIdInCache(this.f10550a, FavGoodsOutBusiness.access$100());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class f extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10551a;

        public f(String str) {
            this.f10551a = str;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/favoritesdk/goods/special/FavGoodsOutBusiness$6");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            new FavGoodsOutBusiness().getUsefulFavItemList();
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
            if (FavGoodsOutBusiness.access$000()) {
                FavGoodsOutBusiness.access$400(this.f10551a, FavGoodsOutBusiness.access$100());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface g {
        void a(h hVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10552a;
        public String b;
        public Map<String, Object> c;
        public String d;

        static {
            t2o.a(707788878);
        }

        public h(FavGoodsOutBusiness favGoodsOutBusiness) {
        }
    }

    static {
        t2o.a(707788870);
        t2o.a(707788836);
    }

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return isStaticItemListModelValid();
    }

    public static /* synthetic */ ItemListModel access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemListModel) ipChange.ipc$dispatch("ecc05a80", new Object[0]);
        }
        return mItemlistModel;
    }

    public static /* synthetic */ boolean access$200(FavGoodsOutBusiness favGoodsOutBusiness, HashSet hashSet, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb71b5b", new Object[]{favGoodsOutBusiness, hashSet, str})).booleanValue();
        }
        return favGoodsOutBusiness.isItemCollected(hashSet, str);
    }

    public static /* synthetic */ boolean access$300(FavGoodsOutBusiness favGoodsOutBusiness, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75794bcd", new Object[]{favGoodsOutBusiness, str, new Boolean(z)})).booleanValue();
        }
        return favGoodsOutBusiness.isRightUser(str, z);
    }

    public static /* synthetic */ void access$400(String str, ItemListModel itemListModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b91c4a7", new Object[]{str, itemListModel});
        } else {
            deleteFavItemsInCache(str, itemListModel);
        }
    }

    private static void cacheFavItemList(ItemListModel itemListModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd4ff53", new Object[]{itemListModel});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "private static void cacheFavItemList(ItemListModel model)", "20180112");
        if (!isUseUniteCache()) {
            cacheWithShare(itemListModel);
        } else if (itemListModel != null && !TextUtils.isEmpty(Login.getUserId())) {
            try {
                fdb w = AVFSCacheManager.getInstance().cacheForModule("favorite").Z(FavGoodsOutBusiness.class.getClassLoader()).L(new op()).w();
                w.m0("item_list_key-" + Login.getUserId(), itemListModel, new d());
            } catch (Exception unused) {
                localStorageError("writeVfs");
                cleanCache();
            }
        }
    }

    public static void cacheStaticFavItemList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b572663", new Object[0]);
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public static void cacheStaticFavItemList()", "20180112");
        if (isStaticItemListModelValid()) {
            cacheFavItemList(mItemlistModel);
        }
    }

    private static void cleanCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b90ec0", new Object[0]);
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "private static void cleanCache()", "20180112");
        TLog.logd(TAG, "itemList cache valid or error and clean ");
        try {
            fdb w = AVFSCacheManager.getInstance().cacheForModule("favorite").Z(FavGoodsOutBusiness.class.getClassLoader()).L(new op()).w();
            w.D("item_list_key-" + Login.getUserId(), new b());
        } catch (Exception unused) {
            TLog.logd(TAG, "itemList clean error in disk");
            localStorageError("writeVfs");
        }
    }

    private static void cleanWithShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ff72f7", new Object[0]);
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "private static void cleanWithShare()", "20180112");
        TLog.logd(TAG, "itemList cache valid or error and clean in share disk");
        if (!TextUtils.isEmpty(Login.getUserId())) {
            try {
                SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences("favorite", 0).edit();
                edit.putString("item_list_key-" + Login.getUserId(), null);
                edit.apply();
            } catch (Exception unused) {
                TLog.logd(TAG, "itemList clean error in share disk");
                localStorageError("writeLocal");
            }
        }
    }

    private static ItemListModel getWithShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemListModel) ipChange.ipc$dispatch("6b59676e", new Object[0]);
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "private static ItemListModel getWithShare()", "20180112");
        if (TextUtils.isEmpty(Login.getUserId())) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences("favorite", 0);
            String string = sharedPreferences.getString("item_list_key-" + Login.getUserId(), null);
            if (!TextUtils.isEmpty(string)) {
                ItemListModel itemListModel = (ItemListModel) JSON.parseObject(string, ItemListModel.class);
                localStorageSuccess("readLocal");
                return itemListModel;
            }
            localStorageSuccess("readLocal");
            return null;
        } catch (Exception unused) {
            localStorageError("readLocal");
            cleanWithShare();
            return null;
        }
    }

    private static boolean isStaticItemListModelValid() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a5d1467", new Object[0])).booleanValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "private static boolean isStaticItemListModelValid()", "20180112");
        if (mItemlistModel != null) {
            if (System.currentTimeMillis() - mItemlistModel.cacheTime < Long.parseLong(OrangeConfig.getInstance().getConfig("favorites", "FavListInvalidTime", "86400")) * 1000) {
                z = true;
            }
            TLog.logd(TAG, "itemList static cache valid : " + z);
            if (!z) {
                cleanCache();
            }
            return z;
        }
        TLog.logd(TAG, "itemList has no static cache");
        return false;
    }

    public static boolean isUseUniteCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1ee09", new Object[0])).booleanValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public static boolean isUseUniteCache()", "20180112");
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("favorites", FAV_ORANGE_CACHE_MODE, "true"));
    }

    public static void localStorageError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f407e9", new Object[]{str});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public static void localStorageError(String readOrwrite)", "20180112");
        AppMonitor.Alarm.commitFail("Favorite", "LocalStorage", str, "", "");
    }

    public static void localStorageSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5ee3a4", new Object[]{str});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public static void localStorageSuccess(String readOrwrite)", "20180112");
        AppMonitor.Alarm.commitSuccess("Favorite", "LocalStorage", str);
    }

    public static String resultJson(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea6c6642", new Object[]{str, new Boolean(z)});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public static String resultJson(String key, boolean value)", "20180112");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, z);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static void setFavItemIdInCache(String str, ItemListModel itemListModel) {
        HashSet<String> hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a203cc9", new Object[]{str, itemListModel});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public static void setFavItemIdInCache(String itemId, ItemListModel model)", "20180112");
        if (itemListModel != null && (hashSet = itemListModel.itemList) != null) {
            if (hashSet.add(str)) {
                TLog.logd(TAG, "item cached");
                cacheFavItemList(itemListModel);
                return;
            }
            TLog.logd(TAG, "item not cache because has one in itemList");
        }
    }

    public void addFavoriteItem(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d48237f", new Object[]{this, str, gVar});
        } else {
            coreAddFavoriteItem(str, null, gVar);
        }
    }

    public ItemListModel getUsefulFavItemList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemListModel) ipChange.ipc$dispatch("178155b1", new Object[]{this});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public ItemListModel getUsefulFavItemList()", "20180112");
        ItemListModel favItemListFromCache = getFavItemListFromCache();
        if (favItemListFromCache == null) {
            TLog.logd(TAG, "itemlist has no disk cache");
            favItemListFromCache = getFavItemListFromNet();
            AppMonitor.Counter.commit("Favorite", "FavoriteStateProvider", "listItemsApi", 1.0d);
        } else if (System.currentTimeMillis() - favItemListFromCache.cacheTime < Long.parseLong(OrangeConfig.getInstance().getConfig("favorites", "FavListInvalidTime", "86400")) * 1000) {
            TLog.logd(TAG, "itemlist disk cache is valid");
            AppMonitor.Counter.commit("Favorite", "FavoriteStateProvider", "localCache", 1.0d);
        } else {
            TLog.logd(TAG, "itemlist disk cache is invalid");
            favItemListFromCache = getFavItemListFromNet();
            AppMonitor.Counter.commit("Favorite", "FavoriteStateProvider", "listItemsApi", 1.0d);
        }
        if (favItemListFromCache != null) {
            mItemlistModel = favItemListFromCache;
        }
        return favItemListFromCache;
    }

    public static void cacheFavItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3d487d", new Object[]{str});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public static void cacheFavItem(final String itemId)", "20180112");
        if (!TextUtils.isEmpty(Login.getUserId()) && !TextUtils.isEmpty(str)) {
            if (isStaticItemListModelValid()) {
                setFavItemIdInCache(str, mItemlistModel);
            } else {
                new e(str).execute(new Void[0]);
            }
        }
    }

    private static void cacheWithShare(ItemListModel itemListModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8299c7c0", new Object[]{itemListModel});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "private static void cacheWithShare(ItemListModel model)", "20180112");
        if (itemListModel != null && !TextUtils.isEmpty(Login.getUserId())) {
            try {
                SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences("favorite", 0).edit();
                edit.putString("item_list_key-" + Login.getUserId(), JSON.toJSONString(itemListModel));
                edit.apply();
                localStorageSuccess("writeLocal");
                TLog.logd(TAG, "itemList cached in share disk ");
            } catch (Exception unused) {
                TLog.logd(TAG, "itemList cached error in share disk ");
                localStorageError("writeLocal");
                cleanWithShare();
            }
        }
    }

    public static void deleteCacheFavItems(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a48ccad", new Object[]{str});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public static void deleteCacheFavItems(final String itemIds)", "20180112");
        if (!TextUtils.isEmpty(Login.getUserId()) && !TextUtils.isEmpty(str)) {
            if (isStaticItemListModelValid()) {
                deleteFavItemsInCache(str, mItemlistModel);
            } else {
                new f(str).execute(new Void[0]);
            }
        }
    }

    private boolean isItemCollected(HashSet<String> hashSet, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39e06e68", new Object[]{this, hashSet, str})).booleanValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "private boolean isItemCollected(HashSet<String> itemIds, String itemId)", "20180112");
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        TLog.logd(TAG, "item contains in itemList : " + hashSet.contains(str));
        return hashSet.contains(str);
    }

    public void coreAddFavoriteItem(String str, Map map, g gVar) {
        long parseLong;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c44945d", new Object[]{this, str, map, gVar});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public void addFavoriteItem(String itemId, CallBack callBack)", "20180112");
        if (!TextUtils.isEmpty(str)) {
            try {
                parseLong = Long.parseLong(str);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
            ModelSdkBusiness.b(tha.a("mclaren", parseLong, map)).d(gVar).g(2, MtopTaobaoMercuryAddCollectResponse.class, this);
        }
        parseLong = 0;
        ModelSdkBusiness.b(tha.a("mclaren", parseLong, map)).d(gVar).g(2, MtopTaobaoMercuryAddCollectResponse.class, this);
    }

    public void initFavItemList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42671e3", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public void initFavItemList()", "20180112");
        TLog.logd(TAG, "itemList cache init ");
        new c().execute(new Void[0]);
    }

    private static void deleteFavItemsInCache(String str, ItemListModel itemListModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b886db40", new Object[]{str, itemListModel});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "private static void deleteFavItemsInCache(String itemIds, ItemListModel model)", "20180112");
        if (!(itemListModel == null || itemListModel.itemList == null)) {
            String[] split = str.split(",");
            if (split.length > 0) {
                for (String str2 : split) {
                    TLog.logd(TAG, "item moved from cache result : " + itemListModel.itemList.remove(str2));
                }
            }
            cacheFavItemList(itemListModel);
        }
    }

    private ItemListModel getFavItemListFromCache() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemListModel) ipChange.ipc$dispatch("3a7dda0f", new Object[]{this});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "private ItemListModel getFavItemListFromCache()", "20180112");
        if (isUseUniteCache()) {
            ItemListModel itemListModel = null;
            if (TextUtils.isEmpty(Login.getUserId())) {
                return null;
            }
            try {
                fdb w = AVFSCacheManager.getInstance().cacheForModule("favorite").Z(getClass().getClassLoader()).L(new op()).w();
                ItemListModel itemListModel2 = (ItemListModel) w.d0("item_list_key-" + Login.getUserId());
                localStorageSuccess("readVfs");
                itemListModel = itemListModel2;
            } catch (Exception unused) {
                cleanCache();
                localStorageError("readVfs");
            }
            StringBuilder sb = new StringBuilder("get itemlist from disk cache result : ");
            if (itemListModel != null) {
                z = true;
            }
            sb.append(z);
            TLog.logd(TAG, sb.toString());
            return itemListModel;
        }
        ItemListModel withShare = getWithShare();
        StringBuilder sb2 = new StringBuilder("get itemlist from disk share cache result : ");
        if (withShare != null) {
            z = true;
        }
        sb2.append(z);
        TLog.logd(TAG, sb2.toString());
        return withShare;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.favorites.favoritesdk.goods.special.ItemListModel getFavItemListFromNet() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness.getFavItemListFromNet():com.taobao.favorites.favoritesdk.goods.special.ItemListModel");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isRightUser(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "favLog"
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0026
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r11)
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r1] = r9
            r11[r0] = r10
            r10 = 2
            r11[r10] = r2
            java.lang.String r10 = "3a5c67ca"
            java.lang.Object r10 = r3.ipc$dispatch(r10, r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x0026:
            java.lang.String r3 = "private boolean isRightUser(@NonNull String switchValue, boolean defaultValue)"
            java.lang.String r4 = "20180112"
            java.lang.String r5 = "CodeTrack-favorite"
            java.lang.String r6 = "offline"
            java.lang.String r7 = "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness"
            com.alibaba.mtl.appmonitor.AppMonitor.Alarm.commitFail(r5, r6, r7, r3, r4)
            int r3 = java.lang.Integer.parseInt(r10)
            java.lang.String r4 = com.taobao.login4android.api.Login.getUserId()     // Catch: NumberFormatException -> 0x0055
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: NumberFormatException -> 0x0053
            if (r5 != 0) goto L_0x0087
            long r5 = java.lang.Long.parseLong(r4)     // Catch: NumberFormatException -> 0x0053
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 % r7
            long r7 = (long) r3
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x0051
            r11 = 1
            goto L_0x0087
        L_0x0051:
            r11 = 0
            goto L_0x0087
        L_0x0053:
            r0 = move-exception
            goto L_0x0057
        L_0x0055:
            r0 = move-exception
            r4 = 0
        L_0x0057:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "FavGoodsOutBusiness.isRightUser parse userId error, switchValue="
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r3 = ",userId="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ",defaultValue="
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = ", error="
            r1.append(r3)
            java.lang.String r3 = r0.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.taobao.tao.log.TLog.loge(r2, r1)
            r0.printStackTrace()
        L_0x0087:
            if (r11 != 0) goto L_0x00a2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FavGoodsOutBusiness.isRightUser false, userIdString="
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ",switchValue="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.taobao.tao.log.TLog.loge(r2, r10)
        L_0x00a2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness.isRightUser(java.lang.String, boolean):boolean");
    }

    public void deleteFavoriteItem(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdd1935", new Object[]{this, str, gVar});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public void deleteFavoriteItem(String itemId, CallBack callBack)", "20180112");
        ModelSdkBusiness.b(tha.c("mclaren", Arrays.toString(new String[]{str}), 1)).d(gVar).g(3, MtopTaobaoMercuryDelCollectsResponse.class, this);
    }

    public void isFavoriteItem(String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564177d6", new Object[]{this, str, gVar});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public void isFavoriteItem(final String itemId, final CallBack callBack)", "20180112");
        if (!Login.checkSessionValid() || TextUtils.isEmpty(Login.getUserId())) {
            TLog.loge(v29.TLOG_TAG, "isFavoriteItem return favorite_offer_error_login, checkSessionValid=" + Login.checkSessionValid() + ",userId=" + Login.getUserId());
            AppMonitor.Counter.commit("Favorite", "FavoriteStateProvider", "loginOffDirectReturn", 1.0d);
            h hVar = new h(this);
            hVar.b = "favorite_offer_error_login";
            hVar.d = "";
            gVar.a(hVar);
        } else if (!isRightUser(OrangeConfig.getInstance().getConfig("favorites", "IsFavRightUser", "1000"), false)) {
            TLog.loge(v29.TLOG_TAG, "FavGoodsOutBusiness.isFavoriteItem off1 error");
            AppMonitor.Counter.commit("Favorite", "FavoriteStateProvider", "directReturn", 1.0d);
            h hVar2 = new h(this);
            hVar2.b = "favorite_offer_error_off1";
            hVar2.d = "";
            gVar.a(hVar2);
            TLog.logd(TAG, "isFavoriteItem limit off " + hVar2.d);
        } else if (isRightUser(OrangeConfig.getInstance().getConfig("favorites", "IsFavCacheRightUser", "1000"), true)) {
            TLog.logd(TAG, "isFavoriteItem cache service on ");
            new a(str, gVar).execute(new Void[0]);
        } else if (Login.checkSessionValid()) {
            AppMonitor.Counter.commit("Favorite", "FavoriteStateProvider", "singleItemApi", 1.0d);
            TLog.logd(TAG, "isFavoriteItem direct use net");
            ModelSdkBusiness.b(tha.b(Arrays.toString(new String[]{str}), 1L)).d(gVar).g(1, MtopTaobaoMercuryCheckCollectResponse.class, this);
        } else {
            AppMonitor.Counter.commit("Favorite", "FavoriteStateProvider", "loginOffDirectReturn", 1.0d);
            h hVar3 = new h(this);
            hVar3.f10552a = true;
            HashMap hashMap = new HashMap();
            hVar3.c = hashMap;
            hashMap.put("isFavorite", Boolean.FALSE);
            hVar3.d = "未收藏";
            gVar.a(hVar3);
        }
    }

    public void alarmError(int i, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70a720a", new Object[]{this, new Integer(i), mtopResponse});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public void alarmError(int requestType, MtopResponse response)", "20180112");
        String str = "";
        String retCode = (mtopResponse == null || mtopResponse.getRetCode() == null) ? str : mtopResponse.getRetCode();
        String retMsg = (mtopResponse == null || mtopResponse.getRetMsg() == null) ? str : mtopResponse.getRetMsg();
        if (i == 1 || i == 4) {
            str = "mtop.taobao.mercury.checkCollect";
        } else if (i == 3) {
            str = "mtop.taobao.mercury.delCollects";
        } else if (i == 2) {
            str = "mtop.taobao.mercury.addCollect";
        }
        if (!TextUtils.isEmpty(str)) {
            AppMonitor.Alarm.commitFail("Favorite", "MtopApiCall", str, retCode, retMsg);
        }
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public void onError(int requestType, MtopResponse response, Object requestContext)", "20180112");
        if (mtopResponse != null && (i == 1 || i == 3 || i == 2)) {
            h hVar = new h(this);
            g gVar = (g) obj;
            if (i == 2 && "ALREADY_COLLECT".equals(mtopResponse.getRetCode())) {
                hVar.f10552a = true;
                hVar.d = "收藏成功";
                HashMap hashMap = new HashMap();
                hVar.c = hashMap;
                hashMap.put("addResult", Boolean.TRUE);
            } else if (i != 3 || !"IS_NOT_EXIT".equals(mtopResponse.getRetCode())) {
                hVar.b = mtopResponse.getRetCode();
                hVar.d = mtopResponse.getRetMsg();
            } else {
                hVar.f10552a = true;
                hVar.d = "取消收藏成功";
                HashMap hashMap2 = new HashMap();
                hVar.c = hashMap2;
                hashMap2.put("deleteResult", Boolean.TRUE);
            }
            gVar.a(hVar);
        }
        alarmError(i, mtopResponse);
        if (mtopResponse != null) {
            TLog.logd(TAG, "error requestType = " + i + " errorMsg is " + mtopResponse.getRetMsg());
        }
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public void onSystemError(int requestType, MtopResponse response, Object requestContext)", "20180112");
        if (mtopResponse != null && (i == 1 || i == 3 || i == 2)) {
            h hVar = new h(this);
            g gVar = (g) obj;
            if (i == 2 && "ALREADY_COLLECT".equals(mtopResponse.getRetCode())) {
                hVar.f10552a = true;
                hVar.d = "收藏成功";
                HashMap hashMap = new HashMap();
                hVar.c = hashMap;
                hashMap.put("addResult", Boolean.TRUE);
            } else if (i != 3 || !"IS_NOT_EXIT".equals(mtopResponse.getRetCode())) {
                hVar.b = mtopResponse.getRetCode();
                hVar.d = mtopResponse.getRetMsg();
            } else {
                hVar.f10552a = true;
                hVar.d = "取消收藏成功";
                HashMap hashMap2 = new HashMap();
                hVar.c = hashMap2;
                hashMap2.put("deleteResult", Boolean.TRUE);
            }
            gVar.a(hVar);
        }
        alarmError(i, mtopResponse);
        if (mtopResponse != null) {
            TLog.logd(TAG, "error requestType = " + i + " errorMsg is " + mtopResponse.getRetMsg());
        }
    }

    public static String resultJson(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12c420e0", new Object[]{str, str2});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public static String resultJson(String key, String value)", "20180112");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, str2);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness", "public void onSuccess(int requestType, MtopResponse response, BaseOutDo pojo, Object requestContext)", "20180112");
        h hVar = new h(this);
        hVar.f10552a = true;
        if (i == 2) {
            hVar.d = "收藏成功";
            HashMap hashMap = new HashMap();
            hVar.c = hashMap;
            hashMap.put("addResult", Boolean.TRUE);
            ((g) obj).a(hVar);
            AppMonitor.Alarm.commitSuccess("Favorite", "MtopApiCall", "mtop.taobao.mercury.addCollect");
            TLog.logd(TAG, "addFavoriteItem get from net success");
        } else if (i == 3) {
            hVar.d = "取消收藏成功";
            HashMap hashMap2 = new HashMap();
            hVar.c = hashMap2;
            hashMap2.put("deleteResult", Boolean.TRUE);
            ((g) obj).a(hVar);
            AppMonitor.Alarm.commitSuccess("Favorite", "MtopApiCall", "mtop.taobao.mercury.delCollects");
            TLog.logd(TAG, "deleteFavoriteItem  get from net success");
        } else {
            MtopTaobaoMercuryCheckCollectResponseData mtopTaobaoMercuryCheckCollectResponseData = null;
            if (i == 1) {
                TLog.logd(TAG, "isFavoriteItem direct request success");
                if (mtopResponse != null && mtopResponse.getDataJsonObject() != null) {
                    g gVar = (g) obj;
                    try {
                        mtopTaobaoMercuryCheckCollectResponseData = (MtopTaobaoMercuryCheckCollectResponseData) JSON.parseObject(mtopResponse.getDataJsonObject().toString(), MtopTaobaoMercuryCheckCollectResponseData.class);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (mtopTaobaoMercuryCheckCollectResponseData != null) {
                        HashMap<String, String> favCheckResult = mtopTaobaoMercuryCheckCollectResponseData.getFavCheckResult();
                        if (favCheckResult == null || favCheckResult.size() != 1) {
                            hVar.d = "未收藏";
                            HashMap hashMap3 = new HashMap();
                            hVar.c = hashMap3;
                            hashMap3.put("isFavorite", Boolean.FALSE);
                        } else if (favCheckResult.containsValue("true")) {
                            hVar.d = "已收藏";
                            HashMap hashMap4 = new HashMap();
                            hVar.c = hashMap4;
                            hashMap4.put("isFavorite", Boolean.TRUE);
                        } else {
                            hVar.d = "未收藏";
                            HashMap hashMap5 = new HashMap();
                            hVar.c = hashMap5;
                            hashMap5.put("isFavorite", Boolean.FALSE);
                        }
                        gVar.a(hVar);
                        AppMonitor.Alarm.commitSuccess("Favorite", "MtopApiCall", "mtop.taobao.mercury.checkCollect");
                        TLog.logd(TAG, "isFavoriteItem success  get from net result:" + hVar.c);
                    }
                }
            } else if (i == 4) {
                TLog.logd(TAG, "isFavoriteItem hit rate request success");
                if (mtopResponse != null && mtopResponse.getDataJsonObject() != null) {
                    try {
                        mtopTaobaoMercuryCheckCollectResponseData = (MtopTaobaoMercuryCheckCollectResponseData) JSON.parseObject(mtopResponse.getDataJsonObject().toString(), MtopTaobaoMercuryCheckCollectResponseData.class);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    if (mtopTaobaoMercuryCheckCollectResponseData != null) {
                        HashMap<String, String> favCheckResult2 = mtopTaobaoMercuryCheckCollectResponseData.getFavCheckResult();
                        if (favCheckResult2 == null || favCheckResult2.size() != 1) {
                            str = resultJson("isFavorite", false);
                        } else if (favCheckResult2.containsValue("true")) {
                            str = resultJson("isFavorite", true);
                        } else {
                            str = resultJson("isFavorite", false);
                        }
                        h hVar2 = (h) obj;
                        if (hVar2 == null || !str.equals(hVar2.c)) {
                            str2 = "no";
                        } else {
                            str2 = Constants.VAL_YES;
                        }
                        AppMonitor.Counter.commit("Favorite", "FavoriteStateCacheCorrect", str2, 1.0d);
                        AppMonitor.Alarm.commitSuccess("Favorite", "MtopApiCall", "mtop.taobao.mercury.checkCollect");
                        TLog.logd(TAG, "isFavoriteItem hit rate success result:".concat(str2));
                    }
                }
            }
        }
    }
}
