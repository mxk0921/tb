package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wte {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static xec a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xec) ipChange.ipc$dispatch("e5db65a2", new Object[]{str});
        }
        return new xte(str);
    }
}
