package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class f0g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438855);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600486f8", new Object[]{this, str});
        }
    }
}
