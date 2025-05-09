package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f19408a;
    public final int b;
    public final Intent c;

    static {
        t2o.a(815793740);
    }

    public fml(int i, int i2, Intent intent) {
        this.f19408a = i;
        this.b = i2;
        this.c = intent;
    }

    public static fml a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fml) ipChange.ipc$dispatch("8f6cf73", new Object[]{new Integer(i), new Integer(i2), intent});
        }
        return new fml(i, i2, intent);
    }
}
