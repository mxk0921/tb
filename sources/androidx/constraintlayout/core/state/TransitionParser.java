package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TransitionParser {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static int map(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bab4905", new Object[]{str, strArr})).intValue();
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return 0;
    }

    @Deprecated
    public static void parse(CLObject cLObject, Transition transition, CorePixelDp corePixelDp) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf9e3e9", new Object[]{cLObject, transition, corePixelDp});
        } else {
            parse(cLObject, transition);
        }
    }

    public static void parseKeyFrames(CLObject cLObject, Transition transition) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5ca9e2", new Object[]{cLObject, transition});
            return;
        }
        CLObject objectOrNull = cLObject.getObjectOrNull("KeyFrames");
        if (objectOrNull != null) {
            CLArray arrayOrNull = objectOrNull.getArrayOrNull("KeyPositions");
            if (arrayOrNull != null) {
                for (int i = 0; i < arrayOrNull.size(); i++) {
                    CLElement cLElement = arrayOrNull.get(i);
                    if (cLElement instanceof CLObject) {
                        parseKeyPosition((CLObject) cLElement, transition);
                    }
                }
            }
            CLArray arrayOrNull2 = objectOrNull.getArrayOrNull(TypedValues.AttributesType.NAME);
            if (arrayOrNull2 != null) {
                for (int i2 = 0; i2 < arrayOrNull2.size(); i2++) {
                    CLElement cLElement2 = arrayOrNull2.get(i2);
                    if (cLElement2 instanceof CLObject) {
                        parseKeyAttribute((CLObject) cLElement2, transition);
                    }
                }
            }
            CLArray arrayOrNull3 = objectOrNull.getArrayOrNull("KeyCycles");
            if (arrayOrNull3 != null) {
                for (int i3 = 0; i3 < arrayOrNull3.size(); i3++) {
                    CLElement cLElement3 = arrayOrNull3.get(i3);
                    if (cLElement3 instanceof CLObject) {
                        parseKeyCycle((CLObject) cLElement3, transition);
                    }
                }
            }
        }
    }

    private static void set(TypedBundle typedBundle, int i, CLArray cLArray, int i2) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d066be", new Object[]{typedBundle, new Integer(i), cLArray, new Integer(i2)});
        } else if (cLArray != null) {
            typedBundle.add(i, cLArray.getFloat(i2));
        }
    }

    public static void parse(CLObject cLObject, Transition transition) throws CLParsingException {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c65c641", new Object[]{cLObject, transition});
            return;
        }
        transition.resetProperties();
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        TypedBundle typedBundle = new TypedBundle();
        if (stringOrNull != null) {
            char c = 65535;
            switch (stringOrNull.hashCode()) {
                case -1857024520:
                    if (stringOrNull.equals("startVertical")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1007052250:
                    if (stringOrNull.equals("startHorizontal")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3145837:
                    if (stringOrNull.equals("flip")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3387192:
                    if (stringOrNull.equals("none")) {
                        c = 3;
                        break;
                    }
                    break;
                case 92611485:
                    if (stringOrNull.equals("above")) {
                        c = 4;
                        break;
                    }
                    break;
                case 93621297:
                    if (stringOrNull.equals("below")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    typedBundle.add(509, 1);
                    break;
                case 1:
                    typedBundle.add(509, 2);
                    break;
                case 2:
                    typedBundle.add(509, 3);
                    break;
                case 3:
                    typedBundle.add(509, 0);
                    break;
                case 4:
                    typedBundle.add(509, 5);
                    break;
                case 5:
                    typedBundle.add(509, 4);
                    break;
            }
            z = true;
        }
        String stringOrNull2 = cLObject.getStringOrNull("interpolator");
        if (stringOrNull2 != null) {
            typedBundle.add(705, stringOrNull2);
            z = true;
        }
        float floatOrNaN = cLObject.getFloatOrNaN(TypedValues.TransitionType.S_STAGGERED);
        if (!Float.isNaN(floatOrNaN)) {
            typedBundle.add(706, floatOrNaN);
        }
        if (z) {
            transition.setTransitionProperties(typedBundle);
        }
        CLObject objectOrNull = cLObject.getObjectOrNull("onSwipe");
        if (objectOrNull != null) {
            parseOnSwipe(objectOrNull, transition);
        }
        parseKeyFrames(cLObject, transition);
    }

    private static void map(TypedBundle typedBundle, int i, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff74b8d", new Object[]{typedBundle, new Integer(i), str, strArr});
            return;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals(str)) {
                typedBundle.add(i, i2);
            }
        }
    }

    private static void parseOnSwipe(CLContainer cLContainer, Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895e2c24", new Object[]{cLContainer, transition});
            return;
        }
        String stringOrNull = cLContainer.getStringOrNull("anchor");
        int map = map(cLContainer.getStringOrNull("side"), Transition.OnSwipe.SIDES);
        int map2 = map(cLContainer.getStringOrNull("direction"), Transition.OnSwipe.DIRECTIONS);
        float floatOrNaN = cLContainer.getFloatOrNaN("scale");
        float floatOrNaN2 = cLContainer.getFloatOrNaN("threshold");
        float floatOrNaN3 = cLContainer.getFloatOrNaN("maxVelocity");
        float floatOrNaN4 = cLContainer.getFloatOrNaN("maxAccel");
        String stringOrNull2 = cLContainer.getStringOrNull("limitBounds");
        int map3 = map(cLContainer.getStringOrNull("mode"), Transition.OnSwipe.MODE);
        int map4 = map(cLContainer.getStringOrNull("touchUp"), Transition.OnSwipe.TOUCH_UP);
        float floatOrNaN5 = cLContainer.getFloatOrNaN("springMass");
        float floatOrNaN6 = cLContainer.getFloatOrNaN("springStiffness");
        float floatOrNaN7 = cLContainer.getFloatOrNaN("springDamping");
        float floatOrNaN8 = cLContainer.getFloatOrNaN("stopThreshold");
        int map5 = map(cLContainer.getStringOrNull("springBoundary"), Transition.OnSwipe.BOUNDARY);
        String stringOrNull3 = cLContainer.getStringOrNull("around");
        Transition.OnSwipe createOnSwipe = transition.createOnSwipe();
        createOnSwipe.setAnchorId(stringOrNull);
        createOnSwipe.setAnchorSide(map);
        createOnSwipe.setDragDirection(map2);
        createOnSwipe.setDragScale(floatOrNaN);
        createOnSwipe.setDragThreshold(floatOrNaN2);
        createOnSwipe.setMaxVelocity(floatOrNaN3);
        createOnSwipe.setMaxAcceleration(floatOrNaN4);
        createOnSwipe.setLimitBoundsTo(stringOrNull2);
        createOnSwipe.setAutoCompleteMode(map3);
        createOnSwipe.setOnTouchUp(map4);
        createOnSwipe.setSpringMass(floatOrNaN5);
        createOnSwipe.setSpringStiffness(floatOrNaN6);
        createOnSwipe.setSpringDamping(floatOrNaN7);
        createOnSwipe.setSpringStopThreshold(floatOrNaN8);
        createOnSwipe.setSpringBoundary(map5);
        createOnSwipe.setRotationCenterId(stringOrNull3);
    }

    private static void parseKeyPosition(CLObject cLObject, Transition transition) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42363f", new Object[]{cLObject, transition});
            return;
        }
        TypedBundle typedBundle = new TypedBundle();
        CLArray array = cLObject.getArray("target");
        CLArray array2 = cLObject.getArray("frames");
        CLArray arrayOrNull = cLObject.getArrayOrNull("percentX");
        CLArray arrayOrNull2 = cLObject.getArrayOrNull("percentY");
        CLArray arrayOrNull3 = cLObject.getArrayOrNull("percentWidth");
        CLArray arrayOrNull4 = cLObject.getArrayOrNull("percentHeight");
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        String stringOrNull2 = cLObject.getStringOrNull("transitionEasing");
        String stringOrNull3 = cLObject.getStringOrNull("curveFit");
        String stringOrNull4 = cLObject.getStringOrNull("type");
        if (stringOrNull4 == null) {
            stringOrNull4 = "parentRelative";
        }
        if (arrayOrNull != null && array2.size() != arrayOrNull.size()) {
            return;
        }
        if (arrayOrNull2 == null || array2.size() == arrayOrNull2.size()) {
            int i = 0;
            while (i < array.size()) {
                String string = array.getString(i);
                int map = map(stringOrNull4, "deltaRelative", "pathRelative", "parentRelative");
                typedBundle.clear();
                typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, map);
                if (stringOrNull3 != null) {
                    map(typedBundle, 508, stringOrNull3, "spline", "linear");
                }
                typedBundle.addIfNotNull(501, stringOrNull2);
                if (stringOrNull != null) {
                    map(typedBundle, 509, stringOrNull, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                }
                int i2 = 0;
                while (i2 < array2.size()) {
                    typedBundle.add(100, array2.getInt(i2));
                    set(typedBundle, 506, arrayOrNull, i2);
                    set(typedBundle, 507, arrayOrNull2, i2);
                    set(typedBundle, 503, arrayOrNull3, i2);
                    set(typedBundle, 504, arrayOrNull4, i2);
                    transition.addKeyPosition(string, typedBundle);
                    i2++;
                    stringOrNull4 = stringOrNull4;
                }
                i++;
                array = array;
                stringOrNull4 = stringOrNull4;
            }
        }
    }

    private static void parseKeyAttribute(CLObject cLObject, Transition transition) throws CLParsingException {
        CLArray arrayOrNull;
        CustomVariable[][] customVariableArr;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d7935c4", new Object[]{cLObject, transition});
            return;
        }
        CLArray arrayOrNull2 = cLObject.getArrayOrNull("target");
        if (!(arrayOrNull2 == null || (arrayOrNull = cLObject.getArrayOrNull("frames")) == null)) {
            String stringOrNull = cLObject.getStringOrNull("transitionEasing");
            String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
            int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
            boolean[] zArr = {false, false, true, true, true, false, false, false, false};
            int size = arrayOrNull.size();
            TypedBundle[] typedBundleArr = new TypedBundle[size];
            for (int i2 = 0; i2 < arrayOrNull.size(); i2++) {
                typedBundleArr[i2] = new TypedBundle();
            }
            int i3 = 0;
            for (int i4 = 9; i3 < i4; i4 = 9) {
                String str = strArr[i3];
                int i5 = iArr[i3];
                boolean z = zArr[i3];
                CLArray arrayOrNull3 = cLObject.getArrayOrNull(str);
                if (arrayOrNull3 == null || arrayOrNull3.size() == size) {
                    if (arrayOrNull3 != null) {
                        for (int i6 = 0; i6 < size; i6++) {
                            float f = arrayOrNull3.getFloat(i6);
                            if (z) {
                                f = transition.mToPixel.toPixels(f);
                            }
                            typedBundleArr[i6].add(i5, f);
                            i = 1;
                        }
                    } else {
                        float floatOrNaN = cLObject.getFloatOrNaN(str);
                        if (!Float.isNaN(floatOrNaN)) {
                            if (z) {
                                floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                            }
                            for (int i7 = 0; i7 < size; i7++) {
                                typedBundleArr[i7].add(i5, floatOrNaN);
                            }
                        }
                        i = 1;
                    }
                    i3 += i;
                } else {
                    throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", cLObject);
                }
            }
            CLElement orNull = cLObject.getOrNull("custom");
            if (orNull == null || !(orNull instanceof CLObject)) {
                customVariableArr = null;
            } else {
                CLObject cLObject2 = (CLObject) orNull;
                int size2 = cLObject2.size();
                customVariableArr = (CustomVariable[][]) Array.newInstance(CustomVariable.class, arrayOrNull.size(), size2);
                for (int i8 = 0; i8 < size2; i8++) {
                    CLKey cLKey = (CLKey) cLObject2.get(i8);
                    String content = cLKey.content();
                    if (cLKey.getValue() instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLKey.getValue();
                        int size3 = cLArray.size();
                        if (size3 == size && size3 > 0) {
                            if (cLArray.get(0) instanceof CLNumber) {
                                int i9 = 0;
                                while (i9 < size) {
                                    customVariableArr[i9][i8] = new CustomVariable(content, 901, cLArray.get(i9).getFloat());
                                    i9++;
                                    cLObject2 = cLObject2;
                                }
                            } else {
                                cLObject2 = cLObject2;
                                for (int i10 = 0; i10 < size; i10++) {
                                    long parseColorString = ConstraintSetParser.parseColorString(cLArray.get(i10).content());
                                    if (parseColorString != -1) {
                                        size2 = size2;
                                        customVariableArr[i10][i8] = new CustomVariable(content, 902, (int) parseColorString);
                                    } else {
                                        size2 = size2;
                                    }
                                }
                            }
                        }
                    } else {
                        cLObject2 = cLObject2;
                        size2 = size2;
                        CLElement value = cLKey.getValue();
                        if (value instanceof CLNumber) {
                            float f2 = value.getFloat();
                            for (int i11 = 0; i11 < size; i11++) {
                                customVariableArr[i11][i8] = new CustomVariable(content, 901, f2);
                            }
                        } else {
                            long parseColorString2 = ConstraintSetParser.parseColorString(value.content());
                            if (parseColorString2 != -1) {
                                int i12 = 0;
                                while (i12 < size) {
                                    customVariableArr[i12][i8] = new CustomVariable(content, 902, (int) parseColorString2);
                                    i12++;
                                    parseColorString2 = parseColorString2;
                                }
                            }
                        }
                    }
                }
            }
            String stringOrNull2 = cLObject.getStringOrNull("curveFit");
            for (int i13 = 0; i13 < arrayOrNull2.size(); i13++) {
                for (int i14 = 0; i14 < size; i14++) {
                    String string = arrayOrNull2.getString(i13);
                    TypedBundle typedBundle = typedBundleArr[i14];
                    if (stringOrNull2 != null) {
                        typedBundle.add(508, map(stringOrNull2, "spline", "linear"));
                    }
                    typedBundle.addIfNotNull(501, stringOrNull);
                    typedBundle.add(100, arrayOrNull.getInt(i14));
                    transition.addKeyAttribute(string, typedBundle, customVariableArr != null ? customVariableArr[i14] : null);
                }
            }
        }
    }

    private static void parseKeyCycle(CLObject cLObject, Transition transition) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9d63ba", new Object[]{cLObject, transition});
            return;
        }
        CLArray array = cLObject.getArray("target");
        CLArray array2 = cLObject.getArray("frames");
        String stringOrNull = cLObject.getStringOrNull("transitionEasing");
        String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", TypedValues.CycleType.S_WAVE_PERIOD, "offset", TypedValues.CycleType.S_WAVE_PHASE};
        int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 403, 423, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_WAVE_PHASE};
        int[] iArr2 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0};
        int size = array2.size();
        TypedBundle[] typedBundleArr = new TypedBundle[size];
        for (int i = 0; i < size; i++) {
            typedBundleArr[i] = new TypedBundle();
        }
        boolean z = false;
        for (int i2 = 0; i2 < 12; i2++) {
            if (cLObject.has(strArr[i2]) && iArr2[i2] == 1) {
                z = true;
            }
        }
        int i3 = 0;
        for (int i4 = 12; i3 < i4; i4 = 12) {
            String str = strArr[i3];
            int i5 = iArr[i3];
            int i6 = iArr2[i3];
            CLArray arrayOrNull = cLObject.getArrayOrNull(str);
            if (arrayOrNull == null || arrayOrNull.size() == size) {
                if (arrayOrNull != null) {
                    int i7 = 0;
                    while (i7 < size) {
                        float f = arrayOrNull.getFloat(i7);
                        if (i6 == 1) {
                            f = transition.mToPixel.toPixels(f);
                        } else if (i6 == 2 && z) {
                            f = transition.mToPixel.toPixels(f);
                        }
                        typedBundleArr[i7].add(i5, f);
                        i7++;
                        arrayOrNull = arrayOrNull;
                    }
                } else {
                    float floatOrNaN = cLObject.getFloatOrNaN(str);
                    if (!Float.isNaN(floatOrNaN)) {
                        if (i6 == 1) {
                            floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                        } else if (i6 == 2 && z) {
                            floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                        }
                        for (int i8 = 0; i8 < size; i8++) {
                            typedBundleArr[i8].add(i5, floatOrNaN);
                        }
                        i3++;
                        strArr = strArr;
                    }
                }
                i3++;
                strArr = strArr;
            } else {
                throw new CLParsingException("incorrect size for $attrName array, not matching targets array!", cLObject);
            }
        }
        String stringOrNull2 = cLObject.getStringOrNull("curveFit");
        String stringOrNull3 = cLObject.getStringOrNull("easing");
        String stringOrNull4 = cLObject.getStringOrNull("waveShape");
        String stringOrNull5 = cLObject.getStringOrNull(TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE);
        for (int i9 = 0; i9 < array.size(); i9++) {
            for (int i10 = 0; i10 < size; i10++) {
                String string = array.getString(i9);
                TypedBundle typedBundle = typedBundleArr[i10];
                if (stringOrNull2 != null) {
                    if (stringOrNull2.equals("linear")) {
                        typedBundle.add(401, 1);
                    } else if (stringOrNull2.equals("spline")) {
                        typedBundle.add(401, 0);
                    }
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                if (stringOrNull3 != null) {
                    typedBundle.add(420, stringOrNull3);
                }
                if (stringOrNull4 != null) {
                    typedBundle.add(421, stringOrNull4);
                }
                if (stringOrNull5 != null) {
                    typedBundle.add(422, stringOrNull5);
                }
                typedBundle.add(100, array2.getInt(i10));
                transition.addKeyCycle(string, typedBundle);
            }
        }
    }
}
