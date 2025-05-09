package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WidgetFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static float phone_orientation = Float.NaN;
    public float alpha;
    public int bottom;
    public float interpolatedPos;
    public int left;
    private final HashMap<String, CustomVariable> mCustom;
    public TypedBundle mMotionProperties;
    public String name;
    public float pivotX;
    public float pivotY;
    public int right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public ConstraintWidget widget;

    public WidgetFrame() {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
    }

    private static void add(StringBuilder sb, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9ed516", new Object[]{sb, str, new Integer(i)});
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void interpolate(int i, int i2, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, WidgetFrame widgetFrame3, Transition transition, float f) {
        int i3;
        int i4;
        float f2;
        int i5;
        int i6;
        float f3;
        float f4;
        int i7;
        int i8;
        int i9;
        int i10;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52daef5e", new Object[]{new Integer(i), new Integer(i2), widgetFrame, widgetFrame2, widgetFrame3, transition, new Float(f)});
            return;
        }
        float f5 = 100.0f * f;
        int i11 = (int) f5;
        int i12 = widgetFrame2.left;
        int i13 = widgetFrame2.top;
        int i14 = widgetFrame3.left;
        int i15 = widgetFrame3.top;
        int i16 = widgetFrame2.right - i12;
        int i17 = widgetFrame2.bottom - i13;
        int i18 = widgetFrame3.right - i14;
        int i19 = widgetFrame3.bottom - i15;
        float f6 = widgetFrame2.alpha;
        float f7 = widgetFrame3.alpha;
        if (widgetFrame2.visibility == 8) {
            int i20 = i12 - ((int) (i18 / 2.0f));
            int i21 = i13 - ((int) (i19 / 2.0f));
            if (Float.isNaN(f6)) {
                i16 = i18;
                i17 = i19;
                i3 = i21;
                i4 = i20;
                f2 = 0.0f;
            } else {
                i17 = i19;
                i3 = i21;
                i4 = i20;
                f2 = f6;
                i16 = i18;
            }
        } else {
            f2 = f6;
            i3 = i13;
            i4 = i12;
        }
        if (widgetFrame3.visibility == 8) {
            i14 -= (int) (i16 / 2.0f);
            i15 -= (int) (i17 / 2.0f);
            i18 = i16;
            i19 = i17;
            if (Float.isNaN(f7)) {
                f7 = 0.0f;
            }
        }
        if (Float.isNaN(f2) && !Float.isNaN(f7)) {
            f2 = 1.0f;
        }
        if (!Float.isNaN(f2) && Float.isNaN(f7)) {
            f7 = 1.0f;
        }
        if (widgetFrame2.visibility == 4) {
            f2 = 0.0f;
        }
        if (widgetFrame3.visibility == 4) {
            f7 = 0.0f;
        }
        if (widgetFrame.widget == null || !transition.hasPositionKeyframes()) {
            f4 = 0.0f;
            f3 = f;
            i6 = i4;
            i3 = i3;
            i5 = i14;
        } else {
            Transition.KeyPosition findPreviousPosition = transition.findPreviousPosition(widgetFrame.widget.stringId, i11);
            Transition.KeyPosition findNextPosition = transition.findNextPosition(widgetFrame.widget.stringId, i11);
            if (findPreviousPosition == findNextPosition) {
                findNextPosition = null;
            }
            if (findPreviousPosition != null) {
                i8 = i;
                i6 = (int) (findPreviousPosition.mX * i8);
                i5 = i14;
                i7 = i2;
                i3 = (int) (findPreviousPosition.mY * i7);
                i9 = findPreviousPosition.mFrame;
                f4 = 0.0f;
            } else {
                i8 = i;
                i5 = i14;
                f4 = 0.0f;
                i7 = i2;
                i6 = i4;
                i9 = 0;
            }
            if (findNextPosition != null) {
                i5 = (int) (findNextPosition.mX * i8);
                i15 = (int) (findNextPosition.mY * i7);
                i10 = findNextPosition.mFrame;
            } else {
                i10 = 100;
            }
            f3 = (f5 - i9) / (i10 - i9);
        }
        widgetFrame.widget = widgetFrame2.widget;
        int i22 = (int) (i6 + ((i5 - i6) * f3));
        widgetFrame.left = i22;
        int i23 = (int) (i3 + (f3 * (i15 - i3)));
        widgetFrame.top = i23;
        float f8 = 1.0f - f;
        widgetFrame.right = i22 + ((int) ((i16 * f8) + (i18 * f)));
        widgetFrame.bottom = i23 + ((int) ((f8 * i17) + (i19 * f)));
        widgetFrame.pivotX = interpolate(widgetFrame2.pivotX, widgetFrame3.pivotX, 0.5f, f);
        widgetFrame.pivotY = interpolate(widgetFrame2.pivotY, widgetFrame3.pivotY, 0.5f, f);
        widgetFrame.rotationX = interpolate(widgetFrame2.rotationX, widgetFrame3.rotationX, f4, f);
        widgetFrame.rotationY = interpolate(widgetFrame2.rotationY, widgetFrame3.rotationY, f4, f);
        widgetFrame.rotationZ = interpolate(widgetFrame2.rotationZ, widgetFrame3.rotationZ, f4, f);
        widgetFrame.scaleX = interpolate(widgetFrame2.scaleX, widgetFrame3.scaleX, 1.0f, f);
        widgetFrame.scaleY = interpolate(widgetFrame2.scaleY, widgetFrame3.scaleY, 1.0f, f);
        widgetFrame.translationX = interpolate(widgetFrame2.translationX, widgetFrame3.translationX, f4, f);
        widgetFrame.translationY = interpolate(widgetFrame2.translationY, widgetFrame3.translationY, f4, f);
        widgetFrame.translationZ = interpolate(widgetFrame2.translationZ, widgetFrame3.translationZ, f4, f);
        widgetFrame.alpha = interpolate(f2, f7, 1.0f, f);
        Set<String> keySet = widgetFrame3.mCustom.keySet();
        widgetFrame.mCustom.clear();
        for (String str : keySet) {
            if (widgetFrame2.mCustom.containsKey(str)) {
                CustomVariable customVariable = widgetFrame2.mCustom.get(str);
                CustomVariable customVariable2 = widgetFrame3.mCustom.get(str);
                CustomVariable customVariable3 = new CustomVariable(customVariable);
                widgetFrame.mCustom.put(str, customVariable3);
                if (customVariable.numberOfInterpolatedValues() == 1) {
                    customVariable3.setValue(Float.valueOf(interpolate(customVariable.getValueToInterpolate(), customVariable2.getValueToInterpolate(), f4, f)));
                } else {
                    int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
                    float[] fArr = new float[numberOfInterpolatedValues];
                    float[] fArr2 = new float[numberOfInterpolatedValues];
                    customVariable.getValuesToInterpolate(fArr);
                    customVariable2.getValuesToInterpolate(fArr2);
                    for (int i24 = 0; i24 < numberOfInterpolatedValues; i24++) {
                        fArr[i24] = interpolate(fArr[i24], fArr2[i24], f4, f);
                        customVariable3.setValue(fArr);
                    }
                }
            }
        }
    }

    private void serializeAnchor(StringBuilder sb, ConstraintAnchor.Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75432ee0", new Object[]{this, sb, type});
            return;
        }
        ConstraintAnchor anchor = this.widget.getAnchor(type);
        if (anchor != null && anchor.mTarget != null) {
            sb.append(z9u.SEARCH_ANCHOR_FEED);
            sb.append(type.name());
            sb.append(": ['");
            String str = anchor.mTarget.getOwner().stringId;
            if (str == null) {
                str = "#PARENT";
            }
            sb.append(str);
            sb.append("', '");
            sb.append(anchor.mTarget.getType().name());
            sb.append("', '");
            sb.append(anchor.mMargin);
            sb.append("'],\n");
        }
    }

    public void addCustomColor(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa14461", new Object[]{this, str, new Integer(i)});
        } else {
            setCustomAttribute(str, 902, i);
        }
    }

    public void addCustomFloat(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340bfe05", new Object[]{this, str, new Float(f)});
        } else {
            setCustomAttribute(str, 901, f);
        }
    }

    public float centerX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6326399a", new Object[]{this})).floatValue();
        }
        int i = this.left;
        return i + ((this.right - i) / 2.0f);
    }

    public float centerY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6334511b", new Object[]{this})).floatValue();
        }
        int i = this.top;
        return i + ((this.bottom - i) / 2.0f);
    }

    public boolean containsCustom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82986105", new Object[]{this, str})).booleanValue();
        }
        return this.mCustom.containsKey(str);
    }

    public CustomVariable getCustomAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomVariable) ipChange.ipc$dispatch("41e64727", new Object[]{this, str});
        }
        return this.mCustom.get(str);
    }

    public Set<String> getCustomAttributeNames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("713b51c9", new Object[]{this});
        }
        return this.mCustom.keySet();
    }

    public int getCustomColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15c0dec0", new Object[]{this, str})).intValue();
        }
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getColorValue();
        }
        return -21880;
    }

    public float getCustomFloat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("150660f6", new Object[]{this, str})).floatValue();
        }
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getFloatValue();
        }
        return Float.NaN;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget == null) {
            return "unknown";
        }
        return constraintWidget.stringId;
    }

    public TypedBundle getMotionProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypedBundle) ipChange.ipc$dispatch("359cb114", new Object[]{this});
        }
        return this.mMotionProperties;
    }

    public int height() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58c32a21", new Object[]{this})).intValue();
        }
        return Math.max(0, this.bottom - this.top);
    }

    public boolean isDefaultTransform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8534ad80", new Object[]{this})).booleanValue();
        }
        if (!Float.isNaN(this.rotationX) || !Float.isNaN(this.rotationY) || !Float.isNaN(this.rotationZ) || !Float.isNaN(this.translationX) || !Float.isNaN(this.translationY) || !Float.isNaN(this.translationZ) || !Float.isNaN(this.scaleX) || !Float.isNaN(this.scaleY) || !Float.isNaN(this.alpha)) {
            return false;
        }
        return true;
    }

    public void logv(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f8cec3", new Object[]{this, str});
            return;
        }
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str3 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.widget != null) {
            str2 = str3 + "/" + (this.widget.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        System.out.println(str2 + " " + str);
    }

    public StringBuilder serialize(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StringBuilder) ipChange.ipc$dispatch("19316abf", new Object[]{this, sb}) : serialize(sb, false);
    }

    public void setCustomAttribute(String str, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2cbdd7", new Object[]{this, str, new Integer(i), new Float(f)});
        } else if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setFloatValue(f);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i, f));
        }
    }

    public void setCustomValue(CustomAttribute customAttribute, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f721e227", new Object[]{this, customAttribute, fArr});
        }
    }

    public void setMotionAttributes(TypedBundle typedBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e660b1e8", new Object[]{this, typedBundle});
        } else {
            this.mMotionProperties = typedBundle;
        }
    }

    public WidgetFrame update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetFrame) ipChange.ipc$dispatch("cf8865b8", new Object[]{this});
        }
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget != null) {
            this.left = constraintWidget.getLeft();
            this.top = this.widget.getTop();
            this.right = this.widget.getRight();
            this.bottom = this.widget.getBottom();
            updateAttributes(this.widget.frame);
        }
        return this;
    }

    public void updateAttributes(WidgetFrame widgetFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2553cf79", new Object[]{this, widgetFrame});
        } else if (widgetFrame != null) {
            this.pivotX = widgetFrame.pivotX;
            this.pivotY = widgetFrame.pivotY;
            this.rotationX = widgetFrame.rotationX;
            this.rotationY = widgetFrame.rotationY;
            this.rotationZ = widgetFrame.rotationZ;
            this.translationX = widgetFrame.translationX;
            this.translationY = widgetFrame.translationY;
            this.translationZ = widgetFrame.translationZ;
            this.scaleX = widgetFrame.scaleX;
            this.scaleY = widgetFrame.scaleY;
            this.alpha = widgetFrame.alpha;
            this.visibility = widgetFrame.visibility;
            setMotionAttributes(widgetFrame.mMotionProperties);
            this.mCustom.clear();
            for (CustomVariable customVariable : widgetFrame.mCustom.values()) {
                this.mCustom.put(customVariable.getName(), customVariable.copy());
            }
        }
    }

    public void printCustomAttributes() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ae767c", new Object[]{this});
            return;
        }
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.widget != null) {
            str = str2 + "/" + (this.widget.hashCode() % 1000) + " ";
        } else {
            str = str2 + "/NULL ";
        }
        HashMap<String, CustomVariable> hashMap = this.mCustom;
        if (hashMap != null) {
            Iterator<String> it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                System.out.println(str + this.mCustom.get(it.next()).toString());
            }
        }
    }

    public StringBuilder serialize(StringBuilder sb, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("1b5eb0cb", new Object[]{this, sb, new Boolean(z)});
        }
        sb.append("{\n");
        add(sb, "left", this.left);
        add(sb, "top", this.top);
        add(sb, "right", this.right);
        add(sb, "bottom", this.bottom);
        add(sb, "pivotX", this.pivotX);
        add(sb, "pivotY", this.pivotY);
        add(sb, "rotationX", this.rotationX);
        add(sb, "rotationY", this.rotationY);
        add(sb, "rotationZ", this.rotationZ);
        add(sb, "translationX", this.translationX);
        add(sb, "translationY", this.translationY);
        add(sb, "translationZ", this.translationZ);
        add(sb, "scaleX", this.scaleX);
        add(sb, "scaleY", this.scaleY);
        add(sb, "alpha", this.alpha);
        add(sb, "visibility", this.visibility);
        add(sb, "interpolatedPos", this.interpolatedPos);
        if (this.widget != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                serializeAnchor(sb, type);
            }
        }
        if (z) {
            add(sb, "phone_orientation", phone_orientation);
        }
        if (z) {
            add(sb, "phone_orientation", phone_orientation);
        }
        if (this.mCustom.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.mCustom.keySet()) {
                CustomVariable customVariable = this.mCustom.get(str);
                sb.append(str);
                sb.append(": ");
                switch (customVariable.getType()) {
                    case 900:
                        sb.append(customVariable.getIntegerValue());
                        sb.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb.append(customVariable.getFloatValue());
                        sb.append(",\n");
                        break;
                    case 902:
                        sb.append("'");
                        sb.append(CustomVariable.colorString(customVariable.getIntegerValue()));
                        sb.append("',\n");
                        break;
                    case 903:
                        sb.append("'");
                        sb.append(customVariable.getStringValue());
                        sb.append("',\n");
                        break;
                    case 904:
                        sb.append("'");
                        sb.append(customVariable.getBooleanValue());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public int width() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcdb5f40", new Object[]{this})).intValue();
        }
        return Math.max(0, this.right - this.left);
    }

    public void parseCustom(CLElement cLElement) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb90005", new Object[]{this, cLElement});
            return;
        }
        CLObject cLObject = (CLObject) cLElement;
        int size = cLObject.size();
        for (int i = 0; i < size; i++) {
            CLElement value = ((CLKey) cLObject.get(i)).getValue();
            String content = value.content();
            if (content.matches("#[0-9a-fA-F]+")) {
                setCustomAttribute(this.name, 902, Integer.parseInt(content.substring(1), 16));
            } else if (value instanceof CLNumber) {
                setCustomAttribute(this.name, 901, value.getFloat());
            } else {
                setCustomAttribute(this.name, 903, content);
            }
        }
    }

    public void setCustomAttribute(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2cc91a", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setIntValue(i2);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i, i2));
        }
    }

    private static void add(StringBuilder sb, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9ec9d3", new Object[]{sb, str, new Float(f)});
        } else if (!Float.isNaN(f)) {
            sb.append(str);
            sb.append(": ");
            sb.append(f);
            sb.append(",\n");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
        if (r7.equals("custom") == false) goto L_0x002a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean setValue(java.lang.String r7, androidx.constraintlayout.core.parser.CLElement r8) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.WidgetFrame.setValue(java.lang.String, androidx.constraintlayout.core.parser.CLElement):boolean");
    }

    public void setCustomAttribute(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2d08eb", new Object[]{this, str, new Integer(i), new Boolean(z)});
        } else if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setBooleanValue(z);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i, z));
        }
    }

    public WidgetFrame update(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetFrame) ipChange.ipc$dispatch("b1059c6", new Object[]{this, constraintWidget});
        }
        if (constraintWidget == null) {
            return this;
        }
        this.widget = constraintWidget;
        update();
        return this;
    }

    public void setCustomAttribute(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02ae493", new Object[]{this, str, new Integer(i), str2});
        } else if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setStringValue(str2);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i, str2));
        }
    }

    public WidgetFrame(ConstraintWidget constraintWidget) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
        this.widget = constraintWidget;
    }

    public WidgetFrame(WidgetFrame widgetFrame) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
        this.widget = widgetFrame.widget;
        this.left = widgetFrame.left;
        this.top = widgetFrame.top;
        this.right = widgetFrame.right;
        this.bottom = widgetFrame.bottom;
        updateAttributes(widgetFrame);
    }

    private static float interpolate(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e06220f8", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)})).floatValue();
        }
        boolean isNaN = Float.isNaN(f);
        boolean isNaN2 = Float.isNaN(f2);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f = f3;
        }
        if (isNaN2) {
            f2 = f3;
        }
        return f + (f4 * (f2 - f));
    }
}
