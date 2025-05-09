package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qx6 implements bgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.bgb
    public abe a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abe) ipChange.ipc$dispatch("32a4839d", new Object[]{this});
        }
        return new f97();
    }
}
