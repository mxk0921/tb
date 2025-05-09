package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fwr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REFLOW = "_REFLOW";
    public static final String SHARE = "_SHARE";
    public static final String SHARE_TAG = "TBShare";

    static {
        t2o.a(665845785);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{str, str2});
            return;
        }
        TLog.loge("TBShareModule", str, "[record]--> " + str2);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
            return;
        }
        TLog.loge("TBShareModule", str, "[exception]--> " + str2);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccae41c9", new Object[]{str, str2});
            return;
        }
        TLog.loge("TBShareModule", str, "[return]--> " + str2);
    }

    public static void d(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8782b99a", new Object[]{str});
            return;
        }
        try {
            str2 = ShareBizAdapter.getInstance().getAppEnv().getTopActivity().getClass().getSimpleName();
        } catch (Throwable unused) {
            str2 = "";
        }
        TLog.loge("TBShareModule", REFLOW, str + ",currentAty=" + str2);
    }

    public static void e(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed105c", new Object[]{str});
            return;
        }
        try {
            str2 = ShareBizAdapter.getInstance().getAppEnv().getTopActivity().getClass().getSimpleName();
        } catch (Throwable unused) {
            str2 = "";
        }
        TLog.loge("TBShareModule", SHARE, str + ",currentAty=" + str2);
    }
}
