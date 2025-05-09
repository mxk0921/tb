package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hq4 implements JSONReader.a {
    public static final Class d = Collections.unmodifiableSortedSet(new TreeSet()).getClass();
    public static final Class e = Collections.unmodifiableSet(Collections.emptySet()).getClass();
    public static final Class f = Collections.unmodifiableCollection(Collections.emptyList()).getClass();

    /* renamed from: a  reason: collision with root package name */
    public final long[] f20812a;
    public final ConcurrentMap<Integer, ConcurrentHashMap<Long, Class>> b;
    public final Map<Long, Class> c;

    public hq4(Class... clsArr) {
        this(false, clsArr);
    }

    public static String[] e(Collection<Class> collection) {
        HashSet hashSet = new HashSet();
        for (Class cls : collection) {
            if (cls != null) {
                hashSet.add(TypeUtils.n(cls));
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    @Override // com.alibaba.fastjson2.JSONReader.a
    public Class<?> b(String str, Class<?> cls, long j) {
        String str2;
        Class<?> cls2;
        Class<?> cls3;
        int i;
        Class<?> f2;
        if ("O".equals(str)) {
            str2 = "Object";
        } else {
            str2 = str;
        }
        int length = str2.length();
        long j2 = ls9.MAGIC_HASH_CODE;
        int i2 = 0;
        while (i2 < length) {
            char charAt = str2.charAt(i2);
            if (charAt == '$') {
                charAt = '.';
            }
            long j3 = (j2 ^ charAt) * ls9.MAGIC_PRIME;
            if (Arrays.binarySearch(this.f20812a, j3) >= 0) {
                long a2 = ls9.a(str2);
                i = i2;
                Class<?> c = c(a2, cls, j);
                if (!(c != null || (c = TypeUtils.r(str2)) == null || (f2 = f(a2, c)) == null)) {
                    c = f2;
                }
                if (c != null) {
                    return c;
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
            j2 = j3;
        }
        long a3 = ls9.a(str2);
        if (str2.length() > 0 && str2.charAt(0) == '[') {
            Class<?> c2 = c(a3, cls, j);
            if (c2 != null) {
                return c2;
            }
            String substring = str2.substring(1);
            if (cls != null) {
                cls2 = cls.getComponentType();
            } else {
                cls2 = null;
            }
            Class<?> b = b(substring, cls2, j);
            if (b != null) {
                if (b == cls2) {
                    cls3 = cls;
                } else {
                    cls3 = TypeUtils.h(b);
                }
                Class<?> f3 = f(a3, cls3);
                if (f3 != null) {
                    return f3;
                }
                return cls3;
            }
        }
        Class l = TypeUtils.l(str2);
        if (l != null) {
            String n = TypeUtils.n(l);
            if (!str2.equals(n)) {
                Class<?> b2 = b(n, cls, j);
                if (b2 != null) {
                    f(a3, b2);
                }
                return b2;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONReader.a
    public Class<?> c(long j, Class<?> cls, long j2) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (!(contextClassLoader == null || contextClassLoader == b.class.getClassLoader())) {
            int identityHashCode = System.identityHashCode(contextClassLoader);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) this.b).get(Integer.valueOf(identityHashCode));
            if (concurrentHashMap != null) {
                return (Class) concurrentHashMap.get(Long.valueOf(j));
            }
        }
        return (Class) ((ConcurrentHashMap) this.c).get(Long.valueOf(j));
    }

    public final Class f(long j, Class cls) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null || contextClassLoader == b.class.getClassLoader()) {
            return (Class) ((ConcurrentHashMap) this.c).put(Long.valueOf(j), cls);
        }
        int identityHashCode = System.identityHashCode(contextClassLoader);
        ConcurrentMap<Integer, ConcurrentHashMap<Long, Class>> concurrentMap = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) concurrentMap).get(Integer.valueOf(identityHashCode));
        if (concurrentHashMap == null) {
            ((ConcurrentHashMap) concurrentMap).put(Integer.valueOf(identityHashCode), new ConcurrentHashMap());
            concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) concurrentMap).get(Integer.valueOf(identityHashCode));
        }
        return (Class) concurrentHashMap.put(Long.valueOf(j), cls);
    }

    public hq4(boolean z, Class... clsArr) {
        this(z, e(Arrays.asList(clsArr)));
    }

    public hq4(boolean z, String... strArr) {
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap(16, 0.75f, 1);
        HashSet hashSet = new HashSet();
        if (z) {
            Class[] clsArr = {Object.class, Byte.TYPE, Byte.class, Short.TYPE, Short.class, Integer.TYPE, Integer.class, Long.TYPE, Long.class, Float.TYPE, Float.class, Double.TYPE, Double.class, Number.class, BigInteger.class, BigDecimal.class, AtomicInteger.class, AtomicLong.class, AtomicBoolean.class, AtomicIntegerArray.class, AtomicLongArray.class, AtomicReference.class, Boolean.TYPE, Boolean.class, Character.TYPE, Character.class, String.class, UUID.class, Currency.class, BitSet.class, EnumSet.class, EnumSet.noneOf(TimeUnit.class).getClass(), Date.class, Calendar.class, p7h.class, q7h.class, vcf.class, SimpleDateFormat.class, DateTimeFormatter.class, TimeUnit.class, Set.class, HashSet.class, LinkedHashSet.class, TreeSet.class, List.class, ArrayList.class, LinkedList.class, ConcurrentLinkedQueue.class, ConcurrentSkipListSet.class, CopyOnWriteArrayList.class, Collections.emptyList().getClass(), Collections.emptyMap().getClass(), TypeUtils.CLASS_SINGLE_SET, TypeUtils.CLASS_SINGLE_LIST, f, TypeUtils.CLASS_UNMODIFIABLE_LIST, e, d, Collections.unmodifiableMap(new HashMap()).getClass(), Collections.unmodifiableSortedMap(new TreeMap()).getClass(), Arrays.asList(new Object[0]).getClass(), Map.class, HashMap.class, Hashtable.class, TreeMap.class, LinkedHashMap.class, WeakHashMap.class, IdentityHashMap.class, ConcurrentMap.class, ConcurrentHashMap.class, ConcurrentSkipListMap.class, Exception.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, RuntimeException.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class};
            for (int i = 0; i < 100; i++) {
                hashSet.add(TypeUtils.n(clsArr[i]));
            }
            hashSet.add("javax.validation.ValidationException");
            hashSet.add("javax.validation.NoProviderFoundException");
        }
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                Class l = TypeUtils.l(str);
                hashSet.add(l != null ? TypeUtils.n(l) : str);
            }
        }
        int size = hashSet.size();
        long[] jArr = new long[size];
        Iterator it = hashSet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            long j = ls9.MAGIC_HASH_CODE;
            for (int i3 = 0; i3 < str2.length(); i3++) {
                char charAt = str2.charAt(i3);
                if (charAt == '$') {
                    charAt = '.';
                }
                j = (j ^ charAt) * ls9.MAGIC_PRIME;
            }
            i2++;
            jArr[i2] = j;
        }
        jArr = i2 != size ? Arrays.copyOf(jArr, i2) : jArr;
        Arrays.sort(jArr);
        this.f20812a = jArr;
    }
}
