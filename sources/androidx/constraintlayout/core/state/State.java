package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference;
import androidx.constraintlayout.core.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class State {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONSTRAINT_RATIO = 2;
    public static final int CONSTRAINT_SPREAD = 0;
    public static final int CONSTRAINT_WRAP = 1;
    public static final Integer PARENT = 0;
    public static final int UNKNOWN = -1;
    private CorePixelDp mDpToPixel;
    public final ConstraintReference mParent;
    private boolean mIsLtr = true;
    public HashMap<Object, Reference> mReferences = new HashMap<>();
    public HashMap<Object, HelperReference> mHelperReferences = new HashMap<>();
    public HashMap<String, ArrayList<String>> mTags = new HashMap<>();
    private int mNumHelpers = 0;
    public ArrayList<Object> mBaselineNeeded = new ArrayList<>();
    public ArrayList<ConstraintWidget> mBaselineNeededWidgets = new ArrayList<>();
    public boolean mDirtyBaselineNeededWidgets = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Chain extends Enum<Chain> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Chain PACKED;
        public static final Chain SPREAD;
        public static final Chain SPREAD_INSIDE;
        private static final /* synthetic */ Chain[] $VALUES = $values();
        public static Map<String, Chain> chainMap = new HashMap();
        public static Map<String, Integer> valueMap = new HashMap();

        private static /* synthetic */ Chain[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Chain[]) ipChange.ipc$dispatch("7e0c579f", new Object[0]) : new Chain[]{SPREAD, SPREAD_INSIDE, PACKED};
        }

        static {
            Chain chain = new Chain("SPREAD", 0);
            SPREAD = chain;
            Chain chain2 = new Chain("SPREAD_INSIDE", 1);
            SPREAD_INSIDE = chain2;
            Chain chain3 = new Chain("PACKED", 2);
            PACKED = chain3;
            chainMap.put("packed", chain3);
            chainMap.put("spread_inside", chain2);
            chainMap.put("spread", chain);
            valueMap.put("packed", 2);
            valueMap.put("spread_inside", 1);
            valueMap.put("spread", 0);
        }

        private Chain(String str, int i) {
        }

        public static Chain getChainByString(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Chain) ipChange.ipc$dispatch("85621a9f", new Object[]{str});
            }
            if (chainMap.containsKey(str)) {
                return chainMap.get(str);
            }
            return null;
        }

        public static int getValueByString(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a4b45a67", new Object[]{str})).intValue();
            }
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static /* synthetic */ Object ipc$super(Chain chain, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/State$Chain");
        }

        public static Chain valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Chain) ipChange.ipc$dispatch("a51dfb4a", new Object[]{str});
            }
            return (Chain) Enum.valueOf(Chain.class, str);
        }

        public static Chain[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Chain[]) ipChange.ipc$dispatch("4581c57b", new Object[0]);
            }
            return (Chain[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Constraint extends Enum<Constraint> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Constraint LEFT_TO_LEFT = new Constraint("LEFT_TO_LEFT", 0);
        public static final Constraint LEFT_TO_RIGHT = new Constraint("LEFT_TO_RIGHT", 1);
        public static final Constraint RIGHT_TO_LEFT = new Constraint("RIGHT_TO_LEFT", 2);
        public static final Constraint RIGHT_TO_RIGHT = new Constraint("RIGHT_TO_RIGHT", 3);
        public static final Constraint START_TO_START = new Constraint("START_TO_START", 4);
        public static final Constraint START_TO_END = new Constraint("START_TO_END", 5);
        public static final Constraint END_TO_START = new Constraint("END_TO_START", 6);
        public static final Constraint END_TO_END = new Constraint("END_TO_END", 7);
        public static final Constraint TOP_TO_TOP = new Constraint("TOP_TO_TOP", 8);
        public static final Constraint TOP_TO_BOTTOM = new Constraint("TOP_TO_BOTTOM", 9);
        public static final Constraint TOP_TO_BASELINE = new Constraint("TOP_TO_BASELINE", 10);
        public static final Constraint BOTTOM_TO_TOP = new Constraint("BOTTOM_TO_TOP", 11);
        public static final Constraint BOTTOM_TO_BOTTOM = new Constraint("BOTTOM_TO_BOTTOM", 12);
        public static final Constraint BOTTOM_TO_BASELINE = new Constraint("BOTTOM_TO_BASELINE", 13);
        public static final Constraint BASELINE_TO_BASELINE = new Constraint("BASELINE_TO_BASELINE", 14);
        public static final Constraint BASELINE_TO_TOP = new Constraint("BASELINE_TO_TOP", 15);
        public static final Constraint BASELINE_TO_BOTTOM = new Constraint("BASELINE_TO_BOTTOM", 16);
        public static final Constraint CENTER_HORIZONTALLY = new Constraint("CENTER_HORIZONTALLY", 17);
        public static final Constraint CENTER_VERTICALLY = new Constraint("CENTER_VERTICALLY", 18);
        public static final Constraint CIRCULAR_CONSTRAINT = new Constraint("CIRCULAR_CONSTRAINT", 19);
        private static final /* synthetic */ Constraint[] $VALUES = $values();

        private Constraint(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Constraint constraint, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/State$Constraint");
        }

        public static Constraint valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Constraint) ipChange.ipc$dispatch("b8bd3a4e", new Object[]{str});
            }
            return (Constraint) Enum.valueOf(Constraint.class, str);
        }

        public static Constraint[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Constraint[]) ipChange.ipc$dispatch("e4c526bd", new Object[0]);
            }
            return (Constraint[]) $VALUES.clone();
        }

        private static /* synthetic */ Constraint[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Constraint[]) ipChange.ipc$dispatch("d3744b19", new Object[0]) : new Constraint[]{LEFT_TO_LEFT, LEFT_TO_RIGHT, RIGHT_TO_LEFT, RIGHT_TO_RIGHT, START_TO_START, START_TO_END, END_TO_START, END_TO_END, TOP_TO_TOP, TOP_TO_BOTTOM, TOP_TO_BASELINE, BOTTOM_TO_TOP, BOTTOM_TO_BOTTOM, BOTTOM_TO_BASELINE, BASELINE_TO_BASELINE, BASELINE_TO_TOP, BASELINE_TO_BOTTOM, CENTER_HORIZONTALLY, CENTER_VERTICALLY, CIRCULAR_CONSTRAINT};
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Direction extends Enum<Direction> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Direction LEFT = new Direction("LEFT", 0);
        public static final Direction RIGHT = new Direction("RIGHT", 1);
        public static final Direction START = new Direction("START", 2);
        public static final Direction END = new Direction("END", 3);
        public static final Direction TOP = new Direction("TOP", 4);
        public static final Direction BOTTOM = new Direction("BOTTOM", 5);
        private static final /* synthetic */ Direction[] $VALUES = $values();

        private Direction(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Direction direction, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/State$Direction");
        }

        public static Direction valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Direction) ipChange.ipc$dispatch("2f338a4c", new Object[]{str});
            }
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Direction[]) ipChange.ipc$dispatch("754d3fd", new Object[0]);
            }
            return (Direction[]) $VALUES.clone();
        }

        private static /* synthetic */ Direction[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Direction[]) ipChange.ipc$dispatch("f641b421", new Object[0]) : new Direction[]{LEFT, RIGHT, START, END, TOP, BOTTOM};
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Helper extends Enum<Helper> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Helper HORIZONTAL_CHAIN = new Helper("HORIZONTAL_CHAIN", 0);
        public static final Helper VERTICAL_CHAIN = new Helper("VERTICAL_CHAIN", 1);
        public static final Helper ALIGN_HORIZONTALLY = new Helper("ALIGN_HORIZONTALLY", 2);
        public static final Helper ALIGN_VERTICALLY = new Helper("ALIGN_VERTICALLY", 3);
        public static final Helper BARRIER = new Helper("BARRIER", 4);
        public static final Helper LAYER = new Helper("LAYER", 5);
        public static final Helper HORIZONTAL_FLOW = new Helper("HORIZONTAL_FLOW", 6);
        public static final Helper VERTICAL_FLOW = new Helper("VERTICAL_FLOW", 7);
        public static final Helper GRID = new Helper("GRID", 8);
        public static final Helper ROW = new Helper("ROW", 9);
        public static final Helper COLUMN = new Helper("COLUMN", 10);
        public static final Helper FLOW = new Helper("FLOW", 11);
        private static final /* synthetic */ Helper[] $VALUES = $values();

        private static /* synthetic */ Helper[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Helper[]) ipChange.ipc$dispatch("477d50e8", new Object[0]) : new Helper[]{HORIZONTAL_CHAIN, VERTICAL_CHAIN, ALIGN_HORIZONTALLY, ALIGN_VERTICALLY, BARRIER, LAYER, HORIZONTAL_FLOW, VERTICAL_FLOW, GRID, ROW, COLUMN, FLOW};
        }

        private Helper(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Helper helper, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/State$Helper");
        }

        public static Helper valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Helper) ipChange.ipc$dispatch("2a0229d", new Object[]{str});
            }
            return (Helper) Enum.valueOf(Helper.class, str);
        }

        public static Helper[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Helper[]) ipChange.ipc$dispatch("6eb59e8c", new Object[0]);
            }
            return (Helper[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Wrap extends Enum<Wrap> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Wrap ALIGNED;
        public static final Wrap CHAIN;
        public static final Wrap NONE;
        private static final /* synthetic */ Wrap[] $VALUES = $values();
        public static Map<String, Wrap> wrapMap = new HashMap();
        public static Map<String, Integer> valueMap = new HashMap();

        private static /* synthetic */ Wrap[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Wrap[]) ipChange.ipc$dispatch("26378e8c", new Object[0]) : new Wrap[]{NONE, CHAIN, ALIGNED};
        }

        static {
            Wrap wrap = new Wrap("NONE", 0);
            NONE = wrap;
            Wrap wrap2 = new Wrap("CHAIN", 1);
            CHAIN = wrap2;
            Wrap wrap3 = new Wrap("ALIGNED", 2);
            ALIGNED = wrap3;
            wrapMap.put("none", wrap);
            wrapMap.put("chain", wrap2);
            wrapMap.put("aligned", wrap3);
            valueMap.put("none", 0);
            valueMap.put("chain", 3);
            valueMap.put("aligned", 2);
        }

        private Wrap(String str, int i) {
        }

        public static Wrap getChainByString(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Wrap) ipChange.ipc$dispatch("cb9d6b8c", new Object[]{str});
            }
            if (wrapMap.containsKey(str)) {
                return wrapMap.get(str);
            }
            return null;
        }

        public static int getValueByString(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a4b45a67", new Object[]{str})).intValue();
            }
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static /* synthetic */ Object ipc$super(Wrap wrap, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/State$Wrap");
        }

        public static Wrap valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Wrap) ipChange.ipc$dispatch("b3dd4981", new Object[]{str});
            }
            return (Wrap) Enum.valueOf(Wrap.class, str);
        }

        public static Wrap[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Wrap[]) ipChange.ipc$dispatch("4daef530", new Object[0]);
            }
            return (Wrap[]) $VALUES.clone();
        }
    }

    public State() {
        ConstraintReference constraintReference = new ConstraintReference(this);
        this.mParent = constraintReference;
        Integer num = PARENT;
        constraintReference.setKey(num);
        this.mReferences.put(num, constraintReference);
    }

    private String createHelperKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa7567e4", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i = this.mNumHelpers;
        this.mNumHelpers = 1 + i;
        sb.append(i);
        sb.append("__");
        return sb.toString();
    }

    public BarrierReference barrier(Object obj, Direction direction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BarrierReference) ipChange.ipc$dispatch("9647e510", new Object[]{this, obj, direction});
        }
        ConstraintReference constraints = constraints(obj);
        if (constraints.getFacade() == null || !(constraints.getFacade() instanceof BarrierReference)) {
            BarrierReference barrierReference = new BarrierReference(this);
            barrierReference.setBarrierDirection(direction);
            constraints.setFacade(barrierReference);
        }
        return (BarrierReference) constraints.getFacade();
    }

    public void baselineNeededFor(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba0a772", new Object[]{this, obj});
            return;
        }
        this.mBaselineNeeded.add(obj);
        this.mDirtyBaselineNeededWidgets = true;
    }

    public AlignHorizontallyReference centerHorizontally(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlignHorizontallyReference) ipChange.ipc$dispatch("bdf802a", new Object[]{this, objArr});
        }
        AlignHorizontallyReference alignHorizontallyReference = (AlignHorizontallyReference) helper(null, Helper.ALIGN_HORIZONTALLY);
        alignHorizontallyReference.add(objArr);
        return alignHorizontallyReference;
    }

    public AlignVerticallyReference centerVertically(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlignVerticallyReference) ipChange.ipc$dispatch("79c787ea", new Object[]{this, objArr});
        }
        AlignVerticallyReference alignVerticallyReference = (AlignVerticallyReference) helper(null, Helper.ALIGN_VERTICALLY);
        alignVerticallyReference.add(objArr);
        return alignVerticallyReference;
    }

    public ConstraintReference constraints(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("aac1fa8a", new Object[]{this, obj});
        }
        Reference reference = this.mReferences.get(obj);
        if (reference == null) {
            reference = createConstraintReference(obj);
            this.mReferences.put(obj, reference);
            reference.setKey(obj);
        }
        if (reference instanceof ConstraintReference) {
            return (ConstraintReference) reference;
        }
        return null;
    }

    public int convertDimension(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c00a149", new Object[]{this, obj})).intValue();
        }
        if (obj instanceof Float) {
            return Math.round(((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public ConstraintReference createConstraintReference(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("1aa1e5ee", new Object[]{this, obj});
        }
        return new ConstraintReference(this);
    }

    public void directMapping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8536ac", new Object[]{this});
            return;
        }
        for (Object obj : this.mReferences.keySet()) {
            ConstraintReference constraints = constraints(obj);
            if (constraints instanceof ConstraintReference) {
                constraints.setView(obj);
            }
        }
    }

    public CorePixelDp getDpToPixel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CorePixelDp) ipChange.ipc$dispatch("ff13044e", new Object[]{this});
        }
        return this.mDpToPixel;
    }

    public FlowReference getFlow(Object obj, boolean z) {
        FlowReference flowReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlowReference) ipChange.ipc$dispatch("a762a391", new Object[]{this, obj, new Boolean(z)});
        }
        ConstraintReference constraints = constraints(obj);
        if (constraints.getFacade() == null || !(constraints.getFacade() instanceof FlowReference)) {
            if (z) {
                flowReference = new FlowReference(this, Helper.VERTICAL_FLOW);
            } else {
                flowReference = new FlowReference(this, Helper.HORIZONTAL_FLOW);
            }
            constraints.setFacade(flowReference);
        }
        return (FlowReference) constraints.getFacade();
    }

    public GridReference getGrid(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GridReference) ipChange.ipc$dispatch("417e372d", new Object[]{this, obj, str});
        }
        ConstraintReference constraints = constraints(obj);
        if (constraints.getFacade() == null || !(constraints.getFacade() instanceof GridReference)) {
            Helper helper = Helper.GRID;
            if (str.charAt(0) == 'r') {
                helper = Helper.ROW;
            } else if (str.charAt(0) == 'c') {
                helper = Helper.COLUMN;
            }
            constraints.setFacade(new GridReference(this, helper));
        }
        return (GridReference) constraints.getFacade();
    }

    public FlowReference getHorizontalFlow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FlowReference) ipChange.ipc$dispatch("56a81cf", new Object[]{this}) : (FlowReference) helper(null, Helper.HORIZONTAL_FLOW);
    }

    public ArrayList<String> getIdsForTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("30e9e05e", new Object[]{this, str});
        }
        if (this.mTags.containsKey(str)) {
            return this.mTags.get(str);
        }
        return null;
    }

    public FlowReference getVerticalFlow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FlowReference) ipChange.ipc$dispatch("da727bd", new Object[]{this}) : (FlowReference) helper(null, Helper.VERTICAL_FLOW);
    }

    public GuidelineReference guideline(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GuidelineReference) ipChange.ipc$dispatch("4f3ae930", new Object[]{this, obj, new Integer(i)});
        }
        ConstraintReference constraints = constraints(obj);
        if (constraints.getFacade() == null || !(constraints.getFacade() instanceof GuidelineReference)) {
            GuidelineReference guidelineReference = new GuidelineReference(this);
            guidelineReference.setOrientation(i);
            guidelineReference.setKey(obj);
            constraints.setFacade(guidelineReference);
        }
        return (GuidelineReference) constraints.getFacade();
    }

    public State height(Dimension dimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (State) ipChange.ipc$dispatch("c393057d", new Object[]{this, dimension});
        }
        return setHeight(dimension);
    }

    public HelperReference helper(Object obj, Helper helper) {
        HelperReference horizontalChainReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HelperReference) ipChange.ipc$dispatch("11a12c71", new Object[]{this, obj, helper});
        }
        if (obj == null) {
            obj = createHelperKey();
        }
        HelperReference helperReference = this.mHelperReferences.get(obj);
        if (helperReference == null) {
            switch (helper.ordinal()) {
                case 0:
                    horizontalChainReference = new HorizontalChainReference(this);
                    helperReference = horizontalChainReference;
                    break;
                case 1:
                    horizontalChainReference = new VerticalChainReference(this);
                    helperReference = horizontalChainReference;
                    break;
                case 2:
                    horizontalChainReference = new AlignHorizontallyReference(this);
                    helperReference = horizontalChainReference;
                    break;
                case 3:
                    horizontalChainReference = new AlignVerticallyReference(this);
                    helperReference = horizontalChainReference;
                    break;
                case 4:
                    horizontalChainReference = new BarrierReference(this);
                    helperReference = horizontalChainReference;
                    break;
                case 5:
                default:
                    helperReference = new HelperReference(this, helper);
                    break;
                case 6:
                case 7:
                    helperReference = new FlowReference(this, helper);
                    break;
                case 8:
                case 9:
                case 10:
                    helperReference = new GridReference(this, helper);
                    break;
            }
            helperReference.setKey(obj);
            this.mHelperReferences.put(obj, helperReference);
        }
        return helperReference;
    }

    public HorizontalChainReference horizontalChain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HorizontalChainReference) ipChange.ipc$dispatch("64fef131", new Object[]{this}) : (HorizontalChainReference) helper(null, Helper.HORIZONTAL_CHAIN);
    }

    public GuidelineReference horizontalGuideline(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GuidelineReference) ipChange.ipc$dispatch("42c4262f", new Object[]{this, obj});
        }
        return guideline(obj, 0);
    }

    public boolean isBaselineNeeded(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79215b8b", new Object[]{this, constraintWidget})).booleanValue();
        }
        if (this.mDirtyBaselineNeededWidgets) {
            this.mBaselineNeededWidgets.clear();
            Iterator<Object> it = this.mBaselineNeeded.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget2 = this.mReferences.get(it.next()).getConstraintWidget();
                if (constraintWidget2 != null) {
                    this.mBaselineNeededWidgets.add(constraintWidget2);
                }
            }
            this.mDirtyBaselineNeededWidgets = false;
        }
        return this.mBaselineNeededWidgets.contains(constraintWidget);
    }

    @Deprecated
    public boolean isLtr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fae06aeb", new Object[]{this})).booleanValue();
        }
        return this.mIsLtr;
    }

    public boolean isRtl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37f1416b", new Object[]{this})).booleanValue();
        }
        return true ^ this.mIsLtr;
    }

    public void map(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe2471b", new Object[]{this, obj, obj2});
            return;
        }
        ConstraintReference constraints = constraints(obj);
        if (constraints != null) {
            constraints.setView(obj2);
        }
    }

    public Reference reference(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reference) ipChange.ipc$dispatch("67547518", new Object[]{this, obj});
        }
        return this.mReferences.get(obj);
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        for (Object obj : this.mReferences.keySet()) {
            this.mReferences.get(obj).getConstraintWidget().reset();
        }
        this.mReferences.clear();
        this.mReferences.put(PARENT, this.mParent);
        this.mHelperReferences.clear();
        this.mTags.clear();
        this.mBaselineNeeded.clear();
        this.mDirtyBaselineNeededWidgets = true;
    }

    public boolean sameFixedHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("275e570b", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.mParent.getHeight().equalsFixedValue(i);
    }

    public boolean sameFixedWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80e15ea8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.mParent.getWidth().equalsFixedValue(i);
    }

    public void setDpToPixel(CorePixelDp corePixelDp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6805ad4c", new Object[]{this, corePixelDp});
        } else {
            this.mDpToPixel = corePixelDp;
        }
    }

    public State setHeight(Dimension dimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (State) ipChange.ipc$dispatch("9db75e3b", new Object[]{this, dimension});
        }
        this.mParent.setHeight(dimension);
        return this;
    }

    @Deprecated
    public void setLtr(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7089c05", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsLtr = z;
        }
    }

    public void setRtl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c129585", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsLtr = !z;
        }
    }

    public void setTag(String str, String str2) {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10b21f3", new Object[]{this, str, str2});
            return;
        }
        ConstraintReference constraints = constraints(str);
        if (constraints instanceof ConstraintReference) {
            constraints.setTag(str2);
            if (!this.mTags.containsKey(str2)) {
                arrayList = new ArrayList<>();
                this.mTags.put(str2, arrayList);
            } else {
                arrayList = this.mTags.get(str2);
            }
            arrayList.add(str);
        }
    }

    public State setWidth(Dimension dimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (State) ipChange.ipc$dispatch("8d83a480", new Object[]{this, dimension});
        }
        this.mParent.setWidth(dimension);
        return this;
    }

    public VerticalChainReference verticalChain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerticalChainReference) ipChange.ipc$dispatch("56f5a28d", new Object[]{this}) : (VerticalChainReference) helper(null, Helper.VERTICAL_CHAIN);
    }

    public GuidelineReference verticalGuideline(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GuidelineReference) ipChange.ipc$dispatch("ca8bf09d", new Object[]{this, obj});
        }
        return guideline(obj, 1);
    }

    public State width(Dimension dimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (State) ipChange.ipc$dispatch("f1d50cfe", new Object[]{this, dimension});
        }
        return setWidth(dimension);
    }

    public FlowReference getHorizontalFlow(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlowReference) ipChange.ipc$dispatch("a66cb8fc", new Object[]{this, objArr});
        }
        FlowReference flowReference = (FlowReference) helper(null, Helper.HORIZONTAL_FLOW);
        flowReference.add(objArr);
        return flowReference;
    }

    public FlowReference getVerticalFlow(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlowReference) ipChange.ipc$dispatch("8451404e", new Object[]{this, objArr});
        }
        FlowReference flowReference = (FlowReference) helper(null, Helper.VERTICAL_FLOW);
        flowReference.add(objArr);
        return flowReference;
    }

    public HorizontalChainReference horizontalChain(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HorizontalChainReference) ipChange.ipc$dispatch("ea50ad1a", new Object[]{this, objArr});
        }
        HorizontalChainReference horizontalChainReference = (HorizontalChainReference) helper(null, Helper.HORIZONTAL_CHAIN);
        horizontalChainReference.add(objArr);
        return horizontalChainReference;
    }

    public VerticalChainReference verticalChain(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerticalChainReference) ipChange.ipc$dispatch("1d5f9e1a", new Object[]{this, objArr});
        }
        VerticalChainReference verticalChainReference = (VerticalChainReference) helper(null, Helper.VERTICAL_CHAIN);
        verticalChainReference.add(objArr);
        return verticalChainReference;
    }

    public void apply(ConstraintWidgetContainer constraintWidgetContainer) {
        HelperReference helperReference;
        HelperWidget helperWidget;
        HelperWidget helperWidget2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c39f6b2", new Object[]{this, constraintWidgetContainer});
            return;
        }
        constraintWidgetContainer.removeAllChildren();
        this.mParent.getWidth().apply(this, constraintWidgetContainer, 0);
        this.mParent.getHeight().apply(this, constraintWidgetContainer, 1);
        for (Object obj : this.mHelperReferences.keySet()) {
            HelperWidget helperWidget3 = this.mHelperReferences.get(obj).getHelperWidget();
            if (helperWidget3 != null) {
                Reference reference = this.mReferences.get(obj);
                if (reference == null) {
                    reference = constraints(obj);
                }
                reference.setConstraintWidget(helperWidget3);
            }
        }
        for (Object obj2 : this.mReferences.keySet()) {
            Reference reference2 = this.mReferences.get(obj2);
            if (!(reference2 == this.mParent || !(reference2.getFacade() instanceof HelperReference) || (helperWidget2 = ((HelperReference) reference2.getFacade()).getHelperWidget()) == null)) {
                Reference reference3 = this.mReferences.get(obj2);
                if (reference3 == null) {
                    reference3 = constraints(obj2);
                }
                reference3.setConstraintWidget(helperWidget2);
            }
        }
        for (Object obj3 : this.mReferences.keySet()) {
            Reference reference4 = this.mReferences.get(obj3);
            if (reference4 != this.mParent) {
                ConstraintWidget constraintWidget = reference4.getConstraintWidget();
                constraintWidget.setDebugName(reference4.getKey().toString());
                constraintWidget.setParent(null);
                if (reference4.getFacade() instanceof GuidelineReference) {
                    reference4.apply();
                }
                constraintWidgetContainer.add(constraintWidget);
            } else {
                reference4.setConstraintWidget(constraintWidgetContainer);
            }
        }
        for (Object obj4 : this.mHelperReferences.keySet()) {
            HelperReference helperReference2 = this.mHelperReferences.get(obj4);
            if (helperReference2.getHelperWidget() != null) {
                Iterator<Object> it = helperReference2.mReferences.iterator();
                while (it.hasNext()) {
                    helperReference2.getHelperWidget().add(this.mReferences.get(it.next()).getConstraintWidget());
                }
                helperReference2.apply();
            } else {
                helperReference2.apply();
            }
        }
        for (Object obj5 : this.mReferences.keySet()) {
            Reference reference5 = this.mReferences.get(obj5);
            if (!(reference5 == this.mParent || !(reference5.getFacade() instanceof HelperReference) || (helperWidget = (helperReference = (HelperReference) reference5.getFacade()).getHelperWidget()) == null)) {
                Iterator<Object> it2 = helperReference.mReferences.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    Reference reference6 = this.mReferences.get(next);
                    if (reference6 != null) {
                        helperWidget.add(reference6.getConstraintWidget());
                    } else if (next instanceof Reference) {
                        helperWidget.add(((Reference) next).getConstraintWidget());
                    } else {
                        PrintStream printStream = System.out;
                        printStream.println("couldn't find reference for " + next);
                    }
                }
                reference5.apply();
            }
        }
        for (Object obj6 : this.mReferences.keySet()) {
            Reference reference7 = this.mReferences.get(obj6);
            reference7.apply();
            ConstraintWidget constraintWidget2 = reference7.getConstraintWidget();
            if (!(constraintWidget2 == null || obj6 == null)) {
                constraintWidget2.stringId = obj6.toString();
            }
        }
    }
}
