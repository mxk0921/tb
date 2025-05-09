package com.taobao.avplayer;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.abk;
import tb.asc;
import tb.c2v;
import tb.feh;
import tb.l95;
import tb.nj9;
import tb.psb;
import tb.t2o;
import tb.tfb;
import tb.utb;
import tb.vtb;
import tb.xau;
import tb.ytb;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MediaPlayCenter f10159a;
    public final asc b;
    public final DWContext c;
    public final String d;
    public final String e;
    public long f;
    public long g;
    public boolean h;
    public List<IMediaPlayer.OnCompletionListener> i;
    public List<IMediaPlayer.OnPreparedListener> j;
    public List<IMediaPlayer.OnErrorListener> k;
    public List<IMediaPlayer.OnInfoListener> l;
    public List<TaoLiveVideoView.n> m;
    public List<TaoLiveVideoView.m> n;
    public feh o = new feh(toString(), "");
    public boolean p;
    public boolean q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f10160a;
        public String b;

        static {
            t2o.a(452984928);
        }

        public a(Activity activity) {
            b bVar = new b();
            this.f10160a = bVar;
            bVar.f10161a = activity;
            bVar.s = "dwLiveNew";
        }

        public a A(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("48df2dd2", new Object[]{this, new Boolean(z)});
            }
            this.f10160a.m = z;
            return this;
        }

        public a B(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("663e0519", new Object[]{this, hashMap});
            }
            this.f10160a.A = hashMap;
            return this;
        }

        public a C(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6a7da8af", new Object[]{this, new Boolean(z)});
            }
            this.f10160a.j = z;
            return this;
        }

        public a D(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f16e368", new Object[]{this, new Boolean(z)});
            }
            this.f10160a.x = z;
            return this;
        }

        public a E(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4ea7ad6d", new Object[]{this, str});
            }
            this.f10160a.g = str;
            return this;
        }

        public void F(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ad57968", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public a G(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e8fb525a", new Object[]{this, dWAspectRatio});
            }
            this.f10160a.getClass();
            return this;
        }

        public a H(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f89d1623", new Object[]{this, str});
            }
            this.f10160a.o = str;
            return this;
        }

        public d a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("4b00808e", new Object[]{this});
            }
            b();
            return new d(this.f10160a);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b30f571", new Object[]{this});
            } else if (!TextUtils.isEmpty(this.b)) {
                b bVar = this.f10160a;
                bVar.s = this.b + "." + this.f10160a.s;
                this.b = "";
            }
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a82da70b", new Object[]{this, str});
            }
            this.f10160a.f = str;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("266cbd61", new Object[]{this, new Boolean(z)});
            }
            this.f10160a.getClass();
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c1ff2403", new Object[]{this, str});
            }
            this.f10160a.h = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8316fca2", new Object[]{this, str});
            }
            this.f10160a.c = str;
            return this;
        }

        public a g(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("923e8bf", new Object[]{this, hashMap});
            }
            this.f10160a.r = hashMap;
            return this;
        }

        public a h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7673182c", new Object[]{this, new Integer(i)});
            }
            this.f10160a.getClass();
            return this;
        }

        public a i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a44bb28b", new Object[]{this, new Integer(i)});
            }
            this.f10160a.getClass();
            return this;
        }

        public a j(Surface surface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("896359d2", new Object[]{this, surface});
            }
            this.f10160a.z = surface;
            return this;
        }

        public a k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("72fea500", new Object[]{this, str});
            }
            this.f10160a.d = str;
            return this;
        }

        public a l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b6cc0f13", new Object[]{this, new Boolean(z)});
            }
            this.f10160a.n = z;
            return this;
        }

        public a m(psb psbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f7803f06", new Object[]{this, psbVar});
            }
            this.f10160a.w = psbVar;
            return this;
        }

        public a n(utb utbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d66972fa", new Object[]{this, utbVar});
            }
            this.f10160a.v = utbVar;
            return this;
        }

        public a o(vtb vtbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9588bdc0", new Object[]{this, vtbVar});
            }
            this.f10160a.u = vtbVar;
            return this;
        }

        public a p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8d9b30dc", new Object[]{this, str});
            }
            this.f10160a.e = str;
            return this;
        }

        public a q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3b7fe6f8", new Object[]{this, new Boolean(z)});
            }
            this.f10160a.p = z;
            return this;
        }

        public a r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3bb7aa02", new Object[]{this, new Boolean(z)});
            }
            this.f10160a.getClass();
            return this;
        }

        public a s(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5bf72176", new Object[]{this, new Boolean(z)});
            }
            this.f10160a.t = z;
            return this;
        }

        public a t(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("11931a14", new Object[]{this, hashMap});
            }
            this.f10160a.q = hashMap;
            return this;
        }

        public a u(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e387fd62", new Object[]{this, str});
            }
            this.f10160a.i = str;
            return this;
        }

        public a v(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("582ab2d3", new Object[]{this, new Integer(i)});
            }
            this.f10160a.k = i;
            return this;
        }

        public a w(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("81fef8e6", new Object[]{this, new Boolean(z)});
            }
            this.f10160a.y = z;
            return this;
        }

        public a x(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("39db73a6", new Object[]{this, hashMap});
            }
            this.f10160a.getClass();
            return this;
        }

        public a y(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4e12c9c4", new Object[]{this, new Integer(i)});
            }
            this.f10160a.b = i;
            return this;
        }

        public a z(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("42bb32f", new Object[]{this, new Boolean(z)});
            }
            this.f10160a.l = z;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public HashMap<String, String> A;

        /* renamed from: a  reason: collision with root package name */
        public Activity f10161a;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String o;
        public HashMap<String, String> q;
        public HashMap<String, String> r;
        public String s;
        public boolean t;
        public vtb u;
        public utb v;
        public psb w;
        public int b = 0;
        public boolean j = false;
        public int k = 3;
        public boolean l = true;
        public boolean m = true;
        public boolean n = true;
        public boolean p = true;
        public boolean x = false;
        public boolean y = true;
        public Surface z = null;

        static {
            t2o.a(452984929);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ytb f10162a;

        static {
            t2o.a(452984930);
            t2o.a(774897787);
        }

        public c(ytb ytbVar) {
            this.f10162a = ytbVar;
        }

        public void a(ytb ytbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dc53633", new Object[]{this, ytbVar});
            } else {
                this.f10162a = ytbVar;
            }
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
                return;
            }
            ytb ytbVar = this.f10162a;
            if (ytbVar != null) {
                ytbVar.onVideoClose();
            }
        }

        @Override // tb.asc
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
                return;
            }
            ytb ytbVar = this.f10162a;
            if (ytbVar != null) {
                ytbVar.onVideoComplete();
            }
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            ytb ytbVar = this.f10162a;
            if (ytbVar != null) {
                ytbVar.onVideoError(iMediaPlayer, i, i2);
            }
            if (d.f(d.this) != null) {
                for (IMediaPlayer.OnErrorListener onErrorListener : d.f(d.this)) {
                    onErrorListener.onError(iMediaPlayer, i, i2);
                }
            }
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
                return;
            }
            ytb ytbVar = this.f10162a;
            if (ytbVar != null) {
                ytbVar.onVideoInfo(iMediaPlayer, j, j2, j3, obj);
            }
            if (d.g(d.this) != null) {
                for (IMediaPlayer.OnInfoListener onInfoListener : d.g(d.this)) {
                    if (onInfoListener != null) {
                        onInfoListener.onInfo(iMediaPlayer, j, j2, j3, obj);
                    }
                }
            }
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
                return;
            }
            ytb ytbVar = this.f10162a;
            if (ytbVar != null) {
                ytbVar.onVideoPause(z);
            }
            if (d.d(d.this) != null) {
                for (TaoLiveVideoView.m mVar : d.d(d.this)) {
                    if (mVar != null) {
                        mVar.v(null);
                    }
                }
            }
        }

        @Override // tb.asc
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
                return;
            }
            ytb ytbVar = this.f10162a;
            if (ytbVar != null) {
                ytbVar.onVideoPlay();
            }
            if (d.c(d.this) != null) {
                for (TaoLiveVideoView.n nVar : d.c(d.this)) {
                    if (nVar != null) {
                        nVar.I(null);
                    }
                }
            }
        }

        @Override // tb.asc
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
                return;
            }
            ytb ytbVar = this.f10162a;
            if (ytbVar != null) {
                ytbVar.onVideoPrepared(iMediaPlayer);
            }
            if (d.e(d.this) != null) {
                for (IMediaPlayer.OnPreparedListener onPreparedListener : d.e(d.this)) {
                    if (onPreparedListener != null) {
                        onPreparedListener.onPrepared(iMediaPlayer);
                    }
                }
            }
        }

        @Override // tb.asc
        public void onMediaProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            ytb ytbVar = this.f10162a;
            if (ytbVar != null) {
                ytbVar.onVideoProgressChanged(i, i2, i3);
            }
        }

        @Override // tb.asc
        public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
                return;
            }
            ytb ytbVar = this.f10162a;
            if (ytbVar == null) {
                return;
            }
            if (mediaPlayScreenType == MediaPlayScreenType.NORMAL) {
                ytbVar.onVideoScreenChanged(DWVideoScreenType.NORMAL);
            } else if (mediaPlayScreenType == MediaPlayScreenType.PORTRAIT_FULL_SCREEN) {
                ytbVar.onVideoScreenChanged(DWVideoScreenType.PORTRAIT_FULL_SCREEN);
            } else if (mediaPlayScreenType == MediaPlayScreenType.LANDSCAPE_FULL_SCREEN) {
                ytbVar.onVideoScreenChanged(DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
            }
        }

        @Override // tb.asc
        public void onMediaSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
                return;
            }
            ytb ytbVar = this.f10162a;
            if (ytbVar != null) {
                ytbVar.onVideoSeekTo(i);
            }
        }

        @Override // tb.asc
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
                return;
            }
            ytb ytbVar = this.f10162a;
            if (ytbVar != null) {
                ytbVar.onVideoStart();
            }
            d.a(d.this, System.currentTimeMillis());
            d.b(d.this, null, true);
            if (d.c(d.this) != null) {
                for (TaoLiveVideoView.n nVar : d.c(d.this)) {
                    if (nVar != null) {
                        nVar.I(null);
                    }
                }
            }
        }
    }

    static {
        t2o.a(452984927);
    }

    public d(b bVar) {
        this.f10159a = new MediaPlayCenter(bVar.f10161a);
        this.f10159a.setUsingInterface(bVar.s);
        this.f10159a.setMediaAspectRatio(MediaAspectRatio.DW_CENTER_CROP);
        this.f10159a.setBusinessId(bVar.c);
        this.f10159a.setNeedPlayControlView(false);
        this.f10159a.hideController();
        this.f10159a.setScenarioType(bVar.b);
        this.f10159a.setBizCode(bVar.h);
        this.f10159a.setMediaId(bVar.d);
        this.f10159a.setMediaSourceType(bVar.e);
        this.f10159a.setUseArtp(bVar.j);
        this.f10159a.setPlayerType(bVar.k);
        this.f10159a.setHardwareHevc(true);
        this.f10159a.setHardwareAvc(true);
        this.f10159a.setShowNoWifiToast(bVar.l);
        this.f10159a.mute(bVar.p);
        this.f10159a.setMediaSource(bVar.o);
        this.f10159a.setAccountId(bVar.f);
        this.f10159a.setUserId(bVar.g);
        this.f10159a.setTransH265(bVar.m);
        this.f10159a.setH265Enable(bVar.n);
        this.f10159a.addPlayExpUtParams(bVar.q);
        this.f10159a.setUseShortAudioFocus(bVar.x);
        this.f10159a.setExternSurface(bVar.z);
        this.f10159a.setUseRtcLive(true);
        this.f10159a.setAutoDegradedWhenError(true);
        this.f10159a.setUseBfrtc(true);
        DWContext dWContext = new DWContext(bVar.f10161a, true);
        this.c = dWContext;
        dWContext.setNeedFirstPlayUT(bVar.t);
        dWContext.mute(bVar.p);
        dWContext.mUTAdapter = bVar.u;
        dWContext.addUtParams(bVar.A);
        dWContext.addPlayExpUtParams(bVar.q);
        dWContext.addControlParams(bVar.r);
        dWContext.setUserInfoAdapter(bVar.v);
        dWContext.mConfigAdapter = bVar.w;
        this.d = l95.b(bVar.g, dWContext.getUserInfoAdapter().getDeviceId());
        this.e = l95.b(bVar.g, dWContext.getUserInfoAdapter().getDeviceId());
        dWContext.mVideoId = bVar.d;
        dWContext.setNeedFirstPlayUT(bVar.t);
        dWContext.setPlayScenes(bVar.i);
        dWContext.mUseShortAudioFocus = bVar.x;
        dWContext.mReleaseShortFocusWhenPause = bVar.y;
        c cVar = new c(null);
        this.b = cVar;
        this.f10159a.setMediaLifecycleListener(cVar);
    }

    public static /* synthetic */ long a(d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75e9cd76", new Object[]{dVar, new Long(j)})).longValue();
        }
        dVar.g = j;
        return j;
    }

    public static /* synthetic */ void b(d dVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe3b652", new Object[]{dVar, map, new Boolean(z)});
        } else {
            dVar.l(map, z);
        }
    }

    public static /* synthetic */ List c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("64b92c05", new Object[]{dVar});
        }
        return dVar.m;
    }

    public static /* synthetic */ List d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f2ecc86", new Object[]{dVar});
        }
        return dVar.n;
    }

    public static /* synthetic */ List e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d9a46d07", new Object[]{dVar});
        }
        return dVar.j;
    }

    public static /* synthetic */ List f(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("941a0d88", new Object[]{dVar});
        }
        return dVar.k;
    }

    public static /* synthetic */ List g(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4e8fae09", new Object[]{dVar});
        }
        return dVar.l;
    }

    public void A(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652e1840", new Object[]{this, onPreparedListener});
            return;
        }
        if (this.j == null) {
            this.j = new LinkedList();
        }
        this.j.add(onPreparedListener);
    }

    public void B(TaoLiveVideoView.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f636bfa", new Object[]{this, nVar});
            return;
        }
        if (this.m == null) {
            this.m = new LinkedList();
        }
        this.m.add(nVar);
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else if (this.f10159a != null) {
            feh fehVar = this.o;
            AVSDKLog.e(fehVar, "DWLiveNew call release with " + this.f10159a);
            this.f10159a.release();
        }
    }

    public void D(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.setFirstRenderAdapter(nj9Var);
        }
    }

    public void E(MediaLiveInfo mediaLiveInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a36608c", new Object[]{this, mediaLiveInfo, str});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter == null) {
            return;
        }
        if (mediaLiveInfo != null) {
            mediaPlayCenter.updateLiveMediaInfoData(mediaLiveInfo);
        } else if (!TextUtils.isEmpty(str)) {
            this.f10159a.updateLiveMediaInfoData(null);
            this.f10159a.setMediaUrl(str);
        }
    }

    public void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.mute(z);
        }
    }

    public void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8d232e", new Object[]{this, new Boolean(z)});
            return;
        }
        DWContext dWContext = this.c;
        if (dWContext != null) {
            dWContext.setNeedCloseUT(z);
        }
    }

    public void H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409a031b", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.setShowNoWifiToast(z);
        }
    }

    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c26149", new Object[]{this, str});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.setBizCode(str);
        }
    }

    public void J(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
            return;
        }
        DWContext dWContext = this.c;
        if (dWContext != null && hashMap != null) {
            dWContext.addUtParams(hashMap);
        }
    }

    public void K(ytb ytbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd04dc4a", new Object[]{this, ytbVar});
            return;
        }
        asc ascVar = this.b;
        if (ascVar != null) {
            ((c) ascVar).a(ytbVar);
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.setMediaLifecycleListener(this.b);
        }
    }

    public void L(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
        } else if (f >= 0.0f && f <= 1.0f) {
            MediaPlayCenter mediaPlayCenter = this.f10159a;
            if (mediaPlayCenter != null) {
                mediaPlayCenter.setVolume(f);
            }
            DWContext dWContext = this.c;
            if (dWContext != null) {
                dWContext.setVolume(f);
            }
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.setup();
            feh fehVar = this.o;
            if (fehVar == null) {
                this.o = new feh(toString(), this.f10159a.getPlayToken());
            } else {
                fehVar.c(this.f10159a.getPlayToken());
            }
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.start();
        }
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4be2eb7", new Object[]{this})).booleanValue();
        }
        if (this.f10159a == null) {
            return false;
        }
        k();
        AVSDKLog.e(this.o, "DWLiveNew commitCloseUT and set mMediaPlayCenter = null");
        this.f10159a = null;
        return true;
    }

    public void P(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b519e6c9", new Object[]{this, onCompletionListener});
            return;
        }
        List<IMediaPlayer.OnCompletionListener> list = this.i;
        if (list != null) {
            ((LinkedList) list).remove(onCompletionListener);
        }
    }

    public void Q(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965fab1", new Object[]{this, onErrorListener});
            return;
        }
        List<IMediaPlayer.OnErrorListener> list = this.k;
        if (list != null) {
            ((LinkedList) list).remove(onErrorListener);
        }
    }

    public void R(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cd01a5", new Object[]{this, onInfoListener});
            return;
        }
        List<IMediaPlayer.OnInfoListener> list = this.l;
        if (list != null) {
            ((LinkedList) list).remove(onInfoListener);
        }
    }

    public void S(TaoLiveVideoView.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ea3b01", new Object[]{this, mVar});
            return;
        }
        List<TaoLiveVideoView.m> list = this.n;
        if (list != null) {
            ((LinkedList) list).remove(mVar);
        }
    }

    public void T(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff10fa07", new Object[]{this, onPreparedListener});
            return;
        }
        List<IMediaPlayer.OnPreparedListener> list = this.j;
        if (list != null) {
            ((LinkedList) list).remove(onPreparedListener);
        }
    }

    public void U(TaoLiveVideoView.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d19c81", new Object[]{this, nVar});
            return;
        }
        List<TaoLiveVideoView.n> list = this.m;
        if (list != null) {
            ((LinkedList) list).remove(nVar);
        }
    }

    public void V(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
        } else if (mediaLiveWarmupConfig != null) {
            this.f10159a.warmupLiveStream(mediaLiveWarmupConfig);
        } else {
            this.f10159a.warmupLiveStream(new MediaLiveWarmupConfig());
        }
    }

    public void h(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d20b9f", new Object[]{this, hashMap});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.addPlayExpUtParams(hashMap);
        }
        DWContext dWContext = this.c;
        if (dWContext != null) {
            dWContext.addPlayExpUtParams(hashMap);
        }
    }

    public void i(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b65ae46", new Object[]{this, hashMap});
            return;
        }
        DWContext dWContext = this.c;
        if (dWContext != null) {
            dWContext.addUtParams(hashMap);
        }
    }

    public void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.callWithMsg(map);
        }
    }

    public final void m(boolean z, Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71c6e56", new Object[]{this, new Boolean(z), map});
            return;
        }
        DWContext dWContext = this.c;
        if (dWContext.mUTAdapter != null && !"TBAudio".equals(dWContext.mVideoSource)) {
            Uri data = (this.c.getActivity() == null || this.c.getActivity().getIntent() == null) ? null : this.c.getActivity().getIntent().getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter("spm");
                if (!TextUtils.isEmpty(queryParameter)) {
                    map.put("spm-url", queryParameter);
                }
            }
            map.put(abk.FROM_FULL, "0");
            map.put("play_sid", this.d);
            if (z) {
                str = "end";
            } else {
                str = "pause";
            }
            map.put("play_type", str);
            map.put("instance_playid", this.e);
            long currentTimeMillis = System.currentTimeMillis() - this.g > 0 ? System.currentTimeMillis() - this.g : 0L;
            this.f = currentTimeMillis;
            map.put("duration_time", String.valueOf(currentTimeMillis));
            map.put("play_token", this.c.getPlayToken());
            long j = this.f;
            if (j < 0 || j > 3600000) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "get duration_time error, mDurationTime =" + String.valueOf(this.f) + ", mBeginTime = " + String.valueOf(this.g));
            }
            map.put("is_live", "1");
            map.putAll(this.c.getUTParams());
            AVSDKLog.e(this.o, "DWLive 12003 commit at commitPlayEndInfo");
            this.c.mUTAdapter.b("DWLive", "Button", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, map.get(xau.PROPERTY_VIDEO_ID), c2v.getInstance().getCurrentPageName(), map.get("playTime"), map);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.f10159a != null) {
            k();
            feh fehVar = this.o;
            AVSDKLog.e(fehVar, "DWLiveNew call destroy with " + this.f10159a);
            this.f10159a.destroy();
        }
    }

    public MediaPlayCenter o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPlayCenter) ipChange.ipc$dispatch("1c96ce4", new Object[]{this});
        }
        return this.f10159a;
    }

    public Map<String, String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            return mediaPlayCenter.getPlayerQos();
        }
        return null;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            return mediaPlayCenter.getVideoState();
        }
        return 0;
    }

    public View t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            return mediaPlayCenter.getView();
        }
        return null;
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.f10159a;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.pause();
        }
    }

    public void w(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9b4082", new Object[]{this, onCompletionListener});
            return;
        }
        if (this.i == null) {
            this.i = new LinkedList();
        }
        this.i.add(onCompletionListener);
    }

    public void x(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6077aa", new Object[]{this, onErrorListener});
            return;
        }
        if (this.k == null) {
            this.k = new LinkedList();
        }
        this.k.add(onErrorListener);
    }

    public void y(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0468de", new Object[]{this, onInfoListener});
            return;
        }
        if (this.l == null) {
            this.l = new LinkedList();
        }
        this.l.add(onInfoListener);
    }

    public void z(TaoLiveVideoView.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7c0a7a", new Object[]{this, mVar});
            return;
        }
        if (this.n == null) {
            this.n = new LinkedList();
        }
        this.n.add(mVar);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4811e7", new Object[]{this});
        } else if (!this.c.needCloseUT() || this.h) {
            feh fehVar = this.o;
            AVSDKLog.e(fehVar, "DWLive commitCloseUT return by !mIsDWLiveCommit=false, !mDWContext.needCloseUT()=" + (true ^ this.c.needCloseUT()) + ",mVideoDestroyed=" + this.h);
        } else {
            if (this.c.mUTAdapter != null) {
                HashMap hashMap = new HashMap();
                if (!this.c.statInRemoveList("videoClose")) {
                    DWContext dWContext = this.c;
                    dWContext.mUTAdapter.a("DWLive", "Button", "videoClose", dWContext.getUTParams(), hashMap);
                }
                m(true, hashMap);
                this.c.setNeedCloseUT(true);
            } else {
                AVSDKLog.e(this.o, "DWLive commitCloseUT failed with mDWContext.mUTAdapter == null");
            }
            this.h = true;
        }
    }

    public final void l(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1eaa62", new Object[]{this, map, new Boolean(z)});
        } else if (this.c.needFirstPlayUT() || !this.p || true == z) {
            HashMap hashMap = new HashMap();
            if (!this.c.isMute() || this.q) {
                hashMap.put("wifiAuto", "false");
            } else {
                hashMap.put("wifiAuto", "true");
            }
            hashMap.put("mute", Boolean.toString(this.c.isMute()));
            if (map != null) {
                hashMap.putAll(map);
            }
            DWContext dWContext = this.c;
            if (dWContext.mUTAdapter != null) {
                if (!dWContext.statInRemoveList("videoFirstPlay")) {
                    DWContext dWContext2 = this.c;
                    dWContext2.mUTAdapter.a("DWLive", "Button", "videoFirstPlay", dWContext2.getUTParams(), hashMap);
                }
                hashMap.putAll(this.c.getUTParams());
                Uri data = (this.c.getActivity() == null || this.c.getActivity().getIntent() == null) ? null : this.c.getActivity().getIntent().getData();
                if (data != null) {
                    String queryParameter = data.getQueryParameter("spm");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        hashMap.put("spm-url", queryParameter);
                    }
                }
                hashMap.put("play_sid", this.d);
                hashMap.put("barrage", "false");
                hashMap.put("item", String.valueOf(this.c.getShowGoodsList()));
                hashMap.put("instance_playid", this.e);
                hashMap.put("likes", "false");
                hashMap.put("is_live", "1");
                AVSDKLog.e(this.o, "DWLiveInstance commit 12002 at commitFirstPlayUT");
                this.c.mUTAdapter.b("DWLive", "Button", 12002, (String) hashMap.get(xau.PROPERTY_VIDEO_ID), "", "", hashMap);
            }
            this.p = true;
            this.q = true;
        }
    }
}
