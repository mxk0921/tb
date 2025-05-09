package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TintTypedArray {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context mContext;
    private TypedValue mTypedValue;
    private final TypedArray mWrapped;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static int getChangingConfigurations(TypedArray typedArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d4a054b5", new Object[]{typedArray})).intValue();
            }
            return typedArray.getChangingConfigurations();
        }

        public static int getType(TypedArray typedArray, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("85241bc4", new Object[]{typedArray, new Integer(i)})).intValue();
            }
            return typedArray.getType(i);
        }
    }

    private TintTypedArray(Context context, TypedArray typedArray) {
        this.mContext = context;
        this.mWrapped = typedArray;
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TintTypedArray) ipChange.ipc$dispatch("2cf61798", new Object[]{context, attributeSet, iArr}) : new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public boolean getBoolean(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6c8896e", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        return this.mWrapped.getBoolean(i, z);
    }

    public int getChangingConfigurations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("582cb37a", new Object[]{this})).intValue();
        }
        return Api21Impl.getChangingConfigurations(this.mWrapped);
    }

    public int getColor(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0fbff07", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return this.mWrapped.getColor(i, i2);
    }

    public ColorStateList getColorStateList(int i) {
        int resourceId;
        ColorStateList colorStateList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("8c9d725a", new Object[]{this, new Integer(i)});
        }
        if (!this.mWrapped.hasValue(i) || (resourceId = this.mWrapped.getResourceId(i, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(this.mContext, resourceId)) == null) {
            return this.mWrapped.getColorStateList(i);
        }
        return colorStateList;
    }

    public float getDimension(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6a7ee84", new Object[]{this, new Integer(i), new Float(f)})).floatValue();
        }
        return this.mWrapped.getDimension(i, f);
    }

    public int getDimensionPixelOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79b56e43", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return this.mWrapped.getDimensionPixelOffset(i, i2);
    }

    public int getDimensionPixelSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3e85cb1", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return this.mWrapped.getDimensionPixelSize(i, i2);
    }

    public Drawable getDrawableIfKnown(int i) {
        int resourceId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("88277e50", new Object[]{this, new Integer(i)});
        }
        if (!this.mWrapped.hasValue(i) || (resourceId = this.mWrapped.getResourceId(i, 0)) == 0) {
            return null;
        }
        return AppCompatDrawableManager.get().getDrawable(this.mContext, resourceId, true);
    }

    public float getFloat(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b1707fa", new Object[]{this, new Integer(i), new Float(f)})).floatValue();
        }
        return this.mWrapped.getFloat(i, f);
    }

    public float getFraction(int i, int i2, int i3, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc150dec", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Float(f)})).floatValue();
        }
        return this.mWrapped.getFraction(i, i2, i3, f);
    }

    public int getIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17f3c1b3", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mWrapped.getIndex(i);
    }

    public int getIndexCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18da464d", new Object[]{this})).intValue();
        }
        return this.mWrapped.getIndexCount();
    }

    public int getInt(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb67f913", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return this.mWrapped.getInt(i, i2);
    }

    public int getInteger(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ac7b622", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return this.mWrapped.getInteger(i, i2);
    }

    public int getLayoutDimension(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6d9c8c33", new Object[]{this, new Integer(i), str})).intValue() : this.mWrapped.getLayoutDimension(i, str);
    }

    public String getNonResourceString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719b0d7a", new Object[]{this, new Integer(i)});
        }
        return this.mWrapped.getNonResourceString(i);
    }

    public String getPositionDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ade3df3c", new Object[]{this});
        }
        return this.mWrapped.getPositionDescription();
    }

    public int getResourceId(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3380d99", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return this.mWrapped.getResourceId(i, i2);
    }

    public Resources getResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        return this.mWrapped.getResources();
    }

    public String getString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
        }
        return this.mWrapped.getString(i);
    }

    public CharSequence getText(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("3f7ccc01", new Object[]{this, new Integer(i)});
        }
        return this.mWrapped.getText(i);
    }

    public CharSequence[] getTextArray(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence[]) ipChange.ipc$dispatch("c5a74c4f", new Object[]{this, new Integer(i)});
        }
        return this.mWrapped.getTextArray(i);
    }

    public int getType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b8cd59f", new Object[]{this, new Integer(i)})).intValue();
        }
        return Api21Impl.getType(this.mWrapped, i);
    }

    public boolean getValue(int i, TypedValue typedValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29538710", new Object[]{this, new Integer(i), typedValue})).booleanValue();
        }
        return this.mWrapped.getValue(i, typedValue);
    }

    public TypedArray getWrappedTypeArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedArray) ipChange.ipc$dispatch("b1fe03fa", new Object[]{this});
        }
        return this.mWrapped;
    }

    public boolean hasValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a00da2c9", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.mWrapped.hasValue(i);
    }

    public int length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        return this.mWrapped.length();
    }

    public TypedValue peekValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedValue) ipChange.ipc$dispatch("6ea39323", new Object[]{this, new Integer(i)});
        }
        return this.mWrapped.peekValue(i);
    }

    public void recycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
        } else {
            this.mWrapped.recycle();
        }
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TintTypedArray) ipChange.ipc$dispatch("22ccd5b8", new Object[]{context, attributeSet, iArr, new Integer(i), new Integer(i2)}) : new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public Drawable getDrawable(int i) {
        int resourceId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("f226a6f2", new Object[]{this, new Integer(i)});
        }
        if (!this.mWrapped.hasValue(i) || (resourceId = this.mWrapped.getResourceId(i, 0)) == 0) {
            return this.mWrapped.getDrawable(i);
        }
        return AppCompatResources.getDrawable(this.mContext, resourceId);
    }

    public Typeface getFont(int i, int i2, ResourcesCompat.FontCallback fontCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("cd108df1", new Object[]{this, new Integer(i), new Integer(i2), fontCallback});
        }
        int resourceId = this.mWrapped.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        return ResourcesCompat.getFont(this.mContext, resourceId, this.mTypedValue, i2, fontCallback);
    }

    public int getLayoutDimension(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5be2bdc0", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : this.mWrapped.getLayoutDimension(i, i2);
    }

    public static TintTypedArray obtainStyledAttributes(Context context, int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TintTypedArray) ipChange.ipc$dispatch("2f08803", new Object[]{context, new Integer(i), iArr}) : new TintTypedArray(context, context.obtainStyledAttributes(i, iArr));
    }
}
