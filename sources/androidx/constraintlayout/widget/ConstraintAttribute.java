package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConstraintAttribute {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "TransitionLayout";
    public boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    public String mName;
    private String mStringValue;
    private AttributeType mType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AttributeType extends Enum<AttributeType> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AttributeType INT_TYPE = new AttributeType("INT_TYPE", 0);
        public static final AttributeType FLOAT_TYPE = new AttributeType("FLOAT_TYPE", 1);
        public static final AttributeType COLOR_TYPE = new AttributeType("COLOR_TYPE", 2);
        public static final AttributeType COLOR_DRAWABLE_TYPE = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
        public static final AttributeType STRING_TYPE = new AttributeType("STRING_TYPE", 4);
        public static final AttributeType BOOLEAN_TYPE = new AttributeType("BOOLEAN_TYPE", 5);
        public static final AttributeType DIMENSION_TYPE = new AttributeType("DIMENSION_TYPE", 6);
        public static final AttributeType REFERENCE_TYPE = new AttributeType("REFERENCE_TYPE", 7);
        private static final /* synthetic */ AttributeType[] $VALUES = $values();

        private static /* synthetic */ AttributeType[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AttributeType[]) ipChange.ipc$dispatch("466eb919", new Object[0]) : new AttributeType[]{INT_TYPE, FLOAT_TYPE, COLOR_TYPE, COLOR_DRAWABLE_TYPE, STRING_TYPE, BOOLEAN_TYPE, DIMENSION_TYPE, REFERENCE_TYPE};
        }

        private AttributeType(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(AttributeType attributeType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/widget/ConstraintAttribute$AttributeType");
        }

        public static AttributeType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AttributeType) ipChange.ipc$dispatch("84ce804", new Object[]{str});
            }
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AttributeType[]) ipChange.ipc$dispatch("44aee7f5", new Object[0]);
            }
            return (AttributeType[]) $VALUES.clone();
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
    }

    private static int clamp(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9591374", new Object[]{new Integer(i)})).intValue();
        }
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static HashMap<String, ConstraintAttribute> extractAttributes(HashMap<String, ConstraintAttribute> hashMap, View view) {
        HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                Log.e(TAG, " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
            } catch (NoSuchMethodException e2) {
                Log.e(TAG, cls.getName() + " must have a method " + str, e2);
            } catch (InvocationTargetException e3) {
                Log.e(TAG, " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e3);
            }
        }
        return hashMap2;
    }

    public static void parse(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        AttributeType attributeType;
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2babdebb", new Object[]{context, xmlPullParser, hashMap});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == R.styleable.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == R.styleable.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == R.styleable.CustomAttribute_customColorValue) {
                    attributeType = AttributeType.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customColorDrawableValue) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == R.styleable.CustomAttribute_customPixelDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == R.styleable.CustomAttribute_customDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.CustomAttribute_customFloatValue) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == R.styleable.CustomAttribute_customIntegerValue) {
                    attributeType = AttributeType.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == R.styleable.CustomAttribute_customStringValue) {
                    attributeType = AttributeType.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.CustomAttribute_customReference) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                attributeType2 = attributeType;
                obj = valueOf;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public boolean diff(ConstraintAttribute constraintAttribute) {
        AttributeType attributeType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36c0ed49", new Object[]{this, constraintAttribute})).booleanValue();
        }
        if (constraintAttribute == null || (attributeType = this.mType) != constraintAttribute.mType) {
            return false;
        }
        switch (attributeType.ordinal()) {
            case 0:
            case 7:
                if (this.mIntegerValue == constraintAttribute.mIntegerValue) {
                    return true;
                }
                return false;
            case 1:
                if (this.mFloatValue == constraintAttribute.mFloatValue) {
                    return true;
                }
                return false;
            case 2:
            case 3:
                if (this.mColorValue == constraintAttribute.mColorValue) {
                    return true;
                }
                return false;
            case 4:
                if (this.mIntegerValue == constraintAttribute.mIntegerValue) {
                    return true;
                }
                return false;
            case 5:
                if (this.mBooleanValue == constraintAttribute.mBooleanValue) {
                    return true;
                }
                return false;
            case 6:
                if (this.mFloatValue == constraintAttribute.mFloatValue) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public int getColorValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92b8523e", new Object[]{this})).intValue();
        }
        return this.mColorValue;
    }

    public float getFloatValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47eea762", new Object[]{this})).floatValue();
        }
        return this.mFloatValue;
    }

    public int getIntegerValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24498143", new Object[]{this})).intValue();
        }
        return this.mIntegerValue;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mName;
    }

    public String getStringValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a666728f", new Object[]{this});
        }
        return this.mStringValue;
    }

    public AttributeType getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AttributeType) ipChange.ipc$dispatch("ea0f6ac6", new Object[]{this});
        }
        return this.mType;
    }

    public float getValueToInterpolate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6e18e82", new Object[]{this})).floatValue();
        }
        switch (this.mType.ordinal()) {
            case 0:
                return this.mIntegerValue;
            case 1:
            case 6:
                return this.mFloatValue;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                if (this.mBooleanValue) {
                    return 1.0f;
                }
                return 0.0f;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248a0e60", new Object[]{this, fArr});
            return;
        }
        switch (this.mType.ordinal()) {
            case 0:
                fArr[0] = this.mIntegerValue;
                return;
            case 1:
                fArr[0] = this.mFloatValue;
                return;
            case 2:
            case 3:
                int i = this.mColorValue;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                if (this.mBooleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case 6:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public boolean isBooleanValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d5c937e", new Object[]{this})).booleanValue();
        }
        return this.mBooleanValue;
    }

    public boolean isContinuous() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f8bbfe4", new Object[]{this})).booleanValue();
        }
        int ordinal = this.mType.ordinal();
        if (ordinal == 4 || ordinal == 5 || ordinal == 7) {
            return false;
        }
        return true;
    }

    public boolean isMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5640f9b6", new Object[]{this})).booleanValue();
        }
        return this.mMethod;
    }

    public int numberOfInterpolatedValues() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8273f9f", new Object[]{this})).intValue();
        }
        int ordinal = this.mType.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            return 4;
        }
        return 1;
    }

    public void setColorValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb29038c", new Object[]{this, new Integer(i)});
        } else {
            this.mColorValue = i;
        }
    }

    public void setFloatValue(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbd4802", new Object[]{this, new Float(f)});
        } else {
            this.mFloatValue = f;
        }
    }

    public void setIntValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b0e498", new Object[]{this, new Integer(i)});
        } else {
            this.mIntegerValue = i;
        }
    }

    public void setStringValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1f0e2f", new Object[]{this, str});
        } else {
            this.mStringValue = str;
        }
    }

    public void setValue(float[] fArr) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f4b581", new Object[]{this, fArr});
            return;
        }
        switch (this.mType.ordinal()) {
            case 0:
            case 7:
                this.mIntegerValue = (int) fArr[0];
                return;
            case 1:
                this.mFloatValue = fArr[0];
                return;
            case 2:
            case 3:
                int HSVToColor = Color.HSVToColor(fArr);
                this.mColorValue = HSVToColor;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (HSVToColor & 16777215);
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                if (fArr[0] <= 0.5d) {
                    z = false;
                }
                this.mBooleanValue = z;
                return;
            case 6:
                this.mFloatValue = fArr[0];
                return;
            default:
                return;
        }
    }

    public static void setAttributes(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            String str2 = !constraintAttribute.mMethod ? "set" + str : str;
            try {
                switch (constraintAttribute.mType.ordinal()) {
                    case 0:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.mIntegerValue));
                        break;
                    case 1:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                    case 2:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.mColorValue));
                        break;
                    case 3:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.mColorValue);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str2, CharSequence.class).invoke(view, constraintAttribute.mStringValue);
                        break;
                    case 5:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.mBooleanValue));
                        break;
                    case 6:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                    case 7:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.mIntegerValue));
                        break;
                }
            } catch (IllegalAccessException e) {
                Log.e(TAG, " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
            } catch (NoSuchMethodException e2) {
                Log.e(TAG, cls.getName() + " must have a method " + str2, e2);
            } catch (InvocationTargetException e3) {
                Log.e(TAG, " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e3);
            }
        }
    }

    public void applyCustom(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.mName;
        if (!this.mMethod) {
            str = "set" + str2;
        } else {
            str = str2;
        }
        try {
            switch (this.mType.ordinal()) {
                case 0:
                case 7:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.mIntegerValue));
                    return;
                case 1:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.mFloatValue));
                    return;
                case 2:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.mColorValue));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.mColorValue);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.mStringValue);
                    return;
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.mBooleanValue));
                    return;
                case 6:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.mFloatValue));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            Log.e(TAG, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
        } catch (NoSuchMethodException e2) {
            Log.e(TAG, cls.getName() + " must have a method " + str, e2);
        } catch (InvocationTargetException e3) {
            Log.e(TAG, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e3);
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z;
        setValue(obj);
    }

    public void setValue(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63f592", new Object[]{this, obj});
            return;
        }
        switch (this.mType.ordinal()) {
            case 0:
            case 7:
                this.mIntegerValue = ((Integer) obj).intValue();
                return;
            case 1:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.mColorValue = ((Integer) obj).intValue();
                return;
            case 4:
                this.mStringValue = (String) obj;
                return;
            case 5:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.mMethod = false;
        this.mName = constraintAttribute.mName;
        this.mType = constraintAttribute.mType;
        setValue(obj);
    }
}
