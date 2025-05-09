package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterLiveItemResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Business2;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Response;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.b0d;
import tb.bia;
import tb.cf8;
import tb.clo;
import tb.cv1;
import tb.deb;
import tb.dt9;
import tb.et9;
import tb.fea;
import tb.fgv;
import tb.fkx;
import tb.ggv;
import tb.gtc;
import tb.hha;
import tb.hmc;
import tb.hnf;
import tb.icd;
import tb.iha;
import tb.iiz;
import tb.jac;
import tb.jga;
import tb.jkd;
import tb.kkr;
import tb.nh4;
import tb.nha;
import tb.p2e;
import tb.pfa;
import tb.qed;
import tb.qga;
import tb.s3c;
import tb.s3d;
import tb.sjr;
import tb.stk;
import tb.t2o;
import tb.th5;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.v7t;
import tb.vx9;
import tb.w1o;
import tb.wda;
import tb.xea;
import tb.xgc;
import tb.yga;
import tb.yj4;
import tb.zha;
import tb.zrl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveGoodDataCenter implements gtc, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public hmc g;
    public String h;
    public List<ItemlistV2ResponseData.ItemListv1> k;
    public xea n;
    public EnterGoodsData o;
    public JSONObject p;
    public JSONObject q;
    public et9 t;
    public int u;

    /* renamed from: a  reason: collision with root package name */
    public final List<jac> f8509a = new CopyOnWriteArrayList();
    public final List<icd> b = new CopyOnWriteArrayList();
    public final List<deb> c = new CopyOnWriteArrayList();
    public final List<s3d> d = new CopyOnWriteArrayList();
    public final List<p2e> e = new CopyOnWriteArrayList();
    public final List<xgc> f = new CopyOnWriteArrayList();
    public final com.taobao.android.live.plugin.atype.flexalocal.good.showcase.a i = new com.taobao.android.live.plugin.atype.flexalocal.good.showcase.a();
    public List<ItemIdentifier> j = new ArrayList();
    public final m l = new m();
    public HashMap<String, th5> m = null;
    public final List<l> r = new ArrayList();
    public final BroadcastReceiver s = new BroadcastReceiver() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.LiveGoodDataCenter.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/LiveGoodDataCenter$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && intent.getExtras() != null) {
                if (TextUtils.equals(intent.getExtras().getString("from"), "buyCreateOrder")) {
                    LiveGoodDataCenter.a(LiveGoodDataCenter.this).b();
                }
                hha.b("LiveGoodDataCenter", "onReceive | data=" + intent.getExtras());
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f8511a;

        public a(JSONObject jSONObject) {
            this.f8511a = jSONObject;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", -1);
            LiveGoodDataCenter.p(LiveGoodDataCenter.this, this.f8511a);
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", -1);
            onError(i, netResponse, 0);
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            List<ItemlistV2ResponseData.ItemListv1> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            ItemlistV2ResponseData data = ((ItemlistV2Response) netBaseOutDo).getData();
            if (data == null || (list = data.itemListv1) == null || list.isEmpty()) {
                LiveGoodDataCenter.p(LiveGoodDataCenter.this, this.f8511a);
                return;
            }
            nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", 1);
            ItemlistV2ResponseData.ItemListv1 itemListv1 = data.itemListv1.get(0);
            if (itemListv1 == null || itemListv1.liveItemDO == null) {
                LiveGoodDataCenter.p(LiveGoodDataCenter.this, this.f8511a);
                return;
            }
            EnterGoodsData enterGoodsData = new EnterGoodsData();
            enterGoodsData.itemHoldType = bia.UNDER_TAKE_INSIDE_DETAIL;
            ArrayList arrayList = new ArrayList();
            arrayList.add(itemListv1.liveItemDO);
            enterGoodsData.curItemList = arrayList;
            enterGoodsData.holdItemIds = String.valueOf(itemListv1.liveItemDO.itemId);
            for (s3d s3dVar : LiveGoodDataCenter.o(LiveGoodDataCenter.this)) {
                s3dVar.openInsideDetail(enterGoodsData);
            }
            zha.n("success", this.f8511a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GoodMsgNew f8512a;
        public final /* synthetic */ boolean b;

        public b(GoodMsgNew goodMsgNew, boolean z) {
            this.f8512a = goodMsgNew;
            this.b = z;
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, 0);
            }
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            if (netResponse != null) {
                hha.c("LiveGoodDataCenter", "onMessageReceived | showGoodsItemCard from pm data,query data error. msg=" + netResponse.getRetMsg());
            }
            LiveGoodDataCenter.c(LiveGoodDataCenter.this, this.f8512a, this.b, true);
            iha.F(this.f8512a.liveItemDO, Boolean.FALSE, "回调", Boolean.valueOf(this.b));
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            List<LiveItem> list;
            LiveItem liveItem;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            EnterGoodsData data = ((EnterLiveItemResponse) netBaseOutDo).getData();
            if (!(data == null || (list = data.curItemList) == null || list.isEmpty() || (liveItem = data.curItemList.get(0)) == null)) {
                hha.c("LiveGoodDataCenter", "onMessageReceived | showGoodsItemCard from query data");
                pfa.Q(this.f8512a, liveItem);
                this.f8512a.liveItemDO = liveItem;
            }
            hha.c("LiveGoodDataCenter", "onSuccess | showGoodsItemCard from pm data");
            LiveGoodDataCenter.c(LiveGoodDataCenter.this, this.f8512a, this.b, false);
            iha.F(this.f8512a.liveItemDO, Boolean.TRUE, "回调", Boolean.valueOf(this.b));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/LiveGoodDataCenter$2");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 10091 || i == 10092 || i == 10096 || i == 10094 || i == 1070 || i == 10097 || i == 1071 || i == 10098 || i == 10095 || LiveGoodDataCenter.b(LiveGoodDataCenter.this).a(i)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
            } else if (jkdVar instanceof hnf) {
                LiveGoodDataCenter.h(LiveGoodDataCenter.this).n.f15709a = ((hnf) jkdVar).f20761a;
                hha.c("LiveGoodDataCenter", "first get state isFollowed" + LiveGoodDataCenter.h(LiveGoodDataCenter.this).n.f15709a);
            }
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements et9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.et9
        public void onFollowChange(dt9 dt9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb93c2e5", new Object[]{this, dt9Var});
            } else if (dt9Var != null && !TextUtils.isEmpty(dt9Var.f18052a) && TextUtils.equals(dt9Var.f18052a, LiveGoodDataCenter.h(LiveGoodDataCenter.this).n.b())) {
                LiveGoodDataCenter.h(LiveGoodDataCenter.this).n.f15709a = dt9Var.b;
                hha.b("LiveGoodDataCenter", "getFollowStateAndRegisterChanged isFollowed" + dt9Var.b);
                sjr.g().c("com.taobao.taolive.live.state.refresh.current.tab.inner", null, LiveGoodDataCenter.h(LiveGoodDataCenter.this).F());
                sjr.g().c("com.taobao.taolive.live.search.refresh.list.inner", null, LiveGoodDataCenter.h(LiveGoodDataCenter.this).F());
                LiveGoodDataCenter.this.y();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", -1);
            hha.c("LiveGoodDataCenter", "initPcgData | onError");
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", -1);
            hha.c("LiveGoodDataCenter", "initPcgData | onSystemError");
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            ItemlistV2ResponseData data = ((ItemlistV2Response) netBaseOutDo).getData();
            if (data == null) {
                nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", -1);
                return;
            }
            List<ItemlistV2ResponseData.ItemListv1> list = data.itemListv1;
            if (list == null || list.isEmpty()) {
                nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", -1);
                hha.b("LiveGoodDataCenter", "initPcgData | onSuccess, data is empty.");
            } else {
                hha.c("LiveGoodDataCenter", "initPcgData | onSuccess, size=" + data.itemListv1.size());
                LiveGoodDataCenter.i(LiveGoodDataCenter.this, data.itemListv1);
                nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", 1);
            }
            if (LiveGoodDataCenter.j(LiveGoodDataCenter.this) == null || LiveGoodDataCenter.j(LiveGoodDataCenter.this).isEmpty()) {
                ItemSortInfo itemSortInfo = data.recommendItemSortInfo;
                if (itemSortInfo != null) {
                    LiveGoodDataCenter.k(LiveGoodDataCenter.this, itemSortInfo.sortList);
                }
                if (LiveGoodDataCenter.j(LiveGoodDataCenter.this) == null || LiveGoodDataCenter.j(LiveGoodDataCenter.this).isEmpty()) {
                    hha.b("LiveGoodDataCenter", "initPcgData | rec id is empty.");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements ISmartLandingProxy.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f8518a;

        public h(xea xeaVar) {
            this.f8518a = xeaVar;
        }

        @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
        public boolean onTaskActionListener(String str, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fd5561e5", new Object[]{this, str, str2, jSONObject, jSONArray, jSONObject2})).booleanValue();
            }
            String str3 = null;
            String string = jSONObject == null ? null : jSONObject.getString(yj4.PARAM_ITEM_HOLD_TYPE);
            String string2 = jSONObject == null ? null : jSONObject.getString(yj4.PARAM_ITEM_IDS);
            if (jSONObject != null) {
                str3 = jSONObject.getString(yj4.PARAM_SJSD_ITEM_ID);
            }
            hha.b("LiveGoodDataCenter", "initEnterLiveData | onTaskActionListener popId " + str2 + " actionData " + jSONObject);
            iha.K(str2, string, string2, str3);
            LiveGoodDataCenter.l(LiveGoodDataCenter.this, this.f8518a, str, str2, false, string, string2, str3);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements deb<EnterGoodsData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8519a;
        public final /* synthetic */ String b;

        public i(String str, String str2) {
            this.f8519a = str;
            this.b = str2;
        }

        /* renamed from: a */
        public void onResult(EnterGoodsData enterGoodsData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94422f21", new Object[]{this, enterGoodsData});
            } else {
                LiveGoodDataCenter.m(LiveGoodDataCenter.this, enterGoodsData, this.f8519a, this.b);
            }
        }

        @Override // tb.deb
        public void onError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
            } else {
                LiveGoodDataCenter.n(LiveGoodDataCenter.this, str, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements fgv.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8520a;
        public final /* synthetic */ String b;

        public j(String str, String str2) {
            this.f8520a = str;
            this.b = str2;
        }

        @Override // tb.fgv.e
        public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.pop.item.card.list", 0);
            nha.o("mtop.tblive.live.pop.item.card.list", -1);
            if (netResponse != null) {
                LiveGoodDataCenter.n(LiveGoodDataCenter.this, netResponse.getRetCode(), netResponse.getRetMsg());
            }
        }

        @Override // tb.fgv.e
        public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.pop.item.card.list", 0);
            nha.o("mtop.tblive.live.pop.item.card.list", -1);
            if (netResponse != null) {
                LiveGoodDataCenter.n(LiveGoodDataCenter.this, netResponse.getRetCode(), netResponse.getRetMsg());
            }
        }

        @Override // tb.fgv.e
        public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
                return;
            }
            nha.o("mtop.tblive.live.pop.item.card.list", 0);
            if (unImportantLiveInfoResponseData == null || (str = unImportantLiveInfoResponseData.itemCardListData) == null) {
                nha.o("mtop.tblive.live.pop.item.card.list", -1);
                return;
            }
            EnterGoodsData enterGoodsData = (EnterGoodsData) zrl.b(str, EnterGoodsData.class);
            if (enterGoodsData != null) {
                nha.o("mtop.tblive.live.pop.item.card.list", 1);
                LiveGoodDataCenter.m(LiveGoodDataCenter.this, enterGoodsData, this.f8520a, this.b);
                return;
            }
            nha.o("mtop.tblive.live.pop.item.card.list", -1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class l {

        /* renamed from: a  reason: collision with root package name */
        public final int f8522a;
        public final JSONObject b;
        public String c;
        public final String d;

        static {
            t2o.a(295699073);
        }

        public l(int i, JSONObject jSONObject) {
            this.f8522a = i - 1;
            this.b = jSONObject;
            if (jSONObject != null) {
                this.d = jSONObject.getString("acceleratorCode");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class m implements jac, icd, p2e, xgc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295699074);
            t2o.a(295699048);
            t2o.a(295699050);
            t2o.a(295699054);
            t2o.a(295699049);
        }

        public m() {
        }

        @Override // tb.jac
        public void C(long j, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12f16b64", new Object[]{this, new Long(j), new Integer(i)});
                return;
            }
            iha.z(j, i);
            for (jac jacVar : LiveGoodDataCenter.d(LiveGoodDataCenter.this)) {
                jacVar.C(j, i);
            }
        }

        @Override // tb.icd
        public void E(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6386aeee", new Object[]{this, goodMsgNew});
                return;
            }
            for (icd icdVar : LiveGoodDataCenter.e(LiveGoodDataCenter.this)) {
                icdVar.E(goodMsgNew);
            }
        }

        @Override // tb.xgc
        public void a(LiveItem liveItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d66a26de", new Object[]{this, liveItem});
                return;
            }
            for (xgc xgcVar : LiveGoodDataCenter.g(LiveGoodDataCenter.this)) {
                xgcVar.a(liveItem);
            }
        }

        @Override // tb.p2e
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6c0f1b6", new Object[]{this});
                return;
            }
            for (p2e p2eVar : LiveGoodDataCenter.f(LiveGoodDataCenter.this)) {
                p2eVar.b();
            }
        }

        @Override // tb.xgc
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("431c2ec8", new Object[]{this});
                return;
            }
            for (xgc xgcVar : LiveGoodDataCenter.g(LiveGoodDataCenter.this)) {
                xgcVar.c();
            }
        }

        @Override // tb.p2e
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8def3d93", new Object[]{this, str});
                return;
            }
            for (p2e p2eVar : LiveGoodDataCenter.f(LiveGoodDataCenter.this)) {
                p2eVar.d(str);
            }
        }

        @Override // tb.jac
        public void k(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("314945a5", new Object[]{this, goodMsgNew});
                return;
            }
            iha.B(goodMsgNew);
            for (jac jacVar : LiveGoodDataCenter.d(LiveGoodDataCenter.this)) {
                jacVar.k(goodMsgNew);
            }
        }

        @Override // tb.jac
        public void m(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f22e87a4", new Object[]{this, jSONObject});
                return;
            }
            iha.u(jSONObject);
            for (jac jacVar : LiveGoodDataCenter.d(LiveGoodDataCenter.this)) {
                jacVar.m(jSONObject);
            }
        }

        @Override // tb.jac
        public void n(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5433eb18", new Object[]{this, goodMsgNew});
                return;
            }
            iha.A(goodMsgNew);
            for (jac jacVar : LiveGoodDataCenter.d(LiveGoodDataCenter.this)) {
                jacVar.n(goodMsgNew);
            }
        }

        @Override // tb.jac
        public void q(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b183b31f", new Object[]{this, goodMsgNew});
                return;
            }
            iha.y(goodMsgNew);
            for (jac jacVar : LiveGoodDataCenter.d(LiveGoodDataCenter.this)) {
                jacVar.q(goodMsgNew);
            }
        }

        @Override // tb.jac
        public void s(GoodMsgNew goodMsgNew, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b857be9e", new Object[]{this, goodMsgNew, new Boolean(z)});
                return;
            }
            iha.w(goodMsgNew);
            for (jac jacVar : LiveGoodDataCenter.d(LiveGoodDataCenter.this)) {
                jacVar.s(goodMsgNew, z);
            }
        }

        @Override // tb.jac
        public void u(GoodMsgNew goodMsgNew, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b640d63", new Object[]{this, goodMsgNew, new Boolean(z)});
                return;
            }
            iha.v(goodMsgNew);
            for (jac jacVar : LiveGoodDataCenter.d(LiveGoodDataCenter.this)) {
                jacVar.u(goodMsgNew, z);
            }
        }

        @Override // tb.jac
        public void x(GoodMsgNew goodMsgNew) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b784d2cb", new Object[]{this, goodMsgNew});
                return;
            }
            iha.x(goodMsgNew);
            for (jac jacVar : LiveGoodDataCenter.d(LiveGoodDataCenter.this)) {
                jacVar.x(goodMsgNew);
            }
        }

        @Override // tb.jac
        public void y(LiveItem liveItem, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cbd22f1", new Object[]{this, liveItem, str, str2});
                return;
            }
            for (jac jacVar : LiveGoodDataCenter.d(LiveGoodDataCenter.this)) {
                jacVar.y(liveItem, str, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295699075);
        }

        public static void a(String str, LiveItem liveItem, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d5fe287", new Object[]{str, liveItem, new Integer(i)});
            } else if (!TextUtils.isEmpty(str) && liveItem != null && d(str, liveItem.liveId)) {
                nha.m(String.valueOf(i));
            }
        }

        public static void b(String str, GoodMsgNew goodMsgNew, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80f7ca56", new Object[]{str, goodMsgNew, new Integer(i)});
            } else if (!TextUtils.isEmpty(str) && goodMsgNew != null) {
                a(str, goodMsgNew.liveItemDO, i);
            }
        }

        public static void c(String str, String str2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5596538", new Object[]{str, str2, new Integer(i)});
            } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && d(str, str2)) {
                nha.m(String.valueOf(i));
            }
        }

        public static boolean d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50acc468", new Object[]{str, str2})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return false;
            }
            return !TextUtils.equals(str, str2);
        }
    }

    static {
        t2o.a(295699060);
        t2o.a(806356059);
        t2o.a(806355016);
    }

    public static /* synthetic */ m a(LiveGoodDataCenter liveGoodDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("118769db", new Object[]{liveGoodDataCenter});
        }
        return liveGoodDataCenter.l;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.showcase.a b(LiveGoodDataCenter liveGoodDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.a) ipChange.ipc$dispatch("118ce039", new Object[]{liveGoodDataCenter});
        }
        return liveGoodDataCenter.i;
    }

    public static /* synthetic */ void c(LiveGoodDataCenter liveGoodDataCenter, GoodMsgNew goodMsgNew, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ffacfd", new Object[]{liveGoodDataCenter, goodMsgNew, new Boolean(z), new Boolean(z2)});
        } else {
            liveGoodDataCenter.x(goodMsgNew, z, z2);
        }
    }

    public static /* synthetic */ List d(LiveGoodDataCenter liveGoodDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6be41cd5", new Object[]{liveGoodDataCenter});
        }
        return liveGoodDataCenter.f8509a;
    }

    public static /* synthetic */ List e(LiveGoodDataCenter liveGoodDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("954b95b4", new Object[]{liveGoodDataCenter});
        }
        return liveGoodDataCenter.b;
    }

    public static /* synthetic */ List f(LiveGoodDataCenter liveGoodDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("beb30e93", new Object[]{liveGoodDataCenter});
        }
        return liveGoodDataCenter.e;
    }

    public static /* synthetic */ List g(LiveGoodDataCenter liveGoodDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e81a8772", new Object[]{liveGoodDataCenter});
        }
        return liveGoodDataCenter.f;
    }

    public static /* synthetic */ xea h(LiveGoodDataCenter liveGoodDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("3d5189f6", new Object[]{liveGoodDataCenter});
        }
        return liveGoodDataCenter.n;
    }

    public static /* synthetic */ List i(LiveGoodDataCenter liveGoodDataCenter, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4f22ac0f", new Object[]{liveGoodDataCenter, list});
        }
        liveGoodDataCenter.k = list;
        return list;
    }

    public static /* synthetic */ List j(LiveGoodDataCenter liveGoodDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("386dac1", new Object[]{liveGoodDataCenter});
        }
        return liveGoodDataCenter.j;
    }

    public static /* synthetic */ List k(LiveGoodDataCenter liveGoodDataCenter, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae9286ee", new Object[]{liveGoodDataCenter, list});
        }
        liveGoodDataCenter.j = list;
        return list;
    }

    public static /* synthetic */ void l(LiveGoodDataCenter liveGoodDataCenter, xea xeaVar, String str, String str2, boolean z, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd5e853", new Object[]{liveGoodDataCenter, xeaVar, str, str2, new Boolean(z), str3, str4, str5});
        } else {
            liveGoodDataCenter.L(xeaVar, str, str2, z, str3, str4, str5);
        }
    }

    public static /* synthetic */ void m(LiveGoodDataCenter liveGoodDataCenter, EnterGoodsData enterGoodsData, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff803da", new Object[]{liveGoodDataCenter, enterGoodsData, str, str2});
        } else {
            liveGoodDataCenter.O(enterGoodsData, str, str2);
        }
    }

    public static /* synthetic */ void n(LiveGoodDataCenter liveGoodDataCenter, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b265665d", new Object[]{liveGoodDataCenter, str, str2});
        } else {
            liveGoodDataCenter.N(str, str2);
        }
    }

    public static /* synthetic */ List o(LiveGoodDataCenter liveGoodDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a924be3d", new Object[]{liveGoodDataCenter});
        }
        return liveGoodDataCenter.d;
    }

    public static /* synthetic */ void p(LiveGoodDataCenter liveGoodDataCenter, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7826f485", new Object[]{liveGoodDataCenter, jSONObject});
        } else {
            liveGoodDataCenter.J(jSONObject);
        }
    }

    public List<l> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ecf39361", new Object[]{this});
        }
        return this.r;
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d62dea8", new Object[]{this});
        }
        List<ItemIdentifier> list = this.j;
        if (list == null || list.isEmpty()) {
            return "";
        }
        return this.j.get(0).itemId;
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2175020b", new Object[]{this});
            return;
        }
        v2s.o().k().d(pfa.c(this.n.H(), null), new e());
        if (this.t != null) {
            v2s.o().k().g(this.t);
        }
        this.t = new f();
        v2s.o().k().b(this.t);
    }

    public JSONObject D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d37582b9", new Object[]{this});
        }
        JSONObject jSONObject = this.p;
        if (jSONObject == null) {
            return this.q;
        }
        return jSONObject;
    }

    public List<ItemIdentifier> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("15ff195c", new Object[]{this});
        }
        return this.j;
    }

    public List<ItemlistV2ResponseData.ItemListv1> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("66221f50", new Object[]{this});
        }
        return this.k;
    }

    public void G(xea xeaVar, hmc hmcVar, HashMap<String, th5> hashMap, deb<EnterGoodsData> debVar, s3d<EnterGoodsData> s3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d3ca772", new Object[]{this, xeaVar, hmcVar, hashMap, debVar, s3dVar});
            return;
        }
        w();
        this.n = xeaVar;
        if (hmcVar != null) {
            this.g = hmcVar;
            hmcVar.l(this, new d());
        }
        this.i.b(this.n);
        sjr.g().a(this);
        this.h = xeaVar.u();
        this.u = 0;
        VideoInfo videoInfo = xeaVar.n.b;
        if (videoInfo != null) {
            this.u = videoInfo.curItemNum;
        }
        fea k2 = kkr.i().k(xeaVar, this.h);
        if (!xeaVar.Q()) {
            if (!(k2 == null || k2.f() == null)) {
                ArrayList arrayList = new ArrayList();
                this.j = arrayList;
                arrayList.addAll(k2.f());
            }
            I(xeaVar, hashMap);
        }
        if (!(k2 == null || k2.b() == null)) {
            this.q = k2.b();
        }
        if (s3dVar != null) {
            ((CopyOnWriteArrayList) this.d).add(s3dVar);
        }
        H(xeaVar, debVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("cartRefreshData");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.n.i()).registerReceiver(this.s, intentFilter);
        C();
    }

    public final void H(xea xeaVar, deb<EnterGoodsData> debVar) {
        ISmartLandingProxy.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff79a9c3", new Object[]{this, xeaVar, debVar});
            return;
        }
        q(debVar);
        cv1 f2 = vx9.f(xeaVar.q());
        if (f2 == null || (bVar = f2.u) == null) {
            L(xeaVar, null, null, true, null, null, null);
        } else {
            bVar.j(true, "goods", new h(xeaVar));
        }
    }

    public final void J(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6314640f", new Object[]{this, jSONObject});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ((s3d) it.next()).openGoodsPackage();
        }
        zha.n("fail", jSONObject);
    }

    public final void K(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49f3ae75", new Object[]{this, enterGoodsData});
        } else if (enterGoodsData != null) {
            Q(enterGoodsData.expansionRedPacketList);
        }
    }

    public final void L(xea xeaVar, String str, String str2, boolean z, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec43890d", new Object[]{this, xeaVar, str, str2, new Boolean(z), str3, str4, str5});
        } else if (ggv.a()) {
            M(str, str2);
        } else {
            new cf8(new i(str, str2)).K(xeaVar, z, str3, str4, str5);
        }
    }

    public final void M(String str, String str2) {
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1425e615", new Object[]{this, str, str2});
            return;
        }
        xea xeaVar = this.n;
        if (xeaVar != null) {
            ux9Var = xeaVar.q();
        } else {
            ux9Var = null;
        }
        if (ux9Var instanceof clo) {
            clo cloVar = (clo) ux9Var;
            if (cloVar.t0() != null) {
                cloVar.t0().i(new j(str, str2));
            }
        }
    }

    public final void N(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc6e9de", new Object[]{this, str, str2});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((deb) it.next()).onError(str, str2);
        }
    }

    public final void O(EnterGoodsData enterGoodsData, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f9fb1b", new Object[]{this, enterGoodsData, str, str2});
            return;
        }
        this.o = enterGoodsData;
        enterGoodsData.behavior = str;
        enterGoodsData.popId = str2;
        hha.c("LiveGoodDataCenter", "initEnterLiveData | transferInfo=" + this.p);
        JSONObject jSONObject = this.o.itemCardTransferInfo;
        this.p = jSONObject;
        if (jSONObject == null) {
            this.p = new JSONObject();
        }
        JSONObject jSONObject2 = this.q;
        if (jSONObject2 != null) {
            this.p.putAll(jSONObject2);
        }
        if (!wda.g()) {
            this.p.remove("customRulesSortDTOList");
        }
        hha.c("LiveGoodDataCenter", "initEnterLiveData | new transferInfo=" + this.p);
        K(enterGoodsData);
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((deb) it.next()).onResult(this.o);
        }
    }

    public void Q(JSONArray jSONArray) {
        xea xeaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c32ea11", new Object[]{this, jSONArray});
        } else if (wda.c() && (xeaVar = this.n) != null && !xeaVar.Q()) {
            ((ArrayList) this.r).clear();
            if (jSONArray != null) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) next;
                        ((ArrayList) this.r).add(new l(jSONObject.getIntValue("index"), jSONObject));
                    }
                }
            }
        }
    }

    public void R(List<ItemIdentifier> list) {
        ItemIdentifier itemIdentifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8c8fda", new Object[]{this, list});
            return;
        }
        xea xeaVar = this.n;
        if (xeaVar != null && !xeaVar.Q() && list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayList) this.r).iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                lVar.c = "";
                int size = list.size();
                int i2 = lVar.f8522a;
                if (size > i2 && i2 >= 0 && (itemIdentifier = list.get(i2)) != null) {
                    lVar.c = itemIdentifier.itemId;
                    sb.append("   ");
                    sb.append(lVar.f8522a);
                    sb.append("/");
                    sb.append(itemIdentifier.itemId);
                    sb.append("/");
                    sb.append(itemIdentifier.goodsIndex);
                }
            }
            hha.b("LiveGoodDataCenter", "refreshExpandAward | info=" + ((Object) sb));
        }
    }

    public void S(deb<EnterGoodsData> debVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564583e8", new Object[]{this, debVar});
        } else if (debVar != null) {
            ((CopyOnWriteArrayList) this.c).remove(debVar);
        }
    }

    public void T(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98c56d0", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("acceleratorCode");
            if (!TextUtils.isEmpty(string)) {
                Iterator it = ((ArrayList) this.r).iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(((l) it.next()).d, string)) {
                        it.remove();
                        return;
                    }
                }
            }
        }
    }

    public void U(xgc xgcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("868d85c5", new Object[]{this, xgcVar});
        } else if (xgcVar != null) {
            ((CopyOnWriteArrayList) this.f).remove(xgcVar);
        }
    }

    public void V(jac jacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0edfb6", new Object[]{this, jacVar});
        } else if (jacVar != null) {
            ((CopyOnWriteArrayList) this.f8509a).remove(jacVar);
        }
    }

    public void W(icd icdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba8015", new Object[]{this, icdVar});
        } else if (icdVar != null) {
            ((CopyOnWriteArrayList) this.b).remove(icdVar);
        }
    }

    public void X(p2e p2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d749e81f", new Object[]{this, p2eVar});
        } else if (p2eVar != null) {
            ((CopyOnWriteArrayList) this.e).remove(p2eVar);
        }
    }

    public void Z(List<ItemIdentifier> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43af5988", new Object[]{this, list});
        } else if (list == null) {
            this.j.clear();
        } else {
            this.j = list;
        }
    }

    public void b0(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a26de", new Object[]{this, liveItem});
        } else {
            this.l.a(liveItem);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "getUniqueIdentification";
    }

    public int d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42ad5537", new Object[]{this})).intValue();
        }
        return this.u;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.goods.update.item", "com.taobao.taolive.room.addcart", uyg.OPEN_INSIDE_DETAIL_EVENT};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        xea xeaVar = this.n;
        if (xeaVar != null) {
            return xeaVar.F();
        }
        return null;
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        String str2 = null;
        if ("com.taobao.taolive.goods.update.item".equals(str)) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String str3 = (String) map.get("itemId");
                hha.c("LiveGoodDataCenter", "onEvent | update item, itemId=" + str3 + "   from=" + ((String) map.get("from")));
                if (TextUtils.equals(this.h, (String) map.get("liveId"))) {
                    c0(str3, null, null);
                }
            }
        } else if ("com.taobao.taolive.room.addcart".equals(str)) {
            if (obj instanceof String) {
                str2 = (String) obj;
            }
            if (obj instanceof Long) {
                str2 = Long.toString(((Long) obj).longValue());
            }
            if (obj instanceof Integer) {
                str2 = Integer.toString(((Integer) obj).intValue());
            }
            hha.b("LiveGoodDataCenter", "onReceive | addCart, itemId=" + str2);
            this.l.d(str2);
        } else if (uyg.OPEN_INSIDE_DETAIL_EVENT.equals(str) && (obj instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            String str4 = (String) jSONObject.get("itemId");
            if (TextUtils.isEmpty(str4)) {
                v7t.d("openInsideDetailPage", "itemId is null");
                zha.n("fail", jSONObject);
                return;
            }
            Y(str4, jSONObject);
        }
    }

    public void q(deb<EnterGoodsData> debVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2296dbc5", new Object[]{this, debVar});
        } else if (debVar != null) {
            EnterGoodsData enterGoodsData = this.o;
            if (enterGoodsData != null) {
                debVar.onResult(enterGoodsData);
            } else {
                ((CopyOnWriteArrayList) this.c).add(debVar);
            }
        }
    }

    public void r(xgc xgcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67787248", new Object[]{this, xgcVar});
        } else if (xgcVar != null) {
            ((CopyOnWriteArrayList) this.f).add(xgcVar);
        }
    }

    public void s(jac jacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcae38b9", new Object[]{this, jacVar});
        } else if (jacVar != null && !((CopyOnWriteArrayList) this.f8509a).contains(jacVar)) {
            ((CopyOnWriteArrayList) this.f8509a).add(jacVar);
        }
    }

    public void t(s3d<EnterGoodsData> s3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc2aa13", new Object[]{this, s3dVar});
        } else if (s3dVar != null && !((CopyOnWriteArrayList) this.d).contains(s3dVar)) {
            ((CopyOnWriteArrayList) this.d).add(s3dVar);
        }
    }

    public void u(icd icdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6cb158", new Object[]{this, icdVar});
        } else if (icdVar != null && !((CopyOnWriteArrayList) this.b).contains(icdVar)) {
            ((CopyOnWriteArrayList) this.b).add(icdVar);
        }
    }

    public void v(p2e p2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31242662", new Object[]{this, p2eVar});
        } else if (p2eVar != null && !((CopyOnWriteArrayList) this.e).contains(p2eVar)) {
            ((CopyOnWriteArrayList) this.e).add(p2eVar);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        hha.c("LiveGoodDataCenter", "destroy");
        hmc hmcVar = this.g;
        if (hmcVar != null) {
            hmcVar.a(this);
        }
        sjr.g().b(this);
        List<ItemIdentifier> list = this.j;
        if (list != null) {
            list.clear();
        }
        this.k = null;
        this.o = null;
        this.p = null;
        this.q = null;
        ((ArrayList) this.r).clear();
        ((CopyOnWriteArrayList) this.f8509a).clear();
        ((CopyOnWriteArrayList) this.b).clear();
        ((CopyOnWriteArrayList) this.e).clear();
        ((CopyOnWriteArrayList) this.c).clear();
        ((CopyOnWriteArrayList) this.d).clear();
        ((CopyOnWriteArrayList) this.f).clear();
        xea xeaVar = this.n;
        if (xeaVar != null) {
            LocalBroadcastManager.getInstance(xeaVar.i()).unregisterReceiver(this.s);
        }
        if (this.t != null) {
            v2s.o().k().g(this.t);
        }
    }

    public final void x(GoodMsgNew goodMsgNew, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108674da", new Object[]{this, goodMsgNew, new Boolean(z), new Boolean(z2)});
        } else if (z) {
            this.l.u(goodMsgNew, z2);
        } else {
            this.l.s(goodMsgNew, z2);
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431c2ec8", new Object[]{this});
        } else {
            this.l.c();
        }
    }

    public EnterGoodsData z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnterGoodsData) ipChange.ipc$dispatch("1b8611cf", new Object[]{this});
        }
        return this.o;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qed f8513a;
        public final /* synthetic */ String b;

        public c(LiveGoodDataCenter liveGoodDataCenter, qed qedVar, String str) {
            this.f8513a = qedVar;
            this.b = str;
        }

        public void a(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a341178", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                ((w1o) this.f8513a).z(this.b, i, netResponse, obj);
            }
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                a(i, netResponse, obj);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                a(i, netResponse, obj);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            List<ItemlistV2ResponseData.ItemListv1> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            ItemlistV2ResponseData data = ((ItemlistV2Response) netBaseOutDo).getData();
            if (!(data == null || (list = data.itemListv1) == null || list.isEmpty())) {
                nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", 1);
                ItemlistV2ResponseData.ItemListv1 itemListv1 = data.itemListv1.get(0);
                if (itemListv1 != null) {
                    ((w1o) this.f8513a).A(itemListv1.liveItemDO);
                    return;
                }
            }
            ((w1o) this.f8513a).A(null);
            hha.b("LiveGoodDataCenter", "queryItemData | onSuccess | liveItem is null, response=" + data);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8521a;
        public final /* synthetic */ String b;

        public k(String str, String str2) {
            this.f8521a = str;
            this.b = str2;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", -1);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", -1);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            List<ItemlistV2ResponseData.ItemListv1> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            ItemlistV2ResponseData data = ((ItemlistV2Response) netBaseOutDo).getData();
            if (data != null && (list = data.itemListv1) != null && !list.isEmpty()) {
                nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", 1);
                ItemlistV2ResponseData.ItemListv1 itemListv1 = data.itemListv1.get(0);
                if (itemListv1 != null) {
                    sjr.g().c("com.taobao.taolive.room.goodlist.all.refresh.item.inner", itemListv1.liveItemDO, xea.E(LiveGoodDataCenter.h(LiveGoodDataCenter.this)));
                    if (nh4.W() && this.f8521a != null && this.b != null) {
                        LiveGoodDataCenter.a(LiveGoodDataCenter.this).y(itemListv1.liveItemDO, this.f8521a, this.b);
                    }
                }
            }
        }
    }

    public final void I(xea xeaVar, HashMap<String, th5> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25174fa", new Object[]{this, xeaVar, hashMap});
            return;
        }
        this.m = hashMap;
        if (xeaVar == null || !xeaVar.c() || !xeaVar.l.i) {
            hha.b("LiveGoodDataCenter", "initPcgData | disabled.");
            return;
        }
        nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", 0);
        new ItemlistV2Business2(new g()).O(null, null, ItemCategory.constructDefaultCategory(), xeaVar, "");
    }

    public void P(String str, String str2, qed qedVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de048167", new Object[]{this, str, str2, qedVar});
        } else if (TextUtils.isEmpty(str)) {
            hha.b("LiveGoodDataCenter", "queryItemData | itemId is null");
        } else if (qedVar == null) {
            hha.b("LiveGoodDataCenter", "queryItemData | callback is null");
        } else {
            nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", 0);
            ItemlistV2Business2 itemlistV2Business2 = new ItemlistV2Business2(new c(this, qedVar, str));
            ItemIdentifier itemIdentifier = new ItemIdentifier(0, str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(itemIdentifier);
            itemlistV2Business2.O(null, arrayList, null, this.n, str2);
        }
    }

    public void Y(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b1b659", new Object[]{this, str, jSONObject});
            return;
        }
        nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", 0);
        ItemlistV2Business2 itemlistV2Business2 = new ItemlistV2Business2(new a(jSONObject));
        ItemIdentifier itemIdentifier = new ItemIdentifier(0, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(itemIdentifier);
        itemlistV2Business2.O(null, arrayList, null, this.n, "");
    }

    public void a0(GoodMsgNew goodMsgNew, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcdfac9", new Object[]{this, goodMsgNew, new Boolean(z)});
        } else if (goodMsgNew == null || goodMsgNew.liveItemDO == null) {
            hha.c("LiveGoodDataCenter", "onMessageReceived | GoodMsgNew or liveItemDO is null");
        } else if (!goodMsgNew.callbackServer || !yga.J()) {
            hha.c("LiveGoodDataCenter", "onMessageReceived | showGoodsItemCard from pm data");
            x(goodMsgNew, z, true);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.valueOf(goodMsgNew.liveItemDO.itemId));
            new qga(new b(goodMsgNew, z)).K(this.n, JSON.toJSONString(arrayList), jga.h(goodMsgNew.liveItemDO));
        }
    }

    public void c0(String str, String str2, String str3) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14314313", new Object[]{this, str, str2, str3});
        } else if (this.m != null && !TextUtils.isEmpty(str)) {
            th5 th5Var = this.m.get(str);
            nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", 0);
            ItemlistV2Business2 itemlistV2Business2 = new ItemlistV2Business2(new k(str2, str3));
            if (th5Var != null) {
                i2 = th5Var.c;
            }
            ItemIdentifier itemIdentifier = new ItemIdentifier(i2, str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(itemIdentifier);
            itemlistV2Business2.O(null, arrayList, null, this.n, "");
        }
    }

    @Override // tb.gtc
    public void onMessageReceived(int i2, Object obj) {
        GoodsMsgNewForAddProduct goodsMsgNewForAddProduct;
        List<LiveItem> list;
        LiveItem liveItem;
        LiveItem liveItem2;
        GoodMsgNew goodMsgNew;
        LiveItem liveItem3;
        JSONObject d2;
        JSONObject d3;
        GoodMsgNew goodMsgNew2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i2), obj});
        } else if (i2 == 10092 || i2 == 10091) {
            if ((obj instanceof TLiveMsg) && (goodsMsgNewForAddProduct = (GoodsMsgNewForAddProduct) JSON.parseObject(new String(((TLiveMsg) obj).data), GoodsMsgNewForAddProduct.class)) != null && (list = goodsMsgNewForAddProduct.goodsList) != null && !list.isEmpty()) {
                this.u = goodsMsgNewForAddProduct.totalCount;
                LiveItem liveItem4 = goodsMsgNewForAddProduct.goodsList.get(0);
                goodsMsgNewForAddProduct.liveItemDO = liveItem4;
                liveItem4.goodsIndex = goodsMsgNewForAddProduct.goodsIndex;
                n.a(this.h, liveItem4, i2);
                hha.c("LiveGoodDataCenter", "onMessageReceived | onMessageProductList, index=" + goodsMsgNewForAddProduct.liveItemDO.goodsIndex);
                a0(goodsMsgNewForAddProduct, true);
            }
        } else if (i2 == 10096) {
            if ((obj instanceof String) && (goodMsgNew2 = (GoodMsgNew) fkx.f((String) obj, GoodMsgNew.class)) != null && goodMsgNew2.liveItemDO != null) {
                n.b(this.h, goodMsgNew2, i2);
                hha.c("LiveGoodDataCenter", "onMessageReceived | onMessageExplanation, index=" + goodMsgNew2.liveItemDO.goodsIndex);
                a0(goodMsgNew2, false);
            }
        } else if (i2 == 10094) {
            if ((obj instanceof String) && (d3 = fkx.d((String) obj)) != null) {
                ItemSortInfo itemSortInfo = (ItemSortInfo) fkx.f(d3.getString("itemSortInfo"), ItemSortInfo.class);
                LiveItem liveItem5 = (LiveItem) fkx.f(d3.getString("liveItemDO"), LiveItem.class);
                if (liveItem5 != null && itemSortInfo != null) {
                    GoodMsgNew goodMsgNew3 = new GoodMsgNew();
                    goodMsgNew3.liveItemDO = liveItem5;
                    goodMsgNew3.itemSortInfo = itemSortInfo;
                    n.a(this.h, liveItem5, i2);
                    hha.c("LiveGoodDataCenter", "onMessageReceived | onMessageStopExplanation, index=" + goodMsgNew3.liveItemDO.goodsIndex);
                    this.l.n(goodMsgNew3);
                }
            }
        } else if (i2 == 1070) {
            if ((obj instanceof String) && (d2 = fkx.d((String) obj)) != null) {
                long longValue = d2.getLongValue("itemId");
                int intValue = d2.getIntValue(iiz.PERF_STAG_TOTAL);
                n.c(this.h, d2.getString("liveId"), i2);
                hha.c("LiveGoodDataCenter", "onMessageReceived | onMessageGoodHot, itemid=" + longValue + "    total=" + intValue);
                this.l.C(longValue, intValue);
            }
        } else if (i2 == 10097) {
            if ((obj instanceof String) && (goodMsgNew = (GoodMsgNew) fkx.f((String) obj, GoodMsgNew.class)) != null && (liveItem3 = goodMsgNew.liveItemDO) != null) {
                n.a(this.h, liveItem3, i2);
                hha.c("LiveGoodDataCenter", "onMessageReceived | onMessageExplanationDelete, index=" + goodMsgNew.liveItemDO.goodsIndex);
                this.l.x(goodMsgNew);
            }
        } else if (i2 == 1071) {
            if (obj instanceof JSONObject) {
                this.l.m((JSONObject) obj);
            }
        } else if (i2 == 10098) {
            GoodMsgNew goodMsgNew4 = (GoodMsgNew) fkx.f((String) obj, GoodMsgNew.class);
            if (goodMsgNew4 != null && (liveItem2 = goodMsgNew4.liveItemDO) != null) {
                n.a(this.h, liveItem2, i2);
                hha.c("LiveGoodDataCenter", "onMessageReceived | onUpdateItemFromPM, index=" + goodMsgNew4.liveItemDO.goodsIndex);
                this.l.k(goodMsgNew4);
            }
        } else if (i2 == 10095) {
            GoodMsgNew goodMsgNew5 = (GoodMsgNew) fkx.f((String) obj, GoodMsgNew.class);
            if (goodMsgNew5 != null && (liveItem = goodMsgNew5.liveItemDO) != null) {
                n.a(this.h, liveItem, i2);
                hha.c("LiveGoodDataCenter", "onMessageReceived | onMessageGoodHot, index=" + goodMsgNew5.liveItemDO.goodsIndex);
                this.l.q(goodMsgNew5);
            }
        } else if (obj instanceof String) {
            this.i.c((String) obj, i2, this.l);
        }
    }
}
