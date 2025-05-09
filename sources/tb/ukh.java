package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ukh {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, dmh<kkh>> f29435a = new HashMap();
    public static final byte[] b = {80, 75, 3, 4};

    public static zlh<kkh> A(ZipInputStream zipInputStream, String str) {
        try {
            return B(zipInputStream, str);
        } finally {
            fxv.c(zipInputStream);
        }
    }

    public static zlh<kkh> B(ZipInputStream zipInputStream, String str) {
        String[] split;
        zhh.b("fromZipStreamSyncInternal:key==" + str);
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            kkh kkhVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(q2s.JSON)) {
                    kkhVar = s(JsonReader.n0(kok.a(kok.g(zipInputStream))), null, false).b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (kkhVar == null) {
                return new zlh<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                olh j = j(kkhVar, (String) entry.getKey());
                if (j != null) {
                    j.g(fxv.l((Bitmap) entry.getValue(), j.e(), j.c()));
                }
            }
            for (Map.Entry<String, olh> entry2 : kkhVar.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new zlh<>(new IllegalStateException("There is no image for " + entry2.getValue().b()));
                }
            }
            if (str != null) {
                lkh.b().c(str, kkhVar);
            }
            return new zlh<>(kkhVar);
        } catch (IOException e) {
            return new zlh<>(e);
        }
    }

    public static boolean C(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static Boolean D(BufferedSource bufferedSource) {
        try {
            BufferedSource peek = bufferedSource.peek();
            for (byte b2 : b) {
                if (((rjn) peek).readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            ((rjn) peek).close();
            return Boolean.TRUE;
        } catch (Exception e) {
            zhh.c("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ zlh E(kkh kkhVar) throws Exception {
        return new zlh(kkhVar);
    }

    public static /* synthetic */ void F(String str, AtomicBoolean atomicBoolean, kkh kkhVar) {
        ((HashMap) f29435a).remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void G(String str, AtomicBoolean atomicBoolean, Throwable th) {
        ((HashMap) f29435a).remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ zlh J(WeakReference weakReference, Context context, int i, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return w(context, i, str);
    }

    public static /* synthetic */ zlh K(Context context, String str, String str2) throws Exception {
        zlh<kkh> c = k6g.c(context).c(str, str2);
        if (!(str2 == null || c.b() == null)) {
            lkh.b().c(str2, c.b());
        }
        return c;
    }

    public static String M(Context context, int i) {
        String str;
        StringBuilder sb = new StringBuilder("rawRes");
        if (C(context)) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static dmh<kkh> i(final String str, Callable<zlh<kkh>> callable) {
        final kkh kkhVar;
        if (str == null) {
            kkhVar = null;
        } else {
            kkhVar = lkh.b().a(str);
        }
        if (kkhVar != null) {
            zhh.b(str + " has cache LottieComposition");
            return new dmh<>(new Callable() { // from class: tb.qkh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zlh E;
                    E = ukh.E(kkh.this);
                    return E;
                }
            });
        }
        Map<String, dmh<kkh>> map = f29435a;
        if (str != null) {
            HashMap hashMap = (HashMap) map;
            if (hashMap.containsKey(str)) {
                return (dmh) hashMap.get(str);
            }
        }
        dmh<kkh> dmhVar = new dmh<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            dmhVar.d(new plh() { // from class: tb.rkh
                @Override // tb.plh
                public final void onResult(Object obj) {
                    ukh.F(str, atomicBoolean, (kkh) obj);
                }
            });
            dmhVar.c(new plh() { // from class: tb.skh
                @Override // tb.plh
                public final void onResult(Object obj) {
                    ukh.G(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                ((HashMap) map).put(str, dmhVar);
            }
        }
        return dmhVar;
    }

    public static olh j(kkh kkhVar, String str) {
        for (olh olhVar : kkhVar.j().values()) {
            if (olhVar.b().equals(str)) {
                return olhVar;
            }
        }
        return null;
    }

    public static dmh<kkh> k(Context context, String str) {
        return l(context, str, "asset_" + str);
    }

    public static dmh<kkh> l(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return i(str2, new Callable() { // from class: tb.pkh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zlh n;
                n = ukh.n(applicationContext, str, str2);
                return n;
            }
        });
    }

    public static zlh<kkh> m(Context context, String str) {
        return n(context, str, "asset_" + str);
    }

    public static zlh<kkh> n(Context context, String str, String str2) {
        try {
            zhh.b("fromAssetSync:fileName==" + str + " key==" + str2);
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return p(context.getAssets().open(str), str2);
            }
            return A(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new zlh<>(e);
        }
    }

    public static dmh<kkh> o(final InputStream inputStream, final String str) {
        return i(str, new Callable() { // from class: tb.okh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zlh p;
                p = ukh.p(inputStream, str);
                return p;
            }
        });
    }

    public static zlh<kkh> p(InputStream inputStream, String str) {
        return q(inputStream, str, true);
    }

    public static zlh<kkh> q(InputStream inputStream, String str, boolean z) {
        try {
            return r(JsonReader.n0(kok.a(kok.g(inputStream))), str);
        } finally {
            if (z) {
                fxv.c(inputStream);
            }
        }
    }

    public static zlh<kkh> r(JsonReader jsonReader, String str) {
        return s(jsonReader, str, true);
    }

    public static zlh<kkh> s(JsonReader jsonReader, String str, boolean z) {
        try {
            try {
                kkh a2 = vkh.a(jsonReader);
                if (str != null) {
                    zhh.b("fromJsonReaderSyncInternal:key==".concat(str));
                    lkh.b().c(str, a2);
                }
                zlh<kkh> zlhVar = new zlh<>(a2);
                if (z) {
                    fxv.c(jsonReader);
                }
                return zlhVar;
            } catch (Exception e) {
                zlh<kkh> zlhVar2 = new zlh<>(e);
                if (z) {
                    fxv.c(jsonReader);
                }
                return zlhVar2;
            }
        } catch (Throwable th) {
            if (z) {
                fxv.c(jsonReader);
            }
            throw th;
        }
    }

    public static dmh<kkh> t(Context context, int i) {
        return u(context, i, M(context, i));
    }

    public static dmh<kkh> u(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return i(str, new Callable() { // from class: tb.tkh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zlh J;
                J = ukh.J(weakReference, applicationContext, i, str);
                return J;
            }
        });
    }

    public static zlh<kkh> v(Context context, int i) {
        return w(context, i, M(context, i));
    }

    public static zlh<kkh> w(Context context, int i, String str) {
        try {
            zhh.b("fromRawResSync:rawRes==" + i + " key==" + str);
            BufferedSource a2 = kok.a(kok.g(context.getResources().openRawResource(i)));
            if (D(a2).booleanValue()) {
                return A(new ZipInputStream(((rjn) a2).inputStream()), str);
            }
            return p(((rjn) a2).inputStream(), str);
        } catch (Resources.NotFoundException e) {
            return new zlh<>(e);
        }
    }

    public static dmh<kkh> x(Context context, String str) {
        return y(context, str, "url_" + str);
    }

    public static dmh<kkh> y(final Context context, final String str, final String str2) {
        return i(str2, new Callable() { // from class: tb.mkh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zlh K;
                K = ukh.K(context, str, str2);
                return K;
            }
        });
    }

    public static dmh<kkh> z(final ZipInputStream zipInputStream, final String str) {
        return i(str, new Callable() { // from class: tb.nkh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zlh A;
                A = ukh.A(zipInputStream, str);
                return A;
            }
        });
    }
}
