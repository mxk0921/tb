package com.facebook.yoga;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class YogaNodeJNI extends YogaNodeJNIBase {
    private float mWidth = Float.NaN;
    private float mHeight = Float.NaN;
    private float mTop = Float.NaN;
    private float mLeft = Float.NaN;
    private float mMarginLeft = 0.0f;
    private float mMarginTop = 0.0f;
    private float mMarginRight = 0.0f;
    private float mMarginBottom = 0.0f;
    private float mPaddingLeft = 0.0f;
    private float mPaddingTop = 0.0f;
    private float mPaddingRight = 0.0f;
    private float mPaddingBottom = 0.0f;
    private float mBorderLeft = 0.0f;
    private float mBorderTop = 0.0f;
    private float mBorderRight = 0.0f;
    private float mBorderBottom = 0.0f;
    private int mLayoutDirection = 0;
    private boolean mHasNewLayout = true;
    private boolean mDoesLegacyStretchFlagAffectsLayout = false;

    /* compiled from: Taobao */
    /* renamed from: com.facebook.yoga.YogaNodeJNI$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaEdge;

        static {
            int[] iArr = new int[YogaEdge.values().length];
            $SwitchMap$com$facebook$yoga$YogaEdge = iArr;
            try {
                iArr[YogaEdge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[YogaEdge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[YogaEdge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[YogaEdge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[YogaEdge.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[YogaEdge.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        t2o.a(503316509);
    }

    public YogaNodeJNI() {
    }

    @Override // com.facebook.yoga.YogaNode
    public void copyLayout(YogaNode yogaNode) {
        YogaNodeJNI yogaNodeJNI = (YogaNodeJNI) yogaNode;
        this.mLeft = yogaNodeJNI.mLeft;
        this.mTop = yogaNodeJNI.mTop;
        this.mWidth = yogaNodeJNI.mWidth;
        this.mHeight = yogaNodeJNI.mHeight;
    }

    @Override // com.facebook.yoga.YogaNodeJNIBase
    public boolean getDoesLegacyStretchFlagAffectsLayout() {
        return this.mDoesLegacyStretchFlagAffectsLayout;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutBorder(YogaEdge yogaEdge) {
        switch (AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.mBorderLeft;
            case 2:
                return this.mBorderTop;
            case 3:
                return this.mBorderRight;
            case 4:
                return this.mBorderBottom;
            case 5:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.mBorderRight;
                }
                return this.mBorderLeft;
            case 6:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.mBorderLeft;
                }
                return this.mBorderRight;
            default:
                throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaDirection getLayoutDirection() {
        return YogaDirection.fromInt(this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutHeight() {
        return this.mHeight;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutMargin(YogaEdge yogaEdge) {
        switch (AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.mMarginLeft;
            case 2:
                return this.mMarginTop;
            case 3:
                return this.mMarginRight;
            case 4:
                return this.mMarginBottom;
            case 5:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.mMarginRight;
                }
                return this.mMarginLeft;
            case 6:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.mMarginLeft;
                }
                return this.mMarginRight;
            default:
                throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutPadding(YogaEdge yogaEdge) {
        switch (AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.mPaddingLeft;
            case 2:
                return this.mPaddingTop;
            case 3:
                return this.mPaddingRight;
            case 4:
                return this.mPaddingBottom;
            case 5:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.mPaddingRight;
                }
                return this.mPaddingLeft;
            case 6:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.mPaddingLeft;
                }
                return this.mPaddingRight;
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutWidth() {
        return this.mWidth;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutX() {
        return this.mLeft;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutY() {
        return this.mTop;
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean hasNewLayout() {
        return this.mHasNewLayout;
    }

    @Override // com.facebook.yoga.YogaNode
    public void markLayoutSeen() {
        this.mHasNewLayout = false;
    }

    @Override // com.facebook.yoga.YogaNodeJNIBase, com.facebook.yoga.YogaNode
    public void reset() {
        super.reset();
        this.mHasNewLayout = true;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
    }

    public YogaNodeJNI(YogaConfig yogaConfig) {
        super(yogaConfig);
    }
}
