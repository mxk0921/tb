package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class chg implements ket<String, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public vct<String, Void> a(vct<String, Void> vctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vct) ipChange.ipc$dispatch("1b218093", new Object[]{this, vctVar});
        }
        return new nhg(vctVar);
    }
}
