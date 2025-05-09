package com.taobao.android.detail2.core.realtime;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import java.util.List;
import tb.bn1;
import tb.cxj;
import tb.f82;
import tb.ghd;
import tb.gln;
import tb.nkn;
import tb.q0j;
import tb.t2o;
import tb.txj;
import tb.ucp;
import tb.x3w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RealtimeRearrangeImpl implements ghd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public gln.b f7234a;
    public gln.a b;
    public final cxj c;
    public Handler f;
    public int d = 0;
    public int e = 0;
    public final BroadcastReceiver g = new BroadcastReceiver() { // from class: com.taobao.android.detail2.core.realtime.RealtimeRearrangeImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.detail2.core.realtime.RealtimeRearrangeImpl$1$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7236a;
            public final /* synthetic */ nkn b;
            public final /* synthetic */ int c;

            public a(int i, nkn nknVar, int i2) {
                this.f7236a = i;
                this.b = nknVar;
                this.c = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f7236a == RealtimeRearrangeImpl.a(RealtimeRearrangeImpl.this)) {
                    txj.e(txj.TAG_REALTIME, "提示:实时插卡延时 结束。且无新广播进入。type:" + this.b.g() + " time:" + this.c + " delayReceiveIndex:" + this.f7236a);
                    RealtimeRearrangeImpl.d(RealtimeRearrangeImpl.this, this.b);
                } else {
                    txj.e(txj.TAG_REALTIME, "警告:实时插卡延时 结束。但有新广播进入，旧广播放弃。type:" + this.b.g() + " time:" + this.c + " delayReceiveIndex:" + this.f7236a + " mReceiveIndex:" + RealtimeRearrangeImpl.a(RealtimeRearrangeImpl.this));
                }
            }
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/realtime/RealtimeRearrangeImpl$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            RealtimeRearrangeImpl.b(RealtimeRearrangeImpl.this);
            if (RealtimeRearrangeImpl.c(RealtimeRearrangeImpl.this) == null) {
                String str = "实时插卡，广播已收到，出现未知异常，没有 nd context 。intent:" + intent;
                txj.e(txj.TAG_REALTIME, str);
                q0j.s(txj.TAG_REALTIME, q0j.SCENE_INSERT_CARD, q0j.ERROR_CODE_INSERT_CARD_NO_CONTEXT, str, null);
                return;
            }
            q0j.g("eventProcess", "Monitor_NewDetail_InsertCardBxBroadcast_" + RealtimeRearrangeImpl.c(RealtimeRearrangeImpl.this).j().p().a(), null);
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_INSERT_CARD_BX_BROADCAST_NEW, null);
            nkn j = nkn.j(context, intent);
            txj.e(txj.TAG_REALTIME, "收到端智能广播消息。index:" + RealtimeRearrangeImpl.a(RealtimeRearrangeImpl.this) + " realTimeRequestParam:" + j);
            if (!j.i()) {
                txj.e(txj.TAG_REALTIME, "异常:实时插卡失败:广播参数解析失败。errorMsg:" + j.e());
                return;
            }
            JSONObject U = RealtimeRearrangeImpl.c(RealtimeRearrangeImpl.this).j().N().U();
            if (j.g() == null || U == null || !U.containsKey(j.g())) {
                RealtimeRearrangeImpl.d(RealtimeRearrangeImpl.this, j);
                return;
            }
            try {
                i = U.getIntValue(j.g());
            } catch (Exception unused) {
                txj.e(txj.TAG_REALTIME, "异常: 无法获取延时参数。" + j.g());
            }
            if (i < 0) {
                txj.e(txj.TAG_REALTIME, "警告:Abort: 实时插卡延时。realtimeDelayTime 小于 0 。放弃了本次广播。type:" + j.g() + " time:" + i);
                return;
            }
            txj.e(txj.TAG_REALTIME, "提示:实时插卡延时 开始。type:" + j.g() + " time:" + i);
            RealtimeRearrangeImpl.this.i().postDelayed(new a(RealtimeRearrangeImpl.a(RealtimeRearrangeImpl.this), j, i), (long) i);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends com.taobao.android.detail2.core.framework.data.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f7237a;
        public final nkn b;

        static {
            t2o.a(352322218);
        }

        public a(String str, nkn nknVar) {
            this.f7237a = str;
            this.b = nknVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 815638576) {
                return new Boolean(super.c(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (JSONObject) objArr[2], (List) objArr[3], ((Number) objArr[4]).intValue(), ((Boolean) objArr[5]).booleanValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/realtime/RealtimeRearrangeImpl$RearrangeDataFetchCallback");
        }

        @Override // com.taobao.android.detail2.core.framework.data.a, com.taobao.android.detail2.core.framework.data.DetailDataManager.d
        public void e(boolean z, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc90181d", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            } else if (RealtimeRearrangeImpl.e(RealtimeRearrangeImpl.this) != null) {
                RealtimeRearrangeImpl.e(RealtimeRearrangeImpl.this).b(i2, "", this.b);
            }
        }

        @Override // com.taobao.android.detail2.core.framework.data.a, com.taobao.android.detail2.core.framework.data.DetailDataManager.d
        public boolean c(boolean z, int i, JSONObject jSONObject, List<x3w> list, int i2, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("309da830", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, list, new Integer(i2), new Boolean(z2)})).booleanValue();
            }
            try {
                if (RealtimeRearrangeImpl.e(RealtimeRearrangeImpl.this) != null) {
                    RealtimeRearrangeImpl.e(RealtimeRearrangeImpl.this).a(null, list, this.f7237a, jSONObject, this.b);
                }
                return super.c(z, i, jSONObject, list, i2, z2);
            } catch (Exception e) {
                String str = "实时插卡数据处理异常。" + Log.getStackTraceString(e);
                txj.e(txj.TAG_REALTIME, str);
                q0j.s(txj.TAG_REALTIME, q0j.SCENE_INSERT_CARD, q0j.ERROR_CODE_INSERT_CARD_PARSE_ERROR, str, null);
                return false;
            }
        }
    }

    static {
        t2o.a(352322215);
        t2o.a(352321893);
    }

    public RealtimeRearrangeImpl(cxj cxjVar) {
        this.c = cxjVar;
        if (cxjVar != null) {
            cxjVar.i();
        }
        j();
    }

    public static /* synthetic */ int a(RealtimeRearrangeImpl realtimeRearrangeImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2c74a60", new Object[]{realtimeRearrangeImpl})).intValue();
        }
        return realtimeRearrangeImpl.e;
    }

    public static /* synthetic */ int b(RealtimeRearrangeImpl realtimeRearrangeImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d53c668", new Object[]{realtimeRearrangeImpl})).intValue();
        }
        int i = realtimeRearrangeImpl.e;
        realtimeRearrangeImpl.e = 1 + i;
        return i;
    }

    public static /* synthetic */ cxj c(RealtimeRearrangeImpl realtimeRearrangeImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("a59ddb39", new Object[]{realtimeRearrangeImpl});
        }
        return realtimeRearrangeImpl.c;
    }

    public static /* synthetic */ boolean d(RealtimeRearrangeImpl realtimeRearrangeImpl, nkn nknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6403c458", new Object[]{realtimeRearrangeImpl, nknVar})).booleanValue();
        }
        return realtimeRearrangeImpl.m(nknVar);
    }

    public static /* synthetic */ gln.b e(RealtimeRearrangeImpl realtimeRearrangeImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gln.b) ipChange.ipc$dispatch("f19813d9", new Object[]{realtimeRearrangeImpl});
        }
        return realtimeRearrangeImpl.f7234a;
    }

    public final void f(nkn nknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3ad1f8", new Object[]{this, nknVar});
        } else if (nknVar.m()) {
            String d = nknVar.d();
            if (TextUtils.isEmpty(d)) {
                txj.e(txj.TAG_REALTIME, "异常:实时插卡 rootCategoryId 为空，并且无法读取到 nid ");
                return;
            }
            x3w e = ((ucp.b) this.b).e(nknVar.d());
            if (e == null) {
                txj.e(txj.TAG_REALTIME, "异常:实时插卡 rootCategoryId 为空，并且无法获取 node 。 nid:" + d);
                return;
            }
            JSONObject jSONObject = e.K;
            if (jSONObject == null) {
                txj.e(txj.TAG_REALTIME, "异常:实时插卡 rootCategoryId 为空，并且无法获取 mBizData 。 nid:" + d + " mRoot:" + e.d);
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("item");
            if (jSONObject2 == null) {
                txj.e(txj.TAG_REALTIME, "异常:实时插卡 rootCategoryId 为空，并且无法获取 itemData 。 nid:" + d + " mRoot:" + e.d);
                return;
            }
            String string = jSONObject2.getString("rootCategoryId");
            if (TextUtils.isEmpty(string)) {
                txj.e(txj.TAG_REALTIME, "异常:实时插卡 rootCategoryId 为空，并且itemData中也无法获取 rootCategoryId 。 nid:" + d + " mRoot:" + e.d);
                return;
            }
            txj.e(txj.TAG_REALTIME, "兜底:实时插卡 rootCategoryId 为空，但从itemData中获取到了 rootCategoryId 。 nid:" + d + " rootCategoryId:" + string);
            nknVar.l(string);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(f82.d()).unregisterReceiver(this.g);
        txj.e(txj.TAG_REALTIME, "实时插卡 广播取消注册完成");
    }

    public final bn1 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bn1) ipChange.ipc$dispatch("ddae6489", new Object[]{this});
        }
        return this.c.j().p();
    }

    public Handler i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[]{this});
        }
        Handler handler = this.f;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f = handler2;
        return handler2;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(f82.d()).registerReceiver(this.g, new IntentFilter("BehaviX_nd_realtime_rec_newdetail"));
        LocalBroadcastManager.getInstance(f82.d()).registerReceiver(this.g, new IntentFilter("BehaviX_nd_realtime_rec_litedetail"));
        txj.e(txj.TAG_REALTIME, "实时插卡，端智能广播注册成功");
    }

    public final String k(List<x3w> list) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b471e98", new Object[]{this, list});
        }
        if (list == null || (size = list.size()) <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            x3w x3wVar = list.get(i);
            if (x3wVar != null && !TextUtils.isEmpty(x3wVar.i)) {
                sb.append(",");
                sb.append(x3wVar.i);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        sb.deleteCharAt(0);
        return sb.toString();
    }

    public final boolean m(nkn nknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd919c20", new Object[]{this, nknVar})).booleanValue();
        }
        gln.a aVar = this.b;
        if (aVar == null || !((ucp.b) aVar).a("", "", nknVar)) {
            return false;
        }
        return p("", nknVar);
    }

    public void n(gln.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6623ee", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void o(gln.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66d604c4", new Object[]{this, bVar});
        } else {
            this.f7234a = bVar;
        }
    }

    public final void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cc5376", new Object[]{this, jSONObject});
            return;
        }
        DetailDataManager.LimitedQueue limitedQueue = new DetailDataManager.LimitedQueue(100);
        DetailDataManager.LimitedQueue limitedQueue2 = new DetailDataManager.LimitedQueue(100);
        DetailDataManager.LimitedQueue<String> d = ((ucp.b) this.b).d();
        DetailDataManager.LimitedQueue<String> c = ((ucp.b) this.b).c();
        x3w f = ((ucp.b) this.b).f();
        if (f != null) {
            int i = f.f31127a + 1;
            if (i > d.size()) {
                i = d.size();
            }
            if (i > c.size()) {
                i = c.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                limitedQueue.add(d.get(i2));
                limitedQueue2.add(c.get(i2));
            }
            jSONObject.put("realExposedItemIds", (Object) limitedQueue.getAppendString());
            jSONObject.put("realExposedCardSubType", (Object) limitedQueue2.getAppendString());
        }
    }

    public boolean p(String str, nkn nknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cacd9d5", new Object[]{this, str, nknVar})).booleanValue();
        }
        if (nknVar == null) {
            txj.e(txj.TAG_REALTIME, "triggerRearrange 异常，realTimeRequestParam 参数为空。");
            return false;
        }
        String feature = BUFS.getFeature(new BUFS.QueryArgs(), h().c(), h().a(), h().b());
        RecRequestParamsV2 recRequestParamsV2 = new RecRequestParamsV2();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bxFeature", (Object) feature);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("realtimeRequest", (Object) "true");
        nknVar.k(this.d);
        f(nknVar);
        JSONObject f = nknVar.f();
        if (f != null) {
            jSONObject2.put("realtimeConfig", (Object) f);
        }
        jSONObject2.put("realtimeUnexposedList", (Object) k(((ucp.b) this.b).g()));
        recRequestParamsV2.setCustomAppendQueryParams(jSONObject2);
        l(jSONObject);
        recRequestParamsV2.addBizParams(jSONObject);
        recRequestParamsV2.setCustomNewType("realtime");
        boolean b = ((ucp.b) this.b).b(recRequestParamsV2, new a(str, nknVar), nknVar);
        if (b) {
            txj.e(txj.TAG_REALTIME, "实时插卡 请求已发起。mRequestStartNum:" + this.d);
            this.d = this.d + 1;
        } else {
            txj.e(txj.TAG_REALTIME, "实时插卡 请求未发起。mRequestStartNum:" + this.d);
        }
        return b;
    }
}
