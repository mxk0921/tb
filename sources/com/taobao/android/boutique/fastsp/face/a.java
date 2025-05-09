package com.taobao.android.boutique.fastsp.face;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import tb.f7l;
import tb.jr2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements KVManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f6469a = SystemClock.elapsedRealtime();
    public final b<c> b;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.boutique.fastsp.face.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface AbstractC0338a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b<E> implements Iterable<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object[] f6470a;
        public int b = 0;
        public int c = 0;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.boutique.fastsp.face.a$b$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0339a<E> implements Iterator<E> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final int f6471a;
            public final int b;
            public int c;

            static {
                t2o.a(409993223);
            }

            public C0339a(int i, int i2) {
                this.f6471a = i;
                this.b = i2;
                this.c = i;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
                }
                if (this.c - this.f6471a < this.b) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public E next() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (E) ipChange.ipc$dispatch("b9bf2c78", new Object[]{this});
                }
                E e = (E) b.a(b.this)[this.c % b.a(b.this).length];
                this.c++;
                return e;
            }
        }

        static {
            t2o.a(409993222);
        }

        public b(int i) {
            this.f6470a = new Object[i];
        }

        public static /* synthetic */ Object[] a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Object[]) ipChange.ipc$dispatch("d9dd519e", new Object[]{bVar});
            }
            return bVar.f6470a;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
            }
            int i = this.c;
            Object[] objArr = this.f6470a;
            return new C0339a(((i + objArr.length) - this.b) % objArr.length, this.b);
        }

        public void push(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b5b003d", new Object[]{this, e});
                return;
            }
            Object[] objArr = this.f6470a;
            int i = this.c;
            objArr[i % objArr.length] = e;
            int i2 = i + 1;
            this.c = i2;
            this.c = i2 % objArr.length;
            this.b = Math.min(objArr.length, this.b + 1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6472a;
        public final long b;

        static {
            t2o.a(409993224);
        }

        public c(a aVar, String str, long j) {
            this.f6472a = str;
            this.b = j;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.f6472a + f7l.CONDITION_IF_MIDDLE + this.b;
        }
    }

    static {
        t2o.a(409993220);
        t2o.a(409993218);
    }

    public a(int i) {
        this.b = new b<>(i);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee7f1e2", new Object[]{str});
        }
        if (str.length() < 32) {
            return str;
        }
        return String.valueOf(str.hashCode());
    }

    public void a(AbstractC0338a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36021cac", new Object[]{this, aVar});
            return;
        }
        Iterator<c> it = this.b.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null) {
                ((jr2) aVar).a(next);
            }
        }
    }

    public void b(int i, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4833c1dd", new Object[]{this, new Integer(i), str, str2, obj});
            return;
        }
        b<c> bVar = this.b;
        bVar.push(new c(this, i + ":" + str + ":" + c(str2) + ":" + c(String.valueOf(obj)), SystemClock.elapsedRealtime() - this.f6469a));
    }
}
