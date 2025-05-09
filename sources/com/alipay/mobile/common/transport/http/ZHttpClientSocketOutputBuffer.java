package com.alipay.mobile.common.transport.http;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.Socket;
import org.apache.http.impl.io.AbstractSessionOutputBuffer;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.params.HttpParams;
import org.apache.http.util.ByteArrayBuffer;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZHttpClientSocketOutputBuffer extends AbstractSessionOutputBuffer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ByteArrayBuffer f4084a;
    public OutputStream b;
    public HttpTransportMetricsImpl c;

    public ZHttpClientSocketOutputBuffer(Socket socket, int i, HttpParams httpParams) {
        if (socket != null) {
            init(socket.getOutputStream(), 8192, httpParams);
            getInnerMetrics();
            a();
            return;
        }
        throw new IllegalArgumentException("Socket may not be null");
    }

    public static /* synthetic */ Object ipc$super(ZHttpClientSocketOutputBuffer zHttpClientSocketOutputBuffer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -904563285) {
            return ZHttpClientSocketOutputBuffer.super.getMetrics();
        }
        if (hashCode == 136713985) {
            ZHttpClientSocketOutputBuffer.super.init((OutputStream) objArr[0], ((Number) objArr[1]).intValue(), (HttpParams) objArr[2]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/common/transport/http/ZHttpClientSocketOutputBuffer");
    }

    public final ByteArrayBuffer a() {
        ByteArrayBuffer byteArrayBuffer = this.f4084a;
        if (byteArrayBuffer != null) {
            return byteArrayBuffer;
        }
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField(pg1.ATOM_EXT_buffer);
            declaredField.setAccessible(true);
            ByteArrayBuffer byteArrayBuffer2 = (ByteArrayBuffer) declaredField.get(this);
            this.f4084a = byteArrayBuffer2;
            return byteArrayBuffer2;
        } catch (Throwable th) {
            LogCatUtil.error("ZHttpClientSocketOutputBuffer", "getInnerBuffer fail", th);
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(th);
            throw interruptedIOException;
        }
    }

    public HttpTransportMetricsImpl getInnerMetrics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpTransportMetricsImpl) ipChange.ipc$dispatch("266ea82e", new Object[]{this});
        }
        HttpTransportMetricsImpl httpTransportMetricsImpl = this.c;
        if (httpTransportMetricsImpl != null) {
            return httpTransportMetricsImpl;
        }
        HttpTransportMetricsImpl metrics = ZHttpClientSocketOutputBuffer.super.getMetrics();
        if (metrics == null || !(metrics instanceof HttpTransportMetricsImpl)) {
            throw new IOException("getInnerMetrics fail");
        }
        HttpTransportMetricsImpl httpTransportMetricsImpl2 = metrics;
        this.c = httpTransportMetricsImpl2;
        return httpTransportMetricsImpl2;
    }

    public void init(OutputStream outputStream, int i, HttpParams httpParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8261701", new Object[]{this, outputStream, new Integer(i), httpParams});
            return;
        }
        ZHttpClientSocketOutputBuffer.super.init(outputStream, i, httpParams);
        this.b = outputStream;
    }

    public void write(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        } else if (bArr != null) {
            if (i2 > a().capacity()) {
                flushBuffer();
                this.b.write(bArr, i, i2);
                HttpTransportMetricsImpl innerMetrics = getInnerMetrics();
                if (innerMetrics != null) {
                    innerMetrics.incrementBytesTransferred(i2);
                    return;
                }
                return;
            }
            if (i2 > a().capacity() - a().length()) {
                flushBuffer();
            }
            a().append(bArr, i, i2);
        }
    }
}
