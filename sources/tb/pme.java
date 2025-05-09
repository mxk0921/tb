package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pme {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26181a;
    public boolean b = false;
    public int c = 0;
    public int d = 0;

    static {
        t2o.a(986710139);
    }

    public synchronized void a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d39914", new Object[]{this, iArr});
            return;
        }
        this.b = true;
        iArr[0] = this.c;
        iArr[1] = this.d;
    }

    public synchronized boolean b(int i, int i2) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("efd3435a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            } else if (!this.b) {
                return false;
            } else {
                this.b = false;
                if (this.c == i || this.d == i2) {
                    z = false;
                }
                this.c = i;
                this.d = i2;
                return z;
            }
        }
    }
}
