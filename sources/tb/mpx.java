package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(996147234);
    }

    public mpx a(afe afeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpx) ipChange.ipc$dispatch("74276508", new Object[]{this, afeVar});
        }
        dpx.i(afeVar);
        return this;
    }
}
