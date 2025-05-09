package com.taobao.mytaobao.ultron;

import android.app.Activity;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.homepage.busniess.acds.DealInfo;
import com.taobao.mytaobao.homepage.busniess.model.DeliverInfoBean;
import com.taobao.mytaobao.homepage.busniess.model.DeliverListResponse;
import com.taobao.mytaobao.ultron.model.OrderCountResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b8v;
import tb.eb4;
import tb.ggj;
import tb.jgj;
import tb.l3j;
import tb.lgj;
import tb.qgj;
import tb.ruv;
import tb.sb7;
import tb.sgj;
import tb.t2o;
import tb.tyo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MTBOrderDataProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static DealInfo f;

    /* renamed from: a  reason: collision with root package name */
    public DealInfo f11323a;
    public List<DeliverInfoBean> b;
    public JSONObject c;
    public String[] d;
    public final tyo e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f11325a;
        public final /* synthetic */ List b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.mytaobao.ultron.MTBOrderDataProvider$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC0637a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0637a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ((com.alibaba.android.ultron.vfw.instance.a) a.this.f11325a.n()).G().j1(false);
                a.this.f11325a.n().e(a.this.b);
            }
        }

        public a(b8v b8vVar, List list) {
            this.f11325a = b8vVar;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (MTBOrderDataProvider.e(MTBOrderDataProvider.this) == null || !MTBOrderDataProvider.e(MTBOrderDataProvider.this).d()) {
                ((com.alibaba.android.ultron.vfw.instance.a) this.f11325a.n()).G().j1(false);
                this.f11325a.n().e(this.b);
            } else {
                MTBOrderDataProvider.e(MTBOrderDataProvider.this).a(new RunnableC0637a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f11327a;
        public final /* synthetic */ List b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ((com.alibaba.android.ultron.vfw.instance.a) b.this.f11327a.n()).G().j1(false);
                b.this.f11327a.n().e(b.this.b);
            }
        }

        public b(b8v b8vVar, List list) {
            this.f11327a = b8vVar;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (MTBOrderDataProvider.e(MTBOrderDataProvider.this) == null || !MTBOrderDataProvider.e(MTBOrderDataProvider.this).d()) {
                ((com.alibaba.android.ultron.vfw.instance.a) this.f11327a.n()).G().j1(false);
                this.f11327a.n().e(this.b);
            } else {
                MTBOrderDataProvider.e(MTBOrderDataProvider.this).a(new a());
            }
        }
    }

    static {
        t2o.a(745538039);
    }

    public MTBOrderDataProvider(tyo tyoVar) {
        this.e = tyoVar;
        DealInfo l = l3j.INSTANCE.l();
        if (l != null) {
            Log.e("dswdsw", "->>>>>>>>>>>>命中order快照");
            this.f11323a = l;
            return;
        }
        Log.e("dswdsw", "->>>>>>>>>>>>没命中order快照");
        Object b2 = lgj.b(lgj.ORDER_NUM);
        if (b2 != null && (b2 instanceof DealInfo)) {
            this.f11323a = (DealInfo) b2;
        }
    }

    public static /* synthetic */ void a(MTBOrderDataProvider mTBOrderDataProvider, b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58d2ac7", new Object[]{mTBOrderDataProvider, b8vVar});
        } else {
            mTBOrderDataProvider.k(b8vVar);
        }
    }

    public static /* synthetic */ void b(MTBOrderDataProvider mTBOrderDataProvider, b8v b8vVar, OrderCountResponse.Results results) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5520d66", new Object[]{mTBOrderDataProvider, b8vVar, results});
        } else {
            mTBOrderDataProvider.h(b8vVar, results);
        }
    }

    public static /* synthetic */ DealInfo c(MTBOrderDataProvider mTBOrderDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DealInfo) ipChange.ipc$dispatch("d2a0ef80", new Object[]{mTBOrderDataProvider});
        }
        return mTBOrderDataProvider.f11323a;
    }

    public static /* synthetic */ void d(MTBOrderDataProvider mTBOrderDataProvider, b8v b8vVar, DealInfo dealInfo, List list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c00f5a", new Object[]{mTBOrderDataProvider, b8vVar, dealInfo, list, jSONObject});
        } else {
            mTBOrderDataProvider.j(b8vVar, dealInfo, list, jSONObject);
        }
    }

    public static /* synthetic */ tyo e(MTBOrderDataProvider mTBOrderDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tyo) ipChange.ipc$dispatch("7f8a75bc", new Object[]{mTBOrderDataProvider});
        }
        return mTBOrderDataProvider.e;
    }

    public static DealInfo g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DealInfo) ipChange.ipc$dispatch("a729dc37", new Object[0]);
        }
        return f;
    }

    public void i(final b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cade8a3d", new Object[]{this, b8vVar});
        } else if (b8vVar != null) {
            Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.ultron.MTBOrderDataProvider.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MTBOrderDataProvider.this.b = eb4.a(b8vVar.d());
                    jgj.b(new IRemoteBaseListener() { // from class: com.taobao.mytaobao.ultron.MTBOrderDataProvider.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            String str;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            if (mtopResponse == null) {
                                str = "UNKONW";
                            } else {
                                str = mtopResponse.getRetCode();
                            }
                            if (mtopResponse != null) {
                                mtopResponse.getRetMsg();
                            }
                            new HashMap().put("mtopOnErrorCode", str);
                            AnonymousClass1 r4 = AnonymousClass1.this;
                            MTBOrderDataProvider.a(MTBOrderDataProvider.this, b8vVar);
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            } else if (baseOutDo != null && baseOutDo.getData() != null && (baseOutDo.getData() instanceof OrderCountResponse.Results)) {
                                AnonymousClass1 r5 = AnonymousClass1.this;
                                MTBOrderDataProvider.b(MTBOrderDataProvider.this, b8vVar, (OrderCountResponse.Results) baseOutDo.getData());
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            String str;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            if (mtopResponse == null) {
                                str = "UNKONW";
                            } else {
                                str = mtopResponse.getRetCode();
                            }
                            new HashMap().put("mtopOnSystemErrorCode", str);
                            AnonymousClass1 r4 = AnonymousClass1.this;
                            MTBOrderDataProvider.a(MTBOrderDataProvider.this, b8vVar);
                        }
                    });
                }
            });
        }
    }

    public final void j(b8v b8vVar, DealInfo dealInfo, List<DeliverInfoBean> list, JSONObject jSONObject) {
        IDMComponent d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9ba96b", new Object[]{this, b8vVar, dealInfo, list, jSONObject});
        } else if (b8vVar != null && b8vVar.n() != null && b8vVar.d() != null && (d = b8vVar.d()) != null) {
            eb4.d(d, list);
            eb4.c(d, dealInfo);
            eb4.e(d, jSONObject);
            ArrayList arrayList = new ArrayList();
            arrayList.add(d);
            if (b8vVar.e() instanceof Activity) {
                ((Activity) b8vVar.e()).runOnUiThread(new a(b8vVar, arrayList));
            }
        }
    }

    public final void k(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca109275", new Object[]{this, b8vVar});
            return;
        }
        DealInfo createZeroCount = DealInfo.createZeroCount();
        l(b8vVar, createZeroCount);
        this.f11323a = createZeroCount;
        f = createZeroCount;
    }

    public final void l(b8v b8vVar, DealInfo dealInfo) {
        IDMComponent d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd89c948", new Object[]{this, b8vVar, dealInfo});
        } else if (b8vVar != null && b8vVar.n() != null && b8vVar.d() != null && (d = b8vVar.d()) != null && eb4.f(d, dealInfo)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(d);
            if (b8vVar.e() instanceof Activity) {
                ((Activity) b8vVar.e()).runOnUiThread(new b(b8vVar, arrayList));
            }
        }
    }

    public void m(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af10a3f", new Object[]{this, strArr});
        } else {
            this.d = strArr;
        }
    }

    public final void f(final b8v b8vVar, DealInfo dealInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2d35da", new Object[]{this, b8vVar, dealInfo});
        } else if (dealInfo != null) {
            boolean isSameBiz = dealInfo.isSameBiz(this.f11323a, true, this.d);
            if (!dealInfo.isSameBiz(this.f11323a, DealInfo.KEY_TO_CONFIRM) || !isSameBiz) {
                this.f11323a = dealInfo;
                f = dealInfo;
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("orderNumInfo", JSON.toJSONString(dealInfo));
                } catch (Exception unused) {
                }
                jgj.a(new IRemoteBaseListener() { // from class: com.taobao.mytaobao.ultron.MTBOrderDataProvider.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        String str;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        MTBOrderDataProvider mTBOrderDataProvider = MTBOrderDataProvider.this;
                        b8v b8vVar2 = b8vVar;
                        DealInfo c = MTBOrderDataProvider.c(mTBOrderDataProvider);
                        MTBOrderDataProvider mTBOrderDataProvider2 = MTBOrderDataProvider.this;
                        MTBOrderDataProvider.d(mTBOrderDataProvider, b8vVar2, c, mTBOrderDataProvider2.b, mTBOrderDataProvider2.c);
                        if (mtopResponse == null) {
                            str = "UNKONW";
                        } else {
                            str = mtopResponse.getRetCode();
                        }
                        if (mtopResponse != null) {
                            mtopResponse.getRetMsg();
                        }
                        new HashMap().put("mtopOnErrorCode", str);
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        b8v b8vVar2 = b8vVar;
                        if (!(b8vVar2 == null || sgj.b(b8vVar2.e()))) {
                            DeliverListResponse.DeliveryData deliveryData = (DeliverListResponse.DeliveryData) baseOutDo.getData();
                            List<DeliverInfoBean> list = deliveryData.deliveryList;
                            MTBOrderDataProvider mTBOrderDataProvider = MTBOrderDataProvider.this;
                            mTBOrderDataProvider.b = list;
                            mTBOrderDataProvider.c = deliveryData.events;
                            MTBOrderDataProvider.d(mTBOrderDataProvider, b8vVar, MTBOrderDataProvider.c(mTBOrderDataProvider), list, deliveryData.events);
                            ArrayList arrayList = new ArrayList(MTBOrderDataProvider.this.b.size());
                            for (int i2 = 0; i2 < MTBOrderDataProvider.this.b.size(); i2++) {
                                arrayList.add(MTBOrderDataProvider.this.b.get(i2).orderId);
                            }
                            sb7.b(Login.getUserId()).h(arrayList);
                            sb7.b(Login.getUserId()).f();
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        String str;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        MTBOrderDataProvider mTBOrderDataProvider = MTBOrderDataProvider.this;
                        b8v b8vVar2 = b8vVar;
                        DealInfo c = MTBOrderDataProvider.c(mTBOrderDataProvider);
                        MTBOrderDataProvider mTBOrderDataProvider2 = MTBOrderDataProvider.this;
                        MTBOrderDataProvider.d(mTBOrderDataProvider, b8vVar2, c, mTBOrderDataProvider2.b, mTBOrderDataProvider2.c);
                        if (mtopResponse == null) {
                            str = "UNKONW";
                        } else {
                            str = mtopResponse.getRetCode();
                        }
                        if (mtopResponse != null) {
                            mtopResponse.getRetMsg();
                        }
                        new HashMap().put("mtopOnSystemErrorCode", str);
                    }
                }, hashMap);
                return;
            }
            l(b8vVar, dealInfo);
            this.f11323a = dealInfo;
            f = dealInfo;
        }
    }

    public final void h(b8v b8vVar, OrderCountResponse.Results results) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32289180", new Object[]{this, b8vVar, results});
            return;
        }
        DealInfo dealInfo = new DealInfo();
        List<OrderCountResponse.Order> list = results.result;
        if (list != null && !list.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            for (OrderCountResponse.Order order : results.result) {
                if (!(order == null || (str = order.tabCode) == null)) {
                    jSONObject.put(str, (Object) order.count);
                    String str2 = order.tabCode;
                    str2.hashCode();
                    char c = 65535;
                    switch (str2.hashCode()) {
                        case -470817430:
                            if (str2.equals("refunding")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 245272565:
                            if (str2.equals("waitRate")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 245306013:
                            if (str2.equals("waitSend")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1116288755:
                            if (str2.equals("waitPay")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1143361419:
                            if (str2.equals("waitConfirm")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            dealInfo.refundBiz = order.count;
                            continue;
                        case 1:
                            dealInfo.toComment = order.count;
                            continue;
                        case 2:
                            dealInfo.hasPaid = order.count;
                            continue;
                        case 3:
                            dealInfo.toPayBiz = order.count;
                            continue;
                        case 4:
                            dealInfo.toConfirmBiz = order.count;
                            continue;
                    }
                }
            }
            ggj.c(jSONObject);
            qgj.b(jSONObject.toJSONString(), false);
        }
        lgj.e(lgj.ORDER_NUM, dealInfo);
        if (b8vVar != null) {
            if (b8vVar.e() == null || !sgj.b(b8vVar.e())) {
                ruv.c(dealInfo);
                f(b8vVar, dealInfo);
            }
        }
    }
}
