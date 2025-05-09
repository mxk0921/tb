package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tvv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093716);
    }

    public static void setUtVariables(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c761e7", new Object[]{str});
        } else {
            u4v.getInstance().setRefPage(str);
        }
    }
}
