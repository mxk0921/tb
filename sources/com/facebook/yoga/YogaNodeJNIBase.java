package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class YogaNodeJNIBase extends YogaNode implements Cloneable {
    private YogaBaselineFunction mBaselineFunction;
    private List<YogaNodeJNIBase> mChildren;
    private Object mData;
    private YogaMeasureFunction mMeasureFunction;
    private long mNativePointer;
    private YogaNodeJNIBase mOwner;

    static {
        t2o.a(503316511);
    }

    public YogaNodeJNIBase() {
        long jni_YGNodeNew = YogaNative.jni_YGNodeNew(YogaConfig.useBatchingForLayoutOutputs);
        this.mNativePointer = jni_YGNodeNew;
        if (jni_YGNodeNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    private void clearChildren() {
        this.mChildren = null;
        YogaNative.jni_YGNodeClearChildren(this.mNativePointer);
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list != null) {
            list.remove(i);
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            return yogaNodeJNIBase.mNativePointer;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    private static YogaValue valueFromLong(long j) {
        return new YogaValue(Float.intBitsToFloat((int) j), (int) (j >> 32));
    }

    @Override // com.facebook.yoga.YogaNode
    public void addChildAt(YogaNode yogaNode, int i) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) yogaNode;
        if (yogaNodeJNIBase.mOwner == null) {
            if (this.mChildren == null) {
                this.mChildren = new ArrayList(4);
            }
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            YogaNative.jni_YGNodeInsertChild(this.mNativePointer, yogaNodeJNIBase.mNativePointer, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    public final float baseline(float f, float f2) {
        return this.mBaselineFunction.baseline(this, f, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void calculateLayout(float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) arrayList.get(i)).mChildren;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].mNativePointer;
        }
        YogaNative.jni_YGNodeCalculateLayout(this.mNativePointer, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.YogaNode
    public void copyStyle(YogaNode yogaNode) {
        YogaNative.jni_YGNodeCopyStyle(this.mNativePointer, ((YogaNodeJNIBase) yogaNode).mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void dirty() {
        YogaNative.jni_YGNodeMarkDirty(this.mNativePointer);
    }

    public void dirtyAllDescendants() {
        YogaNative.jni_YGNodeMarkDirtyAndPropogateToDescendants(this.mNativePointer);
    }

    public void finalize() throws Throwable {
        try {
            freeNatives();
        } finally {
            super.finalize();
        }
    }

    public void freeNatives() {
        long j = this.mNativePointer;
        if (j > 0) {
            this.mNativePointer = 0L;
            YogaNative.jni_YGNodeFree(j);
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaAlign getAlignContent() {
        return YogaAlign.fromInt(YogaNative.jni_YGNodeStyleGetAlignContent(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaAlign getAlignItems() {
        return YogaAlign.fromInt(YogaNative.jni_YGNodeStyleGetAlignItems(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaAlign getAlignSelf() {
        return YogaAlign.fromInt(YogaNative.jni_YGNodeStyleGetAlignSelf(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public float getAspectRatio() {
        return YogaNative.jni_YGNodeStyleGetAspectRatio(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getBorder(YogaEdge yogaEdge) {
        return YogaNative.jni_YGNodeStyleGetBorder(this.mNativePointer, yogaEdge.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public int getChildCount() {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.facebook.yoga.YogaNode
    public Object getData() {
        return this.mData;
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaDisplay getDisplay() {
        return YogaDisplay.fromInt(YogaNative.jni_YGNodeStyleGetDisplay(this.mNativePointer));
    }

    public abstract boolean getDoesLegacyStretchFlagAffectsLayout();

    @Override // com.facebook.yoga.YogaNode
    public float getFlex() {
        return YogaNative.jni_YGNodeStyleGetFlex(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getFlexBasis() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetFlexBasis(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaFlexDirection getFlexDirection() {
        return YogaFlexDirection.fromInt(YogaNative.jni_YGNodeStyleGetFlexDirection(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public float getFlexGrow() {
        return YogaNative.jni_YGNodeStyleGetFlexGrow(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getFlexShrink() {
        return YogaNative.jni_YGNodeStyleGetFlexShrink(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getHeight() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetHeight(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaJustify getJustifyContent() {
        return YogaJustify.fromInt(YogaNative.jni_YGNodeStyleGetJustifyContent(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getMargin(YogaEdge yogaEdge) {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMargin(this.mNativePointer, yogaEdge.intValue()));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getMaxHeight() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMaxHeight(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getMaxWidth() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMaxWidth(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getMinHeight() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMinHeight(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getMinWidth() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMinWidth(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaOverflow getOverflow() {
        return YogaOverflow.fromInt(YogaNative.jni_YGNodeStyleGetOverflow(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getPadding(YogaEdge yogaEdge) {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetPadding(this.mNativePointer, yogaEdge.intValue()));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getPosition(YogaEdge yogaEdge) {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetPosition(this.mNativePointer, yogaEdge.intValue()));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaPositionType getPositionType() {
        return YogaPositionType.fromInt(YogaNative.jni_YGNodeStyleGetPositionType(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaDirection getStyleDirection() {
        return YogaDirection.fromInt(YogaNative.jni_YGNodeStyleGetDirection(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getWidth() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetWidth(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaWrap getWrap() {
        return YogaWrap.fromInt(YogaNative.jni_YGNodeStyleGetFlexWrap(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public int indexOf(YogaNode yogaNode) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list == null) {
            return -1;
        }
        return list.indexOf(yogaNode);
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isBaselineDefined() {
        if (this.mBaselineFunction != null) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isDirty() {
        return YogaNative.jni_YGNodeIsDirty(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isMeasureDefined() {
        if (this.mMeasureFunction != null) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isReferenceBaseline() {
        return YogaNative.jni_YGNodeIsReferenceBaseline(this.mNativePointer);
    }

    public final long measure(float f, int i, float f2, int i2) {
        if (isMeasureDefined()) {
            return this.mMeasureFunction.measure(this, f, YogaMeasureMode.fromInt(i), f2, YogaMeasureMode.fromInt(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.YogaNode
    public void print() {
        YogaNative.jni_YGNodePrint(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void reset() {
        this.mMeasureFunction = null;
        this.mBaselineFunction = null;
        this.mData = null;
        YogaNative.jni_YGNodeReset(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAlignContent(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignContent(this.mNativePointer, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAlignItems(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignItems(this.mNativePointer, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAlignSelf(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignSelf(this.mNativePointer, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAspectRatio(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatio(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        boolean z;
        this.mBaselineFunction = yogaBaselineFunction;
        long j = this.mNativePointer;
        if (yogaBaselineFunction != null) {
            z = true;
        } else {
            z = false;
        }
        YogaNative.jni_YGNodeSetHasBaselineFunc(j, z);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setBorder(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetBorder(this.mNativePointer, yogaEdge.intValue(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setData(Object obj) {
        this.mData = obj;
    }

    @Override // com.facebook.yoga.YogaNode
    public void setDirection(YogaDirection yogaDirection) {
        YogaNative.jni_YGNodeStyleSetDirection(this.mNativePointer, yogaDirection.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setDisplay(YogaDisplay yogaDisplay) {
        YogaNative.jni_YGNodeStyleSetDisplay(this.mNativePointer, yogaDisplay.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlex(float f) {
        YogaNative.jni_YGNodeStyleSetFlex(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexBasis(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasis(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexBasisAuto() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAuto(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexBasisPercent(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercent(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        YogaNative.jni_YGNodeStyleSetFlexDirection(this.mNativePointer, yogaFlexDirection.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexGrow(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrow(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexShrink(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrink(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setHeight(float f) {
        YogaNative.jni_YGNodeStyleSetHeight(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setHeightAuto() {
        YogaNative.jni_YGNodeStyleSetHeightAuto(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setHeightPercent(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercent(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setIsReferenceBaseline(boolean z) {
        YogaNative.jni_YGNodeSetIsReferenceBaseline(this.mNativePointer, z);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setJustifyContent(YogaJustify yogaJustify) {
        YogaNative.jni_YGNodeStyleSetJustifyContent(this.mNativePointer, yogaJustify.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMargin(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetMargin(this.mNativePointer, yogaEdge.intValue(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMarginAuto(YogaEdge yogaEdge) {
        YogaNative.jni_YGNodeStyleSetMarginAuto(this.mNativePointer, yogaEdge.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMarginPercent(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercent(this.mNativePointer, yogaEdge.intValue(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxHeight(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeight(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxHeightPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercent(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxWidth(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidth(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxWidthPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercent(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        boolean z;
        this.mMeasureFunction = yogaMeasureFunction;
        long j = this.mNativePointer;
        if (yogaMeasureFunction != null) {
            z = true;
        } else {
            z = false;
        }
        YogaNative.jni_YGNodeSetHasMeasureFunc(j, z);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinHeight(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeight(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinHeightPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercent(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinWidth(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidth(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinWidthPercent(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercent(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setOverflow(YogaOverflow yogaOverflow) {
        YogaNative.jni_YGNodeStyleSetOverflow(this.mNativePointer, yogaOverflow.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPadding(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPadding(this.mNativePointer, yogaEdge.intValue(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPaddingPercent(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercent(this.mNativePointer, yogaEdge.intValue(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPosition(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPosition(this.mNativePointer, yogaEdge.intValue(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPositionPercent(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercent(this.mNativePointer, yogaEdge.intValue(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPositionType(YogaPositionType yogaPositionType) {
        YogaNative.jni_YGNodeStyleSetPositionType(this.mNativePointer, yogaPositionType.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setStyleInputs(float[] fArr, int i) {
        YogaNative.jni_YGNodeSetStyleInputs(this.mNativePointer, fArr, i);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWidth(float f) {
        YogaNative.jni_YGNodeStyleSetWidth(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWidthAuto() {
        YogaNative.jni_YGNodeStyleSetWidthAuto(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWidthPercent(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercent(this.mNativePointer, f);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWrap(YogaWrap yogaWrap) {
        YogaNative.jni_YGNodeStyleSetFlexWrap(this.mNativePointer, yogaWrap.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaNodeJNIBase cloneWithoutChildren() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jni_YGNodeClone = YogaNative.jni_YGNodeClone(this.mNativePointer);
            yogaNodeJNIBase.mOwner = null;
            yogaNodeJNIBase.mNativePointer = jni_YGNodeClone;
            yogaNodeJNIBase.clearChildren();
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaNodeJNIBase getChildAt(int i) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list != null) {
            return list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaNodeJNIBase getOwner() {
        return this.mOwner;
    }

    @Override // com.facebook.yoga.YogaNode
    @Deprecated
    public YogaNodeJNIBase getParent() {
        return getOwner();
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaNodeJNIBase removeChildAt(int i) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list != null) {
            YogaNodeJNIBase remove = list.remove(i);
            remove.mOwner = null;
            YogaNative.jni_YGNodeRemoveChild(this.mNativePointer, remove.mNativePointer);
            return remove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    public YogaNodeJNIBase(YogaConfig yogaConfig) {
        long jni_YGNodeNewWithConfig = YogaNative.jni_YGNodeNewWithConfig(yogaConfig.mNativePointer, YogaConfig.useBatchingForLayoutOutputs);
        this.mNativePointer = jni_YGNodeNewWithConfig;
        if (jni_YGNodeNewWithConfig == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }
}
