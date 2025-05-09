package tb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class j19 {
    public static final j19 INSTANCE = new j19();

    public final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return i04.B0(ServiceLoader.load(cls, classLoader));
        }
    }

    public final List<lzh> c() {
        lzh lzhVar;
        if (!k19.a()) {
            return b(lzh.class, lzh.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            lzh lzhVar2 = null;
            try {
                lzhVar = (lzh) lzh.class.cast(Class.forName("tb.uv0", true, lzh.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                lzhVar = null;
            }
            if (lzhVar != null) {
                arrayList.add(lzhVar);
            }
            try {
                lzhVar2 = (lzh) lzh.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, lzh.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (lzhVar2 == null) {
                return arrayList;
            }
            arrayList.add(lzhVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(lzh.class, lzh.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/".concat(cls.getName())));
        ckf.f(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            d04.v(arrayList, INSTANCE.e(url));
        }
        Set<String> G0 = i04.G0(arrayList);
        if (!G0.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(zz3.q(G0, 10));
            for (String str : G0) {
                arrayList2.add(INSTANCE.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    public final List<String> e(URL url) {
        String url2 = url.toString();
        th = 0;
        if (tsq.I(url2, "jar", false, 2, th)) {
            String N0 = wsq.N0(wsq.I0(url2, "jar:file:", th, 2, th), '!', th, 2, th);
            String I0 = wsq.I0(url2, "!/", th, 2, th);
            JarFile jarFile = new JarFile(N0, false);
            try {
                List<String> f = INSTANCE.f(new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(I0)), "UTF-8")));
                jarFile.close();
                return f;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        sm8.a(th, th3);
                        throw th;
                    }
                }
            }
        } else {
            try {
                return INSTANCE.f(new BufferedReader(new InputStreamReader(url.openStream())));
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    public final List<String> f(BufferedReader bufferedReader) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return i04.B0(linkedHashSet);
            }
            String obj = wsq.Q0(wsq.O0(readLine, "#", null, 2, null)).toString();
            for (int i = 0; i < obj.length(); i++) {
                char charAt = obj.charAt(i);
                if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }
}
