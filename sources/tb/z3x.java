package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.b;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import java.util.HashMap;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z3x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32514a;
    public boolean b;
    public s d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public asc k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f32515a;
        public final /* synthetic */ WeexInstance b;
        public final /* synthetic */ int c;
        public final /* synthetic */ f4x d;

        public a(f4x f4xVar, WeexInstance weexInstance, int i, f4x f4xVar2) {
            this.f32515a = f4xVar;
            this.b = weexInstance;
            this.c = i;
            this.d = f4xVar2;
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
            }
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
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
            } else if (z3x.g(z3x.this)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(tmu.CURRENT_TIME, (Object) Integer.valueOf(i));
                jSONObject.put("totalPlayTime", (Object) Integer.valueOf(i3));
                jSONObject.put("duration", (Object) Integer.valueOf(i / 1000));
                this.b.dispatchNodeEvent(this.c, "timeupdate", b.e().b(jSONObject));
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
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
                return;
            }
            if (z3x.f(z3x.this)) {
                this.b.dispatchNodeEvent(this.c, "pause", b.e().b(new JSONObject()));
            }
            this.b.dispatchNodeEvent(this.c, "ended", b.e().b(new JSONObject()));
            z3x.e(z3x.this, true);
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
                return;
            }
            z3x.e(z3x.this, false);
            if (z3x.f(z3x.this)) {
                this.b.dispatchNodeEvent(this.c, "pause", b.e().b(new JSONObject()));
            }
        }

        @Override // tb.asc
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
                return;
            }
            z3x.e(z3x.this, false);
            if (z3x.d(z3x.this)) {
                this.b.dispatchNodeEvent(this.c, "play", b.e().b(new JSONObject()));
            }
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) Integer.valueOf(i));
            jSONObject.put("message", (Object) Integer.valueOf(i2));
            this.d.b(jSONObject);
        }

        @Override // tb.asc
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
                return;
            }
            if (z3x.a(z3x.this) > 0 && z3x.b(z3x.this) != null) {
                z3x.b(z3x.this).y(z3x.a(z3x.this), false);
            }
            if (z3x.b(z3x.this) != null) {
                z3x.b(z3x.this).t(z3x.c(z3x.this));
            }
            this.f32515a.b(new JSONObject());
            if (z3x.d(z3x.this)) {
                this.b.dispatchNodeEvent(this.c, "play", b.e().b(new JSONObject()));
            }
        }
    }

    public static /* synthetic */ int a(z3x z3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a86e1b2", new Object[]{z3xVar})).intValue();
        }
        return z3xVar.h;
    }

    public static /* synthetic */ s b(z3x z3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("fb01407d", new Object[]{z3xVar});
        }
        return z3xVar.d;
    }

    public static /* synthetic */ boolean c(z3x z3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a362da81", new Object[]{z3xVar})).booleanValue();
        }
        return z3xVar.i;
    }

    public static /* synthetic */ boolean d(z3x z3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fd0d6e0", new Object[]{z3xVar})).booleanValue();
        }
        return z3xVar.f;
    }

    public static /* synthetic */ boolean e(z3x z3xVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631f3e7f", new Object[]{z3xVar, new Boolean(z)})).booleanValue();
        }
        z3xVar.b = z;
        return z;
    }

    public static /* synthetic */ boolean f(z3x z3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78accf9e", new Object[]{z3xVar})).booleanValue();
        }
        return z3xVar.g;
    }

    public static /* synthetic */ boolean g(z3x z3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("151acbfd", new Object[]{z3xVar})).booleanValue();
        }
        return z3xVar.e;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.d != null) {
            if (this.k != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("IMediaPlayLifecycleListener", this.k);
                this.d.c("unRegisterIMediaPlayLifecycleListener", hashMap);
            }
            this.d.h();
            this.d = null;
        }
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf132a", new Object[]{this})).intValue();
        }
        s sVar = this.d;
        if (sVar != null) {
            return (int) sVar.m(1502);
        }
        return 0;
    }

    public long m() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        s sVar = this.d;
        if (sVar != null) {
            i = (int) sVar.m(1501);
        }
        return i;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3dda43b", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean o() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
        }
        s sVar = this.d;
        if (sVar != null) {
            if (sVar.m(1007) == 1) {
                z = true;
            }
            this.i = z;
        }
        return this.i;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0d383", new Object[]{this})).booleanValue();
        }
        s sVar = this.d;
        if (sVar == null || sVar.m(1500) != 1) {
            return true;
        }
        return false;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        s sVar = this.d;
        if (sVar != null) {
            sVar.u();
        }
    }

    public void r(WeexInstance weexInstance, int i, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbaf3b13", new Object[]{this, weexInstance, new Integer(i), f4xVar, f4xVar2});
            return;
        }
        s sVar = this.d;
        if (sVar != null) {
            a aVar = new a(f4xVar, weexInstance, i, f4xVar2);
            this.k = aVar;
            sVar.D(4009, aVar);
            this.d.F();
        }
    }

    public void t(boolean z) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f32514a = z;
        if (p() && (sVar = this.d) != null) {
            sVar.F();
        }
    }

    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f105bb8", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = i * 1000;
        this.h = i2;
        s sVar = this.d;
        if (sVar != null) {
            sVar.y(i2, false);
        }
    }

    public void v(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.d;
        if (sVar != null) {
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            sVar.C(1011, j);
        }
    }

    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i = z;
        s sVar = this.d;
        if (sVar != null) {
            sVar.t(z);
        }
    }

    public void x(WeexInstance weexInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546f011", new Object[]{this, weexInstance, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", (Object) str);
        k();
        j(weexInstance, jSONObject);
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a8b91e", new Object[]{this, str});
        } else if ("timeupdate".equals(str)) {
            this.e = true;
        } else if ("play".equals(str)) {
            this.f = true;
        } else if ("pause".equals(str)) {
            this.g = true;
        }
    }

    public void j(WeexInstance weexInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb098cb1", new Object[]{this, weexInstance, jSONObject});
            return;
        }
        String string = jSONObject.getString("src");
        s.d dVar = new s.d();
        dVar.g = (Activity) weexInstance.getContext();
        dVar.l = string;
        dVar.Y = true;
        dVar.j = "NonTBVideo";
        dVar.X = true;
        dVar.Q = "weexOldAudio";
        dVar.n = "weexOldAudio";
        s c = s.c.c("", dVar);
        this.d = c;
        if (this.f32514a) {
            c.F();
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc5d65b", new Object[]{this, str});
        } else if ("timeupdate".equals(str)) {
            this.e = false;
        } else if ("play".equals(str)) {
            this.f = false;
        } else if ("pause".equals(str)) {
            this.g = false;
        }
    }
}
