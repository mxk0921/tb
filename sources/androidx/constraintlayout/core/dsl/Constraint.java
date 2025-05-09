package androidx.constraintlayout.core.dsl;

import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Constraint {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Constraint PARENT = new Constraint(a.MSG_SOURCE_PARENT);
    public static int UNSET = Integer.MIN_VALUE;
    public static Map<ChainMode, String> chainModeMap;
    private int mHeight;
    private int mHeightMax;
    private int mHeightMin;
    private final String mId;
    private int mWidth;
    private int mWidthMax;
    private int mWidthMin;
    public String helperType = null;
    public String helperJason = null;
    private HAnchor mLeft = new HAnchor(HSide.LEFT);
    private HAnchor mRight = new HAnchor(HSide.RIGHT);
    private VAnchor mTop = new VAnchor(VSide.TOP);
    private VAnchor mBottom = new VAnchor(VSide.BOTTOM);
    private HAnchor mStart = new HAnchor(HSide.START);
    private HAnchor mEnd = new HAnchor(HSide.END);
    private VAnchor mBaseline = new VAnchor(VSide.BASELINE);
    private float mHorizontalBias = Float.NaN;
    private float mVerticalBias = Float.NaN;
    private String mDimensionRatio = null;
    private String mCircleConstraint = null;
    private int mCircleRadius = Integer.MIN_VALUE;
    private float mCircleAngle = Float.NaN;
    private int mEditorAbsoluteX = Integer.MIN_VALUE;
    private int mEditorAbsoluteY = Integer.MIN_VALUE;
    private float mVerticalWeight = Float.NaN;
    private float mHorizontalWeight = Float.NaN;
    private ChainMode mHorizontalChainStyle = null;
    private ChainMode mVerticalChainStyle = null;
    private Behaviour mWidthDefault = null;
    private Behaviour mHeightDefault = null;
    private float mWidthPercent = Float.NaN;
    private float mHeightPercent = Float.NaN;
    private String[] mReferenceIds = null;
    private boolean mConstrainedWidth = false;
    private boolean mConstrainedHeight = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class Anchor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Anchor mConnection = null;
        public int mGoneMargin = Integer.MIN_VALUE;
        public int mMargin;
        public final Side mSide;

        public Anchor(Side side) {
            this.mSide = side;
        }

        public void build(StringBuilder sb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec40a1d6", new Object[]{this, sb});
            } else if (this.mConnection != null) {
                sb.append(this.mSide.toString().toLowerCase());
                sb.append(":");
                sb.append(this);
                sb.append(",\n");
            }
        }

        public String getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            return Constraint.access$000(Constraint.this);
        }

        public Constraint getParent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Constraint) ipChange.ipc$dispatch("d02edf9b", new Object[]{this});
            }
            return Constraint.this;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("[");
            if (this.mConnection != null) {
                sb.append("'");
                sb.append(this.mConnection.getId());
                sb.append("','");
                sb.append(this.mConnection.mSide.toString().toLowerCase());
                sb.append("'");
            }
            if (this.mMargin != 0) {
                sb.append(",");
                sb.append(this.mMargin);
            }
            if (this.mGoneMargin != Integer.MIN_VALUE) {
                if (this.mMargin == 0) {
                    sb.append(",0,");
                    sb.append(this.mGoneMargin);
                } else {
                    sb.append(",");
                    sb.append(this.mGoneMargin);
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Behaviour extends Enum<Behaviour> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Behaviour SPREAD = new Behaviour("SPREAD", 0);
        public static final Behaviour WRAP = new Behaviour("WRAP", 1);
        public static final Behaviour PERCENT = new Behaviour("PERCENT", 2);
        public static final Behaviour RATIO = new Behaviour("RATIO", 3);
        public static final Behaviour RESOLVED = new Behaviour("RESOLVED", 4);
        private static final /* synthetic */ Behaviour[] $VALUES = $values();

        private static /* synthetic */ Behaviour[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Behaviour[]) ipChange.ipc$dispatch("9793e15f", new Object[0]) : new Behaviour[]{SPREAD, WRAP, PERCENT, RATIO, RESOLVED};
        }

        private Behaviour(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Behaviour behaviour, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/Constraint$Behaviour");
        }

        public static Behaviour valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Behaviour) ipChange.ipc$dispatch("4e5dd754", new Object[]{str});
            }
            return (Behaviour) Enum.valueOf(Behaviour.class, str);
        }

        public static Behaviour[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Behaviour[]) ipChange.ipc$dispatch("981c6403", new Object[0]);
            }
            return (Behaviour[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class ChainMode extends Enum<ChainMode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final ChainMode SPREAD = new ChainMode("SPREAD", 0);
        public static final ChainMode SPREAD_INSIDE = new ChainMode("SPREAD_INSIDE", 1);
        public static final ChainMode PACKED = new ChainMode("PACKED", 2);
        private static final /* synthetic */ ChainMode[] $VALUES = $values();

        private static /* synthetic */ ChainMode[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ChainMode[]) ipChange.ipc$dispatch("982a6f8", new Object[0]) : new ChainMode[]{SPREAD, SPREAD_INSIDE, PACKED};
        }

        private ChainMode(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(ChainMode chainMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/Constraint$ChainMode");
        }

        public static ChainMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ChainMode) ipChange.ipc$dispatch("c04c9ced", new Object[]{str});
            }
            return (ChainMode) Enum.valueOf(ChainMode.class, str);
        }

        public static ChainMode[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ChainMode[]) ipChange.ipc$dispatch("a0b299c", new Object[0]);
            }
            return (ChainMode[]) $VALUES.clone();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class HAnchor extends Anchor {
        public HAnchor(HSide hSide) {
            super(Side.valueOf(hSide.name()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class HSide extends Enum<HSide> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final HSide LEFT = new HSide("LEFT", 0);
        public static final HSide RIGHT = new HSide("RIGHT", 1);
        public static final HSide START = new HSide("START", 2);
        public static final HSide END = new HSide("END", 3);
        private static final /* synthetic */ HSide[] $VALUES = $values();

        private HSide(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(HSide hSide, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/Constraint$HSide");
        }

        public static HSide valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HSide) ipChange.ipc$dispatch("729dc172", new Object[]{str});
            }
            return (HSide) Enum.valueOf(HSide.class, str);
        }

        public static HSide[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HSide[]) ipChange.ipc$dispatch("2f43fda1", new Object[0]);
            }
            return (HSide[]) $VALUES.clone();
        }

        private static /* synthetic */ HSide[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HSide[]) ipChange.ipc$dispatch("f4e888fd", new Object[0]) : new HSide[]{LEFT, RIGHT, START, END};
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Side extends Enum<Side> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Side LEFT = new Side("LEFT", 0);
        public static final Side RIGHT = new Side("RIGHT", 1);
        public static final Side TOP = new Side("TOP", 2);
        public static final Side BOTTOM = new Side("BOTTOM", 3);
        public static final Side START = new Side("START", 4);
        public static final Side END = new Side("END", 5);
        public static final Side BASELINE = new Side("BASELINE", 6);
        private static final /* synthetic */ Side[] $VALUES = $values();

        private Side(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Side side, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/Constraint$Side");
        }

        public static Side valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Side) ipChange.ipc$dispatch("a13eabce", new Object[]{str});
            }
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Side[]) ipChange.ipc$dispatch("b7d8adbf", new Object[0]);
            }
            return (Side[]) $VALUES.clone();
        }

        private static /* synthetic */ Side[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Side[]) ipChange.ipc$dispatch("f80746e3", new Object[0]) : new Side[]{LEFT, RIGHT, TOP, BOTTOM, START, END, BASELINE};
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class VAnchor extends Anchor {
        public VAnchor(VSide vSide) {
            super(Side.valueOf(vSide.name()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class VSide extends Enum<VSide> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final VSide TOP = new VSide("TOP", 0);
        public static final VSide BOTTOM = new VSide("BOTTOM", 1);
        public static final VSide BASELINE = new VSide("BASELINE", 2);
        private static final /* synthetic */ VSide[] $VALUES = $values();

        private VSide(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(VSide vSide, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/Constraint$VSide");
        }

        public static VSide valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VSide) ipChange.ipc$dispatch("8a819a24", new Object[]{str});
            }
            return (VSide) Enum.valueOf(VSide.class, str);
        }

        public static VSide[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VSide[]) ipChange.ipc$dispatch("4727d653", new Object[0]);
            }
            return (VSide[]) $VALUES.clone();
        }

        private static /* synthetic */ VSide[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (VSide[]) ipChange.ipc$dispatch("ccc61af", new Object[0]) : new VSide[]{TOP, BOTTOM, BASELINE};
        }
    }

    static {
        HashMap hashMap = new HashMap();
        chainModeMap = hashMap;
        hashMap.put(ChainMode.SPREAD, "spread");
        chainModeMap.put(ChainMode.SPREAD_INSIDE, "spread_inside");
        chainModeMap.put(ChainMode.PACKED, "packed");
    }

    public Constraint(String str) {
        int i = UNSET;
        this.mWidth = i;
        this.mHeight = i;
        this.mWidthMax = i;
        this.mHeightMax = i;
        this.mWidthMin = i;
        this.mHeightMin = i;
        this.mId = str;
    }

    public static /* synthetic */ String access$000(Constraint constraint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91b7af53", new Object[]{constraint});
        }
        return constraint.mId;
    }

    public void append(StringBuilder sb, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f847ea4c", new Object[]{this, sb, str, new Float(f)});
        } else if (!Float.isNaN(f)) {
            sb.append(str);
            sb.append(":");
            sb.append(f);
            sb.append(",\n");
        }
    }

    public String convertStringArrayToString(String[] strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c002c09", new Object[]{this, strArr});
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                str = "'";
            } else {
                str = ",'";
            }
            sb.append(str);
            sb.append(strArr[i]);
            sb.append("'");
        }
        sb.append("]");
        return sb.toString();
    }

    public VAnchor getBaseline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VAnchor) ipChange.ipc$dispatch("2129eacf", new Object[]{this});
        }
        return this.mBaseline;
    }

    public VAnchor getBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VAnchor) ipChange.ipc$dispatch("f693d8b5", new Object[]{this});
        }
        return this.mBottom;
    }

    public float getCircleAngle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f867faa4", new Object[]{this})).floatValue();
        }
        return this.mCircleAngle;
    }

    public String getCircleConstraint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63df496", new Object[]{this});
        }
        return this.mCircleConstraint;
    }

    public int getCircleRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec49472", new Object[]{this})).intValue();
        }
        return this.mCircleRadius;
    }

    public String getDimensionRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8a8629e", new Object[]{this});
        }
        return this.mDimensionRatio;
    }

    public int getEditorAbsoluteX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c4cc218", new Object[]{this})).intValue();
        }
        return this.mEditorAbsoluteX;
    }

    public int getEditorAbsoluteY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5ad999", new Object[]{this})).intValue();
        }
        return this.mEditorAbsoluteY;
    }

    public HAnchor getEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HAnchor) ipChange.ipc$dispatch("a6517407", new Object[]{this});
        }
        return this.mEnd;
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.mHeight;
    }

    public Behaviour getHeightDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Behaviour) ipChange.ipc$dispatch("aab82b86", new Object[]{this});
        }
        return this.mHeightDefault;
    }

    public int getHeightMax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea565101", new Object[]{this})).intValue();
        }
        return this.mHeightMax;
    }

    public int getHeightMin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7702aef", new Object[]{this})).intValue();
        }
        return this.mHeightMin;
    }

    public float getHeightPercent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efb96ddf", new Object[]{this})).floatValue();
        }
        return this.mHeightPercent;
    }

    public float getHorizontalBias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dd190ea", new Object[]{this})).floatValue();
        }
        return this.mHorizontalBias;
    }

    public ChainMode getHorizontalChainStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChainMode) ipChange.ipc$dispatch("2572f3e5", new Object[]{this});
        }
        return this.mHorizontalChainStyle;
    }

    public float getHorizontalWeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40e12a9", new Object[]{this})).floatValue();
        }
        return this.mHorizontalWeight;
    }

    public HAnchor getLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HAnchor) ipChange.ipc$dispatch("373284df", new Object[]{this});
        }
        return this.mLeft;
    }

    public String[] getReferenceIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("36aa3239", new Object[]{this});
        }
        return this.mReferenceIds;
    }

    public HAnchor getRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HAnchor) ipChange.ipc$dispatch("af787f88", new Object[]{this});
        }
        return this.mRight;
    }

    public HAnchor getStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HAnchor) ipChange.ipc$dispatch("df1afe4e", new Object[]{this});
        }
        return this.mStart;
    }

    public VAnchor getTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VAnchor) ipChange.ipc$dispatch("100fb433", new Object[]{this});
        }
        return this.mTop;
    }

    public float getVerticalBias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc34ffbc", new Object[]{this})).floatValue();
        }
        return this.mVerticalBias;
    }

    public ChainMode getVerticalChainStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChainMode) ipChange.ipc$dispatch("af245f37", new Object[]{this});
        }
        return this.mVerticalChainStyle;
    }

    public float getVerticalWeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("675114fb", new Object[]{this})).floatValue();
        }
        return this.mVerticalWeight;
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.mWidth;
    }

    public Behaviour getWidthDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Behaviour) ipChange.ipc$dispatch("54223ab3", new Object[]{this});
        }
        return this.mWidthDefault;
    }

    public int getWidthMax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6af6e9ae", new Object[]{this})).intValue();
        }
        return this.mWidthMax;
    }

    public int getWidthMin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7810c39c", new Object[]{this})).intValue();
        }
        return this.mWidthMin;
    }

    public float getWidthPercent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87d3e80c", new Object[]{this})).floatValue();
        }
        return this.mWidthPercent;
    }

    public boolean isConstrainedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72b3b81e", new Object[]{this})).booleanValue();
        }
        return this.mConstrainedHeight;
    }

    public boolean isConstrainedWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4eb63e5", new Object[]{this})).booleanValue();
        }
        return this.mConstrainedWidth;
    }

    public void linkToBaseline(VAnchor vAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266703bc", new Object[]{this, vAnchor});
        } else {
            linkToBaseline(vAnchor, 0);
        }
    }

    public void linkToBottom(VAnchor vAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4d16d6", new Object[]{this, vAnchor});
        } else {
            linkToBottom(vAnchor, 0);
        }
    }

    public void linkToEnd(HAnchor hAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2768d7e", new Object[]{this, hAnchor});
        } else {
            linkToEnd(hAnchor, 0);
        }
    }

    public void linkToLeft(HAnchor hAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27942688", new Object[]{this, hAnchor});
        } else {
            linkToLeft(hAnchor, 0);
        }
    }

    public void linkToRight(HAnchor hAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c2ce5d", new Object[]{this, hAnchor});
        } else {
            linkToRight(hAnchor, 0);
        }
    }

    public void linkToStart(HAnchor hAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e702857", new Object[]{this, hAnchor});
        } else {
            linkToStart(hAnchor, 0);
        }
    }

    public void linkToTop(VAnchor vAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c67076", new Object[]{this, vAnchor});
        } else {
            linkToTop(vAnchor, 0);
        }
    }

    public void setCircleAngle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8945898", new Object[]{this, new Float(f)});
        } else {
            this.mCircleAngle = f;
        }
    }

    public void setCircleConstraint(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc32ca0", new Object[]{this, str});
        } else {
            this.mCircleConstraint = str;
        }
    }

    public void setCircleRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5647ad8", new Object[]{this, new Integer(i)});
        } else {
            this.mCircleRadius = i;
        }
    }

    public void setConstrainedHeight(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa1f332", new Object[]{this, new Boolean(z)});
        } else {
            this.mConstrainedHeight = z;
        }
    }

    public void setConstrainedWidth(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af44edb", new Object[]{this, new Boolean(z)});
        } else {
            this.mConstrainedWidth = z;
        }
    }

    public void setDimensionRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d301298", new Object[]{this, str});
        } else {
            this.mDimensionRatio = str;
        }
    }

    public void setEditorAbsoluteX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79f248a", new Object[]{this, new Integer(i)});
        } else {
            this.mEditorAbsoluteX = i;
        }
    }

    public void setEditorAbsoluteY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e953fd29", new Object[]{this, new Integer(i)});
        } else {
            this.mEditorAbsoluteY = i;
        }
    }

    public void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else {
            this.mHeight = i;
        }
    }

    public void setHeightDefault(Behaviour behaviour) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ad312c", new Object[]{this, behaviour});
        } else {
            this.mHeightDefault = behaviour;
        }
    }

    public void setHeightMax(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286aabc1", new Object[]{this, new Integer(i)});
        } else {
            this.mHeightMax = i;
        }
    }

    public void setHeightMin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8c0f93", new Object[]{this, new Integer(i)});
        } else {
            this.mHeightMin = i;
        }
    }

    public void setHeightPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea039bd", new Object[]{this, new Float(f)});
        } else {
            this.mHeightPercent = f;
        }
    }

    public void setHorizontalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa5b57a", new Object[]{this, new Float(f)});
        } else {
            this.mHorizontalBias = f;
        }
    }

    public void setHorizontalChainStyle(ChainMode chainMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fffc8e7", new Object[]{this, chainMode});
        } else {
            this.mHorizontalChainStyle = chainMode;
        }
    }

    public void setHorizontalWeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc75e9b", new Object[]{this, new Float(f)});
        } else {
            this.mHorizontalWeight = f;
        }
    }

    public void setReferenceIds(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b800b69", new Object[]{this, strArr});
        } else {
            this.mReferenceIds = strArr;
        }
    }

    public void setVerticalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6016de8", new Object[]{this, new Float(f)});
        } else {
            this.mVerticalBias = f;
        }
    }

    public void setVerticalChainStyle(ChainMode chainMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd454d5", new Object[]{this, chainMode});
        } else {
            this.mVerticalChainStyle = chainMode;
        }
    }

    public void setVerticalWeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d116b389", new Object[]{this, new Float(f)});
        } else {
            this.mVerticalWeight = f;
        }
    }

    public void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else {
            this.mWidth = i;
        }
    }

    public void setWidthDefault(Behaviour behaviour) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baed3a07", new Object[]{this, behaviour});
        } else {
            this.mWidthDefault = behaviour;
        }
    }

    public void setWidthMax(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86bd271c", new Object[]{this, new Integer(i)});
        } else {
            this.mWidthMax = i;
        }
    }

    public void setWidthMin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cde8aee", new Object[]{this, new Integer(i)});
        } else {
            this.mWidthMin = i;
        }
    }

    public void setWidthPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3f8f98", new Object[]{this, new Float(f)});
        } else {
            this.mWidthPercent = f;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(this.mId + ":{\n");
        this.mLeft.build(sb);
        this.mRight.build(sb);
        this.mTop.build(sb);
        this.mBottom.build(sb);
        this.mStart.build(sb);
        this.mEnd.build(sb);
        this.mBaseline.build(sb);
        if (this.mWidth != UNSET) {
            sb.append("width:");
            sb.append(this.mWidth);
            sb.append(",\n");
        }
        if (this.mHeight != UNSET) {
            sb.append("height:");
            sb.append(this.mHeight);
            sb.append(",\n");
        }
        append(sb, "horizontalBias", this.mHorizontalBias);
        append(sb, "verticalBias", this.mVerticalBias);
        if (this.mDimensionRatio != null) {
            sb.append("dimensionRatio:'");
            sb.append(this.mDimensionRatio);
            sb.append("',\n");
        }
        if (this.mCircleConstraint != null && (!Float.isNaN(this.mCircleAngle) || this.mCircleRadius != Integer.MIN_VALUE)) {
            sb.append("circular:['");
            sb.append(this.mCircleConstraint);
            sb.append("'");
            if (!Float.isNaN(this.mCircleAngle)) {
                sb.append(",");
                sb.append(this.mCircleAngle);
            }
            if (this.mCircleRadius != Integer.MIN_VALUE) {
                if (Float.isNaN(this.mCircleAngle)) {
                    sb.append(",0,");
                    sb.append(this.mCircleRadius);
                } else {
                    sb.append(",");
                    sb.append(this.mCircleRadius);
                }
            }
            sb.append("],\n");
        }
        append(sb, "verticalWeight", this.mVerticalWeight);
        append(sb, "horizontalWeight", this.mHorizontalWeight);
        if (this.mHorizontalChainStyle != null) {
            sb.append("horizontalChainStyle:'");
            sb.append(chainModeMap.get(this.mHorizontalChainStyle));
            sb.append("',\n");
        }
        if (this.mVerticalChainStyle != null) {
            sb.append("verticalChainStyle:'");
            sb.append(chainModeMap.get(this.mVerticalChainStyle));
            sb.append("',\n");
        }
        if (this.mWidthDefault != null) {
            int i = this.mWidthMax;
            int i2 = UNSET;
            if (i == i2 && this.mWidthMin == i2) {
                sb.append("width:'");
                sb.append(this.mWidthDefault.toString().toLowerCase());
                sb.append("',\n");
            } else {
                sb.append("width:{value:'");
                sb.append(this.mWidthDefault.toString().toLowerCase());
                sb.append("'");
                if (this.mWidthMax != UNSET) {
                    sb.append(",max:");
                    sb.append(this.mWidthMax);
                }
                if (this.mWidthMin != UNSET) {
                    sb.append(",min:");
                    sb.append(this.mWidthMin);
                }
                sb.append("},\n");
            }
        }
        if (this.mHeightDefault != null) {
            int i3 = this.mHeightMax;
            int i4 = UNSET;
            if (i3 == i4 && this.mHeightMin == i4) {
                sb.append("height:'");
                sb.append(this.mHeightDefault.toString().toLowerCase());
                sb.append("',\n");
            } else {
                sb.append("height:{value:'");
                sb.append(this.mHeightDefault.toString().toLowerCase());
                sb.append("'");
                if (this.mHeightMax != UNSET) {
                    sb.append(",max:");
                    sb.append(this.mHeightMax);
                }
                if (this.mHeightMin != UNSET) {
                    sb.append(",min:");
                    sb.append(this.mHeightMin);
                }
                sb.append("},\n");
            }
        }
        if (!Double.isNaN(this.mWidthPercent)) {
            sb.append("width:'");
            sb.append((int) this.mWidthPercent);
            sb.append("%',\n");
        }
        if (!Double.isNaN(this.mHeightPercent)) {
            sb.append("height:'");
            sb.append((int) this.mHeightPercent);
            sb.append("%',\n");
        }
        if (this.mReferenceIds != null) {
            sb.append("referenceIds:");
            sb.append(convertStringArrayToString(this.mReferenceIds));
            sb.append(",\n");
        }
        if (this.mConstrainedWidth) {
            sb.append("constrainedWidth:");
            sb.append(this.mConstrainedWidth);
            sb.append(",\n");
        }
        if (this.mConstrainedHeight) {
            sb.append("constrainedHeight:");
            sb.append(this.mConstrainedHeight);
            sb.append(",\n");
        }
        sb.append("},\n");
        return sb.toString();
    }

    public void linkToBaseline(VAnchor vAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a679e6c7", new Object[]{this, vAnchor, new Integer(i)});
        } else {
            linkToBaseline(vAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToBottom(VAnchor vAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5636ed", new Object[]{this, vAnchor, new Integer(i)});
        } else {
            linkToBottom(vAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToEnd(HAnchor hAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5b9545", new Object[]{this, hAnchor, new Integer(i)});
        } else {
            linkToEnd(hAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToLeft(HAnchor hAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf11d7b", new Object[]{this, hAnchor, new Integer(i)});
        } else {
            linkToLeft(hAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToRight(HAnchor hAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de977046", new Object[]{this, hAnchor, new Integer(i)});
        } else {
            linkToRight(hAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToStart(HAnchor hAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af95558c", new Object[]{this, hAnchor, new Integer(i)});
        } else {
            linkToStart(hAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToTop(VAnchor vAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808114d", new Object[]{this, vAnchor, new Integer(i)});
        } else {
            linkToTop(vAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToBaseline(VAnchor vAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c3651c", new Object[]{this, vAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        VAnchor vAnchor2 = this.mBaseline;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i;
        vAnchor2.mGoneMargin = i2;
    }

    public void linkToBottom(VAnchor vAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7119b6", new Object[]{this, vAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        VAnchor vAnchor2 = this.mBottom;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i;
        vAnchor2.mGoneMargin = i2;
    }

    public void linkToEnd(HAnchor hAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f17865e", new Object[]{this, hAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        HAnchor hAnchor2 = this.mEnd;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
    }

    public void linkToLeft(HAnchor hAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933304e8", new Object[]{this, hAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        HAnchor hAnchor2 = this.mLeft;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
    }

    public void linkToRight(HAnchor hAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4570b7d", new Object[]{this, hAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        HAnchor hAnchor2 = this.mRight;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
    }

    public void linkToStart(HAnchor hAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4315cef7", new Object[]{this, hAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        HAnchor hAnchor2 = this.mStart;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
    }

    public void linkToTop(VAnchor vAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fa8b56", new Object[]{this, vAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        VAnchor vAnchor2 = this.mTop;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i;
        vAnchor2.mGoneMargin = i2;
    }
}
