package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tcd implements scd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093082);
        t2o.a(779093105);
    }

    @Override // tb.scd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe17d436", new Object[]{this});
        }
    }

    @Override // tb.scd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c35aa2", new Object[]{this});
        }
    }

    @Override // tb.scd
    public void c(BaseStatePlayer baseStatePlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb6d58f", new Object[]{this, baseStatePlayer, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    @Override // tb.scd
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d615fd", new Object[]{this});
        }
    }

    @Override // tb.scd
    public void e(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b6435a", new Object[]{this, viewGroup});
        }
    }

    @Override // tb.scd
    public void f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f493d0", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.scd
    public void g(mcd mcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616bf76b", new Object[]{this, mcdVar});
        }
    }

    @Override // tb.scd
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bed2268", new Object[]{this});
        }
    }

    @Override // tb.scd
    public void onSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
        }
    }

    @Override // tb.scd
    public void onTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13bc209", new Object[]{this});
        }
    }
}
