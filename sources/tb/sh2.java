package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sh2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final sh2 f28047a = new sh2();

    static {
        t2o.a(736100357);
    }

    public static sh2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sh2) ipChange.ipc$dispatch("6220b431", new Object[0]);
        }
        return f28047a;
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d32cfc", new Object[]{this});
        }
    }
}
