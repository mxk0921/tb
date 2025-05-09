package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.s;
import com.taobao.kirinvideoengine.model.ConfigModel;
import com.taobao.kirinvideoengine.model.EngineModel;
import com.taobao.kirinvideoengine.model.MediaModel;
import com.taobao.mediaplay.model.MediaLiveInfo;
import java.util.HashMap;
import java.util.List;
import tb.d85;
import tb.qic;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i5g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21102a;
    public qic b;
    public EngineModel c;
    public k5g d;
    public m2c e;
    public final ric f = new a();

    static {
        t2o.a(500170798);
    }

    public i5g(Context context) {
        this.f21102a = context;
    }

    public static /* synthetic */ k5g a(i5g i5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k5g) ipChange.ipc$dispatch("c3126dab", new Object[]{i5gVar});
        }
        return i5gVar.d;
    }

    public static /* synthetic */ void b(i5g i5gVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44ea474", new Object[]{i5gVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            i5gVar.n(i, i2, i3);
        }
    }

    public final void c(qic.a aVar, EngineModel engineModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8aa459f", new Object[]{this, aVar, engineModel});
        } else if (engineModel == null) {
            azf.d(this, "buildDWUTInfo", "engineModel为null");
        } else {
            HashMap<String, String> hashMap = engineModel.playExpUTParams;
            if (hashMap != null) {
                aVar.c(hashMap);
            }
            HashMap<String, String> hashMap2 = engineModel.utParams;
            if (hashMap2 != null) {
                aVar.e(hashMap2);
            }
        }
    }

    public final void d(qic.a aVar, ConfigModel configModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713b221b", new Object[]{this, aVar, configModel});
        } else if (configModel == null) {
            azf.d(this, "buildDWVideoConfigInfo", "configModel为null");
        }
    }

    public final void f(s.d dVar, ConfigModel configModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31fb3782", new Object[]{this, dVar, configModel});
        } else if (configModel == null) {
            azf.d(this, "buildTBPlayerConfigInfo", "configModel为null");
        }
    }

    public final void h(s.d dVar, EngineModel engineModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f144bbff", new Object[]{this, dVar, engineModel});
        } else if (engineModel == null) {
            azf.d(this, "buildTBPlayerUTInfo", "engineModel为null");
        } else {
            HashMap<String, String> hashMap = engineModel.playExpUTParams;
            if (hashMap != null) {
                dVar.v = hashMap;
            }
            HashMap<String, String> hashMap2 = engineModel.utParams;
            if (hashMap2 != null) {
                dVar.c0 = hashMap2;
            }
        }
    }

    public final qic i(EngineModel engineModel) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qic) ipChange.ipc$dispatch("330432b5", new Object[]{this, engineModel});
        }
        d85.a aVar = new d85.a((Activity) this.f21102a);
        e(aVar, engineModel.mediaModel);
        d(aVar, engineModel.configModel);
        c(aVar, engineModel);
        azf.b(this, "createEngine", "dw builder设置完成，创建播放器实例");
        qic t = aVar.t();
        MediaModel mediaModel = engineModel.mediaModel;
        if (mediaModel == null || !mediaModel.looping) {
            z = false;
        }
        t.setLooping(z);
        return t;
    }

    public final qic j(EngineModel engineModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qic) ipChange.ipc$dispatch("fdab5aa8", new Object[]{this, engineModel});
        }
        if (engineModel == null) {
            azf.b(this, "createEngine", "engineModel为null");
            return null;
        } else if (engineModel.mediaModel == null) {
            azf.b(this, "createEngine", "engineModel.currentMediaModel为null");
            return null;
        } else {
            ConfigModel configModel = engineModel.configModel;
            if (configModel == null || !configModel.enableVideoTBPlayer) {
                return i(engineModel);
            }
            return k(engineModel);
        }
    }

    public final qic k(EngineModel engineModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qic) ipChange.ipc$dispatch("a0cc5e99", new Object[]{this, engineModel});
        }
        s.d dVar = new s.d();
        Context context = this.f21102a;
        dVar.g = (Activity) context;
        dVar.h = context;
        g(dVar, engineModel.mediaModel);
        f(dVar, engineModel.configModel);
        h(dVar, engineModel);
        azf.d(this, "createEngine", "createTBPlayerEngine，创建播放器实例。playerInfo=" + dVar);
        return new gsr(s.c.c("", dVar));
    }

    public final boolean l() {
        ConfigModel configModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c25b6f53", new Object[]{this})).booleanValue();
        }
        EngineModel engineModel = this.c;
        if (engineModel == null || (configModel = engineModel.configModel) == null) {
            return false;
        }
        return configModel.enablePreDownload;
    }

    public final void n(int i, int i2, int i3) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d1bf1e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.e != null && l()) {
            List<MediaModel> e = this.e.e(this.e.a());
            if (!qz3.a(e)) {
                MediaModel mediaModel = this.c.mediaModel;
                m2c m2cVar = this.e;
                if (m2cVar != null) {
                    str = m2cVar.b();
                } else {
                    str = "";
                }
                n5g.a(str).b(mediaModel, e, this.e, i, i2, i3);
            }
        }
    }

    public void o(k5g k5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fe1029", new Object[]{this, k5gVar});
        } else {
            this.d = k5gVar;
        }
    }

    public qic m(EngineModel engineModel, m2c m2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qic) ipChange.ipc$dispatch("7ae8988a", new Object[]{this, engineModel, m2cVar});
        }
        this.c = engineModel;
        this.e = m2cVar;
        qic j = j(engineModel);
        this.b = j;
        if (j != null) {
            azf.b(this, "initWithEngineModel", "已经创建完成，设置播放器监听");
            this.b.E(this.f);
        }
        return this.b;
    }

    public final void e(qic.a aVar, MediaModel mediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae48df1b", new Object[]{this, aVar, mediaModel});
        } else if (mediaModel == null) {
            azf.d(this, "buildDWVideoMediaInfo", "mediaModel为null");
        } else {
            if (!TextUtils.isEmpty(mediaModel.source)) {
                aVar.setBizCode(mediaModel.source);
            }
            aVar.n(mediaModel.videoPlayScenes);
            String str = mediaModel.mediaType;
            if (!TextUtils.isEmpty(mediaModel.dwInstanceType)) {
                if ("pic".equals(mediaModel.dwInstanceType)) {
                    aVar.j(DWInstanceType.PIC);
                }
            } else if ("DWVideo".equals(str)) {
                aVar.j(DWInstanceType.VIDEO);
            }
            aVar.setVideoId(mediaModel.videoId);
            aVar.f(mediaModel.videoSource);
            aVar.setVideoUrl(mediaModel.videoUrl);
            aVar.setWidth(mediaModel.videoWidth);
            aVar.setHeight(mediaModel.videoHeight);
            aVar.d(mediaModel.videoAspectRatio);
            aVar.g(mediaModel.enableBackgroundPlayVideo);
            aVar.r(mediaModel.enablePauseInBackGround);
            if ("guangguang".equalsIgnoreCase(mediaModel.businessType)) {
                aVar.i(!mediaModel.enableSurfaceView);
            } else {
                aVar.m(mediaModel.enableSurfaceView);
            }
            aVar.k(mediaModel.isLocalVideo);
            Boolean bool = mediaModel.mute;
            if (bool != null) {
                aVar.setMute(bool.booleanValue());
            }
            Boolean bool2 = mediaModel.useShortAudioFocus;
            if (bool2 != null) {
                aVar.a(bool2.booleanValue());
            }
            Boolean bool3 = mediaModel.releaseShortFocusWhenPause;
            if (bool3 != null) {
                aVar.b(bool3.booleanValue());
            }
            if ("DWVideo".equals(str)) {
                aVar.q(2);
            } else if ("live".equals(str)) {
                aVar.q(0);
                aVar.l("TBLive");
            } else if ("audio".equals(str)) {
                aVar.q(2);
                aVar.h(true);
            }
            aVar.p(mediaModel.videoResourceObj);
            aVar.s(mediaModel.controlParams);
            int i = mediaModel.startPos;
            if (i > 0) {
                aVar.o(i);
            }
        }
    }

    public final void g(s.d dVar, MediaModel mediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8870a73a", new Object[]{this, dVar, mediaModel});
        } else if (mediaModel == null) {
            azf.d(this, "buildTBPlayerMediaInfo", "mediaModel为null");
        } else {
            if (!TextUtils.isEmpty(mediaModel.source)) {
                dVar.o = mediaModel.source;
            }
            dVar.n = mediaModel.businessType;
            dVar.W = mediaModel.videoPlayScenes;
            String str = mediaModel.mediaType;
            dVar.Z = DWInstanceType.VIDEO;
            if ("DWVideo".equals(str)) {
                dVar.r = 2;
            } else if ("live".equals(str)) {
                dVar.r = 0;
                dVar.n = "TBLive";
            } else if ("audio".equals(str)) {
                dVar.r = 2;
                dVar.Y = true;
            }
            dVar.m = mediaModel.videoId;
            dVar.j = mediaModel.videoSource;
            dVar.l = mediaModel.videoUrl;
            dVar.x = mediaModel.videoWidth;
            dVar.y = mediaModel.videoHeight;
            dVar.q = mediaModel.videoAspectRatio;
            dVar.X = mediaModel.enableBackgroundPlayVideo;
            dVar.O = mediaModel.enablePauseInBackGround;
            dVar.p = mediaModel.enableSurfaceView;
            dVar.b0 = mediaModel.isLocalVideo;
            Boolean bool = mediaModel.mute;
            if (bool != null) {
                dVar.i = bool.booleanValue();
            }
            Boolean bool2 = mediaModel.useShortAudioFocus;
            if (bool2 != null) {
                dVar.s = bool2.booleanValue();
            }
            Boolean bool3 = mediaModel.releaseShortFocusWhenPause;
            if (bool3 != null) {
                dVar.a0 = bool3.booleanValue();
            }
            dVar.A = mediaModel.looping;
            dVar.w = mediaModel.controlParams;
            dVar.V = mediaModel.videoResourceObj;
            MediaLiveInfo mediaLiveInfo = mediaModel.liveInfo;
            if (mediaLiveInfo != null) {
                try {
                    dVar.U = mediaLiveInfo;
                } catch (Exception e) {
                    azf.c(this, "builderDWVideoConfigInfo mLivePlayControlInfo, ERROR:", e, new Object[0]);
                }
            }
            int i = mediaModel.startPos;
            if (i > 0) {
                dVar.B = i;
            }
            if (mediaModel.canReuse) {
                dVar.l(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements ric {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ric
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else if (i5g.a(i5g.this) != null) {
                i5g.a(i5g.this).onVideoClose();
            }
        }

        @Override // tb.ric
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            } else if (i5g.a(i5g.this) != null) {
                i5g.a(i5g.this).onVideoComplete();
            }
        }

        @Override // tb.ric
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else if (i5g.a(i5g.this) != null) {
                i5g.a(i5g.this).onVideoError(obj, i, i2);
            }
        }

        @Override // tb.ric
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else if (i5g.a(i5g.this) != null) {
                i5g.a(i5g.this).onVideoPause(z);
            }
        }

        @Override // tb.ric
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            } else if (i5g.a(i5g.this) != null) {
                i5g.a(i5g.this).onVideoPlay();
            }
        }

        @Override // tb.ric
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            } else if (i5g.a(i5g.this) != null) {
                i5g.a(i5g.this).onVideoPrepared(obj);
            }
        }

        @Override // tb.ric
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            if (i5g.a(i5g.this) != null) {
                i5g.a(i5g.this).onVideoProgressChanged(i, i2, i3);
            }
            i5g.b(i5g.this, i, i2, i3);
        }

        @Override // tb.ric
        public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            } else if (i5g.a(i5g.this) != null) {
                i5g.a(i5g.this).onVideoScreenChanged(dWVideoScreenType);
            }
        }

        @Override // tb.ric
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            } else if (i5g.a(i5g.this) != null) {
                i5g.a(i5g.this).onVideoSeekTo(i);
            }
        }

        @Override // tb.ric
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            } else if (i5g.a(i5g.this) != null) {
                i5g.a(i5g.this).onVideoStart();
            }
        }

        @Override // tb.ric
        public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
                return;
            }
            azf.d(this, "onVideoInfo", "videotrack video onVideoInfo 2 mp=" + obj + " what = " + j + " extra=" + j2 + " ext=" + j3 + " obj=" + obj2);
            if (i5g.a(i5g.this) != null) {
                if (obj instanceof TaobaoMediaPlayer) {
                    i5g.a(i5g.this).a(((TaobaoMediaPlayer) obj).getPlayUrl());
                }
                i5g.a(i5g.this).b(obj, j, j2, j3, obj2);
            }
        }
    }
}
