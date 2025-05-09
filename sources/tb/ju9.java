package tb;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ju9 {
    public final AssetManager d;
    public iu9 e;

    /* renamed from: a  reason: collision with root package name */
    public final ffj<String> f22225a = new ffj<>();
    public final Map<ffj<String>, Typeface> b = new HashMap();
    public final Map<String, Typeface> c = new HashMap();
    public final String f = ".ttf";

    public ju9(Drawable.Callback callback, iu9 iu9Var) {
        this.e = iu9Var;
        if (!(callback instanceof View)) {
            zhh.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }

    public final Typeface a(String str) {
        Typeface typeface;
        String b;
        HashMap hashMap = (HashMap) this.c;
        Typeface typeface2 = (Typeface) hashMap.get(str);
        if (typeface2 != null) {
            return typeface2;
        }
        iu9 iu9Var = this.e;
        if (iu9Var != null) {
            typeface = iu9Var.a(str);
        } else {
            typeface = null;
        }
        iu9 iu9Var2 = this.e;
        AssetManager assetManager = this.d;
        if (!(iu9Var2 == null || typeface != null || (b = iu9Var2.b(str)) == null)) {
            typeface = Typeface.createFromAsset(assetManager, b);
        }
        if (typeface == null) {
            typeface = Typeface.createFromAsset(assetManager, "fonts/" + str + this.f);
        }
        hashMap.put(str, typeface);
        return typeface;
    }

    public Typeface b(String str, String str2) {
        ffj<String> ffjVar = this.f22225a;
        ffjVar.b(str, str2);
        HashMap hashMap = (HashMap) this.b;
        Typeface typeface = (Typeface) hashMap.get(ffjVar);
        if (typeface != null) {
            return typeface;
        }
        Typeface d = d(a(str), str2);
        hashMap.put(ffjVar, d);
        return d;
    }

    public void c(iu9 iu9Var) {
        this.e = iu9Var;
    }

    public final Typeface d(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }
}
