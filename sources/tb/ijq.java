package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ijq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f21352a;
    private bdq b;
    private int c;
    private int d;
    private hjq e;

    static {
        t2o.a(677380268);
    }

    public ijq(hjq hjqVar, bdq bdqVar, int i, int i2, int i3) {
        this.e = hjqVar;
        this.b = bdqVar;
        this.c = i;
        this.f21352a = i2;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        cdq cdqVar = new cdq(this.b.h(), this.c, this.f21352a, this.d, this.b.a(), this.b.j(), this.b.f(), this.b.e(), this.b.g(), (ArrayList) this.b.d());
        Log.e("StateUpdateRunnable", "onStateUpdate: " + cdqVar.toString());
        this.e.e(cdqVar);
    }
}
