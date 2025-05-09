package kotlinx.coroutines.channels;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.orange.OConstant;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.f;
import tb.hl2;
import tb.i04;
import tb.k9p;
import tb.nn2;
import tb.u1r;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002BCB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u000f\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\n2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\t\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\t\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010*\u001a\u00060&j\u0002`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R<\u00106\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u001702j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0017`38\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0017\u0010;\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u0019\u0010>\u001a\u0004\u0018\u00018\u00008F¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b<\u00108R\u0014\u0010A\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "Ltb/hl2;", "", "capacity", "<init>", "(I)V", "Lkotlinx/coroutines/channels/ReceiveChannel;", "s", "Ltb/xhv;", "T1", "(Lkotlinx/coroutines/channels/ReceiveChannel;)V", "c", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "element", "d", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/e;", "m", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ltb/k9p;", ThemisConfig.SCENE_SELECT, "", "k1", "(Ltb/k9p;Ljava/lang/Object;)V", "", "cause", "", "(Ljava/lang/Throwable;)Z", "O", "", "toString", "()Ljava/lang/String;", "v", TLogTracker.LEVEL_INFO, "O1", "()I", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "w", "Ljava/util/concurrent/locks/ReentrantLock;", OConstant.DIMEN_FILE_LOCK, "", "x", "Ljava/util/List;", "subscribers", "y", "Ljava/lang/Object;", "lastConflatedElement", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", AmnetConstant.VAL_SUPPORT_ZSTD, "Ljava/util/HashMap;", "onSendInternalResult", "P1", "()Ljava/lang/Object;", "Q1", "()V", "value", "R1", "S1", "valueOrNull", "f", "()Z", "isClosedForSend", "a", TplMsg.VALUE_T_NATIVE_RETURN, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements hl2<E> {
    private final int v;
    private final ReentrantLock w;
    private List<? extends BufferedChannel<E>> x;
    private Object y;
    private final HashMap<k9p<?>, Object> z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class a extends BufferedChannel<E> {
        public a() {
            super(BroadcastChannelImpl.this.O1(), null, 2, null);
        }

        /* renamed from: L1 */
        public boolean O(Throwable th) {
            BroadcastChannelImpl<E> broadcastChannelImpl = BroadcastChannelImpl.this;
            ReentrantLock reentrantLock = ((BroadcastChannelImpl) broadcastChannelImpl).w;
            reentrantLock.lock();
            try {
                broadcastChannelImpl.T1(this);
                return super.O(th);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class b extends f<E> {
        public b() {
            super(1, BufferOverflow.DROP_OLDEST, null, 4, null);
        }

        /* renamed from: Q1 */
        public boolean O(Throwable th) {
            BroadcastChannelImpl.this.T1(this);
            return super.O(th);
        }
    }

    public BroadcastChannelImpl(int i) {
        super(0, null);
        this.v = i;
        if (i >= 1 || i == -1) {
            this.w = new ReentrantLock();
            this.x = yz3.i();
            this.y = kotlinx.coroutines.channels.a.f15255a;
            this.z = new HashMap<>();
            return;
        }
        throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + i + " was specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void T1(ReceiveChannel<? extends E> receiveChannel) {
        ReentrantLock reentrantLock = this.w;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.x) {
                if (((BufferedChannel) obj) != receiveChannel) {
                    arrayList.add(obj);
                }
            }
            this.x = arrayList;
            xhv xhvVar = xhv.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean O(Throwable th) {
        ReentrantLock reentrantLock = this.w;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.x.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).O(th);
            }
            this.y = kotlinx.coroutines.channels.a.f15255a;
            boolean O = super.O(th);
            reentrantLock.unlock();
            return O;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int O1() {
        return this.v;
    }

    public final E P1() {
        ReentrantLock reentrantLock = this.w;
        reentrantLock.lock();
        try {
            if (f()) {
                Throwable d0 = d0();
                if (d0 == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw d0;
            }
            E e = (E) this.y;
            if (e != kotlinx.coroutines.channels.a.f15255a) {
                reentrantLock.unlock();
                return e;
            }
            throw new IllegalStateException("No value");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final E R1() {
        ReentrantLock reentrantLock = this.w;
        reentrantLock.lock();
        try {
            E e = null;
            if (!u0()) {
                Object obj = this.y;
                if (obj != kotlinx.coroutines.channels.a.f15255a) {
                    e = obj;
                }
            }
            return e;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // tb.hl2
    public ReceiveChannel<E> c() {
        a aVar;
        ReentrantLock reentrantLock = this.w;
        reentrantLock.lock();
        try {
            if (this.v == -1) {
                aVar = new b();
            } else {
                aVar = new a();
            }
            boolean f = f();
            u1r u1rVar = kotlinx.coroutines.channels.a.f15255a;
            if (!f || this.y != u1rVar) {
                if (this.y != u1rVar) {
                    ((BufferedChannel) aVar).m(P1());
                }
                this.x = i04.p0(this.x, aVar);
                reentrantLock.unlock();
                return aVar;
            }
            ((BufferedChannel) aVar).s(d0());
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:30:0x0080). Please submit an issue!!! */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(E r7, tb.ar4<? super tb.xhv> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = (kotlinx.coroutines.channels.BroadcastChannelImpl$send$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.BroadcastChannelImpl r4 = (kotlinx.coroutines.channels.BroadcastChannelImpl) r4
            kotlin.b.b(r8)
            goto L_0x0080
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            kotlin.b.b(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.w
            r8.lock()
            boolean r2 = r6.f()     // Catch: all -> 0x0051
            if (r2 != 0) goto L_0x0099
            int r2 = r6.v     // Catch: all -> 0x0051
            r4 = -1
            if (r2 != r4) goto L_0x0053
            r6.y = r7     // Catch: all -> 0x0051
            goto L_0x0053
        L_0x0051:
            r7 = move-exception
            goto L_0x009e
        L_0x0053:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r2 = r6.x     // Catch: all -> 0x0051
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x0062:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0096
            java.lang.Object r2 = r7.next()
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2
            r0.L$0 = r4
            r0.L$1 = r8
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r2 = r2.q1(r8, r0)
            if (r2 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r5 = r2
            r2 = r8
            r8 = r5
        L_0x0080:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0094
            boolean r8 = r4.f()
            if (r8 != 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            java.lang.Throwable r7 = r4.m0()
            throw r7
        L_0x0094:
            r8 = r2
            goto L_0x0062
        L_0x0096:
            tb.xhv r7 = tb.xhv.INSTANCE
            return r7
        L_0x0099:
            java.lang.Throwable r7 = r6.m0()     // Catch: all -> 0x0051
            throw r7     // Catch: all -> 0x0051
        L_0x009e:
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.d(java.lang.Object, tb.ar4):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.i
    public boolean f() {
        ReentrantLock reentrantLock = this.w;
        reentrantLock.lock();
        try {
            return super.f();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void k1(k9p<?> k9pVar, Object obj) {
        ReentrantLock reentrantLock = this.w;
        reentrantLock.lock();
        try {
            Object remove = this.z.remove(k9pVar);
            if (remove != null) {
                k9pVar.b(remove);
                return;
            }
            xhv xhvVar = xhv.INSTANCE;
            reentrantLock.unlock();
            nn2.b(f.a(k9pVar.getContext()), null, CoroutineStart.UNDISPATCHED, new BroadcastChannelImpl$registerSelectForSend$2(this, obj, k9pVar, null), 1, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.i
    public Object m(E e) {
        ReentrantLock reentrantLock = this.w;
        reentrantLock.lock();
        try {
            if (f()) {
                return super.m(e);
            }
            List<? extends BufferedChannel<E>> list = this.x;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((BufferedChannel) it.next()).x1()) {
                        e.Companion.getClass();
                        return e.b;
                    }
                }
            }
            if (this.v == -1) {
                this.y = e;
            }
            Iterator<T> it2 = this.x.iterator();
            while (it2.hasNext()) {
                ((BufferedChannel) it2.next()).m(e);
            }
            e.b bVar = e.Companion;
            xhv xhvVar = xhv.INSTANCE;
            bVar.b(xhvVar);
            return xhvVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.i
    public boolean s(Throwable th) {
        ReentrantLock reentrantLock = this.w;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.x.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).s(th);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.x) {
                if (((BufferedChannel) obj).o0()) {
                    arrayList.add(obj);
                }
            }
            this.x = arrayList;
            boolean s = super.s(th);
            reentrantLock.unlock();
            return s;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.y != kotlinx.coroutines.channels.a.f15255a) {
            str = "CONFLATED_ELEMENT=" + this.y + "; ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("BROADCAST=<");
        sb.append(super.toString());
        sb.append(">; SUBSCRIBERS=");
        sb.append(i04.j0(this.x, ";", "<", ">", 0, null, null, 56, null));
        return sb.toString();
    }

    public static /* synthetic */ void Q1() {
    }

    public static /* synthetic */ void S1() {
    }
}
