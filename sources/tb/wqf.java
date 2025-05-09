package tb;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.i;
import com.alibaba.fastjson2.j;
import com.alibaba.fastjson2.l;
import com.alibaba.fastjson2.n;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.writer.z1;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final /* synthetic */ class wqf {
    public static Object a(String str) {
        Object obj;
        JSONObject jSONObject;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider k = JSONFactory.k();
        JSONReader.c cVar = new JSONReader.c(k);
        i iVar = new i(cVar, str, 0, str.length());
        try {
            char f0 = iVar.f0();
            if (cVar.e == null && (cVar.c & JSONReader.Feature.UseNativeObject.mask) == 0 && (f0 == '{' || f0 == '[')) {
                if (f0 == '{') {
                    JSONObject jSONObject2 = new JSONObject();
                    iVar.S1(jSONObject2, 0L);
                    jSONObject = jSONObject2;
                } else {
                    JSONArray jSONArray = new JSONArray();
                    iVar.R1(jSONArray);
                    jSONObject = jSONArray;
                }
                obj = jSONObject;
                if (iVar.b != null) {
                    iVar.Y0(jSONObject);
                    obj = jSONObject;
                }
            } else {
                obj = k.J(Object.class, false).o(iVar, null, null, 0L);
            }
            if (iVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return obj;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Object b(byte[] bArr, JSONReader.c cVar) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        jdk g = cVar.g(Object.class);
        j jVar = new j(cVar, null, bArr, 0, bArr.length);
        try {
            Object o = g.o(jVar, null, null, 0L);
            if (jVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jVar.a1("input not end"));
            }
            jVar.close();
            return o;
        } catch (Throwable th) {
            try {
                jVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static JSONArray c(String str, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.c cVar = new JSONReader.c(JSONFactory.defaultObjectReaderProvider, featureArr);
        i iVar = new i(cVar, str, 0, str.length());
        try {
            if (iVar.C1()) {
                iVar.close();
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            iVar.R1(jSONArray);
            if (iVar.b != null) {
                iVar.Y0(jSONArray);
            }
            if (iVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return jSONArray;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static <T> List<T> d(String str, Class<T> cls) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.c cVar = new JSONReader.c(JSONFactory.defaultObjectReaderProvider);
        JSONReader iVar = new i(cVar, str, 0, str.length());
        try {
            List V1 = iVar.V1(cls);
            if (iVar.b != null) {
                iVar.Y0(V1);
            }
            if (iVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return V1;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static <T> List<T> e(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.c cVar = new JSONReader.c(JSONFactory.defaultObjectReaderProvider, featureArr);
        JSONReader iVar = new i(cVar, str, 0, str.length());
        try {
            List V1 = iVar.V1(cls);
            if (iVar.b != null) {
                iVar.Y0(V1);
            }
            if (iVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return V1;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static JSONObject f(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.c cVar = new JSONReader.c(JSONFactory.defaultObjectReaderProvider);
        i iVar = new i(cVar, str, 0, str.length());
        try {
            if (iVar.C1()) {
                iVar.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            iVar.S1(jSONObject, 0L);
            if (iVar.b != null) {
                iVar.Y0(jSONObject);
            }
            if (iVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static JSONObject g(String str, JSONReader.Feature... featureArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.c e = JSONFactory.e(featureArr);
        i iVar = new i(e, str, 0, str.length());
        try {
            if (iVar.C1()) {
                iVar.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            iVar.S1(jSONObject, 0L);
            if (iVar.b != null) {
                iVar.Y0(jSONObject);
            }
            if (iVar.d != 26 && (e.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static <T> T h(String str, n<T> nVar, uh9 uh9Var, JSONReader.Feature... featureArr) {
        boolean z;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.c cVar = new JSONReader.c(objectReaderProvider, null, uh9Var, featureArr);
        Type c = nVar.c();
        if ((cVar.c & JSONReader.Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        jdk J = objectReaderProvider.J(c, z);
        JSONReader iVar = new i(cVar, str, 0, str.length());
        try {
            T t = (T) J.o(iVar, c, null, 0L);
            if (iVar.b != null) {
                iVar.Y0(t);
            }
            if (iVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return t;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static <T> T i(String str, n<T> nVar, JSONReader.Feature... featureArr) {
        boolean z;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.c cVar = new JSONReader.c(objectReaderProvider, featureArr);
        Type c = nVar.c();
        long j = JSONReader.Feature.FieldBased.mask;
        if (0 != 0) {
            z = true;
        } else {
            z = false;
        }
        jdk J = objectReaderProvider.J(c, z);
        JSONReader iVar = new i(cVar, str, 0, str.length());
        try {
            T t = (T) J.o(iVar, c, null, 0L);
            if (iVar.b != null) {
                iVar.Y0(t);
            }
            if (iVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return t;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static <T> T j(String str, Class<T> cls) {
        boolean z;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.c cVar = new JSONReader.c(objectReaderProvider);
        long j = JSONReader.Feature.FieldBased.mask;
        if (0 != 0) {
            z = true;
        } else {
            z = false;
        }
        jdk J = objectReaderProvider.J(cls, z);
        JSONReader iVar = new i(cVar, str, 0, str.length());
        try {
            T t = (T) J.o(iVar, cls, null, 0L);
            if (iVar.b != null) {
                iVar.Y0(t);
            }
            if (iVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return t;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static <T> T k(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        boolean z;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.c cVar = new JSONReader.c(objectReaderProvider, featureArr);
        if ((cVar.c & JSONReader.Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        jdk J = objectReaderProvider.J(cls, z);
        JSONReader iVar = new i(cVar, str, 0, str.length());
        try {
            T t = (T) J.o(iVar, cls, null, 0L);
            if (iVar.b != null) {
                iVar.Y0(t);
            }
            if (iVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return t;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static <T> T l(String str, Type type) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.c cVar = new JSONReader.c(objectReaderProvider);
        boolean z = false;
        JSONReader iVar = new i(cVar, str, 0, str.length());
        try {
            long j = JSONReader.Feature.FieldBased.mask;
            if (0 != 0) {
                z = true;
            }
            T t = (T) objectReaderProvider.J(type, z).o(iVar, type, null, 0L);
            if (iVar.b != null) {
                iVar.Y0(t);
            }
            if (iVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return t;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static <T> T m(String str, Type type, JSONReader.Feature... featureArr) {
        boolean z;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        JSONReader.c cVar = new JSONReader.c(objectReaderProvider, featureArr);
        if ((cVar.c & JSONReader.Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        jdk J = objectReaderProvider.J(type, z);
        JSONReader iVar = new i(cVar, str, 0, str.length());
        try {
            T t = (T) J.o(iVar, type, null, 0L);
            if (iVar.b != null) {
                iVar.Y0(t);
            }
            if (iVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(iVar.a1("input not end"));
            }
            iVar.close();
            return t;
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static <T> T n(byte[] bArr, Class<T> cls, JSONReader.c cVar) {
        boolean z;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JSONReader jVar = new j(cVar, null, bArr, 0, bArr.length);
        try {
            if ((cVar.c & JSONReader.Feature.FieldBased.mask) != 0) {
                z = true;
            } else {
                z = false;
            }
            T t = (T) cVar.i.J(cls, z).o(jVar, cls, null, 0L);
            if (jVar.b != null) {
                jVar.Y0(t);
            }
            if (jVar.d != 26 && (cVar.c & JSONReader.Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(jVar.a1("input not end"));
            }
            jVar.close();
            return t;
        } catch (Throwable th) {
            try {
                jVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Object o(Object obj) {
        return p(obj, null);
    }

    public static String q(Object obj) {
        boolean z;
        z1 z1Var = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.a aVar = new JSONWriter.a(z1Var);
        long j = JSONWriter.Feature.OptimizedForAscii.mask;
        try {
            l lVar = new l(aVar);
            if (obj == null) {
                lVar.b2();
            } else {
                lVar.j = obj;
                lVar.l = JSONWriter.b.ROOT;
                Class<?> cls = obj.getClass();
                if (cls == JSONObject.class && aVar.c == 0) {
                    lVar.f1((JSONObject) obj);
                } else {
                    if ((aVar.c & JSONWriter.Feature.FieldBased.mask) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z1Var.k(cls, cls, z).y(lVar, obj, null, null, 0L);
                }
            }
            String obj2 = lVar.toString();
            lVar.close();
            return obj2;
        } catch (NullPointerException | NumberFormatException e) {
            throw new JSONException("JSON#toJSONString cannot serialize '" + obj + "'", e);
        }
    }

    public static String r(Object obj, JSONWriter.Feature... featureArr) {
        boolean z;
        z1 z1Var = JSONFactory.defaultObjectWriterProvider;
        JSONWriter.a aVar = new JSONWriter.a(z1Var, featureArr);
        if ((aVar.c & JSONWriter.Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        JSONWriter U0 = JSONWriter.U0(aVar);
        try {
            if (obj == null) {
                U0.b2();
            } else {
                U0.j = obj;
                U0.l = JSONWriter.b.ROOT;
                Class<?> cls = obj.getClass();
                z1Var.k(cls, cls, z).y(U0, obj, null, null, 0L);
            }
            String obj2 = U0.toString();
            U0.close();
            return obj2;
        } catch (Throwable th) {
            try {
                U0.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Object p(Object obj, JSONWriter.Feature... featureArr) {
        JSONWriter.a aVar;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            return obj;
        }
        if (featureArr == null) {
            aVar = JSONFactory.f();
        } else {
            aVar = JSONFactory.g(featureArr);
        }
        Class<?> cls = obj.getClass();
        iik f = aVar.f(cls, cls);
        if ((f instanceof jik) && !aVar.l(JSONWriter.Feature.ReferenceDetection)) {
            return ((jik) f).m(obj, aVar.c);
        }
        try {
            JSONWriter U0 = JSONWriter.U0(aVar);
            try {
                f.y(U0, obj, null, null, aVar.c);
                String obj2 = U0.toString();
                U0.close();
                return a(obj2);
            } catch (Throwable th) {
                try {
                    U0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (NullPointerException | NumberFormatException e) {
            throw new JSONException("toJSONString error", e);
        }
    }
}
