package com.alibaba.fastjson2.util;

import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.i;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.taobao.artc.api.AConstants;
import com.taobao.media.MediaConstant;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.utils.WXUtils;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tb.cpr;
import tb.f7l;
import tb.iik;
import tb.iql;
import tb.jdk;
import tb.jek;
import tb.jkk;
import tb.k2a;
import tb.kek;
import tb.lv8;
import tb.ohh;
import tb.ot7;
import tb.p7h;
import tb.pg1;
import tb.q7h;
import tb.tck;
import tb.vcf;
import tb.vu3;
import tb.wh6;
import tb.wqf;
import tb.wqx;
import tb.xqx;
import tb.yp7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TypeUtils {
    public static final Class CLASS_SINGLE_LIST;
    public static final Class CLASS_SINGLE_SET;
    public static final Class CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(Collections.emptyList()).getClass();
    public static final ParameterizedType PARAM_TYPE_LIST_STR = new iql(List.class, String.class);
    public static final double[] SMALL_10_POW = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f2476a = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final double[] b = {1.0E16d, 1.0E32d, 1.0E64d, 1.0E128d, 1.0E256d};
    public static final double[] c = {1.0E-16d, 1.0E-32d, 1.0E-64d, 1.0E-128d, 1.0E-256d};
    public static final Cache d = new Cache();
    public static final AtomicReferenceFieldUpdater<Cache, char[]> e = AtomicReferenceFieldUpdater.newUpdater(Cache.class, char[].class, "chars");
    public static final BigInteger[] f;
    public static volatile BigInteger[] g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Cache {
        volatile char[] chars;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Map<Class, String> f2477a;
        public static final Map<String, Class> b;

        static {
            IdentityHashMap identityHashMap = new IdentityHashMap((int) tck.DETECT_WIDTH);
            f2477a = identityHashMap;
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(256);
            b = concurrentHashMap;
            identityHashMap.put(Byte.TYPE, "B");
            identityHashMap.put(Short.TYPE, ExifInterface.LATITUDE_SOUTH);
            identityHashMap.put(Integer.TYPE, TLogTracker.LEVEL_INFO);
            identityHashMap.put(Long.TYPE, "J");
            identityHashMap.put(Float.TYPE, UTConstant.Args.UT_SUCCESS_F);
            identityHashMap.put(Double.TYPE, TLogTracker.LEVEL_DEBUG);
            identityHashMap.put(Character.TYPE, "C");
            identityHashMap.put(Boolean.TYPE, "Z");
            identityHashMap.put(Object[].class, "[O");
            identityHashMap.put(Object[][].class, "[[O");
            identityHashMap.put(byte[].class, "[B");
            identityHashMap.put(byte[][].class, "[[B");
            identityHashMap.put(short[].class, "[S");
            identityHashMap.put(short[][].class, "[[S");
            identityHashMap.put(int[].class, "[I");
            identityHashMap.put(int[][].class, "[[I");
            identityHashMap.put(long[].class, "[J");
            identityHashMap.put(long[][].class, "[[J");
            identityHashMap.put(float[].class, "[F");
            identityHashMap.put(float[][].class, "[[F");
            identityHashMap.put(double[].class, "[D");
            identityHashMap.put(double[][].class, "[[D");
            identityHashMap.put(char[].class, "[C");
            identityHashMap.put(char[][].class, "[[C");
            identityHashMap.put(boolean[].class, "[Z");
            identityHashMap.put(boolean[][].class, "[[Z");
            identityHashMap.put(Byte[].class, "[Byte");
            identityHashMap.put(Byte[][].class, "[[Byte");
            identityHashMap.put(Short[].class, "[Short");
            identityHashMap.put(Short[][].class, "[[Short");
            identityHashMap.put(Integer[].class, "[Integer");
            identityHashMap.put(Integer[][].class, "[[Integer");
            identityHashMap.put(Long[].class, "[Long");
            identityHashMap.put(Long[][].class, "[[Long");
            identityHashMap.put(Float[].class, "[Float");
            identityHashMap.put(Float[][].class, "[[Float");
            identityHashMap.put(Double[].class, "[Double");
            identityHashMap.put(Double[][].class, "[[Double");
            identityHashMap.put(Character[].class, "[Character");
            identityHashMap.put(Character[][].class, "[[Character");
            identityHashMap.put(Boolean[].class, "[Boolean");
            identityHashMap.put(Boolean[][].class, "[[Boolean");
            identityHashMap.put(String[].class, "[String");
            identityHashMap.put(String[][].class, "[[String");
            identityHashMap.put(BigDecimal[].class, "[BigDecimal");
            identityHashMap.put(BigDecimal[][].class, "[[BigDecimal");
            identityHashMap.put(BigInteger[].class, "[BigInteger");
            identityHashMap.put(BigInteger[][].class, "[[BigInteger");
            identityHashMap.put(UUID[].class, "[UUID");
            identityHashMap.put(UUID[][].class, "[[UUID");
            identityHashMap.put(Object.class, "Object");
            identityHashMap.put(HashMap.class, "M");
            concurrentHashMap.put("HashMap", HashMap.class);
            concurrentHashMap.put("java.util.HashMap", HashMap.class);
            identityHashMap.put(LinkedHashMap.class, "LM");
            concurrentHashMap.put("LinkedHashMap", LinkedHashMap.class);
            concurrentHashMap.put("java.util.LinkedHashMap", LinkedHashMap.class);
            identityHashMap.put(TreeMap.class, "TM");
            concurrentHashMap.put("TreeMap", TreeMap.class);
            identityHashMap.put(ArrayList.class, "A");
            concurrentHashMap.put("ArrayList", ArrayList.class);
            concurrentHashMap.put("java.util.ArrayList", ArrayList.class);
            identityHashMap.put(LinkedList.class, RPCDataItems.LOCAL_AMNET);
            concurrentHashMap.put(RPCDataItems.LOCAL_AMNET, LinkedList.class);
            concurrentHashMap.put("LinkedList", LinkedList.class);
            concurrentHashMap.put("java.util.LinkedList", LinkedList.class);
            concurrentHashMap.put("java.util.concurrent.ConcurrentLinkedQueue", ConcurrentLinkedQueue.class);
            identityHashMap.put(HashSet.class, "HashSet");
            identityHashMap.put(TreeSet.class, "TreeSet");
            identityHashMap.put(LinkedHashSet.class, "LinkedHashSet");
            identityHashMap.put(ConcurrentHashMap.class, "ConcurrentHashMap");
            identityHashMap.put(ConcurrentLinkedQueue.class, "ConcurrentLinkedQueue");
            identityHashMap.put(JSONObject.class, "JSONObject");
            identityHashMap.put(JSONArray.class, "JSONArray");
            identityHashMap.put(Currency.class, "Currency");
            identityHashMap.put(TimeUnit.class, "TimeUnit");
            Class[] clsArr = {Object.class, Cloneable.class, AutoCloseable.class, Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, Hashtable.class, TreeMap.class, IdentityHashMap.class, WeakHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, LinkedList.class, TimeUnit.class, ConcurrentHashMap.class, AtomicInteger.class, AtomicLong.class, Collections.EMPTY_MAP.getClass(), Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Number.class, String.class, BigDecimal.class, BigInteger.class, BitSet.class, Calendar.class, Date.class, Locale.class, UUID.class, Currency.class, SimpleDateFormat.class, JSONObject.class, JSONArray.class, ConcurrentSkipListMap.class, ConcurrentSkipListSet.class};
            for (int i = 0; i < 68; i++) {
                Class cls = clsArr[i];
                String simpleName = cls.getSimpleName();
                Map<String, Class> map = b;
                map.put(simpleName, cls);
                map.put(cls.getName(), cls);
                f2477a.put(cls, simpleName);
            }
            Map<String, Class> map2 = b;
            map2.put("JO10", JSONObject1O.class);
            map2.put("[O", Object[].class);
            map2.put("[Ljava.lang.Object;", Object[].class);
            map2.put("[java.lang.Object", Object[].class);
            map2.put("[Object", Object[].class);
            map2.put("StackTraceElement", StackTraceElement.class);
            map2.put("[StackTraceElement", StackTraceElement[].class);
            map2.put("java.util.Collections$UnmodifiableMap", Collections.unmodifiableMap(Collections.EMPTY_MAP).getClass());
            map2.put("java.util.Collections$UnmodifiableCollection", Collections.unmodifiableCollection(Collections.EMPTY_LIST).getClass());
            Class j = JSONFactory.j();
            if (j != null) {
                map2.put("JO1", j);
                map2.put(j.getName(), j);
            }
            Class i2 = JSONFactory.i();
            if (i2 != null) {
                map2.put("JA1", i2);
                map2.put(i2.getName(), i2);
            }
            Map<Class, String> map3 = f2477a;
            map3.put(new HashMap().keySet().getClass(), pg1.ATOM_Set);
            map3.put(new LinkedHashMap().keySet().getClass(), pg1.ATOM_Set);
            map3.put(new TreeMap().keySet().getClass(), pg1.ATOM_Set);
            map3.put(new ConcurrentHashMap().keySet().getClass(), pg1.ATOM_Set);
            map3.put(new ConcurrentSkipListMap().keySet().getClass(), pg1.ATOM_Set);
            map2.put(pg1.ATOM_Set, HashSet.class);
            map3.put(new HashMap().values().getClass(), "List");
            map3.put(new LinkedHashMap().values().getClass(), "List");
            map3.put(new TreeMap().values().getClass(), "List");
            map3.put(new ConcurrentHashMap().values().getClass(), "List");
            map3.put(new ConcurrentSkipListMap().values().getClass(), "List");
            map2.put("List", ArrayList.class);
            map2.put("java.util.ImmutableCollections$Map1", HashMap.class);
            map2.put("java.util.ImmutableCollections$MapN", LinkedHashMap.class);
            map2.put("java.util.ImmutableCollections$Set12", LinkedHashSet.class);
            map2.put("java.util.ImmutableCollections$SetN", LinkedHashSet.class);
            map2.put("java.util.ImmutableCollections$List12", ArrayList.class);
            map2.put("java.util.ImmutableCollections$ListN", ArrayList.class);
            map2.put("java.util.ImmutableCollections$SubList", ArrayList.class);
            for (Map.Entry<Class, String> entry : map3.entrySet()) {
                String value = entry.getValue();
                Map<String, Class> map4 = b;
                if (map4.get(value) == null) {
                    map4.put(value, entry.getKey());
                }
            }
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        CLASS_SINGLE_SET = Collections.singleton(bool).getClass();
        CLASS_SINGLE_LIST = Collections.singletonList(bool).getClass();
        BigInteger[] bigIntegerArr = new BigInteger[19];
        bigIntegerArr[0] = BigInteger.ONE;
        bigIntegerArr[1] = BigInteger.TEN;
        long j = 10;
        for (int i = 2; i < 19; i++) {
            j *= 10;
            bigIntegerArr[i] = BigInteger.valueOf(j);
        }
        f = bigIntegerArr;
    }

    public static BigInteger A(int i) {
        BigInteger[] bigIntegerArr = f;
        if (i < bigIntegerArr.length) {
            return bigIntegerArr[i];
        }
        BigInteger[] bigIntegerArr2 = g;
        if (bigIntegerArr2 == null) {
            BigInteger[] bigIntegerArr3 = new BigInteger[128];
            BigInteger bigInteger = bigIntegerArr[18];
            for (int i2 = 19; i2 < 128; i2++) {
                bigInteger = bigInteger.multiply(BigInteger.TEN);
                bigIntegerArr3[i2] = bigInteger;
            }
            g = bigIntegerArr3;
            bigIntegerArr2 = bigIntegerArr3;
        }
        return bigIntegerArr2[i];
    }

    public static BigDecimal B(double d2) {
        byte[] bArr = new byte[24];
        return t(bArr, 0, ot7.b(d2, bArr, 0, true));
    }

    public static BigDecimal C(float f2) {
        byte[] bArr = new byte[15];
        return t(bArr, 0, ot7.d(f2, bArr, 0, true));
    }

    public static Date K(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof vcf) {
            return new Date(((vcf) obj).g());
        }
        if (obj instanceof xqx) {
            return new Date(((xqx) obj).h().g());
        }
        if (obj instanceof p7h) {
            return new Date(((p7h) obj).b(wqx.d).h().g());
        }
        if (obj instanceof q7h) {
            return new Date(xqx.c((q7h) obj, wqx.d).h().g());
        }
        if (obj instanceof String) {
            long f0 = DateUtils.f0((String) obj, wqx.d);
            if (f0 == 0) {
                return null;
            }
            return new Date(f0);
        } else if ((obj instanceof Long) || (obj instanceof Integer)) {
            return new Date(((Number) obj).longValue());
        } else {
            throw new JSONException("can not cast to Date from " + obj.getClass());
        }
    }

    public static <T> T b(Object obj, Type type) {
        return (T) c(obj, type, JSONFactory.defaultObjectReaderProvider);
    }

    public static <T> T c(Object obj, Type type, ObjectReaderProvider objectReaderProvider) {
        if (type instanceof Class) {
            return (T) a(obj, (Class) type, objectReaderProvider);
        }
        if (obj instanceof Collection) {
            return (T) objectReaderProvider.I(type).i((Collection) obj);
        }
        if (obj instanceof Map) {
            return (T) objectReaderProvider.I(type).x((Map) obj, 0L);
        }
        return (T) wqf.l(wqf.q(obj), type);
    }

    public static double d(int i, long j, int i2) {
        double d2;
        double scalb;
        double d3;
        double d4;
        long numberOfLeadingZeros = (64 - Long.numberOfLeadingZeros(j)) - ((long) Math.ceil(i2 * 3.321928094887362d));
        if (numberOfLeadingZeros < -1076) {
            d3 = i;
            d4 = vu3.b.GEO_NOT_SUPPORT;
        } else if (numberOfLeadingZeros > 1025) {
            d3 = i;
            d4 = Double.POSITIVE_INFINITY;
        } else {
            if (i2 < 0) {
                d2 = i;
                scalb = BigInteger.valueOf(j).multiply(A(-i2)).doubleValue();
            } else if (i2 == 0) {
                d2 = i;
                scalb = j;
            } else {
                BigInteger valueOf = BigInteger.valueOf(j);
                int i3 = ((int) numberOfLeadingZeros) - 56;
                BigInteger A = A(i2);
                if (i3 <= 0) {
                    valueOf = valueOf.shiftLeft(-i3);
                } else {
                    A = A.shiftLeft(i3);
                }
                BigInteger[] divideAndRemainder = valueOf.divideAndRemainder(A);
                long longValue = divideAndRemainder[0].longValue();
                int signum = divideAndRemainder[1].signum();
                int i4 = (-1076) - i3;
                if (9 - Long.numberOfLeadingZeros(longValue) >= i4) {
                    return i * Math.scalb(signum | longValue, i3);
                }
                long signum2 = (longValue >> i4) | Long.signum(longValue & ((1 << i4) - 1)) | signum;
                d2 = i;
                scalb = Math.scalb(signum2, -1076);
            }
            return d2 * scalb;
        }
        return d3 * d4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01eb A[EDGE_INSN: B:149:0x01eb->B:137:0x01eb ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double e(boolean r20, int r21, char[] r22, int r23) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.e(boolean, int, char[], int):double");
    }

    public static float f(int i, long j, int i2) {
        int i3;
        float f2;
        float scalb;
        long numberOfLeadingZeros = (64 - Long.numberOfLeadingZeros(j)) - ((long) Math.ceil(i2 * 3.321928094887362d));
        if (numberOfLeadingZeros < -151) {
            f2 = i;
            scalb = 0.0f;
        } else if (numberOfLeadingZeros > 129) {
            f2 = i;
            scalb = Float.POSITIVE_INFINITY;
        } else if (i2 < 0) {
            f2 = i;
            scalb = BigInteger.valueOf(j).multiply(A(-i2)).floatValue();
        } else {
            BigInteger valueOf = BigInteger.valueOf(j);
            int i4 = ((int) numberOfLeadingZeros) - 27;
            BigInteger A = A(i2);
            if (i4 <= 0) {
                valueOf = valueOf.shiftLeft(-i4);
            } else {
                A = A.shiftLeft(i4);
            }
            BigInteger[] divideAndRemainder = valueOf.divideAndRemainder(A);
            int intValue = divideAndRemainder[0].intValue();
            int signum = divideAndRemainder[1].signum();
            if (6 - Integer.numberOfLeadingZeros(intValue) >= (-151) - i4) {
                f2 = i;
                scalb = Math.scalb(signum | intValue, i4);
            } else {
                f2 = i;
                scalb = Math.scalb(signum | Integer.signum(((1 << i3) - 1) & intValue) | (intValue >> i3), (int) AConstants.ArtcErrorIceRecvCandidateTimeout);
            }
        }
        return f2 * scalb;
    }

    public static float g(boolean z, int i, char[] cArr, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        lv8 lv8Var;
        int i7 = i2;
        float[] fArr = f2476a;
        int i8 = 1;
        int length = fArr.length - 1;
        int i9 = 8;
        int min = Math.min(i7, 8);
        int i10 = cArr[0] - '0';
        for (int i11 = 1; i11 < min; i11++) {
            i10 = ((i10 * 10) + cArr[i11]) - 48;
        }
        float f2 = i10;
        int i12 = i - min;
        if (i7 <= 7) {
            if (i12 == 0 || f2 == 0.0f) {
                if (z) {
                    return -f2;
                }
                return f2;
            } else if (i12 >= 0) {
                if (i12 <= length) {
                    float f3 = f2 * fArr[i12];
                    if (z) {
                        return -f3;
                    }
                    return f3;
                }
                int i13 = 7 - min;
                if (i12 <= length + i13) {
                    float f4 = f2 * fArr[i13] * fArr[i12 - i13];
                    if (z) {
                        return -f4;
                    }
                    return f4;
                }
            } else if (i12 >= (-length)) {
                float f5 = f2 / fArr[-i12];
                if (z) {
                    return -f5;
                }
                return f5;
            }
        } else if (i >= i7 && i7 + i <= 15) {
            long j = i10;
            while (min < i7) {
                j = (j * 10) + (cArr[min] - '0');
                min++;
            }
            float f6 = (float) (j * SMALL_10_POW[i - i7]);
            if (z) {
                return -f6;
            }
            return f6;
        }
        double d2 = f2;
        if (i12 > 0) {
            if (i <= 39) {
                int i14 = i12 & 15;
                if (i14 != 0) {
                    d2 *= SMALL_10_POW[i14];
                }
                int i15 = i12 >> 4;
                if (i15 != 0) {
                    int i16 = 0;
                    while (i15 > 0) {
                        if ((i15 & 1) != 0) {
                            d2 *= b[i16];
                        }
                        i16++;
                        i15 >>= 1;
                    }
                }
            } else if (z) {
                return Float.NEGATIVE_INFINITY;
            } else {
                return Float.POSITIVE_INFINITY;
            }
        } else if (i12 < 0) {
            int i17 = -i12;
            if (i >= -46) {
                int i18 = i17 & 15;
                if (i18 != 0) {
                    d2 /= SMALL_10_POW[i18];
                }
                int i19 = i17 >> 4;
                if (i19 != 0) {
                    int i20 = 0;
                    while (i19 > 0) {
                        if ((i19 & 1) != 0) {
                            d2 *= c[i20];
                        }
                        i20++;
                        i19 >>= 1;
                    }
                }
            } else if (z) {
                return -0.0f;
            } else {
                return 0.0f;
            }
        }
        float max = Math.max(Float.MIN_VALUE, Math.min(Float.MAX_VALUE, (float) d2));
        if (i7 > 200) {
            cArr[200] = '1';
            i7 = 201;
        }
        lv8 lv8Var2 = new lv8(i10, cArr, min, i7);
        int i21 = i - i7;
        int floatToRawIntBits = Float.floatToRawIntBits(max);
        int max2 = Math.max(0, -i21);
        int max3 = Math.max(0, i21);
        lv8 m = lv8Var2.m(max3, 0);
        m.d = true;
        lv8 lv8Var3 = null;
        int i22 = 0;
        while (true) {
            int i23 = floatToRawIntBits >>> 23;
            int i24 = 8388607 & floatToRawIntBits;
            if (i23 > 0) {
                i3 = i24 | 8388608;
            } else {
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i24) - i9;
                i3 = i24 << numberOfLeadingZeros;
                i23 = 1 - numberOfLeadingZeros;
            }
            int i25 = i23 - 127;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i3);
            int i26 = i3 >>> numberOfTrailingZeros;
            int i27 = i23 + AConstants.ArtcErrorIceCandidateGatheringTimeOut + numberOfTrailingZeros;
            int i28 = 24 - numberOfTrailingZeros;
            if (i27 >= 0) {
                i5 = max2 + i27;
                i4 = max3;
            } else {
                i4 = max3 - i27;
                i5 = max2;
            }
            if (i25 <= -127) {
                i6 = i25 + numberOfTrailingZeros + 127;
            } else {
                i6 = numberOfTrailingZeros + 1;
            }
            int i29 = i5 + i6;
            int i30 = i4 + i6;
            int min2 = Math.min(i29, Math.min(i30, i5));
            int i31 = i30 - min2;
            int i32 = i5 - min2;
            lv8 p = lv8.p(i26, max2, i29 - min2);
            if (lv8Var3 == null || i22 != i31) {
                lv8Var3 = m.g(i31);
                i22 = i31;
            }
            int d3 = p.d(lv8Var3);
            if (d3 <= 0) {
                if (d3 >= 0) {
                    break;
                }
                lv8Var = lv8Var3.n(p);
                z2 = false;
            } else {
                lv8Var = p.f(lv8Var3);
                if (i28 != 1 || i27 <= -126 || i32 - 1 >= 0) {
                    z2 = true;
                } else {
                    lv8Var = lv8Var.g(1);
                    z2 = true;
                    i32 = 0;
                }
            }
            int e2 = lv8Var.e(max2, i32);
            if (e2 < 0) {
                break;
            }
            int i33 = -1;
            if (e2 != 0) {
                if (!z2) {
                    i33 = 1;
                }
                floatToRawIntBits += i33;
                if (floatToRawIntBits == 0 || floatToRawIntBits == 2139095040) {
                    break;
                }
                i9 = 8;
            } else if ((floatToRawIntBits & 1) != 0) {
                if (z2) {
                    i8 = -1;
                }
                floatToRawIntBits += i8;
            }
        }
        if (z) {
            floatToRawIntBits |= Integer.MIN_VALUE;
        }
        return Float.intBitsToFloat(floatToRawIntBits);
    }

    public static Class<?> h(Class cls) {
        if (cls == Integer.TYPE) {
            return int[].class;
        }
        if (cls == Byte.TYPE) {
            return byte[].class;
        }
        if (cls == Short.TYPE) {
            return short[].class;
        }
        if (cls == Long.TYPE) {
            return long[].class;
        }
        if (cls == String.class) {
            return String[].class;
        }
        if (cls == Object.class) {
            return Object[].class;
        }
        return Array.newInstance(cls, 1).getClass();
    }

    public static Class<?> i(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return i(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            if (type2 instanceof Class) {
                return (Class) type2;
            }
            return i(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return i(upperBounds[0]);
            }
        }
        if (type instanceof GenericArrayType) {
            return h(i(((GenericArrayType) type).getGenericComponentType()));
        }
        return Object.class;
    }

    public static Object j(Type type) {
        if (type == Integer.TYPE) {
            return 0;
        }
        if (type == Long.TYPE) {
            return 0L;
        }
        if (type == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (type == Double.TYPE) {
            return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
        }
        if (type == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (type == Short.TYPE) {
            return (short) 0;
        }
        if (type == Byte.TYPE) {
            return (byte) 0;
        }
        if (type == Character.TYPE) {
            return (char) 0;
        }
        return null;
    }

    public static Map k(Map map) {
        return (Map) ((JSONFactory.b) JSONFactory.l()).apply(map);
    }

    public static Class l(String str) {
        return (Class) ((ConcurrentHashMap) a.b).get(str);
    }

    public static Class<?> m(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            if (type2 instanceof Class) {
                return (Class) type2;
            }
            return m(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m(upperBounds[0]);
            }
        }
        if (type instanceof GenericArrayType) {
            return h(i(((GenericArrayType) type).getGenericComponentType()));
        }
        return Object.class;
    }

    public static String n(Class cls) {
        String name = cls.getName();
        if (name.equals("java.util.HashMap")) {
            return "M";
        }
        if (name.equals("java.util.ArrayList")) {
            return "A";
        }
        if (name.equals("com.alibaba.fastjson.JSONObject")) {
            return "JO1";
        }
        if (name.equals("com.alibaba.fastjson.JSONArray")) {
            return "JA1";
        }
        if (name.equals("java.util.List")) {
            return name;
        }
        if (name.equals("com.alibaba.fastjson2.JSONArray")) {
            return "JSONArray";
        }
        if (name.equals("java.lang.Object")) {
            return "Object";
        }
        if (name.equals("com.alibaba.fastjson2.JSONObject")) {
            return "JSONObject";
        }
        String str = (String) ((IdentityHashMap) a.f2477a).get(cls);
        if (str != null) {
            return str;
        }
        int indexOf = name.indexOf(36);
        if (indexOf != -1 && q(name.substring(indexOf + 1))) {
            Class superclass = cls.getSuperclass();
            if (Map.class.isAssignableFrom(superclass)) {
                return n(superclass);
            }
        }
        return name;
    }

    public static String o(Type type) {
        if (type instanceof Class) {
            return n((Class) type);
        }
        return "<non-class>";
    }

    public static Type p(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (rawType == List.class && actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) {
            return PARAM_TYPE_LIST_STR;
        }
        return type;
    }

    public static boolean q(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt == '-' || charAt == '+') {
            if (str.length() == 1) {
                return false;
            }
        } else if (charAt < '0' || charAt > '9') {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 < '0' || charAt2 > '9') {
                return false;
            }
        }
        return true;
    }

    public static <T> T s(Class<T> cls, JSONObject jSONObject) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, jSONObject);
    }

    public static BigDecimal t(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        if (bArr == null || i2 == 0) {
            return null;
        }
        int i4 = 0;
        if (bArr[i] == 45) {
            i3 = i + 1;
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        if (i2 <= 20 || (z && i2 == 21)) {
            int i5 = i + i2;
            long j = 0;
            int i6 = 0;
            int i7 = -1;
            while (i3 < i5) {
                byte b2 = bArr[i3];
                if (b2 != 46) {
                    if (b2 >= 48 && b2 <= 57) {
                        long j2 = j * 10;
                        if (((j | 10) >>> 31) == 0 || j2 / 10 == j) {
                            j = j2 + (b2 - 48);
                            i3++;
                        }
                    }
                    j = -1;
                    break;
                }
                i6++;
                if (i6 > 1) {
                    break;
                }
                i7 = i3;
                i3++;
            }
            if (j >= 0 && i6 <= 1) {
                if (z) {
                    j = -j;
                }
                if (i7 != -1) {
                    i4 = (i2 - (i7 - i)) - 1;
                }
                return BigDecimal.valueOf(j, i4);
            }
        }
        char[] cArr = new char[i2];
        for (int i8 = 0; i8 < i2; i8++) {
            cArr[i8] = (char) bArr[i + i8];
        }
        return new BigDecimal(cArr, 0, i2);
    }

    public static BigDecimal u(char[] cArr, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        if (cArr == null || i2 == 0) {
            return null;
        }
        if (cArr[i] == '-') {
            i3 = i + 1;
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        if (i2 <= 20 || (z && i2 == 21)) {
            int i5 = i + i2;
            long j = 0;
            int i6 = 0;
            int i7 = -1;
            while (i3 < i5) {
                char c2 = cArr[i3];
                if (c2 != '.') {
                    if (c2 >= '0' && c2 <= '9') {
                        long j2 = j * 10;
                        if (((j | 10) >>> 31) == 0 || j2 / 10 == j) {
                            j = j2 + (c2 - '0');
                            i3++;
                        }
                    }
                    j = -1;
                    break;
                }
                i6++;
                if (i6 > 1) {
                    break;
                }
                i7 = i3;
                i3++;
            }
            if (j >= 0 && i6 <= 1) {
                if (z) {
                    j = -j;
                }
                if (i7 != -1) {
                    i4 = (i2 - (i7 - i)) - 1;
                } else {
                    i4 = 0;
                }
                return BigDecimal.valueOf(j, i4);
            }
        }
        return new BigDecimal(cArr, i, i2);
    }

    public static long z(char[] cArr, int i, int i2) {
        switch (i2) {
            case 1:
                char c2 = cArr[i];
                if (c2 >= '0' && c2 <= '9') {
                    return c2 - '0';
                }
                break;
            case 2:
                char c3 = cArr[i];
                char c4 = cArr[i + 1];
                if (c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
                    return ((c3 - '0') * 10) + (c4 - '0');
                }
                break;
            case 3:
                char c5 = cArr[i];
                char c6 = cArr[i + 1];
                char c7 = cArr[i + 2];
                if (c5 >= '0' && c5 <= '9' && c6 >= '0' && c6 <= '9' && c7 >= '0' && c7 <= '9') {
                    return ((c5 - '0') * 100) + ((c6 - '0') * 10) + (c7 - '0');
                }
                break;
            case 4:
                char c8 = cArr[i];
                char c9 = cArr[i + 1];
                char c10 = cArr[i + 2];
                char c11 = cArr[i + 3];
                if (c8 >= '0' && c8 <= '9' && c9 >= '0' && c9 <= '9' && c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                    return ((c8 - '0') * 1000) + ((c9 - '0') * 100) + ((c10 - '0') * 10) + (c11 - '0');
                }
                break;
            case 5:
                char c12 = cArr[i];
                char c13 = cArr[i + 1];
                char c14 = cArr[i + 2];
                char c15 = cArr[i + 3];
                char c16 = cArr[i + 4];
                if (c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9' && c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9' && c16 >= '0' && c16 <= '9') {
                    return ((c12 - '0') * 10000) + ((c13 - '0') * 1000) + ((c14 - '0') * 100) + ((c15 - '0') * 10) + (c16 - '0');
                }
                break;
            case 6:
                char c17 = cArr[i];
                char c18 = cArr[i + 1];
                char c19 = cArr[i + 2];
                char c20 = cArr[i + 3];
                char c21 = cArr[i + 4];
                char c22 = cArr[i + 5];
                if (c17 >= '0' && c17 <= '9' && c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9' && c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9' && c22 >= '0' && c22 <= '9') {
                    return ((c17 - '0') * 100000) + ((c18 - '0') * 10000) + ((c19 - '0') * 1000) + ((c20 - '0') * 100) + ((c21 - '0') * 10) + (c22 - '0');
                }
                break;
            case 7:
                char c23 = cArr[i];
                char c24 = cArr[i + 1];
                char c25 = cArr[i + 2];
                char c26 = cArr[i + 3];
                char c27 = cArr[i + 4];
                char c28 = cArr[i + 5];
                char c29 = cArr[i + 6];
                if (c23 >= '0' && c23 <= '9' && c24 >= '0' && c24 <= '9' && c25 >= '0' && c25 <= '9' && c26 >= '0' && c26 <= '9' && c27 >= '0' && c27 <= '9' && c28 >= '0' && c28 <= '9' && c29 >= '0' && c29 <= '9') {
                    return ((c23 - '0') * 1000000) + ((c24 - '0') * 100000) + ((c25 - '0') * 10000) + ((c26 - '0') * 1000) + ((c27 - '0') * 100) + ((c28 - '0') * 10) + (c29 - '0');
                }
                break;
            case 8:
                char c30 = cArr[i];
                char c31 = cArr[i + 1];
                char c32 = cArr[i + 2];
                char c33 = cArr[i + 3];
                char c34 = cArr[i + 4];
                char c35 = cArr[i + 5];
                char c36 = cArr[i + 6];
                char c37 = cArr[i + 7];
                if (c30 >= '0' && c30 <= '9' && c31 >= '0' && c31 <= '9' && c32 >= '0' && c32 <= '9' && c33 >= '0' && c33 <= '9' && c34 >= '0' && c34 <= '9' && c35 >= '0' && c35 <= '9' && c36 >= '0' && c36 <= '9' && c37 >= '0' && c37 <= '9') {
                    return ((c30 - '0') * 10000000) + ((c31 - '0') * 1000000) + ((c32 - '0') * 100000) + ((c33 - '0') * 10000) + ((c34 - '0') * 1000) + ((c35 - '0') * 100) + ((c36 - '0') * 10) + (c37 - '0');
                }
                break;
        }
        return Long.parseLong(new String(cArr, i, i2));
    }

    public static BigDecimal D(Object obj) {
        if (obj == null || (obj instanceof BigDecimal)) {
            return (BigDecimal) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigDecimal.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return (BigDecimal) a(obj, BigDecimal.class, JSONFactory.defaultObjectReaderProvider);
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return new BigDecimal(str);
    }

    public static BigDecimal E(String str) {
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        char[] charArray = str.toCharArray();
        return u(charArray, 0, charArray.length);
    }

    public static BigInteger F(Object obj) {
        if (obj == null || (obj instanceof BigInteger)) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return new BigInteger(str);
        }
        throw new JSONException("can not cast to bigint");
    }

    public static Byte I(Object obj) {
        if (obj == null || (obj instanceof Byte)) {
            return (Byte) obj;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return Byte.valueOf(Byte.parseByte(str));
        }
        throw new JSONException("can not cast to byte");
    }

    public static Double L(Object obj) {
        if (obj == null || (obj instanceof Double)) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        }
        throw new JSONException("can not cast to decimal");
    }

    public static Float N(Object obj) {
        if (obj == null || (obj instanceof Float)) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str));
        }
        throw new JSONException("can not cast to decimal");
    }

    public static Integer R(Object obj) {
        if (obj == null || (obj instanceof Integer)) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(str));
        } else if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return null;
        } else {
            if (obj instanceof Boolean) {
                return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            throw new JSONException("can not cast to integer");
        }
    }

    public static Long S(Object obj) {
        if (obj == null || (obj instanceof Long)) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return Long.valueOf(Long.parseLong(str));
        }
        throw new JSONException("can not cast to long, class " + obj.getClass());
    }

    public static Short U(Object obj) {
        if (obj == null || (obj instanceof Short)) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return Short.valueOf(Short.parseShort(str));
        }
        throw new JSONException("can not cast to byte");
    }

    public static Boolean G(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (obj instanceof Number) {
            int intValue = ((Number) obj).intValue();
            if (intValue == 1) {
                return Boolean.TRUE;
            }
            if (intValue == 0) {
                return Boolean.FALSE;
            }
        }
        throw new JSONException("can not cast to boolean");
    }

    public static boolean H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return false;
            }
            return Boolean.parseBoolean(str);
        }
        if (obj instanceof Number) {
            int intValue = ((Number) obj).intValue();
            if (intValue == 1) {
                return true;
            }
            if (intValue == 0) {
                return false;
            }
        }
        throw new JSONException("can not cast to boolean");
    }

    public static byte J(Object obj) {
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return (byte) 0;
            }
            return Byte.parseByte(str);
        }
        throw new JSONException("can not cast to byte");
    }

    public static float O(Object obj) {
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return 0.0f;
            }
            return Float.parseFloat(str);
        }
        throw new JSONException("can not cast to decimal");
    }

    public static vcf P(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof vcf) {
            return (vcf) obj;
        }
        if (obj instanceof Date) {
            vcf.d(((Date) obj).getTime());
        }
        if (obj instanceof xqx) {
            return ((xqx) obj).h();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            if (str.charAt(0) != '\"') {
                str = "\"" + str + '\"';
            }
            JSONReader K1 = JSONReader.K1(str);
            try {
                vcf vcfVar = (vcf) K1.O1(vcf.class);
                ((i) K1).close();
                return vcfVar;
            } catch (Throwable th) {
                try {
                    ((i) K1).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            throw new JSONException("can not cast to Date from " + obj.getClass());
        }
    }

    public static int Q(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return 0;
            }
            if (str.indexOf(46) != -1) {
                return new BigDecimal(str).intValueExact();
            }
            return Integer.parseInt(str);
        }
        throw new JSONException("can not cast to decimal");
    }

    public static short V(Object obj) {
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        if (obj instanceof Number) {
            return (byte) ((Number) obj).shortValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return (short) 0;
            }
            return Short.parseShort(str);
        }
        throw new JSONException("can not cast to byte");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Object obj, Class<T> cls, ObjectReaderProvider objectReaderProvider) {
        k2a a2;
        JSONReader K1;
        if (obj == 0) {
            return null;
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (cls == Date.class) {
            return (T) K(obj);
        }
        if (cls == vcf.class) {
            return (T) P(obj);
        }
        if (cls == String.class) {
            if (obj instanceof Character) {
                return (T) obj.toString();
            }
            return (T) wqf.q(obj);
        } else if (cls == AtomicInteger.class) {
            return (T) new AtomicInteger(Q(obj));
        } else {
            if (cls == AtomicLong.class) {
                return (T) new AtomicLong(T(obj));
            }
            if (cls == AtomicBoolean.class) {
                return (T) new AtomicBoolean(((Boolean) obj).booleanValue());
            }
            if (obj instanceof Map) {
                return (T) objectReaderProvider.I(cls).x((Map) obj, 0L);
            }
            k2a M = objectReaderProvider.M(obj.getClass(), cls);
            if (M != null) {
                return (T) M.apply(obj);
            }
            if (cls.isEnum()) {
                jdk I = JSONFactory.k().I(cls);
                if (I instanceof kek) {
                    if (obj instanceof Integer) {
                        return (T) ((kek) I).g(((Integer) obj).intValue());
                    }
                    return (T) ((kek) I).o(JSONReader.K1(wqf.q(obj)), null, null, 0L);
                }
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.isEmpty() || "null".equals(str)) {
                    return null;
                }
                char charAt = str.trim().charAt(0);
                if (charAt == '\"' || charAt == '{' || charAt == '[') {
                    K1 = JSONReader.K1(str);
                } else {
                    K1 = JSONReader.K1(wqf.q(str));
                }
                return (T) JSONFactory.k().I(cls).o(K1, null, null, 0L);
            }
            if (cls.isEnum() && (obj instanceof Integer)) {
                int intValue = ((Integer) obj).intValue();
                jdk I2 = JSONFactory.defaultObjectReaderProvider.I(cls);
                if (I2 instanceof kek) {
                    return (T) ((kek) I2).g(intValue);
                }
                if (I2 instanceof jek) {
                    return (T) ((jek) I2).f(intValue);
                }
            }
            if (obj instanceof Collection) {
                return (T) objectReaderProvider.I(cls).i((Collection) obj);
            }
            String name = cls.getName();
            if ((obj instanceof Integer) || (obj instanceof Long)) {
                long longValue = ((Number) obj).longValue();
                if (name.equals("java.sql.Date")) {
                    return (T) new java.sql.Date(longValue);
                }
                if (name.equals("java.sql.Time")) {
                    return (T) new Time(longValue);
                }
                if (name.equals("java.sql.Timestamp")) {
                    return (T) new Timestamp(longValue);
                }
            }
            iik j = JSONFactory.defaultObjectWriterProvider.j(obj.getClass());
            if ((j instanceof jkk) && (a2 = ((jkk) j).a()) != null) {
                T t = (T) a2.apply(obj);
                if (cls.isInstance(t)) {
                    return t;
                }
            }
            throw new JSONException("can not cast to " + name + ", from " + obj.getClass());
        }
    }

    public static double M(Object obj) {
        if (obj == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return vu3.b.GEO_NOT_SUPPORT;
            }
            return Double.parseDouble(str);
        }
        throw new JSONException("can not cast to decimal");
    }

    public static long T(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return 0L;
            }
            return Long.parseLong(str);
        }
        throw new JSONException("can not cast to long from " + obj.getClass());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Class r(String str) {
        String str2;
        if (str.length() >= 192) {
            return null;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    c2 = 0;
                    break;
                }
                break;
            case -2010664371:
                if (str.equals("java.io.IOException")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1939501217:
                if (str.equals("Object")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1932803762:
                if (str.equals("HashMap")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1932797868:
                if (str.equals("HashSet")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1899270121:
                if (str.equals("java.util.LinkedList")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1808118735:
                if (str.equals(pg1.ATOM_String)) {
                    c2 = 6;
                    break;
                }
                break;
            case -1659005919:
                if (str.equals("ConcurrentLinkedQueue")) {
                    c2 = 7;
                    break;
                }
                break;
            case -1418007307:
                if (str.equals("LinkedHashMap")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -1418001413:
                if (str.equals("LinkedHashSet")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -1402722386:
                if (str.equals("java.util.HashMap")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -1402716492:
                if (str.equals("java.util.HashSet")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    c2 = '\f';
                    break;
                }
                break;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    c2 = '\r';
                    break;
                }
                break;
            case -1374008726:
                if (str.equals("byte[]")) {
                    c2 = 14;
                    break;
                }
                break;
            case -1361632968:
                if (str.equals("char[]")) {
                    c2 = 15;
                    break;
                }
                break;
            case -1325958191:
                if (str.equals("double")) {
                    c2 = 16;
                    break;
                }
                break;
            case -1114099497:
                if (str.equals("java.util.ArrayList")) {
                    c2 = 17;
                    break;
                }
                break;
            case -1097129250:
                if (str.equals("long[]")) {
                    c2 = 18;
                    break;
                }
                break;
            case -1074506598:
                if (str.equals("java.util.Collections$SingletonList")) {
                    c2 = 19;
                    break;
                }
                break;
            case -958795145:
                if (str.equals("LinkedList")) {
                    c2 = 20;
                    break;
                }
                break;
            case -766441794:
                if (str.equals("float[]")) {
                    c2 = 21;
                    break;
                }
                break;
            case -530663260:
                if (str.equals("java.lang.Class")) {
                    c2 = 22;
                    break;
                }
                break;
            case -413661986:
                if (str.equals("java.util.Collections$EmptyMap")) {
                    c2 = 23;
                    break;
                }
                break;
            case -413656092:
                if (str.equals("java.util.Collections$EmptySet")) {
                    c2 = 24;
                    break;
                }
                break;
            case -113680546:
                if (str.equals(yp7.CACHE_MODULE)) {
                    c2 = 25;
                    break;
                }
                break;
            case 65:
                if (str.equals("A")) {
                    c2 = JSONLexer.EOI;
                    break;
                }
                break;
            case 66:
                if (str.equals("B")) {
                    c2 = 27;
                    break;
                }
                break;
            case 67:
                if (str.equals("C")) {
                    c2 = 28;
                    break;
                }
                break;
            case 68:
                if (str.equals(TLogTracker.LEVEL_DEBUG)) {
                    c2 = 29;
                    break;
                }
                break;
            case 70:
                if (str.equals(UTConstant.Args.UT_SUCCESS_F)) {
                    c2 = 30;
                    break;
                }
                break;
            case 73:
                if (str.equals(TLogTracker.LEVEL_INFO)) {
                    c2 = 31;
                    break;
                }
                break;
            case 74:
                if (str.equals("J")) {
                    c2 = ' ';
                    break;
                }
                break;
            case 77:
                if (str.equals("M")) {
                    c2 = '!';
                    break;
                }
                break;
            case 79:
                if (str.equals("O")) {
                    c2 = '\"';
                    break;
                }
                break;
            case 83:
                if (str.equals(ExifInterface.LATITUDE_SOUTH)) {
                    c2 = '#';
                    break;
                }
                break;
            case 90:
                if (str.equals("Z")) {
                    c2 = '$';
                    break;
                }
                break;
            case 2421:
                if (str.equals(RPCDataItems.LOCAL_AMNET)) {
                    c2 = WXUtils.PERCENT;
                    break;
                }
                break;
            case 2433:
                if (str.equals("LM")) {
                    c2 = '&';
                    break;
                }
                break;
            case 2887:
                if (str.equals("[B")) {
                    c2 = '\'';
                    break;
                }
                break;
            case cpr.MSG_TYPE_IMPORTANT_EVENT_NOTIFY /* 2888 */:
                if (str.equals("[C")) {
                    c2 = '(';
                    break;
                }
                break;
            case 2889:
                if (str.equals("[D")) {
                    c2 = ')';
                    break;
                }
                break;
            case 2891:
                if (str.equals("[F")) {
                    c2 = '*';
                    break;
                }
                break;
            case 2894:
                if (str.equals("[I")) {
                    c2 = '+';
                    break;
                }
                break;
            case 2895:
                if (str.equals("[J")) {
                    c2 = ',';
                    break;
                }
                break;
            case SecExceptionCode.SEC_ERROR_UT_ANDROID /* 2900 */:
                if (str.equals("[O")) {
                    c2 = '-';
                    break;
                }
                break;
            case 2904:
                if (str.equals("[S")) {
                    c2 = '.';
                    break;
                }
                break;
            case 2911:
                if (str.equals("[Z")) {
                    c2 = wh6.DIR;
                    break;
                }
                break;
            case 73612:
                if (str.equals("JO1")) {
                    c2 = '0';
                    break;
                }
                break;
            case 77116:
                if (str.equals(pg1.ATOM_Map)) {
                    c2 = '1';
                    break;
                }
                break;
            case 83010:
                if (str.equals(pg1.ATOM_Set)) {
                    c2 = '2';
                    break;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    c2 = '3';
                    break;
                }
                break;
            case 2122702:
                if (str.equals("Date")) {
                    c2 = '4';
                    break;
                }
                break;
            case 2368702:
                if (str.equals("List")) {
                    c2 = '5';
                    break;
                }
                break;
            case 2616251:
                if (str.equals(TransportConstants.KEY_UUID)) {
                    c2 = '6';
                    break;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    c2 = '7';
                    break;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    c2 = '8';
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    c2 = '9';
                    break;
                }
                break;
            case 61358428:
                if (str.equals("java.util.Collections$EmptyList")) {
                    c2 = f7l.CONDITION_IF_MIDDLE;
                    break;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    c2 = ';';
                    break;
                }
                break;
            case 65821278:
                if (str.equals("java.util.List")) {
                    c2 = '<';
                    break;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    c2 = '=';
                    break;
                }
                break;
            case 100361105:
                if (str.equals("int[]")) {
                    c2 = '>';
                    break;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    c2 = f7l.CONDITION_IF;
                    break;
                }
                break;
            case 179563853:
                if (str.equals("java.util.Arrays$ArrayList")) {
                    c2 = '@';
                    break;
                }
                break;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    c2 = 'A';
                    break;
                }
                break;
            case 578806391:
                if (str.equals("ArrayList")) {
                    c2 = 'B';
                    break;
                }
                break;
            case 600988612:
                if (str.equals("TreeSet")) {
                    c2 = 'C';
                    break;
                }
                break;
            case 889669201:
                if (str.equals("java.util.Collections$UnmodifiableRandomAccessList")) {
                    c2 = ohh.LEVEL_D;
                    break;
                }
                break;
            case 935176422:
                if (str.equals("java.util.Collections$SingletonSet")) {
                    c2 = ohh.LEVEL_E;
                    break;
                }
                break;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    c2 = 'F';
                    break;
                }
                break;
            case 1131069988:
                if (str.equals("java.util.TreeSet")) {
                    c2 = 'G';
                    break;
                }
                break;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    c2 = 'H';
                    break;
                }
                break;
            case 1258621781:
                if (str.equals("java.util.LinkedHashMap")) {
                    c2 = ohh.LEVEL_I;
                    break;
                }
                break;
            case 1258627675:
                if (str.equals("java.util.LinkedHashSet")) {
                    c2 = 'J';
                    break;
                }
                break;
            case 1359468275:
                if (str.equals("double[]")) {
                    c2 = 'K';
                    break;
                }
                break;
            case 1372295063:
                if (str.equals("ConcurrentHashMap")) {
                    c2 = ohh.LEVEL_L;
                    break;
                }
                break;
            case 1645304908:
                if (str.equals("[String")) {
                    c2 = 'M';
                    break;
                }
                break;
            case 1752376903:
                if (str.equals("JSONObject")) {
                    c2 = 'N';
                    break;
                }
                break;
            case 2058423690:
                if (str.equals("boolean[]")) {
                    c2 = 'O';
                    break;
                }
                break;
            case 2067161310:
                if (str.equals("short[]")) {
                    c2 = 'P';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return Integer.class;
            case 1:
                return IOException.class;
            case 2:
            case '\"':
            case 'F':
                return Object.class;
            case 3:
            case '\n':
            case '!':
                return HashMap.class;
            case 4:
            case 11:
                return HashSet.class;
            case 5:
            case 20:
            case '%':
                return LinkedList.class;
            case 6:
            case 'H':
                return String.class;
            case 7:
                return ConcurrentLinkedQueue.class;
            case '\b':
            case '&':
            case 'I':
                return LinkedHashMap.class;
            case '\t':
            case 'J':
                return LinkedHashSet.class;
            case '\f':
            case '1':
                return Map.class;
            case '\r':
            case '2':
                return Set.class;
            case 14:
            case '\'':
                return byte[].class;
            case 15:
            case '(':
                return char[].class;
            case 16:
            case 29:
                return Double.TYPE;
            case 17:
            case 26:
            case 'B':
                return ArrayList.class;
            case 18:
            case ',':
                return long[].class;
            case 19:
                return CLASS_SINGLE_LIST;
            case 21:
            case '*':
                return float[].class;
            case 22:
                return Class.class;
            case 23:
                return Collections.EMPTY_MAP.getClass();
            case 24:
                return Collections.EMPTY_SET.getClass();
            case 25:
                return Calendar.class;
            case 27:
            case '7':
                return Byte.TYPE;
            case 28:
            case '8':
                return Character.TYPE;
            case 30:
            case '=':
                return Float.TYPE;
            case 31:
            case '3':
                return Integer.TYPE;
            case ' ':
            case '9':
                return Long.TYPE;
            case '#':
            case '?':
                return Short.TYPE;
            case '$':
            case ';':
                return Boolean.TYPE;
            case ')':
            case 'K':
                return double[].class;
            case '+':
            case '>':
                return int[].class;
            case '-':
                return Object[].class;
            case '.':
            case 'P':
                return short[].class;
            case '/':
            case 'O':
                return boolean[].class;
            case '0':
                str = "com.alibaba.fastjson.JSONObject";
                break;
            case '4':
                return Date.class;
            case '5':
            case '<':
                return List.class;
            case '6':
                return UUID.class;
            case ':':
                return Collections.EMPTY_LIST.getClass();
            case '@':
                return Arrays.asList(1).getClass();
            case 'A':
                return Long.class;
            case 'C':
            case 'G':
                return TreeSet.class;
            case 'D':
                return CLASS_UNMODIFIABLE_LIST;
            case 'E':
                return CLASS_SINGLE_SET;
            case 'L':
                return ConcurrentHashMap.class;
            case 'M':
                return String[].class;
            case 'N':
                return JSONObject.class;
        }
        Class cls = (Class) ((ConcurrentHashMap) a.b).get(str);
        if (cls != null) {
            return cls;
        }
        if (str.startsWith("java.util.ImmutableCollections$")) {
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return CLASS_UNMODIFIABLE_LIST;
            }
        } else {
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
            if (str.charAt(0) == '[' || str.endsWith(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)) {
                if (str.charAt(0) == '[') {
                    str2 = str.substring(1);
                } else {
                    str2 = str.substring(0, str.length() - 2);
                }
                Class r = r(str2);
                if (r != null) {
                    return Array.newInstance(r, 0).getClass();
                }
                throw new JSONException("load class error ".concat(str));
            }
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                try {
                    return contextClassLoader.loadClass(str);
                } catch (ClassNotFoundException unused2) {
                }
            }
            try {
                try {
                    return b.class.getClassLoader().loadClass(str);
                } catch (ClassNotFoundException unused3) {
                    return null;
                }
            } catch (ClassNotFoundException unused4) {
                return Class.forName(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: StringIndexOutOfBoundsException -> 0x010f, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010f, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:55:0x009d, B:57:0x00a1, B:61:0x00ab, B:68:0x00bc, B:74:0x00d0, B:77:0x00dc, B:78:0x00e4, B:82:0x00ed, B:83:0x00f1, B:87:0x00f9, B:91:0x0102, B:93:0x0107, B:94:0x010e), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[Catch: StringIndexOutOfBoundsException -> 0x010f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010f, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:55:0x009d, B:57:0x00a1, B:61:0x00ab, B:68:0x00bc, B:74:0x00d0, B:77:0x00dc, B:78:0x00e4, B:82:0x00ed, B:83:0x00f1, B:87:0x00f9, B:91:0x0102, B:93:0x0107, B:94:0x010e), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[Catch: StringIndexOutOfBoundsException -> 0x010f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010f, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:55:0x009d, B:57:0x00a1, B:61:0x00ab, B:68:0x00bc, B:74:0x00d0, B:77:0x00dc, B:78:0x00e4, B:82:0x00ed, B:83:0x00f1, B:87:0x00f9, B:91:0x0102, B:93:0x0107, B:94:0x010e), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d A[Catch: StringIndexOutOfBoundsException -> 0x010f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010f, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:55:0x009d, B:57:0x00a1, B:61:0x00ab, B:68:0x00bc, B:74:0x00d0, B:77:0x00dc, B:78:0x00e4, B:82:0x00ed, B:83:0x00f1, B:87:0x00f9, B:91:0x0102, B:93:0x0107, B:94:0x010e), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102 A[Catch: StringIndexOutOfBoundsException -> 0x010f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010f, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:55:0x009d, B:57:0x00a1, B:61:0x00ab, B:68:0x00bc, B:74:0x00d0, B:77:0x00dc, B:78:0x00e4, B:82:0x00ed, B:83:0x00f1, B:87:0x00f9, B:91:0x0102, B:93:0x0107, B:94:0x010e), top: B:98:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double v(byte[] r20, int r21, int r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.v(byte[], int, int):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: StringIndexOutOfBoundsException -> 0x010d, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010d, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:44:0x007f, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:55:0x009b, B:57:0x009f, B:61:0x00a9, B:68:0x00ba, B:74:0x00ce, B:77:0x00da, B:78:0x00e2, B:82:0x00eb, B:83:0x00ef, B:87:0x00f7, B:91:0x0100, B:93:0x0105, B:94:0x010c), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[Catch: StringIndexOutOfBoundsException -> 0x010d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010d, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:44:0x007f, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:55:0x009b, B:57:0x009f, B:61:0x00a9, B:68:0x00ba, B:74:0x00ce, B:77:0x00da, B:78:0x00e2, B:82:0x00eb, B:83:0x00ef, B:87:0x00f7, B:91:0x0100, B:93:0x0105, B:94:0x010c), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[Catch: StringIndexOutOfBoundsException -> 0x010d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010d, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:44:0x007f, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:55:0x009b, B:57:0x009f, B:61:0x00a9, B:68:0x00ba, B:74:0x00ce, B:77:0x00da, B:78:0x00e2, B:82:0x00eb, B:83:0x00ef, B:87:0x00f7, B:91:0x0100, B:93:0x0105, B:94:0x010c), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b A[Catch: StringIndexOutOfBoundsException -> 0x010d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010d, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:44:0x007f, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:55:0x009b, B:57:0x009f, B:61:0x00a9, B:68:0x00ba, B:74:0x00ce, B:77:0x00da, B:78:0x00e2, B:82:0x00eb, B:83:0x00ef, B:87:0x00f7, B:91:0x0100, B:93:0x0105, B:94:0x010c), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100 A[Catch: StringIndexOutOfBoundsException -> 0x010d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010d, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:44:0x007f, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:55:0x009b, B:57:0x009f, B:61:0x00a9, B:68:0x00ba, B:74:0x00ce, B:77:0x00da, B:78:0x00e2, B:82:0x00eb, B:83:0x00ef, B:87:0x00f7, B:91:0x0100, B:93:0x0105, B:94:0x010c), top: B:98:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double w(char[] r20, int r21, int r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.w(char[], int, int):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: StringIndexOutOfBoundsException -> 0x010e, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010e, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:55:0x009d, B:57:0x00a1, B:61:0x00ab, B:68:0x00bc, B:74:0x00d0, B:77:0x00dc, B:78:0x00e4, B:82:0x00ed, B:83:0x00f1, B:87:0x00f9, B:91:0x0101, B:93:0x0106, B:94:0x010d), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[Catch: StringIndexOutOfBoundsException -> 0x010e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010e, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:55:0x009d, B:57:0x00a1, B:61:0x00ab, B:68:0x00bc, B:74:0x00d0, B:77:0x00dc, B:78:0x00e4, B:82:0x00ed, B:83:0x00f1, B:87:0x00f9, B:91:0x0101, B:93:0x0106, B:94:0x010d), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[Catch: StringIndexOutOfBoundsException -> 0x010e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010e, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:55:0x009d, B:57:0x00a1, B:61:0x00ab, B:68:0x00bc, B:74:0x00d0, B:77:0x00dc, B:78:0x00e4, B:82:0x00ed, B:83:0x00f1, B:87:0x00f9, B:91:0x0101, B:93:0x0106, B:94:0x010d), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d A[Catch: StringIndexOutOfBoundsException -> 0x010e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010e, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:55:0x009d, B:57:0x00a1, B:61:0x00ab, B:68:0x00bc, B:74:0x00d0, B:77:0x00dc, B:78:0x00e4, B:82:0x00ed, B:83:0x00f1, B:87:0x00f9, B:91:0x0101, B:93:0x0106, B:94:0x010d), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101 A[Catch: StringIndexOutOfBoundsException -> 0x010e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010e, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:55:0x009d, B:57:0x00a1, B:61:0x00ab, B:68:0x00bc, B:74:0x00d0, B:77:0x00dc, B:78:0x00e4, B:82:0x00ed, B:83:0x00f1, B:87:0x00f9, B:91:0x0101, B:93:0x0106, B:94:0x010d), top: B:98:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float x(byte[] r20, int r21, int r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.x(byte[], int, int):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: StringIndexOutOfBoundsException -> 0x010c, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010c, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:44:0x007f, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:55:0x009b, B:57:0x009f, B:61:0x00a9, B:68:0x00ba, B:74:0x00ce, B:77:0x00da, B:78:0x00e2, B:82:0x00eb, B:83:0x00ef, B:87:0x00f7, B:91:0x00ff, B:93:0x0104, B:94:0x010b), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[Catch: StringIndexOutOfBoundsException -> 0x010c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010c, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:44:0x007f, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:55:0x009b, B:57:0x009f, B:61:0x00a9, B:68:0x00ba, B:74:0x00ce, B:77:0x00da, B:78:0x00e2, B:82:0x00eb, B:83:0x00ef, B:87:0x00f7, B:91:0x00ff, B:93:0x0104, B:94:0x010b), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[Catch: StringIndexOutOfBoundsException -> 0x010c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010c, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:44:0x007f, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:55:0x009b, B:57:0x009f, B:61:0x00a9, B:68:0x00ba, B:74:0x00ce, B:77:0x00da, B:78:0x00e2, B:82:0x00eb, B:83:0x00ef, B:87:0x00f7, B:91:0x00ff, B:93:0x0104, B:94:0x010b), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b A[Catch: StringIndexOutOfBoundsException -> 0x010c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010c, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:44:0x007f, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:55:0x009b, B:57:0x009f, B:61:0x00a9, B:68:0x00ba, B:74:0x00ce, B:77:0x00da, B:78:0x00e2, B:82:0x00eb, B:83:0x00ef, B:87:0x00f7, B:91:0x00ff, B:93:0x0104, B:94:0x010b), top: B:98:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff A[Catch: StringIndexOutOfBoundsException -> 0x010c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010c, blocks: (B:4:0x000a, B:10:0x001b, B:11:0x001e, B:15:0x002c, B:17:0x0030, B:20:0x0037, B:22:0x003b, B:24:0x003f, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:44:0x007f, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:55:0x009b, B:57:0x009f, B:61:0x00a9, B:68:0x00ba, B:74:0x00ce, B:77:0x00da, B:78:0x00e2, B:82:0x00eb, B:83:0x00ef, B:87:0x00f7, B:91:0x00ff, B:93:0x0104, B:94:0x010b), top: B:98:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float y(char[] r20, int r21, int r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.y(char[], int, int):float");
    }
}
