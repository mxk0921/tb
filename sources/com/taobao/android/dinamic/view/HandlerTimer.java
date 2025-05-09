package com.taobao.android.dinamic.view;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HandlerTimer implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f7278a;
    public long b;
    public TimerStatus c;
    private Runnable d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum TimerStatus {
        Waiting(0, "待启动"),
        Running(1, "运行中"),
        Paused(-1, "暂停"),
        Stopped(-2, "停止");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int code;
        private String desc;

        TimerStatus(int i, String str) {
            this.code = i;
            this.desc = str;
        }

        public static /* synthetic */ Object ipc$super(TimerStatus timerStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/view/HandlerTimer$TimerStatus");
        }

        public static TimerStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TimerStatus) ipChange.ipc$dispatch("aa411807", new Object[]{str});
            }
            return (TimerStatus) Enum.valueOf(TimerStatus.class, str);
        }

        public int getCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
            }
            return this.code;
        }

        public String getDesc() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
            }
            return this.desc;
        }

        public void setCode(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15beaf4d", new Object[]{this, new Integer(i)});
            } else {
                this.code = i;
            }
        }

        public void setDesc(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb9c4864", new Object[]{this, str});
            } else {
                this.desc = str;
            }
        }
    }

    static {
        t2o.a(444596421);
    }

    public HandlerTimer(Runnable runnable) {
        this(1000L, runnable);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.c = TimerStatus.Stopped;
        this.f7278a.removeCallbacks(this);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.c = TimerStatus.Paused;
        this.f7278a.removeCallbacks(this);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd48316", new Object[]{this});
            return;
        }
        this.f7278a.removeCallbacks(this);
        this.c = TimerStatus.Running;
        this.f7278a.postDelayed(this, this.b);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc219b06", new Object[]{this});
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        this.f7278a.removeCallbacks(this);
        this.c = TimerStatus.Running;
        this.f7278a.postDelayed(this, this.b);
    }

    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f662bfb", new Object[]{this, new Long(j)});
            return;
        }
        this.f7278a.removeCallbacks(this);
        this.c = TimerStatus.Running;
        this.f7278a.postDelayed(this, j);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.c = TimerStatus.Stopped;
        this.f7278a.removeCallbacksAndMessages(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        TimerStatus timerStatus = this.c;
        if (timerStatus != TimerStatus.Waiting && timerStatus != TimerStatus.Paused && timerStatus != TimerStatus.Stopped) {
            this.d.run();
            d();
            this.f7278a.removeCallbacks(this);
            this.f7278a.postDelayed(this, this.b);
        }
    }

    public HandlerTimer(long j, Runnable runnable) {
        this(j, runnable, new Handler(Looper.getMainLooper()));
    }

    public HandlerTimer(long j, Runnable runnable, Handler handler) {
        this.b = j;
        this.d = runnable;
        this.f7278a = handler;
        this.c = TimerStatus.Waiting;
    }
}
