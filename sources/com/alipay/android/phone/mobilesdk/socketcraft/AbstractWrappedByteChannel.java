package com.alipay.android.phone.mobilesdk.socketcraft;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AbstractWrappedByteChannel implements WrappedByteChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ByteChannel f3749a;

    public AbstractWrappedByteChannel(ByteChannel byteChannel) {
        this.f3749a = byteChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f3749a.close();
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isBlocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b66cc08a", new Object[]{this})).booleanValue();
        }
        ByteChannel byteChannel = this.f3749a;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).isBlocking();
        }
        return false;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isNeedRead() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faf60c21", new Object[]{this})).booleanValue();
        }
        ByteChannel byteChannel = this.f3749a;
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).isNeedRead();
        }
        return false;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isNeedWrite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("551a0bea", new Object[]{this})).booleanValue();
        }
        ByteChannel byteChannel = this.f3749a;
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).isNeedWrite();
        }
        return false;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return this.f3749a.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52b3c647", new Object[]{this, byteBuffer})).intValue();
        }
        return this.f3749a.read(byteBuffer);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public int readMore(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("874f4f72", new Object[]{this, byteBuffer})).intValue();
        }
        ByteChannel byteChannel = this.f3749a;
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).readMore(byteBuffer);
        }
        return 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9193c1e", new Object[]{this, byteBuffer})).intValue();
        }
        return this.f3749a.write(byteBuffer);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public void writeMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d37a5b", new Object[]{this});
            return;
        }
        ByteChannel byteChannel = this.f3749a;
        if (byteChannel instanceof WrappedByteChannel) {
            ((WrappedByteChannel) byteChannel).writeMore();
        }
    }

    public AbstractWrappedByteChannel(WrappedByteChannel wrappedByteChannel) {
        this.f3749a = wrappedByteChannel;
    }
}
