package androidx.constraintlayout.core.motion;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CustomAttribute {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
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

        private AttributeType(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(AttributeType attributeType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/CustomAttribute$AttributeType");
        }

        public static AttributeType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AttributeType) ipChange.ipc$dispatch("6e4550b8", new Object[]{str});
            }
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AttributeType[]) ipChange.ipc$dispatch("be234ee7", new Object[0]);
            }
            return (AttributeType[]) $VALUES.clone();
        }

        private static /* synthetic */ AttributeType[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AttributeType[]) ipChange.ipc$dispatch("f45da243", new Object[0]) : new AttributeType[]{INT_TYPE, FLOAT_TYPE, COLOR_TYPE, COLOR_DRAWABLE_TYPE, STRING_TYPE, BOOLEAN_TYPE, DIMENSION_TYPE, REFERENCE_TYPE};
        }
    }

    public CustomAttribute(String str, AttributeType attributeType) {
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

    public static int hsvToRgb(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("727b5da5", new Object[]{new Float(f), new Float(f2), new Float(f3)})).intValue();
        }
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - i;
        float f6 = f3 * 255.0f;
        int i2 = (int) (((1.0f - f2) * f6) + 0.5f);
        int i3 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i4 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i5 = (int) (f6 + 0.5f);
        if (i == 0) {
            return ((i5 << 16) + (i4 << 8) + i2) | (-16777216);
        }
        if (i == 1) {
            return ((i3 << 16) + (i5 << 8) + i2) | (-16777216);
        }
        if (i == 2) {
            return ((i2 << 16) + (i5 << 8) + i4) | (-16777216);
        }
        if (i == 3) {
            return ((i2 << 16) + (i3 << 8) + i5) | (-16777216);
        }
        if (i == 4) {
            return ((i4 << 16) + (i2 << 8) + i5) | (-16777216);
        }
        if (i != 5) {
            return 0;
        }
        return ((i5 << 16) + (i2 << 8) + i3) | (-16777216);
    }

    public boolean diff(CustomAttribute customAttribute) {
        AttributeType attributeType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a16ccfb9", new Object[]{this, customAttribute})).booleanValue();
        }
        if (customAttribute == null || (attributeType = this.mType) != customAttribute.mType) {
            return false;
        }
        switch (attributeType.ordinal()) {
            case 0:
            case 7:
                if (this.mIntegerValue == customAttribute.mIntegerValue) {
                    return true;
                }
                return false;
            case 1:
                if (this.mFloatValue == customAttribute.mFloatValue) {
                    return true;
                }
                return false;
            case 2:
            case 3:
                if (this.mColorValue == customAttribute.mColorValue) {
                    return true;
                }
                return false;
            case 4:
                if (this.mIntegerValue == customAttribute.mIntegerValue) {
                    return true;
                }
                return false;
            case 5:
                if (this.mBooleanValue == customAttribute.mBooleanValue) {
                    return true;
                }
                return false;
            case 6:
                if (this.mFloatValue == customAttribute.mFloatValue) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public AttributeType getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AttributeType) ipChange.ipc$dispatch("c4d32636", new Object[]{this});
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
            case 6:
                return this.mFloatValue;
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
                int hsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.mColorValue = hsvToRgb;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (hsvToRgb & 16777215);
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

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
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

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.mMethod = false;
        this.mName = customAttribute.mName;
        this.mType = customAttribute.mType;
        setValue(obj);
    }
}
