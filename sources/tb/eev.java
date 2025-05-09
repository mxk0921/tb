package tb;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class eev implements wyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767011);
        t2o.a(944767003);
    }

    @Override // tb.wyc
    public void a(Fragment fragment, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534c7217", new Object[]{this, fragment, str, new Integer(i)});
            return;
        }
        try {
            Nav.from(fragment.getContext()).withFragment(fragment).forResult(i).toUri(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // tb.wyc
    public void b(Activity activity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd0a8fd", new Object[]{this, activity, str, new Integer(i)});
            return;
        }
        try {
            Nav.from(activity).forResult(i).toUri(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
