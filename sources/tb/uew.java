package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.room.player.standard.state.LiveStatePlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uew extends uy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093137);
    }

    public uew(PreloadParams preloadParams) {
        super(preloadParams);
    }

    public static /* synthetic */ Object ipc$super(uew uewVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/smallwindow/ViewInstance");
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0239", new Object[]{this});
        } else {
            this.b = new LiveStatePlayer(this.f29668a, 3);
        }
    }

    @Override // tb.uy1, tb.r4d
    public void p(PreloadParams preloadParams) {
        fnr t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ebe548f", new Object[]{this, preloadParams});
        } else if (preloadParams != null && this.b != null && (t = preloadParams.t()) != null) {
            o3s.b("ViewInstance", "ViewInstance,startPlayWithParams,创建播放器之前");
            s.d e0 = this.b.e0();
            if (e0 == null) {
                e0 = new s.d();
            }
            e0.A = false;
            if (2 == t.e) {
                this.b.N(0L);
                this.b = new z1o(this.f29668a);
                e0.A = t.j;
            }
            e0.o = t.d;
            e0.r = t.e;
            e0.m = t.h;
            e0.i = preloadParams.y();
            BaseStatePlayer baseStatePlayer = this.b;
            if (baseStatePlayer instanceof z1o) {
                ((z1o) baseStatePlayer).V1(preloadParams.k());
            } else {
                ((LiveStatePlayer) baseStatePlayer).Y1(t.l, preloadParams.k());
            }
            this.b.D(arq.b(t.m));
            if (!(this.b.j0() == null || preloadParams.w() == null)) {
                this.b.j0().setOutlineProvider(new eot(preloadParams.w()));
                this.b.j0().setClipToOutline(true);
            }
            start();
        }
    }
}
