package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xfk implements jdk {
    public static final Class k = Collections.emptySet().getClass();
    public static final Class l = Collections.emptyList().getClass();
    public static final Class m = Collections.singleton(0).getClass();
    public static final Class n = Collections.singletonList(0).getClass();
    public static final Class o = Arrays.asList(0).getClass();
    public static final Class p = Collections.unmodifiableCollection(Collections.emptyList()).getClass();
    public static final Class q = Collections.unmodifiableList(Collections.emptyList()).getClass();
    public static final Class r = Collections.unmodifiableSet(Collections.emptySet()).getClass();
    public static final xfk s = new xfk(JSONArray.class, JSONArray.class, JSONArray.class, 8893561198416334968L, Object.class, Object.class, null, "Object", 127970252055119L);

    /* renamed from: a  reason: collision with root package name */
    public final Type f31355a;
    public final Class b;
    public final Class c;
    public final Type d;
    public final Class e;
    public final long f;
    public final k2a g;
    public final Object h;
    public jdk i;
    public volatile boolean j;

    public xfk(Class cls, Object obj) {
        this(cls, cls, cls, Object.class, null);
        this.h = obj;
    }

    public static /* synthetic */ Object E(Object obj) {
        return EnumSet.copyOf((Collection) obj);
    }

    public static /* synthetic */ Object H(Object obj) {
        return Collections.singleton(((List) obj).get(0));
    }

    public static /* synthetic */ Object I(Object obj) {
        return Collections.singletonList(((List) obj).get(0));
    }

    public static /* synthetic */ Object J(Object obj) {
        return Arrays.asList(((List) obj).toArray());
    }

    public static /* synthetic */ Object K(Object obj) {
        return Collections.unmodifiableCollection((Collection) obj);
    }

    public static /* synthetic */ Object L(Object obj) {
        return Collections.unmodifiableList((List) obj);
    }

    public static /* synthetic */ Object M(Object obj) {
        return Collections.unmodifiableSet((Set) obj);
    }

    public static /* synthetic */ Object O(Object obj) {
        return EnumSet.copyOf((Collection) obj);
    }

    public static /* synthetic */ Collection P(Collection collection) {
        return Collections.singleton(collection.iterator().next());
    }

    public static /* synthetic */ List Q(List list) {
        return Collections.singletonList(list.get(0));
    }

    public static /* synthetic */ Collection R(Collection collection) {
        return Collections.singletonList(collection.iterator().next());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x016d, code lost:
        if (r10.equals("kotlin.collections.EmptySet") == false) goto L_0x0164;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.jdk S(java.lang.reflect.Type r10, java.lang.Class r11, long r12) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xfk.S(java.lang.reflect.Type, java.lang.Class, long):tb.jdk");
    }

    @Override // tb.jdk
    public Object D(long j) {
        JSONException jSONException;
        Class cls = this.c;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        if (cls == HashSet.class) {
            return new HashSet();
        }
        if (cls == LinkedHashSet.class) {
            return new LinkedHashSet();
        }
        if (cls == TreeSet.class) {
            return new TreeSet();
        }
        Object obj = this.h;
        if (obj != null) {
            return obj;
        }
        if (cls != null) {
            if (!this.j) {
                try {
                    return this.c.newInstance();
                } catch (IllegalAccessException | InstantiationException unused) {
                    this.j = true;
                    jSONException = new JSONException("create list error, type " + this.c);
                }
            } else {
                jSONException = null;
            }
            if (this.j && List.class.isAssignableFrom(this.c.getSuperclass())) {
                try {
                    return this.c.getSuperclass().newInstance();
                } catch (IllegalAccessException | InstantiationException unused2) {
                    this.j = true;
                    jSONException = new JSONException("create list error, type " + this.c);
                }
            }
            if (jSONException != null) {
                throw jSONException;
            }
        }
        return new ArrayList();
    }

    @Override // tb.jdk
    public /* synthetic */ Object F(JSONReader jSONReader) {
        return cdk.l(this, jSONReader);
    }

    @Override // tb.jdk
    public /* synthetic */ String G() {
        return JSON.DEFAULT_TYPE_KEY;
    }

    @Override // tb.jdk
    public /* synthetic */ Object a() {
        return cdk.c(this);
    }

    @Override // tb.jdk
    public Class b() {
        return this.b;
    }

    @Override // tb.jdk
    public k2a d() {
        return this.g;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 h(long j) {
        return null;
    }

    @Override // tb.jdk
    public Object i(Collection collection) {
        Collection collection2;
        int size = collection.size();
        k2a k2aVar = this.g;
        if (size == 0 && this.b == List.class) {
            ArrayList arrayList = new ArrayList();
            if (k2aVar != null) {
                return k2aVar.apply(arrayList);
            }
            return arrayList;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        if (this.c == ArrayList.class) {
            collection2 = new ArrayList(collection.size());
        } else {
            collection2 = (Collection) D(0L);
        }
        for (Object obj : collection) {
            if (obj == null) {
                collection2.add(null);
            } else {
                Class<?> cls = obj.getClass();
                Class<?> cls2 = this.e;
                Type type = this.d;
                if ((cls == JSONObject.class || cls == JSONFactory.j()) && cls2 != cls) {
                    if (this.i == null) {
                        this.i = objectReaderProvider.I(type);
                    }
                    obj = this.i.x((JSONObject) obj, 0L);
                } else if (cls != type) {
                    k2a M = objectReaderProvider.M(cls, type);
                    if (M != null) {
                        obj = M.apply(obj);
                    } else if (obj instanceof Map) {
                        Map map = (Map) obj;
                        if (this.i == null) {
                            this.i = objectReaderProvider.I(type);
                        }
                        obj = this.i.x(map, 0L);
                    } else if (obj instanceof Collection) {
                        if (this.i == null) {
                            this.i = objectReaderProvider.I(type);
                        }
                        obj = this.i.i((Collection) obj);
                    } else if (!cls2.isInstance(obj)) {
                        if (Enum.class.isAssignableFrom(cls2)) {
                            if (this.i == null) {
                                this.i = objectReaderProvider.I(type);
                            }
                            jdk jdkVar = this.i;
                            if (jdkVar instanceof kek) {
                                obj = ((kek) jdkVar).c((String) obj);
                            } else if (jdkVar instanceof jek) {
                                obj = ((jek) jdkVar).c((String) obj);
                            } else {
                                throw new JSONException("can not convert from " + cls + " to " + type);
                            }
                        } else {
                            throw new JSONException("can not convert from " + cls + " to " + type);
                        }
                    }
                }
                collection2.add(obj);
            }
        }
        if (k2aVar != null) {
            return k2aVar.apply(collection2);
        }
        return collection2;
    }

    @Override // tb.jdk
    public /* synthetic */ g79 j(String str) {
        return cdk.h(this, str);
    }

    @Override // tb.jdk
    public /* synthetic */ long m() {
        return jdk.HASH_TYPE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    @Override // tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(com.alibaba.fastjson2.JSONReader r15, java.lang.reflect.Type r16, java.lang.Object r17, long r18) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xfk.o(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v8, types: [tb.k2a] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.Collection, boolean] */
    /* JADX WARN: Type inference failed for: r3v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v33, types: [int] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Unknown variable types count: 5 */
    @Override // tb.jdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(com.alibaba.fastjson2.JSONReader r18, java.lang.reflect.Type r19, java.lang.Object r20, long r21) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xfk.q(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // tb.jdk
    public /* synthetic */ Object r(JSONReader jSONReader, Type type, Object obj, long j) {
        cdk.i(this, jSONReader, type, obj, j);
        throw null;
    }

    @Override // tb.jdk
    public /* synthetic */ Object t(Map map, JSONReader.Feature... featureArr) {
        return cdk.g(this, map, featureArr);
    }

    @Override // tb.jdk
    public /* synthetic */ g79 u(long j) {
        return null;
    }

    @Override // tb.jdk
    public /* synthetic */ long v() {
        return 0L;
    }

    @Override // tb.jdk
    public /* synthetic */ jdk w(ObjectReaderProvider objectReaderProvider, long j) {
        return cdk.b(this, objectReaderProvider, j);
    }

    @Override // tb.jdk
    public /* synthetic */ Object x(Map map, long j) {
        return cdk.f(this, map, j);
    }

    @Override // tb.jdk
    public /* synthetic */ jdk z(JSONReader.c cVar, long j) {
        return cdk.a(this, cVar, j);
    }

    public xfk(Type type, Class cls, Class cls2, Type type2, k2a k2aVar) {
        this.f31355a = type;
        this.b = cls;
        this.c = cls2;
        ls9.a(TypeUtils.n(cls2));
        this.d = type2;
        Class<?> i = TypeUtils.i(type2);
        this.e = i;
        this.g = k2aVar;
        String n2 = i != null ? TypeUtils.n(i) : null;
        this.f = n2 != null ? ls9.a(n2) : 0L;
    }

    public xfk(Type type, Class cls, Class cls2, long j, Type type2, Class cls3, k2a k2aVar, String str, long j2) {
        this.f31355a = type;
        this.b = cls;
        this.c = cls2;
        this.d = type2;
        this.e = cls3;
        this.g = k2aVar;
        this.f = j2;
    }

    @Override // tb.jdk
    public /* synthetic */ void s(Object obj, String str, Object obj2, long j) {
    }
}
