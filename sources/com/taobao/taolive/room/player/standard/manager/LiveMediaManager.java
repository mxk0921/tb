package com.taobao.taolive.room.player.standard.manager;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.player.standard.StandardMediaData;
import com.taobao.taolive.room.player.standard.StandardVideoFrame;
import com.taobao.taolive.room.player.standard.TrackMistakeController;
import com.taobao.taolive.room.player.standard.manager.a;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.room.player.standard.state.LiveStatePlayer;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;
import com.taobao.taolive.sdk.ui.component.VideoFrameErrorController;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.b3d;
import tb.btd;
import tb.bxl;
import tb.cba;
import tb.cdr;
import tb.e7w;
import tb.ejr;
import tb.gnk;
import tb.iba;
import tb.k9e;
import tb.mxg;
import tb.pvs;
import tb.rbu;
import tb.rc;
import tb.rjr;
import tb.rnv;
import tb.sjr;
import tb.t0h;
import tb.t2o;
import tb.tz3;
import tb.u0h;
import tb.up6;
import tb.uwt;
import tb.ux9;
import tb.v0h;
import tb.v2s;
import tb.vx9;
import tb.w0h;
import tb.x0h;
import tb.x5t;
import tb.y0h;
import tb.yj4;
import tb.yqq;
import tb.z2h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveMediaManager extends com.taobao.taolive.room.player.standard.manager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_ACTION_SHOW_SWITCH_TIP = "com.taobao.taolive.show.switch.tip";
    public LiveStatePlayer e;
    public boolean f;
    public btd i;
    public int c = 0;
    public boolean d = true;
    public final k9e g = new a();
    public final btd.a h = new c(this);
    public final CopyOnWriteArrayList<b3d> j = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface LiveState {
        public static final int STATE_END = 3;
        public static final int STATE_INITIAL = 0;
        public static final int STATE_LIVING = 1;
        public static final int STATE_PAUSE = 2;
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface ReportMistakeType {
        public static final String TYPE_DETAIL_AFTER = "detailAfter";
        public static final String TYPE_DETAIL_BEFORE = "detailBefore";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements k9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.k9e
        public void onStatusChange(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            } else if (i == 1) {
                LiveMediaManager.X1(LiveMediaManager.this, (TBLiveDataModel) obj);
            } else if (i == 3) {
                LiveMediaManager.T1(LiveMediaManager.this);
            } else if (i == 4) {
                LiveMediaManager.V1(LiveMediaManager.this);
                LiveMediaManager.U1(LiveMediaManager.this);
            } else if (i == 5) {
                LiveMediaManager.W1(LiveMediaManager.this);
            } else if (i == 12) {
                LiveMediaManager.this.W(1);
                LiveMediaManager.T1(LiveMediaManager.this);
            } else if (i == 13) {
                LiveMediaManager.this.W(2);
                LiveMediaManager.this.j1();
                LiveMediaManager.U1(LiveMediaManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements IMediaPlayer.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d91c57f9", new Object[]{this, iMediaPlayer});
                return;
            }
            LiveMediaManager.this.O0("prePlay，onPrepared");
            LiveMediaManager.Y1(LiveMediaManager.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements btd.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(LiveMediaManager liveMediaManager) {
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("112b7ab4", new Object[]{this, str, str2});
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0fc22fc", new Object[]{this, str});
            } else {
                sjr.g().d(LiveMediaManager.EVENT_ACTION_SHOW_SWITCH_TIP);
            }
        }
    }

    static {
        t2o.a(779093169);
    }

    public LiveMediaManager(Context context, cdr cdrVar) {
        super(context, cdrVar);
    }

    public static /* synthetic */ void T1(LiveMediaManager liveMediaManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08b634b", new Object[]{liveMediaManager});
        } else {
            liveMediaManager.k2();
        }
    }

    public static /* synthetic */ void U1(LiveMediaManager liveMediaManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87974a4c", new Object[]{liveMediaManager});
        } else {
            liveMediaManager.j2();
        }
    }

    public static /* synthetic */ void V1(LiveMediaManager liveMediaManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea3314d", new Object[]{liveMediaManager});
        } else {
            liveMediaManager.r2();
        }
    }

    public static /* synthetic */ void W1(LiveMediaManager liveMediaManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15af184e", new Object[]{liveMediaManager});
        } else {
            liveMediaManager.l2();
        }
    }

    public static /* synthetic */ void X1(LiveMediaManager liveMediaManager, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76f1388", new Object[]{liveMediaManager, tBLiveDataModel});
        } else {
            liveMediaManager.m2(tBLiveDataModel);
        }
    }

    public static /* synthetic */ void Y1(LiveMediaManager liveMediaManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c6e650", new Object[]{liveMediaManager});
        } else {
            liveMediaManager.v2();
        }
    }

    public static /* synthetic */ CopyOnWriteArrayList Z1(LiveMediaManager liveMediaManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("f5443b3e", new Object[]{liveMediaManager});
        }
        return liveMediaManager.j;
    }

    public static MediaLiveInfo e2(StandardMediaData standardMediaData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("5af5ea93", new Object[]{standardMediaData});
        }
        if (standardMediaData == null) {
            return null;
        }
        MediaLiveInfo mediaLiveInfo = new MediaLiveInfo();
        mediaLiveInfo.h265 = standardMediaData.h265;
        mediaLiveInfo.rateAdapte = standardMediaData.rateAdapte;
        mediaLiveInfo.edgePcdn = standardMediaData.edgePcdn;
        mediaLiveInfo.anchorId = standardMediaData.anchorId;
        mediaLiveInfo.liveId = standardMediaData.liveId;
        mediaLiveInfo.mediaSourceType = standardMediaData.mediaSourceType;
        mediaLiveInfo.mediaConfig = standardMediaData.mediaConfig;
        mediaLiveInfo.liveUrlListJson = standardMediaData.liveUrlList;
        return mediaLiveInfo;
    }

    public static /* synthetic */ Object ipc$super(LiveMediaManager liveMediaManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1721974827:
                super.H();
                return null;
            case -1664206608:
                super.G1((VideoInfo) objArr[0]);
                return null;
            case -1220682720:
                super.y((Context) objArr[0]);
                return null;
            case 864630566:
                super.R();
                return null;
            case 880109794:
                super.E((ux9) objArr[0], (b3d) objArr[1]);
                return null;
            case 1392331632:
                super.a1(((Boolean) objArr[0]).booleanValue(), (RecModel) objArr[1]);
                return null;
            case 2109718779:
                super.h((ux9) objArr[0], (b3d) objArr[1]);
                return null;
            case 2133689546:
                super.V0();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/standard/manager/LiveMediaManager");
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60d284dc", new Object[]{this})).booleanValue();
        }
        int i = this.c;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a, com.taobao.taolive.room.service.IPlayPublicService
    public void E(ux9 ux9Var, b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347568e2", new Object[]{this, ux9Var, b3dVar});
            return;
        }
        super.E(ux9Var, b3dVar);
        CopyOnWriteArrayList<b3d> copyOnWriteArrayList = this.j;
        if (copyOnWriteArrayList != null && b3dVar != null && !copyOnWriteArrayList.contains(b3dVar)) {
            this.j.add(b3dVar);
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a, com.taobao.taolive.room.service.IPlayPublicService
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995cbfd5", new Object[]{this});
            return;
        }
        super.H();
        e7w.v(this.f13215a.d, this.g);
        t2();
        this.d = true;
        this.j.clear();
        this.c = 0;
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33893726", new Object[]{this});
            return;
        }
        super.R();
        a2();
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.V0();
        this.f = false;
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void X0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7880e7", new Object[]{this, map});
        } else if (J0() && !C0()) {
            C1(VideoFrameErrorController.ErrorViewType.ERROR_STATE_OTHER, b1(map));
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void a1(boolean z, RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52fd4b70", new Object[]{this, new Boolean(z), recModel});
            return;
        }
        super.a1(z, recModel);
        this.f = true;
    }

    public final void a2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d54d418", new Object[]{this});
            return;
        }
        LiveStatePlayer liveStatePlayer = this.e;
        if (liveStatePlayer != null) {
            liveStatePlayer.z(new t0h(this));
            this.e.t(new u0h(this));
            this.e.u(new v0h(this));
            this.e.v(new w0h(this));
            this.e.B(new x0h(this));
            this.e.w(new y0h(this));
        }
    }

    public void b2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70ef47", new Object[]{this, new Integer(i)});
            return;
        }
        O0("changeLiveState,currentState:" + f2(this.c) + ",changeStatus:" + f2(i));
        int i2 = this.c;
        if (i2 == 0) {
            if (i == 1) {
                n2(this.f13215a.m);
            } else if (i == 2) {
                o2(this.f13215a.m);
            } else {
                W0(this.f13215a.m);
            }
            this.c = i;
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.c = i;
                }
            } else if (i == 1) {
                p2();
                n2(this.f13215a.m);
                this.c = i;
                d1();
            } else if (i == 3) {
                W0(this.f13215a.m);
                this.c = i;
            }
        } else if (i == 2) {
            o2(this.f13215a.m);
            this.c = i;
        } else if (i == 3) {
            W0(this.f13215a.m);
            this.c = i;
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231590b3", new Object[]{this});
        } else {
            this.e.R0();
        }
    }

    public final void c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3c4dae", new Object[]{this});
            return;
        }
        LiveStatePlayer liveStatePlayer = this.e;
        if (liveStatePlayer != null) {
            liveStatePlayer.H1(BaseStatePlayer.WarmState.WARMED);
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public BaseStatePlayer d0(Context context, cdr cdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer) ipChange.ipc$dispatch("ecd372ab", new Object[]{this, context, cdrVar});
        }
        LiveStatePlayer liveStatePlayer = new LiveStatePlayer(context, cdrVar);
        this.e = liveStatePlayer;
        return liveStatePlayer;
    }

    public String f2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34250604", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return "STATE_INITIAL";
        }
        if (i == 1) {
            return "STATE_LIVING";
        }
        if (i == 2) {
            return "STATE_PAUSE";
        }
        if (i != 3) {
            return "NONE";
        }
        return "STATE_END";
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a, com.taobao.taolive.room.service.IPlayPublicService
    public void h(ux9 ux9Var, b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbfc0fb", new Object[]{this, ux9Var, b3dVar});
            return;
        }
        super.h(ux9Var, b3dVar);
        CopyOnWriteArrayList<b3d> copyOnWriteArrayList = this.j;
        if (copyOnWriteArrayList != null && b3dVar != null) {
            copyOnWriteArrayList.remove(b3dVar);
        }
    }

    public final void i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70506bf", new Object[]{this});
            return;
        }
        btd btdVar = (btd) rjr.e().d(this.f13215a.d.p(), btd.class);
        this.i = btdVar;
        if (btdVar != null) {
            btdVar.n(this.h);
            cdr cdrVar = this.f13215a.d;
            if (cdrVar != null) {
                this.i.d(cdrVar.i);
            }
            if (vx9.f(this.f13215a.d) != null && (vx9.f(this.f13215a.d) instanceof cba) && ((cba) vx9.f(this.f13215a.d)).f0()) {
                this.i.q(vx9.f(this.f13215a.d));
            }
            this.i.j(up6.L(this.f13215a.d));
            this.i.k(up6.r(this.f13215a.d));
        }
    }

    public final void j2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c1cf6c", new Object[]{this});
            return;
        }
        if (!this.f || w0().f()) {
            if (!ejr.g() || !this.f13215a.d.j().t()) {
                p();
                this.e.I1();
            } else {
                return;
            }
        }
        b2(1);
        CopyOnWriteArrayList<b3d> copyOnWriteArrayList = this.j;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<b3d> it = this.j.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void k2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8abbe00", new Object[]{this});
        } else if (!ejr.g() || !this.f13215a.d.j().t()) {
            b2(2);
            CopyOnWriteArrayList<b3d> copyOnWriteArrayList = this.j;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                Iterator<b3d> it = this.j.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
        }
    }

    public final void l2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac201459", new Object[]{this});
            return;
        }
        b2(3);
        CopyOnWriteArrayList<b3d> copyOnWriteArrayList = this.j;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<b3d> it = this.j.iterator();
            while (it.hasNext()) {
                it.next().onEnd();
            }
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77d7fdc", new Object[]{this});
        } else if (this.e.V() == 3) {
            this.e.a1();
        } else {
            this.e.I1();
        }
    }

    public final void m2(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efa93bd", new Object[]{this, tBLiveDataModel});
            return;
        }
        StringBuilder sb = new StringBuilder("notifyTaoLiveVideoViewConfig,mViewItemId:");
        sb.append(tBLiveDataModel != null ? tBLiveDataModel.mViewItemId : null);
        O0(sb.toString());
    }

    public final void n2(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fefd86c", new Object[]{this, videoInfo});
            return;
        }
        u2(videoInfo);
        if (videoInfo != null) {
            this.e.m1(videoInfo.pushFeature);
        }
        if (this.d) {
            boolean d2 = d2(videoInfo, ReportMistakeType.TYPE_DETAIL_BEFORE);
            O0("onStatusLiving，url错误,isInError():" + I0() + ",isUrlMistake:" + d2);
            if (d2) {
                g0();
            }
            O0("onStatusLiving，创建播放器实例");
            this.e.Y1(e2(StandardMediaData.generate(videoInfo)), null);
            this.e.K();
            O0("onStatusLiving，addVideoView");
            R();
            a.h hVar = this.f13215a;
            String str = "mtopLiveUrlList";
            if (!hVar.p) {
                if (!this.e.z0()) {
                    if (g2()) {
                        str = "mtopLiveUrlListRec";
                    } else if (h2()) {
                        str = "mtopLiveUrlListUserId";
                    }
                    Q1(str, this.f13215a.c);
                }
                O0("onStatusLiving，startPlayerWithBackupPackage");
                H1(d2);
            } else {
                Q1(str, hVar.c);
            }
            E1();
            return;
        }
        g0();
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public int o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("663b319f", new Object[]{this})).intValue();
        }
        return 3;
    }

    public final void o2(VideoInfo videoInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310c1181", new Object[]{this, videoInfo});
            return;
        }
        boolean c0 = c0(videoInfo);
        StringBuilder sb = new StringBuilder("onStatusPause,isLivePunish:");
        sb.append(videoInfo != null ? Boolean.valueOf(c0) : null);
        O0(sb.toString());
        if (c0) {
            str = VideoFrameErrorController.ErrorViewType.LIVE_PUNISH;
        } else {
            str = VideoFrameErrorController.ErrorViewType.ANCHOR_LEAVE;
        }
        C1(str, null);
        a.h hVar = this.f13215a;
        if (hVar != null) {
            rc.f(hVar.e, hVar.d);
        }
        g0();
    }

    public final void p() {
        LiveStatePlayer liveStatePlayer;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5eab28", new Object[]{this});
        } else if (pvs.i3() && (liveStatePlayer = this.e) != null && !liveStatePlayer.W0()) {
            O0("当前直播播放信息不合法，需要重置播放器数据");
            a.h hVar = this.f13215a;
            if (hVar != null && (videoInfo = hVar.m) != null) {
                this.e.Y1(e2(StandardMediaData.generate(videoInfo)), null);
            }
        }
    }

    public final void p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6131c7f1", new Object[]{this});
        } else if (pvs.y0() && q0() == 2) {
            g0();
        }
    }

    public final void r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af4d16d", new Object[]{this});
            return;
        }
        LiveStatePlayer liveStatePlayer = this.e;
        if (liveStatePlayer != null) {
            liveStatePlayer.A(RoomPlayerObserver.CommonRoomPlayerEventType.PM_REFRESH_PLAY, null);
        }
    }

    public final void s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60592f9a", new Object[]{this});
            return;
        }
        LiveStatePlayer liveStatePlayer = this.e;
        if (liveStatePlayer != null) {
            liveStatePlayer.z(new b());
        }
    }

    public final void t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18378866", new Object[]{this});
            return;
        }
        btd btdVar = this.i;
        if (btdVar != null) {
            btdVar.g();
        }
    }

    public final void u2(VideoInfo videoInfo) {
        MediaData b2;
        ArrayList<MediaData.QualityLiveItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f338cd5f", new Object[]{this, videoInfo});
        } else if ((this.e.V() == 2 || this.e.V() == 3 || this.e.V() == 5) && (b2 = mxg.b(videoInfo)) != null && (arrayList = b2.liveUrlList) != null) {
            this.e.h2(arrayList, IMediaPlayer.UpdataUrlListMode.REPLACE_FORCE_OF_NEW_DEFINITION);
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a, com.taobao.taolive.room.player.standard.TrackMistakeController.b
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e21febc", new Object[]{this});
            return;
        }
        O0("串流监控checkMistake,在detail后");
        d2(this.f13215a.m, ReportMistakeType.TYPE_DETAIL_AFTER);
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a, com.taobao.taolive.room.service.IPlayPublicService
    public void y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73ddc20", new Object[]{this, context});
            return;
        }
        super.y(context);
        this.d = false;
    }

    public void q2(StandardMediaData standardMediaData, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8197c67e", new Object[]{this, standardMediaData, str, str2, str3, str4});
            return;
        }
        O0("prePlay，cell预创建播放器实例");
        if (this.d) {
            this.e.Y1(e2(standardMediaData), str);
            s2();
            this.e.c2(true);
            if (standardMediaData != null || !yqq.e(str)) {
                this.e.L(null);
            } else {
                this.e.L(str4);
            }
            boolean z0 = this.e.z0();
            if (z0 && !TextUtils.isEmpty(str3)) {
                str2 = str3;
            }
            O0("prePlay，设置urlPlayMode：" + str2 + "， mIsReuseInstance：" + z0 + "create source: " + this.e.S());
            Q1(str2, this.f13215a.c);
            long i0 = this.e.i0();
            boolean B0 = this.e.B0();
            O0("prePlay,兜底播放，pre的时候调用start,mLiveStatePlayer.getVideoState():" + i0 + ",mLiveStatePlayer.isWarmIpInstance():" + B0);
            if (B0) {
                O0("prePlay,兜底播放，预热实例，需要STATE_PREPARED 起播。pre的时候调用start,videoState:" + i0);
                if (i0 == 5) {
                    c2();
                    e1();
                }
            } else {
                O0("prePlay,兜底播放，非预热实例直接调用start");
                e1();
            }
            this.e.n1(true);
            O0("prePlay，addVideoView");
            R();
        }
    }

    public final void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7067949", new Object[]{this});
            return;
        }
        LiveStatePlayer liveStatePlayer = this.e;
        if (liveStatePlayer != null) {
            boolean B0 = liveStatePlayer.B0();
            O0("setPreparedListener,onPrepared,mLiveStatePlayer.isWarmIpInstance():" + B0 + ",mLiveStatePlayer.getVideoState():" + this.e.i0());
            if (B0) {
                long i0 = this.e.i0();
                if (i0 != 1) {
                    if (i0 == 5) {
                        c2();
                    }
                    O0("onPrepared时，兜底播放，warm状态的实例未起播setPreparedListener,onPrepared,videoState:" + i0);
                    D1(false);
                }
            }
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void G1(VideoInfo videoInfo) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cce38f0", new Object[]{this, videoInfo});
            return;
        }
        O0("startPlay");
        super.G1(videoInfo);
        if (videoInfo != null) {
            this.d = !videoInfo.liveIsdestroy;
            if (z2h.a(videoInfo) || (i = videoInfo.status) == 3) {
                this.c = 2;
                o2(videoInfo);
            } else if (i == 0) {
                this.c = 1;
                n2(videoInfo);
            } else {
                this.c = 3;
                W0(videoInfo);
            }
            cdr cdrVar = this.f13215a.d;
            if (cdrVar != null) {
                e7w.r(cdrVar, this.g);
                i2();
            }
            k1();
        }
    }

    public final boolean d2(VideoInfo videoInfo, String str) {
        LiveStatePlayer liveStatePlayer;
        TrackMistakeController.c cVar;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d6eb2bd", new Object[]{this, videoInfo, str})).booleanValue();
        }
        if (!pvs.y() || (liveStatePlayer = this.e) == null) {
            return false;
        }
        ArrayList<QualitySelectItem> arrayList = videoInfo.liveUrlList;
        String g = rnv.g(liveStatePlayer.c0());
        if (!pvs.R() || (!TextUtils.isEmpty(g) && !tz3.a(arrayList))) {
            boolean c2 = rnv.c(g, arrayList);
            a.h hVar = this.f13215a;
            if (!(hVar == null || (cVar = hVar.t) == null)) {
                if (c2) {
                    str2 = "0";
                } else {
                    str2 = "1";
                }
                ((StandardVideoFrame) cVar).o0(str2, str, this.e.c0(), String.valueOf(gnk.a().e(videoInfo)));
            }
            if (c2) {
                return false;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("liveId", videoInfo.liveId);
            hashMap.put("liveSource", iba.B(vx9.f(this.f13215a.d)));
            hashMap.put("entryLiveSource", up6.r(this.f13215a.d));
            hashMap.put("liveDetailTopicID", rnv.h(arrayList));
            hashMap.put("playingTopicID", g);
            hashMap.put(bxl.IS_OFFICIAL_LIVE, String.valueOf(gnk.a().e(videoInfo)));
            if (v2s.o().s() != null) {
                v2s.o().s().a("StreamMistake", "Page_TaobaoLiveWatch", hashMap);
            }
            uwt.a(hashMap);
            rbu.K(this.f13215a.d, "StreamMistake", hashMap);
            x5t.h("StreamMistake", "liveId = " + videoInfo.liveId + " liveSource = " + iba.B(vx9.f(this.f13215a.d)) + " entryLiveSource = " + iba.q(vx9.f(this.f13215a.d)) + " playingUrl = " + this.e.c0());
            return true;
        }
        StringBuilder sb = new StringBuilder("串流监控checkPlayingUrlNew，playingTopicID: ");
        sb.append(g);
        sb.append(", liveUrlList.size: ");
        sb.append(arrayList != null ? arrayList.size() : 0);
        O0(sb.toString());
        return false;
    }

    public final boolean g2() {
        cdr cdrVar;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4688e47", new Object[]{this})).booleanValue();
        }
        a.h hVar = this.f13215a;
        return (hVar == null || (cdrVar = hVar.d) == null || cdrVar.w0() == null || (map = this.f13215a.d.w0().initParams) == null || !TextUtils.isEmpty(map.get("id")) || !Boolean.parseBoolean(map.get(yj4.PARAM_NEED_RECOMMEND))) ? false : true;
    }

    public final boolean h2() {
        cdr cdrVar;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce3f1c9b", new Object[]{this})).booleanValue();
        }
        a.h hVar = this.f13215a;
        return (hVar == null || (cdrVar = hVar.d) == null || cdrVar.w0() == null || (map = this.f13215a.d.w0().initParams) == null || !TextUtils.isEmpty(map.get("id")) || TextUtils.isEmpty(map.get("userId"))) ? false : true;
    }

    public LiveMediaManager(a.h hVar) {
        super(hVar);
    }
}
