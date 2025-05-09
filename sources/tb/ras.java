package tb;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.app.page.TMSBaseFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ras extends kas {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(835715108);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ras(FragmentActivity fragmentActivity, int i, FragmentManager fragmentManager) {
        super(fragmentActivity, i, fragmentManager);
        ckf.g(fragmentActivity, "mActivity");
        ckf.g(fragmentManager, "mFragmentManager");
    }

    public static /* synthetic */ Object ipc$super(ras rasVar, String str, Object... objArr) {
        if (str.hashCode() == 212160782) {
            super.i();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/page/TMSHomeFragmentManager");
    }

    @Override // tb.y8s
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        for (TMSBaseFragment tMSBaseFragment : e()) {
            d().beginTransaction().remove(tMSBaseFragment).commitAllowingStateLoss();
        }
        TMSBaseFragment g = g();
        if (g != null) {
            d().beginTransaction().remove(g).commitAllowingStateLoss();
        }
        super.i();
    }
}
