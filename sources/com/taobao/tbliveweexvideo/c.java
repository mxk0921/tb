package com.taobao.tbliveweexvideo;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaAdapteManager;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.tbliveweexvideo.a;
import tb.r7t;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c extends com.taobao.tbliveweexvideo.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TaoLiveVideoView f13385a;
    public final r7t b;
    public final boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f = false;
    public a.AbstractC0765a g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements TaoLiveVideoView.p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.p
        public void onSurfaceCreated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8a0fcc1", new Object[]{this});
            } else if (c.t(c.this) && c.u(c.this)) {
                c.w(c.this).start();
                c.v(c.this, false);
            }
        }

        @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.p
        public void onSurfaceDestroyed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931706f2", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements IMediaPlayer.OnCompletionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
            } else if (c.x(c.this) != null) {
                c.x(c.this).onComplete();
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tbliveweexvideo.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class C0766c implements IMediaPlayer.OnErrorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0766c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (c.x(c.this) != null) {
                c.x(c.this).a(i2);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements TaoLiveVideoView.n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.n
        public void I(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
            } else if (c.x(c.this) != null) {
                c.x(c.this).onStart();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements TaoLiveVideoView.m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.m
        public void v(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
            } else if (c.x(c.this) != null) {
                c.x(c.this).onPause();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements IMediaPlayer.OnInfoListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            int i = (int) j;
            if (i != 3) {
                if (i != 701) {
                    if (i == 702 && c.x(c.this) != null) {
                        c.x(c.this).c();
                    }
                } else if (c.x(c.this) != null) {
                    c.x(c.this).b();
                }
            } else if (c.x(c.this) != null) {
                c.x(c.this).onFirstFrameRendered();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements IMediaPlayer.OnPreparedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
            } else if (c.x(c.this) != null) {
                c.x(c.this).onPrepared();
            }
        }
    }

    public c(Context context, boolean z, String str, r7t r7tVar) {
        int i = 0;
        this.c = z;
        if (r7tVar != null) {
            this.b = r7tVar;
            r7tVar.c = 3;
        } else {
            r7t r7tVar2 = new r7t("AliWeexVideo");
            this.b = r7tVar2;
            r7tVar2.B = str;
        }
        r7t r7tVar3 = this.b;
        r7tVar3.e = 2;
        r7tVar3.d = !z ? 2 : i;
        TaoLiveVideoView taoLiveVideoView = new TaoLiveVideoView(context);
        this.f13385a = taoLiveVideoView;
        if (r7tVar != null) {
            taoLiveVideoView.setConfigAdapter(MediaAdapteManager.mConfigAdapter);
        }
        taoLiveVideoView.initConfig(this.b);
        taoLiveVideoView.setSurfaceListener(new a());
        taoLiveVideoView.registerOnCompletionListener(new b());
        taoLiveVideoView.registerOnErrorListener(new C0766c());
        taoLiveVideoView.registerOnStartListener(new d());
        taoLiveVideoView.registerOnPauseListener(new e());
        taoLiveVideoView.registerOnInfoListener(new f());
        taoLiveVideoView.registerOnPreparedListener(new g());
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbliveweexvideo/NormalVideoView");
    }

    public static /* synthetic */ boolean t(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f8a9bf3", new Object[]{cVar})).booleanValue();
        }
        return cVar.d;
    }

    public static /* synthetic */ boolean u(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6315b9b4", new Object[]{cVar})).booleanValue();
        }
        return cVar.e;
    }

    public static /* synthetic */ boolean v(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2f57b66", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.e = z;
        return z;
    }

    public static /* synthetic */ TaoLiveVideoView w(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveVideoView) ipChange.ipc$dispatch("e79f3377", new Object[]{cVar});
        }
        return cVar.f13385a;
    }

    public static /* synthetic */ a.AbstractC0765a x(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.AbstractC0765a) ipChange.ipc$dispatch("b163f286", new Object[]{cVar});
        }
        return cVar.g;
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f13385a.release();
        }
    }

    @Override // com.taobao.tbliveweexvideo.a
    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf132b", new Object[]{this})).longValue();
        }
        if (this.c) {
            return 0L;
        }
        return this.f13385a.getCurrentPosition() / 1000;
    }

    @Override // com.taobao.tbliveweexvideo.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44bd39c0", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    @Override // com.taobao.tbliveweexvideo.a
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        return this.f13385a.getVideoHeight();
    }

    @Override // com.taobao.tbliveweexvideo.a
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        return this.f13385a.getVideoWidth();
    }

    @Override // com.taobao.tbliveweexvideo.a
    public View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f13385a;
    }

    @Override // com.taobao.tbliveweexvideo.a
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        return this.f13385a.isPlaying();
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.f13385a.pause();
        }
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            this.f13385a.start();
        }
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78a5cf5", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f105f79", new Object[]{this, new Long(j)});
        } else if (!this.c) {
            this.f13385a.seekTo((int) j);
        }
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae57e54", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else if (!this.c) {
            this.f13385a.setLooping(z);
        }
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        this.f13385a.setMuted(z);
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void p(a.AbstractC0765a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45aa0769", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88834e99", new Object[]{this, str});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.a renderView = this.f13385a.getRenderView();
        if (renderView == null) {
            return;
        }
        if ("contain".equals(str)) {
            renderView.setAspectRatio(0);
        } else if ("cover".equals(str)) {
            renderView.setAspectRatio(1);
        }
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            this.f13385a.setVideoPath(str);
        }
    }

    @Override // com.taobao.tbliveweexvideo.a
    public void s(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f2)});
        } else {
            this.f13385a.setVolume(f2, f2);
        }
    }
}
