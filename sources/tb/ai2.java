package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ai2 extends gu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(736100444);
    }

    public static /* synthetic */ Object ipc$super(ai2 ai2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/bootimage/lifecycle/BootImagePageState");
    }

    @Override // tb.gu
    public void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70792abd", new Object[]{this, activity, new Boolean(z)});
        } else if (nh2.f24729a) {
            tm1.a("BootImagePageState", "coldStart:");
            usg.d().a().a(1000, activity);
        }
    }

    @Override // tb.gu
    public void b(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f42c26", new Object[]{this, activity, new Boolean(z)});
            return;
        }
        tm1.a("BootImagePageState", "hotStart:");
        usg.d().a().a(1001, activity);
    }

    @Override // tb.gu
    public void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b5627b", new Object[]{this, activity});
            return;
        }
        oh2.e().h();
        tm1.a("BootImagePageState", "pageInBackground:");
        usg.d().a().g(205);
    }

    @Override // tb.gu
    public void d(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb43af47", new Object[]{this, str, th});
            return;
        }
        try {
            tm1.a("BootImagePageState", "pageInErrorState lifeState:" + str + " , msg:" + th.getMessage());
            tm1.a("BootImagePageState", "pageInErrorState: 新架构");
            usg.d().a().g(205);
        } catch (Throwable th2) {
            tm1.a("BootImagePageState", "pageInErrorState error again!\n" + th2.getMessage());
        }
    }
}
