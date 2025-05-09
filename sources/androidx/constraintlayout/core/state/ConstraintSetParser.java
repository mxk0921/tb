package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.pg1;
import tb.tl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConstraintSetParser {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean PARSER_DEBUG = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DesignElement {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mId;
        public HashMap<String, String> mParams;
        public String mType;

        public DesignElement(String str, String str2, HashMap<String, String> hashMap) {
            this.mId = str;
            this.mType = str2;
            this.mParams = hashMap;
        }

        public String getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            return this.mId;
        }

        public HashMap<String, String> getParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("8abc9da6", new Object[]{this});
            }
            return this.mParams;
        }

        public String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.mType;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FiniteGenerator implements GeneratedValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float mFrom;
        public float mInitial;
        public float mMax;
        public String mPostfix;
        public String mPrefix;
        public float mStep;
        public float mTo;
        public boolean mStop = false;
        public float mCurrent = 0.0f;

        public FiniteGenerator(float f, float f2, float f3, String str, String str2) {
            this.mFrom = f;
            this.mTo = f2;
            this.mStep = f3;
            this.mPrefix = str == null ? "" : str;
            this.mPostfix = str2 == null ? "" : str2;
            this.mMax = f2;
            this.mInitial = f;
        }

        public ArrayList<String> array() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("2d61163a", new Object[]{this});
            }
            ArrayList<String> arrayList = new ArrayList<>();
            int i = (int) this.mInitial;
            int i2 = (int) this.mMax;
            int i3 = i;
            while (i <= i2) {
                arrayList.add(this.mPrefix + i3 + this.mPostfix);
                i3 += (int) this.mStep;
                i++;
            }
            return arrayList;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d249f568", new Object[]{this})).floatValue();
            }
            float f = this.mCurrent;
            if (f >= this.mMax) {
                this.mStop = true;
            }
            if (!this.mStop) {
                this.mCurrent = f + this.mStep;
            }
            return this.mCurrent;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface GeneratedValue {
        float value();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Generator implements GeneratedValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float mCurrent;
        public float mIncrementBy;
        public float mStart;
        public boolean mStop = false;

        public Generator(float f, float f2) {
            this.mStart = f;
            this.mIncrementBy = f2;
            this.mCurrent = f;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d249f568", new Object[]{this})).floatValue();
            }
            if (!this.mStop) {
                this.mCurrent += this.mIncrementBy;
            }
            return this.mCurrent;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class LayoutVariables {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public HashMap<String, Integer> mMargins = new HashMap<>();
        public HashMap<String, GeneratedValue> mGenerators = new HashMap<>();
        public HashMap<String, ArrayList<String>> mArrayIds = new HashMap<>();

        public float get(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c3dfcb69", new Object[]{this, obj})).floatValue();
            }
            if (obj instanceof CLString) {
                String content = ((CLString) obj).content();
                if (this.mGenerators.containsKey(content)) {
                    return this.mGenerators.get(content).value();
                }
                if (this.mMargins.containsKey(content)) {
                    return this.mMargins.get(content).floatValue();
                }
                return 0.0f;
            } else if (obj instanceof CLNumber) {
                return ((CLNumber) obj).getFloat();
            } else {
                return 0.0f;
            }
        }

        public ArrayList<String> getList(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("5977abff", new Object[]{this, str});
            }
            if (this.mArrayIds.containsKey(str)) {
                return this.mArrayIds.get(str);
            }
            return null;
        }

        public void put(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e68d6a3", new Object[]{this, str, new Integer(i)});
            } else {
                this.mMargins.put(str, Integer.valueOf(i));
            }
        }

        public void putOverride(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0a780f4", new Object[]{this, str, new Float(f)});
            } else {
                this.mGenerators.put(str, new OverrideValue(f));
            }
        }

        public void put(String str, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb10860", new Object[]{this, str, new Float(f), new Float(f2)});
            } else if (!this.mGenerators.containsKey(str) || !(this.mGenerators.get(str) instanceof OverrideValue)) {
                this.mGenerators.put(str, new Generator(f, f2));
            }
        }

        public void put(String str, float f, float f2, float f3, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54297074", new Object[]{this, str, new Float(f), new Float(f2), new Float(f3), str2, str3});
            } else if (!this.mGenerators.containsKey(str) || !(this.mGenerators.get(str) instanceof OverrideValue)) {
                FiniteGenerator finiteGenerator = new FiniteGenerator(f, f2, f3, str2, str3);
                this.mGenerators.put(str, finiteGenerator);
                this.mArrayIds.put(str, finiteGenerator.array());
            }
        }

        public void put(String str, ArrayList<String> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("297eed4a", new Object[]{this, str, arrayList});
            } else {
                this.mArrayIds.put(str, arrayList);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class MotionLayoutDebugFlags extends Enum<MotionLayoutDebugFlags> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final MotionLayoutDebugFlags NONE = new MotionLayoutDebugFlags("NONE", 0);
        public static final MotionLayoutDebugFlags SHOW_ALL = new MotionLayoutDebugFlags("SHOW_ALL", 1);
        public static final MotionLayoutDebugFlags UNKNOWN = new MotionLayoutDebugFlags("UNKNOWN", 2);
        private static final /* synthetic */ MotionLayoutDebugFlags[] $VALUES = $values();

        private static /* synthetic */ MotionLayoutDebugFlags[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MotionLayoutDebugFlags[]) ipChange.ipc$dispatch("c792b875", new Object[0]) : new MotionLayoutDebugFlags[]{NONE, SHOW_ALL, UNKNOWN};
        }

        private MotionLayoutDebugFlags(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(MotionLayoutDebugFlags motionLayoutDebugFlags, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/ConstraintSetParser$MotionLayoutDebugFlags");
        }

        public static MotionLayoutDebugFlags valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MotionLayoutDebugFlags) ipChange.ipc$dispatch("af475f6a", new Object[]{str});
            }
            return (MotionLayoutDebugFlags) Enum.valueOf(MotionLayoutDebugFlags.class, str);
        }

        public static MotionLayoutDebugFlags[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MotionLayoutDebugFlags[]) ipChange.ipc$dispatch("e6268f19", new Object[0]);
            }
            return (MotionLayoutDebugFlags[]) $VALUES.clone();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class OverrideValue implements GeneratedValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float mValue;

        public OverrideValue(float f) {
            this.mValue = f;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d249f568", new Object[]{this})).floatValue();
            }
            return this.mValue;
        }
    }

    private static int indexOf(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5fed6b8", new Object[]{str, strArr})).intValue();
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static String lookForType(CLObject cLObject) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41667050", new Object[]{cLObject});
        }
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            if (it.next().equals("type")) {
                return cLObject.getString("type");
            }
        }
        return null;
    }

    public static long parseColorString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab64b066", new Object[]{str})).longValue();
        }
        if (!str.startsWith("#")) {
            return -1L;
        }
        String substring = str.substring(1);
        if (substring.length() == 6) {
            substring = "FF".concat(substring);
        }
        return Long.parseLong(substring, 16);
    }

    public static void parseConstraintSets(CoreMotionScene coreMotionScene, CLObject cLObject) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("877cacd1", new Object[]{coreMotionScene, cLObject});
            return;
        }
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CLObject object = cLObject.getObject(next);
                String stringOrNull = object.getStringOrNull("Extends");
                if (stringOrNull == null || stringOrNull.isEmpty()) {
                    coreMotionScene.setConstraintSetContent(next, object.toJSON());
                } else {
                    String constraintSet = coreMotionScene.getConstraintSet(stringOrNull);
                    if (constraintSet != null) {
                        CLObject parse = CLParser.parse(constraintSet);
                        ArrayList<String> names2 = object.names();
                        if (names2 != null) {
                            Iterator<String> it2 = names2.iterator();
                            while (it2.hasNext()) {
                                String next2 = it2.next();
                                CLElement cLElement = object.get(next2);
                                if (cLElement instanceof CLObject) {
                                    override(parse, next2, (CLObject) cLElement);
                                }
                            }
                            coreMotionScene.setConstraintSetContent(next, parse.toJSON());
                        }
                    }
                }
            }
        }
    }

    public static void parseCustomProperties(CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        ArrayList<String> names;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df9615a", new Object[]{cLObject, constraintReference, str});
            return;
        }
        CLObject objectOrNull = cLObject.getObjectOrNull(str);
        if (objectOrNull != null && (names = objectOrNull.names()) != null) {
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CLElement cLElement = objectOrNull.get(next);
                if (cLElement instanceof CLNumber) {
                    constraintReference.addCustomFloat(next, cLElement.getFloat());
                } else if (cLElement instanceof CLString) {
                    long parseColorString = parseColorString(cLElement.content());
                    if (parseColorString != -1) {
                        constraintReference.addCustomColor(next, (int) parseColorString);
                    }
                }
            }
        }
    }

    public static void parseGenerate(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af3710c", new Object[]{state, layoutVariables, cLObject});
            return;
        }
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CLElement cLElement = cLObject.get(next);
                ArrayList<String> list = layoutVariables.getList(next);
                if (list != null && (cLElement instanceof CLObject)) {
                    Iterator<String> it2 = list.iterator();
                    while (it2.hasNext()) {
                        parseWidget(state, layoutVariables, it2.next(), (CLObject) cLElement);
                    }
                }
            }
        }
    }

    public static void parseHeader(CoreMotionScene coreMotionScene, CLObject cLObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5c97d0", new Object[]{coreMotionScene, cLObject});
            return;
        }
        String stringOrNull = cLObject.getStringOrNull(pg1.ATOM_export);
        if (stringOrNull != null) {
            coreMotionScene.setDebugName(stringOrNull);
        }
    }

    public static void parseJSON(String str, Transition transition, int i) {
        CLObject objectOrNull;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8156668f", new Object[]{str, transition, new Integer(i)});
            return;
        }
        try {
            CLObject parse = CLParser.parse(str);
            ArrayList<String> names = parse.names();
            if (names != null) {
                Iterator<String> it = names.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    CLElement cLElement = parse.get(next);
                    if ((cLElement instanceof CLObject) && (objectOrNull = ((CLObject) cLElement).getObjectOrNull("custom")) != null) {
                        Iterator<String> it2 = objectOrNull.names().iterator();
                        while (it2.hasNext()) {
                            String next2 = it2.next();
                            CLElement cLElement2 = objectOrNull.get(next2);
                            if (cLElement2 instanceof CLNumber) {
                                transition.addCustomFloat(i, next, next2, cLElement2.getFloat());
                            } else if (cLElement2 instanceof CLString) {
                                long parseColorString = parseColorString(cLElement2.content());
                                if (parseColorString != -1) {
                                    transition.addCustomColor(i, next, next2, (int) parseColorString);
                                }
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e) {
            PrintStream printStream = System.err;
            printStream.println("Error parsing JSON " + e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void parseMotionSceneJSON(androidx.constraintlayout.core.state.CoreMotionScene r8, java.lang.String r9) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = androidx.constraintlayout.core.state.ConstraintSetParser.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "492c7aa0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r8
            r2[r0] = r9
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            androidx.constraintlayout.core.parser.CLObject r9 = androidx.constraintlayout.core.parser.CLParser.parse(r9)     // Catch: CLParsingException -> 0x0058
            java.util.ArrayList r3 = r9.names()     // Catch: CLParsingException -> 0x0058
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            java.util.Iterator r3 = r3.iterator()     // Catch: CLParsingException -> 0x0058
        L_0x0024:
            boolean r4 = r3.hasNext()     // Catch: CLParsingException -> 0x0058
            if (r4 == 0) goto L_0x0095
            java.lang.Object r4 = r3.next()     // Catch: CLParsingException -> 0x0058
            java.lang.String r4 = (java.lang.String) r4     // Catch: CLParsingException -> 0x0058
            androidx.constraintlayout.core.parser.CLElement r5 = r9.get(r4)     // Catch: CLParsingException -> 0x0058
            boolean r6 = r5 instanceof androidx.constraintlayout.core.parser.CLObject     // Catch: CLParsingException -> 0x0058
            if (r6 == 0) goto L_0x0024
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5     // Catch: CLParsingException -> 0x0058
            int r6 = r4.hashCode()     // Catch: CLParsingException -> 0x0058
            r7 = -2137403731(0xffffffff8099cead, float:-1.4124972E-38)
            if (r6 == r7) goto L_0x0064
            r7 = -241441378(0xfffffffff19be59e, float:-1.5439285E30)
            if (r6 == r7) goto L_0x005a
            r7 = 1101852654(0x41acefee, float:21.617153)
            if (r6 == r7) goto L_0x004e
            goto L_0x006e
        L_0x004e:
            java.lang.String r6 = "ConstraintSets"
            boolean r4 = r4.equals(r6)     // Catch: CLParsingException -> 0x0058
            if (r4 == 0) goto L_0x006e
            r4 = 0
            goto L_0x006f
        L_0x0058:
            r8 = move-exception
            goto L_0x0082
        L_0x005a:
            java.lang.String r6 = "Transitions"
            boolean r4 = r4.equals(r6)     // Catch: CLParsingException -> 0x0058
            if (r4 == 0) goto L_0x006e
            r4 = 1
            goto L_0x006f
        L_0x0064:
            java.lang.String r6 = "Header"
            boolean r4 = r4.equals(r6)     // Catch: CLParsingException -> 0x0058
            if (r4 == 0) goto L_0x006e
            r4 = 2
            goto L_0x006f
        L_0x006e:
            r4 = -1
        L_0x006f:
            if (r4 == 0) goto L_0x007e
            if (r4 == r0) goto L_0x007a
            if (r4 == r2) goto L_0x0076
            goto L_0x0024
        L_0x0076:
            parseHeader(r8, r5)     // Catch: CLParsingException -> 0x0058
            goto L_0x0024
        L_0x007a:
            parseTransitions(r8, r5)     // Catch: CLParsingException -> 0x0058
            goto L_0x0024
        L_0x007e:
            parseConstraintSets(r8, r5)     // Catch: CLParsingException -> 0x0058
            goto L_0x0024
        L_0x0082:
            java.io.PrintStream r9 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error parsing JSON "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.println(r8)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseMotionSceneJSON(androidx.constraintlayout.core.state.CoreMotionScene, java.lang.String):void");
    }

    public static void parseTransitions(CoreMotionScene coreMotionScene, CLObject cLObject) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b07ffb", new Object[]{coreMotionScene, cLObject});
            return;
        }
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                coreMotionScene.setTransitionContent(next, cLObject.getObject(next).toJSON());
            }
        }
    }

    public static void parseWidget(State state, LayoutVariables layoutVariables, String str, CLObject cLObject) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8814d025", new Object[]{state, layoutVariables, str, cLObject});
        } else {
            parseWidget(state, layoutVariables, state.constraints(str), cLObject);
        }
    }

    private static float toPix(State state, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("538013b", new Object[]{state, new Float(f)})).floatValue();
        }
        return state.getDpToPixel().toPixels(f);
    }

    public static Dimension parseDimension(CLObject cLObject, String str, State state, CorePixelDp corePixelDp) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("13585610", new Object[]{cLObject, str, state, corePixelDp});
        }
        CLElement cLElement = cLObject.get(str);
        Dimension createFixed = Dimension.createFixed(0);
        if (cLElement instanceof CLString) {
            return parseDimensionMode(cLElement.content());
        }
        if (cLElement instanceof CLNumber) {
            return Dimension.createFixed(state.convertDimension(Float.valueOf(corePixelDp.toPixels(cLObject.getFloat(str)))));
        }
        if (!(cLElement instanceof CLObject)) {
            return createFixed;
        }
        CLObject cLObject2 = (CLObject) cLElement;
        String stringOrNull = cLObject2.getStringOrNull("value");
        if (stringOrNull != null) {
            createFixed = parseDimensionMode(stringOrNull);
        }
        CLElement orNull = cLObject2.getOrNull("min");
        if (orNull != null) {
            if (orNull instanceof CLNumber) {
                createFixed.min(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull).getFloat()))));
            } else if (orNull instanceof CLString) {
                createFixed.min(Dimension.WRAP_DIMENSION);
            }
        }
        CLElement orNull2 = cLObject2.getOrNull("max");
        if (orNull2 == null) {
            return createFixed;
        }
        if (orNull2 instanceof CLNumber) {
            createFixed.max(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull2).getFloat()))));
            return createFixed;
        } else if (!(orNull2 instanceof CLString)) {
            return createFixed;
        } else {
            createFixed.max(Dimension.WRAP_DIMENSION);
            return createFixed;
        }
    }

    public static void parseGuideline(int i, State state, CLArray cLArray) throws CLParsingException {
        CLObject cLObject;
        String stringOrNull;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad6432a", new Object[]{new Integer(i), state, cLArray});
            return;
        }
        CLElement cLElement = cLArray.get(1);
        if ((cLElement instanceof CLObject) && (stringOrNull = (cLObject = (CLObject) cLElement).getStringOrNull("id")) != null) {
            parseGuidelineParams(i, state, stringOrNull, cLObject);
        }
    }

    public static void parseDesignElementsJSON(String str, ArrayList<DesignElement> arrayList) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc61f669", new Object[]{str, arrayList});
            return;
        }
        CLObject parse = CLParser.parse(str);
        ArrayList<String> names = parse.names();
        if (names != null && names.size() > 0) {
            String str2 = names.get(0);
            CLElement cLElement = parse.get(str2);
            str2.hashCode();
            if (str2.equals("Design") && (cLElement instanceof CLObject)) {
                CLObject cLObject = (CLObject) cLElement;
                ArrayList<String> names2 = cLObject.names();
                for (int i = 0; i < names2.size(); i++) {
                    String str3 = names2.get(i);
                    CLObject cLObject2 = (CLObject) cLObject.get(str3);
                    PrintStream printStream = System.out;
                    printStream.printf("element found " + str3 + "", new Object[0]);
                    String stringOrNull = cLObject2.getStringOrNull("type");
                    if (stringOrNull != null) {
                        HashMap hashMap = new HashMap();
                        int size = cLObject2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            CLKey cLKey = (CLKey) cLObject2.get(i);
                            String content = cLKey.content();
                            String content2 = cLKey.getValue().content();
                            if (content2 != null) {
                                hashMap.put(content, content2);
                            }
                        }
                        arrayList.add(new DesignElement(str2, stringOrNull, hashMap));
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r5.equals(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT) == false) goto L_0x0024;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.constraintlayout.core.state.Dimension parseDimensionMode(java.lang.String r5) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.constraintlayout.core.state.ConstraintSetParser.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "4bead8a4"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r0)
            androidx.constraintlayout.core.state.Dimension r5 = (androidx.constraintlayout.core.state.Dimension) r5
            return r5
        L_0x0015:
            androidx.constraintlayout.core.state.Dimension r2 = androidx.constraintlayout.core.state.Dimension.createFixed(r1)
            r5.hashCode()
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1460244870: goto L_0x0048;
                case -995424086: goto L_0x003e;
                case -895684237: goto L_0x0032;
                case 3657802: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = -1
            goto L_0x0053
        L_0x0026:
            java.lang.String r0 = "wrap"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0030
            goto L_0x0024
        L_0x0030:
            r0 = 3
            goto L_0x0053
        L_0x0032:
            java.lang.String r0 = "spread"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x0024
        L_0x003c:
            r0 = 2
            goto L_0x0053
        L_0x003e:
            java.lang.String r4 = "parent"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0053
            goto L_0x0024
        L_0x0048:
            java.lang.String r0 = "preferWrap"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0052
            goto L_0x0024
        L_0x0052:
            r0 = 0
        L_0x0053:
            switch(r0) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x009b;
                case 2: goto L_0x0094;
                case 3: goto L_0x008f;
                default: goto L_0x0056;
            }
        L_0x0056:
            java.lang.String r0 = "%"
            boolean r0 = r5.endsWith(r0)
            if (r0 == 0) goto L_0x007c
            r0 = 37
            int r0 = r5.indexOf(r0)
            java.lang.String r5 = r5.substring(r1, r0)
            float r5 = java.lang.Float.parseFloat(r5)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            androidx.constraintlayout.core.state.Dimension r5 = androidx.constraintlayout.core.state.Dimension.createPercent(r0, r5)
            androidx.constraintlayout.core.state.Dimension r2 = r5.suggested(r1)
            goto L_0x00a6
        L_0x007c:
            java.lang.String r0 = ":"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x00a6
            androidx.constraintlayout.core.state.Dimension r5 = androidx.constraintlayout.core.state.Dimension.createRatio(r5)
            java.lang.Object r0 = androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION
            androidx.constraintlayout.core.state.Dimension r2 = r5.suggested(r0)
            goto L_0x00a6
        L_0x008f:
            androidx.constraintlayout.core.state.Dimension r2 = androidx.constraintlayout.core.state.Dimension.createWrap()
            goto L_0x00a6
        L_0x0094:
            java.lang.Object r5 = androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION
            androidx.constraintlayout.core.state.Dimension r2 = androidx.constraintlayout.core.state.Dimension.createSuggested(r5)
            goto L_0x00a6
        L_0x009b:
            androidx.constraintlayout.core.state.Dimension r2 = androidx.constraintlayout.core.state.Dimension.createParent()
            goto L_0x00a6
        L_0x00a0:
            java.lang.Object r5 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            androidx.constraintlayout.core.state.Dimension r2 = androidx.constraintlayout.core.state.Dimension.createSuggested(r5)
        L_0x00a6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseDimensionMode(java.lang.String):androidx.constraintlayout.core.state.Dimension");
    }

    private static void parseVariables(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba130c8", new Object[]{state, layoutVariables, cLObject});
            return;
        }
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CLElement cLElement = cLObject.get(next);
                if (cLElement instanceof CLNumber) {
                    layoutVariables.put(next, cLElement.getInt());
                } else if (cLElement instanceof CLObject) {
                    CLObject cLObject2 = (CLObject) cLElement;
                    if (cLObject2.has("from") && cLObject2.has("to")) {
                        layoutVariables.put(next, layoutVariables.get(cLObject2.get("from")), layoutVariables.get(cLObject2.get("to")), 1.0f, cLObject2.getStringOrNull("prefix"), cLObject2.getStringOrNull("postfix"));
                    } else if (cLObject2.has("from") && cLObject2.has(tl.KEY_STEP)) {
                        layoutVariables.put(next, layoutVariables.get(cLObject2.get("from")), layoutVariables.get(cLObject2.get(tl.KEY_STEP)));
                    } else if (cLObject2.has("ids")) {
                        CLArray array = cLObject2.getArray("ids");
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (int i = 0; i < array.size(); i++) {
                            arrayList.add(array.getString(i));
                        }
                        layoutVariables.put(next, arrayList);
                    } else if (cLObject2.has("tag")) {
                        layoutVariables.put(next, state.getIdsForTag(cLObject2.getString("tag")));
                    }
                }
            }
        }
    }

    public static void parseWidget(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1ae888", new Object[]{state, layoutVariables, constraintReference, cLObject});
            return;
        }
        if (constraintReference.getWidth() == null) {
            constraintReference.setWidth(Dimension.createWrap());
        }
        if (constraintReference.getHeight() == null) {
            constraintReference.setHeight(Dimension.createWrap());
        }
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                applyAttribute(state, layoutVariables, constraintReference, cLObject, it.next());
            }
        }
    }

    public static void override(CLObject cLObject, String str, CLObject cLObject2) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1783a7", new Object[]{cLObject, str, cLObject2});
        } else if (!cLObject.has(str)) {
            cLObject.put(str, cLObject2);
        } else {
            CLObject object = cLObject.getObject(str);
            Iterator<String> it = cLObject2.names().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!next.equals(pg1.ATOM_EXT_clear)) {
                    object.put(next, cLObject2.get(next));
                } else {
                    CLArray array = cLObject2.getArray(pg1.ATOM_EXT_clear);
                    for (int i = 0; i < array.size(); i++) {
                        String stringOrNull = array.getStringOrNull(i);
                        if (stringOrNull != null) {
                            char c = 65535;
                            switch (stringOrNull.hashCode()) {
                                case -1727069561:
                                    if (stringOrNull.equals("transforms")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case -1606703562:
                                    if (stringOrNull.equals("constraints")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 414334925:
                                    if (stringOrNull.equals("dimensions")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    object.remove("visibility");
                                    object.remove("alpha");
                                    object.remove("pivotX");
                                    object.remove("pivotY");
                                    object.remove("rotationX");
                                    object.remove("rotationY");
                                    object.remove("rotationZ");
                                    object.remove("scaleX");
                                    object.remove("scaleY");
                                    object.remove("translationX");
                                    object.remove("translationY");
                                    break;
                                case 1:
                                    object.remove("start");
                                    object.remove("end");
                                    object.remove("top");
                                    object.remove("bottom");
                                    object.remove("baseline");
                                    object.remove("center");
                                    object.remove("centerHorizontally");
                                    object.remove("centerVertically");
                                    break;
                                case 2:
                                    object.remove("width");
                                    object.remove("height");
                                    break;
                                default:
                                    object.remove(stringOrNull);
                                    break;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void parseChain(int r7, androidx.constraintlayout.core.state.State r8, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r9, androidx.constraintlayout.core.parser.CLArray r10) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = androidx.constraintlayout.core.state.ConstraintSetParser.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0020
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r4
            r7[r2] = r8
            r7[r0] = r9
            r8 = 3
            r7[r8] = r10
            java.lang.String r8 = "12eef86d"
            r3.ipc$dispatch(r8, r7)
            return
        L_0x0020:
            if (r7 != 0) goto L_0x0027
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r7 = r8.horizontalChain()
            goto L_0x002b
        L_0x0027:
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r7 = r8.verticalChain()
        L_0x002b:
            androidx.constraintlayout.core.parser.CLElement r3 = r10.get(r2)
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L_0x00ce
            androidx.constraintlayout.core.parser.CLArray r3 = (androidx.constraintlayout.core.parser.CLArray) r3
            int r4 = r3.size()
            if (r4 >= r2) goto L_0x003d
            goto L_0x00ce
        L_0x003d:
            r4 = 0
        L_0x003e:
            int r5 = r3.size()
            if (r4 >= r5) goto L_0x0051
            java.lang.String r5 = r3.getString(r4)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r5
            r7.add(r6)
            int r4 = r4 + r2
            goto L_0x003e
        L_0x0051:
            int r3 = r10.size()
            if (r3 <= r0) goto L_0x00ce
            androidx.constraintlayout.core.parser.CLElement r10 = r10.get(r0)
            boolean r0 = r10 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r0 != 0) goto L_0x0060
            return
        L_0x0060:
            androidx.constraintlayout.core.parser.CLObject r10 = (androidx.constraintlayout.core.parser.CLObject) r10
            java.util.ArrayList r0 = r10.names()
            java.util.Iterator r0 = r0.iterator()
        L_0x006a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00ce
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.hashCode()
            java.lang.String r4 = "style"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0086
            parseConstraint(r8, r9, r10, r7, r3)
            goto L_0x006a
        L_0x0086:
            androidx.constraintlayout.core.parser.CLElement r3 = r10.get(r3)
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L_0x00a3
            r4 = r3
            androidx.constraintlayout.core.parser.CLArray r4 = (androidx.constraintlayout.core.parser.CLArray) r4
            int r5 = r4.size()
            if (r5 <= r2) goto L_0x00a3
            java.lang.String r3 = r4.getString(r1)
            float r4 = r4.getFloat(r2)
            r7.bias(r4)
            goto L_0x00a7
        L_0x00a3:
            java.lang.String r3 = r3.content()
        L_0x00a7:
            r3.hashCode()
            java.lang.String r4 = "packed"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x00c8
            java.lang.String r4 = "spread_inside"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00c2
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r7.style(r3)
            goto L_0x006a
        L_0x00c2:
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r7.style(r3)
            goto L_0x006a
        L_0x00c8:
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r7.style(r3)
            goto L_0x006a
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseChain(int, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLArray):void");
    }

    public static void parseHelpers(State state, LayoutVariables layoutVariables, CLArray cLArray) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc502fc2", new Object[]{state, layoutVariables, cLArray});
            return;
        }
        for (int i = 0; i < cLArray.size(); i++) {
            CLElement cLElement = cLArray.get(i);
            if (cLElement instanceof CLArray) {
                CLArray cLArray2 = (CLArray) cLElement;
                if (cLArray2.size() > 1) {
                    String string = cLArray2.getString(0);
                    string.hashCode();
                    char c = 65535;
                    switch (string.hashCode()) {
                        case -1785507558:
                            if (string.equals("vGuideline")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1252464839:
                            if (string.equals("hChain")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -851656725:
                            if (string.equals("vChain")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 965681512:
                            if (string.equals("hGuideline")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            parseGuideline(1, state, cLArray2);
                            continue;
                        case 1:
                            parseChain(0, state, layoutVariables, cLArray2);
                            continue;
                        case 2:
                            parseChain(1, state, layoutVariables, cLArray2);
                            continue;
                        case 3:
                            parseGuideline(0, state, cLArray2);
                            continue;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void parseMotionProperties(CLElement cLElement, ConstraintReference constraintReference) throws CLParsingException {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebaf909a", new Object[]{cLElement, constraintReference});
        } else if (cLElement instanceof CLObject) {
            CLObject cLObject = (CLObject) cLElement;
            TypedBundle typedBundle = new TypedBundle();
            ArrayList<String> names = cLObject.names();
            if (names != null) {
                Iterator<String> it = names.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    next.hashCode();
                    switch (next.hashCode()) {
                        case -1897525331:
                            if (next.equals("stagger")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1310311125:
                            if (next.equals("easing")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1285003983:
                            if (next.equals("quantize")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -791482387:
                            if (next.equals("pathArc")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -236944793:
                            if (next.equals("relativeTo")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            typedBundle.add(600, cLObject.getFloat(next));
                            break;
                        case 1:
                            typedBundle.add(603, cLObject.getString(next));
                            break;
                        case 2:
                            CLElement cLElement2 = cLObject.get(next);
                            if (!(cLElement2 instanceof CLArray)) {
                                typedBundle.add(610, cLObject.getInt(next));
                                break;
                            } else {
                                CLArray cLArray = (CLArray) cLElement2;
                                int size = cLArray.size();
                                if (size <= 0) {
                                    break;
                                } else {
                                    typedBundle.add(610, cLArray.getInt(0));
                                    if (size <= 1) {
                                        break;
                                    } else {
                                        typedBundle.add(611, cLArray.getString(1));
                                        if (size <= 2) {
                                            break;
                                        } else {
                                            typedBundle.add(602, cLArray.getFloat(2));
                                            break;
                                        }
                                    }
                                }
                            }
                        case 3:
                            String string = cLObject.getString(next);
                            int indexOf = indexOf(string, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                            if (indexOf != -1) {
                                typedBundle.add(607, indexOf);
                                break;
                            } else {
                                PrintStream printStream = System.err;
                                printStream.println(cLObject.getLine() + " pathArc = '" + string + "'");
                                break;
                            }
                        case 4:
                            typedBundle.add(605, cLObject.getString(next));
                            break;
                    }
                }
                constraintReference.mMotionProperties = typedBundle;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void parseBarrier(State state, String str, CLObject cLObject) throws CLParsingException {
        char c;
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67bdabc4", new Object[]{state, str, cLObject});
            return;
        }
        boolean isRtl = state.isRtl();
        BarrierReference barrier = state.barrier(str, State.Direction.END);
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                next.hashCode();
                switch (next.hashCode()) {
                    case -1081309778:
                        if (next.equals("margin")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -962590849:
                        if (next.equals("direction")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -567445985:
                        if (next.equals("contains")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        float floatOrNaN = cLObject.getFloatOrNaN(next);
                        if (!Float.isNaN(floatOrNaN)) {
                            barrier.margin(Float.valueOf(toPix(state, floatOrNaN)));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        String string = cLObject.getString(next);
                        string.hashCode();
                        switch (string.hashCode()) {
                            case -1383228885:
                                if (string.equals("bottom")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 100571:
                                if (string.equals("end")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 115029:
                                if (string.equals("top")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3317767:
                                if (string.equals("left")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 108511772:
                                if (string.equals("right")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 109757538:
                                if (string.equals("start")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                barrier.setBarrierDirection(State.Direction.BOTTOM);
                                continue;
                            case 1:
                                if (isRtl) {
                                    barrier.setBarrierDirection(State.Direction.LEFT);
                                    break;
                                } else {
                                    barrier.setBarrierDirection(State.Direction.RIGHT);
                                    continue;
                                }
                            case 2:
                                barrier.setBarrierDirection(State.Direction.TOP);
                                continue;
                            case 3:
                                barrier.setBarrierDirection(State.Direction.LEFT);
                                continue;
                            case 4:
                                barrier.setBarrierDirection(State.Direction.RIGHT);
                                continue;
                            case 5:
                                if (isRtl) {
                                    barrier.setBarrierDirection(State.Direction.RIGHT);
                                    break;
                                } else {
                                    barrier.setBarrierDirection(State.Direction.LEFT);
                                    continue;
                                }
                        }
                    case 2:
                        CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                        if (arrayOrNull != null) {
                            for (int i = 0; i < arrayOrNull.size(); i++) {
                                barrier.add(state.constraints(arrayOrNull.get(i).content()));
                            }
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void populateState(CLObject cLObject, State state, LayoutVariables layoutVariables) throws CLParsingException {
        char c;
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41e310b", new Object[]{cLObject, state, layoutVariables});
            return;
        }
        ArrayList<String> names = cLObject.names();
        if (names != null) {
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CLElement cLElement = cLObject.get(next);
                next.hashCode();
                switch (next.hashCode()) {
                    case -1824489883:
                        if (next.equals("Helpers")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1875016085:
                        if (next.equals("Generate")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1921490263:
                        if (next.equals("Variables")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        if (!(cLElement instanceof CLArray)) {
                            break;
                        } else {
                            parseHelpers(state, layoutVariables, (CLArray) cLElement);
                            break;
                        }
                    case 1:
                        if (!(cLElement instanceof CLObject)) {
                            break;
                        } else {
                            parseGenerate(state, layoutVariables, (CLObject) cLElement);
                            break;
                        }
                    case 2:
                        if (!(cLElement instanceof CLObject)) {
                            break;
                        } else {
                            parseVariables(state, layoutVariables, (CLObject) cLElement);
                            break;
                        }
                    default:
                        if (!(cLElement instanceof CLObject)) {
                            if (!(cLElement instanceof CLNumber)) {
                                break;
                            } else {
                                layoutVariables.put(next, cLElement.getInt());
                                break;
                            }
                        } else {
                            CLObject cLObject2 = (CLObject) cLElement;
                            String lookForType = lookForType(cLObject2);
                            if (lookForType == null) {
                                parseWidget(state, layoutVariables, next, cLObject2);
                                break;
                            } else {
                                switch (lookForType.hashCode()) {
                                    case -1785507558:
                                        if (lookForType.equals("vGuideline")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1354837162:
                                        if (lookForType.equals(pg1.ATOM_EXT_column)) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1252464839:
                                        if (lookForType.equals("hChain")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -851656725:
                                        if (lookForType.equals("vChain")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -333143113:
                                        if (lookForType.equals("barrier")) {
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 113114:
                                        if (lookForType.equals(pg1.ATOM_EXT_row)) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3181382:
                                        if (lookForType.equals(Constants.Value.GRID)) {
                                            c2 = 6;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 98238902:
                                        if (lookForType.equals("hFlow")) {
                                            c2 = 7;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 111168196:
                                        if (lookForType.equals("vFlow")) {
                                            c2 = '\b';
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 965681512:
                                        if (lookForType.equals("hGuideline")) {
                                            c2 = '\t';
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                        parseGuidelineParams(1, state, next, cLObject2);
                                        continue;
                                    case 1:
                                    case 5:
                                    case 6:
                                        parseGridType(lookForType, state, next, layoutVariables, cLObject2);
                                        continue;
                                    case 2:
                                    case 3:
                                        parseChainType(lookForType, state, next, layoutVariables, cLObject2);
                                        continue;
                                    case 4:
                                        parseBarrier(state, next, cLObject2);
                                        continue;
                                    case 7:
                                    case '\b':
                                        parseFlowType(lookForType, state, next, layoutVariables, cLObject2);
                                        continue;
                                    case '\t':
                                        parseGuidelineParams(0, state, next, cLObject2);
                                        continue;
                                }
                            }
                        }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r7.equals("start") == false) goto L_0x007a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void parseGuidelineParams(int r19, androidx.constraintlayout.core.state.State r20, java.lang.String r21, androidx.constraintlayout.core.parser.CLObject r22) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseGuidelineParams(int, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.parser.CLObject):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0151, code lost:
        if (r14.equals("rotationX") == false) goto L_0x002e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void applyAttribute(androidx.constraintlayout.core.state.State r10, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r11, androidx.constraintlayout.core.state.ConstraintReference r12, androidx.constraintlayout.core.parser.CLObject r13, java.lang.String r14) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.applyAttribute(androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.parser.CLObject, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void parseConstraint(androidx.constraintlayout.core.state.State r22, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r23, androidx.constraintlayout.core.parser.CLObject r24, androidx.constraintlayout.core.state.ConstraintReference r25, java.lang.String r26) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseConstraint(androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.ConstraintReference, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025b A[Catch: NumberFormatException -> 0x0263, TryCatch #1 {NumberFormatException -> 0x0263, blocks: (B:99:0x024c, B:101:0x025b, B:103:0x0266, B:105:0x026e, B:162:0x03c1, B:164:0x03d0, B:165:0x03d7, B:167:0x03df), top: B:197:0x024c }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026e A[Catch: NumberFormatException -> 0x0263, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0263, blocks: (B:99:0x024c, B:101:0x025b, B:103:0x0266, B:105:0x026e, B:162:0x03c1, B:164:0x03d0, B:165:0x03d7, B:167:0x03df), top: B:197:0x024c }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d0 A[Catch: NumberFormatException -> 0x0263, TryCatch #1 {NumberFormatException -> 0x0263, blocks: (B:99:0x024c, B:101:0x025b, B:103:0x0266, B:105:0x026e, B:162:0x03c1, B:164:0x03d0, B:165:0x03d7, B:167:0x03df), top: B:197:0x024c }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03df A[Catch: NumberFormatException -> 0x0263, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0263, blocks: (B:99:0x024c, B:101:0x025b, B:103:0x0266, B:105:0x026e, B:162:0x03c1, B:164:0x03d0, B:165:0x03d7, B:167:0x03df), top: B:197:0x024c }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0464 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void parseFlowType(java.lang.String r18, androidx.constraintlayout.core.state.State r19, java.lang.String r20, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r21, androidx.constraintlayout.core.parser.CLObject r22) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseFlowType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    private static void parseGridType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        CLElement cLElement;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e250d30b", new Object[]{str, state, str2, layoutVariables, cLObject});
            return;
        }
        GridReference grid = state.getGrid(str2, str);
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            String next = it.next();
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -1439500848:
                    if (next.equals("orientation")) {
                        c = 0;
                        break;
                    }
                    break;
                case -806339567:
                    if (next.equals("padding")) {
                        c = 1;
                        break;
                    }
                    break;
                case -567445985:
                    if (next.equals("contains")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3169614:
                    if (next.equals("hGap")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3506649:
                    if (next.equals(Constants.Name.ROWS)) {
                        c = 4;
                        break;
                    }
                    break;
                case 3586688:
                    if (next.equals("vGap")) {
                        c = 5;
                        break;
                    }
                    break;
                case 97513095:
                    if (next.equals("flags")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109497044:
                    if (next.equals("skips")) {
                        c = 7;
                        break;
                    }
                    break;
                case 109638249:
                    if (next.equals("spans")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 144441793:
                    if (next.equals("rowWeights")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 949721053:
                    if (next.equals("columns")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 2033353925:
                    if (next.equals("columnWeights")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    grid.setOrientation(cLObject.get(next).getInt());
                    break;
                case 1:
                    CLElement cLElement2 = cLObject.get(next);
                    if (cLElement2 instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement2;
                        if (cLArray.size() > 1) {
                            f2 = cLArray.getInt(0);
                            f = cLArray.getInt(1);
                            if (cLArray.size() > 2) {
                                f3 = cLArray.getInt(2);
                                try {
                                    f4 = ((CLArray) cLElement2).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f4 = 0.0f;
                                }
                            } else {
                                f3 = f2;
                                f4 = f;
                            }
                            grid.setPaddingStart(Math.round(toPix(state, f2)));
                            grid.setPaddingTop(Math.round(toPix(state, f)));
                            grid.setPaddingEnd(Math.round(toPix(state, f3)));
                            grid.setPaddingBottom(Math.round(toPix(state, f4)));
                            break;
                        }
                    }
                    f2 = cLElement2.getInt();
                    f4 = f2;
                    f3 = f4;
                    f = f3;
                    grid.setPaddingStart(Math.round(toPix(state, f2)));
                    grid.setPaddingTop(Math.round(toPix(state, f)));
                    grid.setPaddingEnd(Math.round(toPix(state, f3)));
                    grid.setPaddingBottom(Math.round(toPix(state, f4)));
                case 2:
                    CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                    if (arrayOrNull != null) {
                        for (int i2 = 0; i2 < arrayOrNull.size(); i2++) {
                            grid.add(state.constraints(arrayOrNull.get(i2).content()));
                        }
                        break;
                    } else {
                        break;
                    }
                case 3:
                    grid.setHorizontalGaps(toPix(state, cLObject.get(next).getFloat()));
                    break;
                case 4:
                    int i3 = cLObject.get(next).getInt();
                    if (i3 > 0) {
                        grid.setRowsSet(i3);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    grid.setVerticalGaps(toPix(state, cLObject.get(next).getFloat()));
                    break;
                case 6:
                    String str3 = "";
                    try {
                        cLElement = cLObject.get(next);
                    } catch (Exception e) {
                        System.err.println("Error parsing grid flags " + e);
                    }
                    if (cLElement instanceof CLNumber) {
                        i = cLElement.getInt();
                        if (str3 != null || str3.isEmpty()) {
                            grid.setFlags(i);
                            break;
                        } else {
                            grid.setFlags(str3);
                            break;
                        }
                    } else {
                        str3 = cLElement.content();
                        i = 0;
                        if (str3 != null) {
                        }
                        grid.setFlags(i);
                    }
                case 7:
                    String content = cLObject.get(next).content();
                    if (content != null && content.contains(":")) {
                        grid.setSkips(content);
                        break;
                    }
                    break;
                case '\b':
                    String content2 = cLObject.get(next).content();
                    if (content2 != null && content2.contains(":")) {
                        grid.setSpans(content2);
                        break;
                    }
                    break;
                case '\t':
                    String content3 = cLObject.get(next).content();
                    if (content3 != null && content3.contains(",")) {
                        grid.setRowWeights(content3);
                        break;
                    }
                    break;
                case '\n':
                    int i4 = cLObject.get(next).getInt();
                    if (i4 > 0) {
                        grid.setColumnsSet(i4);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    String content4 = cLObject.get(next).content();
                    if (content4 != null && content4.contains(",")) {
                        grid.setColumnWeights(content4);
                        break;
                    }
                    break;
                default:
                    applyAttribute(state, layoutVariables, state.constraints(str2), cLObject, next);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void parseChainType(java.lang.String r21, androidx.constraintlayout.core.state.State r22, java.lang.String r23, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r24, androidx.constraintlayout.core.parser.CLObject r25) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseChainType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    public static void parseJSON(String str, State state, LayoutVariables layoutVariables) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7401a224", new Object[]{str, state, layoutVariables});
            return;
        }
        try {
            populateState(CLParser.parse(str), state, layoutVariables);
        } catch (CLParsingException e) {
            PrintStream printStream = System.err;
            printStream.println("Error parsing JSON " + e);
        }
    }
}
