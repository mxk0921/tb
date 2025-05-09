package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class dfw implements ffw {

    /* renamed from: a  reason: collision with root package name */
    public final ViewOverlay f17778a;

    public dfw(View view) {
        this.f17778a = view.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f17778a.add(drawable);
    }

    public void b(Drawable drawable) {
        this.f17778a.remove(drawable);
    }
}
