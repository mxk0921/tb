package tb;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import tb.trc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tei implements trc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f28663a;
    public final olk<trc> b = new olk<>();

    static {
        t2o.a(468714528);
        t2o.a(468714527);
        t2o.a(468714525);
    }

    public tei(FluidContext fluidContext) {
        this.f28663a = fluidContext;
    }

    public void addMediaLifecycleListener(trc trcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d049fb", new Object[]{this, trcVar});
        } else {
            this.b.a(trcVar);
        }
    }

    @Override // tb.trc
    public void onDataUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18deb5ea", new Object[]{this, uq9Var});
            return;
        }
        for (trc trcVar : this.b.b()) {
            try {
                trcVar.onDataUpdate(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f28663a, trcVar, "onDataUpdate", e);
            }
        }
    }

    @Override // tb.trc
    public void onPauseMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460321a5", new Object[]{this, uq9Var});
            return;
        }
        for (trc trcVar : this.b.b()) {
            try {
                trcVar.onPauseMedia(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f28663a, trcVar, "onPauseMedia", e);
            }
        }
    }

    @Override // tb.trc
    public void onRecyclePlayer(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
            return;
        }
        for (trc trcVar : this.b.b()) {
            try {
                trcVar.onRecyclePlayer(uq9Var, z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f28663a, trcVar, "onRecyclePlayer", e);
            }
        }
    }

    @Override // tb.trc
    public void onRequestMediaPlayer(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
            return;
        }
        for (trc trcVar : this.b.b()) {
            try {
                trcVar.onRequestMediaPlayer(uq9Var);
            } catch (Exception e) {
                e.printStackTrace();
                ir9.b("MediaLifecycleManager", "onRequestMediaPlayer error:" + e.getMessage());
                FluidException.throwObserverCallbackException(this.f28663a, trcVar, "onRequestMediaPlayer", e);
            }
        }
    }

    @Override // tb.trc
    public void onShowCover(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b0cef3", new Object[]{this, uq9Var});
            return;
        }
        for (trc trcVar : this.b.b()) {
            try {
                trcVar.onShowCover(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f28663a, trcVar, "onShowCover", e);
            }
        }
    }

    @Override // tb.trc
    public void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e3629", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), drawable, str});
            return;
        }
        for (trc trcVar : this.b.b()) {
            try {
                trcVar.onShowFirstCover(uq9Var, i, i2, drawable, str);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f28663a, trcVar, "onShowFirstCover", e);
            }
        }
    }

    @Override // tb.trc
    public void onStartMedia(uq9 uq9Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4fe1f9", new Object[]{this, uq9Var, new Boolean(z), new Boolean(z2)});
            return;
        }
        for (trc trcVar : this.b.b()) {
            try {
                trcVar.onStartMedia(uq9Var, z, z2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f28663a, trcVar, "onStartMedia", e);
            }
        }
    }

    @Override // tb.trc
    public void onStopMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd05673b", new Object[]{this, uq9Var});
            return;
        }
        for (trc trcVar : this.b.b()) {
            try {
                trcVar.onStopMedia(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f28663a, trcVar, "onStopMedia", e);
            }
        }
    }

    @Override // tb.trc
    public void onUTPairsUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55533c7c", new Object[]{this, uq9Var});
            return;
        }
        for (trc trcVar : this.b.b()) {
            try {
                trcVar.onUTPairsUpdate(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f28663a, trcVar, "onUTPairsUpdate", e);
            }
        }
    }

    public void removeMediaLifecycleListener(trc trcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2284829e", new Object[]{this, trcVar});
        } else {
            this.b.e(trcVar);
        }
    }

    public void addMediaLifecycleListener(trc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7966cc90", new Object[]{this, aVar});
        } else {
            this.b.a(aVar);
        }
    }

    public void removeMediaLifecycleListener(trc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff5b233", new Object[]{this, aVar});
        } else {
            this.b.e(aVar);
        }
    }
}
