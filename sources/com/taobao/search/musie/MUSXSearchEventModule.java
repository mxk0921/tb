package com.taobao.search.musie;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorEvent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.collection.ArrayMap;
import androidx.core.app.ActivityOptionsCompat;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.ali.adapt.api.AliServiceFindedCallback;
import com.alibaba.android.aura.taobao.adapter.pageevent.AURAPageEventStrategy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.task.Coordinator;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.message.biz.contacts.MessageBoxService;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.search.mmd.datasource.bean.SearchApiModel;
import com.taobao.search.musie.img.MUSImageView;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.Globals;
import com.taobao.tao.util.TaoHelper;
import com.taobao.weex.utils.tools.TimeCalculator;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.a4p;
import tb.amo;
import tb.asi;
import tb.b4p;
import tb.b64;
import tb.bwf;
import tb.c2v;
import tb.c4p;
import tb.cnx;
import tb.cvr;
import tb.dwh;
import tb.f1p;
import tb.f64;
import tb.fo6;
import tb.frh;
import tb.fxh;
import tb.g1a;
import tb.g6p;
import tb.gtf;
import tb.h19;
import tb.htf;
import tb.j3p;
import tb.jrh;
import tb.k1p;
import tb.k49;
import tb.khq;
import tb.l8j;
import tb.m5p;
import tb.n78;
import tb.n93;
import tb.o4p;
import tb.oen;
import tb.okd;
import tb.oud;
import tb.phw;
import tb.pud;
import tb.pvh;
import tb.qbp;
import tb.qnh;
import tb.qrl;
import tb.r4p;
import tb.r5j;
import tb.rud;
import tb.sen;
import tb.t1c;
import tb.t2o;
import tb.vjx;
import tb.vqx;
import tb.x3p;
import tb.xhv;
import tb.yak;
import tb.yko;
import tb.yzo;
import tb.zio;
import tb.zvr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MUSXSearchEventModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CARRIED_DATA = "carriedData";
    public static final String KEY_OPEN_URL_EXTRAS = "xsearch:extras";
    public static final String MODULE_NAME = "xsearchEvent";
    private static final String TAG = "XSearchEvent";
    private volatile String mCachedPvFeature;
    private m5p sensorEventListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ JSONObject d;

        public a(JSONObject jSONObject, JSONObject jSONObject2) {
            this.c = jSONObject;
            this.d = jSONObject2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSXSearchEventModule$10");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                new qnh(this.c, this.d).d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements fo6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.fo6
        public void errorReport(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
            }
        }

        @Override // tb.fo6
        public void notify(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("contentList", (Object) str2);
            MUSXSearchEventModule.this.getInstance().sendInstanceMessage("jarvis_reorderList", jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends CommonBaseDatasource {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(MUSXSearchEventModule mUSXSearchEventModule, yko ykoVar) {
            super(ykoVar);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSXSearchEventModule$2");
        }

        @Override // com.taobao.search.sf.datasource.CommonBaseDatasource
        public boolean D() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4f76fb66", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements a4p.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f11566a;
        public final /* synthetic */ pvh b;

        public d(MUSXSearchEventModule mUSXSearchEventModule, pvh pvhVar, pvh pvhVar2) {
            this.f11566a = pvhVar;
            this.b = pvhVar2;
        }

        @Override // tb.a4p.d
        public void a(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fe548f3", new Object[]{this, tBLocationDTO});
            } else if (tBLocationDTO == null || !tBLocationDTO.isNavSuccess() || TextUtils.isEmpty(tBLocationDTO.getCityName())) {
                this.f11566a.b(new Object[0]);
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(r4p.KEY_CITY_CODE, (Object) tBLocationDTO.cityCode);
                jSONObject.put(r4p.KEY_CITY_NAME, (Object) tBLocationDTO.cityName);
                jSONObject.put(r4p.KEY_AREA_LBS_CODE, (Object) tBLocationDTO.areaCode);
                this.b.b(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements a4p.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f11567a;
        public final /* synthetic */ pvh b;

        public e(MUSXSearchEventModule mUSXSearchEventModule, pvh pvhVar, pvh pvhVar2) {
            this.f11567a = pvhVar;
            this.b = pvhVar2;
        }

        @Override // tb.a4p.d
        public void a(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fe548f3", new Object[]{this, tBLocationDTO});
            } else if (tBLocationDTO == null || !tBLocationDTO.isNavSuccess() || TextUtils.isEmpty(tBLocationDTO.getCityName())) {
                this.f11567a.b(new Object[0]);
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(r4p.KEY_CITY_CODE, (Object) tBLocationDTO.cityCode);
                jSONObject.put(r4p.KEY_CITY_NAME, (Object) tBLocationDTO.cityName);
                jSONObject.put(r4p.KEY_AREA_LBS_CODE, (Object) tBLocationDTO.areaCode);
                this.b.b(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11568a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public f(String str, String str2, Map map) {
            this.f11568a = str;
            this.b = str2;
            this.c = map;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSXSearchEventModule$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                x3p.a(this.f11568a, this.b, this.c, (Activity) MUSXSearchEventModule.this.getInstance().getUIContext(), "srp");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else {
                MUSXSearchEventModule.access$100(MUSXSearchEventModule.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements AliServiceFindedCallback<rud> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f11571a;
        public final /* synthetic */ JSONObject b;

        public i(MUSXSearchEventModule mUSXSearchEventModule, pvh pvhVar, JSONObject jSONObject) {
            this.f11571a = pvhVar;
            this.b = jSONObject;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements oud {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.oud
            public void a(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("59f658c7", new Object[]{this, str, str2});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) str);
                jSONObject.put("errorMsg", (Object) str2);
                i.this.f11571a.b(jSONObject);
            }

            @Override // tb.oud
            public void b(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("72e2cbd8", new Object[]{this, str, str2});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) str);
                jSONObject.put("errorMsg", (Object) str2);
                i.this.f11571a.b(jSONObject);
            }

            @Override // tb.oud
            public void c(boolean z) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ddda67e6", new Object[]{this, new Boolean(z)});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    str = "add";
                } else {
                    str = "unadd";
                }
                jSONObject.put("status", (Object) str);
                i.this.f11571a.b(jSONObject);
            }
        }

        /* renamed from: a */
        public void onServiceFinded(rud rudVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3980e35", new Object[]{this, rudVar});
            } else if (rudVar == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorMsg", (Object) "未找到服务");
                this.f11571a.b(jSONObject);
            } else {
                rudVar.setBizCode("search_app");
                rudVar.isFavoriteItem(this.b.getString("itemId"), new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements AliServiceFindedCallback<rud> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f11573a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public j(MUSXSearchEventModule mUSXSearchEventModule, pvh pvhVar, String str, String str2) {
            this.f11573a = pvhVar;
            this.b = str;
            this.c = str2;
        }

        /* renamed from: a */
        public void onServiceFinded(rud rudVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3980e35", new Object[]{this, rudVar});
            } else if (rudVar == null) {
                b4p.a(MUSXSearchEventModule.TAG, "favorite service is null");
            } else {
                rudVar.setBizCode("search_app");
                a aVar = new a();
                if ("add".equals(this.b)) {
                    rudVar.addFavoriteItem(this.c, aVar);
                } else {
                    rudVar.deleteFavoriteItem(this.c, aVar);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements pud {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.pud
            public void onFavError(int i, String str, String str2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) str);
                jSONObject.put("errorMsg", (Object) str2);
                jSONObject.put("status", (Object) "failure");
                j.this.f11573a.b(jSONObject);
            }

            @Override // tb.pud
            public void onFavSuccess(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ede1cb1", new Object[]{this, new Integer(i), obj});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", (Object) "success");
                j.this.f11573a.b(jSONObject);
            }

            @Override // tb.pud
            public void onFavSystemError(int i, String str, String str2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) str);
                jSONObject.put("errorMsg", (Object) str2);
                jSONObject.put("status", (Object) "failure");
                j.this.f11573a.b(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements k49 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f11575a;

        static {
            t2o.a(815792652);
            t2o.a(1034944536);
        }

        public k(CountDownLatch countDownLatch) {
            this.f11575a = countDownLatch;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
            } else {
                this.f11575a.countDown();
            }
        }

        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38dd031e", new Object[]{this, str, str2});
                return;
            }
            MUSXSearchEventModule.access$002(MUSXSearchEventModule.this, str2);
            this.f11575a.countDown();
        }
    }

    static {
        t2o.a(815792639);
    }

    public MUSXSearchEventModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ String access$002(MUSXSearchEventModule mUSXSearchEventModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45664ae3", new Object[]{mUSXSearchEventModule, str});
        }
        mUSXSearchEventModule.mCachedPvFeature = str;
        return str;
    }

    public static /* synthetic */ void access$100(MUSXSearchEventModule mUSXSearchEventModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79b1e34", new Object[]{mUSXSearchEventModule});
        } else {
            mUSXSearchEventModule.unregisterGSensorListener();
        }
    }

    private void doAction(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        cnx actionPerformer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6334fe", new Object[]{this, str, jSONObject, aVar, aVar2});
        } else if (!getInstance().isDestroyed() && (actionPerformer = getActionPerformer()) != null) {
            actionPerformer.K(str, jSONObject, aVar, aVar2);
        }
    }

    private void doBizAction(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        cnx actionPerformer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae77e61", new Object[]{this, str, jSONObject, aVar, aVar2});
        } else if (!getInstance().isDestroyed() && (actionPerformer = getActionPerformer()) != null) {
            actionPerformer.m2(str, jSONObject, aVar, aVar2);
        }
    }

    private cnx getActionPerformer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cnx) ipChange.ipc$dispatch("27af6153", new Object[]{this});
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (!(tag instanceof cnx)) {
            return null;
        }
        return (cnx) tag;
    }

    private b64 getModelFromPerformer(cnx cnxVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b64) ipChange.ipc$dispatch("941dd6fa", new Object[]{this, cnxVar});
        }
        if (cnxVar instanceof khq) {
            obj = ((khq) cnxVar).getModel();
        } else if (cnxVar instanceof BaseMuiseCellViewHolder) {
            obj = ((BaseMuiseCellViewHolder) cnxVar).l0();
        } else {
            obj = null;
        }
        if (obj instanceof b64) {
            return (b64) obj;
        }
        return null;
    }

    private int getUnreadMessageCnt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6815961", new Object[]{this})).intValue();
        }
        MessageBoxService messageBoxService = (MessageBoxService) GlobalContainer.getInstance().get(MessageBoxService.class);
        if (messageBoxService == null || messageBoxService.getUnreadInfo() == null) {
            return 0;
        }
        return messageBoxService.getUnreadInfo().getTipNumber();
    }

    public static /* synthetic */ Object ipc$super(MUSXSearchEventModule mUSXSearchEventModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSXSearchEventModule");
    }

    private void unregisterGSensorListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e0b300", new Object[]{this});
        } else if (this.sensorEventListener != null) {
            qbp.c(getInstance().getUIContext().getApplicationContext(), this.sensorEventListener);
            this.sensorEventListener = null;
        }
    }

    @MUSMethod
    public void addParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54883a22", new Object[]{this, jSONObject});
        } else {
            doAction("addParams", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void clearAllParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd07aa41", new Object[]{this});
        } else {
            doAction("clearAllParams", null, null, null);
        }
    }

    @MUSMethod
    public void clearParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a8f6", new Object[]{this, jSONObject});
        } else {
            doAction("clearParams", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void clickInShopAuction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d021bbe9", new Object[]{this, jSONObject});
        } else {
            doBizAction("clickInShopAuction", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void closeFilterPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c541d2db", new Object[]{this});
        } else {
            doAction("closeFilterPanel", null, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void closeLeftBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7ecffb", new Object[]{this});
            return;
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer != null) {
            actionPerformer.m2("closeLeftBar", null, null, null);
        }
    }

    @MUSMethod
    public void closePreFilterPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694dbee8", new Object[]{this});
        } else {
            doAction(BaseMuiseCellViewHolder.ACTION_CLOSE_PRE_FILTER, null, null, null);
        }
    }

    @MUSMethod
    public void closeSimilarSame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2900ebe0", new Object[]{this});
            return;
        }
        Context uIContext = getInstance().getUIContext();
        if (uIContext instanceof Activity) {
            ((Activity) uIContext).onKeyDown(4, null);
        }
    }

    @MUSMethod
    public void commitAppmonitorAvailableJSError(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904dd6e3", new Object[]{this, jSONObject});
        } else {
            zvr.u(yak.f31939a).e().b(jSONObject.getString("tItemType"), jSONObject.getString(amo.DIMENSION_JSVERSION), c2v.getInstance().getCurrentPageName(), 2.0d, jSONObject.getString("errorMsg"), false);
        }
    }

    @MUSMethod
    public void commitAuctionClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98a50ed", new Object[]{this, jSONObject});
        } else {
            doAction("commitAuctionClick", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void commitJarvisClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135ec81d", new Object[]{this, jSONObject});
        } else {
            doAction("commitJarvisClick", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void doFavorite(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e0224b", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        AliAdaptServiceManager.getInstance().findAliAdaptService(rud.class, new j(this, pvhVar, jSONObject.getString("type"), jSONObject.getString("itemId")));
    }

    @MUSMethod
    public void getFavoriteStatus(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e049ce", new Object[]{this, jSONObject, pvhVar});
        } else {
            AliAdaptServiceManager.getInstance().findAliAdaptService(rud.class, new i(this, pvhVar, jSONObject));
        }
    }

    @MUSMethod(uiThread = false)
    public JSONObject getLocalParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b66d71c2", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        yko g2 = j3p.g();
        if (g2 != null) {
            jSONObject.put("utd_id", (Object) g2.g().getUtdid());
            jSONObject.put("ttid", (Object) g2.g().getTtid());
        } else {
            jSONObject.put("utd_id", (Object) UTDevice.getUtdid(Globals.getApplication()));
            jSONObject.put("ttid", (Object) TaoHelper.getTTID());
        }
        jSONObject.put("sversion", (Object) r4p.SERVER_VERSION_VALUE);
        jSONObject.put("client_os", (Object) TimeCalculator.PLATFORM_ANDROID);
        jSONObject.put("client_os_version", (Object) String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put(r4p.KEY_GOOD_PRICE, (Object) String.valueOf(cvr.INSTANCE.d()));
        String b2 = k1p.b();
        if (!TextUtils.isEmpty(b2)) {
            jSONObject.put(r4p.KEY_COUNTRY_NUM, (Object) b2);
        }
        return jSONObject;
    }

    @MUSMethod(uiThread = false)
    public JSONObject getLocalStorages(JSONArray jSONArray) {
        MuiseCellBean findByLongId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4d3c5c7c", new Object[]{this, jSONArray});
        }
        JSONObject jSONObject = new JSONObject();
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            String string = jSONArray.getString(i2);
            long g2 = qrl.g(string, -1L);
            if (g2 >= 0 && (findByLongId = MuiseCellBean.findByLongId(g2)) != null) {
                jSONObject.put(string, JSON.toJSON(findByLongId.mStorage));
            }
        }
        return jSONObject;
    }

    @MUSMethod
    public void getMessageCount(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c31aee", new Object[]{this, pvhVar});
        } else if (pvhVar == null) {
            dwh.e("callback mustn't be null");
        } else if (!getInstance().isDestroyed()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("count", (Object) Integer.valueOf(getUnreadMessageCnt()));
            pvhVar.b(jSONObject);
        }
    }

    @MUSMethod
    public void getNavigationInfo(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec460c88", new Object[]{this, pvhVar});
            return;
        }
        JSONObject navigationInfo = getNavigationInfo(getInstance().getUIContext());
        if (navigationInfo != null) {
            pvhVar.b(navigationInfo);
        }
    }

    @MUSMethod(uiThread = false)
    public JSONObject getPageParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("147a1312", new Object[]{this});
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer instanceof NSMuiseViewHolder) {
            return ((NSMuiseViewHolder) actionPerformer).Z2();
        }
        return null;
    }

    @MUSMethod(uiThread = false)
    public JSONObject getParams() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        cnx actionPerformer = getActionPerformer();
        JSONObject jSONObject = new JSONObject();
        if (actionPerformer instanceof SearchMuiseViewHolder) {
            map = ((SearchMuiseViewHolder) actionPerformer).s2();
            f1p.c(map);
        } else if (actionPerformer instanceof phw) {
            map = ((b64) ((phw) actionPerformer).getModel()).e().getLatestParamsSnapshot();
            f1p.c(map);
        } else if (!o4p.h1()) {
            return null;
        } else {
            map = new c(this, XslModule.d()).getLatestParamsSnapshot();
        }
        if (map != null) {
            jSONObject.putAll(map);
        }
        return jSONObject;
    }

    @MUSMethod(uiThread = false)
    public JSONObject getResultData() {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("48213684", new Object[]{this});
        }
        cnx actionPerformer = getActionPerformer();
        if (!(actionPerformer instanceof khq)) {
            return null;
        }
        Object model = ((khq) actionPerformer).getModel();
        if (!(model instanceof b64) || (commonSearchResult = (CommonSearchResult) ((b64) model).e().getTotalSearchResult()) == null) {
            return null;
        }
        return commonSearchResult.originData;
    }

    @MUSMethod(uiThread = false)
    public JSONObject getTabApi(String str) {
        asi asiVar;
        r5j.a g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a6608ac", new Object[]{this, str});
        }
        cnx actionPerformer = getActionPerformer();
        if (!(actionPerformer instanceof NSMuiseViewHolder) || (asiVar = ((NSMuiseViewHolder) actionPerformer).getData().combo) == null || (g2 = asiVar.g()) == null) {
            SearchApiModel d2 = yzo.INSTANCE.d(str);
            if (d2 == null) {
                return new JSONObject();
            }
            return (JSONObject) JSON.toJSON(d2);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) g2.f27124a);
        jSONObject.put("version", (Object) g2.b);
        jSONObject.put("params", (Object) asiVar.h());
        return jSONObject;
    }

    @MUSMethod(uiThread = false)
    public JSONObject getVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45e5111", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null && !jSONObject.isEmpty()) {
            JSONArray c2 = h19.c(jSONObject, "keys");
            for (int i2 = 0; i2 < c2.size(); i2++) {
                String string = c2.getString(i2);
                jSONObject2.put(string, (Object) vjx.b(getInstance().getUIContext(), string));
            }
        }
        return jSONObject2;
    }

    @MUSMethod
    public void getXRainbowBucketName(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e039c003", new Object[]{this, str, pvhVar});
        } else {
            pvhVar.b(oen.r(str));
        }
    }

    @MUSMethod(uiThread = false)
    public String getXRainbowBucketNameSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35b5e12b", new Object[]{this, str});
        }
        return oen.r(str);
    }

    @MUSMethod
    public void goToSearchDoor(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec17b90", new Object[]{this, jSONObject});
            return;
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer instanceof khq) {
            Object model = ((khq) actionPerformer).getModel();
            if (model instanceof b64) {
                String string = jSONObject.getString("q");
                String string2 = jSONObject.getString("tab");
                Map<String, String> k2 = ((b64) model).e().k();
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null) {
                        k2.put(key, value.toString());
                    }
                }
                if (BaseResultActivity.k4(getInstance().getUIContext())) {
                    ((BaseResultActivity) getInstance().getUIContext()).v3(new f(string, string2, k2));
                } else {
                    x3p.a(string, string2, k2, (Activity) getInstance().getUIContext(), "srp");
                }
            }
        }
    }

    @MUSMethod
    public void goToSrp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b286da9b", new Object[]{this, jSONObject});
        } else {
            doBizAction("goToSrp", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void gotoSrp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2d7e7b", new Object[]{this, jSONObject});
        } else {
            doBizAction("goToSrp", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void gotoSrpWithData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107e54cb", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("url");
            if (!TextUtils.isEmpty(string)) {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                Bundle bundle = new Bundle();
                if (jSONArray != null) {
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    bundle.putString(KEY_CARRIED_DATA, valueOf);
                    n93.c().d(valueOf, jSONArray);
                }
                Nav.from(getInstance().getUIContext()).withExtras(bundle).toUri(string);
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        Context uIContext = getInstance().getUIContext();
        ((InputMethodManager) uIContext.getSystemService("input_method")).hideSoftInputFromWindow(((Activity) uIContext).getWindow().getDecorView().getWindowToken(), 0);
    }

    @MUSMethod
    public void hidePopup(JSONObject jSONObject) {
        cnx actionPerformer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5586f4ff", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (actionPerformer = getActionPerformer()) != null) {
            actionPerformer.K("hidePopup", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void insertCardClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3114690a", new Object[]{this, jSONObject});
        } else {
            doAction("insertCardClick", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = false)
    public boolean isSpecifyVersionCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e53791a3", new Object[]{this, str})).booleanValue();
        }
        t1c t1cVar = (t1c) n78.a(t1c.class);
        if (t1cVar == null) {
            return false;
        }
        return t1cVar.isSpecifyVersionCode(str);
    }

    @MUSMethod(uiThread = true)
    public void jumpToComboItem(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a24dd1", new Object[]{this, jSONObject});
            return;
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer != null) {
            actionPerformer.K("jumpToComboItem", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void jumpToItemTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1163c800", new Object[]{this});
            return;
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer != null) {
            actionPerformer.K("jumpToItemTab", null, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void jumpToTab(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd53f3d", new Object[]{this, jSONObject});
        } else {
            doBizAction("jumpToTab", jSONObject, null, null);
        }
    }

    @MUSMethod
    @Deprecated
    public void jumpToTimeline(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c25adf", new Object[]{this, jSONObject});
        } else {
            doBizAction("jumpToTimeline", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void negativeFeedbackOptionClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1aaf410", new Object[]{this, jSONObject});
        } else {
            doBizAction("negativeFeedbackOptionClick", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void negativeFeedbackPop(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77919892", new Object[]{this, jSONObject});
        } else {
            doBizAction("negativeFeedbackPop", jSONObject, null, null);
        }
    }

    @MUSMethod
    @Deprecated
    public void openTaobaoExperience(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f8f4e7", new Object[]{this, jSONObject});
        } else {
            doBizAction("openTaobaoExperience", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void openUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b63e0", new Object[]{this, str, str2});
        } else {
            openUrl(getInstance().getUIContext(), str, str2);
        }
    }

    @MUSMethod
    public void operateSearchList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c2da7f", new Object[]{this, jSONObject});
        } else {
            doBizAction("operateSearchList", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void prepareCompassRequest(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f998ffc5", new Object[]{this, jSONObject});
        } else {
            doBizAction("prepareCompassRequest", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void refreshAuction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24174d61", new Object[]{this, jSONObject});
        } else {
            doBizAction("refreshAuction", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void refreshCombo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e4d27a", new Object[]{this});
            return;
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer != null) {
            actionPerformer.m2("refreshCombo", null, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void refreshList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3a5cd0", new Object[]{this, jSONObject});
        } else {
            doBizAction("searchOption", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void removeDynamicCard(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f9495e", new Object[]{this, jSONObject});
        } else {
            doBizAction("removeDynamicCard", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void removeParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b886ca5f", new Object[]{this, jSONObject});
        } else {
            doAction("removeParams", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void removeSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f16677", new Object[]{this});
        } else {
            doAction("removeSelf", null, null, null);
        }
    }

    @MUSMethod(uiThread = false)
    public void removeVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b18329f", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            JSONArray c2 = h19.c(jSONObject, "keys");
            for (int i2 = 0; i2 < c2.size(); i2++) {
                vjx.c(getInstance().getUIContext(), c2.getString(i2));
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void reorderList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe1f2b0", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            c4p.n(TAG, "options参数为空");
        } else if (jSONObject.containsKey("pageName") && jSONObject.containsKey("contentList")) {
            String string = jSONObject.getString("pageName");
            JSONArray jSONArray = jSONObject.getJSONArray("contentList");
            if (jSONArray != null && jSONArray.size() != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("args", jSONArray.toString());
                gtf.i().o(string, "reorderList", hashMap, new b());
            }
        }
    }

    @MUSMethod(uiThread = false)
    public void reportTitleInfo(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712ac399", new Object[]{this, jSONObject, jSONObject2});
        } else {
            Coordinator.execute(new a(jSONObject, jSONObject2));
        }
    }

    @MUSMethod
    public void requestLocation(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af421cf7", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            a4p.e(new e(this, pvhVar2, pvhVar), getInstance().getUIContext(), jSONObject.getBooleanValue(vqx.HUMMER_FOUNDATION_POSITIVE));
        }
    }

    @MUSMethod
    public void scrollCellToTop(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc22b0c", new Object[]{this, new Boolean(z), str});
            return;
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("anim", (Object) Boolean.valueOf(z));
            jSONObject.put("offset", (Object) Float.valueOf(fxh.e(str)));
            actionPerformer.K("scrollCellToTop", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void search(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626126a1", new Object[]{this, jSONObject});
        } else {
            doBizAction("search", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void searchOption(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d5792c", new Object[]{this, jSONObject});
        } else {
            doBizAction("searchOption", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void searchOptionWithCallback(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418dc4d3", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            doAction("searchOptionWithCallback", jSONObject, l8j.a(pvhVar), l8j.a(pvhVar2));
        }
    }

    @MUSMethod
    public void setListStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e738142", new Object[]{this, str});
            return;
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("style", (Object) str);
            actionPerformer.K("setListStyle", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void setParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else {
            doAction("setParams", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = true)
    public void showLeftBar(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16dfda", new Object[]{this, jSONObject});
            return;
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer != null) {
            actionPerformer.m2("showLeftBar", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void showPopup(JSONObject jSONObject, JSONObject jSONObject2) {
        cnx actionPerformer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fbb2936", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null && (actionPerformer = getActionPerformer()) != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("options", (Object) jSONObject);
            jSONObject3.put("data", (Object) jSONObject2);
            actionPerformer.K("showPopup", jSONObject3, null, null);
        }
    }

    @MUSMethod
    public void switchToTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84325ea7", new Object[]{this, new Boolean(z)});
            return;
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fullData", (Object) Boolean.valueOf(z));
            actionPerformer.K("switchToTab", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void tagSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86792a7", new Object[]{this, jSONObject});
        } else {
            doBizAction("tagSearch", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void updateLocation(pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f460abb7", new Object[]{this, pvhVar, pvhVar2});
        } else {
            a4p.e(new d(this, pvhVar2, pvhVar), getInstance().getUIContext(), false);
        }
    }

    @MUSMethod
    public void updateShareContent(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867cfe26", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !getInstance().isDestroyed() && (getInstance().getUIContext() instanceof okd)) {
            ((okd) getInstance().getUIContext()).d2(jSONObject);
        }
    }

    @MUSMethod(uiThread = false)
    public void updateVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af89c224", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    vjx.d(getInstance().getUIContext(), key, value.toString());
                }
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void utClickLog(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686053ce", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            c4p.n(TAG, "options为空");
        } else {
            String string = jSONObject.getString("controlName");
            if (TextUtils.isEmpty(string)) {
                c4p.n(TAG, "controlName为空");
                return;
            }
            String string2 = jSONObject.getString("spm");
            ArrayMap<String, String> b2 = bwf.b(jSONObject, "args");
            String string3 = jSONObject.getString("pageName");
            if (TextUtils.isEmpty(string3)) {
                sen.g(string, b2, string2);
            } else {
                sen.i(string3, string, b2, string2);
            }
        }
    }

    public static void openUrl(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315b4b90", new Object[]{context, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(KEY_OPEN_URL_EXTRAS, str2);
        Nav.from(context).withExtras(bundle).toUri(str);
    }

    @MUSMethod
    public void jumpToSimilarAndSame(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6119ab", new Object[]{this, new Integer(i2), str});
            return;
        }
        MUSDKInstance mUSDKInstance = (MUSDKInstance) getInstance();
        UINode uINode = (UINode) mUSDKInstance.findNodeById(i2);
        String b2 = g6p.b(str, "show_header_image", "true");
        if (uINode == null) {
            Nav.from(mUSDKInstance.getUIContext()).toUri(b2);
            return;
        }
        Object mountContent = uINode.getMountContent();
        if (!(mountContent instanceof MUSImageView)) {
            Nav.from(mUSDKInstance.getUIContext()).toUri(b2);
            return;
        }
        MUSImageView mUSImageView = (MUSImageView) mountContent;
        mUSImageView.performHapticFeedback(0);
        mUSImageView.setTransitionName("similar_activity_transition");
        Nav.from(mUSDKInstance.getUIContext()).withOptions(ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) mUSDKInstance.getUIContext(), mUSImageView, "similar_activity_transition").toBundle()).toUri(b2);
    }

    @MUSMethod
    public void loadNextPage(JSONObject jSONObject) {
        frh combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3286921", new Object[]{this, jSONObject});
            return;
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer != null) {
            actionPerformer.K("loadNextPage", jSONObject, null, null);
        }
        b64 modelFromPerformer = getModelFromPerformer(actionPerformer);
        if (modelFromPerformer != null) {
            jrh jrhVar = (jrh) modelFromPerformer.e();
            CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
            if (!(commonSearchResult == null || commonSearchResult.guideSearch || jSONObject == null || jrhVar.L0() == null || (combo = commonSearchResult.getCombo(0)) == null)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("constParams");
                if (jSONObject2 != null) {
                    for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            jrhVar.setParam(key, String.valueOf(value));
                        }
                    }
                }
                if (TextUtils.equals(jSONObject.getString("mode"), "refresh")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("options");
                    if (jSONObject3 != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("refreshFrom", jSONObject3.getString("refreshFrom"));
                        jrhVar.doLoadMore(combo, hashMap);
                        return;
                    }
                    return;
                }
                jrhVar.L0().d0(jrhVar, combo);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements g1a<SensorEvent, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f11569a;
        public final /* synthetic */ int b;

        public g(MUSXSearchEventModule mUSXSearchEventModule, pvh pvhVar, int i) {
            this.f11569a = pvhVar;
            this.b = i;
        }

        /* renamed from: a */
        public xhv invoke(SensorEvent sensorEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("28a491b4", new Object[]{this, sensorEvent});
            }
            if (!(this.f11569a == null || sensorEvent == null)) {
                float[] fArr = sensorEvent.values;
                if (fArr.length >= 3) {
                    JSONObject jSONObject = new JSONObject();
                    if (this.b == 0) {
                        jSONObject.put("x", (Object) Float.valueOf((-fArr[0]) / 10.0f));
                        jSONObject.put("y", (Object) Float.valueOf((-fArr[1]) / 10.0f));
                        jSONObject.put(AmnetConstant.VAL_SUPPORT_ZSTD, (Object) Float.valueOf((-fArr[2]) / 10.0f));
                    } else {
                        jSONObject.put("x", (Object) Float.valueOf(fArr[0]));
                        jSONObject.put("y", (Object) Float.valueOf(fArr[1]));
                        jSONObject.put(AmnetConstant.VAL_SUPPORT_ZSTD, (Object) Float.valueOf(fArr[2]));
                    }
                    this.f11569a.a(jSONObject);
                }
            }
            return null;
        }
    }

    public static JSONObject getNavigationInfo(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9f110d69", new Object[]{context});
        }
        if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        String str = "";
        if (extras != null) {
            str = extras.getString(KEY_OPEN_URL_EXTRAS, str);
        }
        JSONObject jSONObject = new JSONObject();
        if (intent.getData() != null) {
            jSONObject.put("url", (Object) intent.getData().toString());
        }
        try {
            jSONObject.put("params", (Object) JSON.parseObject(str));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @MUSMethod
    public void getPvFeature(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac70258", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        String string = jSONObject.getString("query");
        if (TextUtils.isEmpty(string)) {
            pvhVar.b(this.mCachedPvFeature);
        }
        long g2 = qrl.g(jSONObject.getString("timeout"), 50L);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        htf.b().d(string, new k(countDownLatch));
        try {
            countDownLatch.await(g2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        pvhVar.b(this.mCachedPvFeature);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
        if (r3.equals("disappear") == false) goto L_0x0062;
     */
    @com.taobao.android.weex_framework.ui.MUSMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void commitUserBehavior(com.alibaba.fastjson.JSONObject r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.search.musie.MUSXSearchEventModule.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "cae3b5b5"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r11
            r1[r0] = r12
            r3.ipc$dispatch(r4, r1)
            return
        L_0x0015:
            java.lang.String r3 = "behavior"
            java.lang.String r3 = r12.getString(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0022
            return
        L_0x0022:
            java.lang.String r4 = "itemId"
            java.lang.String r4 = r12.getString(r4)
            java.lang.String r5 = "actionName"
            java.lang.String r5 = r12.getString(r5)
            java.lang.String r6 = "pageName"
            java.lang.String r6 = r12.getString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x0044
            tb.c2v r6 = tb.c2v.getInstance()
            java.lang.String r6 = r6.getCurrentPageName()
        L_0x0044:
            java.lang.String r7 = "args"
            com.alibaba.fastjson.JSONObject r12 = tb.h19.d(r12, r7)
            java.lang.String[] r12 = tb.h6p.a(r12)
            com.taobao.android.weex_framework.a r7 = r11.getInstance()
            android.view.View r7 = r7.getRenderRoot()
            r3.hashCode()
            r8 = 0
            r9 = -1
            int r10 = r3.hashCode()
            switch(r10) {
                case -1411068523: goto L_0x0090;
                case -177721437: goto L_0x0087;
                case 114595: goto L_0x007b;
                case 96667352: goto L_0x0070;
                case 102846135: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            r0 = -1
            goto L_0x009a
        L_0x0064:
            java.lang.String r0 = "leave"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x006e
            goto L_0x0062
        L_0x006e:
            r0 = 4
            goto L_0x009a
        L_0x0070:
            java.lang.String r0 = "enter"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0079
            goto L_0x0062
        L_0x0079:
            r0 = 3
            goto L_0x009a
        L_0x007b:
            java.lang.String r0 = "tap"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0085
            goto L_0x0062
        L_0x0085:
            r0 = 2
            goto L_0x009a
        L_0x0087:
            java.lang.String r1 = "disappear"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x009a
            goto L_0x0062
        L_0x0090:
            java.lang.String r0 = "appear"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0099
            goto L_0x0062
        L_0x0099:
            r0 = 0
        L_0x009a:
            switch(r0) {
                case 0: goto L_0x00bc;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00a4;
                case 4: goto L_0x009e;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x00bf
        L_0x009e:
            java.lang.String[] r12 = new java.lang.String[r2]
            tb.cqv.m(r6, r8, r11, r12)
            goto L_0x00bf
        L_0x00a4:
            com.taobao.android.weex_framework.a r12 = r11.getInstance()
            android.content.Context r12 = r12.getUIContext()
            java.lang.String[] r0 = new java.lang.String[r2]
            tb.cqv.l(r6, r8, r12, r0)
            goto L_0x00bf
        L_0x00b2:
            java.lang.String r0 = ""
            tb.cqv.u(r6, r5, r0, r4, r12)
            goto L_0x00bf
        L_0x00b8:
            tb.cqv.C(r6, r5, r4, r7, r12)
            goto L_0x00bf
        L_0x00bc:
            tb.cqv.A(r6, r5, r4, r7, r12)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.MUSXSearchEventModule.commitUserBehavior(com.alibaba.fastjson.JSONObject):void");
    }

    @MUSMethod
    public void subscribeMotionGyro(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        int i2 = 4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5fe74c", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else if (o4p.q1() && jSONObject != null && pvhVar != null) {
            boolean booleanValue = jSONObject.getBooleanValue("on");
            int intValue = jSONObject.getIntValue("type");
            if (!booleanValue) {
                unregisterGSensorListener();
                pvhVar.b(new Object[0]);
                return;
            }
            if (this.sensorEventListener != null) {
                unregisterGSensorListener();
            }
            this.sensorEventListener = new m5p(new g(this, pvhVar, intValue), null);
            this.sensorEventListener.d(jSONObject.getLongValue(AURAPageEventStrategy.FREQUENCY));
            Context applicationContext = getInstance().getUIContext().getApplicationContext();
            if (intValue == 0) {
                i2 = 9;
            }
            if (!qbp.b(applicationContext, Integer.valueOf(i2), this.sensorEventListener)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("msg", (Object) "Device Not Support");
                if (pvhVar2 != null) {
                    pvhVar2.b(jSONObject2);
                    return;
                }
                return;
            }
            getInstance().getRenderRoot().addOnAttachStateChangeListener(new h());
        }
    }
}
