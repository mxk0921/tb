package tb;

import android.app.Activity;
import com.alibaba.ut.page.VirtualPageObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.nb0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class dml implements nb0.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            nb0.d().a(this);
        }
    }

    @Override // tb.nb0.b
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        thh.h(null, "activity", activity);
        List<VirtualPageObject> b = vnl.b(activity);
        if (b.size() > 0) {
            for (VirtualPageObject virtualPageObject : b) {
                try {
                    c2v.getInstance().pageDestroyed(virtualPageObject);
                } catch (Throwable unused) {
                }
                virtualPageObject.getClass();
                nzu.l("0");
                vnl.a(virtualPageObject);
            }
        }
    }
}
