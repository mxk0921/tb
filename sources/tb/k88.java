package tb;

import com.android.alibaba.ip.runtime.IpChange;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: Taobao */
@Module
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k88 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705338);
    }

    @Provides
    public ueb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ueb) ipChange.ipc$dispatch("b3aad77", new Object[]{this});
        }
        return (ueb) b88.a(si0.class);
    }

    @Provides
    public qeb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qeb) ipChange.ipc$dispatch("dd893df9", new Object[]{this});
        }
        return (qeb) b88.a(xf0.class);
    }

    @Provides
    public xib c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xib) ipChange.ipc$dispatch("80265a19", new Object[]{this});
        }
        return (xib) b88.a(l62.class);
    }

    @Provides
    public prb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prb) ipChange.ipc$dispatch("e3bd4d99", new Object[]{this});
        }
        return (prb) b88.a(jy4.class);
    }

    @Provides
    public y6c e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y6c) ipChange.ipc$dispatch("2cc89799", new Object[]{this});
        }
        return (y6c) b88.a(wh9.class);
    }

    @Provides
    public bjc f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjc) ipChange.ipc$dispatch("7ec1989d", new Object[]{this});
        }
        return (bjc) b88.a(nfg.class);
    }

    @Provides
    @Singleton
    public fxc g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxc) ipChange.ipc$dispatch("35405f3b", new Object[]{this});
        }
        return (fxc) b88.a(vcj.class);
    }

    @Provides
    @Singleton
    public fyp h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyp) ipChange.ipc$dispatch("3063a4ca", new Object[]{this});
        }
        return new fyp();
    }

    @Provides
    public x7d i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7d) ipChange.ipc$dispatch("de4aabf9", new Object[]{this});
        }
        return (x7d) b88.a(mtl.class);
    }

    @Provides
    public uzd j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uzd) ipChange.ipc$dispatch("842eaf59", new Object[]{this});
        }
        return (uzd) b88.a(ejt.class);
    }

    @Provides
    @Singleton
    public sae k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sae) ipChange.ipc$dispatch("b6c02cd9", new Object[]{this});
        }
        return (sae) b88.a(jow.class);
    }
}
