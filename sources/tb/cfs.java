package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class cfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(852492302);
    }

    public static final String a(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2381a687", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        return bbsVar.h("gestureMode");
    }

    public static final ITMSPage b(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("57ead849", new Object[]{weexInstance});
        }
        ckf.g(weexInstance, "<this>");
        Object tag = weexInstance.getTag("tmsPage");
        if (tag instanceof ITMSPage) {
            return (ITMSPage) tag;
        }
        return null;
    }

    public static final void c(bbs bbsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebf6237", new Object[]{bbsVar, str});
            return;
        }
        ckf.g(bbsVar, "<this>");
        ckf.g(str, "gestureMode");
        bbsVar.j("gestureMode", str);
    }

    public static final void d(WeexInstance weexInstance, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c26757", new Object[]{weexInstance, iTMSPage});
            return;
        }
        ckf.g(weexInstance, "<this>");
        ckf.g(iTMSPage, "page");
        weexInstance.setTag("tmsPage", iTMSPage);
    }
}
