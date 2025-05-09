package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.taolive.room.business.goodcard.GoodCardItemTppBean;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.business.recommendLives.MtopMediaplatformAliveRecommendLivesResponse;
import com.taobao.taolive.room.business.recommendLives.MtopMediaplatformAliveRecommendLivesResponseData;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.mediaplatform.service.monitor.AdMonitorBusiness;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.service.TppParamFeedInfo;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.detail.checkforeground.CheckForeGroundResponseData;
import com.taobao.taolive.sdk.controller.BaseListAdapter;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zlr extends yir implements b0d, s3c, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GUANG_REFRESH_URL = "https://h5.m.taobao.com/taolive/video.html?spm=a2141.1.tabbar.guangguang&needRecommend=true&livesource=tb_tab2.guangguang_newlivetab&updateAllDataWhenRefresh=true";
    public static final String PARAM_APPKEY = "appkey";
    public static final String PARAM_ENTRY_ACCOUNT_ID = "entryAccountId";
    public static final String PARAM_ENTRY_ITEM_ID = "entryItemId";
    public static final String PARAM_ENTRY_LIVE_ID = "entryLiveId";
    public static final String PARAM_ENTRY_LIVE_SOURCE = "entryLiveSource";
    public static final String PARAM_ENTRY_LIVE_TRACE_ID = "entryTraceId";
    public static final String PARAM_ENTRY_RECOMMEND_BIND_ID = "entryRecommendBindId";
    public static final String PARAM_ENTRY_SELLERID = "shopUserId";
    public static final String PARAM_ENTRY_SJSD_ITEM_ID = "entrySjsdItemId";
    public static final String PARAM_ENTRY_SPM = "entrySpm";
    public static final String PARAM_ENTRY_TIMESHIFT_ITEM_ID = "entryTimeShiftItemId";
    public static final String PARAM_QUERY_DETAIL_INFO = "queryDetailInfo";
    public static final String PARAM_QUERY_KEY = "queryKey";
    public static final String PARAM_REPLAY_CURRENT_POSITION = "replayCurrentPosition";
    public static final String PARAM_REPLAY_URL = "replayUrl";
    public static final String PARAM_TIME_MOVEING_STATUS = "timeMovingStatus";
    public static final String z = zlr.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32852a;
    public long b;
    public long c;
    public long d;
    public amc e;
    public final ijw h;
    public int k;
    public int l;
    public int o;
    public Integer r;
    public BaseListAdapter s;
    public final dba t;
    public String u;
    public RecyclerView y;
    public final ArrayList<IRecyclerModel> f = new ArrayList<>();
    public final ArrayList<String> g = new ArrayList<>();
    public HashMap<String, String> i = new HashMap<>();
    public final HashMap<Integer, b> j = new HashMap<>();
    public boolean m = false;
    public int q = 180;
    public int v = 0;
    public boolean w = false;
    public boolean x = true;
    public final Handler p = new Handler(this);
    public final int n = pvs.t2();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32853a;
        public final /* synthetic */ int b;

        public a(int i, int i2) {
            this.f32853a = i;
            this.b = i2;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            String B = zlr.B();
            o3s.a(B, "onError: " + i + " netResponse = " + netResponse + " o = " + obj);
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            String B = zlr.B();
            o3s.a(B, "onSuccess: " + i + " netResponse = " + netResponse + " netBaseOutDo = " + netBaseOutDo + " o = " + obj);
            if (netBaseOutDo != null && (netBaseOutDo.getData() instanceof Map)) {
                zlr.C(zlr.this, netBaseOutDo, this.f32853a, this.b);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            String B = zlr.B();
            o3s.a(B, "onSystemError: " + i + " netResponse = " + netResponse + " o = " + obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f32854a;
        public long b;
        public long c;
        public String d;
        public String e;

        static {
            t2o.a(779093225);
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        t2o.a(779093223);
        t2o.a(806355932);
        t2o.a(806355016);
    }

    public zlr(boolean z2, dba dbaVar, Activity activity) {
        this.t = dbaVar;
        dbaVar.v0(this);
        this.h = dbaVar.t0();
        this.f32852a = z2;
        a4s.b(activity, sjr.g(), this);
    }

    public static /* synthetic */ String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return z;
    }

    public static /* synthetic */ void C(zlr zlrVar, NetBaseOutDo netBaseOutDo, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83b6e5e", new Object[]{zlrVar, netBaseOutDo, new Integer(i), new Integer(i2)});
        } else {
            zlrVar.S(netBaseOutDo, i, i2);
        }
    }

    public static /* synthetic */ Object ipc$super(zlr zlrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/service/TBLiveRecEngineV2");
    }

    @Override // tb.yir
    public void A(String str, long j, boolean z2, long j2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db0739e", new Object[]{this, str, new Long(j), new Boolean(z2), new Long(j2), str2});
            return;
        }
        TppParamFeedInfo b2 = this.h.b(str);
        if (b2 != null) {
            b2.stay = j;
            b2.followStatus = z2 ? 1 : 0;
            b2.roomViewCnt = j2;
            b2.fansLevel = str2;
        }
    }

    public final String D(String str, String str2, String str3, Map<String, Object> map) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("472292c", new Object[]{this, str, str2, str3, map});
        }
        HashMap<String, Object> E = E(str, str2, str3, map);
        if (hw0.l() && (str4 = this.u) != null) {
            E.put("mockUserId", str4);
        }
        dba dbaVar = this.t;
        if (dbaVar != null) {
            dbaVar.e0 = E;
        }
        return JSON.toJSONString(E);
    }

    public final int F(String str) {
        ArrayList<IRecyclerModel> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0ddf08", new Object[]{this, str})).intValue();
        }
        if (!nqo.j() && (arrayList = this.f) != null && arrayList.size() > 0 && !TextUtils.isEmpty(str)) {
            for (int i = 0; i < this.f.size(); i++) {
                RecModel recModel = (RecModel) this.f.get(i);
                if (recModel != null && str.equals(recModel.liveId)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f762c0b", new Object[]{this, str})).intValue();
        }
        ArrayList<IRecyclerModel> arrayList = this.f;
        if (arrayList != null && !arrayList.isEmpty() && !TextUtils.isEmpty(str)) {
            for (int i = 0; i < this.f.size(); i++) {
                RecModel recModel = (RecModel) this.f.get(i);
                if (recModel != null && TextUtils.equals(recModel.keyPointId, str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final boolean I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("496354ab", new Object[]{this, str})).booleanValue();
        }
        ArrayList<String> arrayList = this.g;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        return this.g.contains(str);
    }

    public final boolean J(RecModel recModel, RecModel recModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("347fbfdd", new Object[]{this, recModel, recModel2})).booleanValue();
        }
        if (!pvs.o()) {
            return false;
        }
        if ((recModel2 != null && (recModel2.reserveItemCardInfo != null || recModel2.alimama != null)) || recModel.autoRecommendRepeat == 0 || recModel.autoRecommendInterval == 0 || recModel.autoRecommendIntervalFast == 0) {
            return false;
        }
        return true;
    }

    public final void K() {
        RecModel recModel;
        LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f170fc6c", new Object[]{this});
        } else if (!this.f.isEmpty() && this.f.size() != 1) {
            if (this.k < this.f.size() - 1) {
                RecModel recModel2 = (RecModel) this.f.get(this.k);
                if (!(recModel2.recommendCardInfo == null && ((reserveItemCardInfo = recModel2.reserveItemCardInfo) == null || reserveItemCardInfo.cardInfo == null))) {
                    int i = this.k;
                    if (i - 1 >= 0) {
                        recModel2 = (RecModel) this.f.get(i - 1);
                    }
                }
                Z(recModel2.liveId, recModel2.accountId, recModel2.clientReturnMap);
                if (this.k + 1 < this.f.size() - 1) {
                    recModel = (RecModel) this.f.get(this.k + 1);
                } else {
                    recModel = null;
                }
                if (J(recModel2, recModel)) {
                    if (recModel2.autoRecommendFastStart > 0) {
                        T(recModel2);
                    } else {
                        U(recModel2);
                    }
                }
            }
            int i2 = this.k;
            if (i2 > this.o) {
                this.o = i2;
            }
        }
    }

    public final Integer M() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("841b867", new Object[]{this});
        }
        ArrayList<IRecyclerModel> arrayList = this.f;
        if (arrayList != null) {
            i = arrayList.size();
        }
        if (i <= 0) {
            return -1;
        }
        int i2 = this.o;
        do {
            i2++;
            if (i2 > i - 1) {
                return -1;
            }
        } while (((RecModel) this.f.get(i2)).alimama == null);
        return Integer.valueOf(i2);
    }

    public final boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be86520a", new Object[]{this})).booleanValue();
        }
        if (this.f.size() - this.k <= this.n) {
            return true;
        }
        return false;
    }

    public final void O(int i, RecModel recModel) {
        RecyclerView recyclerView;
        dba dbaVar = this.t;
        boolean w = pvs.w();
        ArrayList<IRecyclerModel> arrayList = this.f;
        if (w && (recyclerView = this.y) != null && recyclerView.isComputingLayout()) {
            try {
                if (pvs.L0() && dbaVar != null) {
                    n2o.a(dbaVar.S(), "notifyItemChangedWhileRecyclerViewComputingLayout", null);
                }
                Class<? super Object> superclass = this.y.getClass().getSuperclass();
                if (superclass != null) {
                    Field declaredField = superclass.getDeclaredField("mLayoutOrScrollCounter");
                    declaredField.setAccessible(true);
                    declaredField.set(this.y, 0);
                    if (arrayList != null && i >= 0 && i < arrayList.size()) {
                        arrayList.set(i, recModel);
                        BaseListAdapter baseListAdapter = this.s;
                        if (baseListAdapter != null) {
                            baseListAdapter.Z(arrayList);
                            this.s.notifyItemChanged(i);
                        }
                    }
                }
            } catch (Exception e) {
                if (pvs.L0() && dbaVar != null) {
                    n2o.a(dbaVar.S(), "notifyItemChangedWhileRecyclerViewComputingLayout", e);
                }
                o3s.b(z, "notifyItemChanged catch Exception: " + e.getMessage());
            }
        } else if (arrayList != null && i >= 0 && i < arrayList.size()) {
            arrayList.set(i, recModel);
            BaseListAdapter baseListAdapter2 = this.s;
            if (baseListAdapter2 != null) {
                baseListAdapter2.Z(arrayList);
                this.s.notifyItemChanged(i);
            }
        }
    }

    public final void P(int i) {
        RecyclerView recyclerView;
        dba dbaVar = this.t;
        if (pvs.h3()) {
            RecyclerView recyclerView2 = this.y;
            if (recyclerView2 != null && recyclerView2.getScrollState() == 0 && !this.y.isComputingLayout()) {
                this.s.notifyItemInserted(i);
            }
        } else if (!pvs.w() || (recyclerView = this.y) == null || !recyclerView.isComputingLayout()) {
            this.s.notifyItemInserted(i);
        } else {
            try {
                if (pvs.L0() && dbaVar != null) {
                    n2o.a(dbaVar.S(), "notifyItemInsertedWhileRecyclerViewComputingLayout", null);
                }
                Class<? super Object> superclass = this.y.getClass().getSuperclass();
                if (superclass != null) {
                    Field declaredField = superclass.getDeclaredField("mLayoutOrScrollCounter");
                    declaredField.setAccessible(true);
                    declaredField.set(this.y, 0);
                    this.s.notifyItemInserted(i);
                }
            } catch (Exception e) {
                if (pvs.L0() && dbaVar != null) {
                    n2o.a(dbaVar.S(), "notifyItemInsertedWhileRecyclerViewComputingLayout", e);
                }
                o3s.b(z, "notifyItemInserted catch Exception: " + e.getMessage());
            }
        }
    }

    public final void Q(ArrayList<RecModel> arrayList, int i) {
        RecyclerView recyclerView;
        dba dbaVar = this.t;
        if (pvs.h3()) {
            RecyclerView recyclerView2 = this.y;
            if (recyclerView2 != null && recyclerView2.getScrollState() == 0 && !this.y.isComputingLayout()) {
                this.s.notifyItemRangeInserted(i, arrayList.size());
            }
        } else if (!pvs.w() || (recyclerView = this.y) == null || !recyclerView.isComputingLayout()) {
            this.s.notifyItemRangeInserted(i, arrayList.size());
        } else {
            try {
                if (pvs.L0() && dbaVar != null) {
                    n2o.a(dbaVar.S(), "notifyItemRangeInsertedWhileRecyclerViewComputingLayout", null);
                }
                Class<? super Object> superclass = this.y.getClass().getSuperclass();
                if (superclass != null) {
                    Field declaredField = superclass.getDeclaredField("mLayoutOrScrollCounter");
                    declaredField.setAccessible(true);
                    declaredField.set(this.y, 0);
                    this.s.notifyItemRangeInserted(i, arrayList.size());
                }
            } catch (Exception e) {
                if (pvs.L0() && dbaVar != null) {
                    n2o.a(dbaVar.S(), "notifyItemRangeInsertedWhileRecyclerViewComputingLayout", e);
                }
                o3s.b(z, "notifyItemRemoved catch Exception: " + e.getMessage());
            }
        }
    }

    public final void R(int i) {
        RecyclerView recyclerView;
        dba dbaVar = this.t;
        if (pvs.h3()) {
            RecyclerView recyclerView2 = this.y;
            if (recyclerView2 != null && recyclerView2.getScrollState() == 0 && !this.y.isComputingLayout()) {
                this.s.notifyItemRemoved(i);
            }
        } else if (!pvs.w() || (recyclerView = this.y) == null || !recyclerView.isComputingLayout()) {
            this.s.notifyItemRemoved(i);
        } else {
            try {
                if (pvs.L0() && dbaVar != null) {
                    n2o.a(dbaVar.S(), "notifyItemRemovedWhileRecyclerViewComputingLayout", null);
                }
                Class<? super Object> superclass = this.y.getClass().getSuperclass();
                if (superclass != null) {
                    Field declaredField = superclass.getDeclaredField("mLayoutOrScrollCounter");
                    declaredField.setAccessible(true);
                    declaredField.set(this.y, 0);
                    this.s.notifyItemRemoved(i);
                }
            } catch (Exception e) {
                if (pvs.L0() && dbaVar != null) {
                    n2o.a(dbaVar.S(), "notifyItemRemovedWhileRecyclerViewComputingLayout", e);
                }
                o3s.b(z, "notifyItemRemoved catch Exception: " + e.getMessage());
            }
        }
    }

    public final void T(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d33875", new Object[]{this, recModel});
        } else {
            this.p.sendMessageDelayed(Message.obtain(this.p, yj4.MSG_AUTO_RECOMMEND, recModel), recModel.autoRecommendInterval * 1000);
        }
    }

    public final void U(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0d2bf1", new Object[]{this, recModel});
        } else {
            this.p.sendMessageDelayed(Message.obtain(this.p, yj4.MSG_AUTO_RECOMMEND, recModel), recModel.autoRecommendIntervalFast * 1000);
        }
    }

    public final void W(RecModel recModel, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84941ec0", new Object[]{this, recModel, new Boolean(z2)});
        } else if (recModel != null && recModel.recommendCardInfo == null && recModel.reserveItemCardInfo == null) {
            TppParamFeedInfo tppParamFeedInfo = new TppParamFeedInfo();
            tppParamFeedInfo.liveId = recModel.liveId;
            tppParamFeedInfo.accountId = recModel.accountId;
            tppParamFeedInfo.clientReturnMap = recModel.clientReturnMap;
            tppParamFeedInfo.recommendBindId = recModel.recommendBindId;
            tppParamFeedInfo.timeMovingId = recModel.timeMovingId;
            tppParamFeedInfo.sjsdItemId = recModel.sjsdItemId;
            if (z2) {
                tppParamFeedInfo.enter = System.currentTimeMillis();
            }
            this.h.a(tppParamFeedInfo);
        }
    }

    public final void X(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66888a7f", new Object[]{this, str, str2, map});
        } else if (this.e != null) {
            this.c = pvs.H2();
            if (v2s.o().A() != null) {
                cwd A = v2s.o().A();
                A.c("TBLiveRecEngineV2", "live_recommend_updown_batch" + hashCode());
            }
            this.e.b(1, str, this.b, this.c, null, str2, D("batch", str, str2, map));
        }
    }

    public final void Y(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c92c6e2", new Object[]{this, str, str2, map});
            return;
        }
        this.w = true;
        Z(str, str2, map);
    }

    @Override // tb.yir
    public RecModel b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("c325bd66", new Object[]{this});
        }
        RecModel recModel = null;
        if (!this.f.isEmpty() && this.f.size() != 1 && this.k < this.f.size() - 1) {
            int i = this.k + 1;
            this.k = i;
            IRecyclerModel iRecyclerModel = this.f.get(i);
            if (iRecyclerModel instanceof RecModel) {
                recModel = (RecModel) iRecyclerModel;
                recModel.visit = true;
                W(recModel, false);
                if (N()) {
                    X(recModel.liveId, recModel.accountId, recModel.clientReturnMap);
                }
            }
        }
        return recModel;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "TBLiveRecEngineV2";
    }

    @Override // tb.yir
    public RecModel c() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("1f7eb12a", new Object[]{this});
        }
        if (this.f.isEmpty() || (i = this.k) == 0) {
            return null;
        }
        int i2 = i - 1;
        this.k = i2;
        RecModel recModel = (RecModel) this.f.get(i2);
        recModel.visit = true;
        W(recModel, false);
        return recModel;
    }

    @Override // tb.yir
    public void e() {
        int i;
        RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f40ae3", new Object[]{this});
        } else if (this.e != null && (i = this.k) >= 0 && i < this.f.size() && (recModel = (RecModel) this.f.get(this.k)) != null) {
            this.c = pvs.H2();
            if (v2s.o().A() != null) {
                cwd A = v2s.o().A();
                A.c("TBLiveRecEngineV2", "live_recommend_bottom_batch" + hashCode());
            }
            amc amcVar = this.e;
            String str = recModel.liveId;
            long j = this.b;
            long j2 = this.c;
            String str2 = recModel.accountId;
            amcVar.b(3, str, j, j2, null, str2, D("batch", str, str2, recModel.clientReturnMap));
        }
    }

    @Override // tb.yir
    public RecModel f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("4287f87f", new Object[]{this});
        }
        ArrayList<IRecyclerModel> arrayList = this.f;
        if (arrayList == null || arrayList.isEmpty() || this.k > this.f.size() - 1) {
            return null;
        }
        return (RecModel) this.f.get(this.k);
    }

    @Override // tb.yir
    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("10640b09", new Object[]{this});
        }
        if (f() != null) {
            return f().explainDebugInfo;
        }
        return null;
    }

    @Override // tb.yir
    public Map<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1b105257", new Object[]{this});
        }
        if (f() != null) {
            return f().modelDebugInfo;
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 1000) {
            Integer M = M();
            if (!(M.intValue() == -1 || (bVar = this.j.get(Integer.valueOf(M.intValue() - 1))) == null)) {
                this.r = M;
                long j = bVar.c;
                this.c = j;
                this.e.b(4, bVar.f32854a, bVar.b, j, null, bVar.d, bVar.e);
            }
            Handler handler = this.p;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(1000, this.q * 1000);
            }
        } else if (i == 2024) {
            RecModel recModel = (RecModel) message.obj;
            Y(recModel.liveId, recModel.accountId, recModel.clientReturnMap);
            int i2 = this.v + 1;
            this.v = i2;
            long j2 = i2;
            if (j2 >= recModel.autoRecommendRepeat) {
                o3s.b(z, "auto recommend time exceed " + recModel.autoRecommendRepeat);
            } else if (j2 < recModel.autoRecommendFastStart) {
                T(recModel);
            } else {
                U(recModel);
            }
        }
        return false;
    }

    @Override // tb.yir
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.k;
    }

    @Override // tb.yir
    public RecModel j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("8c3db0c0", new Object[]{this});
        }
        ArrayList<IRecyclerModel> arrayList = this.f;
        if (arrayList == null || arrayList.isEmpty() || this.f.size() == 1 || this.k + 1 >= this.f.size()) {
            return null;
        }
        return (RecModel) this.f.get(this.k + 1);
    }

    @Override // tb.yir
    public ArrayList<TppParamFeedInfo> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c9056293", new Object[]{this});
        }
        return this.h.c();
    }

    @Override // tb.yir
    public void n(String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf4475e", new Object[]{this, str, str2, str3, hashMap});
        } else if (!this.m) {
            sjr.g().a(this);
            this.m = true;
            if (this.f.isEmpty()) {
                RecModel recModel = new RecModel(false, this.t);
                recModel.visit = true;
                this.f.add(recModel);
            } else {
                RecModel recModel2 = (RecModel) this.f.get(0);
                recModel2.liveId = str;
                recModel2.accountId = str2;
                recModel2.recommendBindId = str3;
            }
            this.k = 0;
            this.l = 0;
            W((RecModel) this.f.get(0), true);
            if (gq0.h() != null) {
                this.e = gq0.h().a(this);
            } else {
                this.e = new d3h(this, this.t);
            }
            if (hashMap != null) {
                this.i = hashMap;
                hashMap.put(PARAM_ENTRY_LIVE_ID, str);
                this.i.put(PARAM_ENTRY_ACCOUNT_ID, str2);
            }
            this.i.put(PARAM_ENTRY_RECOMMEND_BIND_ID, str3);
            if (this.e != null) {
                this.b = 0L;
                long H2 = pvs.H2();
                this.c = H2;
                this.e.b(0, str, this.b, H2, str2 + ":0", "", D("batch", str, str2, null));
            }
            if (pvs.O1()) {
                int D2 = pvs.D2();
                this.q = D2;
                if (D2 < 180) {
                    this.q = 180;
                }
                this.p.sendEmptyMessageDelayed(1000, this.q * 1000);
            }
        }
    }

    @Override // tb.yir
    public void o(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961ac25f", new Object[]{this, videoInfo});
        } else if (videoInfo != null && videoInfo.isOfficialLive() && videoInfo.broadCaster != null) {
            String str = videoInfo.liveId;
            String str2 = videoInfo.officialLiveInfo.officialLiveId;
            ArrayList<String> arrayList = this.g;
            if (arrayList != null) {
                if (!arrayList.contains(str)) {
                    this.g.add(str);
                }
                if (!this.g.contains(str2)) {
                    this.g.add(str2);
                }
            }
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.addcart", "com.taobao.taolive.room.gotoDetail", uyg.EVENT_SHOW_GOODSPACKAGE, uyg.EVENT_ACTION_ADD_FAVOR, uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME, uyg.EVENT_ACTION_FOLLOW, "com.taobao.taolive.room.share", uyg.EVENT_ADD_ITEM, "com.taobao.taolive.room.add_item_new", uyg.EVENT_INPUT_SHOW, "com.taobao.taolive.room.enter", uyg.EVENT_KMP_COMMENT_SEND};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (vx9.d() != null) {
            return vx9.d().C();
        }
        return null;
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        if (netResponse != null) {
            x5t.i(z, netResponse.getRetMsg());
        }
        if (i == 0 && pvs.N1()) {
            sjr.g().c("com.taobao.taolive.room.disable_updown_switch", "REQUEST_TYPE_FIRST_error", vx9.e());
        }
        if (pvs.o()) {
            r();
        }
        String str = "NULL";
        igq.n().b("recommendLives", netResponse == null ? str : netResponse.getRetMsg(), netResponse == null ? str : netResponse.getRetCode());
        if (netResponse != null) {
            str = netResponse.getRetCode();
        }
        V(str, netResponse);
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // tb.yir
    public void p(RecModel recModel) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d87bf9f", new Object[]{this, recModel});
            return;
        }
        ArrayList<IRecyclerModel> arrayList = this.f;
        if (arrayList != null && (i = this.k) >= 0 && i < arrayList.size()) {
            this.f.set(this.k, recModel);
            BaseListAdapter baseListAdapter = this.s;
            if (baseListAdapter != null) {
                baseListAdapter.Z(this.f);
            }
        }
    }

    @Override // tb.yir
    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < this.f.size()) {
            this.f.remove(i);
            int i2 = this.k;
            if (i2 >= i && i2 > 0) {
                this.k = i2 - 1;
            }
            BaseListAdapter baseListAdapter = this.s;
            if (baseListAdapter != null) {
                baseListAdapter.Z(this.f);
                this.s.notifyItemRemoved(i);
            }
        }
    }

    @Override // tb.yir
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf08f36", new Object[]{this});
            return;
        }
        Handler handler = this.p;
        if (handler != null) {
            this.x = false;
            handler.removeMessages(yj4.MSG_AUTO_RECOMMEND);
        }
    }

    @Override // tb.yir
    public void s() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e8bb97", new Object[]{this});
            return;
        }
        RecModel f = f();
        if (f != null && (str = f.actionUrl) != null) {
            Uri parse = Uri.parse(str);
            if (parse.getQueryParameter(yj4.PARAM_ITEM_IDS) != null) {
                f.actionUrl = u90.l(f.actionUrl, yj4.PARAM_ITEM_IDS, "null");
            }
            if (parse.getQueryParameter(yj4.PARAM_ITEM_HOLD_TYPE) != null) {
                f.actionUrl = u90.l(f.actionUrl, yj4.PARAM_ITEM_HOLD_TYPE, "null");
            }
        }
    }

    @Override // tb.yir
    public void t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b60965b", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent("com.taobao.taolive.room.service.VisitedList");
        intent.putExtra("feedList", fkx.i(this.h.d(pvs.F2())));
        LocalBroadcastManager.getInstance(context).sendBroadcastSync(intent);
    }

    @Override // tb.yir
    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff6ebae8", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.k;
        if (i2 >= 0 && i2 < this.f.size()) {
            this.k = i;
            this.p.removeMessages(yj4.MSG_AUTO_RECOMMEND);
            this.v = 0;
            this.w = false;
            this.x = true;
            K();
            if (vx9.d() != null && j() != null && vx9.d().A != null && j().sideGudieInfo != null) {
                ((LinkedBlockingDeque) vx9.d().A).add(j().sideGudieInfo);
            }
        }
    }

    @Override // tb.yir
    public void v(BaseListAdapter baseListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f36a3e", new Object[]{this, baseListAdapter});
            return;
        }
        this.s = baseListAdapter;
        if (baseListAdapter != null) {
            baseListAdapter.Z(this.f);
            this.s.notifyDataSetChanged();
        }
    }

    @Override // tb.yir
    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1038383", new Object[]{this, str});
        } else {
            this.u = str;
        }
    }

    @Override // tb.yir
    public void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82cb071", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    @Override // tb.yir
    public void y(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
        } else {
            this.y = recyclerView;
        }
    }

    @Override // tb.yir
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        amc amcVar = this.e;
        if (amcVar != null) {
            amcVar.destroy();
            this.e = null;
        }
        ArrayList<IRecyclerModel> arrayList = this.f;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.m = false;
        sjr.g().b(this);
    }

    public final String L(NetResponse netResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c405ad4", new Object[]{this, netResponse});
        }
        if (netResponse == null) {
            return "";
        }
        try {
            if (netResponse.getHeaderFields() == null || (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) == null || list.size() <= 0) {
                return "";
            }
            return list.get(0);
        } catch (Exception unused) {
            Log.e(z, "getTraceID error ");
            return "";
        }
    }

    public final void V(String str, NetResponse netResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30c7c044", new Object[]{this, str, netResponse});
            return;
        }
        igq.n().b("recommendLives", "no_data", "no_data");
        HashMap hashMap = new HashMap();
        hashMap.put("subtype", z9u.SOURCE_UPDOWNSWITCH);
        hashMap.put("responseType", "live");
        hashMap.put("errorCode", str);
        hashMap.put("entryLivesource", iba.o(this.t));
        hashMap.put(c4o.KEY_DATA_SOURCE, "mtop");
        if (netResponse != null) {
            try {
                if (!(netResponse.getHeaderFields() == null || (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) == null || list.size() <= 0)) {
                    hashMap.put("traceId", list.get(0));
                }
            } catch (Exception unused) {
            }
        }
        if (v2s.o().s() != null) {
            v2s.o().s().a("live_recommendation_abnormal", "Page_TaobaoLiveWatch", hashMap);
        }
        uwt.a(hashMap);
        rbu.M(this.t, "live_recommendation_abnormal", hashMap);
    }

    @Override // tb.yir
    public void d(String str, String str2, Map<String, String> map, String str3) {
        wpf a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0844374", new Object[]{this, str, str2, map, str3});
            return;
        }
        RecModel recModel = new RecModel(true, this.t);
        recModel.liveId = str;
        recModel.accountId = str2;
        recModel.initParams = map;
        recModel.visit = true;
        recModel.isFirst = true;
        recModel.trackInfo = str3;
        if (pvs.o0() && map != null) {
            recModel.timeMovingId = map.get(yj4.PARAM_TIMEMOVING_ITEM_ID);
            recModel.sjsdItemId = map.get(yj4.PARAM_SJSD_ITEM_ID);
            recModel.keyPointId = map.get("keyPointId");
            recModel.productType = map.get(yj4.PARAM_PRODUCT_TYPE);
            recModel.timeMovingSpfPlayVideo = map.get("timeMovingSpfPlayVideo");
        }
        if (!(!pvs.M() || v2s.o().q() == null || (a2 = v2s.o().q().a()) == null)) {
            String a3 = a2.a();
            if (a2.b().equals(str)) {
                LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo = (LiveDetailMessinfoResponseData.AlimamaInfo) fkx.f(a3, LiveDetailMessinfoResponseData.AlimamaInfo.class);
                iba.v1(alimamaInfo, this.t);
                recModel.alimama = alimamaInfo;
                if (alimamaInfo != null) {
                    ls0.a(alimamaInfo.ifsUrl, alimamaInfo.pid, "liveUpAndDown");
                    AdMonitorBusiness adMonitorBusiness = new AdMonitorBusiness(null);
                    String str4 = alimamaInfo.pid;
                    String str5 = "";
                    String str6 = map != null ? map.get("livesource") : str5;
                    if (map != null) {
                        str5 = map.get(gf0.K_DELIVERY_ID);
                    }
                    adMonitorBusiness.L(str4, "impression", "", str6, str5);
                }
            }
            v2s.o().q().b(null);
        }
        this.f.add(recModel);
        iba.q1(fkx.i(recModel), this.t);
    }

    public final HashMap<String, Object> E(String str, String str2, String str3, Map<String, Object> map) {
        List<GoodCardItemTppBean> list;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ce2d9c79", new Object[]{this, str, str2, str3, map});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, String> hashMap2 = this.i;
        if (hashMap2 != null) {
            hashMap.put(PARAM_ENTRY_LIVE_ID, hashMap2.get(PARAM_ENTRY_LIVE_ID));
            hashMap.put(PARAM_ENTRY_ACCOUNT_ID, this.i.get(PARAM_ENTRY_ACCOUNT_ID));
            hashMap.put(PARAM_ENTRY_RECOMMEND_BIND_ID, this.i.get(PARAM_ENTRY_RECOMMEND_BIND_ID));
            hashMap.put("entryLiveSource", this.i.get("entryLiveSource"));
            hashMap.put(PARAM_ENTRY_SJSD_ITEM_ID, this.i.get(PARAM_ENTRY_SJSD_ITEM_ID));
            hashMap.put(PARAM_ENTRY_LIVE_TRACE_ID, this.i.get(PARAM_ENTRY_LIVE_TRACE_ID));
            hashMap.put(PARAM_ENTRY_TIMESHIFT_ITEM_ID, this.i.get(PARAM_ENTRY_TIMESHIFT_ITEM_ID));
            hashMap.put("appkey", this.i.get("appkey"));
            hashMap.put("queryKey", this.i.get("queryKey"));
            hashMap.put("queryDetailInfo", this.i.get("queryDetailInfo"));
            hashMap.put(PARAM_ENTRY_SELLERID, this.i.get(PARAM_ENTRY_SELLERID));
            hashMap.put("liveBucket", iba.y(this.t));
            hashMap.put("liveAbid", iba.x(this.t));
            hashMap.put("singleLiveTabSessionId", iba.H(this.t));
            if (pvs.o0()) {
                String str4 = this.i.get("entryLiveSource");
                String str5 = this.i.get("timeMovingStatus");
                if (str4 != null && str5 != null && str4.equals("tpp_88") && str5.equals("1")) {
                    hashMap.put("timeMovingStatus", str5);
                    hashMap.put(PARAM_ENTRY_ITEM_ID, this.i.get(PARAM_ENTRY_ITEM_ID));
                }
            }
            dba dbaVar = this.t;
            if (!(dbaVar == null || dbaVar.r() == null || this.t.r().abilityCompontent == null)) {
                z2 = ((ibt) this.t.r().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_RecommendDXCard);
            }
            if (!z2) {
                hashMap.put("queryDirectDown", "true");
                dba dbaVar2 = this.t;
                if (!(dbaVar2 == null || (list = dbaVar2.c0) == null || ((ArrayList) list).size() <= 0)) {
                    hashMap.put(bia.UNDER_TAKE_GOODS_LIST, JSON.toJSONString(this.t.c0));
                }
            }
            dba dbaVar3 = this.t;
            if (dbaVar3 != null) {
                dbaVar3.getClass();
            }
            if (pvs.I1()) {
                hashMap.put(yj4.REF_PID, this.i.get(yj4.REF_PID));
            }
        }
        hashMap.put("nextLiveId", str2);
        hashMap.put("nextAccountId", str3);
        hashMap.put("nextClientReturnMap", JSON.toJSONString(map));
        hashMap.put("entrySpm", iba.r(this.t));
        hashMap.put("type", str);
        hashMap.put("platform", "android");
        hashMap.put("index", (this.k + 1) + "");
        TBLocationDTO d = TBLocationClient.d();
        if (d != null) {
            hashMap.put(r4p.KEY_CITY_CODE, d.cityCode);
            hashMap.put(r4p.KEY_CITY_NAME, d.cityName);
        }
        hashMap.put("feedList", this.h.c());
        if ("true".equals(iba.F(this.t))) {
            hashMap.put("realExposure", "true");
        }
        if (iba.u(this.t) != null) {
            hashMap.put("homepageFeedList", iba.u(this.t));
        }
        return hashMap;
    }

    @Override // tb.yir
    public void a(JSONObject jSONObject) {
        LiveDetailMessinfoResponseData.RecVideo c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16fed6f", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (c = lxg.c(jSONObject)) != null) {
            RecModel recModel = new RecModel(c, false, this.t);
            recModel.actionUrl = u90.l(recModel.actionUrl, "livesource", "upDownSwitch.guide");
            String str = recModel.liveId;
            if (str != null) {
                int F = F(str);
                if (F != -1 && F > this.k) {
                    this.f.remove(F);
                    BaseListAdapter baseListAdapter = this.s;
                    if (baseListAdapter != null) {
                        baseListAdapter.Z(this.f);
                        R(F);
                    }
                }
                this.f.add(this.k + 1, recModel);
                BaseListAdapter baseListAdapter2 = this.s;
                if (baseListAdapter2 != null) {
                    baseListAdapter2.Z(this.f);
                    P(this.k + 1);
                }
                sjr.g().c("com.taobao.taolive.room.disable_update_scroll_bgimg", null, vx9.e());
            }
        }
    }

    @Override // tb.yir
    public JSONArray k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("56aa13e5", new Object[]{this});
        }
        if (this.f.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i <= this.k; i++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("liveId", (Object) ((RecModel) this.f.get(i)).liveId);
            jSONObject.put("accountId", (Object) ((RecModel) this.f.get(i)).accountId);
            jSONObject.put("itemId", (Object) "");
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }

    @Override // tb.yir
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d706b7a6", new Object[]{this});
        } else if (!tz3.a(this.f)) {
            int n = nqo.n();
            int max = Math.max(this.k - n, 0);
            int min = Math.min(this.k + n, this.f.size() - 1);
            ArrayList arrayList = new ArrayList();
            for (int i = max; i <= min; i++) {
                arrayList.add(((RecModel) this.f.get(i)).liveId);
            }
            String str = z;
            o3s.a(str, "发起定时刷新请求， 请求列表大小：" + arrayList.size());
            iq3 iq3Var = new iq3(new a(min, max));
            if (!tz3.a(arrayList)) {
                iq3Var.K(arrayList);
            }
        }
    }

    public final void S(NetBaseOutDo netBaseOutDo, int i, int i2) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20872188", new Object[]{this, netBaseOutDo, new Integer(i), new Integer(i2)});
        } else if (i2 >= 0 && !tz3.a(this.f) && this.f.size() > this.o && i < this.f.size()) {
            o3s.b(z, "定时刷新删除下播直播间返回接口大小：" + ((Map) netBaseOutDo.getData()).size());
            int i3 = 0;
            boolean z3 = true;
            for (int i4 = i2; i4 <= Math.min(i, this.f.size() - 1); i4++) {
                RecModel recModel = (RecModel) this.f.get(i4);
                if (((Map) netBaseOutDo.getData()).get(recModel.liveId) != null) {
                    CheckForeGroundResponseData checkForeGroundResponseData = (CheckForeGroundResponseData) ((Map) netBaseOutDo.getData()).get(recModel.liveId);
                    if (i4 == this.k) {
                        z3 = TextUtils.equals(checkForeGroundResponseData.roomStatus, "1");
                    }
                    if (!TextUtils.equals(checkForeGroundResponseData.roomStatus, "1")) {
                        i3++;
                    } else if (i4 > this.k) {
                        z2 = true;
                    }
                }
            }
            if (!(z3 || z2) || (!z3 && i3 > (i - i2) / 2)) {
                Uri parse = Uri.parse(GUANG_REFRESH_URL);
                o3s.a(z, "刷新了当前的视图 hasBottomPlaying" + z2 + " checkCount" + i3);
                sjr.g().c("com.taobao.taolive.room.refresh", parse, vx9.e());
            } else if (i3 > 0) {
                int i5 = this.o;
                while (i5 <= Math.min(i, this.f.size() - 1)) {
                    RecModel recModel2 = (RecModel) this.f.get(i5);
                    if (((Map) netBaseOutDo.getData()).get(recModel2.liveId) != null && !TextUtils.equals(((CheckForeGroundResponseData) ((Map) netBaseOutDo.getData()).get(recModel2.liveId)).roomStatus, "1")) {
                        q(i5);
                        i5--;
                    }
                    i5++;
                }
                o3s.a(z, "删除了下播的直播间  checkCount " + i3);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        char c = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        VideoInfo c0 = up6.c0(vx9.d());
        TppParamFeedInfo b2 = c0 != null ? this.h.b(c0.liveId) : null;
        if (b2 != null) {
            try {
                switch (str.hashCode()) {
                    case -1832948174:
                        if (str.equals("com.taobao.taolive.room.add_item_new")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1473773571:
                        if (str.equals(uyg.EVENT_ACTION_ADD_FAVOR)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1450449455:
                        if (str.equals(uyg.EVENT_ADD_ITEM)) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1450012590:
                        if (str.equals(uyg.EVENT_SHOW_GOODSPACKAGE)) {
                            break;
                        }
                        c = 65535;
                        break;
                    case -833264487:
                        if (str.equals(uyg.EVENT_KMP_COMMENT_SEND)) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -830550742:
                        if (str.equals(uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -554098287:
                        if (str.equals(uyg.EVENT_ACTION_FOLLOW)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -462319263:
                        if (str.equals("com.taobao.taolive.room.addcart")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 119727352:
                        if (str.equals("com.taobao.taolive.room.enter")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 132460031:
                        if (str.equals("com.taobao.taolive.room.share")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 458859892:
                        if (str.equals("com.taobao.taolive.room.gotoDetail")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1595703346:
                        if (str.equals(uyg.EVENT_INPUT_SHOW)) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        if (obj instanceof Long) {
                            b2.addCart.add((Long) obj);
                            return;
                        }
                        return;
                    case 1:
                        if (obj instanceof Long) {
                            b2.gotoDetail.add((Long) obj);
                            return;
                        }
                        return;
                    case 2:
                        b2.openGoodsList++;
                        return;
                    case 3:
                        if (obj != null && (obj instanceof Map)) {
                            try {
                                b2.like = Integer.parseInt((String) ((HashMap) obj).get("totalFavorCount"));
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 4:
                    case 5:
                        b2.followStatus = 1;
                        return;
                    case 6:
                        b2.share++;
                        return;
                    case 7:
                    case '\b':
                    case '\t':
                        b2.comment++;
                        return;
                    case '\n':
                        b2.openComment++;
                        break;
                    case 11:
                        break;
                    default:
                        return;
                }
                b2.enter = System.currentTimeMillis();
            } catch (Exception e) {
                x5t.i(z, "onEvent: " + str + " msg = " + e.getMessage());
            }
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        String str;
        ArrayList<LiveDetailMessinfoResponseData.RecVideo> arrayList;
        ArrayList<IRecyclerModel> arrayList2;
        LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo;
        dba dbaVar;
        ISmartLandingProxy.b bVar;
        RoomPlayerObserver I0;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        MtopMediaplatformAliveRecommendLivesResponseData data = netBaseOutDo instanceof MtopMediaplatformAliveRecommendLivesResponse ? ((MtopMediaplatformAliveRecommendLivesResponse) netBaseOutDo).getData() : null;
        if (data == null || (arrayList = data.model) == null || arrayList.size() <= 0) {
            igq.n().b("recommendLives", "no_data", "no_data");
            V("0", netResponse);
            if (v2s.o().A() != null) {
                v2s.o().A().c("TBLiveRecEngineV2", "live_recommend_no_data" + hashCode());
            }
        } else {
            if (v2s.o().A() != null) {
                v2s.o().A().c(z, "modelSize:" + data.model.size() + "first_liveId:" + data.model.get(0).liveId + " type:" + i + " hashCode:" + hashCode());
            }
            if (pvs.P1()) {
                ux9 d = vx9.d();
                if ((d instanceof air) && (I0 = ((air) d).I0()) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("apiName", (Object) netResponse.getApi());
                    jSONObject.put("apiVersion", (Object) netResponse.getV());
                    jSONObject.put("traceID", (Object) L(netResponse));
                    jSONObject.put("type", (Object) Integer.valueOf(i));
                    jSONObject.put("modelSize", (Object) Integer.valueOf(data.model.size()));
                    jSONObject.put("liveId", (Object) data.model.get(0).liveId);
                    I0.l(jSONObject);
                }
            }
            if (i == 0 || i == 1 || i == 3) {
                ArrayList<RecModel> arrayList3 = new ArrayList<>();
                Iterator<LiveDetailMessinfoResponseData.RecVideo> it = data.model.iterator();
                while (it.hasNext()) {
                    RecModel recModel = new RecModel(it.next(), false, this.t);
                    int F = F(recModel.liveId);
                    boolean equals = TextUtils.equals(recModel.productType, com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE);
                    if (pvs.H1() && equals) {
                        F = G(recModel.keyPointId);
                    }
                    if (F == -1 && (!I(recModel.liveId) || equals)) {
                        arrayList3.add(recModel);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    if (i == 0) {
                        RecModel f = f();
                        RecModel recModel2 = arrayList3.get(0);
                        f.autoRecommendInterval = recModel2.autoRecommendInterval;
                        f.autoRecommendRepeat = recModel2.autoRecommendRepeat;
                        f.autoRecommendIntervalFast = recModel2.autoRecommendIntervalFast;
                        f.autoRecommendFastStart = recModel2.autoRecommendFastStart;
                        if (J(f, recModel2)) {
                            if (f.autoRecommendFastStart > 0) {
                                T(f);
                            } else {
                                U(f);
                            }
                        }
                    }
                    ArrayList<IRecyclerModel> arrayList4 = this.f;
                    if (arrayList4 != null) {
                        int size = arrayList4.size();
                        this.f.addAll(arrayList3);
                        BaseListAdapter baseListAdapter = this.s;
                        if (baseListAdapter != null) {
                            baseListAdapter.Z(this.f);
                            Q(arrayList3, size);
                        }
                    }
                    if (i == 0 || i == 3) {
                        sjr.g().c("com.taobao.taolive.room.enable_updown_switch", null, vx9.e());
                        sjr.g().c("com.taobao.taolive.room.disable_update_scroll_bgimg", null, vx9.e());
                    }
                    if (i == 0 && (arrayList2 = this.f) != null && !arrayList2.isEmpty()) {
                        RecModel f2 = f();
                        RecModel j = j();
                        if (!(f2 == null || j == null || (reserveItemCardInfo = j.reserveItemCardInfo) == null || reserveItemCardInfo.bottomInfo == null || reserveItemCardInfo.cardInfo != null || (dbaVar = this.t) == null || (bVar = dbaVar.u) == null)) {
                            bVar.f("hasAlimamaInfo", String.valueOf(f2.alimama != null));
                            this.t.u.f("nextLiveHasAlimamaInfo", String.valueOf(j.alimama != null));
                            ISmartLandingProxy.b bVar2 = this.t.u;
                            LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo2 = f2.reserveItemCardInfo;
                            bVar2.f("hasUpdownBottomInfo", String.valueOf((reserveItemCardInfo2 == null || reserveItemCardInfo2.bottomInfo == null) ? false : true));
                            ISmartLandingProxy.b bVar3 = this.t.u;
                            LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo3 = j.reserveItemCardInfo;
                            if (reserveItemCardInfo3 == null || reserveItemCardInfo3.bottomInfo == null) {
                                z2 = false;
                            }
                            bVar3.f("nextLiveHasUpdownBottomInfo", String.valueOf(z2));
                        }
                    }
                    igq.n().d("recommendLives");
                } else if (N()) {
                    igq.n().b("recommendLives", AgooConstants.MESSAGE_DUPLICATE, AgooConstants.MESSAGE_DUPLICATE);
                }
                this.b += this.c;
            } else if (i == 2) {
                if (!nqo.j()) {
                    LiveDetailMessinfoResponseData.RecVideo recVideo = data.model.get(0);
                    if (recVideo != null && this.x) {
                        RecModel recModel3 = new RecModel(recVideo, false, this.t);
                        if (pvs.o() && !(recModel3.alimama == null && recModel3.reserveItemCardInfo == null)) {
                            r();
                        }
                        int F2 = F(recModel3.liveId);
                        if (pvs.H1() && TextUtils.equals(recModel3.productType, com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE)) {
                            F2 = G(recModel3.keyPointId);
                        }
                        if (F2 != -1) {
                            String str2 = z;
                            o3s.b(str2, " realtime duplicate index = " + F2 + " id = " + recModel3.liveId + " curIndex = " + this.k);
                            if (F2 > this.k) {
                                this.f.remove(F2);
                                BaseListAdapter baseListAdapter2 = this.s;
                                if (baseListAdapter2 != null) {
                                    baseListAdapter2.Z(this.f);
                                    R(F2);
                                }
                                int max = Math.max(this.k, this.l) + 1;
                                if (max > this.f.size()) {
                                    max = this.f.size();
                                }
                                this.f.add(max, recModel3);
                                BaseListAdapter baseListAdapter3 = this.s;
                                if (baseListAdapter3 != null) {
                                    baseListAdapter3.Z(this.f);
                                    P(max);
                                }
                                sjr.g().c("com.taobao.taolive.room.disable_update_scroll_bgimg", null, vx9.e());
                            } else {
                                Log.e(str2, " do nothing realtime duplicate index = " + F2 + " id = " + recModel3.liveId + " curIndex = " + this.k);
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("liveId", recModel3.liveId);
                            hashMap.put("existIndex", String.valueOf(F2));
                            hashMap.put("count", String.valueOf(this.f.size()));
                            hashMap.put("currentIndex", String.valueOf(this.k));
                            rbu.M(this.t, "upDownSwitchRealtimeRepeat", hashMap);
                        } else if (!I(recModel3.liveId) || TextUtils.equals(recModel3.productType, com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE)) {
                            if (!J(recModel3, j()) || !this.w) {
                                this.f.add(Math.max(this.k, this.l) + 1, recModel3);
                                BaseListAdapter baseListAdapter4 = this.s;
                                if (baseListAdapter4 != null) {
                                    baseListAdapter4.Z(this.f);
                                    P(Math.max(this.k, this.l) + 1);
                                    o3s.b(z, "insert item: " + recModel3.liveId);
                                }
                            } else {
                                O(this.k + 1, recModel3);
                                this.w = false;
                                o3s.b(z, "auto recommend replace item: " + recModel3.liveId);
                            }
                            sjr.g().c("com.taobao.taolive.room.disable_update_scroll_bgimg", null, vx9.e());
                            Log.e("luozz", "  realtime no duplicate index = " + F2 + " id = " + recModel3.liveId + " curIndex = " + this.k);
                        }
                        igq.n().d("recommendLives");
                    }
                    this.b += this.c;
                } else {
                    return;
                }
            } else if (i == 4) {
                if (!nqo.j()) {
                    LiveDetailMessinfoResponseData.RecVideo recVideo2 = data.model.get(0);
                    if (recVideo2 != null) {
                        RecModel recModel4 = new RecModel(recVideo2, false, this.t);
                        int F3 = F(recModel4.liveId);
                        if (F3 != -1) {
                            if (F3 > this.o) {
                                this.f.remove(F3);
                                BaseListAdapter baseListAdapter5 = this.s;
                                if (baseListAdapter5 != null) {
                                    baseListAdapter5.Z(this.f);
                                    R(F3);
                                }
                                this.f.add(this.r.intValue(), recModel4);
                                BaseListAdapter baseListAdapter6 = this.s;
                                if (baseListAdapter6 != null) {
                                    baseListAdapter6.Z(this.f);
                                    P(this.r.intValue());
                                }
                                if (this.r.intValue() == this.k + 1) {
                                    sjr.g().c("com.taobao.taolive.room.disable_update_scroll_bgimg", null, vx9.e());
                                }
                            }
                        } else if (!I(recModel4.liveId)) {
                            this.f.add(this.r.intValue(), recModel4);
                            BaseListAdapter baseListAdapter7 = this.s;
                            if (baseListAdapter7 != null) {
                                baseListAdapter7.Z(this.f);
                                P(this.r.intValue());
                            }
                            if (this.r.intValue() == this.k + 1) {
                                sjr.g().c("com.taobao.taolive.room.disable_update_scroll_bgimg", null, vx9.e());
                            }
                        }
                        igq.n().d("recommendLives");
                    }
                    this.b += this.c;
                } else {
                    return;
                }
            }
        }
        if (!(vx9.d() == null || j() == null || vx9.d().A == null || j().sideGudieInfo == null)) {
            ((LinkedBlockingDeque) vx9.d().A).add(j().sideGudieInfo);
        }
        sjr g = sjr.g();
        ArrayList<IRecyclerModel> arrayList5 = this.f;
        if (arrayList5 == null || arrayList5.size() == 0) {
            str = "";
        } else {
            str = fkx.i(this.f);
        }
        g.c("com.taobao.taolive.room.update_updown_data", str, vx9.e());
    }

    public final void Z(String str, String str2, Map<String, Object> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571de39d", new Object[]{this, str, str2, map});
        } else if (!this.w ? this.k <= this.o : this.k < this.o) {
            String str3 = z;
            o3s.b(str3, "updateRtRecIfNecessary mIndex: " + this.k + ", mVisitDepth: " + this.o);
            if (v2s.o().A() != null && pvs.L1()) {
                ArrayList<IRecyclerModel> arrayList = this.f;
                if (arrayList != null) {
                    i = arrayList.size();
                }
                cwd A = v2s.o().A();
                A.c("handleUpDownSwitch", " updateRtRecIfNecessary_return" + str + hashCode() + " mRecListLen:" + i + " mIndex:" + this.k + " mVisitDepth:" + this.o);
            }
        } else if (this.f32852a && this.e != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.d >= pvs.G2() * 1000 || !pvs.Q1()) {
                this.c = 1L;
                o3s.b(z, "updateRtRecIfNecessary request start");
                b bVar = new b(null);
                bVar.f32854a = str;
                bVar.b = this.b;
                bVar.c = 1L;
                bVar.d = str2;
                String D = D("realtime", str, str2, map);
                bVar.e = D;
                this.e.b(2, bVar.f32854a, bVar.b, bVar.c, null, bVar.d, D);
                this.j.put(Integer.valueOf(this.k), bVar);
                this.d = currentTimeMillis;
                if (v2s.o().A() != null && pvs.L1()) {
                    cwd A2 = v2s.o().A();
                    A2.c("handleUpDownSwitch", "updateRtRecIfNecessary_curLiveId" + str + hashCode());
                    return;
                }
                return;
            }
            if (v2s.o().A() != null && pvs.L1()) {
                cwd A3 = v2s.o().A();
                A3.c("handleUpDownSwitch", "updateRtRecIfNecessary_timer" + str + hashCode());
            }
            String str4 = z;
            o3s.b(str4, "updateRtRecIfNecessary curTime less than " + pvs.G2());
        }
    }
}
