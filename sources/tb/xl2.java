package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static xl2 f31451a;

    static {
        t2o.a(764411992);
    }

    public static xl2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xl2) ipChange.ipc$dispatch("331516d", new Object[0]);
        }
        if (f31451a == null) {
            f31451a = new xl2();
        }
        return f31451a;
    }

    public void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba85acc", new Object[]{this, intent});
        }
    }
}
