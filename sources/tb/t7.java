package tb;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.AInteractLifeCycle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class t7 extends AInteractLifeCycle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(689963118);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(Context context, FrameLayout frameLayout, jmi jmiVar, vv1 vv1Var) {
        super(context, frameLayout, jmiVar, vv1Var);
        ckf.g(context, "context");
        ckf.g(frameLayout, "interactHostView");
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
    }

    public static /* synthetic */ Object ipc$super(t7 t7Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1443575324) {
            super.x((String) objArr[0]);
            return null;
        } else if (hashCode == -1209017808) {
            super.y((String) objArr[0]);
            return null;
        } else if (hashCode == 1350033330) {
            super.w();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/core/layer/AInteractLayer");
        }
    }

    @Override // tb.wx1
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5077dfb2", new Object[]{this});
            return;
        }
        super.w();
        q0();
    }

    @Override // tb.wx1
    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f4c9e4", new Object[]{this, str});
            return;
        }
        ckf.g(str, "changeType");
        super.x(str);
        y0();
        B0();
    }

    @Override // tb.wx1
    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7efda30", new Object[]{this, str});
            return;
        }
        ckf.g(str, "changeType");
        super.y(str);
        D0();
    }
}
