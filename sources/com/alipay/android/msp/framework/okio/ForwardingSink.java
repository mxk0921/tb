package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ForwardingSink implements Sink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Sink f3645a;

    public ForwardingSink(Sink sink) {
        if (sink != null) {
            this.f3645a = sink;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f3645a.close();
        }
    }

    public final Sink delegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sink) ipChange.ipc$dispatch("e5d04126", new Object[]{this});
        }
        return this.f3645a;
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            this.f3645a.flush();
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public Timeout timeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this});
        }
        return this.f3645a.timeout();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getClass().getSimpleName() + f7l.BRACKET_START_STR + this.f3645a.toString() + f7l.BRACKET_END_STR;
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public void write(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
        } else {
            this.f3645a.write(buffer, j);
        }
    }
}
