package com.taobao.android.nav.binder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BitmapBinder extends Binder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WeakReference<Drawable> drawable;
    public final WeakReference<View> sourceView;

    static {
        t2o.a(578814073);
    }

    public BitmapBinder(View view) {
        this.sourceView = new WeakReference<>(view);
        this.drawable = new WeakReference<>(null);
    }

    public static /* synthetic */ Object ipc$super(BitmapBinder bitmapBinder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nav/binder/BitmapBinder");
    }

    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        return null;
    }

    public Drawable getDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this});
        }
        return this.drawable.get();
    }

    public Bitmap screenshotOnView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e4190b5f", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public BitmapBinder(Drawable drawable) {
        this.drawable = new WeakReference<>(drawable);
        this.sourceView = new WeakReference<>(null);
    }

    public BitmapBinder() {
        this.drawable = new WeakReference<>(null);
        this.sourceView = new WeakReference<>(null);
    }
}
