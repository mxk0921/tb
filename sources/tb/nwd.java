package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class nwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909726);
    }

    public static final String a(mwd mwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("706f1264", new Object[]{mwdVar});
        }
        ckf.g(mwdVar, "<this>");
        return ckf.p("Themis/Launch/", mwdVar.getName());
    }
}
