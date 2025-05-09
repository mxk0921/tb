package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Timeout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Timeout NONE = new Timeout() { // from class: com.alipay.android.msp.framework.okio.Timeout.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/okio/Timeout$1");
        }

        @Override // com.alipay.android.msp.framework.okio.Timeout
        public Timeout deadlineNanoTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Timeout) ipChange.ipc$dispatch("96419034", new Object[]{this, new Long(j)});
            }
            return this;
        }

        @Override // com.alipay.android.msp.framework.okio.Timeout
        public void throwIfReached() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee278636", new Object[]{this});
            }
        }

        @Override // com.alipay.android.msp.framework.okio.Timeout
        public Timeout timeout(long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Timeout) ipChange.ipc$dispatch("14aab7ec", new Object[]{this, new Long(j), timeUnit});
            }
            return this;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public boolean f3654a;
    public long b;
    public long c;

    public Timeout clearDeadline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("1461ff5c", new Object[]{this});
        }
        this.f3654a = false;
        return this;
    }

    public Timeout clearTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("e305b42b", new Object[]{this});
        }
        this.c = 0L;
        return this;
    }

    public final Timeout deadline(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("21545d23", new Object[]{this, new Long(j), timeUnit});
        }
        if (j <= 0) {
            throw new IllegalArgumentException("duration <= 0: ".concat(String.valueOf(j)));
        } else if (timeUnit != null) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long deadlineNanoTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5490fe14", new Object[]{this})).longValue();
        }
        if (this.f3654a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5c9429d", new Object[]{this})).booleanValue();
        }
        return this.f3654a;
    }

    public void throwIfReached() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee278636", new Object[]{this});
        } else if (Thread.interrupted()) {
            throw new InterruptedIOException();
        } else if (this.f3654a && System.nanoTime() > this.b) {
            throw new IOException("deadline reached");
        }
    }

    public Timeout timeout(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("14aab7ec", new Object[]{this, new Long(j), timeUnit});
        }
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)));
        } else if (timeUnit != null) {
            this.c = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long timeoutNanos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71f878d9", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public Timeout deadlineNanoTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("96419034", new Object[]{this, new Long(j)});
        }
        this.f3654a = true;
        this.b = j;
        return this;
    }
}
