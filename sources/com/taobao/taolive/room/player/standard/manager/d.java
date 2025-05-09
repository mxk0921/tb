package com.taobao.taolive.room.player.standard.manager;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.taolive.room.player.standard.manager.a;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.Map;
import tb.bxl;
import tb.cdr;
import tb.fxa;
import tb.ryp;
import tb.sjr;
import tb.t2o;
import tb.wwa;
import tb.yj4;
import tb.ytt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ytt d;

    static {
        t2o.a(779093182);
    }

    public d(a.h hVar) {
        super(hVar);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1721974827) {
            super.H();
            return null;
        } else if (hashCode == -1664206608) {
            dVar.G1((VideoInfo) objArr[0]);
            return null;
        } else if (hashCode == 2071494887) {
            super.X0((Map) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/player/standard/manager/TimeMoveMediaManager");
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60d284dc", new Object[]{this})).booleanValue();
        }
        return this.d.o0();
    }

    @Override // com.taobao.taolive.room.player.standard.manager.e, com.taobao.taolive.room.player.standard.manager.a, com.taobao.taolive.room.service.IPlayPublicService
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995cbfd5", new Object[]{this});
        } else {
            super.H();
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        O0("看点，onResume");
        if (w0() == null || !w0().f()) {
            if (!this.c) {
                l();
            }
        } else if (w0() != null) {
            w0().e();
        }
        if (w0() != null) {
            w0().c();
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public void X0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7880e7", new Object[]{this, map});
            return;
        }
        super.X0(map);
        if (J0()) {
            sjr.g().c(FullScreenFrame.EVENT_BACK_TO_LIVE, null, this.f13215a.d.C());
            Context context = this.f13215a.e;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new c(this));
            }
        }
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public BaseStatePlayer d0(Context context, cdr cdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer) ipChange.ipc$dispatch("ecd372ab", new Object[]{this, context, cdrVar});
        }
        ytt yttVar = new ytt(context, cdrVar);
        this.d = yttVar;
        return yttVar;
    }

    @Override // com.taobao.taolive.room.player.standard.manager.a
    public int o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("663b319f", new Object[]{this})).intValue();
        }
        return 1;
    }

    public void V1(LiveItem.SpfPlayVideo spfPlayVideo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0b4a95", new Object[]{this, spfPlayVideo});
            return;
        }
        O0("看点，prePlay");
        if (!TextUtils.isEmpty(spfPlayVideo.playInfo)) {
            this.d.l1(true);
            String str2 = this.f13215a.d.w0().initParams.get(yj4.P2FF_REUSE_TOKEN);
            if (str2 != null) {
                this.d.e0().m(true);
            }
            if (TextUtils.equals(ryp.FILE_TYPE_VIDEO_MP4, spfPlayVideo.videoType)) {
                this.d.Y1(null, spfPlayVideo.playInfo);
            } else {
                this.d.Y1(spfPlayVideo.playInfo, null);
            }
            this.d.M(str2, null);
            if (this.d.e0().f == 3) {
                this.d.W1();
                str = "timeMovingP2ff";
            } else {
                str = "timeMovingSpfPlayVideo";
            }
            e1();
            Q1(str, this.f13215a.c);
            O0("看点，prePlay，addVideoView，url_play_mode:".concat(str));
            R();
            this.d.n1(true);
        }
    }

    public void U1(cdr cdrVar, String str, String str2, boolean z, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba43a056", new Object[]{this, cdrVar, str, str2, new Boolean(z), str3, new Integer(i)});
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str3)) {
            String str4 = this.d.e0().l;
            String str5 = this.d.e0().m;
            if ((str == null || !str.equalsIgnoreCase(str4)) && (str3 == null || !str3.equalsIgnoreCase(str5))) {
                this.d.A1("TimeMovingPlay");
                this.d.l1(z);
                this.d.y1(i);
                IMediaPlayer.AspectRatio e0 = e0();
                ytt yttVar = this.d;
                if (e0 == null) {
                    e0 = IMediaPlayer.AspectRatio.CENTER_CROP;
                }
                yttVar.V1(str, str3, e0);
                S(true);
                if (r0() != null) {
                    if (cdrVar != null && (cdrVar.l() instanceof wwa)) {
                        ((wwa) cdrVar.l()).c = 0;
                    }
                    r0().setPlayRateDefault();
                    return;
                }
                return;
            }
            O0("看点切换视频异常，changeStream，playUrl=" + str + ",videoID=" + str3 + ", url:" + str + ", videoId: " + str3);
        }
    }

    public void W1(VideoInfo videoInfo, fxa fxaVar) {
        String str;
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03653a", new Object[]{this, videoInfo, fxaVar});
            return;
        }
        O0("看点startPlay");
        G1(videoInfo);
        this.d.l1(true);
        k1();
        if (r0() != null) {
            r0().setPlayRateDefault();
        }
        if (fxaVar != null) {
            String str3 = this.d.e0().l;
            String str4 = this.d.e0().m;
            if (TextUtils.equals(ryp.FILE_TYPE_VIDEO_MP4, fxaVar.f19609a)) {
                str = fxaVar.b;
                str2 = null;
            } else {
                str2 = fxaVar.b;
                str = null;
            }
            if ((str == null || !str.equalsIgnoreCase(str4)) && (str2 == null || !str2.equalsIgnoreCase(str3))) {
                this.d.N(0L);
            } else {
                O0("看点，匹配秒开，继续播");
                z = false;
            }
            if (this.d.V() == 4) {
                bxl bxlVar = this.f13215a.b;
                if (bxlVar != null) {
                    bxlVar.z("mtopTimeMovingUrl");
                    a.h hVar = this.f13215a;
                    hVar.b.u(hVar.c);
                }
                if (!TextUtils.isEmpty(str)) {
                    this.d.Y1(null, str);
                } else {
                    this.d.Y1(str2, null);
                }
                this.d.K();
                H1(z);
                O0("看点，startPlay，startPlayerWithBackupPackage，addVideoView");
                R();
            }
        }
    }
}
