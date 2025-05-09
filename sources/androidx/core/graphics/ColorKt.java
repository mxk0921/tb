package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.h14;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0018\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u0018\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u0018\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001a\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001a\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001a\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001b\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001b\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001b\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001c\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001c\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001c\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\u0015\u0010\u001d\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001f\u001a\u00020\u0019*\u00020\u00192\u0006\u0010 \u001a\u00020\u0019H\u0087\u0002\u001a\r\u0010!\u001a\u00020\u0019*\u00020\u0001H\u0087\b\u001a\r\u0010!\u001a\u00020\u0019*\u00020\u0005H\u0087\b\u001a\r\u0010\"\u001a\u00020\u0001*\u00020\u0005H\u0087\b\u001a\r\u0010\"\u001a\u00020\u0001*\u00020#H\u0087\b\u001a\r\u0010$\u001a\u00020\u0005*\u00020\u0001H\u0087\b\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0000\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u0016\u0010\t\u001a\u00020\n*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u000f\u001a\u00020\u0010*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\u0010*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011\"\u0016\u0010\u0013\u001a\u00020\u0004*\u00020\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0013\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006\"\u0016\u0010\u0016\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0003\"\u0016\u0010\u0016\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006¨\u0006%"}, d2 = {"alpha", "", "getAlpha", "(I)I", "", "", "(J)F", pg1.ATOM_EXT_blue, "getBlue", "colorSpace", "Landroid/graphics/ColorSpace;", "getColorSpace", "(J)Landroid/graphics/ColorSpace;", pg1.ATOM_EXT_green, "getGreen", "isSrgb", "", "(J)Z", "isWideGamut", "luminance", "getLuminance", "(I)F", pg1.ATOM_EXT_red, "getRed", "component1", "Landroid/graphics/Color;", "component2", "component3", "component4", "convertTo", "Landroid/graphics/ColorSpace$Named;", "plus", "c", "toColor", "toColorInt", "", "toColorLong", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ColorKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final int component1(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("918ba0fb", new Object[]{new Integer(i)})).intValue() : (i >> 24) & 255;
    }

    public static final int component2(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9340799a", new Object[]{new Integer(i)})).intValue() : (i >> 16) & 255;
    }

    public static final int component3(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("94f55239", new Object[]{new Integer(i)})).intValue() : (i >> 8) & 255;
    }

    public static final int component4(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96aa2ad8", new Object[]{new Integer(i)})).intValue() : i & 255;
    }

    public static final long convertTo(int i, ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d517fe8b", new Object[]{new Integer(i), named})).longValue();
        }
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(i, colorSpace);
        return convert;
    }

    public static final int getAlpha(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a320b0a7", new Object[]{new Integer(i)})).intValue() : (i >> 24) & 255;
    }

    public static final int getBlue(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("70cce87f", new Object[]{new Integer(i)})).intValue() : i & 255;
    }

    public static final ColorSpace getColorSpace(long j) {
        ColorSpace colorSpace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return h14.a(ipChange.ipc$dispatch("c0ae0b8e", new Object[]{new Long(j)}));
        }
        colorSpace = Color.colorSpace(j);
        return colorSpace;
    }

    public static final int getGreen(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d7435222", new Object[]{new Integer(i)})).intValue() : (i >> 8) & 255;
    }

    public static final float getLuminance(int i) {
        float luminance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7eb7624a", new Object[]{new Integer(i)})).floatValue();
        }
        luminance = Color.luminance(i);
        return luminance;
    }

    public static final int getRed(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a35b6d4", new Object[]{new Integer(i)})).intValue() : (i >> 16) & 255;
    }

    public static final boolean isSrgb(long j) {
        boolean isSrgb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15b961dd", new Object[]{new Long(j)})).booleanValue();
        }
        isSrgb = Color.isSrgb(j);
        return isSrgb;
    }

    public static final boolean isWideGamut(long j) {
        boolean isWideGamut;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("571454ac", new Object[]{new Long(j)})).booleanValue();
        }
        isWideGamut = Color.isWideGamut(j);
        return isWideGamut;
    }

    public static final Color plus(Color color, Color color2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Color) ipChange.ipc$dispatch("f5835ee5", new Object[]{color, color2});
        }
        return ColorUtils.compositeColors(color2, color);
    }

    public static final Color toColor(int i) {
        Color valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Color) ipChange.ipc$dispatch("644e0fd2", new Object[]{new Integer(i)});
        }
        valueOf = Color.valueOf(i);
        return valueOf;
    }

    public static final int toColorInt(long j) {
        int argb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e65ca49", new Object[]{new Long(j)})).intValue();
        }
        argb = Color.toArgb(j);
        return argb;
    }

    public static final long toColorLong(int i) {
        long pack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7265d8c", new Object[]{new Integer(i)})).longValue();
        }
        pack = Color.pack(i);
        return pack;
    }

    public static final float component1(Color color) {
        float component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f23133b", new Object[]{color})).floatValue();
        }
        component = color.getComponent(0);
        return component;
    }

    public static final float component2(Color color) {
        float component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7872f7bc", new Object[]{color})).floatValue();
        }
        component = color.getComponent(1);
        return component;
    }

    public static final float component3(Color color) {
        float component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1c2dc3d", new Object[]{color})).floatValue();
        }
        component = color.getComponent(2);
        return component;
    }

    public static final float component4(Color color) {
        float component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb12c0be", new Object[]{color})).floatValue();
        }
        component = color.getComponent(3);
        return component;
    }

    public static final long convertTo(int i, ColorSpace colorSpace) {
        long convert;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98b72720", new Object[]{new Integer(i), colorSpace})).longValue();
        }
        convert = Color.convert(i, colorSpace);
        return convert;
    }

    public static final float getAlpha(long j) {
        float alpha;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a320b465", new Object[]{new Long(j)})).floatValue();
        }
        alpha = Color.alpha(j);
        return alpha;
    }

    public static final float getBlue(long j) {
        float blue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70ccec3d", new Object[]{new Long(j)})).floatValue();
        }
        blue = Color.blue(j);
        return blue;
    }

    public static final float getGreen(long j) {
        float green;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d74355e0", new Object[]{new Long(j)})).floatValue();
        }
        green = Color.green(j);
        return green;
    }

    public static final float getLuminance(long j) {
        float luminance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7eb7660b", new Object[]{new Long(j)})).floatValue();
        }
        luminance = Color.luminance(j);
        return luminance;
    }

    public static final float getRed(long j) {
        float red;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a35ba92", new Object[]{new Long(j)})).floatValue();
        }
        red = Color.red(j);
        return red;
    }

    public static final Color toColor(long j) {
        Color valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Color) ipChange.ipc$dispatch("662762f1", new Object[]{new Long(j)});
        }
        valueOf = Color.valueOf(j);
        return valueOf;
    }

    public static final int toColorInt(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("92832c6b", new Object[]{str})).intValue() : Color.parseColor(str);
    }

    public static final float component1(long j) {
        float red;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("918ba4b9", new Object[]{new Long(j)})).floatValue();
        }
        red = Color.red(j);
        return red;
    }

    public static final float component2(long j) {
        float green;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93407d58", new Object[]{new Long(j)})).floatValue();
        }
        green = Color.green(j);
        return green;
    }

    public static final float component3(long j) {
        float blue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94f555f7", new Object[]{new Long(j)})).floatValue();
        }
        blue = Color.blue(j);
        return blue;
    }

    public static final float component4(long j) {
        float alpha;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96aa2e96", new Object[]{new Long(j)})).floatValue();
        }
        alpha = Color.alpha(j);
        return alpha;
    }

    public static final long convertTo(long j, ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("366a9b2a", new Object[]{new Long(j), named})).longValue();
        }
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(j, colorSpace);
        return convert;
    }

    public static final long convertTo(long j, ColorSpace colorSpace) {
        long convert;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20e766ff", new Object[]{new Long(j), colorSpace})).longValue();
        }
        convert = Color.convert(j, colorSpace);
        return convert;
    }

    public static final Color convertTo(Color color, ColorSpace.Named named) {
        ColorSpace colorSpace;
        Color convert;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Color) ipChange.ipc$dispatch("63c3ee46", new Object[]{color, named});
        }
        colorSpace = ColorSpace.get(named);
        convert = color.convert(colorSpace);
        return convert;
    }

    public static final Color convertTo(Color color, ColorSpace colorSpace) {
        Color convert;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Color) ipChange.ipc$dispatch("77eb4351", new Object[]{color, colorSpace});
        }
        convert = color.convert(colorSpace);
        return convert;
    }
}
