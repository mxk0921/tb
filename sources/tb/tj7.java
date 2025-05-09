package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b8360", new Object[]{new Integer(i)})).intValue();
        }
        return (int) ((i * w9a.g().a().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
