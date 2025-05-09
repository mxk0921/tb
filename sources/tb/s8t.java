package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s8t implements syd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744488972);
        t2o.a(467664927);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6593f6", new Object[]{this, str, str2});
        } else {
            q8t.b(str, str2);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4e7c7d", new Object[]{this, str, str2});
        } else {
            q8t.d(str, str2);
        }
    }
}
