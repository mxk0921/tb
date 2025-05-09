package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ncs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909755);
    }

    public static final String a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d3a78e2", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        return mcs.d(c(iTMSPage));
    }

    public static final String b(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26620fd1", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        return mcs.d(d(bbsVar));
    }

    public static final String c(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b800b9c", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        return d(iTMSPage.getInstance()) + '_' + ((Object) iTMSPage.b());
    }

    public static final String d(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6081090b", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        return ckf.p("TMS_", bbsVar.g);
    }
}
