package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\b\u001a9\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0003\u0010\n\u001a\u00020\u00012\b\b\u0003\u0010\u000b\u001a\u00020\u00012\b\b\u0003\u0010\f\u001a\u00020\u00012\b\b\u0003\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/graphics/drawable/Drawable;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "toBitmapOrNull", "left", "top", "right", "bottom", "Ltb/xhv;", "updateBounds", "(Landroid/graphics/drawable/Drawable;IIII)V", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DrawableKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Bitmap toBitmap(Drawable drawable, int i, int i2, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("582cd30f", new Object[]{drawable, new Integer(i), new Integer(i2), config});
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            } else if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                if (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) {
                    return bitmapDrawable.getBitmap();
                }
                return Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public static final Bitmap toBitmapOrNull(Drawable drawable, int i, int i2, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e1979339", new Object[]{drawable, new Integer(i), new Integer(i2), config});
        }
        if (!(drawable instanceof BitmapDrawable) || ((BitmapDrawable) drawable).getBitmap() != null) {
            return toBitmap(drawable, i, i2, config);
        }
        return null;
    }

    public static final void updateBounds(Drawable drawable, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc59749", new Object[]{drawable, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            drawable.setBounds(i, i2, i3, i4);
        }
    }

    public static /* synthetic */ void updateBounds$default(Drawable drawable, int i, int i2, int i3, int i4, int i5, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b80af9", new Object[]{drawable, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), obj});
            return;
        }
        if ((i5 & 1) != 0) {
            i = drawable.getBounds().left;
        }
        if ((i5 & 2) != 0) {
            i2 = drawable.getBounds().top;
        }
        if ((i5 & 4) != 0) {
            i3 = drawable.getBounds().right;
        }
        if ((i5 & 8) != 0) {
            i4 = drawable.getBounds().bottom;
        }
        updateBounds(drawable, i, i2, i3, i4);
    }

    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d1ac62af", new Object[]{drawable, new Integer(i), new Integer(i2), config, new Integer(i3), obj});
        }
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return toBitmap(drawable, i, i2, config);
    }

    public static /* synthetic */ Bitmap toBitmapOrNull$default(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fdd4d845", new Object[]{drawable, new Integer(i), new Integer(i2), config, new Integer(i3), obj});
        }
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return toBitmapOrNull(drawable, i, i2, config);
    }
}
