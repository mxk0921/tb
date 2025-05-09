package com.taobao.taolive.room.player.standard;

import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import com.taobao.avplayer.s;
import com.taobao.taobao.R;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.openarchitecture.OpenSingleViewController;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.player.standard.TrackMistakeController;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.room.player.standard.manager.d;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.axc;
import tb.azd;
import tb.bia;
import tb.bxl;
import tb.c3s;
import tb.cba;
import tb.cdr;
import tb.d4s;
import tb.du4;
import tb.ebt;
import tb.ejr;
import tb.f0c;
import tb.fkx;
import tb.fxa;
import tb.g9c;
import tb.gxa;
import tb.hw0;
import tb.ibt;
import tb.ilq;
import tb.k6m;
import tb.l6m;
import tb.lf9;
import tb.mxf;
import tb.n8e;
import tb.nqo;
import tb.nxf;
import tb.pg1;
import tb.pvs;
import tb.q0h;
import tb.rbu;
import tb.rc;
import tb.rir;
import tb.s3c;
import tb.shi;
import tb.sj4;
import tb.sj9;
import tb.sjr;
import tb.sr4;
import tb.t2o;
import tb.t4w;
import tb.ufo;
import tb.ujv;
import tb.up6;
import tb.uvd;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.vc;
import tb.vwl;
import tb.x5t;
import tb.yj4;
import tb.yqq;
import tb.yrr;
import tb.yvd;
import tb.z3h;
import tb.z9u;
import tb.zjd;
import tb.znm;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class StandardVideoFrame implements BaseStatePlayer.j, f0c, BaseStatePlayer.i, n8e, s3c, axc, TrackMistakeController.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long A;
    public String C;

    /* renamed from: a  reason: collision with root package name */
    public View f13206a;
    public FrameLayout b;
    public FrameLayout c;
    public TBLiveBizDataModel d;
    public c3s e;
    public String f;
    public boolean g;
    public boolean h;
    public int i;
    public com.taobao.taolive.room.player.standard.manager.a j;
    public final Context k;
    public final cdr l;
    public t4w m;
    public RecModel n;
    public final View o;
    public final zjd p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public bxl x;
    public String y;
    public long z;
    public final BroadcastReceiver v = new BroadcastReceiver() { // from class: com.taobao.taolive.room.player.standard.StandardVideoFrame.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/standard/StandardVideoFrame$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && intent.getAction() != null) {
                if (intent.getAction().equals("mega.stdPop.broadcast.windowStateChanged")) {
                    if (intent.getStringExtra("windowState") != null) {
                        StandardVideoFrame.P(StandardVideoFrame.this, intent.getStringExtra("windowState"), nxf.a(intent));
                    }
                } else if (intent.getAction().equals("mega.stdPop.broadcast.popStateChanged") && intent.getStringExtra("popState") != null) {
                    StandardVideoFrame.Q(StandardVideoFrame.this, intent.getStringExtra("popState"), nxf.a(intent));
                }
            }
        }
    };
    public final rir.c w = new b();
    public boolean B = false;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface LiveRoomPlayerType {
        public static final int LIVE = 3;
        public static final int REPLAY = 2;
        public static final int TIMEMOVE = 1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements g9c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.g9c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b48357", new Object[]{this});
            }
        }

        @Override // tb.g9c
        public void b(SimpleVideoInfo simpleVideoInfo) {
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e066f337", new Object[]{this, simpleVideoInfo});
                return;
            }
            StandardVideoFrame.L(StandardVideoFrame.this, simpleVideoInfo);
            if (simpleVideoInfo != null) {
                StandardVideoFrame.M(StandardVideoFrame.this, simpleVideoInfo.voiceSilent);
            }
            StandardMediaData generate = StandardMediaData.generate(simpleVideoInfo);
            LiveItem.SpfPlayVideo j = znm.j(simpleVideoInfo);
            if (generate != null && (jSONArray = generate.liveUrlList) != null && !jSONArray.isEmpty()) {
                StandardVideoFrame.N(StandardVideoFrame.this, generate, null, "callClientUrlList", null, null);
            } else if (j != null) {
                StandardVideoFrame.O(StandardVideoFrame.this, j);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements rir.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rir.c
        public Bitmap a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("ec29d40d", new Object[]{this});
            }
            if (StandardVideoFrame.S(StandardVideoFrame.this) == null || StandardVideoFrame.S(StandardVideoFrame.this).n0() == null) {
                return null;
            }
            return StandardVideoFrame.S(StandardVideoFrame.this).n0().copy(Bitmap.Config.RGB_565, true);
        }

        @Override // tb.rir.c
        public void b(float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52a70017", new Object[]{this, new Float(f), new Integer(i)});
                return;
            }
            if (!(StandardVideoFrame.R(StandardVideoFrame.this) == null || StandardVideoFrame.R(StandardVideoFrame.this).j() == null || !StandardVideoFrame.R(StandardVideoFrame.this).j().d())) {
                sjr.g().c(uyg.d, "videoViewUp", StandardVideoFrame.this.observeUniqueIdentification());
            }
            x5t.k("TBLiveAIImmersiveService", "onVideoMove: offset = " + f);
            StandardVideoFrame.this.C(f, (long) i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements uvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13210a;

        public c(String str) {
            this.f13210a = str;
        }

        @Override // tb.uvd
        public void onError(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
            }
        }

        @Override // tb.uvd
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            x5t.h("StandardVideoFrame", "setVideoBackground onSuccess = " + this.f13210a);
            StandardVideoFrame.this.b.setBackground((BitmapDrawable) obj);
        }
    }

    static {
        t2o.a(779093147);
        t2o.a(779093197);
        t2o.a(806355974);
        t2o.a(779093196);
        t2o.a(779093073);
        t2o.a(806355016);
        t2o.a(806355707);
        t2o.a(779093157);
    }

    public StandardVideoFrame(cdr cdrVar, Context context, View view, zjd zjdVar) {
        this.k = context;
        this.l = cdrVar;
        cdrVar.C();
        this.p = zjdVar;
        this.n = cdrVar.w0();
        this.o = view;
        LiveMediaManager liveMediaManager = new LiveMediaManager(context, cdrVar);
        this.j = liveMediaManager;
        liveMediaManager.y1(this);
        this.j.z1(this);
        h0();
        this.j.p1(this.f13206a, this.b);
        k0(pg1.ATOM_constructor);
    }

    public static /* synthetic */ void L(StandardVideoFrame standardVideoFrame, SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be05b2", new Object[]{standardVideoFrame, simpleVideoInfo});
        } else {
            standardVideoFrame.T(simpleVideoInfo);
        }
    }

    public static /* synthetic */ void M(StandardVideoFrame standardVideoFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45845e", new Object[]{standardVideoFrame, str});
        } else {
            standardVideoFrame.Q0(str);
        }
    }

    public static /* synthetic */ void N(StandardVideoFrame standardVideoFrame, StandardMediaData standardMediaData, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1625947", new Object[]{standardVideoFrame, standardMediaData, str, str2, str3, str4});
        } else {
            standardVideoFrame.u0(standardMediaData, str, str2, str3, str4);
        }
    }

    public static /* synthetic */ void O(StandardVideoFrame standardVideoFrame, LiveItem.SpfPlayVideo spfPlayVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa75fd", new Object[]{standardVideoFrame, spfPlayVideo});
        } else {
            standardVideoFrame.t0(spfPlayVideo);
        }
    }

    public static /* synthetic */ void P(StandardVideoFrame standardVideoFrame, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f184e2f", new Object[]{standardVideoFrame, str, jSONObject});
        } else {
            standardVideoFrame.s0(str, jSONObject);
        }
    }

    public static /* synthetic */ void Q(StandardVideoFrame standardVideoFrame, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782f54ce", new Object[]{standardVideoFrame, str, jSONObject});
        } else {
            standardVideoFrame.n0(str, jSONObject);
        }
    }

    public static /* synthetic */ cdr R(StandardVideoFrame standardVideoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cdr) ipChange.ipc$dispatch("8a3b30e3", new Object[]{standardVideoFrame});
        }
        return standardVideoFrame.l;
    }

    public static /* synthetic */ com.taobao.taolive.room.player.standard.manager.a S(StandardVideoFrame standardVideoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.room.player.standard.manager.a) ipChange.ipc$dispatch("176e944b", new Object[]{standardVideoFrame});
        }
        return standardVideoFrame.j;
    }

    public static void z0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e5841", new Object[]{jSONObject});
            return;
        }
        if (jSONObject.getJSONObject("broadCaster") != null) {
            jSONObject.put(RequestConfig.KEY_ANCHOR_ID, jSONObject.getJSONObject("broadCaster").get("accountId"));
        }
        jSONObject.put("mediaSourceType", jSONObject.get("pushFeature"));
    }

    @Override // tb.axc
    public void A(ujv ujvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ca2e7b", new Object[]{this, ujvVar});
        } else {
            this.j.Q0(ujvVar);
        }
    }

    public final void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22c8539", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
        if (aVar != null) {
            aVar.f1();
        }
    }

    @Override // tb.n8e
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adcab476", new Object[]{this});
        } else if (i0()) {
            k0("onGetVideoInfoFailed");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0() {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.taolive.room.player.standard.StandardVideoFrame.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "8ab94766"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            com.taobao.taolive.room.player.standard.manager.a r2 = r4.j
            if (r2 == 0) goto L_0x005e
            com.taobao.taolive.room.player.standard.state.BaseStatePlayer r2 = r2.k0()
            if (r2 == 0) goto L_0x005e
            com.taobao.taolive.room.player.standard.manager.a r2 = r4.j
            com.taobao.taolive.room.player.standard.state.BaseStatePlayer r2 = r2.k0()
            boolean r2 = r2.B0()
            if (r2 == 0) goto L_0x0034
            com.taobao.taolive.room.player.standard.manager.a r2 = r4.j
            com.taobao.taolive.room.player.standard.state.BaseStatePlayer$WarmState r2 = r2.x0()
            com.taobao.taolive.room.player.standard.state.BaseStatePlayer$WarmState r3 = com.taobao.taolive.room.player.standard.state.BaseStatePlayer.WarmState.WARMED
            if (r2 != r3) goto L_0x003d
        L_0x0032:
            r0 = 1
            goto L_0x003d
        L_0x0034:
            com.taobao.taolive.room.player.standard.manager.a r2 = r4.j
            int r2 = r2.t0()
            if (r2 == 0) goto L_0x003d
            goto L_0x0032
        L_0x003d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CardAnalysisUtils warmed: "
            r1.<init>(r2)
            com.taobao.taolive.room.player.standard.manager.a r2 = r4.j
            com.taobao.taolive.room.player.standard.state.BaseStatePlayer$WarmState r2 = r2.x0()
            r1.append(r2)
            java.lang.String r2 = " hasPreloaded: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "StandardVideoFrame"
            tb.o3s.b(r2, r1)
        L_0x005e:
            tb.cdr r1 = r4.l
            if (r1 == 0) goto L_0x0069
            tb.v73 r1 = r1.S0()
            tb.w73.e(r1, r0)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.player.standard.StandardVideoFrame.B0():void");
    }

    public final void C0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf891ecf", new Object[]{this, new Long(j)});
        } else if (v2s.o().E() != null) {
            HashMap hashMap = new HashMap();
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.z;
            long j3 = currentTimeMillis - j2;
            long j4 = j - j2;
            hashMap.put("timestamp", String.valueOf(currentTimeMillis));
            cdr cdrVar = this.l;
            if (cdrVar != null) {
                hashMap.put("livesource", up6.L(cdrVar));
                hashMap.put("liveToken", this.l.p());
                hashMap.put("entryLiveSource", up6.r(this.l));
            }
            hashMap.put("liveDuration", String.valueOf(j3));
            hashMap.put("decodeCompleteTs", String.valueOf(j));
            hashMap.put("decodeCompleteTsDuration", String.valueOf(j4));
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", "live_player_success", hashMap);
            bxl bxlVar = this.x;
            if (bxlVar != null) {
                bxlVar.a("updateScreenDuration", String.valueOf(j4));
                String a2 = shi.a(this.j.v0());
                this.x.a("mediaFormat", a2);
                k0("onInfo_MEDIA_INFO_VIDEO_FIRST_RENDER_SURFACE_UPDATE updateScreenDuration = " + j4 + ", mediaFormat = " + a2);
            }
        }
    }

    @Override // tb.axc
    public void D(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1cd3a8e", new Object[]{this, map});
        } else {
            this.j.b0(map);
        }
    }

    public final void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e362ff", new Object[]{this});
        } else {
            this.B = false;
        }
    }

    @Override // tb.n8e
    public void E(BaseFrame baseFrame, VideoInfo videoInfo, boolean z) {
        com.taobao.taolive.room.player.standard.manager.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990ef8de", new Object[]{this, baseFrame, videoInfo, new Boolean(z)});
        } else if (i0() && (aVar = this.j) != null) {
            aVar.B0(baseFrame, videoInfo, z);
        }
    }

    public final void E0(com.taobao.taolive.room.player.standard.manager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa61493", new Object[]{this, aVar});
            return;
        }
        zjd zjdVar = this.p;
        if (zjdVar != null) {
            ((OpenSingleViewController.h) zjdVar).a(aVar);
        }
    }

    public final void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cdf89d", new Object[]{this});
            return;
        }
        if (this.j != null) {
            this.j = new LiveMediaManager(this.j.l0());
        } else {
            this.j = new LiveMediaManager(this.k, this.l);
        }
        this.i = 3;
        E0(this.j);
    }

    @Override // tb.n8e
    public IPlayPublicService G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPlayPublicService) ipChange.ipc$dispatch("449bdfd3", new Object[]{this});
        }
        return this.j;
    }

    public final void G0() {
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8b2790", new Object[]{this});
        } else if (this.b != null && (cdrVar = this.l) != null && cdrVar.A() != null && this.l.A().abilityCompontent != null && ((ibt) this.l.A().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TOP_MASK)) {
            this.b.findViewById(R.id.taolive_open_top_mask).setVisibility(0);
        }
    }

    @Override // tb.n8e
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15448e4e", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
        if (aVar != null) {
            aVar.start();
        }
    }

    @Override // com.taobao.taolive.room.player.standard.state.BaseStatePlayer.j
    public void I(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed575feb", new Object[]{this, new Integer(i), map});
        } else if (i == 2) {
            r0();
        } else if (i == 5) {
            q0(map, false);
        } else if (i == 6) {
            p0(map);
        }
    }

    public final void I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a4e182", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        cdr cdrVar = this.l;
        if (cdrVar != null && (cdrVar.j() instanceof cba)) {
            cba G0 = this.l.j();
            hashMap.put("blackReplayCheck", Boolean.valueOf(G0.Q()));
            hashMap.put("isInOpti", Boolean.valueOf(nqo.l(G0, 0L)));
            rbu.Q(19997, "blackReplayCheck", hashMap);
        }
    }

    @Override // tb.n8e
    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df90c61b", new Object[]{this, str});
        } else {
            this.C = str;
        }
    }

    public final void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f940916a", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.k).unregisterReceiver(this.v);
        }
    }

    @Override // tb.c7m
    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51582f8b", new Object[]{this, new Boolean(z)});
            return;
        }
        d f0 = f0(this.j);
        if (f0 != null) {
            f0.T1(z);
        }
    }

    public final void L0(VideoInfo videoInfo) {
        com.taobao.taolive.room.player.standard.manager.a aVar;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d87fca", new Object[]{this, videoInfo});
        } else if (pvs.h1() && (aVar = this.j) != null && videoInfo != null && (str = videoInfo.liveConfigForStream) != null) {
            aVar.O1(str);
        }
    }

    public final void N0() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a108721d", new Object[]{this});
            return;
        }
        if (up6.r(this.l) != null) {
            str = up6.r(this.l);
        } else {
            str = "";
        }
        if (this.n.isFirst) {
            str2 = "init";
        } else {
            str2 = sj4.VIDEO_ACTION_TYPE_UPDOWNSWITCH;
        }
        if (this.l != null) {
            StringBuilder sb = new StringBuilder("entryLiveSource=");
            sb.append(str);
            sb.append(",liveSource=");
            sb.append(up6.L(this.l));
            sb.append(",liveToken=");
            sb.append(this.l.p());
            sb.append(",videoActionType=");
            sb.append(str2);
            sb.append(",vod_scenario=videoFullScreen,switchIndex=");
            sb.append(up6.W(this.l));
            sb.append(",jumpType=");
            sb.append(this.C);
            sb.append(",startScrollTimeMs=");
            sb.append(this.z);
            long m = sj9.m();
            if (m > 0) {
                sb.append(",videoLaunchPlayTime=");
                sb.append(m);
            }
            sb.append(",isFromLauncher=");
            sb.append(sj9.s());
            if (nqo.m()) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            sb.append(",isStandardPlay=");
            sb.append(str3);
            String sb2 = sb.toString();
            k0("live updatePlayExValue = " + sb2);
            this.j.R1(sb2);
        }
    }

    public final void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20e258e", new Object[]{this});
        } else if (this.j != null) {
            k0("live updateStatusPlayerExpParams");
            this.j.S1(null);
        }
    }

    public final void P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5d6087", new Object[]{this});
            return;
        }
        String str = this.n.imageUrl;
        this.b.setBackground(this.k.getResources().getDrawable(R.drawable.taolive_slice_scroll_common));
        yvd n = v2s.o().n();
        n.load(str + pvs.p2()).b(new c(str)).a();
    }

    public final void Q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc50baf", new Object[]{this, str});
        } else if (this.l.j() != null && !TextUtils.isEmpty(str)) {
            this.l.j().M = "true".equals(str);
        }
    }

    public final void T(SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2931e928", new Object[]{this, simpleVideoInfo});
        } else if (simpleVideoInfo != null) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(simpleVideoInfo.liveId)) {
                hashMap.put("feed_id", simpleVideoInfo.liveId);
            }
            if (!TextUtils.isEmpty(simpleVideoInfo.accountId)) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, simpleVideoInfo.accountId);
            } else if (!TextUtils.isEmpty(simpleVideoInfo.encodeAccountId)) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, simpleVideoInfo.encodeAccountId);
            }
            du4.c(this.l, rbu.t(this.l, this.k), hashMap);
        }
    }

    public final void U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4864b1", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.i;
        if (i2 != 1) {
            if (i2 == 3) {
                if (i == 1) {
                    this.j.H();
                    this.i = i;
                    d a0 = this.j.a0();
                    this.j = a0;
                    a0.y1(this);
                    E0(this.j);
                } else if (i == 2) {
                    this.j.H();
                    this.i = i;
                    com.taobao.taolive.room.player.standard.manager.b Z = this.j.Z();
                    this.j = Z;
                    Z.y1(this);
                    E0(this.j);
                }
            }
        } else if (i == 3) {
            this.i = i;
            this.j.H();
            LiveMediaManager Y = this.j.Y();
            this.j = Y;
            Y.y1(this);
            E0(this.j);
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        up6.X0(VideoStatus.VIDEO_NORMAL_STATUS, this.l);
        this.j.J1(this.c);
        this.j.H();
        if (this.l != null) {
            l6m.c().e(this.l.p());
        }
        sjr.g().b(this);
        J0();
        this.f = null;
        this.h = false;
        this.g = false;
        this.C = null;
        this.r = false;
        D0();
    }

    public final void Y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935ca841", new Object[]{this, str});
        } else if (b0() != null && b0().b() != null) {
            b0().b().b(str, true, true, true);
        }
    }

    public final String Z(RecModel recModel) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ba4870c", new Object[]{this, recModel});
        }
        if (recModel == null || (map = recModel.initParams) == null) {
            return null;
        }
        return Uri.decode(map.get("replayUrl"));
    }

    @Override // tb.n8e
    public void a(VideoInfo videoInfo, fxa fxaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("277d9791", new Object[]{this, videoInfo, fxaVar});
            return;
        }
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = videoInfo.timeMovingPlayInfo;
        if (timeMovingPlayInfo != null) {
            gxa.c(this.l, timeMovingPlayInfo.spfPlayVideo);
        }
        U(1);
        com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
        if (aVar instanceof d) {
            ((d) aVar).W1(null, fxaVar);
        }
    }

    public final String a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee6aeec0", new Object[]{this});
        }
        Map<String, String> map = this.n.initParams;
        if (map != null) {
            String str = map.get(yj4.PARAM_LIVE_URL_TYPE);
            if ("rtcLive".equals(str) || "flv".equals(str)) {
                return this.n.initParams.get(yj4.PARAM_LIVE_PLAY_URL);
            }
        }
        return null;
    }

    @Override // tb.n8e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e625511", new Object[]{this});
        } else if (i0()) {
            k0("switchToPortrait");
            com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
            if (aVar != null) {
                aVar.L1();
            }
        }
    }

    public final z3h b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z3h) ipChange.ipc$dispatch("217abf03", new Object[]{this});
        }
        com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
        if (aVar == null || aVar.l0() == null || this.j.l0().f == null) {
            return null;
        }
        return this.j.l0().f;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "StandardVideoFrame";
    }

    @Override // tb.n8e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
        } else if (i0()) {
            k0("retry");
            this.j.n1();
        }
    }

    public final StandardMediaData c0(RecModel recModel) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StandardMediaData) ipChange.ipc$dispatch("f7fef7f7", new Object[]{this, recModel});
        }
        if (recModel == null || recModel.supportPreLoad != 1) {
            return null;
        }
        if (!recModel.isFirst || (map = recModel.initParams) == null) {
            ArrayList<QualitySelectItem> arrayList = recModel.liveUrlList;
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            return StandardMediaData.generate(mxf.e(fkx.i(recModel)));
        }
        String str = map.get(yj4.PARAM_CUSTOM_PLAY_CTRL);
        if (!TextUtils.isEmpty(str)) {
            return StandardMediaData.generate(mxf.e(str));
        }
        return null;
    }

    @Override // tb.n8e
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dace6a19", new Object[]{this});
        } else if (i0()) {
            k0("showLiveEnd");
            O0();
            I0();
            cdr cdrVar = this.l;
            if (cdrVar != null) {
                this.j.W0(cdrVar.J0());
            }
        }
    }

    public final String d0(RecModel recModel) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc561abb", new Object[]{this, recModel});
        }
        if (!(recModel == null || (map = recModel.initParams) == null)) {
            Map d = sr4.d(map.get(yj4.PARAM_UT_PARAMS), null);
            if (d != null) {
                String e = sr4.e(d.get("ndCardType"), null);
                if (!TextUtils.isEmpty(e) && !TextUtils.equals(e, "contentlive")) {
                    return null;
                }
            }
            String str = recModel.initParams.get(yj4.PARAM_PLAY_VIEW_TOKEN);
            if (s.c.g(str)) {
                return str;
            }
            k0("playViewToken 对应播放器实例已销毁， return null");
        }
        return null;
    }

    @Override // tb.n8e
    public void e(t4w t4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440ad8a2", new Object[]{this, t4wVar});
        } else {
            this.m = t4wVar;
        }
    }

    public final String e0() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3a45b4f", new Object[]{this});
        }
        RecModel recModel = this.n;
        if (recModel == null || (map = recModel.initParams) == null || TextUtils.isEmpty(map.get(yj4.PARAM_PLAY_MODE))) {
            return "";
        }
        return this.n.initParams.get(yj4.PARAM_PLAY_MODE);
    }

    @Override // tb.k0e
    public void f(TBLiveDataModel tBLiveDataModel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7d73ef", new Object[]{this, tBLiveDataModel, str, str2});
            return;
        }
        O0();
        U(1);
    }

    public final d f0(com.taobao.taolive.room.player.standard.manager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("2b64e7a5", new Object[]{this, aVar});
        }
        if (this.i != 1 || !(aVar instanceof d)) {
            return null;
        }
        return (d) aVar;
    }

    @Override // tb.k0e
    public PlayerController2 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayerController2) ipChange.ipc$dispatch("a36731e6", new Object[]{this});
        }
        com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
        if (aVar != null) {
            return aVar.r0();
        }
        return null;
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7396911", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("mega.stdPop.broadcast.windowStateChanged");
        intentFilter.addAction("mega.stdPop.broadcast.popStateChanged");
        intentFilter.addAction("mega.stdPop.broadcast.positionChanged");
        LocalBroadcastManager.getInstance(this.k).registerReceiver(this.v, intentFilter);
    }

    @Override // tb.k0e
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.n8e
    public void h(bxl bxlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("561ad43d", new Object[]{this, bxlVar, str});
        } else if (i0()) {
            this.x = bxlVar;
            this.y = str;
            com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
            if (aVar != null) {
                aVar.v1(str, bxlVar);
            }
        }
    }

    public final void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        ViewStub viewStub = (ViewStub) this.o.findViewById(R.id.taolive_base_video);
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.taolive_frame_video);
            View inflate = viewStub.inflate();
            this.f13206a = inflate;
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.taolive_video_content);
            this.b = frameLayout;
            this.c = (FrameLayout) frameLayout.findViewById(R.id.taolive_video_project_screen);
            G0();
        }
    }

    public final boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue();
        }
        if (this.k == null || this.l == null || vwl.e().d()) {
            return false;
        }
        return true;
    }

    @Override // tb.k0e
    public void j(String str, Context context, boolean z, boolean z2, bxl bxlVar, String str2, String str3, fxa fxaVar, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa4bee2", new Object[]{this, str, context, new Boolean(z), new Boolean(z2), bxlVar, str2, str3, fxaVar, ux9Var});
            return;
        }
        O0();
        U(1);
        d f0 = f0(this.j);
        if (f0 != null) {
            f0.W1(this.d.mVideoInfo, fxaVar);
        }
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96de1cb4", new Object[]{this});
        } else if (this.g && this.h) {
            l0();
        }
    }

    @Override // tb.n8e
    public void k(BaseFrame baseFrame, VideoInfo videoInfo, String str) {
        com.taobao.taolive.room.player.standard.manager.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5153fcf3", new Object[]{this, baseFrame, videoInfo, str});
        } else if (i0() && (aVar = this.j) != null) {
            aVar.y0(baseFrame);
        }
    }

    public final void k0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (this.l != null) {
            x5t.h("StandardVideoFrame", this.l.p() + " " + str);
        }
    }

    @Override // tb.n8e
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb285479", new Object[]{this})).booleanValue();
        }
        com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
        if (aVar != null) {
            return aVar.E0();
        }
        return false;
    }

    public final void l0() {
        t4w t4wVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a903d7c", new Object[]{this});
            return;
        }
        k0("onFrameReady");
        sjr.g().a(this);
        this.j.S0(this.d);
        if (pvs.p0() && (t4wVar = this.m) != null) {
            t4wVar.onFrameReady();
        }
        TBLiveBizDataModel tBLiveBizDataModel = this.d;
        if (tBLiveBizDataModel != null) {
            L0(tBLiveBizDataModel.mVideoInfo);
        }
    }

    @Override // tb.axc
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65c0f4c", new Object[]{this});
        } else {
            this.j.P0();
        }
    }

    public void m0(long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        t4w t4wVar = this.m;
        if (t4wVar != null) {
            t4wVar.onVideoInfo(null, j, j2, obj);
        }
    }

    @Override // tb.mmh
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83a7d786", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void o0(String str, String str2, String str3, String str4) {
        bxl bxlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e11a", new Object[]{this, str, str2, str3, str4});
            return;
        }
        k0("串流监控onReportMistake，上报KLifecycle, type: " + str2 + ", mistakeStr: " + str);
        str2.hashCode();
        if (str2.equals(LiveMediaManager.ReportMistakeType.TYPE_DETAIL_AFTER)) {
            bxl bxlVar2 = this.x;
            if (bxlVar2 != null) {
                bxlVar2.a(bxl.DETAIL_AFTER_STREAM_MISTAKE, str);
                if (TextUtils.equals(str, "1")) {
                    this.x.a(bxl.DETAIL_AFTER_PLAYING_URL, str3);
                }
                this.x.a(bxl.IS_OFFICIAL_LIVE, str4);
            }
        } else if (str2.equals(LiveMediaManager.ReportMistakeType.TYPE_DETAIL_BEFORE) && (bxlVar = this.x) != null) {
            bxlVar.a(bxl.DETAIL_BEFORE_STREAM_MISTAKE, str);
            if (TextUtils.equals(str, "1")) {
                this.x.a(bxl.DETAIL_BEFORE_PLAYING_URL, str3);
            }
            this.x.a(bxl.IS_OFFICIAL_LIVE, str4);
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_LINKLIVE_START, uyg.EVENT_LINKLIVE_STOP, "com.taobao.taolive.room.pause_live", "com.taobao.taolive.room.resume_live", "com.taobao.taolive.room.mediaplatform_pause_video", "com.taobao.taolive.room.mediaplatform_resume_video", "com.taobao.taolive.room.mediaplatform_mute_video", "com.taobao.taolive.room.seekto_replay", "com.taolive.taolive.room.mute", "com.taolive.taolive.room.unmute", uyg.EVENT_LINKLIVE_VERIFY_START, uyg.EVENT_LINKLIVE_VERIFY_END, uyg.EVENT_LINKLIVE_QUEUE, "com.taobao.taolive.room.mediaplatform_start_video", "com.taobao.taolive.room.float_view_close", "com.taobao.taolive.room.float_view_add_to_live_room", "com.taobao.taolive.room.start_live_project_screen", "com.taobao.taolive.room.stop_live_project_screen", uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE, uyg.EVENT_PLAY_RATE_CHANGED};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        cdr cdrVar = this.l;
        if (cdrVar == null) {
            return null;
        }
        return cdrVar.C();
    }

    @Override // tb.n8e
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
        } else if (i0()) {
            k0("onDidDisappear");
            V();
            X();
        }
    }

    @Override // tb.f0c
    public void onError(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
            return;
        }
        k0("cdn onError");
        rc.f(this.k, this.l);
    }

    @Override // tb.n8e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (i0()) {
            k0("onPause");
            this.j.T0();
        }
    }

    @Override // tb.n8e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (i0()) {
            k0("onResume");
            this.j.U0();
            this.j.t1();
            if (up6.u0(this.l) && up6.z0(this.l)) {
                this.j.k1();
            }
        }
    }

    @Override // tb.n8e
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (i0()) {
            k0("onStart");
            this.j.V0();
            if (this.s) {
                this.j.U0();
            }
        }
    }

    @Override // tb.n8e
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
        } else if (i0()) {
            k0("onStop");
            this.j.a1(z, this.n);
        }
    }

    @Override // tb.n8e
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
        } else if (i0()) {
            k0("onWillDisappear");
            V();
        }
    }

    @Override // tb.n8e
    public void p(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f073126", new Object[]{this, recModel});
        } else {
            this.n = recModel;
        }
    }

    public final void p0(Map<String, String> map) {
        String str;
        ATaoLiveOpenEntity A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7880e7", new Object[]{this, map});
        } else if (i0()) {
            if (map != null) {
                str = map.get(BaseStatePlayer.KEY_ERROR_CODE);
            } else {
                str = null;
            }
            if (!(!this.h || this.l.A() == null || (A = this.l.A()) == null)) {
                A.accessListener(AccessListenerEnum.playerError, new Object[0]);
            }
            if (!this.B) {
                k6m b2 = l6m.c().b(this.l.p());
                if (b2 != null) {
                    b2.g = a();
                }
                l6m.c().f(this.l.p(), String.valueOf(str));
            }
            bxl bxlVar = this.x;
            if (bxlVar != null) {
                bxlVar.s(this.y, yqq.l(str, 0));
            }
            cdr cdrVar = this.l;
            if (!(cdrVar == null || cdrVar.I0() == null)) {
                this.l.I0().p(yqq.l(str, 0));
            }
            t4w t4wVar = this.m;
            if (t4wVar != null) {
                t4wVar.onVideoError(null, yqq.l(str, 0), 0);
            }
        }
    }

    @Override // tb.n8e
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9069533", new Object[]{this});
        } else if (i0()) {
            k0("switchToLandscape");
        }
    }

    @Override // tb.n8e
    public void r() {
        com.taobao.taolive.room.player.standard.manager.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5fb2ca", new Object[]{this});
        } else if (i0() && (aVar = this.j) != null) {
            aVar.A0();
        }
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff14b838", new Object[]{this});
        } else if (i0()) {
            k0("onLiveStartPlay");
            this.A = System.currentTimeMillis();
            this.j.w1(this);
            M0();
            N0();
            B0();
            t4w t4wVar = this.m;
            if (t4wVar != null) {
                t4wVar.onLiveStartPlay();
            }
        }
    }

    @Override // tb.n8e
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else if (i0()) {
            this.j.H();
        }
    }

    @Override // tb.n8e
    public void t(BaseFrame baseFrame, VideoInfo videoInfo, boolean z) {
        com.taobao.taolive.room.player.standard.manager.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c344d02", new Object[]{this, baseFrame, videoInfo, new Boolean(z)});
        } else if (i0() && (aVar = this.j) != null) {
            aVar.z0(baseFrame, videoInfo, z);
        }
    }

    public final void t0(LiveItem.SpfPlayVideo spfPlayVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea83a6a", new Object[]{this, spfPlayVideo});
            return;
        }
        boolean z = !pvs.g2();
        if (pvs.g2() && spfPlayVideo.playInfo != null) {
            z = true;
        }
        if (spfPlayVideo != null && z) {
            gxa.c(this.l, spfPlayVideo);
            U(1);
            com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
            if (aVar instanceof d) {
                ((d) aVar).V1(spfPlayVideo);
            }
        }
    }

    @Override // tb.n8e
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274cad2e", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
        if (aVar != null) {
            aVar.pause();
        }
    }

    public final void u0(StandardMediaData standardMediaData, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d2ed37", new Object[]{this, standardMediaData, str, str2, str3, str4});
            return;
        }
        U(3);
        com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
        if (aVar instanceof LiveMediaManager) {
            ((LiveMediaManager) aVar).q2(standardMediaData, str, str2, str3, str4);
        }
    }

    @Override // tb.k0e
    public void v(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf508a83", new Object[]{this, layoutParams});
            return;
        }
        FrameLayout frameLayout = this.b;
        if (frameLayout != null && layoutParams != null) {
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void v0(String str, String str2) {
        azd azdVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc640cf1", new Object[]{this, str, str2});
            return;
        }
        cdr cdrVar = this.l;
        if (!(cdrVar == null || cdrVar.A() == null)) {
            ATaoLiveOpenEntity A = this.l.A();
            if (A != null && (azdVar = A.abilityCompontent) != null && ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideReplayLive)) {
                return;
            }
            if (this.l.j() != null) {
                z = this.l.j().Q();
            }
        }
        if (!z) {
            U(2);
            com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
            if (aVar instanceof com.taobao.taolive.room.player.standard.manager.b) {
                ((com.taobao.taolive.room.player.standard.manager.b) aVar).V1(str, str2);
            }
        }
    }

    @Override // tb.k0e
    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09ed862", new Object[]{this, new Integer(i)});
        } else {
            v(new FrameLayout.LayoutParams(-1, i));
        }
    }

    public void w0() {
        String str;
        String str2;
        String str3;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("637f4f79", new Object[]{this});
        } else if (this.n != null) {
            K0();
            String str4 = this.n.initParams.containsKey(yj4.WARMUP_PLAYER_TOKEN) ? this.n.initParams.get(yj4.WARMUP_PLAYER_TOKEN) : null;
            StandardMediaData c0 = c0(this.n);
            String d0 = d0(this.n);
            LiveItem.SpfPlayVideo a2 = ufo.a(this.n.initParams);
            String Z = Z(this.n);
            if (!(a2 == null || (str3 = a2.timeMovingUtParams) == null || (d = fkx.d(str3)) == null)) {
                this.n.initParams.put("timeMovingPcmIdParam", d.getString("pcmId"));
            }
            String e0 = e0();
            String a0 = a0();
            if (d0 != null || c0 != null || a0 != null) {
                if (c0 != null || yqq.e(a0)) {
                    str = "liveUrlList";
                } else {
                    str = yj4.PARAM_LIVE_PLAY_URL;
                }
                u0(c0, a0, str, e0, d0);
            } else if (a2 != null) {
                t0(a2);
            } else if (sj9.s() && znm.k().p()) {
                y0();
            } else if (!yqq.e(Z)) {
                if (yqq.e(this.n.initParams.get(yj4.PARAM_REPLAY_URL_PLAY_MODE))) {
                    str2 = "directReplayUrl";
                } else {
                    str2 = this.n.initParams.get(yj4.PARAM_REPLAY_URL_PLAY_MODE);
                }
                v0(Z, str2);
            } else {
                x0();
            }
            if (pvs.f3()) {
                R0();
            }
            if (!yqq.e(str4)) {
                yrr.c().h(str4, 0L);
            }
        }
    }

    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d7ca0b", new Object[]{this});
            return;
        }
        RecModel recModel = this.n;
        if (recModel != null && recModel.initParams != null && !TextUtils.isEmpty(recModel.liveId)) {
            if (!Boolean.parseBoolean(this.n.initParams.get("cdnPreRequested")) || z9u.SOURCE_UPDOWNSWITCH.equalsIgnoreCase(this.n.initParams.get("livesource"))) {
                RecModel recModel2 = this.n;
                this.f = recModel2.liveId;
                String str = recModel2.accountId;
                String str2 = recModel2.initParams.get(yj4.PARAM_TIMEMOVING_ITEM_ID);
                String str3 = this.n.initParams.get(yj4.PARAM_SJSD_ITEM_ID);
                if (com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE.equalsIgnoreCase(this.n.initParams.get(yj4.PARAM_PRODUCT_TYPE)) || !yqq.e(str2) || !yqq.e(str3)) {
                    k0("看点，屏蔽CDN");
                    return;
                }
                if (this.e == null) {
                    this.e = new c3s(this);
                }
                this.e.b("https://alive-interact.alicdn.com/livedetail/common/" + this.n.liveId);
                k0("preloadVideoByCDN");
                return;
            }
            k0("CDN 前置请求过，忽略");
        }
    }

    @Override // tb.k0e
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73d121d", new Object[]{this});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.b.setPadding(0, 0, 0, 0);
        v(layoutParams);
    }

    public final void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfa2462", new Object[]{this});
        } else {
            znm.k().v(new a());
        }
    }

    @Override // tb.k0e
    public void z(FrameLayout.LayoutParams layoutParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea05647", new Object[]{this, layoutParams, str});
        } else {
            ebt.o(this.b, layoutParams, str);
        }
    }

    @Override // tb.n8e
    public void F(VideoInfo videoInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9cf115b", new Object[]{this, videoInfo, str, str2, str3});
        } else if (i0()) {
            k0("showLive");
            O0();
            H0(videoInfo);
            U(3);
            com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
            if (aVar instanceof LiveMediaManager) {
                aVar.G1(videoInfo);
            }
        }
    }

    public final void H0(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfd9963", new Object[]{this, videoInfo});
        } else if (this.i == 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("liveId", videoInfo.liveId);
            rbu.Q(19999, "compitableHighlightPreload", hashMap);
        }
    }

    public final void K0() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a918bdf3", new Object[]{this});
        } else if (this.j != null && (map = this.n.initParams) != null) {
            if (yqq.i(map.get(yj4.PARAM_LANDSCAPE_VIDEO), false)) {
                int h = (hw0.h() * 9) / 16;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, h);
                int dimensionPixelSize = this.k.getResources().getDimensionPixelSize(R.dimen.taolive_video_top_margin);
                int g = (int) (hw0.g() * 0.2f);
                if (h + g + up6.R(this.l) <= hw0.g()) {
                    dimensionPixelSize = g;
                }
                layoutParams.topMargin = dimensionPixelSize;
                this.j.N1(layoutParams);
                return;
            }
            this.j.M1();
        }
    }

    public final void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf458cf", new Object[]{this});
            return;
        }
        this.j.P1(this.x, e0());
        if (this.x != null) {
            boolean H0 = this.j.H0();
            this.x.a("isSurfaceView", String.valueOf(H0));
            this.x.a("playerStartTimeMs", String.valueOf(this.A));
            k0("onLiveStartPlay isSurfaceView = " + H0);
            if (this.j.D0()) {
                k0("onStatusStart_已经有首帧");
                q0(null, true);
            }
        }
    }

    public final void R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0adfec", new Object[]{this});
        } else if (!this.j.E0() && com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE.equalsIgnoreCase(this.n.initParams.get(yj4.PARAM_PRODUCT_TYPE))) {
            this.j.s1(true);
        }
    }

    public final void X() {
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ef817b", new Object[]{this});
        } else if (d4s.e("enableVideoOffsetRecover", true) && (cdrVar = this.l) != null && cdrVar.N()) {
            k0("video force recover");
            C(0.0f, 0L);
        }
    }

    @Override // tb.n8e
    public void o(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91461c4d", new Object[]{this, str, new Long(j)});
        } else if (i0()) {
            k0("onWillAppear");
            this.z = j;
            D0();
            P0();
            F0();
            A0();
            w0();
            g0();
            this.r = true;
        }
    }

    @Override // tb.n8e
    public void s(VideoInfo videoInfo, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("394ccbb6", new Object[]{this, videoInfo, str, str2});
        } else if (i0()) {
            k0("showReplay");
            O0();
            U(2);
            com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
            if (aVar instanceof com.taobao.taolive.room.player.standard.manager.b) {
                aVar.G1(videoInfo);
            }
        }
    }

    @Override // tb.n8e
    public void x(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ed4068", new Object[]{this, new Long(j)});
        } else if (i0()) {
            k0("onDidAppear");
            this.j.A1(j);
            cdr cdrVar = this.l;
            if (cdrVar != null) {
                cdrVar.D0(this);
            }
            this.g = true;
            j0();
        }
    }

    @Override // tb.n8e
    public void C(float f, long j) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64eeb28", new Object[]{this, new Float(f), new Long(j)});
            return;
        }
        View view = this.f13206a;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", f);
            ofFloat.setDuration(j);
            ofFloat.start();
            cdr cdrVar = this.l;
            if (f == 0.0f) {
                z = false;
            }
            cdrVar.s0(z);
        }
    }

    public final boolean W(JSONObject jSONObject) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e28c698c", new Object[]{this, jSONObject})).booleanValue();
        }
        return (jSONObject == null || (context = this.k) == null || !String.valueOf(context.hashCode()).equals(jSONObject.getString("popId"))) ? false : true;
    }

    @Override // tb.n8e
    public void i(VideoInfo videoInfo, TBLiveBizDataModel tBLiveBizDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba70cc5", new Object[]{this, videoInfo, tBLiveBizDataModel});
        } else if (i0() && videoInfo != null) {
            k0("onGetVideoInfoSuccess");
            this.d = tBLiveBizDataModel;
            if ("2".equalsIgnoreCase(videoInfo.roomStatus) && !yqq.e(videoInfo.replayUrl) && videoInfo.timeMovingPlayInfo == null && pvs.n1() && this.j.E0()) {
                k0("秒开参数失效，房间是回放直播间");
                U(2);
                v0(videoInfo.replayUrl, "mtopReplayUrl");
            }
            Q0(videoInfo.voiceSilent);
            if (!(b0() == null || b0().b() == null)) {
                b0().b().a(!videoInfo.closeXiaochuang);
            }
            this.h = true;
            j0();
        }
    }

    public final void n0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147e80ea", new Object[]{this, str, jSONObject});
        } else if (!this.r || !W(jSONObject)) {
        } else {
            if (IAKPopRender.LifecycleType.BEFORE_CLOSE.equals(str)) {
                q0h.a("StandardVideoFrame", "onPopStateChanged 半屏销毁： " + str);
                this.l.h().c("com.taobao.taolive.inside.detail.close", null, this.l.C());
                if (this.l.j() != null && this.l.j().d()) {
                    this.l.h().c(uyg.d, "assembly", this.l.C());
                }
                this.s = false;
                this.t = false;
                this.j.k1();
                up6.M0(false, this.l);
                cdr cdrVar = this.l;
                if (cdrVar != null) {
                    cdrVar.N0(false);
                }
                if (!this.q) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("scene", bia.UNDER_TAKE_INSIDE_DETAIL);
                    hashMap.put("isMoveUp", "false");
                    sjr.g().c(uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap, observeUniqueIdentification());
                }
                this.q = false;
            } else if (IAKPopRender.LifecycleType.IN_ANIMATION_START.equals(str)) {
                q0h.a("StandardVideoFrame", "onPopStateChanged 半屏打开： " + str);
                this.l.h().c("com.taobao.taolive.inside.detail.open", null, this.l.C());
                HashMap hashMap2 = new HashMap();
                hashMap2.put("scene", bia.UNDER_TAKE_INSIDE_DETAIL);
                hashMap2.put("isMoveUp", "true");
                sjr.g().c(uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap2, observeUniqueIdentification());
                if (this.l.j() != null && this.l.j().d()) {
                    this.l.h().c(uyg.e, "assembly", this.l.C());
                }
                this.s = true;
                this.t = true;
                this.u = false;
                up6.V0(false, this.l);
                up6.M0(true, this.l);
            } else if (IAKPopRender.LifecycleType.OUT_ANIMATION_START.equals(str)) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("scene", bia.UNDER_TAKE_INSIDE_DETAIL);
                hashMap3.put("isMoveUp", "false");
                sjr.g().c(uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap3, observeUniqueIdentification());
                this.q = true;
            }
        }
    }

    @Override // tb.n8e
    public boolean onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6532026", new Object[]{this})).booleanValue();
        }
        if (!i0()) {
            return false;
        }
        k0("onDestroy");
        V();
        return true;
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        Map d;
        com.taobao.taolive.room.player.standard.manager.a aVar;
        VideoInfo videoInfo;
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.EVENT_LINKLIVE_START.equals(str)) {
            if (obj instanceof SurfaceView) {
                this.j.X((SurfaceView) obj);
            } else if ((obj instanceof String) && "force".equals(obj)) {
                this.j.X(null);
            }
        } else if (uyg.EVENT_LINKLIVE_STOP.equals(str)) {
            this.j.V();
        } else if ("com.taobao.taolive.room.pause_live".equals(str)) {
            this.j.k();
        } else if ("com.taobao.taolive.room.resume_live".equals(str)) {
            this.j.l();
        } else if ("com.taobao.taolive.room.mediaplatform_mute_video".equals(str)) {
            if (obj != null) {
                this.j.setMuted(((Boolean) obj).booleanValue());
            }
        } else if ("com.taobao.taolive.room.mediaplatform_pause_video".equals(str)) {
            this.j.k();
        } else if ("com.taobao.taolive.room.mediaplatform_resume_video".equals(str)) {
            this.j.l();
        } else if ("com.taobao.taolive.room.seekto_replay".equals(str)) {
            if (obj != null) {
                this.j.seekTo(((Integer) obj).intValue());
            }
        } else if ("com.taolive.taolive.room.mute".equals(str)) {
            this.j.setMuted(true);
        } else if ("com.taolive.taolive.room.unmute".equals(str)) {
            this.j.setMuted(false);
        } else if ("com.taobao.taolive.room.mediaplatform_start_video".equals(str)) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String str2 = (String) map.get(yj4.PARAM_PLAY_URL);
                String str3 = (String) map.get("type");
                String str4 = (String) map.get(yj4.PARAM_MEDIA_INFO);
                String str5 = (String) map.get(lf9.KEY_VIDEO_ID);
                boolean c2 = zqq.c((String) map.get("loop"));
                int j = zqq.j((String) map.get("startSeekTime"));
                d f0 = f0(this.j);
                if (f0 != null) {
                    f0.U1(this.l, str2, str3, c2, str5, j);
                }
            }
        } else if ("com.taobao.taolive.room.float_view_close".equals(str)) {
            if (ejr.e() && this.t) {
                this.u = true;
                this.j.setMuted(true);
                up6.V0(true, this.l);
                y();
            }
        } else if ("com.taobao.taolive.room.float_view_add_to_live_room".equals(str)) {
            if (ejr.e() && this.t) {
                k0("EVENT_FLOAT_VIEW_ADD_TO_LIVE_ROOM，addVideoView");
                this.j.R();
            }
        } else if ("com.taobao.taolive.room.start_live_project_screen".equals(str)) {
            this.j.F1(this.c, obj);
        } else if ("com.taobao.taolive.room.stop_live_project_screen".equals(str)) {
            this.j.J1(this.c);
        } else if (uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE.equals(str)) {
            if (obj instanceof HashMap) {
                TBLiveBizDataModel tBLiveBizDataModel = this.d;
                if ((tBLiveBizDataModel == null || (videoInfo = tBLiveBizDataModel.mVideoInfo) == null || (cdrVar = this.l) == null || (!videoInfo.landScape && !cdrVar.h && !TextUtils.equals(videoInfo.roomStatus, "2"))) && !vc.j(this.k) && rir.l(this.k.hashCode()) != null) {
                    cdr cdrVar2 = this.l;
                    if (!(cdrVar2 == null || cdrVar2.j() == null || this.l.A().bizCode == null)) {
                        ((HashMap) obj).put("bizCode", this.l.A().bizCode);
                    }
                    rir.l(this.k.hashCode()).q((HashMap) obj, this.w);
                }
            }
        } else if (TextUtils.equals(str, uyg.EVENT_PLAY_RATE_CHANGED) && (d = sr4.d(obj, null)) != null) {
            Object obj2 = d.get("needRecord");
            if (obj2 instanceof String) {
                boolean p = yqq.p((String) obj2);
                cdr cdrVar3 = this.l;
                if (cdrVar3 != null) {
                    cdrVar3.i1(p);
                }
            }
            Object obj3 = d.get("type");
            if ((obj3 instanceof String) && (aVar = this.j) != null) {
                aVar.setPlayRate(Float.parseFloat((String) obj3));
            }
        }
    }

    @Override // tb.f0c
    public void onSuccess(Object obj) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        } else if (this.h) {
            k0("preloadVideoByCDN,detail接口先回来，return");
        } else {
            TBLiveBizDataModel tBLiveBizDataModel = this.d;
            if (tBLiveBizDataModel == null || (videoInfo = tBLiveBizDataModel.mVideoInfo) == null || !videoInfo.liveIsdestroy) {
                k0("cdn onSuccess");
                JSONObject e = mxf.e((String) obj);
                if (e != null && !TextUtils.isEmpty(this.f) && this.f.equals(e.getString("liveId"))) {
                    if (e.getIntValue("roomStatus") == 1 && e.getJSONArray("liveUrlList") != null && !e.getJSONArray("liveUrlList").isEmpty()) {
                        z0(e);
                        u0(StandardMediaData.generate(e), null, "cdnLiveUrlList", null, null);
                        rc.f(this.k, this.l);
                    } else if (2 == e.getIntValue("roomStatus")) {
                        String string = e.getString("replayUrl");
                        if (!yqq.e(string)) {
                            v0(string, "cdnReplayUrl");
                        }
                    }
                }
            } else {
                k0("liveIsDestroy is ture,can not play video");
            }
        }
    }

    public final void q0(Map<String, String> map, boolean z) {
        long j;
        ATaoLiveOpenEntity A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970aa9a4", new Object[]{this, map, new Boolean(z)});
        } else if (i0()) {
            k0("onStatusFirstFrame " + (System.currentTimeMillis() - this.z));
            com.taobao.taolive.room.player.standard.manager.a aVar = this.j;
            if (aVar != null) {
                aVar.I1();
            }
            long j2 = -1;
            if (map != null) {
                j2 = yqq.n(map.get(BaseStatePlayer.KEY_FIRST_FRAME_DECODE_COMPLETE_TS), -1L);
                j = yqq.n(map.get(BaseStatePlayer.KEY_FIRST_FRAME_UPDATE_SCREEN_TS), 0L);
            } else {
                j = 0;
            }
            rc.d(this.k);
            if (!this.B) {
                this.B = true;
                bxl bxlVar = this.x;
                if (bxlVar != null) {
                    bxlVar.l(this.y, j);
                }
                t4w t4wVar = this.m;
                if (t4wVar != null) {
                    if (z) {
                        t4wVar.onFirstFrame(0L, 0L);
                    } else {
                        t4wVar.onFirstFrame(this.z, j2);
                    }
                    this.m.onSurfaceRenderFirstFrame(j);
                }
            }
            cdr cdrVar = this.l;
            if (!(cdrVar == null || cdrVar.A() == null || (A = this.l.A()) == null)) {
                A.accessListener(AccessListenerEnum.playerFirstFrameRender, new Object[0]);
            }
            TBLiveBizDataModel tBLiveBizDataModel = this.d;
            if (tBLiveBizDataModel != null) {
                L0(tBLiveBizDataModel.mVideoInfo);
            }
            cdr cdrVar2 = this.l;
            if (!(cdrVar2 == null || cdrVar2.I0() == null)) {
                this.l.I0().E(this.j.v0());
            }
            C0(j2);
        }
    }

    public final void s0(String str, JSONObject jSONObject) {
        TBLiveBizDataModel tBLiveBizDataModel;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2962cd0d", new Object[]{this, str, jSONObject});
        } else if (!this.r || !W(jSONObject)) {
        } else {
            if (IAKPopRender.WindowState.STD_POP_HALF.equals(str)) {
                q0h.a("StandardVideoFrame", "onWindowStateChanged 商详切换半屏： " + str);
                cdr cdrVar = this.l;
                if (cdrVar != null) {
                    cdrVar.N0(false);
                }
                if (!this.u) {
                    this.j.U0();
                }
                this.s = true;
            } else if (IAKPopRender.WindowState.STD_POP_FULL_SCREEN.equals(str)) {
                q0h.a("StandardVideoFrame", "onWindowStateChanged 商详切换全屏： " + str);
                ilq.b(this.l);
                cdr cdrVar2 = this.l;
                if (cdrVar2 != null) {
                    cdrVar2.N0(true);
                }
                if (this.l.j() != null && this.l.j().d()) {
                    this.l.h().c(uyg.d, "assembly", this.l.C());
                }
                if (!this.u && (tBLiveBizDataModel = this.d) != null && (videoInfo = tBLiveBizDataModel.mVideoInfo) != null) {
                    String str2 = videoInfo.liveId;
                    if (videoInfo.isOfficialType()) {
                        str2 = this.d.mVideoInfo.officialLiveInfo.officialLiveId;
                    }
                    Y(str2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("scene", bia.UNDER_TAKE_INSIDE_DETAIL);
                    hashMap.put("isMoveUp", "false");
                    sjr.g().c(uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap, observeUniqueIdentification());
                    this.s = false;
                }
            }
        }
    }

    @Override // tb.n8e
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("987f86c2", new Object[]{this});
        }
        if (!i0()) {
            return null;
        }
        return this.j.a();
    }
}
