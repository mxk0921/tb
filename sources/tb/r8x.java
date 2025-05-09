package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import java.util.Map;
import tb.sce;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r8x implements sce, cub, asc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public s f27200a;
    public sce.a b;
    public Surface c;
    public String f;
    public String i;
    public boolean j;
    public int n;
    public int o;
    public int p;
    public String r;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long d = -1;
    public long e = -1;
    public String g = "";
    public String h = "TBVideo";
    public boolean k = false;
    public boolean l = false;
    public int m = 0;
    public long q = 0;
    public boolean s = false;

    static {
        t2o.a(451936314);
        t2o.a(945815733);
        t2o.a(452985014);
        t2o.a(774897787);
    }

    @Override // tb.sce
    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf1327", new Object[]{this})).floatValue();
        }
        s sVar = this.f27200a;
        if (sVar != null) {
            return (float) sVar.m(1502);
        }
        return 0.0f;
    }

    @Override // tb.sce
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        s sVar = this.f27200a;
        if (sVar != null) {
            sVar.h();
            this.f27200a = null;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ae88b3", new Object[]{this});
            return;
        }
        s sVar = this.f27200a;
        if (sVar != null && this.b != null) {
            this.b.b(this.d, this.e, sVar.m(1501), this.p, this.o, (int) this.q);
        }
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        this.m = 0;
        if (this.u) {
            this.b.e(this.d);
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        } else if (this.v) {
            this.b.c(this.d, i, i2);
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
        } else if (this.y) {
            this.b.a(this.d);
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        } else if (this.w) {
            this.b.f(this.d);
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.m = i;
        if (this.n == 0) {
            this.n = i3;
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
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
        } else if (this.w) {
            this.b.f(this.d);
        }
    }

    @Override // tb.cub
    public void onVideoPlayTimeChanged(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22c0ba6", new Object[]{this, new Long(j)});
        } else if (this.t) {
            HashMap hashMap = new HashMap();
            hashMap.put(tmu.CURRENT_TIME, Float.valueOf(this.m / 1000.0f));
            hashMap.put("duration", Float.valueOf(this.n / 1000.0f));
            hashMap.put("totalPlayTime", Long.valueOf(j));
            this.b.d(this.d, hashMap);
        }
    }

    @Override // tb.sce
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        s sVar = this.f27200a;
        if (sVar != null) {
            sVar.u();
        }
    }

    @Override // tb.sce
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        s sVar = this.f27200a;
        if (sVar != null) {
            sVar.F();
        }
    }

    @Override // tb.sce
    public void setLoop(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.f27200a;
        if (sVar != null) {
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            sVar.C(1011, j);
        }
    }

    @Override // tb.sce
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.f27200a;
        if (sVar != null) {
            sVar.t(z);
        }
    }

    @Override // tb.sce
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            destroy();
        }
    }

    @Override // tb.sce
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d704a", new Object[]{this, str});
        } else if ("timeupdate".equals(str)) {
            this.t = true;
        } else if ("ended".equals(str)) {
            this.u = true;
        } else if ("firstvideoframe".equals(str)) {
            this.x = true;
        } else if ("error".equals(str)) {
            this.v = true;
        } else if ("playing".equals(str)) {
            this.w = true;
        } else if ("pause".equals(str)) {
            this.y = true;
        }
    }

    @Override // tb.sce
    public void c(long j, long j2, String str, Context context, Map<String, Object> map, SurfaceTexture surfaceTexture, sce.a aVar) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91629321", new Object[]{this, new Long(j), new Long(j2), str, context, map, surfaceTexture, aVar});
            return;
        }
        this.d = j;
        this.b = aVar;
        this.e = j2;
        this.f = str;
        this.c = new Surface(surfaceTexture);
        if (map != null) {
            this.k = ((Boolean) map.get("loop")).booleanValue();
            this.j = ((Boolean) map.get("muted")).booleanValue();
            this.g = (String) map.get("video-id");
            this.h = (String) map.get("video-source");
            this.r = (String) map.get("from");
            this.i = (String) map.get("video-play-scenes");
            if (map.get("scenario-type") != null) {
                str2 = (String) map.get("scenario-type");
            } else {
                str2 = "";
            }
            this.s = "0".equals(str2);
            if (map.get("autoplay") == null || !((Boolean) map.get("autoplay")).booleanValue()) {
                z = false;
            }
            this.l = z;
        }
        d(context, this.c);
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        int i2 = (int) j;
        if (i2 != 3) {
            if (i2 == 10001) {
                this.q = j2;
            } else if (i2 == 10008) {
                this.p = (int) j2;
                this.o = (int) j3;
                e();
            }
        } else if (this.x) {
            HashMap hashMap = new HashMap();
            s sVar = this.f27200a;
            int m = sVar != null ? (int) sVar.m(1002) : 0;
            s sVar2 = this.f27200a;
            if (sVar2 != null) {
                i = (int) sVar2.m(1003);
            }
            hashMap.put("originWidth", Integer.valueOf(m));
            hashMap.put("originHeight", Integer.valueOf(i));
            this.b.g(this.d, hashMap);
        }
    }

    public final void d(Context context, Surface surface) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96038dce", new Object[]{this, context, surface});
            return;
        }
        s.d dVar = new s.d();
        dVar.D = surface;
        if (this.s) {
            dVar.h = context;
            dVar.r = 0;
        } else {
            dVar.g = (Activity) context;
            dVar.r = 2;
        }
        if (dVar.r == 2) {
            dVar.m = this.g;
        }
        dVar.j = this.h;
        dVar.o = this.r;
        dVar.l = this.f;
        dVar.i = this.j;
        dVar.A = this.k;
        dVar.W = this.i;
        HashMap<String, String> hashMap = new HashMap<>();
        int z = ja1.z();
        if (z == 0) {
            str = "50";
        } else if (z == 1) {
            str = "100";
        } else if (z == 2) {
            str = "200";
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("_progressTime", str);
            dVar.w = hashMap;
        }
        dVar.t = this;
        dVar.M = this;
        dVar.Q = "weex2";
        dVar.n = "weex2";
        this.f27200a = s.c.c("", dVar);
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "WeexTBVideoImplNew create mTBPlayerInstance finish = " + this.f27200a);
        if (!this.s) {
            this.f27200a.v();
        } else if (this.l) {
            this.f27200a.F();
        }
    }
}
