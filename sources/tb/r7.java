package tb;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.AInteractLifeCycle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class r7 extends AInteractLifeCycle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(689963015);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(Context context, FrameLayout frameLayout, jmi jmiVar, vv1 vv1Var) {
        super(context, frameLayout, jmiVar, vv1Var);
        ckf.g(context, "context");
        ckf.g(frameLayout, "interactHostView");
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
    }

    public static /* synthetic */ Object ipc$super(r7 r7Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -172691066) {
            super.C((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 1335953106) {
            super.D((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 1350033330) {
            super.w();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/core/component/AInteractComponent");
        }
    }

    @Override // tb.wx1
    public void C(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b4f186", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "changeType");
        super.C(str, str2);
        if (F0(str)) {
            y0();
            B0();
        }
    }

    @Override // tb.wx1
    public void D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa106d2", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "changeType");
        super.D(str, str2);
        if (F0(str)) {
            D0();
        }
    }

    public abstract boolean E0();

    public abstract boolean F0(String str);

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
}
