package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i2g implements jic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final fic f21051a;
    public g2g b;

    static {
        t2o.a(1002438689);
        t2o.a(1002438710);
        t2o.a(1002438711);
    }

    public i2g() {
        this(null, null, 3, null);
    }

    public final g2g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2g) ipChange.ipc$dispatch("d2824836", new Object[]{this});
        }
        return this.b;
    }

    public final void b(g2g g2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e107e4", new Object[]{this, g2gVar});
            return;
        }
        ckf.g(g2gVar, "<set-?>");
        this.b = g2gVar;
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
        }
    }

    public i2g(fic ficVar, g2g g2gVar) {
        ckf.g(g2gVar, VideoControllerManager.ARRAY_KEY_CONFIGURATION);
        this.f21051a = ficVar;
        this.b = g2gVar;
    }

    public /* synthetic */ i2g(fic ficVar, g2g g2gVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : ficVar, (i & 2) != 0 ? new g2g(false, 1, null) : g2gVar);
    }
}
