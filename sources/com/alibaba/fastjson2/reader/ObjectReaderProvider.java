package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.annotation.JSONBuilder;
import com.alibaba.fastjson2.annotation.JSONCreator;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.sql.DataSource;
import javax.sql.RowSet;
import tb.aek;
import tb.afk;
import tb.auf;
import tb.bek;
import tb.bfk;
import tb.bgk;
import tb.cek;
import tb.cfk;
import tb.cgk;
import tb.dek;
import tb.dfk;
import tb.e62;
import tb.eek;
import tb.ehk;
import tb.f79;
import tb.fek;
import tb.g3i;
import tb.gek;
import tb.ggk;
import tb.hek;
import tb.hgk;
import tb.iek;
import tb.igk;
import tb.iql;
import tb.jbj;
import tb.jdk;
import tb.jgk;
import tb.k2a;
import tb.kgk;
import tb.lek;
import tb.lgk;
import tb.ls9;
import tb.mek;
import tb.mgk;
import tb.nek;
import tb.ngk;
import tb.nk4;
import tb.oek;
import tb.ogk;
import tb.pek;
import tb.pg1;
import tb.pgk;
import tb.qck;
import tb.qek;
import tb.qgk;
import tb.rck;
import tb.rdk;
import tb.rek;
import tb.rgk;
import tb.rhk;
import tb.sck;
import tb.sek;
import tb.sgk;
import tb.tek;
import tb.tgk;
import tb.udk;
import tb.uek;
import tb.vdk;
import tb.vek;
import tb.vgk;
import tb.vqq;
import tb.vu3;
import tb.wdk;
import tb.wek;
import tb.wqx;
import tb.xdk;
import tb.xek;
import tb.xfk;
import tb.xtf;
import tb.xzt;
import tb.ydk;
import tb.yek;
import tb.yfk;
import tb.ytf;
import tb.zdk;
import tb.zek;
import tb.zhk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ObjectReaderProvider {
    public static a j;
    public final ConcurrentMap<Long, jdk> c;
    public ConcurrentMap<Type, Map<Type, k2a>> f;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap<Type, jdk> f2468a = new ConcurrentHashMap();
    public final ConcurrentMap<Type, jdk> b = new ConcurrentHashMap();
    public final ConcurrentMap<Class, Class> d = new ConcurrentHashMap();
    public final LRUAutoTypeCache e = new LRUAutoTypeCache(1024);
    public final long[] h = {-9164606388214699518L, -8754006975464705441L, -8720046426850100497L, -8649961213709896794L, -8614556368991373401L, -8382625455832334425L, -8165637398350707645L, -8109300701639721088L, -7966123100503199569L, -7921218830998286408L, -7775351613326101303L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6316154655839304624L, -6179589609550493385L, -6149130139291498841L, -6149093380703242441L, -6088208984980396913L, -6025144546313590215L, -5939269048541779808L, -5885964883385605994L, -5767141746063564198L, -5764804792063216819L, -5472097725414717105L, -5194641081268104286L, -5076846148177416215L, -4837536971810737970L, -4836620931940850535L, -4733542790109620528L, -4703320437989596122L, -4608341446948126581L, -4537258998789938600L, -4438775680185074100L, -4314457471973557243L, -4150995715611818742L, -4082057040235125754L, -3975378478825053783L, -3967588558552655563L, -3935185854875733362L, -3319207949486691020L, -3077205613010077203L, -3053747177772160511L, -2995060141064716555L, -2825378362173150292L, -2533039401923731906L, -2439930098895578154L, -2378990704010641148L, -2364987994247679115L, -2262244760619952081L, -2192804397019347313L, -2095516571388852610L, -1872417015366588117L, -1650485814983027158L, -1589194880214235129L, -965955008570215305L, -905177026366752536L, -831789045734283466L, -803541446955902575L, -731978084025273882L, -666475508176557463L, -582813228520337988L, -254670111376247151L, -219577392946377768L, -190281065685395680L, -26639035867733124L, -9822483067882491L, 4750336058574309L, 33238344207745342L, 156405680656087946L, 218512992947536312L, 313864100207897507L, 386461436234701831L, 744602970950881621L, 823641066473609950L, 1073634739308289776L, 1153291637701043748L, 1203232727967308606L, 1214780596910349029L, 1268707909007641340L, 1459860845934817624L, 1502845958873959152L, 1534439610567445754L, 1698504441317515818L, 1818089308493370394L, 2078113382421334967L, 2164696723069287854L, 2622551729063269307L, 2653453629929770569L, 2660670623866180977L, 2731823439467737506L, 2836431254737891113L, 2930861374593775110L, 3058452313624178956L, 3085473968517218653L, 3089451460101527857L, 3114862868117605599L, 3129395579983849527L, 3256258368248066264L, 3452379460455804429L, 3547627781654598988L, 3637939656440441093L, 3688179072722109200L, 3718352661124136681L, 3730752432285826863L, 3740226159580918099L, 3794316665763266033L, 3977090344859527316L, 4000049462512838776L, 4046190361520671643L, 4147696707147271408L, 4193204392725694463L, 4215053018660518963L, 4241163808635564644L, 4254584350247334433L, 4814658433570175913L, 4841947709850912914L, 4904007817188630457L, 5100336081510080343L, 5120543992130540564L, 5274044858141538265L, 5347909877633654828L, 5450448828334921485L, 5474268165959054640L, 5545425291794704408L, 5596129856135573697L, 5688200883751798389L, 5751393439502795295L, 5916409771425455946L, 5944107969236155580L, 6007332606592876737L, 6090377589998869205L, 6280357960959217660L, 6456855723474196908L, 6511035576063254270L, 6534946468240507089L, 6584624952928234050L, 6734240326434096246L, 6742705432718011780L, 6800727078373023163L, 6854854816081053523L, 7045245923763966215L, 7123326897294507060L, 7164889056054194741L, 7179336928365889465L, 7240293012336844478L, 7347653049056829645L, 7375862386996623731L, 7442624256860549330L, 7617522210483516279L, 7658177784286215602L, 8055461369741094911L, 8064026652676081192L, 8389032537095247355L, 8488266005336625107L, 8537233257283452655L, 8735538376409180149L, 8838294710098435315L, 8861402923078831179L, 9140390920032557669L, 9140416208800006522L, 9144212112462101475L};
    public final long[] i = {-6293031534589903644L};
    public final rdk g = rdk.INSTANCE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class LRUAutoTypeCache extends LinkedHashMap<String, Date> {
        private final int maxSize;

        public LRUAutoTypeCache(int i) {
            super(16, 0.75f, false);
            this.maxSize = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Date> entry) {
            if (size() > this.maxSize) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f2469a;
        public final jdk b;
        public volatile int c;

        public a(long j, jdk jdkVar) {
            this.f2469a = j;
            this.b = jdkVar;
        }
    }

    public ObjectReaderProvider() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        concurrentHashMap.put(Long.valueOf((long) qck.TYPE_HASH_CODE), qck.INSTANCE);
        concurrentHashMap.put(-4834614249632438472L, qgk.b);
        concurrentHashMap.put(77L, ggk.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #0 {all -> 0x004f, blocks: (B:2:0x0000, B:7:0x0015, B:10:0x0020, B:17:0x0030, B:19:0x003e, B:20:0x0041), top: B:23:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void T(java.lang.annotation.Annotation r5, tb.e62 r6, java.lang.Class r7, java.lang.reflect.Method r8) {
        /*
            java.lang.String r0 = r8.getName()     // Catch: all -> 0x004f
            int r1 = r0.hashCode()     // Catch: all -> 0x004f
            r2 = 2068281583(0x7b4778ef, float:1.0357199E36)
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L_0x0020
            r2 = 2092901112(0x7cbf22f8, float:7.9395036E36)
            if (r1 == r2) goto L_0x0015
            goto L_0x002a
        L_0x0015:
            java.lang.String r1 = "withPrefix"
            boolean r0 = r0.equals(r1)     // Catch: all -> 0x004f
            if (r0 == 0) goto L_0x002a
            r0 = 1
            goto L_0x002b
        L_0x0020:
            java.lang.String r1 = "buildMethod"
            boolean r0 = r0.equals(r1)     // Catch: all -> 0x004f
            if (r0 == 0) goto L_0x002a
            r0 = 0
            goto L_0x002b
        L_0x002a:
            r0 = -1
        L_0x002b:
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x0030
            goto L_0x004f
        L_0x0030:
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: all -> 0x004f
            java.lang.Object r5 = r8.invoke(r5, r7)     // Catch: all -> 0x004f
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x004f
            boolean r7 = r5.isEmpty()     // Catch: all -> 0x004f
            if (r7 != 0) goto L_0x004f
            r6.e = r5     // Catch: all -> 0x004f
            goto L_0x004f
        L_0x0041:
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: all -> 0x004f
            java.lang.Object r5 = r8.invoke(r5, r0)     // Catch: all -> 0x004f
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x004f
            java.lang.reflect.Method r5 = com.alibaba.fastjson2.util.BeanUtils.g(r7, r5)     // Catch: all -> 0x004f
            r6.d = r5     // Catch: all -> 0x004f
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderProvider.T(java.lang.annotation.Annotation, tb.e62, java.lang.Class, java.lang.reflect.Method):void");
    }

    public static /* synthetic */ void U(Annotation annotation, e62 e62Var, Method method) {
        try {
            String name = method.getName();
            if (name.hashCode() == 1117066527 && name.equals("parameterNames")) {
                String[] strArr = (String[]) method.invoke(annotation, new Object[0]);
                if (strArr.length != 0) {
                    e62Var.l = strArr;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void V(Annotation annotation, e62 e62Var, Method method) {
        try {
            String name = method.getName();
            if (name.hashCode() == 1117066527 && name.equals("parameterNames")) {
                String[] strArr = (String[]) method.invoke(annotation, new Object[0]);
                if (strArr.length != 0) {
                    e62Var.l = strArr;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ File X(String str) {
        return new File(str);
    }

    public static /* synthetic */ URL Y(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new JSONException("read URL error", e);
        }
    }

    public static /* synthetic */ InetAddress b0(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (UnknownHostException e) {
            throw new JSONException("create address error", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e5 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:3:0x0007, B:4:0x0014, B:6:0x0018, B:9:0x0022, B:12:0x002d, B:15:0x0038, B:18:0x0043, B:21:0x004d, B:24:0x0057, B:27:0x0062, B:30:0x006d, B:34:0x0078, B:36:0x007d, B:38:0x0087, B:39:0x008b, B:41:0x0091, B:48:0x00ab, B:51:0x00b5, B:54:0x00bf, B:62:0x00d1, B:63:0x00db, B:64:0x00e5, B:65:0x00ee, B:66:0x00f1, B:68:0x00f9, B:69:0x00fd, B:71:0x0105, B:72:0x010d, B:74:0x0112, B:76:0x0116, B:77:0x0119, B:78:0x013d, B:80:0x0145, B:81:0x0148, B:83:0x0150, B:84:0x0153, B:86:0x015b, B:88:0x0167, B:90:0x016d, B:91:0x0173, B:92:0x0176, B:94:0x017e), top: B:97:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void c0(java.lang.annotation.Annotation r10, tb.f79 r11, java.lang.reflect.Method r12) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderProvider.c0(java.lang.annotation.Annotation, tb.f79, java.lang.reflect.Method):void");
    }

    public static /* synthetic */ void d0(Annotation annotation, e62 e62Var, Method method) {
        String name = method.getName();
        try {
            Object invoke = method.invoke(annotation, new Object[0]);
            if (name.equals("typeName")) {
                String str = (String) invoke;
                if (!str.isEmpty()) {
                    e62Var.b = str;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static k2a j0(ConcurrentMap<Type, Map<Type, k2a>> concurrentMap, Type type, Type type2, k2a k2aVar) {
        Map<Type, k2a> map = concurrentMap.get(type);
        if (map == null) {
            concurrentMap.put(type, new ConcurrentHashMap());
            map = concurrentMap.get(type);
        }
        return map.put(type2, k2aVar);
    }

    public static jdk k0(Class cls, Class cls2, Type type, Type type2) {
        if ((type == null || type == String.class) && type2 == String.class) {
            return new jgk(cls, cls2, 0L);
        }
        return new kgk(cls, cls2, type, type2, 0L, null);
    }

    public static ConcurrentMap<Type, Map<Type, k2a>> s() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j0(concurrentHashMap, Character.class, Character.TYPE, new k2a() { // from class: tb.ygk
            @Override // tb.k2a
            public final Object apply(Object obj) {
                return obj;
            }
        });
        Class<Boolean> cls = Boolean.class;
        Class<BigInteger> cls2 = BigInteger.class;
        Class<BigDecimal> cls3 = BigDecimal.class;
        Class[] clsArr = {cls, Byte.class, Short.class, Integer.class, Long.class, Number.class, Float.class, Double.class, cls2, cls3, AtomicInteger.class, AtomicLong.class};
        xzt xztVar = new xzt(cls, null);
        for (int i = 0; i < 12; i++) {
            j0(concurrentHashMap, clsArr[i], cls, xztVar);
        }
        xzt xztVar2 = new xzt(cls, Boolean.FALSE);
        int i2 = 0;
        while (i2 < 12) {
            j0(concurrentHashMap, clsArr[i2], Boolean.TYPE, xztVar2);
            i2++;
            cls = cls;
        }
        xzt xztVar3 = new xzt(String.class);
        int i3 = 0;
        for (int i4 = 12; i3 < i4; i4 = 12) {
            j0(concurrentHashMap, clsArr[i3], String.class, xztVar3);
            i3++;
        }
        xzt xztVar4 = new xzt(cls3);
        int i5 = 0;
        for (int i6 = 12; i5 < i6; i6 = 12) {
            j0(concurrentHashMap, clsArr[i5], cls3, xztVar4);
            i5++;
        }
        xzt xztVar5 = new xzt(cls2);
        int i7 = 0;
        for (int i8 = 12; i7 < i8; i8 = 12) {
            j0(concurrentHashMap, clsArr[i7], cls2, xztVar5);
            i7++;
        }
        xzt xztVar6 = new xzt(Byte.class);
        int i9 = 0;
        for (int i10 = 12; i9 < i10; i10 = 12) {
            j0(concurrentHashMap, clsArr[i9], Byte.class, xztVar6);
            i9++;
        }
        xzt xztVar7 = new xzt(Byte.class, (byte) 0);
        int i11 = 0;
        for (int i12 = 12; i11 < i12; i12 = 12) {
            j0(concurrentHashMap, clsArr[i11], Byte.TYPE, xztVar7);
            i11++;
            cls2 = cls2;
        }
        xzt xztVar8 = new xzt(Short.class);
        for (int i13 = 0; i13 < 12; i13++) {
            j0(concurrentHashMap, clsArr[i13], Short.class, xztVar8);
        }
        xzt xztVar9 = new xzt(Short.class, (short) 0);
        int i14 = 0;
        while (i14 < 12) {
            j0(concurrentHashMap, clsArr[i14], Short.TYPE, xztVar9);
            i14++;
            cls3 = cls3;
        }
        xzt xztVar10 = new xzt(Integer.class);
        for (int i15 = 0; i15 < 12; i15++) {
            j0(concurrentHashMap, clsArr[i15], Integer.class, xztVar10);
        }
        xzt xztVar11 = new xzt(Integer.class, 0);
        int i16 = 0;
        for (int i17 = 12; i16 < i17; i17 = 12) {
            j0(concurrentHashMap, clsArr[i16], Integer.TYPE, xztVar11);
            i16++;
        }
        xzt xztVar12 = new xzt(Long.class);
        for (int i18 = 0; i18 < 12; i18++) {
            j0(concurrentHashMap, clsArr[i18], Long.class, xztVar12);
        }
        xzt xztVar13 = new xzt(Long.class, 0L);
        int i19 = 0;
        for (int i20 = 12; i19 < i20; i20 = 12) {
            j0(concurrentHashMap, clsArr[i19], Long.TYPE, xztVar13);
            i19++;
        }
        xzt xztVar14 = new xzt(Float.class);
        for (int i21 = 0; i21 < 12; i21++) {
            j0(concurrentHashMap, clsArr[i21], Float.class, xztVar14);
        }
        xzt xztVar15 = new xzt(Float.class, Float.valueOf(0.0f));
        int i22 = 0;
        for (int i23 = 12; i22 < i23; i23 = 12) {
            j0(concurrentHashMap, clsArr[i22], Float.TYPE, xztVar15);
            i22++;
        }
        xzt xztVar16 = new xzt(Double.class);
        for (int i24 = 0; i24 < 12; i24++) {
            j0(concurrentHashMap, clsArr[i24], Double.class, xztVar16);
        }
        xzt xztVar17 = new xzt(Double.class, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
        for (int i25 = 0; i25 < 12; i25++) {
            j0(concurrentHashMap, clsArr[i25], Double.TYPE, xztVar17);
        }
        xzt xztVar18 = new xzt(Number.class, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
        for (int i26 = 0; i26 < 12; i26++) {
            j0(concurrentHashMap, clsArr[i26], Number.class, xztVar18);
        }
        Class cls4 = Character.TYPE;
        j0(concurrentHashMap, String.class, cls4, new vqq(cls4, '0'));
        Class cls5 = Boolean.TYPE;
        j0(concurrentHashMap, String.class, cls5, new vqq(cls5, Boolean.FALSE));
        Class cls6 = Float.TYPE;
        j0(concurrentHashMap, String.class, cls6, new vqq(cls6, Float.valueOf(0.0f)));
        Class cls7 = Double.TYPE;
        j0(concurrentHashMap, String.class, cls7, new vqq(cls7, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT)));
        Class cls8 = Byte.TYPE;
        j0(concurrentHashMap, String.class, cls8, new vqq(cls8, (byte) 0));
        Class cls9 = Short.TYPE;
        j0(concurrentHashMap, String.class, cls9, new vqq(cls9, (short) 0));
        Class cls10 = Integer.TYPE;
        j0(concurrentHashMap, String.class, cls10, new vqq(cls10, 0));
        Class cls11 = Long.TYPE;
        j0(concurrentHashMap, String.class, cls11, new vqq(cls11, 0L));
        j0(concurrentHashMap, String.class, Character.class, new vqq(Character.class, null));
        j0(concurrentHashMap, String.class, cls, new vqq(cls, null));
        j0(concurrentHashMap, String.class, Double.class, new vqq(Double.class, null));
        j0(concurrentHashMap, String.class, Float.class, new vqq(Float.class, null));
        j0(concurrentHashMap, String.class, Byte.class, new vqq(Byte.class, null));
        j0(concurrentHashMap, String.class, Short.class, new vqq(Short.class, null));
        j0(concurrentHashMap, String.class, Integer.class, new vqq(Integer.class, null));
        j0(concurrentHashMap, String.class, Long.class, new vqq(Long.class, null));
        j0(concurrentHashMap, String.class, cls3, new vqq(cls3, null));
        j0(concurrentHashMap, String.class, cls2, new vqq(cls2, null));
        j0(concurrentHashMap, String.class, Number.class, new vqq(cls3, null));
        j0(concurrentHashMap, String.class, Collection.class, new vqq(Collection.class, null));
        j0(concurrentHashMap, String.class, List.class, new vqq(List.class, null));
        j0(concurrentHashMap, String.class, JSONArray.class, new vqq(JSONArray.class, null));
        j0(concurrentHashMap, cls, cls5, new k2a() { // from class: tb.ygk
            @Override // tb.k2a
            public final Object apply(Object obj) {
                return obj;
            }
        });
        j0(concurrentHashMap, String.class, UUID.class, new k2a() { // from class: tb.jhk
            @Override // tb.k2a
            public final Object apply(Object obj) {
                Object N;
                N = ObjectReaderProvider.N(obj);
                return N;
            }
        });
        return concurrentHashMap;
    }

    public final void A(f79 f79Var, JSONField jSONField) {
        if (jSONField != null) {
            String name = jSONField.name();
            if (!name.isEmpty()) {
                f79Var.f19065a = name;
            }
            String format = jSONField.format();
            if (!format.isEmpty()) {
                String trim = format.trim();
                if (trim.indexOf(84) != -1 && !trim.contains("'T'")) {
                    trim = trim.replaceAll("T", "'T'");
                }
                f79Var.b = trim;
            }
            String label = jSONField.label();
            if (!label.isEmpty()) {
                f79Var.c = label.trim();
            }
            String defaultValue = jSONField.defaultValue();
            if (!defaultValue.isEmpty()) {
                f79Var.k = defaultValue;
            }
            String locale = jSONField.locale();
            if (!locale.isEmpty()) {
                String[] split = locale.split("_");
                if (split.length == 2) {
                    f79Var.l = new Locale(split[0], split[1]);
                }
            }
            String[] alternateNames = jSONField.alternateNames();
            if (alternateNames.length != 0) {
                if (f79Var.g == null) {
                    f79Var.g = alternateNames;
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Collections.addAll(linkedHashSet, alternateNames);
                    linkedHashSet.addAll(Arrays.asList(f79Var.g));
                    f79Var.g = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                }
            }
            if (!f79Var.f) {
                f79Var.f = !jSONField.deserialize();
            }
            for (JSONReader.Feature feature : jSONField.deserializeFeatures()) {
                f79Var.e |= feature.mask;
            }
            int ordinal = jSONField.ordinal();
            if (ordinal != 0) {
                f79Var.d = ordinal;
            }
            if (jSONField.value()) {
                f79Var.e |= f79.VALUE_MASK;
            }
            if (jSONField.unwrapped()) {
                f79Var.e |= f79.UNWRAPPED_MASK;
            }
            jSONField.required();
            Class<?> deserializeUsing = jSONField.deserializeUsing();
            if (jdk.class.isAssignableFrom(deserializeUsing)) {
                f79Var.i = deserializeUsing;
            }
        }
    }

    public void B(f79 f79Var, Class cls, Constructor constructor, int i, Annotation[][] annotationArr) {
        Class cls2;
        Constructor constructor2;
        Annotation[] annotationArr2 = null;
        if (!(cls == null || (cls2 = (Class) ((ConcurrentHashMap) this.d).get(cls)) == null || cls2 == cls)) {
            try {
                constructor2 = cls2.getDeclaredConstructor(constructor.getParameterTypes());
            } catch (NoSuchMethodException unused) {
                constructor2 = null;
            }
            if (constructor2 != null) {
                e0(f79Var, constructor2.getParameterAnnotations()[i]);
            }
        }
        if (annotationArr == null) {
            annotationArr = constructor.getParameterAnnotations();
        }
        if (annotationArr.length != constructor.getParameterTypes().length) {
            i--;
        }
        if (i >= 0 && i < annotationArr.length) {
            annotationArr2 = annotationArr[i];
        }
        if (annotationArr2 != null && annotationArr2.length > 0) {
            e0(f79Var, annotationArr2);
        }
    }

    public void C(f79 f79Var, Class cls, Field field) {
        Class cls2;
        Field field2;
        if (!(cls == null || (cls2 = (Class) ((ConcurrentHashMap) this.d).get(cls)) == null || cls2 == cls)) {
            try {
                field2 = cls2.getDeclaredField(field.getName());
            } catch (Exception unused) {
                field2 = null;
            }
            if (field2 != null) {
                C(f79Var, cls2, field2);
            }
        }
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations.length > 0) {
            e0(f79Var, declaredAnnotations);
        }
    }

    public void E(f79 f79Var, Class cls, Method method, int i) {
        Class cls2;
        Method method2;
        if (!(cls == null || (cls2 = (Class) ((ConcurrentHashMap) this.d).get(cls)) == null || cls2 == cls)) {
            try {
                method2 = cls2.getMethod(method.getName(), method.getParameterTypes());
            } catch (NoSuchMethodException unused) {
                method2 = null;
            }
            if (method2 != null) {
                e0(f79Var, method2.getParameterAnnotations()[i]);
            }
        }
        e0(f79Var, method.getParameterAnnotations()[i]);
    }

    public Class F(Class cls) {
        return (Class) ((ConcurrentHashMap) this.d).get(cls);
    }

    public jdk G(long j2) {
        a aVar = j;
        if (aVar != null) {
            if (aVar.f2469a == j2) {
                return aVar.b;
            }
            int i = aVar.c;
            aVar.c = i + 1;
            if (i > 16) {
                j = null;
            }
        }
        jdk jdkVar = (jdk) ((ConcurrentHashMap) this.c).get(new Long(j2));
        if (jdkVar != null && j == null) {
            j = new a(j2, jdkVar);
        }
        return jdkVar;
    }

    public jdk H(String str, Class<?> cls, long j2) {
        boolean z;
        Class<?> t = t(str, cls, j2);
        if (t == null) {
            return null;
        }
        if ((j2 & JSONReader.Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        jdk J = J(t, z);
        if (t != cls) {
            i0(ls9.a(str), J);
        }
        return J;
    }

    public jdk I(Type type) {
        return J(type, false);
    }

    public jdk J(Type type, boolean z) {
        jdk jdkVar;
        jdk J;
        jdk J2;
        jdk jdkVar2;
        ConcurrentHashMap concurrentHashMap;
        if (type == null) {
            type = Object.class;
        }
        ConcurrentMap<Type, jdk> concurrentMap = this.f2468a;
        ConcurrentMap<Type, jdk> concurrentMap2 = this.b;
        if (z) {
            jdkVar = (jdk) ((ConcurrentHashMap) concurrentMap2).get(type);
        } else {
            jdkVar = (jdk) ((ConcurrentHashMap) concurrentMap).get(type);
        }
        boolean z2 = true;
        if (jdkVar == null && (type instanceof WildcardType)) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                Type type2 = upperBounds[0];
                if (z) {
                    concurrentHashMap = (ConcurrentHashMap) concurrentMap2;
                } else {
                    concurrentHashMap = (ConcurrentHashMap) concurrentMap;
                }
                jdkVar = (jdk) concurrentHashMap.get(type2);
            }
        }
        if (jdkVar != null) {
            return jdkVar;
        }
        jdk K = K(type);
        if (K != null) {
            if (z) {
                jdkVar2 = (jdk) ((ConcurrentHashMap) concurrentMap2).put(type, K);
            } else {
                jdkVar2 = (jdk) ((ConcurrentHashMap) concurrentMap).put(type, K);
            }
            if (jdkVar2 != null) {
                return jdkVar2;
            }
            return K;
        }
        if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            if (bounds.length > 0) {
                Type type3 = bounds[0];
                if ((type3 instanceof Class) && (J2 = J(type3, z)) != null) {
                    jdk L = L(z, type, J2);
                    if (L != null) {
                        return L;
                    }
                    return J2;
                }
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType instanceof Class) {
                Class cls = (Class) rawType;
                Class cls2 = cls;
                while (true) {
                    if (cls2 == Object.class) {
                        z2 = false;
                        break;
                    } else if (cls2.getTypeParameters().length > 0) {
                        break;
                    } else {
                        cls2 = cls2.getSuperclass();
                    }
                }
                if ((actualTypeArguments.length == 0 || !z2) && (J = J(cls, z)) != null) {
                    jdk L2 = L(z, type, J);
                    if (L2 != null) {
                        return L2;
                    }
                    return J;
                }
            }
        }
        jdk s = x().s(TypeUtils.m(type), type, z, this);
        jdk L3 = L(z, type, s);
        if (L3 != null) {
            return L3;
        }
        return s;
    }

    public final jdk L(boolean z, Type type, jdk jdkVar) {
        if (z) {
            return (jdk) ((ConcurrentHashMap) this.b).put(type, jdkVar);
        }
        return (jdk) ((ConcurrentHashMap) this.f2468a).put(type, jdkVar);
    }

    public k2a M(Type type, Type type2) {
        ConcurrentMap<Type, Map<Type, k2a>> concurrentMap = this.f;
        if (concurrentMap == null) {
            concurrentMap = s();
            this.f = concurrentMap;
        }
        Map<Type, k2a> map = concurrentMap.get(type);
        if (map == null) {
            return null;
        }
        return map.get(type2);
    }

    public final void e0(f79 f79Var, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.t(annotation, JSONField.class);
            if (jSONField != null) {
                A(f79Var, jSONField);
                if (jSONField == annotation) {
                }
            }
            if (annotationType.getName().equals("com.alibaba.fastjson.annotation.JSONField")) {
                f0(f79Var, annotation);
            }
        }
    }

    public final void f0(final f79 f79Var, final Annotation annotation) {
        BeanUtils.e(annotation.getClass(), new nk4() { // from class: tb.fhk
            @Override // tb.nk4
            public final void accept(Object obj) {
                ObjectReaderProvider.c0(annotation, f79Var, (Method) obj);
            }
        });
    }

    public final void g0(e62 e62Var, Class<?> cls) {
        Class<?> cls2 = (Class) ((ConcurrentHashMap) this.d).get(cls);
        if (!(cls2 == null || cls2 == cls)) {
            e62Var.getClass();
            h0(e62Var, cls2.getDeclaredAnnotations());
        }
        h0(e62Var, cls.getDeclaredAnnotations());
    }

    public final void h0(final e62 e62Var, Annotation[] annotationArr) {
        for (final Annotation annotation : annotationArr) {
            BeanUtils.e(annotation.annotationType(), new nk4() { // from class: tb.phk
                @Override // tb.nk4
                public final void accept(Object obj) {
                    ObjectReaderProvider.d0(annotation, e62Var, (Method) obj);
                }
            });
        }
    }

    public void i0(long j2, jdk jdkVar) {
        ((ConcurrentHashMap) this.c).put(Long.valueOf(j2), jdkVar);
    }

    public final void r(String str, Class cls) {
        synchronized (this.e) {
            this.e.put(str, new Date());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
        u(r10, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(final tb.e62 r10, final java.lang.Class<?> r11) {
        /*
            r9 = this;
            r0 = 1
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r1 = r9.d
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r11)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONType> r2 = com.alibaba.fastjson2.annotation.JSONType.class
            r3 = 0
            if (r1 == 0) goto L_0x003a
            if (r1 == r11) goto L_0x003a
            r10.getClass()
            java.lang.annotation.Annotation[] r4 = r1.getDeclaredAnnotations()
            int r5 = r4.length
            r6 = 0
        L_0x001b:
            if (r6 >= r5) goto L_0x002a
            r7 = r4[r6]
            java.lang.Class r8 = r7.annotationType()
            if (r8 != r2) goto L_0x0028
            r9.v(r10, r7)
        L_0x0028:
            int r6 = r6 + r0
            goto L_0x001b
        L_0x002a:
            tb.ghk r4 = new tb.ghk
            r4.<init>()
            com.alibaba.fastjson2.util.BeanUtils.k0(r1, r4)
            tb.hhk r4 = new tb.hhk
            r4.<init>()
            com.alibaba.fastjson2.util.BeanUtils.l(r1, r4)
        L_0x003a:
            java.lang.Class r1 = r11.getSuperclass()
            r4 = 0
        L_0x003f:
            if (r1 == 0) goto L_0x0067
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            if (r1 == r5) goto L_0x0067
            java.lang.Class<java.lang.Enum> r5 = java.lang.Enum.class
            if (r1 != r5) goto L_0x004a
            goto L_0x0067
        L_0x004a:
            tb.e62 r5 = new tb.e62
            r5.<init>()
            r9.u(r5, r1)
            java.lang.Class[] r5 = r5.f
            if (r5 == 0) goto L_0x0062
            int r6 = r5.length
            r7 = 0
        L_0x0058:
            if (r7 >= r6) goto L_0x0061
            r8 = r5[r7]
            if (r8 != r11) goto L_0x005f
            goto L_0x0062
        L_0x005f:
            int r7 = r7 + r0
            goto L_0x0058
        L_0x0061:
            r4 = r1
        L_0x0062:
            java.lang.Class r1 = r1.getSuperclass()
            goto L_0x003f
        L_0x0067:
            if (r4 == 0) goto L_0x006c
            r9.u(r10, r4)
        L_0x006c:
            java.lang.annotation.Annotation[] r1 = r11.getDeclaredAnnotations()
            int r4 = r1.length
            r5 = 0
        L_0x0072:
            if (r5 >= r4) goto L_0x0081
            r6 = r1[r5]
            java.lang.Class r7 = r6.annotationType()
            if (r7 != r2) goto L_0x007f
            r9.v(r10, r6)
        L_0x007f:
            int r5 = r5 + r0
            goto L_0x0072
        L_0x0081:
            int r2 = r1.length
        L_0x0082:
            if (r3 >= r2) goto L_0x00a8
            r4 = r1[r3]
            java.lang.Class r5 = r4.annotationType()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "kotlin.Metadata"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x00a4
            java.lang.String r6 = "com.alibaba.fastjson.annotation.JSONType"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x00a0
            goto L_0x00a6
        L_0x00a0:
            r9.v(r10, r4)
            goto L_0x00a6
        L_0x00a4:
            r10.t = r0
        L_0x00a6:
            int r3 = r3 + r0
            goto L_0x0082
        L_0x00a8:
            tb.ihk r0 = new tb.ihk
            r0.<init>()
            com.alibaba.fastjson2.util.BeanUtils.k0(r11, r0)
            tb.khk r0 = new tb.khk
            r0.<init>()
            com.alibaba.fastjson2.util.BeanUtils.l(r11, r0)
            java.lang.reflect.Constructor r0 = r10.i
            if (r0 != 0) goto L_0x00d6
            long r0 = r10.m
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00d6
            boolean r0 = r10.t
            if (r0 == 0) goto L_0x00d6
            com.alibaba.fastjson2.util.BeanUtils.E(r11, r10)
            java.lang.String[] r11 = com.alibaba.fastjson2.util.BeanUtils.F(r11)
            r10.l = r11
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderProvider.u(tb.e62, java.lang.Class):void");
    }

    public void v(final e62 e62Var, final Annotation annotation) {
        BeanUtils.e(annotation.getClass(), new nk4() { // from class: tb.nhk
            @Override // tb.nk4
            public final void accept(Object obj) {
                ObjectReaderProvider.this.S(annotation, e62Var, (Method) obj);
            }
        });
    }

    public final void w(final e62 e62Var, final Class<?> cls, final Annotation annotation, Class<? extends Annotation> cls2) {
        BeanUtils.e(cls2, new nk4() { // from class: tb.ohk
            @Override // tb.nk4
            public final void accept(Object obj) {
                ObjectReaderProvider.T(annotation, e62Var, cls, (Method) obj);
            }
        });
    }

    public rdk x() {
        return this.g;
    }

    /* renamed from: y */
    public final void R(final e62 e62Var, Class<?> cls, Constructor constructor) {
        Annotation[] declaredAnnotations;
        Constructor<?> constructor2;
        if (!cls.isEnum()) {
            boolean z = false;
            for (final Annotation annotation : constructor.getDeclaredAnnotations()) {
                Class<? extends Annotation> annotationType = annotation.annotationType();
                JSONCreator jSONCreator = (JSONCreator) BeanUtils.t(annotation, JSONCreator.class);
                if (jSONCreator != null) {
                    String[] parameterNames = jSONCreator.parameterNames();
                    if (parameterNames.length != 0) {
                        e62Var.l = parameterNames;
                    }
                    z = true;
                    if (jSONCreator == annotation) {
                    }
                }
                String name = annotationType.getName();
                if (name.equals("com.alibaba.fastjson.annotation.JSONCreator") || name.equals("com.alibaba.fastjson2.annotation.JSONCreator")) {
                    BeanUtils.e(annotationType, new nk4() { // from class: tb.lhk
                        @Override // tb.nk4
                        public final void accept(Object obj) {
                            ObjectReaderProvider.U(annotation, e62Var, (Method) obj);
                        }
                    });
                    z = true;
                }
            }
            if (z) {
                try {
                    constructor2 = cls.getDeclaredConstructor(constructor.getParameterTypes());
                } catch (NoSuchMethodException unused) {
                    constructor2 = null;
                }
                if (constructor2 != null) {
                    e62Var.i = constructor2;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final /* synthetic */ void S(Annotation annotation, e62 e62Var, Method method) {
        char c;
        char c2;
        String name = method.getName();
        int i = 0;
        try {
            Object invoke = method.invoke(annotation, new Object[0]);
            switch (name.hashCode()) {
                case -1678076717:
                    if (name.equals("deserializer")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1073807344:
                    if (name.equals("parseFeatures")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1052827512:
                    if (name.equals("naming")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1008770331:
                    if (name.equals("orders")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -853109563:
                    if (name.equals("typeKey")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -676507419:
                    if (name.equals("typeName")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -618447321:
                    if (name.equals("seeAlsoDefault")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -432515134:
                    if (name.equals("autoTypeBeforeHandler")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 230944667:
                    if (name.equals("builder")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1053501509:
                    if (name.equals("deserializeUsing")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1401959644:
                    if (name.equals("deserializeFeatures")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1706529099:
                    if (name.equals("autoTypeCheckHandler")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1752415457:
                    if (name.equals(TSRecmdReqPrefetch.PREFETCH_PARAMS_IGNORE)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1970571962:
                    if (name.equals("seeAlso")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    Class<?>[] clsArr = (Class[]) invoke;
                    if (clsArr.length != 0) {
                        e62Var.f = clsArr;
                        e62Var.g = new String[clsArr.length];
                        while (i < clsArr.length) {
                            Class<?> cls = clsArr[i];
                            e62 e62Var2 = new e62();
                            g0(e62Var2, cls);
                            String str = e62Var2.b;
                            if (str == null || str.isEmpty()) {
                                str = cls.getSimpleName();
                            }
                            e62Var.g[i] = str;
                            i++;
                        }
                        e62Var.m |= JSONReader.Feature.SupportAutoType.mask;
                        return;
                    }
                    return;
                case 1:
                    Class cls2 = (Class) invoke;
                    if (cls2 != Void.class) {
                        e62Var.h = cls2;
                        break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    String str2 = (String) invoke;
                    if (!str2.isEmpty()) {
                        e62Var.b = str2;
                        return;
                    }
                    return;
                case 4:
                    e62Var.p = ((Enum) invoke).name();
                    return;
                case 5:
                    String[] strArr = (String[]) invoke;
                    if (strArr.length > 0) {
                        e62Var.q = strArr;
                        return;
                    }
                    return;
                case 6:
                    String[] strArr2 = (String[]) invoke;
                    if (strArr2.length != 0) {
                        e62Var.r = strArr2;
                        return;
                    }
                    return;
                case 7:
                    Class cls3 = (Class) invoke;
                    if (jdk.class.isAssignableFrom(cls3)) {
                        e62Var.v = cls3;
                        return;
                    }
                    return;
                case '\b':
                    for (Enum r1 : (Enum[]) invoke) {
                        String name2 = r1.name();
                        switch (name2.hashCode()) {
                            case -1604251670:
                                if (name2.equals("TrimStringFieldValue")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -894003883:
                                if (name2.equals("SupportArrayToBean")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -200815016:
                                if (name2.equals("SupportAutoType")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2005790178:
                                if (name2.equals("InitStringFieldAsEmpty")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 == 0) {
                            e62Var.m |= JSONReader.Feature.SupportAutoType.mask;
                        } else if (c2 == 1) {
                            e62Var.m |= JSONReader.Feature.SupportArrayToBean.mask;
                        } else if (c2 == 2) {
                            e62Var.m |= JSONReader.Feature.InitStringFieldAsEmpty.mask;
                        }
                    }
                    return;
                case '\t':
                    JSONReader.Feature[] featureArr = (JSONReader.Feature[]) invoke;
                    while (i < featureArr.length) {
                        e62Var.m |= featureArr[i].mask;
                        i++;
                    }
                    return;
                case '\n':
                    Class<?> cls4 = (Class) invoke;
                    if (!(cls4 == Void.TYPE || cls4 == Void.class)) {
                        e62Var.c = cls4;
                        Annotation[] declaredAnnotations = cls4.getDeclaredAnnotations();
                        int length = declaredAnnotations.length;
                        while (i < length) {
                            Annotation annotation2 = declaredAnnotations[i];
                            Class<? extends Annotation> annotationType = annotation2.annotationType();
                            if (annotationType.getName().equals("com.alibaba.fastjson.annotation.JSONPOJOBuilder")) {
                                w(e62Var, cls4, annotation2, annotationType);
                            } else {
                                JSONBuilder jSONBuilder = (JSONBuilder) BeanUtils.u(cls4, JSONBuilder.class);
                                if (jSONBuilder != null) {
                                    e62Var.d = BeanUtils.g(cls4, jSONBuilder.buildMethod());
                                    String withPrefix = jSONBuilder.withPrefix();
                                    if (!withPrefix.isEmpty()) {
                                        e62Var.e = withPrefix;
                                    }
                                }
                            }
                            i++;
                        }
                        if (e62Var.d == null) {
                            e62Var.d = BeanUtils.g(cls4, CartRecommendRefreshScene.build);
                        }
                        if (e62Var.d == null) {
                            e62Var.d = BeanUtils.g(cls4, "create");
                            return;
                        }
                        return;
                    }
                    return;
                case 11:
                    Class cls5 = (Class) invoke;
                    if (jdk.class.isAssignableFrom(cls5)) {
                        e62Var.v = cls5;
                        return;
                    }
                    return;
                case '\f':
                case '\r':
                    Class<? extends JSONReader.a> cls6 = (Class) invoke;
                    if (JSONReader.a.class.isAssignableFrom(cls6)) {
                        e62Var.A = cls6;
                        return;
                    }
                    return;
                default:
                    return;
            }
            String str3 = (String) invoke;
            if (!str3.isEmpty()) {
                e62Var.f18305a = str3;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: z */
    public final void Q(final e62 e62Var, Class<?> cls, Method method) {
        boolean z = true;
        if (method.getDeclaringClass() != Enum.class) {
            String name = method.getName();
            if (!cls.isEnum() || !name.equals(pg1.ATOM_values)) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                int length = declaredAnnotations.length;
                Method method2 = null;
                int i = 0;
                JSONCreator jSONCreator = null;
                boolean z2 = false;
                while (i < length) {
                    final Annotation annotation = declaredAnnotations[i];
                    Class<? extends Annotation> annotationType = annotation.annotationType();
                    JSONCreator jSONCreator2 = (JSONCreator) BeanUtils.t(annotation, JSONCreator.class);
                    if (jSONCreator2 != annotation && annotationType.getName().equals("com.alibaba.fastjson.annotation.JSONCreator")) {
                        BeanUtils.e(annotationType, new nk4() { // from class: tb.mhk
                            @Override // tb.nk4
                            public final void accept(Object obj) {
                                ObjectReaderProvider.V(annotation, e62Var, (Method) obj);
                            }
                        });
                        z2 = true;
                    }
                    i++;
                    jSONCreator = jSONCreator2;
                }
                if (jSONCreator != null) {
                    String[] parameterNames = jSONCreator.parameterNames();
                    if (parameterNames.length != 0) {
                        e62Var.l = parameterNames;
                    }
                } else {
                    z = z2;
                }
                if (z) {
                    try {
                        method2 = cls.getDeclaredMethod(name, method.getParameterTypes());
                    } catch (NoSuchMethodException unused) {
                    }
                    if (method2 != null) {
                        e62Var.k = method2;
                    }
                }
            }
        }
    }

    public static /* synthetic */ Object N(Object obj) {
        if (obj == null || "null".equals(obj) || "".equals(obj)) {
            return null;
        }
        return UUID.fromString((String) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final jdk K(Type type) {
        String str;
        Type type2;
        char c;
        Class<?> cls;
        Class<?> cls2;
        Class cls3;
        Class<?> cls4;
        Class<?> cls5;
        Class cls6;
        if (type == String.class || type == CharSequence.class) {
            return qgk.b;
        }
        if (type == Character.TYPE || type == Character.class) {
            return cek.b;
        }
        if (type == Boolean.TYPE || type == Boolean.class) {
            return ydk.b;
        }
        if (type == Byte.TYPE || type == Byte.class) {
            return zdk.b;
        }
        if (type == Short.TYPE || type == Short.class) {
            return pgk.b;
        }
        Class<?> cls7 = Integer.TYPE;
        if (type == cls7 || type == Integer.class) {
            return dfk.b;
        }
        if (type == Long.TYPE || type == Long.class) {
            return yek.b;
        }
        if (type == Float.TYPE || type == Float.class) {
            return mek.b;
        }
        if (type == Double.TYPE || type == Double.class) {
            return gek.b;
        }
        if (type == BigInteger.class) {
            return wdk.b;
        }
        if (type == BigDecimal.class) {
            return vdk.c;
        }
        if (type == Number.class) {
            return mgk.b;
        }
        if (type == UUID.class) {
            return sgk.b;
        }
        if (type == AtomicBoolean.class) {
            return new pek(AtomicBoolean.class, new k2a() { // from class: tb.qhk
                @Override // tb.k2a
                public final Object apply(Object obj) {
                    return new AtomicBoolean(((Boolean) obj).booleanValue());
                }
            });
        }
        if (type == URI.class) {
            return new sek(URI.class, new k2a() { // from class: tb.whk
                @Override // tb.k2a
                public final Object apply(Object obj) {
                    return URI.create((String) obj);
                }
            });
        }
        if (type == Charset.class) {
            return new sek(Charset.class, new k2a() { // from class: tb.xhk
                @Override // tb.k2a
                public final Object apply(Object obj) {
                    Charset forName;
                    forName = Charset.forName((String) obj);
                    return forName;
                }
            });
        }
        if (type == File.class) {
            return new sek(File.class, new k2a() { // from class: tb.zgk
                @Override // tb.k2a
                public final Object apply(Object obj) {
                    File X;
                    X = ObjectReaderProvider.X((String) obj);
                    return X;
                }
            });
        }
        if (type == URL.class) {
            return new sek(URL.class, new k2a() { // from class: tb.ahk
                @Override // tb.k2a
                public final Object apply(Object obj) {
                    URL Y;
                    Y = ObjectReaderProvider.Y((String) obj);
                    return Y;
                }
            });
        }
        if (type == Pattern.class) {
            return new sek(Pattern.class, new k2a() { // from class: tb.bhk
                @Override // tb.k2a
                public final Object apply(Object obj) {
                    return Pattern.compile((String) obj);
                }
            });
        }
        if (type == SimpleDateFormat.class) {
            return new sek(SimpleDateFormat.class, new k2a() { // from class: tb.vhk
                @Override // tb.k2a
                public final Object apply(Object obj) {
                    return new SimpleDateFormat((String) obj);
                }
            });
        }
        if (type == Class.class) {
            return dek.b;
        }
        if (type == Method.class) {
            return new lgk();
        }
        if (type == Field.class) {
            return new lek();
        }
        if (type == Type.class) {
            return dek.b;
        }
        boolean z = type instanceof Class;
        if (z) {
            str = ((Class) type).getName();
        } else {
            str = "";
        }
        if (type == Map.class || type == AbstractMap.class) {
            return ggk.c(null, (Class) type, 0L);
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return k0((Class) type, ConcurrentHashMap.class, null, Object.class);
        }
        if (type == ConcurrentNavigableMap.class || type == ConcurrentSkipListMap.class) {
            return k0((Class) type, ConcurrentSkipListMap.class, null, Object.class);
        }
        if (type == SortedMap.class || type == NavigableMap.class || type == TreeMap.class) {
            return k0((Class) type, TreeMap.class, null, Object.class);
        }
        if (type == Calendar.class) {
            return aek.l;
        }
        if (type == Date.class) {
            return fek.INSTANCE;
        }
        if (type == Locale.class) {
            return cgk.b;
        }
        if (type == Currency.class) {
            return eek.b;
        }
        if (type == wqx.class) {
            return new sek(wqx.class, new k2a() { // from class: tb.chk
                @Override // tb.k2a
                public final Object apply(Object obj) {
                    wqx c2;
                    c2 = wqx.c((String) obj);
                    return c2;
                }
            });
        }
        if (type == TimeZone.class) {
            return new sek(TimeZone.class, new k2a() { // from class: tb.dhk
                @Override // tb.k2a
                public final Object apply(Object obj) {
                    TimeZone timeZone;
                    timeZone = TimeZone.getTimeZone((String) obj);
                    return timeZone;
                }
            });
        }
        if (type == char[].class) {
            return bek.b;
        }
        if (type == float[].class) {
            return oek.b;
        }
        if (type == double[].class) {
            return iek.b;
        }
        if (type == boolean[].class) {
            return xdk.b;
        }
        if (type == byte[].class) {
            return cfk.b;
        }
        if (type == short[].class) {
            return vek.b;
        }
        if (type == int[].class) {
            return xek.c;
        }
        if (type == long[].class) {
            return afk.c;
        }
        if (type == Byte[].class) {
            return bfk.c;
        }
        if (type == Short[].class) {
            return uek.b;
        }
        if (type == Integer[].class) {
            return wek.b;
        }
        if (type == Long[].class) {
            return zek.b;
        }
        if (type == Float[].class) {
            return nek.b;
        }
        if (type == Double[].class) {
            return hek.b;
        }
        if (type == Number[].class) {
            return ngk.b;
        }
        if (type == String[].class) {
            return rgk.b;
        }
        if (type == AtomicInteger.class) {
            return new qek(AtomicInteger.class, new ehk());
        }
        if (type == AtomicLong.class) {
            return new rek(AtomicLong.class, new rhk());
        }
        if (type == AtomicIntegerArray.class) {
            return new xek(AtomicIntegerArray.class, new k2a() { // from class: tb.shk
                @Override // tb.k2a
                public final Object apply(Object obj) {
                    return new AtomicIntegerArray((int[]) obj);
                }
            });
        }
        if (type == AtomicLongArray.class) {
            return new afk(AtomicLongArray.class, new k2a() { // from class: tb.thk
                @Override // tb.k2a
                public final Object apply(Object obj) {
                    return new AtomicLongArray((long[]) obj);
                }
            });
        }
        if (type == AtomicReference.class) {
            return udk.c;
        }
        if (type instanceof jbj) {
            new rck((jbj) type);
            throw null;
        } else if (type instanceof g3i) {
            new igk((g3i) type);
            throw null;
        } else if (type == StringBuffer.class || type == StringBuilder.class) {
            try {
                Class cls8 = (Class) type;
                return new tgk(cls8, String.class, String.class, 0L, null, null, cls8.getConstructor(String.class), null, null);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        } else if (type == Iterable.class || type == Collection.class || type == List.class || type == AbstractCollection.class || type == AbstractList.class || type == ArrayList.class) {
            return xfk.S(type, null, 0L);
        } else {
            if (type == Queue.class || type == Deque.class || type == AbstractSequentialList.class || type == LinkedList.class) {
                return xfk.S(type, null, 0L);
            }
            if (type == Set.class || type == AbstractSet.class || type == EnumSet.class) {
                return xfk.S(type, null, 0L);
            }
            if (type == NavigableSet.class || type == SortedSet.class) {
                return xfk.S(type, null, 0L);
            }
            if (type == ConcurrentLinkedQueue.class || type == ConcurrentSkipListSet.class || type == LinkedHashSet.class || type == HashSet.class || type == TreeSet.class || type == CopyOnWriteArrayList.class) {
                return xfk.S(type, null, 0L);
            }
            if (type == xfk.k || type == xfk.l || type == xfk.m || type == xfk.n || type == xfk.o || type == xfk.p || type == xfk.q || type == xfk.r) {
                return xfk.S(type, null, 0L);
            }
            if (type == TypeUtils.CLASS_SINGLE_SET) {
                return xfk.S(type, null, 0L);
            }
            if (type == Object.class || type == Cloneable.class || type == Closeable.class || type == Serializable.class || type == Comparable.class) {
                return ogk.INSTANCE;
            }
            if (type == Map.Entry.class) {
                return new hgk(null, null);
            }
            if (z) {
                Class cls9 = (Class) type;
                if (Map.class.isAssignableFrom(cls9)) {
                    return ggk.c(null, cls9, 0L);
                }
                type2 = ConcurrentLinkedQueue.class;
                if (Collection.class.isAssignableFrom(cls9)) {
                    return xfk.S(cls9, cls9, 0L);
                }
                if (!cls9.isArray()) {
                    rdk rdkVar = JSONFactory.defaultObjectReaderProvider.g;
                    if (cls9 == StackTraceElement.class) {
                        try {
                            return rdkVar.u(cls9.getConstructor(String.class, String.class, String.class, cls7), "className", FluidException.METHOD_NAME, "fileName", pg1.ATOM_lineNumber);
                        } catch (Throwable unused) {
                        }
                    }
                } else if (cls9.getComponentType() == Object.class) {
                    return qck.INSTANCE;
                } else {
                    return new sck(cls9);
                }
            } else {
                type2 = ConcurrentLinkedQueue.class;
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type rawType = parameterizedType.getRawType();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments.length == 2) {
                    Type type3 = actualTypeArguments[0];
                    Type type4 = actualTypeArguments[1];
                    if (rawType == Map.class || rawType == AbstractMap.class || rawType == HashMap.class) {
                        return k0((Class) rawType, HashMap.class, type3, type4);
                    }
                    if (rawType == ConcurrentMap.class || rawType == ConcurrentHashMap.class) {
                        return k0((Class) rawType, ConcurrentHashMap.class, type3, type4);
                    }
                    if (rawType == ConcurrentNavigableMap.class || rawType == ConcurrentSkipListMap.class) {
                        return k0((Class) rawType, ConcurrentSkipListMap.class, type3, type4);
                    }
                    if (rawType == LinkedHashMap.class || rawType == TreeMap.class) {
                        Class cls10 = (Class) rawType;
                        return k0(cls10, cls10, type3, type4);
                    } else if (rawType == Map.Entry.class) {
                        return new hgk(type3, type4);
                    }
                }
                if (actualTypeArguments.length == 1) {
                    Type type5 = actualTypeArguments[0];
                    Class<?> m = TypeUtils.m(type5);
                    if (rawType == Iterable.class || rawType == Collection.class || rawType == List.class || rawType == AbstractCollection.class || rawType == AbstractList.class) {
                        cls2 = String.class;
                        cls = Long.class;
                        cls3 = ArrayList.class;
                    } else {
                        cls3 = ArrayList.class;
                        if (rawType == cls3) {
                            cls2 = String.class;
                            cls = Long.class;
                        } else {
                            if (rawType == Queue.class || rawType == Deque.class || rawType == AbstractSequentialList.class) {
                                cls5 = String.class;
                                cls4 = Long.class;
                                cls6 = LinkedList.class;
                            } else {
                                cls6 = LinkedList.class;
                                if (rawType == cls6) {
                                    cls5 = String.class;
                                    cls4 = Long.class;
                                } else if (rawType == Set.class || rawType == AbstractSet.class || rawType == EnumSet.class) {
                                    if (m == String.class) {
                                        return new bgk((Class) rawType, HashSet.class);
                                    }
                                    if (m == Long.class) {
                                        return new yfk((Class) rawType, HashSet.class);
                                    }
                                    return xfk.S(type, null, 0L);
                                } else if (rawType == NavigableSet.class || rawType == SortedSet.class) {
                                    if (type5 == String.class) {
                                        return new bgk((Class) rawType, TreeSet.class);
                                    }
                                    if (m == Long.class) {
                                        return new yfk((Class) rawType, TreeSet.class);
                                    }
                                    return xfk.S(type, null, 0L);
                                } else if (rawType == type2 || rawType == ConcurrentSkipListSet.class || rawType == LinkedHashSet.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == CopyOnWriteArrayList.class) {
                                    if (type5 == String.class) {
                                        Class cls11 = (Class) rawType;
                                        return new bgk(cls11, cls11);
                                    } else if (m != Long.class) {
                                        return xfk.S(type, null, 0L);
                                    } else {
                                        Class cls12 = (Class) rawType;
                                        return new yfk(cls12, cls12);
                                    }
                                } else if (rawType == AtomicReference.class) {
                                    return new udk(type5);
                                } else {
                                    if (type5 instanceof WildcardType) {
                                        return K(rawType);
                                    }
                                }
                            }
                            if (m == cls5) {
                                return new bgk((Class) rawType, cls6);
                            }
                            if (m == cls4) {
                                return new yfk((Class) rawType, cls6);
                            }
                            return xfk.S(type, null, 0L);
                        }
                    }
                    if (m == cls2) {
                        return new bgk((Class) rawType, cls3);
                    }
                    if (m == cls) {
                        return new yfk((Class) rawType, cls3);
                    }
                    return xfk.S(type, null, 0L);
                }
                return null;
            } else if (type instanceof GenericArrayType) {
                return new tek((GenericArrayType) type);
            } else {
                if (type instanceof WildcardType) {
                    Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                    if (upperBounds.length == 1) {
                        return K(upperBounds[0]);
                    }
                }
                if (type == ParameterizedType.class) {
                    return zhk.a(iql.class);
                }
                switch (str.hashCode()) {
                    case -1410806254:
                        if (str.equals("java.util.JumboEnumSet")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -720123389:
                        if (str.equals("java.net.InetAddress")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1087757882:
                        if (str.equals("java.sql.Date")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1088242009:
                        if (str.equals("java.sql.Time")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1252880906:
                        if (str.equals("java.sql.Timestamp")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1539653772:
                        if (str.equals("java.text.SimpleDateFormat")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1585284048:
                        if (str.equals("java.net.InetSocketAddress")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1829465637:
                        if (str.equals("java.util.RegularEnumSet")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 7:
                        return xfk.S(type, TypeUtils.i(type), 0L);
                    case 1:
                        return tgk.c((Class) type, String.class, new k2a() { // from class: tb.uhk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                InetAddress b0;
                                b0 = ObjectReaderProvider.b0((String) obj);
                                return b0;
                            }
                        });
                    case 2:
                        return new xtf(null, null);
                    case 3:
                        return new ytf(null, null);
                    case 4:
                        return new auf(null, null);
                    case 5:
                        return tgk.c((Class) type, String.class, new k2a() { // from class: tb.vhk
                            @Override // tb.k2a
                            public final Object apply(Object obj) {
                                return new SimpleDateFormat((String) obj);
                            }
                        });
                    case 6:
                        return new vgk((Class) type);
                    default:
                        return null;
                }
            }
        }
    }

    public void D(f79 f79Var, Class cls, Method method) {
        Annotation[] declaredAnnotations;
        String K;
        String str;
        String str2;
        char charAt;
        char charAt2;
        Class<?>[] interfaces;
        Method method2;
        Method H;
        Method H2;
        String name = method.getName();
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            if (!(superclass == Object.class || superclass == null || (H2 = BeanUtils.H(superclass, method)) == null)) {
                D(f79Var, superclass, H2);
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (!(cls2 == Serializable.class || (H = BeanUtils.H(cls2, method)) == null || superclass == null)) {
                    D(f79Var, superclass, H);
                }
            }
            Class cls3 = (Class) ((ConcurrentHashMap) this.d).get(cls);
            if (!(cls3 == null || cls3 == cls)) {
                try {
                    method2 = cls3.getDeclaredMethod(name, method.getParameterTypes());
                } catch (Exception unused) {
                    method2 = null;
                }
                if (method2 != null) {
                    D(f79Var, cls3, method2);
                }
            }
        }
        String str3 = null;
        for (Annotation annotation : method.getDeclaredAnnotations()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.t(annotation, JSONField.class);
            if (jSONField != null) {
                A(f79Var, jSONField);
                str3 = jSONField.name();
                if (jSONField == annotation) {
                }
            }
            if (annotationType.getName().equals("com.alibaba.fastjson.annotation.JSONField")) {
                f0(f79Var, annotation);
            }
        }
        if (name.startsWith("set", 0)) {
            K = BeanUtils.g0(name, null);
        } else {
            K = BeanUtils.K(name, null);
        }
        if (K.length() <= 1 || (charAt = K.charAt(0)) < 'A' || charAt > 'Z' || (charAt2 = K.charAt(1)) < 'A' || charAt2 > 'Z' || (str3 != null && !str3.isEmpty())) {
            str2 = null;
            str = null;
        } else {
            char[] charArray = K.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            String str4 = new String(charArray);
            charArray[1] = (char) (charArray[1] + ' ');
            str = new String(charArray);
            str2 = str4;
        }
        BeanUtils.B(cls, f79Var, this, K, str2, str);
        if (str2 != null && f79Var.f19065a == null && f79Var.g == null) {
            f79Var.g = new String[]{str2, str};
        }
    }

    public Class<?> t(String str, Class<?> cls, long j2) {
        Class<?> r;
        if (str == null || str.isEmpty()) {
            return null;
        }
        int length = str.length();
        if (length < 192) {
            boolean z = true;
            if (str.charAt(0) == '[') {
                t(str.substring(1), null, j2);
            }
            if (cls == null || !cls.getName().equals(str)) {
                if ((JSONReader.Feature.SupportAutoType.mask & j2) == 0) {
                    z = false;
                }
                long[] jArr = this.h;
                long[] jArr2 = this.i;
                char c = '$';
                long j3 = ls9.MAGIC_HASH_CODE;
                if (z) {
                    long j4 = -3750763034362895579L;
                    int i = 0;
                    while (i < length) {
                        char charAt = str.charAt(i);
                        if (charAt == c) {
                            charAt = '.';
                        }
                        long j5 = (j4 ^ charAt) * ls9.MAGIC_PRIME;
                        if (Arrays.binarySearch(jArr2, j5) < 0 || (r = TypeUtils.r(str)) == null) {
                            if (Arrays.binarySearch(jArr, j5) < 0 || TypeUtils.l(str) != null) {
                                i++;
                                j4 = j5;
                                c = '$';
                            } else {
                                throw new JSONException("autoType is not support. ".concat(str));
                            }
                        } else if (cls == null || cls.isAssignableFrom(r)) {
                            r(str, r);
                            return r;
                        } else {
                            throw new JSONException("type not match. " + str + " -> " + cls.getName());
                        }
                    }
                }
                if (!z) {
                    int i2 = 0;
                    while (i2 < length) {
                        char charAt2 = str.charAt(i2);
                        if (charAt2 == '$') {
                            charAt2 = '.';
                        }
                        long j6 = (j3 ^ charAt2) * ls9.MAGIC_PRIME;
                        if (Arrays.binarySearch(jArr, j6) >= 0) {
                            throw new JSONException("autoType is not support. ".concat(str));
                        } else if (Arrays.binarySearch(jArr2, j6) >= 0) {
                            Class<?> r2 = TypeUtils.r(str);
                            if (r2 == null || cls == null || cls.isAssignableFrom(r2)) {
                                r(str, r2);
                                return r2;
                            }
                            throw new JSONException("type not match. " + str + " -> " + cls.getName());
                        } else {
                            i2++;
                            j3 = j6;
                        }
                    }
                }
                if (!z) {
                    return null;
                }
                Class<?> l = TypeUtils.l(str);
                if (l == null) {
                    Class<?> r3 = TypeUtils.r(str);
                    if (r3 != null) {
                        if (ClassLoader.class.isAssignableFrom(r3) || DataSource.class.isAssignableFrom(r3) || RowSet.class.isAssignableFrom(r3)) {
                            throw new JSONException("autoType is not support. ".concat(str));
                        } else if (cls != null) {
                            if (cls.isAssignableFrom(r3)) {
                                r(str, r3);
                                return r3;
                            } else if ((j2 & JSONReader.Feature.IgnoreAutoTypeNotMatch.mask) != 0) {
                                return cls;
                            } else {
                                throw new JSONException("type not match. " + str + " -> " + cls.getName());
                            }
                        }
                    }
                    r(str, r3);
                    return r3;
                } else if (cls == null || cls == Object.class || l == HashMap.class || cls.isAssignableFrom(l)) {
                    r(str, l);
                    return l;
                } else {
                    throw new JSONException("type not match. " + str + " -> " + cls.getName());
                }
            } else {
                r(str, cls);
                return cls;
            }
        } else {
            throw new JSONException("autoType is not support. ".concat(str));
        }
    }
}
