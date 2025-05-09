package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class xv1<MODEL, VIEW extends View> extends BaseComponent<MODEL, VIEW> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31622a;
    public final qpu b;

    static {
        t2o.a(919601236);
    }

    public xv1(qpu qpuVar) {
        ckf.g(qpuVar, "turboEngineContext");
        this.b = qpuVar;
        this.f31622a = qpuVar.getContext();
    }

    public static /* synthetic */ Object ipc$super(xv1 xv1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/component/BaseInnerComponent");
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public final Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f31622a;
    }

    public final qpu k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpu) ipChange.ipc$dispatch("3d61b71e", new Object[]{this});
        }
        return this.b;
    }
}
