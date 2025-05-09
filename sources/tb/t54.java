package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.model.BaseRecModel;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t54 extends clo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public IInteractiveProxy.h U;
    public WeakReference<axc> V;
    public skd W;
    public final xco X = new xco();
    public boolean Y;

    static {
        t2o.a(806355706);
    }

    public static /* synthetic */ Object ipc$super(t54 t54Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/context/CommonFrameContext");
    }

    public boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("710a266e", new Object[]{this})).booleanValue();
        }
        return this.Y;
    }

    public void C0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d7f4e2", new Object[]{this, new Boolean(z)});
        } else {
            this.Y = z;
        }
    }

    public void D0(axc axcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216eeba4", new Object[]{this, axcVar});
        } else {
            this.V = new WeakReference<>(axcVar);
        }
    }

    public void E0(skd skdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0552bb1", new Object[]{this, skdVar});
        } else {
            this.W = skdVar;
        }
    }

    public void F0(IInteractiveProxy.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7fa82ec", new Object[]{this, hVar});
        } else {
            this.U = hVar;
        }
    }

    public axc v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (axc) ipChange.ipc$dispatch("c54a3da4", new Object[]{this});
        }
        WeakReference<axc> weakReference = this.V;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public BaseRecModel w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseRecModel) ipChange.ipc$dispatch("91bda10e", new Object[]{this});
        }
        return null;
    }

    public xco x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xco) ipChange.ipc$dispatch("19bf0d46", new Object[]{this});
        }
        return this.X;
    }

    public skd y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (skd) ipChange.ipc$dispatch("420fe34b", new Object[]{this});
        }
        return this.W;
    }

    public IInteractiveProxy.h z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy.h) ipChange.ipc$dispatch("d5cdd132", new Object[]{this});
        }
        return this.U;
    }
}
