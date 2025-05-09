package com.taobao.android.dinamic.view;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.HandlerTimer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a extends HandlerTimer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long e;
    public long f;

    static {
        t2o.a(444596423);
    }

    public a(Runnable runnable) {
        super(runnable);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2130491415:
                super.e();
                return null;
            case -1620694021:
                super.f(((Number) objArr[0]).longValue());
                return null;
            case 802456342:
                super.c();
                return null;
            case 828227453:
                super.b();
                return null;
            case 1713617801:
                super.g();
                return null;
            case 1887430145:
                super.a();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/view/IntensiveHandlerTimer");
        }
    }

    @Override // com.taobao.android.dinamic.view.HandlerTimer
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            super.a();
        }
    }

    @Override // com.taobao.android.dinamic.view.HandlerTimer
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (this.c != HandlerTimer.TimerStatus.Paused) {
            this.b -= System.currentTimeMillis() - this.e;
            super.b();
        }
    }

    @Override // com.taobao.android.dinamic.view.HandlerTimer
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd48316", new Object[]{this});
        } else if (this.c != HandlerTimer.TimerStatus.Running) {
            this.e = System.currentTimeMillis();
            if (this.b < 0) {
                this.b = this.f / 2;
            }
            super.c();
        }
    }

    @Override // com.taobao.android.dinamic.view.HandlerTimer
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc219b06", new Object[]{this});
            return;
        }
        this.b = this.f;
        this.e = System.currentTimeMillis();
    }

    @Override // com.taobao.android.dinamic.view.HandlerTimer
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        this.e = System.currentTimeMillis();
        super.e();
    }

    @Override // com.taobao.android.dinamic.view.HandlerTimer
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.c != HandlerTimer.TimerStatus.Stopped) {
            super.g();
        }
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34e1136", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f66283a", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = System.currentTimeMillis();
        long j = i;
        this.b = j;
        super.f(j);
    }

    public void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f2172f", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public a(long j, Runnable runnable) {
        super(j, runnable);
        this.f = j;
    }

    public a(long j, Runnable runnable, Handler handler) {
        super(j, runnable, handler);
    }
}
