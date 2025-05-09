package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.player.standard.StandardMediaData;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.room.player.standard.state.LiveStatePlayer;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ywg implements zkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f32390a;
    public final PreloadParams b;
    public BaseStatePlayer c;
    public final cjr d;
    public boolean e = true;
    public y3h f;

    static {
        t2o.a(779093084);
        t2o.a(779093083);
    }

    public ywg(PreloadParams preloadParams) {
        this.b = preloadParams;
        this.f32390a = preloadParams.b();
        this.d = preloadParams.g();
        preloadParams.p();
    }

    @Override // tb.zkc
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("987f86c2", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            return baseStatePlayer.Y();
        }
        return null;
    }

    @Override // tb.zkc
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31feaeb4", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            return baseStatePlayer.c0();
        }
        return null;
    }

    @Override // tb.zkc
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("711474dc", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            return baseStatePlayer.Y();
        }
        return null;
    }

    @Override // tb.zkc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d0ae511", new Object[]{this});
        } else {
            t(0L);
        }
    }

    @Override // tb.zkc
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7321da", new Object[]{this});
        } else {
            t(ejr.a());
        }
    }

    @Override // tb.zkc
    public boolean f(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf871c9f", new Object[]{this, sVar})).booleanValue();
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            return baseStatePlayer.A0(sVar);
        }
        return false;
    }

    @Override // tb.zkc
    public void g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d31c7e", new Object[]{this, str, new Integer(i)});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            baseStatePlayer.G1(str, i);
        }
    }

    @Override // tb.zkc
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            return baseStatePlayer.l0();
        }
        return null;
    }

    @Override // tb.zkc
    public Bitmap h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            return baseStatePlayer.T();
        }
        return null;
    }

    @Override // tb.zkc
    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa9b7f9a", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            return baseStatePlayer.b0();
        }
        return null;
    }

    @Override // tb.zkc
    public boolean isMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            return baseStatePlayer.w0();
        }
        return this.e;
    }

    @Override // tb.zkc
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34c4ca3b", new Object[]{this})).booleanValue();
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            return baseStatePlayer.r0();
        }
        return false;
    }

    public void k(IMediaPlayer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97d43b0", new Object[]{this, bVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            baseStatePlayer.v(bVar);
        }
    }

    public void l(IMediaPlayer.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb01f600", new Object[]{this, cVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            baseStatePlayer.t(cVar);
        }
    }

    public void m(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bedf90c", new Object[]{this, eVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            baseStatePlayer.u(eVar);
        }
    }

    public void n(IMediaPlayer.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d5dfee", new Object[]{this, hVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            baseStatePlayer.z(hVar);
        }
    }

    public final HashMap<String, String> o(ytt yttVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e5bf6f70", new Object[]{this, yttVar, str});
        }
        if (TextUtils.isEmpty(str) || yttVar == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            str2 = parse.getQueryParameter("timeMovingCacheKey");
        } else {
            str2 = "";
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("timeMovingCacheKey", str2);
        return hashMap;
    }

    @Override // tb.zkc
    public void prepareAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d411b3bc", new Object[]{this});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            baseStatePlayer.U1();
        }
    }

    public final BaseStatePlayer q(String str, jgi jgiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer) ipChange.ipc$dispatch("a60ece47", new Object[]{this, str, jgiVar});
        }
        o3s.b("LiveCardPlayerInstance", "createLivePlayerWithMediaPlayViewProxy 使用旧的实例创建新实例 setUp");
        LiveStatePlayer liveStatePlayer = new LiveStatePlayer(this.f32390a, 0);
        this.c = liveStatePlayer;
        liveStatePlayer.M(str, jgiVar);
        return this.c;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0239", new Object[]{this});
            return;
        }
        PreloadParams preloadParams = this.b;
        if (preloadParams == null || preloadParams.i() == null) {
            cjr cjrVar = this.d;
            if (cjrVar == null || !cjrVar.f17104a) {
                this.c = s();
            } else {
                this.c = p();
            }
        } else {
            this.c = q(this.b.j(), this.b.i());
        }
    }

    public final BaseStatePlayer s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer) ipChange.ipc$dispatch("44692ad4", new Object[]{this});
        }
        o3s.b("LiveCardPlayerInstance", "createLivePlayer 创建点播播放器实例 setUp");
        ytt yttVar = new ytt(this.f32390a, null);
        this.c = yttVar;
        s.d e0 = yttVar.e0();
        if (e0 == null) {
            e0 = new s.d();
        }
        cjr cjrVar = this.d;
        if (cjrVar != null) {
            e0.i = this.e;
            e0.o = cjrVar.g;
            e0.A = cjrVar.h;
            HashMap<String, String> o = o((ytt) this.c, cjrVar.d);
            if (o != null) {
                this.c.H(o);
            }
            e0.v = nxf.b(this.d.i);
            if (!TextUtils.isEmpty(this.d.e)) {
                ((ytt) this.c).Y1(null, this.d.e);
            } else if (!TextUtils.isEmpty(this.d.d)) {
                ((ytt) this.c).Y1(this.d.d, null);
            }
        }
        this.c.K();
        return this.c;
    }

    @Override // tb.zkc
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.e = z;
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            baseStatePlayer.n1(z);
        }
    }

    @Override // tb.zkc
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            baseStatePlayer.I1();
        }
    }

    public final void t(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a072a37", new Object[]{this, new Long(j)});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            y3h y3hVar = this.f;
            if (y3hVar != null) {
                y3hVar.d(baseStatePlayer.l0());
            }
            this.c.N(j);
        }
    }

    public void u(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee1eec9", new Object[]{this, eVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.c;
        if (baseStatePlayer != null) {
            baseStatePlayer.U0(eVar);
        }
    }

    public void v(e7m e7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1fac7b", new Object[]{this, e7mVar});
        }
    }

    public void w(MediaData mediaData, IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28da8034", new Object[]{this, mediaData, eVar});
            return;
        }
        y3h y3hVar = new y3h(this.b);
        this.f = y3hVar;
        this.c = y3hVar.f(mediaData, eVar);
    }

    public final BaseStatePlayer p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer) ipChange.ipc$dispatch("9936f782", new Object[]{this});
        }
        o3s.b("LiveCardPlayerInstance", "直播卡片createLivePlayer 创建直播播放器实例 setUp");
        LiveStatePlayer liveStatePlayer = new LiveStatePlayer(this.f32390a, 0);
        this.c = liveStatePlayer;
        s.d e0 = liveStatePlayer.e0();
        if (e0 == null) {
            e0 = new s.d();
        }
        if (this.d != null) {
            e0.l(true);
            e0.m(this.d.j);
            e0.i = this.e;
            cjr cjrVar = this.d;
            e0.o = cjrVar.g;
            e0.r = 0;
            e0.A = false;
            e0.v = nxf.b(cjrVar.i);
            if (TextUtils.equals("subscription", this.d.g)) {
                e0.O = true;
            }
            ((LiveStatePlayer) this.c).Y1(LiveMediaManager.e2(StandardMediaData.generate(this.d.c)), this.d.b);
        }
        PreloadParams preloadParams = this.b;
        this.c.M((preloadParams == null || preloadParams.u() == null) ? null : this.b.u().f29342a, null);
        return this.c;
    }
}
