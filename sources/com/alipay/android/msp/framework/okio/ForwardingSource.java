package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ForwardingSource implements Source {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Source f3646a;

    public ForwardingSource(Source source) {
        if (source != null) {
            this.f3646a = source;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f3646a.close();
        }
    }

    public final Source delegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Source) ipChange.ipc$dispatch("bd68191e", new Object[]{this});
        }
        return this.f3646a;
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public long read(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue();
        }
        return this.f3646a.read(buffer, j);
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public Timeout timeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this});
        }
        return this.f3646a.timeout();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getClass().getSimpleName() + f7l.BRACKET_START_STR + this.f3646a.toString() + f7l.BRACKET_END_STR;
    }
}
