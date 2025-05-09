package com.taobao.android.dinamicx.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXReadWriteLongSparseArray<E> extends DXLongSparseArray<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f7324a;
    public final ReentrantReadWriteLock.WriteLock b;

    static {
        t2o.a(444596882);
    }

    public DXReadWriteLongSparseArray() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7324a = reentrantReadWriteLock.readLock();
        this.b = reentrantReadWriteLock.writeLock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(DXReadWriteLongSparseArray dXReadWriteLongSparseArray, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1560388469:
                return super.get(((Number) objArr[0]).longValue());
            case -850521654:
                super.put(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 1416190959:
                return super.get(((Number) objArr[0]).longValue(), objArr[1]);
            case 1562465048:
                super.a((DXLongSparseArray) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/model/DXReadWriteLongSparseArray");
        }
    }

    @Override // com.taobao.android.dinamicx.model.DXLongSparseArray
    public void a(DXLongSparseArray<E> dXLongSparseArray) {
        IpChange ipChange = $ipChange;
        try {
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d215318", new Object[]{this, dXLongSparseArray});
                return;
            }
            try {
                this.b.lock();
                super.a(dXLongSparseArray);
            } catch (Exception e) {
                xv5.b(e);
            }
        } finally {
            this.b.unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // androidx.collection.LongSparseArray
    public E get(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("54695bef", new Object[]{this, new Long(j), e});
        }
        try {
            try {
                this.f7324a.lock();
                E e2 = (E) super.get(j, e);
                this.f7324a.unlock();
                return e2;
            } catch (Exception e3) {
                xv5.b(e3);
                this.f7324a.unlock();
                return null;
            }
        } catch (Throwable th) {
            this.f7324a.unlock();
            throw th;
        }
    }

    @Override // androidx.collection.LongSparseArray
    public void put(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4e11ca", new Object[]{this, new Long(j), e});
            return;
        }
        try {
            try {
                this.b.lock();
                super.put(j, e);
            } catch (Exception e2) {
                xv5.b(e2);
            }
        } finally {
            this.b.unlock();
        }
    }

    public DXReadWriteLongSparseArray(DXLongSparseArray<E> dXLongSparseArray) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7324a = reentrantReadWriteLock.readLock();
        this.b = reentrantReadWriteLock.writeLock();
        a(dXLongSparseArray);
    }

    /* JADX WARN: Finally extract failed */
    @Override // androidx.collection.LongSparseArray
    public E get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("a2fe5c8b", new Object[]{this, new Long(j)});
        }
        try {
            try {
                this.f7324a.lock();
                E e = (E) super.get(j);
                this.f7324a.unlock();
                return e;
            } catch (Exception e2) {
                xv5.b(e2);
                this.f7324a.unlock();
                return null;
            }
        } catch (Throwable th) {
            this.f7324a.unlock();
            throw th;
        }
    }
}
