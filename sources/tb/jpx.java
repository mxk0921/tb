package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jpx implements afe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.afe
    public String load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("447a3289", new Object[]{this, str});
        }
        l6h c = bzn.d().c(str);
        if (c.i()) {
            return null;
        }
        return c.toString();
    }
}
