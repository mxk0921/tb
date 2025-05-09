package com.taobao.themis.utils.io;

import androidx.collection.LruCache;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ByteArrayPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f13787a;
    public final BytePool b = new BytePool(this, 12);
    public final Object c = new Object();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public int e;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\b\u0082\u0004\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0001¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/utils/io/ByteArrayPool$BytePool;", "Landroidx/collection/LruCache;", "", "Ljava/util/LinkedList;", "", "themis_utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class BytePool extends LruCache<Integer, LinkedList<byte[]>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ByteArrayPool b;

        static {
            t2o.a(849346585);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BytePool(ByteArrayPool byteArrayPool, int i) {
            super(i);
            ckf.g(byteArrayPool, "this$0");
            this.b = byteArrayPool;
        }

        public static /* synthetic */ Object ipc$super(BytePool bytePool, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/utils/io/ByteArrayPool$BytePool");
        }

        public void a(boolean z, int i, LinkedList<byte[]> linkedList, LinkedList<byte[]> linkedList2) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bc0d134", new Object[]{this, new Boolean(z), new Integer(i), linkedList, linkedList2});
                return;
            }
            Object b = ByteArrayPool.b(this.b);
            ByteArrayPool byteArrayPool = this.b;
            synchronized (b) {
                if (z || linkedList2 != null) {
                    int a2 = ByteArrayPool.a(byteArrayPool);
                    if (linkedList != null) {
                        i2 = linkedList.size();
                    }
                    ByteArrayPool.c(byteArrayPool, a2 - (i * i2));
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/taobao/themis/utils/io/ByteArrayPool$ConcurrentLinkedList;", "T", "Ljava/util/LinkedList;", "(Lcom/taobao/themis/utils/io/ByteArrayPool;)V", "offer", "", o.b, "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "themis_utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class ConcurrentLinkedList<T> extends LinkedList<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ByteArrayPool this$0;

        static {
            t2o.a(849346586);
        }

        public ConcurrentLinkedList(ByteArrayPool byteArrayPool) {
            ckf.g(byteArrayPool, "this$0");
            this.this$0 = byteArrayPool;
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
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/utils/io/ByteArrayPool$ConcurrentLinkedList");
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
        t2o.a(849346584);
    }

    public ByteArrayPool(int i) {
        this.f13787a = i;
    }

    public static final /* synthetic */ int a(ByteArrayPool byteArrayPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84524140", new Object[]{byteArrayPool})).intValue();
        }
        return byteArrayPool.e;
    }

    public static final /* synthetic */ Object b(ByteArrayPool byteArrayPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("58af7245", new Object[]{byteArrayPool});
        }
        return byteArrayPool.c;
    }

    public static final /* synthetic */ void c(ByteArrayPool byteArrayPool, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28289ca", new Object[]{byteArrayPool, new Integer(i)});
        } else {
            byteArrayPool.e = i;
        }
    }

    public final byte[] d(int i) {
        byte[] poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a0197a7e", new Object[]{this, new Integer(i)});
        }
        LinkedList<byte[]> linkedList = this.b.get(Integer.valueOf(i));
        if (linkedList == null || (poll = linkedList.poll()) == null) {
            return new byte[i];
        }
        synchronized (this.c) {
            this.e -= poll.length;
            xhv xhvVar = xhv.INSTANCE;
        }
        return poll;
    }

    public final void e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15524871", new Object[]{this, bArr});
        } else if (bArr != null && bArr.length <= this.f13787a) {
            synchronized (this.c) {
                this.e += bArr.length;
                xhv xhvVar = xhv.INSTANCE;
            }
            LinkedList<byte[]> linkedList = this.b.get(Integer.valueOf(bArr.length));
            if (linkedList == null) {
                ConcurrentLinkedList concurrentLinkedList = new ConcurrentLinkedList(this);
                concurrentLinkedList.offer(bArr);
                this.b.put(Integer.valueOf(bArr.length), concurrentLinkedList);
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
        } else if (!this.d.get() && this.e > this.f13787a) {
            this.d.set(true);
            BytePool bytePool = this.b;
            bytePool.trimToSize(bytePool.size() / 2);
            this.d.set(false);
        }
    }
}
