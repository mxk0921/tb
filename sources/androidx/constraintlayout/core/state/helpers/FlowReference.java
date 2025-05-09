package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.HelperWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FlowReference extends HelperReference {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Flow mFlow;
    public HashMap<String, Float> mMapPostMargin;
    public HashMap<String, Float> mMapPreMargin;
    public HashMap<String, Float> mMapWeights;
    public int mOrientation;
    public int mWrapMode = 0;
    public int mVerticalStyle = -1;
    public int mFirstVerticalStyle = -1;
    public int mLastVerticalStyle = -1;
    public int mHorizontalStyle = -1;
    public int mFirstHorizontalStyle = -1;
    public int mLastHorizontalStyle = -1;
    public int mVerticalAlign = 2;
    public int mHorizontalAlign = 2;
    public int mVerticalGap = 0;
    public int mHorizontalGap = 0;
    public int mPaddingLeft = 0;
    public int mPaddingRight = 0;
    public int mPaddingTop = 0;
    public int mPaddingBottom = 0;
    public int mMaxElementsWrap = -1;
    public float mFirstVerticalBias = 0.5f;
    public float mLastVerticalBias = 0.5f;
    public float mFirstHorizontalBias = 0.5f;
    public float mLastHorizontalBias = 0.5f;

    public FlowReference(State state, State.Helper helper) {
        super(state, helper);
        this.mOrientation = 0;
        if (helper == State.Helper.VERTICAL_FLOW) {
            this.mOrientation = 1;
        }
    }

    public static /* synthetic */ Object ipc$super(FlowReference flowReference, String str, Object... objArr) {
        if (str.hashCode() == -1657664405) {
            return super.add((Object[]) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/helpers/FlowReference");
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            return;
        }
        getHelperWidget();
        setConstraintWidget(this.mFlow);
        this.mFlow.setOrientation(this.mOrientation);
        this.mFlow.setWrapMode(this.mWrapMode);
        int i = this.mMaxElementsWrap;
        if (i != -1) {
            this.mFlow.setMaxElementsWrap(i);
        }
        int i2 = this.mPaddingLeft;
        if (i2 != 0) {
            this.mFlow.setPaddingLeft(i2);
        }
        int i3 = this.mPaddingTop;
        if (i3 != 0) {
            this.mFlow.setPaddingTop(i3);
        }
        int i4 = this.mPaddingRight;
        if (i4 != 0) {
            this.mFlow.setPaddingRight(i4);
        }
        int i5 = this.mPaddingBottom;
        if (i5 != 0) {
            this.mFlow.setPaddingBottom(i5);
        }
        int i6 = this.mHorizontalGap;
        if (i6 != 0) {
            this.mFlow.setHorizontalGap(i6);
        }
        int i7 = this.mVerticalGap;
        if (i7 != 0) {
            this.mFlow.setVerticalGap(i7);
        }
        float f = this.mHorizontalBias;
        if (f != 0.5f) {
            this.mFlow.setHorizontalBias(f);
        }
        float f2 = this.mFirstHorizontalBias;
        if (f2 != 0.5f) {
            this.mFlow.setFirstHorizontalBias(f2);
        }
        float f3 = this.mLastHorizontalBias;
        if (f3 != 0.5f) {
            this.mFlow.setLastHorizontalBias(f3);
        }
        float f4 = this.mVerticalBias;
        if (f4 != 0.5f) {
            this.mFlow.setVerticalBias(f4);
        }
        float f5 = this.mFirstVerticalBias;
        if (f5 != 0.5f) {
            this.mFlow.setFirstVerticalBias(f5);
        }
        float f6 = this.mLastVerticalBias;
        if (f6 != 0.5f) {
            this.mFlow.setLastVerticalBias(f6);
        }
        int i8 = this.mHorizontalAlign;
        if (i8 != 2) {
            this.mFlow.setHorizontalAlign(i8);
        }
        int i9 = this.mVerticalAlign;
        if (i9 != 2) {
            this.mFlow.setVerticalAlign(i9);
        }
        int i10 = this.mVerticalStyle;
        if (i10 != -1) {
            this.mFlow.setVerticalStyle(i10);
        }
        int i11 = this.mFirstVerticalStyle;
        if (i11 != -1) {
            this.mFlow.setFirstVerticalStyle(i11);
        }
        int i12 = this.mLastVerticalStyle;
        if (i12 != -1) {
            this.mFlow.setLastVerticalStyle(i12);
        }
        int i13 = this.mHorizontalStyle;
        if (i13 != -1) {
            this.mFlow.setHorizontalStyle(i13);
        }
        int i14 = this.mFirstHorizontalStyle;
        if (i14 != -1) {
            this.mFlow.setFirstHorizontalStyle(i14);
        }
        int i15 = this.mLastHorizontalStyle;
        if (i15 != -1) {
            this.mFlow.setLastHorizontalStyle(i15);
        }
        applyBase();
    }

    public float getFirstHorizontalBias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdad98e", new Object[]{this})).floatValue();
        }
        return this.mFirstHorizontalBias;
    }

    public int getFirstHorizontalStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2766068d", new Object[]{this})).intValue();
        }
        return this.mFirstHorizontalStyle;
    }

    public float getFirstVerticalBias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64802160", new Object[]{this})).floatValue();
        }
        return this.mFirstVerticalBias;
    }

    public int getFirstVerticalStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6769b8fb", new Object[]{this})).intValue();
        }
        return this.mFirstVerticalStyle;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget getHelperWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HelperWidget) ipChange.ipc$dispatch("cb8761a0", new Object[]{this});
        }
        if (this.mFlow == null) {
            this.mFlow = new Flow();
        }
        return this.mFlow;
    }

    public int getHorizontalAlign() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5ffea05", new Object[]{this})).intValue();
        }
        return this.mHorizontalAlign;
    }

    public float getHorizontalBias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dd190ea", new Object[]{this})).floatValue();
        }
        return this.mHorizontalBias;
    }

    public int getHorizontalGap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92b41ad6", new Object[]{this})).intValue();
        }
        return this.mHorizontalGap;
    }

    public int getHorizontalStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8463ab1", new Object[]{this})).intValue();
        }
        return this.mHorizontalStyle;
    }

    public float getLastHorizontalBias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d74ebb20", new Object[]{this})).floatValue();
        }
        return this.mLastHorizontalBias;
    }

    public int getLastHorizontalStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e6e573b", new Object[]{this})).intValue();
        }
        return this.mLastHorizontalStyle;
    }

    public float getLastVerticalBias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10433f72", new Object[]{this})).floatValue();
        }
        return this.mLastVerticalBias;
    }

    public int getLastVerticalStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("340a5d29", new Object[]{this})).intValue();
        }
        return this.mLastVerticalStyle;
    }

    public int getMaxElementsWrap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b00dc29", new Object[]{this})).intValue();
        }
        return this.mMaxElementsWrap;
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

    public int getPaddingLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        return this.mPaddingLeft;
    }

    public int getPaddingRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        return this.mPaddingRight;
    }

    public int getPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return this.mPaddingTop;
    }

    public float getPostMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67e161e5", new Object[]{this, str})).floatValue();
        }
        HashMap<String, Float> hashMap = this.mMapPreMargin;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPreMargin.get(str).floatValue();
    }

    public float getPreMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53856bbc", new Object[]{this, str})).floatValue();
        }
        HashMap<String, Float> hashMap = this.mMapPostMargin;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPostMargin.get(str).floatValue();
    }

    public int getVerticalAlign() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40a5573", new Object[]{this})).intValue();
        }
        return this.mVerticalAlign;
    }

    public float getVerticalBias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc34ffbc", new Object[]{this})).floatValue();
        }
        return this.mVerticalBias;
    }

    public int getVerticalGap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19e89c4", new Object[]{this})).intValue();
        }
        return this.mVerticalGap;
    }

    public int getVerticalStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("650a61f", new Object[]{this})).intValue();
        }
        return this.mVerticalStyle;
    }

    public float getWeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a189b96f", new Object[]{this, str})).floatValue();
        }
        HashMap<String, Float> hashMap = this.mMapWeights;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.mMapWeights.get(str).floatValue();
        }
        return -1.0f;
    }

    public int getWrapMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8efa117d", new Object[]{this})).intValue();
        }
        return this.mWrapMode;
    }

    public void setFirstHorizontalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4d8aee", new Object[]{this, new Float(f)});
        } else {
            this.mFirstHorizontalBias = f;
        }
    }

    public void setFirstHorizontalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27981d", new Object[]{this, new Integer(i)});
        } else {
            this.mFirstHorizontalStyle = i;
        }
    }

    public void setFirstVerticalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc8105c", new Object[]{this, new Float(f)});
        } else {
            this.mFirstVerticalBias = f;
        }
    }

    public void setFirstVerticalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdc06f", new Object[]{this, new Integer(i)});
        } else {
            this.mFirstVerticalStyle = i;
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public void setHelperWidget(HelperWidget helperWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e016be6", new Object[]{this, helperWidget});
        } else if (helperWidget instanceof Flow) {
            this.mFlow = (Flow) helperWidget;
        } else {
            this.mFlow = null;
        }
    }

    public void setHorizontalAlign(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9450fa3d", new Object[]{this, new Integer(i)});
        } else {
            this.mHorizontalAlign = i;
        }
    }

    public void setHorizontalGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5afb368c", new Object[]{this, new Integer(i)});
        } else {
            this.mHorizontalGap = i;
        }
    }

    public void setHorizontalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad4bf11", new Object[]{this, new Integer(i)});
        } else {
            this.mHorizontalStyle = i;
        }
    }

    public void setLastHorizontalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b8f804", new Object[]{this, new Float(f)});
        } else {
            this.mLastHorizontalBias = f;
        }
    }

    public void setLastHorizontalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f29cdc7", new Object[]{this, new Integer(i)});
        } else {
            this.mLastHorizontalStyle = i;
        }
    }

    public void setLastVerticalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c837caf2", new Object[]{this, new Float(f)});
        } else {
            this.mLastVerticalBias = f;
        }
    }

    public void setLastVerticalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f855899", new Object[]{this, new Integer(i)});
        } else {
            this.mLastVerticalStyle = i;
        }
    }

    public void setMaxElementsWrap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6e4c99", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxElementsWrap = i;
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

    public void setPaddingLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b9af26", new Object[]{this, new Integer(i)});
        } else {
            this.mPaddingLeft = i;
        }
    }

    public void setPaddingRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7116396f", new Object[]{this, new Integer(i)});
        } else {
            this.mPaddingRight = i;
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

    public void setVerticalAlign(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146c4f8f", new Object[]{this, new Integer(i)});
        } else {
            this.mVerticalAlign = i;
        }
    }

    public void setVerticalGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62fb85e", new Object[]{this, new Integer(i)});
        } else {
            this.mVerticalGap = i;
        }
    }

    public void setVerticalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af01463", new Object[]{this, new Integer(i)});
        } else {
            this.mVerticalStyle = i;
        }
    }

    public void setWrapMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31ef92d", new Object[]{this, new Integer(i)});
        } else {
            this.mWrapMode = i;
        }
    }

    public void addFlowElement(String str, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79191a2", new Object[]{this, str, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        super.add(str);
        if (!Float.isNaN(f)) {
            if (this.mMapWeights == null) {
                this.mMapWeights = new HashMap<>();
            }
            this.mMapWeights.put(str, Float.valueOf(f));
        }
        if (!Float.isNaN(f2)) {
            if (this.mMapPreMargin == null) {
                this.mMapPreMargin = new HashMap<>();
            }
            this.mMapPreMargin.put(str, Float.valueOf(f2));
        }
        if (!Float.isNaN(f3)) {
            if (this.mMapPostMargin == null) {
                this.mMapPostMargin = new HashMap<>();
            }
            this.mMapPostMargin.put(str, Float.valueOf(f3));
        }
    }
}
