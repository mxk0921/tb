package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TypedArrayUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";

    private TypedArrayUtils() {
    }

    public static int getAttr(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e029ed", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static boolean getBoolean(TypedArray typedArray, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf8a7544", new Object[]{typedArray, new Integer(i), new Integer(i2), new Boolean(z)})).booleanValue();
        }
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static Drawable getDrawable(TypedArray typedArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("b3341144", new Object[]{typedArray, new Integer(i), new Integer(i2)});
        }
        Drawable drawable = typedArray.getDrawable(i);
        if (drawable == null) {
            return typedArray.getDrawable(i2);
        }
        return drawable;
    }

    public static int getInt(TypedArray typedArray, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9cd2bb", new Object[]{typedArray, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    public static boolean getNamedBoolean(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10de0c50", new Object[]{typedArray, xmlPullParser, str, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (!hasAttribute(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    public static int getNamedColor(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db674a9", new Object[]{typedArray, xmlPullParser, str, new Integer(i), new Integer(i2)})).intValue();
        }
        if (!hasAttribute(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    public static ColorStateList getNamedColorStateList(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("a3f13c5c", new Object[]{typedArray, xmlPullParser, theme, str, new Integer(i)});
        }
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (i2 < 28 || i2 > 31) {
            return ColorStateListInflaterCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return getNamedColorStateListFromInt(typedValue);
        }
    }

    private static ColorStateList getNamedColorStateListFromInt(TypedValue typedValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("4d20be4", new Object[]{typedValue});
        }
        return ColorStateList.valueOf(typedValue.data);
    }

    public static ComplexColorCompat getNamedComplexColor(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComplexColorCompat) ipChange.ipc$dispatch("bcc96abd", new Object[]{typedArray, xmlPullParser, theme, str, new Integer(i), new Integer(i2)});
        }
        if (hasAttribute(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return ComplexColorCompat.from(typedValue.data);
            }
            ComplexColorCompat inflate = ComplexColorCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (inflate != null) {
                return inflate;
            }
        }
        return ComplexColorCompat.from(i2);
    }

    public static float getNamedFloat(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f8da39c", new Object[]{typedArray, xmlPullParser, str, new Integer(i), new Float(f)})).floatValue();
        }
        if (!hasAttribute(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    public static int getNamedInt(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da0a4775", new Object[]{typedArray, xmlPullParser, str, new Integer(i), new Integer(i2)})).intValue();
        }
        return !hasAttribute(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int getNamedResourceId(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce631bb5", new Object[]{typedArray, xmlPullParser, str, new Integer(i), new Integer(i2)})).intValue();
        }
        return !hasAttribute(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    public static String getNamedString(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e17b127", new Object[]{typedArray, xmlPullParser, str, new Integer(i)});
        }
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static int getResourceId(TypedArray typedArray, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9bfe6f5", new Object[]{typedArray, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static String getString(TypedArray typedArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d5ff057", new Object[]{typedArray, new Integer(i), new Integer(i2)});
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return typedArray.getString(i2);
        }
        return string;
    }

    public static CharSequence getText(TypedArray typedArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("9d2e5915", new Object[]{typedArray, new Integer(i), new Integer(i2)});
        }
        CharSequence text = typedArray.getText(i);
        if (text == null) {
            return typedArray.getText(i2);
        }
        return text;
    }

    public static CharSequence[] getTextArray(TypedArray typedArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence[]) ipChange.ipc$dispatch("6cf0d741", new Object[]{typedArray, new Integer(i), new Integer(i2)});
        }
        CharSequence[] textArray = typedArray.getTextArray(i);
        if (textArray == null) {
            return typedArray.getTextArray(i2);
        }
        return textArray;
    }

    public static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedArray) ipChange.ipc$dispatch("2b5d6b93", new Object[]{resources, theme, attributeSet, iArr});
        }
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue peekNamedValue(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedValue) ipChange.ipc$dispatch("908fb6d7", new Object[]{typedArray, xmlPullParser, str, new Integer(i)});
        }
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    public static boolean hasAttribute(XmlPullParser xmlPullParser, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17dff21", new Object[]{xmlPullParser, str})).booleanValue();
        }
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }
}
