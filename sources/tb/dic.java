package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438836);
    }

    public static final String a(cic cicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68e62804", new Object[]{cicVar});
        }
        ckf.g(cicVar, "<this>");
        return "tblive_kmp";
    }
}
