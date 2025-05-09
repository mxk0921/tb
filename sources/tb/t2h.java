package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.preload.LivePreloadData;
import com.taobao.android.tab2liveroom.liveroom.preload.business.PreloadRecommendResponse;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.detail.checkforeground.CheckForeGroundResponseData;
import java.util.ArrayList;
import java.util.Map;
import tb.dxg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t2h implements wlc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f28426a;
    public final long b;
    public LivePreloadData c;
    public dxg d;
    public dxg e;
    public lsm f;
    public iq3 g;
    public final boolean h;
    public final int i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends wsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/preload/task/LivePreloadTask$1");
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            LivePreloadData preloadResponseData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            tfs.c("LiveNormalPreloadTask", "startRequestRecommend onSuccess: " + i + " netResponse = " + netResponse + " netBaseOutDo = " + netBaseOutDo + " o = " + obj);
            if ((netBaseOutDo instanceof PreloadRecommendResponse) && (preloadResponseData = ((PreloadRecommendResponse) netBaseOutDo).getPreloadResponseData()) != null) {
                t2h.this.k(preloadResponseData, false);
                t2h.d(t2h.this, preloadResponseData.id);
                tfs.e("LiveNormalPreloadTask", "2.startRequestRecommend onSuccess,liveId: " + preloadResponseData.id + ",customPlayCtrlParams isEmpty: " + TextUtils.isEmpty(preloadResponseData.customPlayCtrlParams));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends wsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28428a;

        public b(String str) {
            this.f28428a = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/preload/task/LivePreloadTask$2");
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            tfs.c("LiveNormalPreloadTask", "onSuccess: " + i + " netResponse = " + netResponse + " netBaseOutDo = " + netBaseOutDo + " o = " + obj);
            if (netBaseOutDo != null && (netBaseOutDo.getData() instanceof Map)) {
                t2h.e(t2h.this, this.f28428a, netBaseOutDo);
            }
        }
    }

    static {
        t2o.a(779092167);
        t2o.a(779092166);
    }

    public t2h(Context context, o2h o2hVar, int i) {
        this.i = i;
        this.h = o2hVar.e();
        this.f28426a = o2hVar.c() * 1000;
        this.b = o2hVar.b() * 1000;
    }

    public static /* synthetic */ void d(t2h t2hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd769e6", new Object[]{t2hVar, str});
        } else {
            t2hVar.o(str);
        }
    }

    public static /* synthetic */ void e(t2h t2hVar, String str, NetBaseOutDo netBaseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ac1107", new Object[]{t2hVar, str, netBaseOutDo});
        } else {
            t2hVar.l(str, netBaseOutDo);
        }
    }

    @Override // tb.wlc
    public LivePreloadData a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LivePreloadData) ipChange.ipc$dispatch("1906cb9d", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.wlc
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        g();
        this.c = null;
    }

    @Override // tb.wlc
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            q();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a6441f", new Object[]{this});
            return;
        }
        dxg dxgVar = this.d;
        if (dxgVar != null) {
            dxgVar.cancel();
            this.d = null;
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3642c215", new Object[]{this});
            return;
        }
        tfs.e("LiveNormalPreloadTask", "cancelCountDownTimer");
        f();
        h();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5f62", new Object[]{this});
            return;
        }
        dxg dxgVar = this.e;
        if (dxgVar != null) {
            dxgVar.cancel();
            this.e = null;
        }
    }

    public final /* synthetic */ void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a53dd4", new Object[]{this, str});
            return;
        }
        tfs.e("LiveNormalPreloadTask", "4.启动定时轮询直播间状态倒计时结束，请求检查直播间状态接口");
        m(str);
    }

    public final /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05e985c", new Object[]{this});
            return;
        }
        tfs.e("LiveNormalPreloadTask", "5.启动定时轮询强制刷新倒计时结束，请求推荐接口");
        q();
    }

    public void k(LivePreloadData livePreloadData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d9d737", new Object[]{this, livePreloadData, new Boolean(z)});
        } else if (z) {
            this.c = null;
        } else {
            if (livePreloadData == null) {
                livePreloadData = new LivePreloadData();
            }
            livePreloadData.setPreloadType(this.i);
            livePreloadData.setHitPreloadAB(this.h);
            this.c = livePreloadData;
        }
    }

    public final void l(String str, NetBaseOutDo netBaseOutDo) {
        Map z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6a1c7e", new Object[]{this, str, netBaseOutDo});
        } else if (!TextUtils.isEmpty(str) && netBaseOutDo != null && netBaseOutDo.getData() != null && (z = nwv.z(netBaseOutDo.getData(), null)) != null) {
            CheckForeGroundResponseData checkForeGroundResponseData = (CheckForeGroundResponseData) z.get(str);
            if (checkForeGroundResponseData == null || TextUtils.equals(checkForeGroundResponseData.roomStatus, "1")) {
                tfs.e("LiveNormalPreloadTask", "7.removeFinishedLiveRoom，直播未结束，开启倒计时");
                n(str);
                return;
            }
            tfs.e("LiveNormalPreloadTask", "6.removeFinishedLiveRoom，直播已结束，请求推荐接口");
            k(null, true);
            q();
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0bdd1b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            if (this.g == null) {
                this.g = new iq3(new b(str));
            }
            this.g.K(arrayList);
        }
    }

    public final void n(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5456f811", new Object[]{this, str});
            return;
        }
        f();
        dxg dxgVar = new dxg(this.f28426a);
        this.d = dxgVar;
        dxgVar.a(new dxg.a() { // from class: tb.r2h
            @Override // tb.dxg.a
            public final void onFinish() {
                t2h.this.i(str);
            }
        });
        this.d.start();
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d73287", new Object[]{this, str});
            return;
        }
        tfs.e("LiveNormalPreloadTask", "3.startCountDownTimer liveId:" + str);
        n(str);
        p();
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114d0a7a", new Object[]{this});
            return;
        }
        h();
        dxg dxgVar = new dxg(this.b);
        this.e = dxgVar;
        dxgVar.a(new dxg.a() { // from class: tb.s2h
            @Override // tb.dxg.a
            public final void onFinish() {
                t2h.this.j();
            }
        });
        this.e.start();
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43de876", new Object[]{this});
            return;
        }
        if (this.f == null) {
            this.f = new lsm(new a());
        }
        tfs.e("LiveNormalPreloadTask", "1.startRequestRecommend");
        this.f.K();
    }
}
