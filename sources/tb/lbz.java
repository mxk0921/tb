package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lbz<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_INITIAL_CAPACITY = 16;
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;
    public static final int MAXIMUM_CAPACITY = 1073741824;
    public static final int MIN_TREEIFY_CAPACITY = 64;
    public static final int TREEIFY_THRESHOLD = 8;
    public static final int UNTREEIFY_THRESHOLD = 6;

    /* renamed from: a  reason: collision with root package name */
    public transient a<V>[] f23242a;
    public transient int b;
    public int c;
    public final float d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a<V> {

        /* renamed from: a  reason: collision with root package name */
        public final int f23243a;
        public final long b;
        public V c;
        public a<V> d;

        static {
            t2o.a(598737538);
        }

        public a(int i, long j, V v, a<V> aVar) {
            this.f23243a = i;
            this.b = j;
            this.c = v;
            this.d = aVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b<V> extends a<V> {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public b<V> e;
        public b<V> f;
        public b<V> g;
        public b<V> h;
        public boolean i;

        static {
            t2o.a(598737539);
        }

        public b(int i, long j, V v, a<V> aVar) {
            super(i, j, v, aVar);
        }

        public static <V> b<V> a(b<V> bVar, b<V> bVar2) {
            b<V> bVar3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e330feda", new Object[]{bVar, bVar2});
            }
            bVar2.i = true;
            while (true) {
                b<V> bVar4 = bVar2.e;
                if (bVar4 == null) {
                    bVar2.i = false;
                    return bVar2;
                } else if (!bVar4.i || (bVar3 = bVar4.e) == null) {
                    break;
                } else {
                    b<V> bVar5 = bVar3.f;
                    if (bVar4 == bVar5) {
                        b<V> bVar6 = bVar3.g;
                        if (bVar6 == null || !bVar6.i) {
                            if (bVar2 == bVar4.g) {
                                bVar = g(bVar, bVar4);
                                b<V> bVar7 = bVar4.e;
                                if (bVar7 == null) {
                                    bVar3 = null;
                                } else {
                                    bVar3 = bVar7.e;
                                }
                                bVar4 = bVar7;
                                bVar2 = bVar4;
                            }
                            if (bVar4 != null) {
                                bVar4.i = false;
                                if (bVar3 != null) {
                                    bVar3.i = true;
                                    bVar = h(bVar, bVar3);
                                }
                            }
                        } else {
                            bVar6.i = false;
                            bVar4.i = false;
                            bVar3.i = true;
                            bVar2 = bVar3;
                        }
                    } else if (bVar5 == null || !bVar5.i) {
                        if (bVar2 == bVar4.f) {
                            bVar = h(bVar, bVar4);
                            b<V> bVar8 = bVar4.e;
                            if (bVar8 == null) {
                                bVar3 = null;
                            } else {
                                bVar3 = bVar8.e;
                            }
                            bVar4 = bVar8;
                            bVar2 = bVar4;
                        }
                        if (bVar4 != null) {
                            bVar4.i = false;
                            if (bVar3 != null) {
                                bVar3.i = true;
                                bVar = g(bVar, bVar3);
                            }
                        }
                    } else {
                        bVar5.i = false;
                        bVar4.i = false;
                        bVar3.i = true;
                        bVar2 = bVar3;
                    }
                }
            }
            return bVar;
        }

        public static <V> void d(a<V>[] aVarArr, b<V> bVar) {
            int length;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5d39035", new Object[]{aVarArr, bVar});
            } else if (bVar != null && aVarArr != null && (length = aVarArr.length) > 0) {
                int i = bVar.f23243a & (length - 1);
                b<V> bVar2 = (b) aVarArr[i];
                if (bVar != bVar2) {
                    aVarArr[i] = bVar;
                    b<V> bVar3 = bVar.h;
                    a<V> aVar = bVar.d;
                    if (aVar != null) {
                        ((b) aVar).h = bVar3;
                    }
                    if (bVar3 != null) {
                        bVar3.d = aVar;
                    }
                    if (bVar2 != null) {
                        bVar2.h = bVar;
                    }
                    bVar.d = bVar2;
                    bVar.h = null;
                }
            }
        }

        public static <V> b<V> g(b<V> bVar, b<V> bVar2) {
            b<V> bVar3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cbf0ce9", new Object[]{bVar, bVar2});
            }
            if (!(bVar2 == null || (bVar3 = bVar2.g) == null)) {
                b<V> bVar4 = bVar3.f;
                bVar2.g = bVar4;
                if (bVar4 != null) {
                    bVar4.e = bVar2;
                }
                b<V> bVar5 = bVar2.e;
                bVar3.e = bVar5;
                if (bVar5 == null) {
                    bVar3.i = false;
                    bVar = bVar3;
                } else if (bVar5.f == bVar2) {
                    bVar5.f = bVar3;
                } else {
                    bVar5.g = bVar3;
                }
                bVar3.f = bVar2;
                bVar2.e = bVar3;
            }
            return bVar;
        }

        public static <V> b<V> h(b<V> bVar, b<V> bVar2) {
            b<V> bVar3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("35dbd3a8", new Object[]{bVar, bVar2});
            }
            if (!(bVar2 == null || (bVar3 = bVar2.f) == null)) {
                b<V> bVar4 = bVar3.g;
                bVar2.f = bVar4;
                if (bVar4 != null) {
                    bVar4.e = bVar2;
                }
                b<V> bVar5 = bVar2.e;
                bVar3.e = bVar5;
                if (bVar5 == null) {
                    bVar3.i = false;
                    bVar = bVar3;
                } else if (bVar5.g == bVar2) {
                    bVar5.g = bVar3;
                } else {
                    bVar5.f = bVar3;
                }
                bVar3.g = bVar2;
                bVar2.e = bVar3;
            }
            return bVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/util/LongKeyMap$TreeNode");
        }

        public static int j(Object obj, Object obj2) {
            int compareTo;
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ccd5f0f1", new Object[]{obj, obj2})).intValue();
            }
            if (obj != null && obj2 != null && (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) != 0) {
                return compareTo;
            }
            if (System.identityHashCode(obj) <= System.identityHashCode(obj2)) {
                i = -1;
            }
            return i;
        }

        public b<V> b(int i, long j, Class<?> cls) {
            int d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("aaa0939c", new Object[]{this, new Integer(i), new Long(j), cls});
            }
            b<V> bVar = this;
            do {
                b<V> bVar2 = bVar.f;
                b<V> bVar3 = bVar.g;
                int i2 = bVar.f23243a;
                if (i2 <= i) {
                    if (i2 >= i) {
                        if (0 == j) {
                            return bVar;
                        }
                        if (bVar2 != null) {
                            if (bVar3 != null) {
                                if ((cls == null && (cls = lbz.c(Long.valueOf(j))) == null) || (d = lbz.d(cls, Long.valueOf(j), 0L)) == 0) {
                                    b<V> b = bVar3.b(i, j, cls);
                                    if (b != null) {
                                        return b;
                                    }
                                } else if (d >= 0) {
                                    bVar2 = bVar3;
                                }
                            }
                        }
                    }
                    bVar = bVar3;
                    continue;
                }
                bVar = bVar2;
                continue;
            } while (bVar != null);
            return null;
        }

        public b<V> c(int i, long j) {
            b<V> bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cc68d3be", new Object[]{this, new Integer(i), new Long(j)});
            }
            if (this.e != null) {
                bVar = f();
            } else {
                bVar = this;
            }
            return bVar.b(i, j, null);
        }

        public b<V> e(lbz<V> lbzVar, a<V>[] aVarArr, int i, long j, V v) {
            b<V> bVar;
            int i2;
            b<V> bVar2;
            b<V> bVar3;
            b<V> bVar4;
            int d;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("430d924d", new Object[]{this, lbzVar, aVarArr, new Integer(i), new Long(j), v});
            }
            if (this.e != null) {
                bVar = f();
            } else {
                bVar = this;
            }
            b<V> bVar5 = bVar;
            Class<?> cls = null;
            while (true) {
                int i3 = bVar5.f23243a;
                if (i3 > i) {
                    i2 = -1;
                } else if (i3 < i) {
                    i2 = 1;
                } else if (0 == j) {
                    return bVar5;
                } else {
                    if ((cls == null && (cls = lbz.c(Long.valueOf(j))) == null) || (d = lbz.d(cls, Long.valueOf(j), 0L)) == 0) {
                        if (!z) {
                            b<V> bVar6 = bVar5.f;
                            if ((bVar6 == null || (bVar3 = bVar6.b(i, j, cls)) == null) && ((bVar4 = bVar5.g) == null || (bVar3 = bVar4.b(i, j, cls)) == null)) {
                                z = true;
                            }
                        }
                        i2 = j(Long.valueOf(j), 0L);
                    } else {
                        i2 = d;
                    }
                }
                if (i2 <= 0) {
                    bVar2 = bVar5.f;
                } else {
                    bVar2 = bVar5.g;
                }
                if (bVar2 == null) {
                    a<V> aVar = bVar5.d;
                    b<V> j2 = lbzVar.j(i, j, v, aVar);
                    if (i2 <= 0) {
                        bVar5.f = j2;
                    } else {
                        bVar5.g = j2;
                    }
                    bVar5.d = j2;
                    j2.h = bVar5;
                    j2.e = bVar5;
                    if (aVar != null) {
                        ((b) aVar).h = j2;
                    }
                    d(aVarArr, a(bVar, j2));
                    return null;
                }
                bVar5 = bVar2;
            }
            return bVar3;
        }

        public b<V> f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8d921d09", new Object[]{this});
            }
            b<V> bVar = this;
            while (true) {
                b<V> bVar2 = bVar.e;
                if (bVar2 == null) {
                    return bVar;
                }
                bVar = bVar2;
            }
        }

        public void i(lbz<V> lbzVar, a<V>[] aVarArr, int i, int i2) {
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8095d6", new Object[]{this, lbzVar, aVarArr, new Integer(i), new Integer(i2)});
                return;
            }
            b<V> bVar = this;
            b<V> bVar2 = null;
            b<V> bVar3 = null;
            b<V> bVar4 = null;
            b<V> bVar5 = null;
            int i4 = 0;
            while (bVar != null) {
                b<V> bVar6 = (b) bVar.d;
                bVar.d = null;
                if ((bVar.f23243a & i2) == 0) {
                    bVar.h = bVar4;
                    if (bVar4 == null) {
                        bVar2 = bVar;
                    } else {
                        bVar4.d = bVar;
                    }
                    i3++;
                    bVar4 = bVar;
                } else {
                    bVar.h = bVar3;
                    if (bVar3 == null) {
                        bVar5 = bVar;
                    } else {
                        bVar3.d = bVar;
                    }
                    i4++;
                    bVar3 = bVar;
                }
                bVar = bVar6;
            }
            if (bVar2 != null) {
                if (i3 <= 6) {
                    aVarArr[i] = bVar2.l(lbzVar);
                } else {
                    aVarArr[i] = bVar2;
                    if (bVar5 != null) {
                        bVar2.k(aVarArr);
                    }
                }
            }
            if (bVar5 == null) {
                return;
            }
            if (i4 <= 6) {
                aVarArr[i + i2] = bVar5.l(lbzVar);
                return;
            }
            aVarArr[i + i2] = bVar5;
            if (bVar2 != null) {
                bVar5.k(aVarArr);
            }
        }

        public void k(a<V>[] aVarArr) {
            int i;
            b<V> bVar;
            int d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ce945de", new Object[]{this, aVarArr});
                return;
            }
            b<V> bVar2 = this;
            b<V> bVar3 = null;
            while (bVar2 != null) {
                b<V> bVar4 = (b) bVar2.d;
                bVar2.g = null;
                bVar2.f = null;
                if (bVar3 == null) {
                    bVar2.e = null;
                    bVar2.i = false;
                } else {
                    int i2 = bVar2.f23243a;
                    Class<?> cls = null;
                    b<V> bVar5 = bVar3;
                    while (true) {
                        int i3 = bVar5.f23243a;
                        if (i3 > i2) {
                            i = -1;
                        } else if (i3 < i2) {
                            i = 1;
                        } else if ((cls == null && (cls = lbz.c(0L)) == null) || (d = lbz.d(cls, 0L, 0L)) == 0) {
                            i = j(0L, 0L);
                        } else {
                            i = d;
                        }
                        if (i <= 0) {
                            bVar = bVar5.f;
                        } else {
                            bVar = bVar5.g;
                        }
                        if (bVar == null) {
                            break;
                        }
                        bVar5 = bVar;
                    }
                    bVar2.e = bVar5;
                    if (i <= 0) {
                        bVar5.f = bVar2;
                    } else {
                        bVar5.g = bVar2;
                    }
                    bVar2 = a(bVar3, bVar2);
                }
                bVar3 = bVar2;
                bVar2 = bVar4;
            }
            d(aVarArr, bVar3);
        }

        public a<V> l(lbz<V> lbzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aa983ca6", new Object[]{this, lbzVar});
            }
            a<V> aVar = this;
            a<V> aVar2 = null;
            a<V> aVar3 = null;
            while (aVar != null) {
                a<V> n = lbzVar.n(aVar, null);
                if (aVar3 == null) {
                    aVar2 = n;
                } else {
                    aVar3.d = n;
                }
                aVar = aVar.d;
                aVar3 = n;
            }
            return aVar2;
        }
    }

    static {
        t2o.a(598737535);
    }

    public lbz(int i, float f) {
        if (i >= 0) {
            i = i > 1073741824 ? 1073741824 : i;
            if (f <= 0.0f || Float.isNaN(f)) {
                throw new IllegalArgumentException("Illegal load factor: " + f);
            }
            this.d = f;
            this.c = q(i);
            return;
        }
        throw new IllegalArgumentException("Illegal initial capacity: " + i);
    }

    public static Class<?> c(Object obj) {
        Type[] actualTypeArguments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("bc4e7e3b", new Object[]{obj});
        }
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    public static int d(Class<?> cls, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5583f50d", new Object[]{cls, obj, obj2})).intValue();
        }
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    public static int h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9f3ac2", new Object[]{new Long(j)})).intValue();
        }
        if (j > 2147483647L || j < -2147483648L) {
            return (int) (j ^ (j >>> 32));
        }
        return (int) j;
    }

    public static int q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("656e8635", new Object[]{new Integer(i)})).intValue();
        }
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + numberOfLeadingZeros;
    }

    public void a(a<V> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e2e885", new Object[]{this, aVar});
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8b377c", new Object[]{this, new Boolean(z)});
        }
    }

    public boolean e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff845361", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (g(j) != null) {
            return true;
        }
        return false;
    }

    public V f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
        }
        a<V> g = g(i);
        if (g == null) {
            return null;
        }
        return g.c;
    }

    public final a<V> g(long j) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4b00ec43", new Object[]{this, new Long(j)});
        }
        a<V>[] aVarArr = this.f23242a;
        if (aVarArr == null || (length = aVarArr.length) <= 0) {
            return null;
        }
        int h = h(j);
        a<V> aVar = aVarArr[(length - 1) & h];
        if (aVar == null) {
            return null;
        }
        if (aVar.f23243a == h && aVar.b == j) {
            return aVar;
        }
        a<V> aVar2 = aVar.d;
        if (aVar2 == null) {
            return null;
        }
        if (aVar instanceof b) {
            return ((b) aVar).c(h, j);
        }
        do {
            if (aVar2.f23243a == h && aVar2.b == j) {
                return aVar2;
            }
            aVar2 = aVar2.d;
        } while (aVar2 != null);
        return null;
    }

    public a<V> i(int i, long j, V v, a<V> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3e90b8c6", new Object[]{this, new Integer(i), new Long(j), v, aVar});
        }
        return new a<>(i, j, v, aVar);
    }

    public b<V> j(int i, long j, V v, a<V> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("41b9fd4a", new Object[]{this, new Integer(i), new Long(j), v, aVar});
        }
        return new b<>(i, j, v, aVar);
    }

    public V k(int i, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("78b6f609", new Object[]{this, new Integer(i), v});
        }
        long j = i;
        return m(h(j), j, v, false, true);
    }

    public V l(long j, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("da0992a8", new Object[]{this, new Long(j), v});
        }
        return m(h(j), j, v, false, true);
    }

    public final V m(int i, long j, V v, boolean z, boolean z2) {
        int length;
        a<V> aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a6bb09c", new Object[]{this, new Integer(i), new Long(j), v, new Boolean(z), new Boolean(z2)});
        }
        a<V>[] aVarArr = this.f23242a;
        if (aVarArr == null || (length = aVarArr.length) == 0) {
            aVarArr = p();
            length = aVarArr.length;
        }
        int i2 = (length - 1) & i;
        b<V> bVar = aVarArr[i2];
        if (bVar == null) {
            aVarArr[i2] = i(i, j, v, null);
        } else {
            if (!(bVar.f23243a == i && bVar.b == j)) {
                if (bVar instanceof b) {
                    bVar = ((b) bVar).e(this, aVarArr, i, j, v);
                } else {
                    a<V> aVar2 = bVar;
                    int i3 = 0;
                    while (true) {
                        aVar = aVar2.d;
                        if (aVar != null) {
                            if (aVar.f23243a == i && aVar.b == j) {
                                break;
                            }
                            i3++;
                            aVar2 = aVar;
                        } else {
                            aVar2.d = i(i, j, v, null);
                            if (i3 >= 7) {
                                r(aVarArr, i);
                            }
                        }
                    }
                    bVar = aVar;
                }
            }
            if (bVar != null) {
                V v2 = bVar.c;
                if (!z || v2 == null) {
                    bVar.c = v;
                }
                a(bVar);
                return v2;
            }
        }
        int i4 = this.b + 1;
        this.b = i4;
        if (i4 > this.c) {
            p();
        }
        b(z2);
        return null;
    }

    public a<V> n(a<V> aVar, a<V> aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d2633b59", new Object[]{this, aVar, aVar2});
        }
        return new a<>(aVar.f23243a, aVar.b, aVar.c, aVar2);
    }

    public b<V> o(a<V> aVar, a<V> aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f6622299", new Object[]{this, aVar, aVar2});
        }
        return new b<>(aVar.f23243a, aVar.b, aVar.c, aVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057 A[LOOP:0: B:32:0x0057->B:58:0x00a3, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:31:0x0055, B:58:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.lbz.a<V>[] p() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.lbz.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "aef270b4"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r14
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            tb.lbz$a[] r0 = (tb.lbz.a[]) r0
            return r0
        L_0x0015:
            tb.lbz$a<V>[] r2 = r14.f23242a
            if (r2 != 0) goto L_0x001b
            r3 = 0
            goto L_0x001c
        L_0x001b:
            int r3 = r2.length
        L_0x001c:
            int r4 = r14.c
            r5 = 16
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r3 <= 0) goto L_0x0036
            if (r3 < r7) goto L_0x002c
            r14.c = r6
            return r2
        L_0x002c:
            int r8 = r3 << 1
            if (r8 >= r7) goto L_0x0034
            if (r3 < r5) goto L_0x0034
            int r4 = r4 << r1
            goto L_0x003e
        L_0x0034:
            r4 = 0
            goto L_0x003e
        L_0x0036:
            if (r4 <= 0) goto L_0x003a
            r8 = r4
            goto L_0x0034
        L_0x003a:
            r4 = 12
            r8 = 16
        L_0x003e:
            if (r4 != 0) goto L_0x004f
            float r4 = (float) r8
            float r5 = r14.d
            float r4 = r4 * r5
            if (r8 >= r7) goto L_0x004e
            r5 = 1317011456(0x4e800000, float:1.07374182E9)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x004e
            int r6 = (int) r4
        L_0x004e:
            r4 = r6
        L_0x004f:
            r14.c = r4
            tb.lbz$a[] r4 = new tb.lbz.a[r8]
            r14.f23242a = r4
            if (r2 == 0) goto L_0x00a5
        L_0x0057:
            if (r0 >= r3) goto L_0x00a5
            r5 = r2[r0]
            if (r5 == 0) goto L_0x00a3
            r6 = 0
            r2[r0] = r6
            tb.lbz$a<V> r7 = r5.d
            if (r7 != 0) goto L_0x006c
            int r6 = r5.f23243a
            int r7 = r8 + (-1)
            r6 = r6 & r7
            r4[r6] = r5
            goto L_0x00a3
        L_0x006c:
            boolean r7 = r5 instanceof tb.lbz.b
            if (r7 == 0) goto L_0x0076
            tb.lbz$b r5 = (tb.lbz.b) r5
            r5.i(r14, r4, r0, r3)
            goto L_0x00a3
        L_0x0076:
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
        L_0x007a:
            tb.lbz$a<V> r12 = r5.d
            int r13 = r5.f23243a
            r13 = r13 & r3
            if (r13 != 0) goto L_0x0089
            if (r9 != 0) goto L_0x0085
            r10 = r5
            goto L_0x0087
        L_0x0085:
            r9.d = r5
        L_0x0087:
            r9 = r5
            goto L_0x0090
        L_0x0089:
            if (r7 != 0) goto L_0x008d
            r11 = r5
            goto L_0x008f
        L_0x008d:
            r7.d = r5
        L_0x008f:
            r7 = r5
        L_0x0090:
            if (r12 != 0) goto L_0x00a1
            if (r9 == 0) goto L_0x0098
            r9.d = r6
            r4[r0] = r10
        L_0x0098:
            if (r7 == 0) goto L_0x00a3
            r7.d = r6
            int r5 = r0 + r3
            r4[r5] = r11
            goto L_0x00a3
        L_0x00a1:
            r5 = r12
            goto L_0x007a
        L_0x00a3:
            int r0 = r0 + r1
            goto L_0x0057
        L_0x00a5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lbz.p():tb.lbz$a[]");
    }

    public final void r(a<V>[] aVarArr, int i) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4569a", new Object[]{this, aVarArr, new Integer(i)});
        } else if (aVarArr == null || (length = aVarArr.length) < 64) {
            p();
        } else {
            int i2 = i & (length - 1);
            a<V> aVar = aVarArr[i2];
            if (aVar != null) {
                b<V> bVar = null;
                b<V> bVar2 = null;
                while (true) {
                    b<V> o = o(aVar, null);
                    if (bVar == null) {
                        bVar2 = o;
                    } else {
                        o.h = bVar;
                        bVar.d = o;
                    }
                    aVar = aVar.d;
                    if (aVar == null) {
                        break;
                    }
                    bVar = o;
                }
                aVarArr[i2] = bVar2;
                if (bVar2 != null) {
                    bVar2.k(aVarArr);
                }
            }
        }
    }

    public lbz(int i) {
        this(i, 0.75f);
    }
}
