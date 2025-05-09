package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class aox extends y64 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993002076);
    }

    public static /* synthetic */ Object ipc$super(aox aoxVar, String str, Object... objArr) {
        if (str.hashCode() == 2077600179) {
            super.x((asi) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/refact/XslCombo");
    }

    @Override // tb.y64, tb.asi
    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        return T().finish;
    }

    @Override // tb.y64, tb.asi
    public void x(asi asiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd5a9b3", new Object[]{this, asiVar});
            return;
        }
        ckf.g(asiVar, "combo");
        super.x(asiVar);
        if (asiVar instanceof aox) {
            T().finish = ((aox) asiVar).T().finish;
        }
    }
}
