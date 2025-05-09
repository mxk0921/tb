package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ChainHead {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mDefined;
    public ConstraintWidget mFirst;
    public ConstraintWidget mFirstMatchConstraintWidget;
    public ConstraintWidget mFirstVisibleWidget;
    public boolean mHasComplexMatchWeights;
    public boolean mHasDefinedWeights;
    public boolean mHasUndefinedWeights;
    public ConstraintWidget mHead;
    private boolean mIsRtl;
    public ConstraintWidget mLast;
    public ConstraintWidget mLastMatchConstraintWidget;
    public ConstraintWidget mLastVisibleWidget;
    private int mOrientation;
    public float mTotalWeight = 0.0f;
    public ArrayList<ConstraintWidget> mWeightedMatchConstraintsWidgets;
    public int mWidgetsCount;
    public int mWidgetsMatchCount;

    public ChainHead(ConstraintWidget constraintWidget, int i, boolean z) {
        this.mFirst = constraintWidget;
        this.mOrientation = i;
        this.mIsRtl = z;
    }

    private void defineChainProperties() {
        int i;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d6963a0", new Object[]{this});
            return;
        }
        int i2 = this.mOrientation * 2;
        ConstraintWidget constraintWidget = this.mFirst;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z2 = false;
        while (!z2) {
            this.mWidgetsCount++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.mNextChainWidget;
            int i3 = this.mOrientation;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i3] = null;
            constraintWidget.mListNextMatchConstraintsWidget[i3] = null;
            if (constraintWidget.getVisibility() != 8) {
                if (this.mFirstVisibleWidget == null) {
                    this.mFirstVisibleWidget = constraintWidget;
                }
                this.mLastVisibleWidget = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
                int i4 = this.mOrientation;
                if (dimensionBehaviourArr[i4] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && ((i = constraintWidget.mResolvedMatchConstraintDefault[i4]) == 0 || i == 3 || i == 2)) {
                    this.mWidgetsMatchCount++;
                    float f = constraintWidget.mWeight[i4];
                    if (f > 0.0f) {
                        this.mTotalWeight += f;
                    }
                    if (isMatchConstraintEqualityCandidate(constraintWidget, i4)) {
                        if (f < 0.0f) {
                            this.mHasUndefinedWeights = true;
                        } else {
                            this.mHasDefinedWeights = true;
                        }
                        if (this.mWeightedMatchConstraintsWidgets == null) {
                            this.mWeightedMatchConstraintsWidgets = new ArrayList<>();
                        }
                        this.mWeightedMatchConstraintsWidgets.add(constraintWidget);
                    }
                    if (this.mFirstMatchConstraintWidget == null) {
                        this.mFirstMatchConstraintWidget = constraintWidget;
                    }
                    ConstraintWidget constraintWidget4 = this.mLastMatchConstraintWidget;
                    if (constraintWidget4 != null) {
                        constraintWidget4.mListNextMatchConstraintsWidget[this.mOrientation] = constraintWidget;
                    }
                    this.mLastMatchConstraintWidget = constraintWidget;
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.mNextChainWidget[this.mOrientation] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.mOwner;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.mListAnchors[i2].mTarget;
                if (constraintAnchor2 != null && constraintAnchor2.mOwner == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z2 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        this.mLast = constraintWidget;
        if (this.mOrientation != 0 || !this.mIsRtl) {
            this.mHead = this.mFirst;
        } else {
            this.mHead = constraintWidget;
        }
        if (this.mHasDefinedWeights && this.mHasUndefinedWeights) {
            z = true;
        }
        this.mHasComplexMatchWeights = z;
    }

    public void define() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33008c2", new Object[]{this});
            return;
        }
        if (!this.mDefined) {
            defineChainProperties();
        }
        this.mDefined = true;
    }

    public ConstraintWidget getFirst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("89f44e37", new Object[]{this});
        }
        return this.mFirst;
    }

    public ConstraintWidget getFirstMatchConstraintWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("4d170f49", new Object[]{this});
        }
        return this.mFirstMatchConstraintWidget;
    }

    public ConstraintWidget getFirstVisibleWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("44697439", new Object[]{this});
        }
        return this.mFirstVisibleWidget;
    }

    public ConstraintWidget getHead() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("1dfed293", new Object[]{this});
        }
        return this.mHead;
    }

    public ConstraintWidget getLast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("ab899cc9", new Object[]{this});
        }
        return this.mLast;
    }

    public ConstraintWidget getLastMatchConstraintWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("e1c2eff7", new Object[]{this});
        }
        return this.mLastMatchConstraintWidget;
    }

    public ConstraintWidget getLastVisibleWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("80dfe2e7", new Object[]{this});
        }
        return this.mLastVisibleWidget;
    }

    public float getTotalWeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79050f1d", new Object[]{this})).floatValue();
        }
        return this.mTotalWeight;
    }

    private static boolean isMatchConstraintEqualityCandidate(ConstraintWidget constraintWidget, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e52ccbd9", new Object[]{constraintWidget, new Integer(i)})).booleanValue();
        }
        return constraintWidget.getVisibility() != 8 && constraintWidget.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && ((i2 = constraintWidget.mResolvedMatchConstraintDefault[i]) == 0 || i2 == 3);
    }
}
