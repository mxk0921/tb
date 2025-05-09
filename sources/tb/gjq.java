package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.globalmodel.TBShareContent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gjq extends spd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797271);
    }

    public static /* synthetic */ Object ipc$super(gjq gjqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/core/share/interceptor/StateResetProcessor");
    }

    public final boolean c(WeakReference<Activity> weakReference, WeakReference<Activity> weakReference2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93c582ea", new Object[]{this, weakReference, weakReference2})).booleanValue();
        }
        if (weakReference == null || weakReference2 == null || weakReference2.get() != weakReference.get()) {
            return false;
        }
        return true;
    }

    @Override // tb.spd
    public void b(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30454f87", new Object[]{this, arrayList, tBShareContent, str});
            return;
        }
        kkp e = kkp.e();
        e.a(kkp.KEY_SHAREPANELSTATERESETPROCESSORSTART);
        WeakReference<Activity> p = bwr.h().p();
        if (p == null) {
            bwr.h().t(false);
        } else if (!c(ClipUrlWatcherControl.z().s(), p)) {
            bwr.h().t(false);
        }
        e.a(kkp.KEY_SHAREPANELSTATERESETPROCESSOREND);
    }
}
