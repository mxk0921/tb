package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.g1a;
import tb.pg1;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a$\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a.\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a*\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a>\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0087\b¢\u0006\u0004\b\u0018\u0010\u001d\u001a\u001c\u0010 \u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0086\n¢\u0006\u0004\b \u0010!\u001a\u001c\u0010 \u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\"H\u0086\n¢\u0006\u0004\b \u0010#¨\u0006$"}, d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Ltb/xhv;", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "applyCanvas", "(Landroid/graphics/Bitmap;Ltb/g1a;)Landroid/graphics/Bitmap;", "", "x", "y", "get", "(Landroid/graphics/Bitmap;II)I", "color", "set", "(Landroid/graphics/Bitmap;III)V", "width", "height", "", "filter", "scale", "(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "config", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "(IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;", "Landroid/graphics/Point;", "p", "contains", "(Landroid/graphics/Bitmap;Landroid/graphics/Point;)Z", "Landroid/graphics/PointF;", "(Landroid/graphics/Bitmap;Landroid/graphics/PointF;)Z", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class BitmapKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Bitmap applyCanvas(Bitmap bitmap, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("27f90685", new Object[]{bitmap, g1aVar});
        }
        g1aVar.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean contains(Bitmap bitmap, Point point) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2bdeb6f", new Object[]{bitmap, point})).booleanValue();
        }
        int width = bitmap.getWidth();
        int i2 = point.x;
        return i2 >= 0 && i2 < width && (i = point.y) >= 0 && i < bitmap.getHeight();
    }

    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("c71a5b6c", new Object[]{new Integer(i), new Integer(i2), config}) : Bitmap.createBitmap(i, i2, config);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("50fb71b2", new Object[]{new Integer(i), new Integer(i2), config, new Integer(i3), obj});
        }
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public static final int get(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9d78c04", new Object[]{bitmap, new Integer(i), new Integer(i2)})).intValue();
        }
        return bitmap.getPixel(i, i2);
    }

    public static final Bitmap scale(Bitmap bitmap, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9c3e4cb5", new Object[]{bitmap, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i, int i2, boolean z, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2b0f0f09", new Object[]{bitmap, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), obj});
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    public static final void set(Bitmap bitmap, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3343661e", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            bitmap.setPixel(i, i2, i3);
        }
    }

    public static final boolean contains(Bitmap bitmap, PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7504c083", new Object[]{bitmap, pointF})).booleanValue();
        }
        float f = pointF.x;
        if (f >= 0.0f && f < bitmap.getWidth()) {
            float f2 = pointF.y;
            if (f2 >= 0.0f && f2 < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }

    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace) {
        Bitmap createBitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4b7b7f92", new Object[]{new Integer(i), new Integer(i2), config, new Boolean(z), colorSpace});
        }
        createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i3, Object obj) {
        Bitmap createBitmap;
        ColorSpace.Named named;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4ee2b88c", new Object[]{new Integer(i), new Integer(i2), config, new Boolean(z), colorSpace, new Integer(i3), obj});
        }
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
        }
        createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        return createBitmap;
    }
}
