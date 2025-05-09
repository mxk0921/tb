package tb;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pie {
    public static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f26113a;
    public final String b;
    public oie c;
    public final Map<String, olh> d;

    public pie(Drawable.Callback callback, String str, oie oieVar, Map<String, olh> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str.concat("/");
        }
        if (!(callback instanceof View)) {
            zhh.b("LottieDrawable must be inside of a view for images to work.");
            this.d = new HashMap();
            this.f26113a = null;
            return;
        }
        this.f26113a = ((View) callback).getContext();
        this.d = map;
        d(oieVar);
    }

    public Bitmap a(String str) {
        olh olhVar = this.d.get(str);
        if (olhVar == null) {
            return null;
        }
        Bitmap a2 = olhVar.a();
        if (a2 != null) {
            return a2;
        }
        oie oieVar = this.c;
        if (oieVar != null) {
            Bitmap fetchBitmap = oieVar.fetchBitmap(olhVar);
            if (fetchBitmap != null) {
                c(str, fetchBitmap);
            }
            return fetchBitmap;
        }
        String b = olhVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b.startsWith("data:") || b.indexOf(nwl.BASE_64) <= 0) {
            String str2 = this.b;
            if (TextUtils.isEmpty(str2)) {
                zhh.b("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                return null;
            }
            try {
                AssetManager assets = this.f26113a.getAssets();
                try {
                    Bitmap l = fxv.l(BitmapFactory.decodeStream(assets.open(str2 + b), null, options), olhVar.e(), olhVar.c());
                    c(str, l);
                    return l;
                } catch (IllegalArgumentException e2) {
                    zhh.c("Unable to decode image.", e2);
                    return null;
                }
            } catch (IOException e3) {
                zhh.c("Unable to open asset.", e3);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                c(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e4) {
                zhh.c("data URL did not have correct base64 format.", e4);
                return null;
            }
        }
    }

    public boolean b(Context context) {
        Context context2 = this.f26113a;
        if ((context != null || context2 != null) && !context2.equals(context)) {
            return false;
        }
        return true;
    }

    public final Bitmap c(String str, Bitmap bitmap) {
        synchronized (e) {
            this.d.get(str).g(bitmap);
        }
        return bitmap;
    }

    public void d(oie oieVar) {
        this.c = oieVar;
    }

    public Bitmap e(String str, Bitmap bitmap) {
        Map<String, olh> map = this.d;
        if (bitmap == null) {
            olh olhVar = map.get(str);
            Bitmap a2 = olhVar.a();
            olhVar.g(null);
            return a2;
        }
        Bitmap a3 = map.get(str).a();
        c(str, bitmap);
        return a3;
    }
}
