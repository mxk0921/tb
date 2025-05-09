package tb;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.ali.user.mobile.exception.ErrorCode;
import com.alibaba.security.realidentity.e2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gsr implements qic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final s f20198a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ric f20199a;

        static {
            t2o.a(500170812);
            t2o.a(774897787);
        }

        public a(ric ricVar) {
            this.f20199a = ricVar;
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
            } else {
                this.f20199a.onVideoClose();
            }
        }

        @Override // tb.asc
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            } else {
                this.f20199a.onVideoComplete();
            }
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            } else {
                this.f20199a.onVideoError(iMediaPlayer, i, i2);
            }
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            } else {
                this.f20199a.onVideoInfo(iMediaPlayer, j, j2, j3, obj);
            }
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            } else {
                this.f20199a.onVideoPause(z);
            }
        }

        @Override // tb.asc
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            } else {
                this.f20199a.onVideoPlay();
            }
        }

        @Override // tb.asc
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            } else {
                this.f20199a.onVideoPrepared(iMediaPlayer);
            }
        }

        @Override // tb.asc
        public void onMediaProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                this.f20199a.onVideoProgressChanged(i, i2, i3);
            }
        }

        @Override // tb.asc
        public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
            }
        }

        @Override // tb.asc
        public void onMediaSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            } else {
                this.f20199a.onVideoSeekTo(i);
            }
        }

        @Override // tb.asc
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
            } else {
                this.f20199a.onVideoStart();
            }
        }
    }

    static {
        t2o.a(500170811);
        t2o.a(500170805);
    }

    public gsr(s sVar) {
        this.f20198a = sVar;
    }

    @Override // tb.d9d
    public void A(eub eubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c5800a", new Object[]{this, eubVar});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.D(RSoException.ERROR_LOAD_ASYNC_FAILED, eubVar);
        }
    }

    @Override // tb.d9d
    public void B(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3275fcb", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.y(i, z);
        }
    }

    @Override // tb.w9d
    public void C(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d4a6f0", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.f20198a != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("width", Integer.valueOf(i));
            hashMap.put("height", Integer.valueOf(i2));
            this.f20198a.c("setFrame", hashMap);
        }
    }

    @Override // tb.l2c
    public void D(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3f8e34", new Object[]{this, new Float(f)});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.B(2000, f);
        }
    }

    @Override // tb.d9d
    public void E(ric ricVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9305378c", new Object[]{this, ricVar});
        } else if (ricVar != null) {
            a aVar = new a(ricVar);
            s sVar = this.f20198a;
            if (sVar != null) {
                sVar.D(4009, aVar);
            }
        }
    }

    @Override // tb.w9d
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a703e6c9", new Object[]{this});
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            return sVar.o();
        }
        return null;
    }

    @Override // tb.l4e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.c("commitEndForMultiplexing", null);
        }
    }

    @Override // tb.l4e
    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ad02c0", new Object[]{this, hashMap});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.D(4001, hashMap);
        }
    }

    @Override // tb.d9d
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.c("close", null);
        }
    }

    @Override // tb.w9d
    public void d(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970df4", new Object[]{this, qtbVar});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.D(4014, qtbVar);
        }
    }

    @Override // tb.d9d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.i(0L);
        }
    }

    @Override // tb.l4e
    public void e(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.D(4000, hashMap);
        }
    }

    @Override // tb.d9d
    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c90e80f", new Object[]{this})).longValue();
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            return sVar.m(1501);
        }
        return 0L;
    }

    @Override // tb.d9d
    public void g(dub dubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f202f393", new Object[]{this, dubVar});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.D(e2.A0, dubVar);
        }
    }

    @Override // tb.d9d
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            return (int) sVar.m(1500);
        }
        return 0;
    }

    @Override // tb.w9d
    public Bitmap h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            return sVar.k();
        }
        return null;
    }

    @Override // tb.w9d
    public void i(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a28ef3f", new Object[]{this, dWInstanceType});
        }
    }

    @Override // tb.d9d
    public void j(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9a1d45", new Object[]{this, aubVar});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.D(4010, aubVar);
        }
    }

    @Override // tb.d9d
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aececba2", new Object[]{this, new Integer(i)});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.i(i);
        }
    }

    @Override // tb.l4e
    public void l(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.D(e2.y0, nj9Var);
        }
    }

    @Override // tb.d9d
    public void m(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f6043f", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
        } else if (this.f20198a != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("beginVol", Float.valueOf(f));
            hashMap.put("endVol", Float.valueOf(f2));
            hashMap.put("fadeInTime", Integer.valueOf(i));
            hashMap.put("fadeInInterval", Integer.valueOf(i2));
            this.f20198a.c("volumeFadeInWithCustomParams", hashMap);
        }
    }

    @Override // tb.d9d
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.C(1015, z ? 1L : 0L);
        }
    }

    @Override // tb.l4e
    public Map<String, String> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        try {
            s sVar = this.f20198a;
            if (sVar != null) {
                Object n = sVar.n(4501);
                if (n instanceof Map) {
                    return (Map) n;
                }
            }
        } catch (Exception e) {
            azf.c(this, "getPlayerQos", e, new Object[0]);
        }
        return new HashMap();
    }

    @Override // tb.l4e
    public void p(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcd334", new Object[]{this, hashMap});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.D(4003, hashMap);
        }
    }

    @Override // tb.d9d
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.u();
        }
    }

    @Override // tb.d9d
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.F();
        }
    }

    @Override // tb.l2c
    public void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.v();
        }
    }

    @Override // tb.l4e
    public void q(String str, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a4ec07", new Object[]{this, str, new Boolean(z), hashMap});
        } else if (this.f20198a != null) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("sceneName", str);
            hashMap2.put("immediatelyMarkStart", Boolean.valueOf(z));
            hashMap2.put("utParams", hashMap);
            this.f20198a.c("switchPlayerScene", hashMap2);
        }
    }

    @Override // tb.d9d
    public void r(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34cbf4", new Object[]{this, hashMap});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.c("volumeFadeInWithCustomParams", hashMap);
        }
    }

    @Override // tb.w9d
    public void s(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab315d39", new Object[]{this, imageView});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.D(4016, imageView);
        }
    }

    @Override // tb.d9d
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.y(i, false);
        }
    }

    @Override // tb.d9d
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.E(ErrorCode.CLIENT_NETWORK_ERROR, str);
        }
    }

    @Override // tb.l2c
    public void setLooping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.C(1011, z ? 1L : 0L);
        }
    }

    @Override // tb.d9d
    public void setMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.t(z);
        }
    }

    @Override // tb.l2c
    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.B(2001, f);
        }
    }

    @Override // tb.d9d
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.F();
        }
    }

    @Override // tb.l4e
    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b0754e", new Object[]{this});
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            return sVar.p(ErrorCode.OAUTH_CODE_FAIL);
        }
        return null;
    }

    @Override // tb.d9d
    public void u(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.M(mediaLiveWarmupConfig);
        }
    }

    @Override // tb.d9d
    public void v(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa5ae66", new Object[]{this, map});
        } else if (map != null && !map.isEmpty() && this.f20198a != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            this.f20198a.c("callWithMsg", hashMap);
        }
    }

    @Override // tb.l4e
    public void w(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d03a66", new Object[]{this, hashMap});
            return;
        }
        s sVar = this.f20198a;
        if (sVar != null) {
            sVar.D(4000, hashMap);
        }
    }

    @Override // tb.d9d
    public jgi x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgi) ipChange.ipc$dispatch("8b32bcbe", new Object[]{this});
        }
        return null;
    }

    @Override // tb.d9d
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b343e7c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.d9d
    public void z(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f22ae", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.f20198a;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        sVar.C(1016, j);
    }
}
