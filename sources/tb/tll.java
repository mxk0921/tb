package tb;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface tll {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909510);
        }

        public static y0e a(tll tllVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y0e) ipChange.ipc$dispatch("22e14e53", new Object[]{tllVar});
            }
            ckf.g(tllVar, "this");
            x5d pageContainer = tllVar.getPageContainer();
            if (pageContainer == null) {
                return null;
            }
            return pageContainer.getTitleBar();
        }
    }

    Activity getCurrentActivity();

    Fragment getCurrentFragment();

    x5d getPageContainer();

    y0e getTitleBar();
}
