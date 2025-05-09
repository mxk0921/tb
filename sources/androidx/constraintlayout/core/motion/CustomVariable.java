package androidx.constraintlayout.core.motion;

import com.android.alibaba.ip.runtime.IpChange;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CustomVariable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TransitionLayout";
    public boolean mBooleanValue;
    private float mFloatValue;
    private int mIntegerValue;
    public String mName;
    private String mStringValue;
    private int mType;

    public CustomVariable(CustomVariable customVariable) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = customVariable.mName;
        this.mType = customVariable.mType;
        this.mIntegerValue = customVariable.mIntegerValue;
        this.mFloatValue = customVariable.mFloatValue;
        this.mStringValue = customVariable.mStringValue;
        this.mBooleanValue = customVariable.mBooleanValue;
    }

    private static int clamp(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9591374", new Object[]{new Integer(i)})).intValue();
        }
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static String colorString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7514718", new Object[]{new Integer(i)});
        }
        String str = "00000000" + Integer.toHexString(i);
        return "#" + str.substring(str.length() - 8);
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

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7957649", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)})).intValue();
        }
        return (clamp((int) (f * 255.0f)) << 16) | (clamp((int) (f4 * 255.0f)) << 24) | (clamp((int) (f2 * 255.0f)) << 8) | clamp((int) (f3 * 255.0f));
    }

    public void applyToWidget(MotionWidget motionWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f7951e", new Object[]{this, motionWidget});
            return;
        }
        int i = this.mType;
        switch (i) {
            case 900:
            case 902:
            case 906:
                motionWidget.setCustomAttribute(this.mName, i, this.mIntegerValue);
                return;
            case 901:
            case 905:
                motionWidget.setCustomAttribute(this.mName, i, this.mFloatValue);
                return;
            case 903:
                motionWidget.setCustomAttribute(this.mName, i, this.mStringValue);
                return;
            case 904:
                motionWidget.setCustomAttribute(this.mName, i, this.mBooleanValue);
                return;
            default:
                return;
        }
    }

    public CustomVariable copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomVariable) ipChange.ipc$dispatch("43466031", new Object[]{this});
        }
        return new CustomVariable(this);
    }

    public boolean diff(CustomVariable customVariable) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("403ffca7", new Object[]{this, customVariable})).booleanValue();
        }
        if (customVariable == null || (i = this.mType) != customVariable.mType) {
            return false;
        }
        switch (i) {
            case 900:
            case 906:
                if (this.mIntegerValue == customVariable.mIntegerValue) {
                    return true;
                }
                return false;
            case 901:
                if (this.mFloatValue == customVariable.mFloatValue) {
                    return true;
                }
                return false;
            case 902:
                if (this.mIntegerValue == customVariable.mIntegerValue) {
                    return true;
                }
                return false;
            case 903:
                if (this.mIntegerValue == customVariable.mIntegerValue) {
                    return true;
                }
                return false;
            case 904:
                if (this.mBooleanValue == customVariable.mBooleanValue) {
                    return true;
                }
                return false;
            case 905:
                if (this.mFloatValue == customVariable.mFloatValue) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public boolean getBooleanValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b4c3daa", new Object[]{this})).booleanValue();
        }
        return this.mBooleanValue;
    }

    public int getColorValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92b8523e", new Object[]{this})).intValue();
        }
        return this.mIntegerValue;
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

    public int getInterpolatedColor(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b72ae3ef", new Object[]{this, fArr})).intValue();
        }
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
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

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.mType;
    }

    public float getValueToInterpolate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6e18e82", new Object[]{this})).floatValue();
        }
        switch (this.mType) {
            case 900:
                return this.mIntegerValue;
            case 901:
                return this.mFloatValue;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                if (this.mBooleanValue) {
                    return 1.0f;
                }
                return 0.0f;
            case 905:
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
        switch (this.mType) {
            case 900:
                fArr[0] = this.mIntegerValue;
                return;
            case 901:
                fArr[0] = this.mFloatValue;
                return;
            case 902:
                int i = this.mIntegerValue;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                if (this.mBooleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case 905:
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
        int i = this.mType;
        if (i == 903 || i == 904 || i == 906) {
            return false;
        }
        return true;
    }

    public int numberOfInterpolatedValues() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8273f9f", new Object[]{this})).intValue();
        }
        if (this.mType != 902) {
            return 1;
        }
        return 4;
    }

    public void setBooleanValue(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d23662", new Object[]{this, new Boolean(z)});
        } else {
            this.mBooleanValue = z;
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
        switch (this.mType) {
            case 900:
            case 906:
                this.mIntegerValue = (int) fArr[0];
                return;
            case 901:
            case 905:
                this.mFloatValue = fArr[0];
                return;
            case 902:
                this.mIntegerValue = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                if (fArr[0] <= 0.5d) {
                    z = false;
                }
                this.mBooleanValue = z;
                return;
            default:
                return;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = this.mName + f7l.CONDITION_IF_MIDDLE;
        switch (this.mType) {
            case 900:
                return str + this.mIntegerValue;
            case 901:
                return str + this.mFloatValue;
            case 902:
                return str + colorString(this.mIntegerValue);
            case 903:
                return str + this.mStringValue;
            case 904:
                return str + Boolean.valueOf(this.mBooleanValue);
            case 905:
                return str + this.mFloatValue;
            default:
                return str + "????";
        }
    }

    public void setInterpolatedValue(MotionWidget motionWidget, float[] fArr) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de75ade8", new Object[]{this, motionWidget, fArr});
            return;
        }
        int i = this.mType;
        switch (i) {
            case 900:
                motionWidget.setCustomAttribute(this.mName, i, (int) fArr[0]);
                return;
            case 901:
            case 905:
                motionWidget.setCustomAttribute(this.mName, i, fArr[0]);
                return;
            case 902:
                motionWidget.setCustomAttribute(this.mName, this.mType, (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case 903:
            case 906:
                throw new RuntimeException("unable to interpolate " + this.mName);
            case 904:
                String str = this.mName;
                if (fArr[0] <= 0.5f) {
                    z = false;
                }
                motionWidget.setCustomAttribute(str, i, z);
                return;
            default:
                return;
        }
    }

    public CustomVariable(String str, int i, String str2) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mName = str;
        this.mType = i;
        this.mStringValue = str2;
    }

    public void setValue(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63f592", new Object[]{this, obj});
            return;
        }
        switch (this.mType) {
            case 900:
            case 906:
                this.mIntegerValue = ((Integer) obj).intValue();
                return;
            case 901:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            case 902:
                this.mIntegerValue = ((Integer) obj).intValue();
                return;
            case 903:
                this.mStringValue = (String) obj;
                return;
            case 904:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                return;
            case 905:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public CustomVariable(String str, int i, int i2) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i;
        if (i == 901) {
            this.mFloatValue = i2;
        } else {
            this.mIntegerValue = i2;
        }
    }

    public CustomVariable(String str, int i, float f) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i;
        this.mFloatValue = f;
    }

    public CustomVariable(String str, int i, boolean z) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i;
        this.mBooleanValue = z;
    }

    public CustomVariable(String str, int i) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i;
    }

    public CustomVariable(String str, int i, Object obj) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i;
        setValue(obj);
    }

    public CustomVariable(CustomVariable customVariable, Object obj) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = customVariable.mName;
        this.mType = customVariable.mType;
        setValue(obj);
    }
}
