package tb;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaobaoApplication;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y9a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_STAGE = "CLICK_TIME";
    public static final String CONSTRUCT_PAGE_STAGE = "CONSTRUCT_PAGE_TIME";
    public static final String EXTRA_KEY_CLICK_TO_TAB_CHANGE = "CLICK_TO_TAB_CHANGE";
    public static final String EXTRA_REFERRER = "referrer";

    public static <T> T a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b06b7cd0", new Object[]{obj});
        }
        return obj;
    }

    public static Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("267167ae", new Object[0]);
        }
        return (Context) a(TaobaoApplication.sApplication);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[0]);
        }
        return "uikit_navigation";
    }

    public static void d(Fragment fragment, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d763c8a4", new Object[]{fragment, str, new Long(j)});
        } else if (fragment != null) {
            Bundle arguments = fragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
                try {
                    fragment.setArguments(arguments);
                } catch (IllegalStateException unused) {
                    rpj.a("saveTimeIntoFragmentArgs", "IllegalStateException");
                }
            }
            if (arguments.getLong(str, -1L) == -1) {
                arguments.putLong(str, j);
            }
        }
    }
}
