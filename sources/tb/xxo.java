package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001811);
    }

    public xxo(float f) {
    }

    public static xxo a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xxo) ipChange.ipc$dispatch("ef0a9fb8", new Object[]{new Float(f)});
        }
        return new xxo(f);
    }
}
