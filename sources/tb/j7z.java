package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class j7z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final j7z INSTANCE = new j7z();

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, Typeface> f21824a = new LruCache<>(10);

    static {
        t2o.a(598736963);
    }

    public final Typeface a(Context context, String str, int i, int i2) {
        Typeface create;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("a6767b12", new Object[]{this, context, str, new Integer(i), new Integer(i2)});
        }
        ckf.g(context, "context");
        ckf.g(str, "fontFamily");
        String str2 = str + ((Object) l7z.c(i2)) + ((Object) i7z.c(i));
        LruCache<String, Typeface> lruCache = f21824a;
        Typeface typeface = lruCache.get(str2);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = null;
        if (Build.VERSION.SDK_INT >= 28) {
            if (str.length() > 0) {
                typeface2 = Typeface.createFromAsset(context.getAssets(), str);
            }
            create = Typeface.create(typeface2, i2, i7z.b(i, i7z.a(1)));
            ckf.f(create, "create(font, fontWeight.value.toInt(), fontStyle == FontStyle.Italic)");
            lruCache.put(str2, create);
            return create;
        }
        if (str.length() > 0) {
            typeface2 = Typeface.createFromAsset(context.getAssets(), str);
        }
        Typeface create2 = Typeface.create(typeface2, i7z.d(i));
        lruCache.put(str2, create2);
        ckf.f(create2, "tfs.also {\n                sTypefaceCache.put(cacheKey, it)\n            }");
        return create2;
    }
}
