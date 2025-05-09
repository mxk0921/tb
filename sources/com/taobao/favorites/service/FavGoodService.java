package com.taobao.favorites.service;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.favorites.favoritesdk.base.ModelSdkBusiness;
import com.taobao.favorites.favoritesdk.base.ResultListener;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryQueryShareListResponse;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryQueryShareListResponseData;
import com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.favorite.aidl.IGoodInterface;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import org.json.JSONObject;
import tb.is6;
import tb.oud;
import tb.pud;
import tb.rrh;
import tb.rud;
import tb.t2o;
import tb.u39;
import tb.uzo;
import tb.vf3;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FavGoodService extends Service implements ResultListener, pud {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FAV_ORANGE_CATEGORY_SWITCH = "CategoryOpen";
    private static final String FAV_ORANGE_GROUP_NAME = "favorites";
    private static final int REQUEST_ADD_FAV_ITEM = 1;
    private static final int REQUEST_CHECK_FAV_ITEM = 2;
    private static final int REQUEST_DELETE_FAV_ITEM = 3;
    private static final String TAG = "FavGoodService";
    private static volatile rud itbFavGoodsService;
    private boolean isRunning;
    private IGoodInterface.Stub mBinder = new IGoodInterface.Stub() { // from class: com.taobao.favorites.service.FavGoodService.2

        /* compiled from: Taobao */
        /* renamed from: com.taobao.favorites.service.FavGoodService$2$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10553a;
            public final /* synthetic */ String b;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.favorites.service.FavGoodService$2$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class C0556a implements oud {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C0556a() {
                }

                @Override // tb.oud
                public void a(String str, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("59f658c7", new Object[]{this, str, str2});
                        return;
                    }
                    TLog.logd(FavGoodService.TAG, "isFavoriteItem service onFavError ");
                    HashMap hashMap = new HashMap();
                    hashMap.put("isFavorite", Boolean.FALSE);
                    rrh.e().i(a.this.b, str, str2, hashMap);
                }

                @Override // tb.oud
                public void b(String str, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("72e2cbd8", new Object[]{this, str, str2});
                        return;
                    }
                    TLog.logd(FavGoodService.TAG, "isFavoriteItem service onFavSystemError ");
                    HashMap hashMap = new HashMap();
                    hashMap.put("isFavorite", Boolean.FALSE);
                    rrh.e().i(a.this.b, str, str2, hashMap);
                }

                @Override // tb.oud
                public void c(boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("ddda67e6", new Object[]{this, new Boolean(z)});
                    } else if (z) {
                        TLog.logd(FavGoodService.TAG, "isFavoriteItem service onFavSuccess isFavorite true");
                        HashMap hashMap = new HashMap();
                        hashMap.put("isFavorite", Boolean.TRUE);
                        rrh.e().l(a.this.b, hashMap);
                    } else {
                        TLog.logd(FavGoodService.TAG, "isFavoriteItem service onFavSuccess isFavorite false");
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("isFavorite", Boolean.FALSE);
                        rrh.e().l(a.this.b, hashMap2);
                    }
                }
            }

            public a(AnonymousClass2 r1, String str, String str2) {
                this.f10553a = str;
                this.b = str2;
            }

            @Override // com.taobao.favorites.service.FavGoodService.d
            public void a(rud rudVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1a659c8a", new Object[]{this, rudVar});
                } else if (rudVar != null) {
                    rudVar.isFavoriteItem(this.f10553a, new C0556a());
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.favorites.service.FavGoodService$2$b */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements FavGoodsOutBusiness.g {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10555a;

            public b(String str) {
                this.f10555a = str;
            }

            @Override // com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness.g
            public void a(FavGoodsOutBusiness.h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("102791dc", new Object[]{this, hVar});
                } else if (hVar != null && FavGoodService.access$000(FavGoodService.this)) {
                    TLog.logd(FavGoodService.TAG, "isFavoriteItem responsed result" + hVar.b);
                    if (hVar.f10552a) {
                        rrh.e().l(this.f10555a, hVar.c);
                    } else {
                        rrh.e().i(this.f10555a, hVar.b, hVar.d, hVar.c);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.favorites.service.FavGoodService$2$c */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class c implements d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10556a;
            public final /* synthetic */ String b;

            public c(String str, String str2) {
                this.f10556a = str;
                this.b = str2;
            }

            @Override // com.taobao.favorites.service.FavGoodService.d
            public void a(rud rudVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1a659c8a", new Object[]{this, rudVar});
                } else if (rudVar != null) {
                    rudVar.deleteFavoriteItem(this.f10556a, 3, this.b, FavGoodService.this);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.favorites.service.FavGoodService$2$d */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class d implements FavGoodsOutBusiness.g {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10557a;
            public final /* synthetic */ String b;

            public d(String str, String str2) {
                this.f10557a = str;
                this.b = str2;
            }

            @Override // com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness.g
            public void a(FavGoodsOutBusiness.h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("102791dc", new Object[]{this, hVar});
                } else if (hVar != null && FavGoodService.access$000(FavGoodService.this)) {
                    TLog.logd(FavGoodService.TAG, "deleteFavoriteItem responsed result" + hVar.b);
                    if (hVar.f10552a) {
                        rrh.e().l(this.f10557a, hVar.c);
                    } else {
                        rrh.e().i(this.f10557a, hVar.b, hVar.d, hVar.c);
                    }
                    if (hVar.f10552a) {
                        FavGoodService.this.sendBroadcast(FavGoodService.this.getRefreshIntent());
                        FavGoodsOutBusiness.deleteCacheFavItems(this.b);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.favorites.service.FavGoodService$2$e */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class e implements d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10558a;
            public final /* synthetic */ Map b;
            public final /* synthetic */ String c;

            public e(String str, Map map, String str2) {
                this.f10558a = str;
                this.b = map;
                this.c = str2;
            }

            @Override // com.taobao.favorites.service.FavGoodService.d
            public void a(rud rudVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1a659c8a", new Object[]{this, rudVar});
                } else if (rudVar != null) {
                    rudVar.addFavoriteItemV2(this.f10558a, 1, this.b, this.c, FavGoodService.this);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.favorites.service.FavGoodService$2$f */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class f implements FavGoodsOutBusiness.g {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10559a;
            public final /* synthetic */ String b;

            public f(String str, String str2) {
                this.f10559a = str;
                this.b = str2;
            }

            @Override // com.taobao.favorites.favoritesdk.goods.special.FavGoodsOutBusiness.g
            public void a(FavGoodsOutBusiness.h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("102791dc", new Object[]{this, hVar});
                } else if (hVar != null && FavGoodService.access$000(FavGoodService.this)) {
                    TLog.logd(FavGoodService.TAG, "addFavoriteItem responsed result" + hVar.b);
                    if (hVar.f10552a) {
                        rrh.e().l(this.f10559a, hVar.c);
                    } else {
                        rrh.e().i(this.f10559a, hVar.b, hVar.d, hVar.c);
                    }
                    if (hVar.f10552a) {
                        FavGoodService.this.sendBroadcast(FavGoodService.this.getRefreshIntent());
                        FavGoodsOutBusiness.cacheFavItem(this.b);
                    }
                }
            }
        }

        private void coreAddFavoriteItem(String str, String str2, Map<String, Object> map) {
            TLog.logd(FavGoodService.TAG, "addFavoriteItem service called");
            if (u39.b()) {
                FavGoodService.this.getGoodService(new e(str2, map, str));
            } else {
                FavGoodService.access$100(FavGoodService.this).coreAddFavoriteItem(str2, map, new f(str, str2));
            }
        }

        @Override // com.taobao.tao.favorite.aidl.IGoodInterface
        public void addFavoriteItem(String str, String str2) throws RemoteException {
            coreAddFavoriteItem(str, str2, null);
        }

        public void addFavoriteItemV2(String str, String str2, Map<String, Object> map) throws RemoteException {
            coreAddFavoriteItem(str, str2, map);
        }

        @Override // com.taobao.tao.favorite.aidl.IGoodInterface
        public void deleteFavoriteItem(String str, String str2) throws RemoteException {
            TLog.logd(FavGoodService.TAG, "deleteFavoriteItem service called");
            if (u39.b()) {
                FavGoodService.this.getGoodService(new c(str2, str));
            } else {
                FavGoodService.access$100(FavGoodService.this).deleteFavoriteItem(str2, new d(str, str2));
            }
        }

        @Override // com.taobao.tao.favorite.aidl.IGoodInterface
        public void isFavoriteItem(String str, String str2) throws RemoteException {
            TLog.logd(FavGoodService.TAG, "isFavoriteItem service called");
            String config = OrangeConfig.getInstance().getConfig("favorite_sdk", uzo.FAV_ORANGE_IS_FAV_RIGHT_USER, "1000");
            TLog.logd(FavGoodService.TAG, "test switchValue = " + config);
            if (u39.b()) {
                FavGoodService.this.getGoodService(new a(this, str2, str));
            } else {
                FavGoodService.access$100(FavGoodService.this).isFavoriteItem(str2, new b(str));
            }
        }

        @Override // com.taobao.tao.favorite.aidl.IGoodInterface
        public void showCategoryList(String str, String str2, int i, int i2) throws RemoteException {
            TLog.logd(FavGoodService.TAG, "showCategoryList service called");
            if (Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("favorites", FavGoodService.FAV_ORANGE_CATEGORY_SWITCH, "false"))) {
                FavGoodService.this.showCategoryList(str, str2, i, i2);
            } else {
                rrh.e().i(str, "favorite_offer_error_off3", "", null);
            }
        }
    };
    private ModelSdkBusiness modelSdkBusiness;
    private FavGoodsOutBusiness outBusiness;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(FavGoodService favGoodService) {
        }

        @Override // com.taobao.favorites.service.FavGoodService.d
        public void a(rud rudVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a659c8a", new Object[]{this, rudVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends AsyncTask<Void, Void, rud> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f10560a;

        public b(d dVar) {
            this.f10560a = dVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/service/FavGoodService$3");
        }

        /* renamed from: a */
        public rud doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rud) ipChange.ipc$dispatch("4909f991", new Object[]{this, voidArr});
            }
            return FavGoodService.this.getItbFavGoodsService();
        }

        /* renamed from: b */
        public void onPostExecute(rud rudVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f40c1d6d", new Object[]{this, rudVar});
                return;
            }
            super.onPostExecute(rudVar);
            this.f10560a.a(rudVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public String f10561a;
        public String b;
        public int c;
        public int d;

        static {
            t2o.a(707788891);
        }

        public c(FavGoodService favGoodService) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface d {
        void a(rud rudVar);
    }

    static {
        t2o.a(707788880);
        t2o.a(707788836);
    }

    public static /* synthetic */ boolean access$000(FavGoodService favGoodService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("543b482c", new Object[]{favGoodService})).booleanValue();
        }
        return favGoodService.isRunning;
    }

    public static /* synthetic */ FavGoodsOutBusiness access$100(FavGoodService favGoodService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FavGoodsOutBusiness) ipChange.ipc$dispatch("21d95816", new Object[]{favGoodService});
        }
        return favGoodService.outBusiness;
    }

    public static /* synthetic */ Object ipc$super(FavGoodService favGoodService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/favorites/service/FavGoodService");
        }
    }

    public static String resultJson(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea6c6642", new Object[]{str, new Boolean(z)});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public static String resultJson(String key, boolean value)", "20180112");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, z);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public rud getItbFavGoodsService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rud) ipChange.ipc$dispatch("f3bd967a", new Object[]{this});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public ITBFavGoodsService getItbFavGoodsService()", "20180112");
        if (itbFavGoodsService == null) {
            synchronized (FavGoodService.class) {
                try {
                    if (itbFavGoodsService == null) {
                        itbFavGoodsService = (rud) AliAdaptServiceManager.getInstance().findAliAdaptService(rud.class);
                        if (itbFavGoodsService != null) {
                            itbFavGoodsService.setBizCode("detail");
                            TLog.logd(TAG, " now GoodsService has value");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return itbFavGoodsService;
    }

    public Intent getRefreshIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4516726b", new Object[]{this});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public Intent getRefreshIntent()", "20180112");
        Intent intent = new Intent();
        intent.setAction("com.taobao.favorite.GoodsRefresh");
        String packageName = Globals.getApplication().getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            intent.setPackage(packageName);
        }
        return intent;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public IBinder onBind(Intent intent)", "20180112");
        return this.mBinder;
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public void onError(int requestType, MtopResponse response, Object requestContext)", "20180112");
        if (mtopResponse != null && this.isRunning) {
            rrh.e().i(((c) obj).f10561a, mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null);
            String retCode = mtopResponse.getRetCode();
            String retMsg = mtopResponse.getRetMsg();
            TLog.logd(TAG, "showCategoryList responsed result " + mtopResponse.getRetMsg());
            AppMonitor.Alarm.commitFail("Favorite", "MtopApiCall", "com.taobao.mercury.queryShareList", retCode, retMsg);
        }
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public void onSystemError(int requestType, MtopResponse response, Object requestContext)", "20180112");
        if (mtopResponse != null && this.isRunning) {
            rrh.e().i(((c) obj).f10561a, mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null);
            String retCode = mtopResponse.getRetCode();
            String retMsg = mtopResponse.getRetMsg();
            TLog.logd(TAG, "showCategoryList responsed result " + mtopResponse.getRetMsg());
            AppMonitor.Alarm.commitFail("Favorite", "MtopApiCall", "com.taobao.mercury.queryShareList", retCode, retMsg);
        }
    }

    public void getGoodService(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c57640", new Object[]{this, dVar});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public void getGoodService(final ServiceCallback serviceCallback)", "20180112");
        new b(dVar).execute(new Void[0]);
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public void onCreate()", "20180112");
        super.onCreate();
        this.outBusiness = new FavGoodsOutBusiness();
        this.isRunning = true;
        getGoodService(new a(this));
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public void onDestroy()", "20180112");
        super.onDestroy();
        this.isRunning = false;
        FavGoodsOutBusiness.cacheStaticFavItemList();
        ModelSdkBusiness modelSdkBusiness = this.modelSdkBusiness;
        if (modelSdkBusiness != null && !modelSdkBusiness.c()) {
            TLog.logd(TAG, "showCategoryList not null and canceld because service destory");
            this.modelSdkBusiness.a();
            this.modelSdkBusiness = null;
        }
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        ArrayList<ComTaobaoMercuryQueryShareListResponseData.ShareListItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public void onSuccess(int requestType, MtopResponse response, BaseOutDo pojo, Object requestContext)", "20180112");
        if (!(mtopResponse == null || baseOutDo == null || baseOutDo.getData() == null || !this.isRunning)) {
            c cVar = (c) obj;
            StringBuilder sb = new StringBuilder("http://h5.m.taobao.com/fav_category_popup.htm");
            sb.append("?select_item_id=");
            sb.append(cVar.b);
            sb.append("&xoffset=");
            sb.append(cVar.c);
            sb.append("&yoffset=");
            sb.append(cVar.d);
            ComTaobaoMercuryQueryShareListResponseData comTaobaoMercuryQueryShareListResponseData = (ComTaobaoMercuryQueryShareListResponseData) baseOutDo.getData();
            if (!(comTaobaoMercuryQueryShareListResponseData == null || (arrayList = comTaobaoMercuryQueryShareListResponseData.resultList) == null || arrayList.size() <= 0)) {
                Iterator<ComTaobaoMercuryQueryShareListResponseData.ShareListItem> it = comTaobaoMercuryQueryShareListResponseData.resultList.iterator();
                while (it.hasNext()) {
                    ComTaobaoMercuryQueryShareListResponseData.ShareListItem next = it.next();
                    next.coverImgUrl = "";
                    next.headPic = "";
                    next.desc = "";
                    next.userId = "";
                    next.alreadyLike = "";
                    next.cursor = "";
                }
                if (comTaobaoMercuryQueryShareListResponseData.resultList.size() == 10 && comTaobaoMercuryQueryShareListResponseData.hasMore) {
                    comTaobaoMercuryQueryShareListResponseData.resultList.add(new ComTaobaoMercuryQueryShareListResponseData.ShareListItem());
                }
            }
            String encode = Uri.encode(JSON.toJSONString(comTaobaoMercuryQueryShareListResponseData));
            sb.append("&request_response=");
            sb.append(encode);
            String substring = sb.substring(0);
            String str = cVar.f10561a;
            HashMap hashMap = new HashMap();
            hashMap.put(yj4.PARAM_ACTIVITY_URL, substring);
            rrh.e().l(str, hashMap);
            TLog.logd(TAG, substring);
        }
        TLog.logd(TAG, "showCategoryList responsed result success");
        AppMonitor.Alarm.commitSuccess("Favorite", "MtopApiCall", "com.taobao.mercury.queryShareList");
    }

    @Override // tb.pud
    public void onFavError(int i, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public void onFavError(int requestType, String errorCode, String errorMsg, Object requestContext)", "20180112");
        TLog.logd(TAG, "FAVSDK called onFavError");
        if (this.isRunning) {
            String str3 = (String) obj;
            if (i == 1) {
                if ("ALREADY_COLLECT".equals(str)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("addResult", Boolean.TRUE);
                    rrh.e().l(str3, hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("addResult", Boolean.FALSE);
                rrh.e().i(str3, str, str2, hashMap2);
            } else if (i != 3) {
            } else {
                if ("IS_NOT_EXIT".equals(str)) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("deleteResult", Boolean.TRUE);
                    rrh.e().l(str3, hashMap3);
                    return;
                }
                HashMap hashMap4 = new HashMap();
                hashMap4.put("deleteResult", Boolean.FALSE);
                rrh.e().i(str3, str, str2, hashMap4);
            }
        }
    }

    @Override // tb.pud
    public void onFavSuccess(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ede1cb1", new Object[]{this, new Integer(i), obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public void onFavSuccess(int requestType, Object requestContext)", "20180112");
        TLog.logd(TAG, "FAVSDK called onFavSuccess");
        if (this.isRunning) {
            sendBroadcast(getRefreshIntent());
            String str = (String) obj;
            if (i == 1) {
                HashMap hashMap = new HashMap();
                hashMap.put("addResult", Boolean.TRUE);
                rrh.e().l(str, hashMap);
            } else if (i == 3) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("deleteResult", Boolean.TRUE);
                rrh.e().l(str, hashMap2);
            }
        }
    }

    @Override // tb.pud
    public void onFavSystemError(int i, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public void onFavSystemError(int requestType, String errorCode, String errorMsg, Object requestContext)", "20180112");
        TLog.logd(TAG, "FAVSDK called onFavSystemError");
        if (this.isRunning) {
            String str3 = (String) obj;
            if (i == 1) {
                HashMap hashMap = new HashMap();
                hashMap.put("addResult", Boolean.FALSE);
                rrh.e().i(str3, str, str2, hashMap);
            } else if (i == 3) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("deleteResult", Boolean.FALSE);
                rrh.e().i(str3, str, str2, hashMap2);
            }
        }
    }

    public void showCategoryList(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d756d4", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public void showCategoryList(String requestType, String itemId, int x, int y)", "20180112");
        c cVar = new c(this);
        cVar.f10561a = str;
        cVar.b = str2;
        cVar.c = i;
        cVar.d = i2;
        is6 b2 = vf3.b("mclaren", 10, 1, 2, "0");
        ModelSdkBusiness modelSdkBusiness = this.modelSdkBusiness;
        if (modelSdkBusiness != null && !modelSdkBusiness.c()) {
            TLog.logd(TAG, "showCategoryList not null and canceld");
            this.modelSdkBusiness.a();
            this.modelSdkBusiness = null;
        }
        this.modelSdkBusiness = ModelSdkBusiness.b(b2).j().e(true).d(cVar).h(ComTaobaoMercuryQueryShareListResponse.class, this);
    }

    public static String resultJson(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12c420e0", new Object[]{str, str2});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.service.FavGoodService", "public static String resultJson(String key, String value)", "20180112");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, str2);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
