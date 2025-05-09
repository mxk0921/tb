package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.constraintlayout.core.widgets.HelperWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GridReference extends HelperReference {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SPANS_RESPECT_WIDGET_ORDER_STRING = "spansrespectwidgetorder";
    private static final String SUB_GRID_BY_COL_ROW_STRING = "subgridbycolrow";
    private String mColumnWeights;
    private int mColumnsSet;
    private int mFlags;
    private GridCore mGrid;
    private float mHorizontalGaps;
    private int mOrientation;
    private String mRowWeights;
    private int mRowsSet;
    private String mSkips;
    private String mSpans;
    private float mVerticalGaps;
    private int mPaddingStart = 0;
    private int mPaddingEnd = 0;
    private int mPaddingTop = 0;
    private int mPaddingBottom = 0;

    public GridReference(State state, State.Helper helper) {
        super(state, helper);
        if (helper == State.Helper.ROW) {
            this.mRowsSet = 1;
        } else if (helper == State.Helper.COLUMN) {
            this.mColumnsSet = 1;
        }
    }

    public static /* synthetic */ Object ipc$super(GridReference gridReference, String str, Object... objArr) {
        if (str.hashCode() == -584647781) {
            return super.getType();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/helpers/GridReference");
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            return;
        }
        getHelperWidget();
        this.mGrid.setOrientation(this.mOrientation);
        int i = this.mRowsSet;
        if (i != 0) {
            this.mGrid.setRows(i);
        }
        int i2 = this.mColumnsSet;
        if (i2 != 0) {
            this.mGrid.setColumns(i2);
        }
        float f = this.mHorizontalGaps;
        if (f != 0.0f) {
            this.mGrid.setHorizontalGaps(f);
        }
        float f2 = this.mVerticalGaps;
        if (f2 != 0.0f) {
            this.mGrid.setVerticalGaps(f2);
        }
        String str = this.mRowWeights;
        if (str != null && !str.isEmpty()) {
            this.mGrid.setRowWeights(this.mRowWeights);
        }
        String str2 = this.mColumnWeights;
        if (str2 != null && !str2.isEmpty()) {
            this.mGrid.setColumnWeights(this.mColumnWeights);
        }
        String str3 = this.mSpans;
        if (str3 != null && !str3.isEmpty()) {
            this.mGrid.setSpans(this.mSpans);
        }
        String str4 = this.mSkips;
        if (str4 != null && !str4.isEmpty()) {
            this.mGrid.setSkips(this.mSkips);
        }
        this.mGrid.setFlags(this.mFlags);
        this.mGrid.setPaddingStart(this.mPaddingStart);
        this.mGrid.setPaddingEnd(this.mPaddingEnd);
        this.mGrid.setPaddingTop(this.mPaddingTop);
        this.mGrid.setPaddingBottom(this.mPaddingBottom);
        applyBase();
    }

    public String getColumnWeights() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86317d4a", new Object[]{this});
        }
        return this.mColumnWeights;
    }

    public int getColumnsSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39eeea35", new Object[]{this})).intValue();
        }
        return this.mColumnsSet;
    }

    public int getFlags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a71a48cb", new Object[]{this})).intValue();
        }
        return this.mFlags;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HelperWidget) ipChange.ipc$dispatch("cb8761a0", new Object[]{this});
        }
        if (this.mGrid == null) {
            this.mGrid = new GridCore();
        }
        return this.mGrid;
    }

    public float getHorizontalGaps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c79e488e", new Object[]{this})).floatValue();
        }
        return this.mHorizontalGaps;
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        return this.mOrientation;
    }

    public int getPaddingBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        return this.mPaddingBottom;
    }

    public int getPaddingEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79cb7a", new Object[]{this})).intValue();
        }
        return this.mPaddingEnd;
    }

    public int getPaddingStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2dc19641", new Object[]{this})).intValue();
        }
        return this.mPaddingStart;
    }

    public int getPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return this.mPaddingTop;
    }

    public String getRowWeights() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af647da2", new Object[]{this});
        }
        return this.mRowWeights;
    }

    public int getRowsSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82f3868d", new Object[]{this})).intValue();
        }
        return this.mRowsSet;
    }

    public String getSkips() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bb33c9b", new Object[]{this});
        }
        return this.mSkips;
    }

    public String getSpans() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c351426", new Object[]{this});
        }
        return this.mSpans;
    }

    public float getVerticalGaps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3601b760", new Object[]{this})).floatValue();
        }
        return this.mVerticalGaps;
    }

    public void setColumnWeights(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749e0dd4", new Object[]{this, str});
        } else {
            this.mColumnWeights = str;
        }
    }

    public void setColumnsSet(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac56a75", new Object[]{this, new Integer(i)});
        } else if (super.getType() != State.Helper.ROW) {
            this.mColumnsSet = i;
        }
    }

    public void setFlags(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a539337", new Object[]{this, new Integer(i)});
        } else {
            this.mFlags = i;
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public void setHelperWidget(HelperWidget helperWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e016be6", new Object[]{this, helperWidget});
        } else if (helperWidget instanceof GridCore) {
            this.mGrid = (GridCore) helperWidget;
        } else {
            this.mGrid = null;
        }
    }

    public void setHorizontalGaps(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6ff256", new Object[]{this, new Float(f)});
        } else {
            this.mHorizontalGaps = f;
        }
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            this.mOrientation = i;
        }
    }

    public void setPaddingBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e5342", new Object[]{this, new Integer(i)});
        } else {
            this.mPaddingBottom = i;
        }
    }

    public void setPaddingEnd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4596b1d0", new Object[]{this, new Integer(i)});
        } else {
            this.mPaddingEnd = i;
        }
    }

    public void setPaddingStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6607b2e9", new Object[]{this, new Integer(i)});
        } else {
            this.mPaddingStart = i;
        }
    }

    public void setPaddingTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a528b596", new Object[]{this, new Integer(i)});
        } else {
            this.mPaddingTop = i;
        }
    }

    public void setRowWeights(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b414be14", new Object[]{this, str});
        } else {
            this.mRowWeights = str;
        }
    }

    public void setRowsSet(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11c6bab5", new Object[]{this, new Integer(i)});
        } else if (super.getType() != State.Helper.COLUMN) {
            this.mRowsSet = i;
        }
    }

    public void setSkips(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78ceca3", new Object[]{this, str});
        } else {
            this.mSkips = str;
        }
    }

    public void setSpans(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7460678", new Object[]{this, str});
        } else {
            this.mSpans = str;
        }
    }

    public void setVerticalGaps(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbaac4", new Object[]{this, new Float(f)});
        } else {
            this.mVerticalGaps = f;
        }
    }

    public void setFlags(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b7f816", new Object[]{this, str});
        } else if (!str.isEmpty()) {
            String[] split = str.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            this.mFlags = 0;
            for (String str2 : split) {
                String lowerCase = str2.toLowerCase();
                lowerCase.hashCode();
                if (lowerCase.equals(SUB_GRID_BY_COL_ROW_STRING)) {
                    this.mFlags |= 1;
                } else if (lowerCase.equals(SPANS_RESPECT_WIDGET_ORDER_STRING)) {
                    this.mFlags |= 2;
                }
            }
        }
    }
}
