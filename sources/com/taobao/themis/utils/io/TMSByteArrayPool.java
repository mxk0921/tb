package com.taobao.themis.utils.io;

import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSByteArrayPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int b;

    /* renamed from: a  reason: collision with root package name */
    public final BytePool f13788a = new BytePool(12);
    public final Object c = new Object();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public int e = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class BytePool extends LruCache<Integer, LinkedList<byte[]>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(849346599);
        }

        public static /* synthetic */ Object ipc$super(BytePool bytePool, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/utils/io/TMSByteArrayPool$BytePool");
        }

        public BytePool(int i) {
            super(i);
        }

        public void entryRemoved(boolean z, Integer num, LinkedList<byte[]> linkedList, LinkedList<byte[]> linkedList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69597c68", new Object[]{this, new Boolean(z), num, linkedList, linkedList2});
                return;
            }
            synchronized (TMSByteArrayPool.a(TMSByteArrayPool.this)) {
                if (z || linkedList2 != null) {
                    TMSByteArrayPool.b(TMSByteArrayPool.this, num.intValue() * linkedList.size());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class ConcurrentLinkedList<T> extends LinkedList<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(849346600);
        }

        private ConcurrentLinkedList() {
        }

        public static /* synthetic */ Object ipc$super(ConcurrentLinkedList concurrentLinkedList, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -340895956) {
                return super.poll();
            }
            if (hashCode == 1107930627) {
                return new Boolean(super.offer(objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/utils/io/TMSByteArrayPool$ConcurrentLinkedList");
        }

        @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
        public boolean offer(T t) {
            boolean offer;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4209ae03", new Object[]{this, t})).booleanValue();
            }
            synchronized (this) {
                offer = super.offer(t);
            }
            return offer;
        }

        @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
        public T poll() {
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ebae572c", new Object[]{this});
            }
            synchronized (this) {
                t = (T) super.poll();
            }
            return t;
        }
    }

    static {
        t2o.a(849346597);
    }

    public TMSByteArrayPool(int i) {
        this.b = i;
    }

    public static /* synthetic */ Object a(TMSByteArrayPool tMSByteArrayPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f6bfc772", new Object[]{tMSByteArrayPool});
        }
        return tMSByteArrayPool.c;
    }

    public static /* synthetic */ int b(TMSByteArrayPool tMSByteArrayPool, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71d8975", new Object[]{tMSByteArrayPool, new Integer(i)})).intValue();
        }
        int i2 = tMSByteArrayPool.e - i;
        tMSByteArrayPool.e = i2;
        return i2;
    }

    public byte[] c(int i) {
        byte[] poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a0197a7e", new Object[]{this, new Integer(i)});
        }
        LinkedList<byte[]> linkedList = this.f13788a.get(Integer.valueOf(i));
        if (linkedList == null || (poll = linkedList.poll()) == null) {
            return new byte[i];
        }
        synchronized (this.c) {
            this.e -= poll.length;
        }
        return poll;
    }

    public void d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15524871", new Object[]{this, bArr});
        } else if (bArr != null && bArr.length <= this.b) {
            synchronized (this.c) {
                this.e += bArr.length;
            }
            LinkedList<byte[]> linkedList = this.f13788a.get(Integer.valueOf(bArr.length));
            if (linkedList == null) {
                ConcurrentLinkedList concurrentLinkedList = new ConcurrentLinkedList();
                concurrentLinkedList.offer(bArr);
                this.f13788a.put(Integer.valueOf(bArr.length), concurrentLinkedList);
            } else {
                linkedList.offer(bArr);
            }
            e();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d117a9", new Object[]{this});
        } else if (!this.d.get() && this.e > this.b) {
            this.d.set(true);
            BytePool bytePool = this.f13788a;
            bytePool.trimToSize(bytePool.size() / 2);
            this.d.set(false);
        }
    }
}
