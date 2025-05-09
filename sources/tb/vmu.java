package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vmu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int WAIT_FOR_DEVICE_INFO_INTERRUPT = 1;
    public static final int WAIT_FOR_GET_HTTPDNS_DONE = 3;
    public static final int WAIT_FOR_START_STREAM_PROCESS_DONE = 2;
    public static final int WAIT_FOR_UNINIT_DONE = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f30113a = new Object[10];
    public final boolean[] b = new boolean[10];

    static {
        t2o.a(395313656);
    }

    public vmu() {
        for (int i = 0; i < 10; i++) {
            this.f30113a[i] = new Object();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2548f9b4", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.f30113a[i]) {
            this.b[i] = true;
            this.f30113a[i].notify();
        }
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("898e335b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        synchronized (this.f30113a[i]) {
            if (!this.b[i]) {
                try {
                    this.f30113a[i].wait(i2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.b[i] = false;
        }
    }
}
