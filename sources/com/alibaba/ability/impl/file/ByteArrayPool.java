package com.alibaba.ability.impl.file;

import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ByteArrayPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BytePool f1943a = new BytePool(12);
    public final Object b = new Object();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public int d;
    public final int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class BytePool extends LruCache<Integer, LinkedList<byte[]>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(106954755);
        }

        public BytePool(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(BytePool bytePool, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/file/ByteArrayPool$BytePool");
        }

        public void a(boolean z, int i, LinkedList<byte[]> linkedList, LinkedList<byte[]> linkedList2) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bc0d134", new Object[]{this, new Boolean(z), new Integer(i), linkedList, linkedList2});
                return;
            }
            synchronized (ByteArrayPool.b(ByteArrayPool.this)) {
                if (z || linkedList2 != null) {
                    try {
                        ByteArrayPool byteArrayPool = ByteArrayPool.this;
                        int a2 = ByteArrayPool.a(byteArrayPool);
                        if (linkedList != null) {
                            i2 = linkedList.size();
                        }
                        ByteArrayPool.c(byteArrayPool, a2 - (i * i2));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                xhv xhvVar = xhv.INSTANCE;
            }
        }

        @Override // androidx.collection.LruCache
        public /* bridge */ /* synthetic */ void entryRemoved(boolean z, Integer num, LinkedList<byte[]> linkedList, LinkedList<byte[]> linkedList2) {
            a(z, num.intValue(), linkedList, linkedList2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class ConcurrentLinkedList<T> extends LinkedList<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(106954756);
        }

        public ConcurrentLinkedList() {
        }

        public static /* synthetic */ Object ipc$super(ConcurrentLinkedList concurrentLinkedList, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -475350822:
                    return super.remove(((Number) objArr[0]).intValue());
                case -340895956:
                    return super.poll();
                case 845773819:
                    return new Integer(super.size());
                case 1107930627:
                    return new Boolean(super.offer(objArr[0]));
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/file/ByteArrayPool$ConcurrentLinkedList");
            }
        }

        public /* bridge */ int getSize() {
            return super.size();
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

        @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final /* bridge */ T remove(int i) {
            return (T) removeAt(i);
        }

        public /* bridge */ Object removeAt(int i) {
            return super.remove(i);
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ int size() {
            return getSize();
        }
    }

    static {
        t2o.a(106954754);
    }

    public ByteArrayPool(int i) {
        this.e = i;
    }

    public static final /* synthetic */ int a(ByteArrayPool byteArrayPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea6b4bb", new Object[]{byteArrayPool})).intValue();
        }
        return byteArrayPool.d;
    }

    public static final /* synthetic */ Object b(ByteArrayPool byteArrayPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("620c5aaa", new Object[]{byteArrayPool});
        }
        return byteArrayPool.b;
    }

    public static final /* synthetic */ void c(ByteArrayPool byteArrayPool, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13422447", new Object[]{byteArrayPool, new Integer(i)});
        } else {
            byteArrayPool.d = i;
        }
    }

    public final byte[] d(int i) {
        byte[] poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a0197a7e", new Object[]{this, new Integer(i)});
        }
        LinkedList<byte[]> linkedList = this.f1943a.get(Integer.valueOf(i));
        if (linkedList == null || (poll = linkedList.poll()) == null) {
            return new byte[i];
        }
        synchronized (this.b) {
            this.d -= poll.length;
            xhv xhvVar = xhv.INSTANCE;
        }
        return poll;
    }

    public final void e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15524871", new Object[]{this, bArr});
        } else if (bArr != null && bArr.length <= this.e) {
            synchronized (this.b) {
                this.d += bArr.length;
                xhv xhvVar = xhv.INSTANCE;
            }
            LinkedList<byte[]> linkedList = this.f1943a.get(Integer.valueOf(bArr.length));
            if (linkedList == null) {
                ConcurrentLinkedList concurrentLinkedList = new ConcurrentLinkedList();
                concurrentLinkedList.offer(bArr);
                this.f1943a.put(Integer.valueOf(bArr.length), concurrentLinkedList);
            } else {
                linkedList.offer(bArr);
            }
            f();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d117a9", new Object[]{this});
        } else if (!this.c.get() && this.d > this.e) {
            this.c.set(true);
            BytePool bytePool = this.f1943a;
            bytePool.trimToSize(bytePool.size() / 2);
            this.c.set(false);
        }
    }
}
