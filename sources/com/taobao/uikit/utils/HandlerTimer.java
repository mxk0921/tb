package com.taobao.uikit.utils;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class HandlerTimer implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler handler;
    private long interval;
    private TimerStatus status;
    private Runnable task;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/utils/HandlerTimer$TimerStatus");
        }

        public static TimerStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TimerStatus) ipChange.ipc$dispatch("1741e49e", new Object[]{str});
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
        t2o.a(931135578);
    }

    public HandlerTimer(Runnable runnable) {
        this(1000L, runnable);
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            this.status = TimerStatus.Stopped;
            handler.removeCallbacks(this);
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.status = TimerStatus.Paused;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this);
        }
    }

    public void restart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd48316", new Object[]{this});
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this);
            this.status = TimerStatus.Running;
            this.handler.postDelayed(this, this.interval);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        TimerStatus timerStatus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.handler != null && (timerStatus = this.status) != TimerStatus.Waiting && timerStatus != TimerStatus.Paused && timerStatus != TimerStatus.Stopped) {
            this.task.run();
            this.handler.postDelayed(this, this.interval);
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            TimerStatus timerStatus = this.status;
            TimerStatus timerStatus2 = TimerStatus.Running;
            if (timerStatus != timerStatus2) {
                handler.removeCallbacks(this);
                this.status = timerStatus2;
                this.handler.postDelayed(this, this.interval);
            }
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            this.status = TimerStatus.Stopped;
            handler.removeCallbacks(this);
            this.handler = null;
        }
    }

    public HandlerTimer(long j, Runnable runnable) {
        this(j, runnable, new Handler(Looper.getMainLooper()));
    }

    public HandlerTimer(long j, Runnable runnable, Handler handler) {
        if (handler == null || runnable == null) {
            throw new NullPointerException("handler or task must not be null");
        }
        this.interval = j;
        this.task = runnable;
        this.handler = handler;
        this.status = TimerStatus.Waiting;
    }
}
