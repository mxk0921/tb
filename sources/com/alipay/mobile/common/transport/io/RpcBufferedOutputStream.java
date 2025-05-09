package com.alipay.mobile.common.transport.io;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcBufferedOutputStream extends BufferedOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f4118a = 0;

    public RpcBufferedOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public static /* synthetic */ Object ipc$super(RpcBufferedOutputStream rpcBufferedOutputStream, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -683656483) {
            super.write(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 462729549) {
            super.write((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/common/transport/io/RpcBufferedOutputStream");
        }
    }

    public int getContentLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e384f103", new Object[]{this})).intValue();
        }
        return this.f4118a;
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
            return;
        }
        super.write(i);
        this.f4118a++;
    }

    public RpcBufferedOutputStream(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        super.write(bArr, i, i2);
        this.f4118a += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10cfa82d", new Object[]{this, bArr});
        } else {
            super.write(bArr, 0, bArr.length);
        }
    }
}
