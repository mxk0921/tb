package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\n\u001a\u001d\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\n\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u000e*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0010\u001a\u001d\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001a\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\n\u001a\u001b\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\n\u001a\u001d\u0010\u001c\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\n\u001a\u001b\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010!\u001a\u00020 *\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"\u001a!\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%\u001a.\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010&*\u00020\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000'H\u0086\b¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroid/content/res/TypedArray;", "", "index", "Ltb/xhv;", "checkAttribute", "(Landroid/content/res/TypedArray;I)V", "", "getBooleanOrThrow", "(Landroid/content/res/TypedArray;I)Z", "getColorOrThrow", "(Landroid/content/res/TypedArray;I)I", "Landroid/content/res/ColorStateList;", "getColorStateListOrThrow", "(Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;", "", "getDimensionOrThrow", "(Landroid/content/res/TypedArray;I)F", "getDimensionPixelOffsetOrThrow", "getDimensionPixelSizeOrThrow", "Landroid/graphics/drawable/Drawable;", "getDrawableOrThrow", "(Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;", "getFloatOrThrow", "Landroid/graphics/Typeface;", "getFontOrThrow", "(Landroid/content/res/TypedArray;I)Landroid/graphics/Typeface;", "getIntOrThrow", "getIntegerOrThrow", "getResourceIdOrThrow", "", "getStringOrThrow", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "", "getTextOrThrow", "(Landroid/content/res/TypedArray;I)Ljava/lang/CharSequence;", "", "getTextArrayOrThrow", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "R", "Lkotlin/Function1;", pg1.ATOM_EXT_block, "use", "(Landroid/content/res/TypedArray;Ltb/g1a;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TypedArrayKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static final void checkAttribute(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0caf8d", new Object[]{typedArray, new Integer(i)});
        } else if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10a80db4", new Object[]{typedArray, new Integer(i)})).booleanValue();
        }
        checkAttribute(typedArray, i);
        return typedArray.getBoolean(i, false);
    }

    public static final ColorStateList getColorStateListOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("77345434", new Object[]{typedArray, new Integer(i)});
        }
        checkAttribute(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.");
    }

    public static final float getDimensionOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("797f9f5e", new Object[]{typedArray, new Integer(i)})).floatValue();
        }
        checkAttribute(typedArray, i);
        return typedArray.getDimension(i, 0.0f);
    }

    public static final int getDimensionPixelSizeOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45459d08", new Object[]{typedArray, new Integer(i)})).intValue();
        }
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    public static final Drawable getDrawableOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("b8006fa8", new Object[]{typedArray, new Integer(i)});
        }
        checkAttribute(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        ckf.d(drawable);
        return drawable;
    }

    public static final float getFloatOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c145f054", new Object[]{typedArray, new Integer(i)})).floatValue();
        }
        checkAttribute(typedArray, i);
        return typedArray.getFloat(i, 0.0f);
    }

    public static final Typeface getFontOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("9c671c39", new Object[]{typedArray, new Integer(i)});
        }
        checkAttribute(typedArray, i);
        return TypedArrayApi26ImplKt.getFont(typedArray, i);
    }

    public static final int getIntOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e8edfea", new Object[]{typedArray, new Integer(i)})).intValue();
        }
        checkAttribute(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    public static final int getIntegerOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c4759b9", new Object[]{typedArray, new Integer(i)})).intValue();
        }
        checkAttribute(typedArray, i);
        return typedArray.getInteger(i, 0);
    }

    public static final int getResourceIdOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24315ff0", new Object[]{typedArray, new Integer(i)})).intValue();
        }
        checkAttribute(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    public static final String getStringOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c59229fb", new Object[]{typedArray, new Integer(i)});
        }
        checkAttribute(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.");
    }

    public static final CharSequence[] getTextArrayOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence[]) ipChange.ipc$dispatch("6c4cdddd", new Object[]{typedArray, new Integer(i)});
        }
        checkAttribute(typedArray, i);
        return typedArray.getTextArray(i);
    }

    public static final CharSequence getTextOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("7610cb9", new Object[]{typedArray, new Integer(i)});
        }
        checkAttribute(typedArray, i);
        CharSequence text = typedArray.getText(i);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.");
    }

    public static final <R> R use(TypedArray typedArray, g1a<? super TypedArray, ? extends R> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("ff94a983", new Object[]{typedArray, g1aVar});
        }
        R r = (R) g1aVar.invoke(typedArray);
        typedArray.recycle();
        return r;
    }

    public static final int getColorOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fee2cede", new Object[]{typedArray, new Integer(i)})).intValue();
        }
        checkAttribute(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    public static final int getDimensionPixelOffsetOrThrow(TypedArray typedArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc4af11a", new Object[]{typedArray, new Integer(i)})).intValue();
        }
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelOffset(i, 0);
    }
}
