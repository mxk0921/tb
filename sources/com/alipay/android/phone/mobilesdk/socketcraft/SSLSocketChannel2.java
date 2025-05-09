package com.alipay.android.phone.mobilesdk.socketcraft;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLSession;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SSLSocketChannel2 implements WrappedByteChannel, ByteChannel {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ByteBuffer emptybuffer = ByteBuffer.allocate(0);
    public int bufferallocations = 0;
    public ExecutorService exec;
    public ByteBuffer inCrypt;
    public ByteBuffer inData;
    public ByteBuffer outCrypt;
    public SSLEngineResult readEngineResult;
    public SelectionKey selectionKey;
    public SocketChannel socketChannel;
    public SSLEngine sslEngine;
    public List<Future<?>> tasks;
    public SSLEngineResult writeEngineResult;

    public SSLSocketChannel2(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) {
        if (socketChannel == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.socketChannel = socketChannel;
        this.sslEngine = sSLEngine;
        this.exec = executorService;
        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.writeEngineResult = sSLEngineResult;
        this.readEngineResult = sSLEngineResult;
        this.tasks = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.selectionKey = selectionKey;
        }
        createBuffers(sSLEngine.getSession());
        this.socketChannel.write(F(emptybuffer));
        g();
    }

    public final int A(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e34358f", new Object[]{this, byteBuffer, byteBuffer2})).intValue();
        }
        int remaining = byteBuffer.remaining();
        int remaining2 = byteBuffer2.remaining();
        if (remaining > remaining2) {
            int min = Math.min(remaining, remaining2);
            for (int i = 0; i < min; i++) {
                byteBuffer2.put(byteBuffer.get());
            }
            return min;
        }
        byteBuffer2.put(byteBuffer);
        return remaining;
    }

    public final synchronized ByteBuffer C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("2dce99ab", new Object[]{this});
        }
        while (true) {
            int remaining = this.inData.remaining();
            SSLEngineResult unwrap = this.sslEngine.unwrap(this.inCrypt, this.inData);
            this.readEngineResult = unwrap;
            if (unwrap.getStatus() != SSLEngineResult.Status.OK || (remaining == this.inData.remaining() && this.sslEngine.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_UNWRAP)) {
                break;
            }
        }
        this.inData.flip();
        return this.inData;
    }

    public final synchronized ByteBuffer F(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("81d71f61", new Object[]{this, byteBuffer});
        }
        this.outCrypt.compact();
        this.writeEngineResult = this.sslEngine.wrap(byteBuffer, this.outCrypt);
        this.outCrypt.flip();
        return this.outCrypt;
    }

    public final void a(Future<?> future) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6c3b82", new Object[]{this, future});
            return;
        }
        while (true) {
            try {
                try {
                    future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                }
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        this.sslEngine.closeOutbound();
        this.sslEngine.getSession().invalidate();
        if (this.socketChannel.isOpen()) {
            this.socketChannel.write(F(emptybuffer));
        }
        this.socketChannel.close();
        this.exec.shutdownNow();
    }

    public SelectableChannel configureBlocking(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SelectableChannel) ipChange.ipc$dispatch("c3d6ec2d", new Object[]{this, new Boolean(z)});
        }
        return this.socketChannel.configureBlocking(z);
    }

    public boolean connect(SocketAddress socketAddress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a456aa2", new Object[]{this, socketAddress})).booleanValue();
        }
        return this.socketChannel.connect(socketAddress);
    }

    public void consumeDelegatedTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a248572", new Object[]{this});
            return;
        }
        while (true) {
            Runnable delegatedTask = this.sslEngine.getDelegatedTask();
            if (delegatedTask != null) {
                this.tasks.add(this.exec.submit(delegatedTask));
            } else {
                return;
            }
        }
    }

    public void createBuffers(SSLSession sSLSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df1ee55", new Object[]{this, sSLSession});
            return;
        }
        int packetBufferSize = sSLSession.getPacketBufferSize();
        int max = Math.max(sSLSession.getApplicationBufferSize(), packetBufferSize);
        ByteBuffer byteBuffer = this.inData;
        if (byteBuffer == null) {
            this.inData = ByteBuffer.allocate(max);
            this.outCrypt = ByteBuffer.allocate(packetBufferSize);
            this.inCrypt = ByteBuffer.allocate(packetBufferSize);
        } else {
            if (byteBuffer.capacity() != max) {
                this.inData = ByteBuffer.allocate(max);
            }
            if (this.outCrypt.capacity() != packetBufferSize) {
                this.outCrypt = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.inCrypt.capacity() != packetBufferSize) {
                this.inCrypt = ByteBuffer.allocate(packetBufferSize);
            }
        }
        this.inData.rewind();
        this.inData.flip();
        this.inCrypt.rewind();
        this.inCrypt.flip();
        this.outCrypt.rewind();
        this.outCrypt.flip();
        this.bufferallocations++;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d1a47b1", new Object[]{this})).booleanValue();
        }
        SSLEngineResult.HandshakeStatus handshakeStatus = this.sslEngine.getHandshakeStatus();
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            return true;
        }
        return false;
    }

    public boolean finishConnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7e209e2", new Object[]{this})).booleanValue();
        }
        return this.socketChannel.finishConnect();
    }

    public final synchronized void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282c6acf", new Object[]{this});
        } else if (this.sslEngine.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            if (!this.tasks.isEmpty()) {
                Iterator<Future<?>> it = this.tasks.iterator();
                while (it.hasNext()) {
                    Future<?> next = it.next();
                    if (next.isDone()) {
                        it.remove();
                    } else {
                        if (isBlocking()) {
                            a(next);
                        }
                        return;
                    }
                }
            }
            if (this.sslEngine.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                if (!isBlocking() || this.readEngineResult.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                    this.inCrypt.compact();
                    if (this.socketChannel.read(this.inCrypt) != -1) {
                        this.inCrypt.flip();
                    } else {
                        throw new IOException("connection closed unexpectedly by peer");
                    }
                }
                this.inData.compact();
                C();
                if (this.readEngineResult.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    createBuffers(this.sslEngine.getSession());
                    return;
                }
            }
            consumeDelegatedTasks();
            if (this.tasks.isEmpty() || this.sslEngine.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                this.socketChannel.write(F(emptybuffer));
                if (this.writeEngineResult.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    createBuffers(this.sslEngine.getSession());
                    return;
                }
            }
            this.bufferallocations = 1;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isBlocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b66cc08a", new Object[]{this})).booleanValue();
        }
        return this.socketChannel.isBlocking();
    }

    public boolean isConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue();
        }
        return this.socketChannel.isConnected();
    }

    public boolean isInboundDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f30cff1c", new Object[]{this})).booleanValue();
        }
        return this.sslEngine.isInboundDone();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isNeedRead() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faf60c21", new Object[]{this})).booleanValue();
        }
        if (this.inData.hasRemaining() || (this.inCrypt.hasRemaining() && this.readEngineResult.getStatus() != SSLEngineResult.Status.BUFFER_UNDERFLOW && this.readEngineResult.getStatus() != SSLEngineResult.Status.CLOSED)) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public boolean isNeedWrite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("551a0bea", new Object[]{this})).booleanValue();
        }
        if (this.outCrypt.hasRemaining() || !e()) {
            return true;
        }
        return false;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return this.socketChannel.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52b3c647", new Object[]{this, byteBuffer})).intValue();
        }
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (!e()) {
            if (isBlocking()) {
                while (!e()) {
                    g();
                }
            } else {
                g();
                if (!e()) {
                    return 0;
                }
            }
        }
        int w = w(byteBuffer);
        if (w != 0) {
            return w;
        }
        this.inData.clear();
        if (!this.inCrypt.hasRemaining()) {
            this.inCrypt.clear();
        } else {
            this.inCrypt.compact();
        }
        if ((isBlocking() || this.readEngineResult.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.socketChannel.read(this.inCrypt) == -1) {
            return -1;
        }
        this.inCrypt.flip();
        C();
        int A = A(this.inData, byteBuffer);
        if (A != 0 || !isBlocking()) {
            return A;
        }
        return read(byteBuffer);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public int readMore(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("874f4f72", new Object[]{this, byteBuffer})).intValue();
        }
        return w(byteBuffer);
    }

    public Socket socket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("72cb1699", new Object[]{this});
        }
        return this.socketChannel.socket();
    }

    public final int w(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19dd0e1d", new Object[]{this, byteBuffer})).intValue();
        }
        if (this.inData.hasRemaining()) {
            return A(this.inData, byteBuffer);
        }
        if (!this.inData.hasRemaining()) {
            this.inData.clear();
        }
        if (this.inCrypt.hasRemaining()) {
            C();
            int A = A(this.inData, byteBuffer);
            if (this.readEngineResult.getStatus() == SSLEngineResult.Status.CLOSED) {
                return -1;
            }
            if (A > 0) {
                return A;
            }
        }
        return 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9193c1e", new Object[]{this, byteBuffer})).intValue();
        }
        if (!e()) {
            g();
            return 0;
        }
        int write = this.socketChannel.write(F(byteBuffer));
        if (this.writeEngineResult.getStatus() != SSLEngineResult.Status.CLOSED) {
            return write;
        }
        throw new EOFException("Connection is closed");
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WrappedByteChannel
    public void writeMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d37a5b", new Object[]{this});
        } else {
            write(this.outCrypt);
        }
    }
}
