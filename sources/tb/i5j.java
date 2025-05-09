package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i5j implements gwc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944564);
        t2o.a(1034944515);
    }

    public void a(int i, String str, int i2, String str2, String str3, String str4, int i3, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748c4965", new Object[]{this, new Integer(i), str, new Integer(i2), str2, str3, str4, new Integer(i3), str5, str6});
        } else {
            uxa.g(i, str, str2, str3, i2, str4, i3, str5, str6);
        }
    }
}
