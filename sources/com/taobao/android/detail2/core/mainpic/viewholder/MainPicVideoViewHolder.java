package com.taobao.android.detail2.core.mainpic.viewholder;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager;
import com.taobao.android.detail2.core.mainpic.MainPicContainer;
import com.taobao.android.detail2.core.mainpic.a;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import tb.bxj;
import tb.g9w;
import tb.gbx;
import tb.nyj;
import tb.o2r;
import tb.q0j;
import tb.t2o;
import tb.txj;
import tb.udi;
import tb.ue7;
import tb.v22;
import tb.wxj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainPicVideoViewHolder extends MainPicAbsViewHolder<g9w> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String i = "video";
    public static final com.taobao.android.detail2.core.mainpic.viewholder.a j = new f();
    public final udi f;
    public final View g;
    public final View h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements udi.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.udi.a
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31223baf", new Object[]{this, str, jSONObject});
            } else {
                MainPicVideoViewHolder.y0(MainPicVideoViewHolder.this, str, jSONObject);
            }
        }

        @Override // tb.udi.a
        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddbf7730", new Object[]{this, new Boolean(z)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Constants.Name.AUTO_PLAY, (Object) String.valueOf(z));
            jSONObject.put("args", (Object) jSONObject2);
            jSONObject.put("type", (Object) "append");
            MainPicVideoViewHolder.this.f7219a.f("interactiveUTParams", jSONObject);
        }

        @Override // tb.udi.a
        public HashMap<String, String> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("9cc44676", new Object[]{this});
            }
            HashMap<String, String> hashMap = (HashMap) MainPicVideoViewHolder.this.f7219a.e().a0().b("item", null, MainPicVideoViewHolder.this.f7219a.d());
            if (MainPicVideoViewHolder.this.f7219a.e() != null) {
                hashMap = (HashMap) v22.e(MainPicVideoViewHolder.this.f7219a.getNewDetailContext().h(), MainPicVideoViewHolder.this.f7219a.getNewDetailContext().j(), hashMap, MainPicVideoViewHolder.this.f7219a.d());
            }
            MainPicVideoViewHolder mainPicVideoViewHolder = MainPicVideoViewHolder.this;
            if (mainPicVideoViewHolder.d != 0) {
                hashMap.put("cardUTArgs", mainPicVideoViewHolder.f7219a.d().w().toJSONString());
            }
            return hashMap;
        }

        @Override // tb.udi.a
        public void a() {
            MainPicVideoViewHolder mainPicVideoViewHolder;
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b5947a0", new Object[]{this});
                return;
            }
            ue7 d = MainPicVideoViewHolder.this.f7219a.d();
            if (d != null && (t = (mainPicVideoViewHolder = MainPicVideoViewHolder.this).d) != 0) {
                if (d.f31127a == 0 && ((g9w) t).c == 0 && !d.A && !((g9w) t).d) {
                    if (d.C) {
                        txj.e(txj.TAG_TIP, "NdVideoSettingHelper: MainPic-视频未自动播放场景，不上报 FcpVideoReady 。");
                    } else {
                        bxj h = mainPicVideoViewHolder.f7219a.getNewDetailContext().h();
                        q0j.x(h, q0j.SECTION_FIRST_VIDEO_READY, "nid=" + d.h);
                        if (d.s0) {
                            d.s0 = false;
                            bxj h2 = MainPicVideoViewHolder.this.f7219a.getNewDetailContext().h();
                            q0j.x(h2, q0j.SECTION_FIRST_OPEN_IMMEDIATELY_VIDEO_READY, "nid=" + d.h);
                        }
                        if (d.C() != null) {
                            wxj.b(MainPicVideoViewHolder.this.f7219a.getNewDetailContext());
                            nyj.z().F(d.C().G(), nyj.TYPE_VIDEO_FRAME_READY);
                        }
                    }
                    if (MainPicVideoViewHolder.this.f7219a.getNewDetailContext() != null && MainPicVideoViewHolder.this.f7219a.getNewDetailContext().l() != null && MainPicVideoViewHolder.this.f7219a.getNewDetailContext().l().f() && d.f31127a == 0 && MainPicVideoViewHolder.this.f7219a.getNewDetailContext().l().c() && !NavBarViewManager.H(MainPicVideoViewHolder.this.f7219a.getNewDetailContext().j().o())) {
                        MainPicVideoViewHolder.this.f7219a.getNewDetailContext().l().j();
                    }
                    MainPicVideoViewHolder.this.f7219a.j();
                }
                MainPicVideoViewHolder.this.f7219a.c();
            }
        }

        @Override // tb.udi.a
        public void c(SuccPhenixEvent succPhenixEvent, boolean z) {
            MainPicVideoViewHolder mainPicVideoViewHolder;
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c232e1d", new Object[]{this, succPhenixEvent, new Boolean(z)});
                return;
            }
            ue7 d = MainPicVideoViewHolder.this.f7219a.d();
            if (d != null && (t = (mainPicVideoViewHolder = MainPicVideoViewHolder.this).d) != 0) {
                if (d.f31127a == 0) {
                    g9w g9wVar = (g9w) t;
                    if (g9wVar.c == 0 && !d.A && !g9wVar.d && !z && mainPicVideoViewHolder.f7219a.getNewDetailContext().j().A0()) {
                        o2r.a("mainPicVideoFirstCoverSuccess");
                        o2r.b();
                        if (!d.v) {
                            bxj h = MainPicVideoViewHolder.this.f7219a.getNewDetailContext().h();
                            q0j.x(h, q0j.SECTION_FIRST_NATIVE_PIC_VISIBLE, "nid=" + d.h);
                            MainPicVideoViewHolder.z0(MainPicVideoViewHolder.this);
                        }
                        if (d.t0) {
                            d.t0 = false;
                            bxj h2 = MainPicVideoViewHolder.this.f7219a.getNewDetailContext().h();
                            q0j.x(h2, q0j.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE, "nid=" + d.h);
                        }
                        if (d.C() != null) {
                            String G = d.C().G();
                            nyj.z().u(G, MainPicVideoViewHolder.this.f7219a.getNewDetailContext().q(), "loadVideoCover", true);
                            nyj.z().F(G, nyj.TYPE_VIDEO_COVER_PIC);
                            return;
                        }
                        return;
                    }
                }
                if (d.f31127a == 1) {
                    MainPicVideoViewHolder mainPicVideoViewHolder2 = MainPicVideoViewHolder.this;
                    g9w g9wVar2 = (g9w) mainPicVideoViewHolder2.d;
                    if (g9wVar2.c == 0 && !d.A && !g9wVar2.d && !z && mainPicVideoViewHolder2.f7219a.getNewDetailContext().j().B0() && MainPicVideoViewHolder.this.f7219a.g().s()) {
                        o2r.a("mainPicVideoSecondCoverSuccess");
                        o2r.b();
                        bxj h3 = MainPicVideoViewHolder.this.f7219a.getNewDetailContext().h();
                        q0j.x(h3, q0j.SECTION_SECOND_NATIVE_PIC_VISIBLE, "nid=" + d.h);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MainPicVideoViewHolder.A0(MainPicVideoViewHolder.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends gbx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(View view, Context context, MainPicAbsViewHolder.a aVar) {
            super(view, context, aVar);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/viewholder/MainPicVideoViewHolder$3");
        }

        @Override // tb.gbx
        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88ab898b", new Object[]{this});
            }
            return "frame";
        }

        @Override // tb.gbx
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            T t = MainPicVideoViewHolder.this.d;
            if (t != 0) {
                return ((g9w) t).c;
            }
            return -1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends gbx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(View view, Context context, MainPicAbsViewHolder.a aVar) {
            super(view, context, aVar);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/viewholder/MainPicVideoViewHolder$4");
        }

        @Override // tb.gbx
        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88ab898b", new Object[]{this});
            }
            return "playBtn";
        }

        @Override // tb.gbx
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            T t = MainPicVideoViewHolder.this.d;
            if (t != 0) {
                return ((g9w) t).c;
            }
            return -1;
        }

        @Override // tb.gbx
        public void i(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("523ebe22", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e extends gbx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(View view, Context context, MainPicAbsViewHolder.a aVar) {
            super(view, context, aVar);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/viewholder/MainPicVideoViewHolder$5");
        }

        @Override // tb.gbx
        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88ab898b", new Object[]{this});
            }
            return "video";
        }

        @Override // tb.gbx
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            T t = MainPicVideoViewHolder.this.d;
            if (t != 0) {
                return ((g9w) t).c;
            }
            return -1;
        }

        @Override // tb.gbx
        public void i(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("523ebe22", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f implements com.taobao.android.detail2.core.mainpic.viewholder.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail2.core.mainpic.viewholder.a
        public MainPicAbsViewHolder a(ViewGroup viewGroup, MainPicContainer mainPicContainer, a.b bVar, MainPicAbsViewHolder.a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MainPicAbsViewHolder) ipChange.ipc$dispatch("eff71e60", new Object[]{this, viewGroup, mainPicContainer, bVar, aVar, new Integer(i)});
            }
            return new MainPicVideoViewHolder((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.newdetail_media_container_layout, viewGroup, false), mainPicContainer, bVar, aVar);
        }
    }

    public MainPicVideoViewHolder(ViewGroup viewGroup, MainPicContainer mainPicContainer, a.b bVar, MainPicAbsViewHolder.a aVar) {
        super(viewGroup, mainPicContainer, bVar, aVar);
        a aVar2 = new a();
        udi udiVar = new udi(bVar.getNewDetailContext(), viewGroup, bVar.e(), bVar.g());
        this.f = udiVar;
        udiVar.w(aVar2);
        viewGroup.setOnTouchListener(new c(viewGroup, viewGroup.getContext(), this.b));
        View findViewById = viewGroup.findViewById(R.id.imv_play_public_pause);
        this.g = findViewById;
        ViewProxy.setOnTouchListener(findViewById, new d(findViewById, viewGroup.getContext(), this.b));
        findViewById.setHapticFeedbackEnabled(false);
        View findViewById2 = viewGroup.findViewById(R.id.video_host);
        this.h = findViewById2;
        ViewProxy.setOnTouchListener(findViewById2, new e(findViewById2, viewGroup.getContext(), this.b));
        findViewById2.setHapticFeedbackEnabled(false);
    }

    public static /* synthetic */ void A0(MainPicVideoViewHolder mainPicVideoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61413f3c", new Object[]{mainPicVideoViewHolder});
        } else {
            mainPicVideoViewHolder.E0();
        }
    }

    public static /* synthetic */ Object ipc$super(MainPicVideoViewHolder mainPicVideoViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/viewholder/MainPicVideoViewHolder");
    }

    public static /* synthetic */ void y0(MainPicVideoViewHolder mainPicVideoViewHolder, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923972a8", new Object[]{mainPicVideoViewHolder, str, jSONObject});
        } else {
            mainPicVideoViewHolder.C0(str, jSONObject);
        }
    }

    public static /* synthetic */ void z0(MainPicVideoViewHolder mainPicVideoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("328fd51d", new Object[]{mainPicVideoViewHolder});
        } else {
            mainPicVideoViewHolder.D0();
        }
    }

    /* renamed from: B0 */
    public void j0(g9w g9wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63feedb", new Object[]{this, g9wVar});
        } else if (g9wVar != null) {
            o2r.a("mainPicVideoFirstBind");
            this.f.j(this.f7219a.d(), g9wVar.i());
            o2r.b();
            this.f.q();
        }
    }

    public final void C0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e36a5f9", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) str);
        jSONObject2.put("info", (Object) jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("position", (Object) Integer.valueOf(((g9w) this.d).c));
        jSONObject2.put("extra", (Object) jSONObject3);
        if (!"timeupdate".equals(str) || ((this.f7219a.getNewDetailContext() != null && this.f7219a.getNewDetailContext().m().c("nd_hit_degrade_check_weex_bg")) || !this.f7219a.i())) {
            this.f7219a.f("mediaChannelToWeex", jSONObject2);
        } else {
            txj.e(txj.TAG_TIP, "切后台时忽略视频消息。");
        }
    }

    public final void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6fb69f", new Object[]{this});
        } else if (this.f7219a.getNewDetailContext().j().N().v0()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Thread thread = new Thread(new b());
                thread.setName("NDTraceNetVideo");
                thread.start();
                return;
            }
            E0();
        }
    }

    public final void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca6a0df", new Object[]{this});
            return;
        }
        try {
            int globalNetworkQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
            double globalPredictBandWidth = NetworkQualityMonitor.getInstance().getGlobalPredictBandWidth();
            q0j.a(this.f7219a.getNewDetailContext().h(), "onFirstPicNetQuality", Integer.valueOf(globalNetworkQuality));
            q0j.a(this.f7219a.getNewDetailContext().h(), "onFirstPicNetSpeed", Double.valueOf(globalPredictBandWidth));
        } catch (Exception e2) {
            txj.f("new_detail异常", "traceNet异常", e2);
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void i0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0cbe96", new Object[]{this, str});
            return;
        }
        udi udiVar = this.f;
        if (udiVar != null) {
            udiVar.i(str);
            this.f7219a.e().N0(this.f.f());
            u0(this.f.g());
            if (!this.c.n().m || !this.c.q()) {
                this.f.v(true);
            } else {
                this.f.v(false);
            }
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb331c7", new Object[]{this});
            return;
        }
        udi udiVar = this.f;
        if (udiVar != null) {
            udiVar.c();
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void m0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bab56e6", new Object[]{this, str});
            return;
        }
        udi udiVar = this.f;
        if (udiVar != null) {
            udiVar.m(str);
            if (!"MainPicScroll".equals(str)) {
                this.f.x(true);
            }
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void n0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c806ec99", new Object[]{this, jSONObject});
            return;
        }
        udi udiVar = this.f;
        if (udiVar != null) {
            udiVar.t(jSONObject);
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7d6fb7", new Object[]{this});
        } else if (this.f != null && this.f7219a.getNewDetailContext().m().w0()) {
            this.f.c();
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        udi udiVar = this.f;
        if (udiVar != null) {
            udiVar.l();
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3255bb04", new Object[]{this});
            return;
        }
        udi udiVar = this.f;
        if (udiVar != null) {
            udiVar.z(this.f7219a.d());
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bf9c08", new Object[]{this, str});
            return;
        }
        udi udiVar = this.f;
        if (udiVar != null) {
            udiVar.r();
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void r0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10632c34", new Object[]{this, str});
            return;
        }
        udi udiVar = this.f;
        if (udiVar != null) {
            udiVar.s();
        }
    }

    @Override // com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder
    public void l0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20012b03", new Object[]{this, str});
        } else if (this.f != null) {
            if ("scroll".equals(str)) {
                this.f.u();
            } else if ("background".equals(str)) {
                this.f.d();
            }
            this.f.x(true);
        }
    }

    static {
        t2o.a(352322181);
    }
}
