package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nza extends nv1 implements gqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782814);
        t2o.a(488636423);
    }

    public nza(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ Object ipc$super(nza nzaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/hostservice/callbcak/impl/HomeContainerCallback");
    }

    @Override // tb.gqb
    public View h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("64e717e3", new Object[]{this, str});
        }
        return w().d(str);
    }

    @Override // tb.gqb
    public boolean j(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50f5465e", new Object[]{this, view, layoutParams})).booleanValue();
        }
        return w().a(view, layoutParams);
    }

    @Override // tb.gqb
    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cbb17a", new Object[]{this, new Boolean(z)});
        } else {
            w().u(z);
        }
    }
}
