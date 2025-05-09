package tb;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sml implements a6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.a6d
    public IPage a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("49e83c9d", new Object[]{this, view, new Boolean(z)});
        }
        return new gll().p(true).l(view).h(z).a();
    }

    @Override // tb.a6d
    public IPage b(Fragment fragment, String str, String str2, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("fb65ea88", new Object[]{this, fragment, str, str2, view, new Boolean(z)});
        }
        return new gll().k(fragment).j(str).m(str2).p(true).l(view).h(z).a();
    }
}
