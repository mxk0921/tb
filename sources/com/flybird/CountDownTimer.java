package com.flybird;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class CountDownTimer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f4895a;
    public final long b;
    public long c;
    public long d;
    public boolean e = false;
    public volatile boolean f = false;
    public volatile boolean isTimerFinishing = false;
    public Handler g = new Handler(Looper.getMainLooper()) { // from class: com.flybird.CountDownTimer.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/CountDownTimer$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            synchronized (CountDownTimer.this) {
                try {
                    if (!CountDownTimer.this.f) {
                        long elapsedRealtime = CountDownTimer.this.c - SystemClock.elapsedRealtime();
                        if (elapsedRealtime <= 0) {
                            if (!CountDownTimer.this.f) {
                                CountDownTimer.this.isTimerFinishing = true;
                                CountDownTimer.this.onFinish();
                                CountDownTimer.this.isTimerFinishing = false;
                            }
                        } else if (elapsedRealtime < CountDownTimer.this.b) {
                            sendMessageDelayed(obtainMessage(1), elapsedRealtime);
                        } else {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            CountDownTimer.this.onTick(elapsedRealtime);
                            long elapsedRealtime3 = (elapsedRealtime2 + CountDownTimer.this.b) - SystemClock.elapsedRealtime();
                            while (elapsedRealtime3 < 0) {
                                elapsedRealtime3 += CountDownTimer.this.b;
                            }
                            if (!CountDownTimer.this.e) {
                                sendMessageDelayed(obtainMessage(1), elapsedRealtime3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public CountDownTimer(long j, long j2) {
        this.f4895a = j;
        this.b = j2;
    }

    public final void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        Handler handler = this.g;
        if (handler != null) {
            handler.removeMessages(1);
            this.e = true;
            this.g = null;
        }
    }

    public abstract void onFinish();

    public abstract void onTick(long j);

    public long pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("315dbf71", new Object[]{this})).longValue();
        }
        this.d = this.c - SystemClock.elapsedRealtime();
        this.f = true;
        return this.d;
    }

    public final synchronized CountDownTimer start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownTimer) ipChange.ipc$dispatch("fb9e00f7", new Object[]{this});
        } else if (this.g == null) {
            return this;
        } else {
            if (this.f4895a <= 0) {
                this.isTimerFinishing = true;
                onFinish();
                this.isTimerFinishing = false;
                return this;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f4895a;
            this.c = elapsedRealtime + j;
            if (Long.MAX_VALUE == j) {
                Handler handler = this.g;
                handler.sendMessageDelayed(handler.obtainMessage(1), this.b);
            } else {
                Handler handler2 = this.g;
                handler2.sendMessage(handler2.obtainMessage(1));
            }
            this.e = false;
            this.f = false;
            return this;
        }
    }
}
