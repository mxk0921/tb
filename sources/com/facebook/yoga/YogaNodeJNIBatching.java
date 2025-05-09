package com.facebook.yoga;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class YogaNodeJNIBatching extends YogaNodeJNIBase {
    private static final byte BORDER = 4;
    private static final byte DOES_LEGACY_STRETCH_BEHAVIOUR = 8;
    private static final byte HAS_NEW_LAYOUT = 16;
    private static final byte LAYOUT_BORDER_START_INDEX = 14;
    private static final byte LAYOUT_DIRECTION_INDEX = 5;
    private static final byte LAYOUT_EDGE_SET_FLAG_INDEX = 0;
    private static final byte LAYOUT_HEIGHT_INDEX = 2;
    private static final byte LAYOUT_LEFT_INDEX = 3;
    private static final byte LAYOUT_MARGIN_START_INDEX = 6;
    private static final byte LAYOUT_PADDING_START_INDEX = 10;
    private static final byte LAYOUT_TOP_INDEX = 4;
    private static final byte LAYOUT_WIDTH_INDEX = 1;
    private static final byte MARGIN = 1;
    private static final byte PADDING = 2;
    private float[] arr = null;
    float[] copyArr = null;
    private int mLayoutDirection = 0;
    private boolean mHasNewLayout = true;

    /* compiled from: Taobao */
    /* renamed from: com.facebook.yoga.YogaNodeJNIBatching$1  reason: invalid class name */
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
        t2o.a(503316512);
    }

    public YogaNodeJNIBatching() {
    }

    @Override // com.facebook.yoga.YogaNode
    public void copyLayout(YogaNode yogaNode) {
        if (this.copyArr == null) {
            this.copyArr = new float[4];
        }
        YogaNodeJNIBatching yogaNodeJNIBatching = (YogaNodeJNIBatching) yogaNode;
        this.copyArr[0] = yogaNodeJNIBatching.getLayoutX();
        this.copyArr[1] = yogaNodeJNIBatching.getLayoutY();
        this.copyArr[2] = yogaNodeJNIBatching.getLayoutWidth();
        this.copyArr[3] = yogaNodeJNIBatching.getLayoutHeight();
    }

    @Override // com.facebook.yoga.YogaNodeJNIBase
    public boolean getDoesLegacyStretchFlagAffectsLayout() {
        float[] fArr = this.arr;
        if (fArr == null || (((int) fArr[0]) & 8) != 8) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutBorder(YogaEdge yogaEdge) {
        int i;
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i2 = 0;
        float f = fArr[0];
        if ((((int) f) & 4) != 4) {
            return 0.0f;
        }
        if ((((int) f) & 1) == 1) {
            i = 0;
        } else {
            i = 4;
        }
        int i3 = 14 - i;
        if ((((int) f) & 2) != 2) {
            i2 = 4;
        }
        int i4 = i3 - i2;
        switch (AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.arr[i4];
            case 2:
                return this.arr[i4 + 1];
            case 3:
                return this.arr[i4 + 2];
            case 4:
                return this.arr[i4 + 3];
            case 5:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.arr[i4 + 2];
                }
                return this.arr[i4];
            case 6:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.arr[i4];
                }
                return this.arr[i4 + 2];
            default:
                throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaDirection getLayoutDirection() {
        int i;
        float[] fArr = this.arr;
        if (fArr != null) {
            i = (int) fArr[5];
        } else {
            i = this.mLayoutDirection;
        }
        return YogaDirection.fromInt(i);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutHeight() {
        float[] fArr = this.copyArr;
        if (fArr != null) {
            return fArr[3];
        }
        float[] fArr2 = this.arr;
        if (fArr2 != null) {
            return fArr2[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutMargin(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null || (((int) fArr[0]) & 1) != 1) {
            return 0.0f;
        }
        switch (AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.arr[6];
            case 2:
                return this.arr[7];
            case 3:
                return this.arr[8];
            case 4:
                return this.arr[9];
            case 5:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.arr[8];
                }
                return this.arr[6];
            case 6:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.arr[6];
                }
                return this.arr[8];
            default:
                throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutPadding(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = 0;
        float f = fArr[0];
        if ((((int) f) & 2) != 2) {
            return 0.0f;
        }
        if ((((int) f) & 1) != 1) {
            i = 4;
        }
        int i2 = 10 - i;
        switch (AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.arr[i2];
            case 2:
                return this.arr[11 - i];
            case 3:
                return this.arr[12 - i];
            case 4:
                return this.arr[13 - i];
            case 5:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.arr[12 - i];
                }
                return this.arr[i2];
            case 6:
                if (getLayoutDirection() == YogaDirection.RTL) {
                    return this.arr[i2];
                }
                return this.arr[12 - i];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutWidth() {
        float[] fArr = this.copyArr;
        if (fArr != null) {
            return fArr[2];
        }
        float[] fArr2 = this.arr;
        if (fArr2 != null) {
            return fArr2[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutX() {
        float[] fArr = this.copyArr;
        if (fArr != null) {
            return fArr[0];
        }
        float[] fArr2 = this.arr;
        if (fArr2 != null) {
            return fArr2[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutY() {
        float[] fArr = this.copyArr;
        if (fArr != null) {
            return fArr[1];
        }
        float[] fArr2 = this.arr;
        if (fArr2 != null) {
            return fArr2[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean hasNewLayout() {
        float[] fArr = this.arr;
        if (fArr == null) {
            return this.mHasNewLayout;
        }
        if ((((int) fArr[0]) & 16) == 16) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.yoga.YogaNode
    public void markLayoutSeen() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.mHasNewLayout = false;
    }

    @Override // com.facebook.yoga.YogaNodeJNIBase, com.facebook.yoga.YogaNode
    public void reset() {
        super.reset();
        this.arr = null;
        this.copyArr = null;
        this.mHasNewLayout = true;
        this.mLayoutDirection = 0;
    }

    public YogaNodeJNIBatching(YogaConfig yogaConfig) {
        super(yogaConfig);
    }
}
