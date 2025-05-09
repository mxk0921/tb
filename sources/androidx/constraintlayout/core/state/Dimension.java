package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Dimension {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object mInitialValue;
    public boolean mIsSuggested;
    public int mMax;
    public int mMin;
    public float mPercent;
    public String mRatioString;
    public int mValue;
    private final int mWrapContent;
    public static final Object FIXED_DIMENSION = new String("FIXED_DIMENSION");
    public static final Object WRAP_DIMENSION = new String("WRAP_DIMENSION");
    public static final Object SPREAD_DIMENSION = new String("SPREAD_DIMENSION");
    public static final Object PARENT_DIMENSION = new String("PARENT_DIMENSION");
    public static final Object PERCENT_DIMENSION = new String("PERCENT_DIMENSION");
    public static final Object RATIO_DIMENSION = new String("RATIO_DIMENSION");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Type extends Enum<Type> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Type FIXED = new Type("FIXED", 0);
        public static final Type WRAP = new Type("WRAP", 1);
        public static final Type MATCH_PARENT = new Type("MATCH_PARENT", 2);
        public static final Type MATCH_CONSTRAINT = new Type("MATCH_CONSTRAINT", 3);
        private static final /* synthetic */ Type[] $VALUES = $values();

        private Type(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/Dimension$Type");
        }

        public static Type valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type) ipChange.ipc$dispatch("4efd8426", new Object[]{str});
            }
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type[]) ipChange.ipc$dispatch("ba3c055", new Object[0]);
            }
            return (Type[]) $VALUES.clone();
        }

        private static /* synthetic */ Type[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Type[]) ipChange.ipc$dispatch("d1484bb1", new Object[0]) : new Type[]{FIXED, WRAP, MATCH_PARENT, MATCH_CONSTRAINT};
        }
    }

    private Dimension() {
        this.mWrapContent = -2;
        this.mMin = 0;
        this.mMax = Integer.MAX_VALUE;
        this.mPercent = 1.0f;
        this.mValue = 0;
        this.mRatioString = null;
        this.mInitialValue = WRAP_DIMENSION;
        this.mIsSuggested = false;
    }

    public static Dimension createFixed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("40cd2ec7", new Object[]{new Integer(i)});
        }
        Dimension dimension = new Dimension(FIXED_DIMENSION);
        dimension.fixed(i);
        return dimension;
    }

    public static Dimension createParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("32d25fde", new Object[0]);
        }
        return new Dimension(PARENT_DIMENSION);
    }

    public static Dimension createPercent(Object obj, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("fb275597", new Object[]{obj, new Float(f)});
        }
        Dimension dimension = new Dimension(PERCENT_DIMENSION);
        dimension.percent(obj, f);
        return dimension;
    }

    public static Dimension createRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("33d0280b", new Object[]{str});
        }
        Dimension dimension = new Dimension(RATIO_DIMENSION);
        dimension.ratio(str);
        return dimension;
    }

    public static Dimension createSpread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("ac38ac75", new Object[0]);
        }
        return new Dimension(SPREAD_DIMENSION);
    }

    public static Dimension createSuggested(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("4ad3f6f6", new Object[]{new Integer(i)});
        }
        Dimension dimension = new Dimension();
        dimension.suggested(i);
        return dimension;
    }

    public static Dimension createWrap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("234bfd3e", new Object[0]);
        }
        return new Dimension(WRAP_DIMENSION);
    }

    public void apply(State state, ConstraintWidget constraintWidget, int i) {
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a211ce10", new Object[]{this, state, constraintWidget, new Integer(i)});
            return;
        }
        String str = this.mRatioString;
        if (str != null) {
            constraintWidget.setDimensionRatio(str);
        }
        if (i == 0) {
            if (this.mIsSuggested) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.mInitialValue;
                if (obj == WRAP_DIMENSION) {
                    i2 = 1;
                } else if (obj != PERCENT_DIMENSION) {
                    i2 = 0;
                }
                constraintWidget.setHorizontalMatchStyle(i2, this.mMin, this.mMax, this.mPercent);
                return;
            }
            int i3 = this.mMin;
            if (i3 > 0) {
                constraintWidget.setMinWidth(i3);
            }
            int i4 = this.mMax;
            if (i4 < Integer.MAX_VALUE) {
                constraintWidget.setMaxWidth(i4);
            }
            Object obj2 = this.mInitialValue;
            if (obj2 == WRAP_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            } else if (obj2 == PARENT_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            } else if (obj2 == null) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.setWidth(this.mValue);
            }
        } else if (this.mIsSuggested) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.mInitialValue;
            if (obj3 == WRAP_DIMENSION) {
                i2 = 1;
            } else if (obj3 != PERCENT_DIMENSION) {
                i2 = 0;
            }
            constraintWidget.setVerticalMatchStyle(i2, this.mMin, this.mMax, this.mPercent);
        } else {
            int i5 = this.mMin;
            if (i5 > 0) {
                constraintWidget.setMinHeight(i5);
            }
            int i6 = this.mMax;
            if (i6 < Integer.MAX_VALUE) {
                constraintWidget.setMaxHeight(i6);
            }
            Object obj4 = this.mInitialValue;
            if (obj4 == WRAP_DIMENSION) {
                constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            } else if (obj4 == PARENT_DIMENSION) {
                constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            } else if (obj4 == null) {
                constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.setHeight(this.mValue);
            }
        }
    }

    public boolean equalsFixedValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30b31164", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mInitialValue == null && this.mValue == i) {
            return true;
        }
        return false;
    }

    public Dimension fixed(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("83bedbd4", new Object[]{this, obj});
        }
        this.mInitialValue = obj;
        if (obj instanceof Integer) {
            this.mValue = ((Integer) obj).intValue();
            this.mInitialValue = null;
        }
        return this;
    }

    public int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.mValue;
    }

    public Dimension max(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("1c81d253", new Object[]{this, new Integer(i)});
        }
        if (this.mMax >= 0) {
            this.mMax = i;
        }
        return this;
    }

    public Dimension min(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("6912d841", new Object[]{this, new Integer(i)});
        }
        if (i >= 0) {
            this.mMin = i;
        }
        return this;
    }

    public Dimension percent(Object obj, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("bfec6d33", new Object[]{this, obj, new Float(f)});
        }
        this.mPercent = f;
        return this;
    }

    public Dimension ratio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("fa9f95ef", new Object[]{this, str});
        }
        this.mRatioString = str;
        return this;
    }

    public void setValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935a328d", new Object[]{this, new Integer(i)});
            return;
        }
        this.mIsSuggested = false;
        this.mInitialValue = null;
        this.mValue = i;
    }

    public Dimension suggested(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("eb93c692", new Object[]{this, new Integer(i)});
        }
        this.mIsSuggested = true;
        if (i >= 0) {
            this.mMax = i;
        }
        return this;
    }

    public Dimension min(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("8316a7b6", new Object[]{this, obj});
        }
        if (obj == WRAP_DIMENSION) {
            this.mMin = -2;
        }
        return this;
    }

    public static Dimension createFixed(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("bcef6df0", new Object[]{obj});
        }
        Dimension dimension = new Dimension(FIXED_DIMENSION);
        dimension.fixed(obj);
        return dimension;
    }

    public static Dimension createSuggested(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("4f1a29a1", new Object[]{obj});
        }
        Dimension dimension = new Dimension();
        dimension.suggested(obj);
        return dimension;
    }

    public Dimension max(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("a27cd3e4", new Object[]{this, obj});
        }
        Object obj2 = WRAP_DIMENSION;
        if (obj == obj2 && this.mIsSuggested) {
            this.mInitialValue = obj2;
            this.mMax = Integer.MAX_VALUE;
        }
        return this;
    }

    public Dimension suggested(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("22f80585", new Object[]{this, obj});
        }
        this.mInitialValue = obj;
        this.mIsSuggested = true;
        return this;
    }

    public Dimension fixed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("bb3d2c63", new Object[]{this, new Integer(i)});
        }
        this.mInitialValue = null;
        this.mValue = i;
        return this;
    }

    private Dimension(Object obj) {
        this.mWrapContent = -2;
        this.mMin = 0;
        this.mMax = Integer.MAX_VALUE;
        this.mPercent = 1.0f;
        this.mValue = 0;
        this.mRatioString = null;
        this.mIsSuggested = false;
        this.mInitialValue = obj;
    }
}
