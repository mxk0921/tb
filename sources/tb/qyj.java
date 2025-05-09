package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qyj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321708);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07f0335", new Object[]{str, str2});
        } else if (str != null) {
            TBS.Ext.commitEvent("Page_NewDetail", 19999, "nd_custom_err_et", str, str2);
        } else {
            txj.e("new_detail异常", "commitCustomErrorEvent errorArg2 is null");
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8878c008", new Object[]{str, str2});
        } else if (str != null) {
            gxj.a("commitCustomErrorEvent errorArg2:" + str + " paramStr:" + str2, null);
            TBS.Ext.commitEvent("Page_NewDetail", 19999, "nd_custom_err_et", str, str2);
        } else {
            txj.e("new_detail异常", "commitCustomErrorEvent errorArg2 is null");
        }
    }
}
