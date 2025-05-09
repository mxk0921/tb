package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anet.channel.AwcnConfig;
import anet.channel.bytes.ByteArray;
import anet.channel.util.ALog;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.entity.RequestConfig;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ParcelableInputStreamImpl extends ParcelableInputStream.Stub {
    private static final ByteArray EOS = ByteArray.create(0);
    private static final String TAG = "anet.ParcelableInputStreamImpl";
    private int blockIndex;
    private int blockOffset;
    private int contentLength;
    final ReentrantLock lock;
    final Condition newDataArrive;
    private final AtomicBoolean isClosed = new AtomicBoolean(false);
    private LinkedList<ByteArray> byteList = new LinkedList<>();
    private int rto = 10000;
    private String seqNo = "";

    static {
        t2o.a(607126016);
    }

    public ParcelableInputStreamImpl() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.newDataArrive = reentrantLock.newCondition();
    }

    private void recycleCurrentItem() {
        this.lock.lock();
        try {
            this.byteList.set(this.blockIndex, EOS).recycle();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public int available() throws RemoteException {
        if (!this.isClosed.get()) {
            this.lock.lock();
            try {
                int i = 0;
                if (this.blockIndex == this.byteList.size()) {
                    this.lock.unlock();
                    return 0;
                }
                ListIterator<ByteArray> listIterator = this.byteList.listIterator(this.blockIndex);
                while (listIterator.hasNext()) {
                    i += listIterator.next().getDataLength();
                }
                int i2 = i - this.blockOffset;
                this.lock.unlock();
                return i2;
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        } else {
            throw new RuntimeException("Stream is closed");
        }
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public void close() throws RemoteException {
        if (AwcnConfig.isFixWriteStreamErrorEnable()) {
            try {
                this.lock.lock();
                if (this.isClosed.compareAndSet(false, true)) {
                    Iterator<ByteArray> it = this.byteList.iterator();
                    while (it.hasNext()) {
                        ByteArray next = it.next();
                        if (next != EOS) {
                            next.recycle();
                        }
                    }
                    this.byteList.clear();
                    this.byteList = null;
                    ALog.e(TAG, "[new][test] close byteList", this.seqNo, new Object[0]);
                    this.blockIndex = -1;
                    this.blockOffset = -1;
                    this.contentLength = 0;
                }
                this.lock.unlock();
            } finally {
            }
        } else if (this.isClosed.compareAndSet(false, true)) {
            this.lock.lock();
            try {
                Iterator<ByteArray> it2 = this.byteList.iterator();
                while (it2.hasNext()) {
                    ByteArray next2 = it2.next();
                    if (next2 != EOS) {
                        next2.recycle();
                    }
                }
                this.byteList.clear();
                this.byteList = null;
                ALog.e(TAG, "[old][test] close byteList", this.seqNo, new Object[0]);
                this.blockIndex = -1;
                this.blockOffset = -1;
                this.contentLength = 0;
                this.lock.unlock();
            } finally {
            }
        }
    }

    public void init(RequestConfig requestConfig, int i) {
        this.contentLength = i;
        this.seqNo = requestConfig.seqNo;
        this.rto = requestConfig.readTimeout;
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public int length() throws RemoteException {
        return this.contentLength;
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public int read(byte[] bArr) throws RemoteException {
        return readBytes(bArr, 0, bArr.length);
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public int readByte() throws RemoteException {
        byte b;
        if (!this.isClosed.get()) {
            this.lock.lock();
            while (true) {
                try {
                    try {
                        if (this.blockIndex == this.byteList.size() && !this.newDataArrive.await(this.rto, TimeUnit.MILLISECONDS)) {
                            close();
                            throw new RuntimeException("await timeout.");
                        }
                        ByteArray byteArray = this.byteList.get(this.blockIndex);
                        if (byteArray == EOS) {
                            b = -1;
                            break;
                        } else if (this.blockOffset < byteArray.getDataLength()) {
                            byte[] buffer = byteArray.getBuffer();
                            int i = this.blockOffset;
                            b = buffer[i];
                            this.blockOffset = i + 1;
                            break;
                        } else {
                            recycleCurrentItem();
                            this.blockIndex++;
                            this.blockOffset = 0;
                        }
                    } catch (InterruptedException unused) {
                        close();
                        throw new RuntimeException("await interrupt");
                    }
                } finally {
                    this.lock.unlock();
                }
            }
            return b;
        }
        throw new RuntimeException("Stream is closed");
    }

    /* JADX WARN: Finally extract failed */
    @Override // anetwork.channel.aidl.ParcelableInputStream
    public int readBytes(byte[] bArr, int i, int i2) throws RemoteException {
        int i3;
        if (!this.isClosed.get()) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || (i3 = i2 + i) > bArr.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.lock.lock();
            int i4 = i;
            while (i4 < i3) {
                try {
                    try {
                        if (this.blockIndex == this.byteList.size() && !this.newDataArrive.await(this.rto, TimeUnit.MILLISECONDS)) {
                            close();
                            throw new RuntimeException("await timeout.");
                        }
                        ByteArray byteArray = this.byteList.get(this.blockIndex);
                        if (byteArray == EOS) {
                            break;
                        }
                        int dataLength = byteArray.getDataLength() - this.blockOffset;
                        int i5 = i3 - i4;
                        if (dataLength < i5) {
                            System.arraycopy(byteArray.getBuffer(), this.blockOffset, bArr, i4, dataLength);
                            i4 += dataLength;
                            recycleCurrentItem();
                            this.blockIndex++;
                            this.blockOffset = 0;
                        } else {
                            System.arraycopy(byteArray.getBuffer(), this.blockOffset, bArr, i4, i5);
                            this.blockOffset += i5;
                            i4 += i5;
                        }
                    } catch (InterruptedException unused) {
                        close();
                        throw new RuntimeException("await interrupt");
                    }
                } catch (Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
            this.lock.unlock();
            int i6 = i4 - i;
            if (i6 > 0) {
                return i6;
            }
            return -1;
        }
        throw new RuntimeException("Stream is closed");
    }

    /* JADX WARN: Finally extract failed */
    @Override // anetwork.channel.aidl.ParcelableInputStream
    public long skip(int i) throws RemoteException {
        ByteArray byteArray;
        this.lock.lock();
        int i2 = 0;
        while (i2 < i) {
            try {
                if (this.blockIndex != this.byteList.size() && (byteArray = this.byteList.get(this.blockIndex)) != EOS) {
                    int dataLength = byteArray.getDataLength();
                    int i3 = this.blockOffset;
                    int i4 = i - i2;
                    if (dataLength - i3 < i4) {
                        i2 += dataLength - i3;
                        recycleCurrentItem();
                        this.blockIndex++;
                        this.blockOffset = 0;
                    } else {
                        this.blockOffset = i3 + i4;
                        i2 = i;
                    }
                }
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        this.lock.unlock();
        return i2;
    }

    public void write(ByteArray byteArray) {
        if (!this.isClosed.get()) {
            if (!AwcnConfig.isFixWriteStreamErrorEnable()) {
                this.lock.lock();
                try {
                    if (this.byteList == null) {
                        ALog.e(TAG, "[test] write byteList ", this.seqNo, new Object[0]);
                    }
                    this.byteList.add(byteArray);
                    this.newDataArrive.signal();
                    this.lock.unlock();
                } finally {
                }
            } else {
                this.lock.lock();
                ALog.e(TAG, "[new][test] write byteList 1", this.seqNo, new Object[0]);
                if (this.isClosed.get()) {
                    ALog.e(TAG, "[new][test] write already close! ", this.seqNo, new Object[0]);
                    this.lock.unlock();
                    return;
                }
                try {
                    if (this.byteList != null) {
                        ALog.e(TAG, "[new][test] write byteList 2", this.seqNo, new Object[0]);
                        this.byteList.add(byteArray);
                        this.newDataArrive.signal();
                    } else {
                        ALog.e(TAG, "[new][test] write byteList ", this.seqNo, new Object[0]);
                    }
                } finally {
                    this.lock.unlock();
                }
            }
        }
    }

    public void writeEnd() {
        write(EOS);
    }
}
