package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class twg implements IMediaPlayer.c, IMediaPlayer.e, IMediaPlayer.h, e7m, IMediaPlayer.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public zkc f28997a;
    public cjr b;
    public boolean c;
    public Context d;
    public b e;
    public rlr f;
    public FrameLayout g;
    public boolean i;
    public boolean j = true;
    public final Runnable k = new a();
    public final Handler h = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            o3s.b("LiveCardPlayer", "complete");
            if (twg.a(twg.this) != null) {
                twg.a(twg.this).onComplete();
            }
            twg.b(twg.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onClear(boolean z);

        void onComplete();

        void onError(int i);

        void onFirstFrame();

        void onInstallReadyRetry();

        void onNotInstallPlayError();

        void onPrepared();

        void onRetry();

        void onReuse();

        void onRevoked();
    }

    static {
        t2o.a(779093670);
        t2o.a(806356439);
        t2o.a(806356441);
        t2o.a(806356444);
        t2o.a(779093501);
        t2o.a(806356438);
    }

    public twg(Context context) {
        this.d = context;
    }

    public static /* synthetic */ b a(twg twgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e00ce299", new Object[]{twgVar});
        }
        return twgVar.e;
    }

    public static /* synthetic */ void b(twg twgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2533a5bd", new Object[]{twgVar, new Boolean(z)});
        } else {
            twgVar.j(z);
        }
    }

    public final void c(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3fc9b28", new Object[]{this, frameLayout});
            return;
        }
        o3s.b("LiveCardPlayer", "bindVideoToView");
        zkc zkcVar = this.f28997a;
        if (zkcVar == null || frameLayout == null) {
            o3s.b("LiveCardPlayer", "bindVideoToView null error");
            return;
        }
        View view = zkcVar.getView();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            try {
                frameLayout.removeAllViews();
                frameLayout.addView(view);
            } catch (Exception e) {
                o3s.b("LiveCardPlayer", "bindVideoToView error " + e.getMessage());
                d(-90000);
            }
        }
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5a2b52", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.onError(i);
        }
    }

    public final void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ec551d", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        rlr rlrVar = this.f;
        if (rlrVar != null) {
            rlrVar.onMediaError(i, i2);
        }
    }

    public final void f(long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3f036c", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        rlr rlrVar = this.f;
        if (rlrVar != null) {
            rlrVar.onMediaInfo(j, j2, j3, obj);
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17cf100", new Object[]{this, new Boolean(z)});
            return;
        }
        o3s.b("LiveCardPlayer", pg1.ATOM_EXT_clear);
        b bVar = this.e;
        if (bVar != null) {
            bVar.onClear(z);
        }
        j(z);
    }

    public final zkc h(Context context, boolean z, boolean z2) {
        ufi ufiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zkc) ipChange.ipc$dispatch("2ea6f232", new Object[]{this, context, new Boolean(z), new Boolean(z2)});
        }
        PreloadParams.a O = new PreloadParams.a(context).P(this.b).M(z).O(z2);
        cjr cjrVar = this.b;
        if (cjrVar != null) {
            ufiVar = yx4.a(cjrVar.c, cjrVar.b);
        } else {
            ufiVar = null;
        }
        ywg ywgVar = new ywg(O.f0(ufiVar).G());
        o3s.b("LiveCardPlayer", "LiveCardPlayer 播放器标准化流程");
        ywgVar.r();
        ywgVar.l(this);
        ywgVar.k(this);
        ywgVar.m(this);
        ywgVar.n(this);
        ywgVar.v(this);
        return ywgVar;
    }

    public void i(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fa863c", new Object[]{this, frameLayout});
            return;
        }
        o3s.b("LiveCardPlayer", "createPlayerInstance");
        if (this.b == null) {
            o3s.b("LiveCardPlayer", "createPlayerInstance mData == null");
            return;
        }
        o3s.b("LiveCardPlayer", "createPlayerInstance mediaLiveInfo = " + this.b.c + " url = " + this.b.b);
        this.g = frameLayout;
        this.f28997a = h(this.d, true, true);
        c(this.g);
    }

    public Bitmap k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        zkc zkcVar = this.f28997a;
        if (zkcVar != null) {
            return zkcVar.h();
        }
        return null;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa9b7f9a", new Object[]{this});
        }
        zkc zkcVar = this.f28997a;
        if (zkcVar != null) {
            return zkcVar.i();
        }
        return null;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41c2c5d7", new Object[]{this});
        }
        zkc zkcVar = this.f28997a;
        if (zkcVar != null) {
            return zkcVar.a();
        }
        return null;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eacc3d02", new Object[]{this});
        }
        zkc zkcVar = this.f28997a;
        if (zkcVar != null) {
            return zkcVar.b();
        }
        return null;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7687add", new Object[]{this});
        }
        zkc zkcVar = this.f28997a;
        if (zkcVar != null) {
            return zkcVar.c();
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.b
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
            return;
        }
        o3s.b("LiveCardPlayer", "complete");
        b bVar = this.e;
        if (bVar != null) {
            bVar.onComplete();
        }
        j(false);
    }

    @Override // tb.e7m
    public void onInstallReadyRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68affaa8", new Object[]{this});
            return;
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.onInstallReadyRetry();
        }
    }

    @Override // tb.e7m
    public void onNotInstallPlayError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f1674", new Object[]{this});
            return;
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.onNotInstallPlayError();
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91c57f9", new Object[]{this, iMediaPlayer});
            return;
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.onPrepared();
        }
    }

    public ViewGroup p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        return this.g;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        zkc zkcVar = this.f28997a;
        if (zkcVar != null) {
            return zkcVar.isMuted();
        }
        return this.j;
    }

    public void s(cjr cjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d407c16", new Object[]{this, cjrVar});
        } else {
            this.b = cjrVar;
        }
    }

    public void t(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de61246", new Object[]{this, bVar});
        } else {
            this.e = bVar;
        }
    }

    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j = z;
        zkc zkcVar = this.f28997a;
        if (zkcVar != null) {
            zkcVar.setMuted(z);
        }
    }

    public void v(rlr rlrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44318497", new Object[]{this, rlrVar});
        } else {
            this.f = rlrVar;
        }
    }

    public void w(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d31c7e", new Object[]{this, str, new Integer(i)});
            return;
        }
        zkc zkcVar = this.f28997a;
        if (zkcVar != null && this.d != null) {
            zkcVar.g(str, i);
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        o3s.b("LiveCardPlayer", "start");
        zkc zkcVar = this.f28997a;
        if (zkcVar == null) {
            o3s.b("LiveCardPlayer", "start mMediaPlayController == null");
            return;
        }
        zkcVar.start();
        if (this.f28997a.j()) {
            o3s.b("LiveCardPlayer", "onInfo firstFrame");
            b bVar = this.e;
            if (bVar != null) {
                bVar.onFirstFrame();
            }
        }
        int i = this.b.f;
        if (i > 0) {
            this.h.postDelayed(this.k, i * 1000);
        }
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e54686b", new Object[]{this, new Boolean(z)});
            return;
        }
        o3s.b("LiveCardPlayer", "stop");
        j(z);
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5245a867", new Object[]{this});
            return;
        }
        o3s.b("LiveCardPlayer", "warmup");
        zkc zkcVar = this.f28997a;
        if (zkcVar == null) {
            o3s.b("LiveCardPlayer", "warmup mMediaPlayController == null");
        } else {
            zkcVar.prepareAsync();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58de00d", new Object[]{this});
            return;
        }
        o3s.b("LiveCardPlayer", pg1.ATOM_revoke);
        b bVar = this.e;
        if (bVar != null) {
            bVar.onRevoked();
        }
        j(false);
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aecf0b73", new Object[]{this, new Boolean(z)});
            return;
        }
        o3s.b("LiveCardPlayer", "卡片调用destroy，mLiveCardPlayerInstance：" + this.f28997a);
        this.i = true;
        zkc zkcVar = this.f28997a;
        if (zkcVar != null) {
            zkcVar.setMuted(true);
            if (z) {
                this.f28997a.e();
            } else {
                this.f28997a.d();
            }
            this.f28997a = null;
        }
        this.g = null;
        this.c = false;
        this.e = null;
        this.f = null;
        this.d = null;
        this.h.removeCallbacks(this.k);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.c
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        o3s.b("LiveCardPlayer", "onError i = " + i + " hasRetry = " + this.c);
        if (this.i) {
            return false;
        }
        if (!this.c) {
            zkc zkcVar = this.f28997a;
            if (zkcVar != null) {
                zkcVar.d();
            }
            this.f28997a = h(this.d, false, false);
            c(this.g);
            this.f28997a.start();
            this.c = true;
            b bVar = this.e;
            if (bVar != null) {
                bVar.onRetry();
            }
        } else {
            e(i, i2);
            j(false);
        }
        return false;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (j == 3) {
            o3s.b("LiveCardPlayer", "onInfo firstFrame");
            b bVar = this.e;
            if (bVar != null) {
                bVar.onFirstFrame();
            }
        }
        if ((obj instanceof String) && obj.equals(tfi.MOCK_MEDIA_INFO_WHAT_RECYCLED)) {
            b bVar2 = this.e;
            if (bVar2 != null) {
                bVar2.onReuse();
            }
            return false;
        } else if (j == 4502) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                zkc zkcVar = this.f28997a;
                if (zkcVar != null && zkcVar.f(sVar)) {
                    o3s.b("LiveCardPlayer", "播放器复用，实例相同，可以销毁");
                    b bVar3 = this.e;
                    if (bVar3 != null) {
                        bVar3.onReuse();
                    }
                }
            }
            return false;
        } else {
            f(j, j2, j3, obj);
            return false;
        }
    }
}
