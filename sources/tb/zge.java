package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f32755a;

    public static synchronized int a() {
        synchronized (zge.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a296c0e8", new Object[0])).intValue();
            }
            if (f32755a >= Integer.MAX_VALUE) {
                f32755a = 0;
            }
            int i = f32755a;
            f32755a = i + 1;
            return i;
        }
    }
}
