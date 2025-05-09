package tb;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class hz1 implements mcd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f20975a;
    public final ufi b;
    public final MediaData c;
    public final scd d;
    public final long e;
    public final int f;
    public final Uri g;

    static {
        t2o.a(779093103);
        t2o.a(779093104);
    }

    public hz1(PreloadParams preloadParams) {
        this.f20975a = preloadParams.b();
        this.b = preloadParams.u();
        this.f = preloadParams.q();
        this.d = preloadParams.m();
        this.c = preloadParams.h();
        this.e = preloadParams.c();
        this.g = preloadParams.f();
    }

    @Override // tb.mcd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9babed03", new Object[]{this});
        } else {
            k();
        }
    }

    public final /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aebee344", new Object[]{this});
            return;
        }
        r("[Metrics-VideoPrePlay],handleMediaPlayerError()容错1秒任务兜底");
        m();
    }

    public final /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19f6e46", new Object[]{this});
            return;
        }
        scd scdVar = this.d;
        if (scdVar != null) {
            scdVar.d();
            this.d.onSuccess();
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab121b8", new Object[]{this});
            return;
        }
        r("[Metrics-VideoPrePlay],createInstance创建实例");
        u();
        ViewGroup v = v();
        if (v == null) {
            r("[Metrics-VideoPrePlay]: mediaView is null,onFailed");
            scd scdVar = this.d;
            if (scdVar != null) {
                scdVar.g(this);
                return;
            }
            return;
        }
        r("[Metrics-VideoPrePlay],onPlayerStart起播");
        x();
        if (this.d != null) {
            r("[Metrics-VideoPrePlay],onAddVideoFrame添加播放器View->onAdded添加成功");
            this.d.e(v);
            this.d.h();
        }
        if (w()) {
            r("[Metrics-VideoPrePlay],首帧已经上屏，firstFrameRendered()首帧渲染结束");
            l();
        } else {
            y();
            nwv.A0(new Runnable() { // from class: tb.fz1
                @Override // java.lang.Runnable
                public final void run() {
                    hz1.this.f();
                }
            }, this.e);
        }
        t();
        s();
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861ec7f9", new Object[]{this});
        } else if (this.d != null) {
            nwv.y0(new Runnable() { // from class: tb.gz1
                @Override // java.lang.Runnable
                public final void run() {
                    hz1.this.i();
                }
            });
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ceb4672", new Object[]{this});
        } else if (this.d != null) {
            r("[Metrics-VideoPrePlay]onTimeout()超时");
            this.d.onTimeout();
        }
    }

    public void n(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb51d905", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        scd scdVar = this.d;
        if (scdVar != null) {
            scdVar.f(i, i2);
        }
    }

    public boolean o(BaseStatePlayer baseStatePlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("226374d4", new Object[]{this, baseStatePlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (tfi.MOCK_MEDIA_INFO_WHAT_RECYCLED.equals(obj)) {
            r("[Metrics-VideoPrePlay]receive MOCK_MEDIA_INFO_WHAT_RECYCLED,obj:" + obj);
            scd scdVar = this.d;
            if (scdVar != null) {
                scdVar.d();
                this.d.a();
            }
            return true;
        }
        scd scdVar2 = this.d;
        if (scdVar2 != null) {
            scdVar2.d();
            this.d.c(baseStatePlayer, j, j2, j3, obj);
        }
        if (((int) j) == 12101) {
            r("[Metrics-VideoPrePlay]firstFrameRendered(),receive firstFrame");
            l();
        }
        return false;
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        o3s.b("PreloadLiveInstance", str + ",当前实例：" + this);
    }

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract ViewGroup v();

    public abstract boolean w();

    public abstract void x();

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb47641", new Object[]{this});
        } else if (this.d != null) {
            r("[Metrics-VideoPrePlay],onShowCover显示封面");
            this.d.b();
        }
    }
}
