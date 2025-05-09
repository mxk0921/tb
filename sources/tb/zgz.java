package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zgz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int TEST_FUNC_ID = 492311678;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f32766a;
    public final lbz<xgz> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737326);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final zgz a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zgz) ipChange.ipc$dispatch("de57c8f1", new Object[]{this});
            }
            return new zgz(null);
        }

        public a() {
        }
    }

    static {
        t2o.a(598737325);
    }

    public /* synthetic */ zgz(a07 a07Var) {
        this();
    }

    public static final hhz b(bhz bhzVar, hhz[] hhzVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("1bb9d76b", new Object[]{bhzVar, hhzVarArr});
        }
        ckf.g(bhzVar, Constants.Name.SCOPE);
        ckf.g(hhzVarArr, "params");
        return hhz.Companion.d(100);
    }

    public final xgz c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xgz) ipChange.ipc$dispatch("2662b48d", new Object[]{this, new Integer(i)});
        }
        ReentrantReadWriteLock.ReadLock readLock = this.f32766a.readLock();
        readLock.lock();
        try {
            xgz f = this.b.f(i);
            if (f == null) {
                switch (i) {
                    case t7z.FUNC_ID /* -1977742053 */:
                        f = t7z.INSTANCE;
                        break;
                    case w2z.FUNC_ID /* -1381471221 */:
                        f = w2z.INSTANCE;
                        break;
                    case s7z.FUNC_ID /* -699000012 */:
                        f = s7z.INSTANCE;
                        break;
                    case m2z.FUNC_ID /* -609017932 */:
                        f = m2z.INSTANCE;
                        break;
                    case vrz.FUNC_ID /* -406646278 */:
                        f = vrz.INSTANCE;
                        break;
                    case TEST_FUNC_ID /* 492311678 */:
                        f = new xgz() { // from class: tb.ygz
                            @Override // tb.xgz
                            public final hhz a(bhz bhzVar, hhz[] hhzVarArr) {
                                hhz b;
                                b = zgz.b(bhzVar, hhzVarArr);
                                return b;
                            }
                        };
                        break;
                    case wrz.FUNC_ID /* 1324334576 */:
                        f = wrz.INSTANCE;
                        break;
                    case naz.FUNC_ID /* 1587582933 */:
                        f = naz.INSTANCE;
                        break;
                    default:
                        f = null;
                        break;
                }
            }
            return f;
        } finally {
            readLock.unlock();
        }
    }

    public final void d(SparseArray<xgz> sparseArray) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef13c8b", new Object[]{this, sparseArray});
            return;
        }
        ckf.g(sparseArray, "exprFuncArray");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f32766a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            int size = sparseArray.size();
            if (size > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    this.b.k(sparseArray.keyAt(i4), sparseArray.valueAt(i4));
                    if (i5 >= size) {
                        break;
                    }
                    i4 = i5;
                }
            }
            xhv xhvVar = xhv.INSTANCE;
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public zgz() {
        this.f32766a = new ReentrantReadWriteLock();
        this.b = new lbz<>(128);
    }
}
