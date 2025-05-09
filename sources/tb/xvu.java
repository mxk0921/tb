package tb;

import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.framework.UpdateRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xvu implements wvu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(947912728);
        t2o.a(946864136);
    }

    @Override // tb.wvu
    public void toast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            Toast.makeText(UpdateRuntime.getContext(), str, 1).show();
        }
    }
}
