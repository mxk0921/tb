package com.taobao.taolive.uikit.favor;

import android.os.SystemClock;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int d = 18;

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<AbstractC0762a> f13344a = new SparseArray<>();
    private boolean b = false;
    private final Object[] c = new Object[0];

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taolive.uikit.favor.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface AbstractC0762a {
        void drawFavor();
    }

    static {
        t2o.a(779093592);
    }

    public void a(AbstractC0762a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6182b7", new Object[]{this, aVar});
            return;
        }
        synchronized (this.c) {
            this.f13344a.remove(System.identityHashCode(aVar));
        }
    }

    public void b(AbstractC0762a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c68618", new Object[]{this, aVar});
            return;
        }
        synchronized (this.c) {
            this.f13344a.put(System.identityHashCode(aVar), aVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.b = false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (this.b) {
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (this.c) {
                for (int i = 0; i < this.f13344a.size(); i++) {
                    AbstractC0762a valueAt = this.f13344a.valueAt(i);
                    if (valueAt != null) {
                        try {
                            valueAt.drawFavor();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 < 18) {
                try {
                    Thread.sleep(18 - uptimeMillis2);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
