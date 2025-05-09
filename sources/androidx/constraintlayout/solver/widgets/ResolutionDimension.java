package androidx.constraintlayout.solver.widgets;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ResolutionDimension extends ResolutionNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float value = 0.0f;

    public static /* synthetic */ Object ipc$super(ResolutionDimension resolutionDimension, String str, Object... objArr) {
        if (str.hashCode() == 2022597206) {
            super.reset();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/solver/widgets/ResolutionDimension");
    }

    public void remove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41689b0b", new Object[]{this});
        } else {
            this.state = 2;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ResolutionNode
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        super.reset();
        this.value = 0.0f;
    }

    public void resolve(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161350f0", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.state;
        if (i2 == 0 || this.value != i) {
            this.value = i;
            if (i2 == 1) {
                invalidate();
            }
            didResolve();
        }
    }
}
