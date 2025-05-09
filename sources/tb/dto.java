package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dto implements qmd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(682622985);
        t2o.a(676331664);
    }

    @Override // tb.qmd
    public rmd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rmd) ipChange.ipc$dispatch("6873195d", new Object[]{this});
        }
        caq.a();
        return new bp7();
    }
}
