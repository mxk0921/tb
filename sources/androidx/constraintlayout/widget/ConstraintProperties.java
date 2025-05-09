package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConstraintProperties {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int END = 7;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int WRAP_CONTENT = -2;
    public ConstraintLayout.LayoutParams mParams;
    public View mView;

    public ConstraintProperties(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mParams = (ConstraintLayout.LayoutParams) layoutParams;
            this.mView = view;
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }

    private String sideToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("550ec967", new Object[]{this, new Integer(i)});
        }
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public ConstraintProperties addToHorizontalChain(int i, int i2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("4857fa00", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i == 0) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        connect(1, i, i3, 0);
        if (i2 == 0) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        connect(2, i2, i4, 0);
        if (i != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i)).connect(2, this.mView.getId(), 1, 0);
        }
        if (i2 != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i2)).connect(1, this.mView.getId(), 2, 0);
        }
        return this;
    }

    public ConstraintProperties addToHorizontalChainRTL(int i, int i2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("54b45fe8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i == 0) {
            i3 = 6;
        } else {
            i3 = 7;
        }
        connect(6, i, i3, 0);
        if (i2 == 0) {
            i4 = 7;
        } else {
            i4 = 6;
        }
        connect(7, i2, i4, 0);
        if (i != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i)).connect(7, this.mView.getId(), 6, 0);
        }
        if (i2 != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i2)).connect(6, this.mView.getId(), 7, 0);
        }
        return this;
    }

    public ConstraintProperties alpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("63a0de73", new Object[]{this, new Float(f)});
        }
        this.mView.setAlpha(f);
        return this;
    }

    public void apply() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
        }
    }

    public ConstraintProperties centerHorizontally(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("1b6689cb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Float(f)});
        }
        connect(1, i, i2, i3);
        connect(2, i4, i5, i6);
        this.mParams.horizontalBias = f;
        return this;
    }

    public ConstraintProperties centerHorizontallyRtl(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("4d2dc4d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Float(f)});
        }
        connect(6, i, i2, i3);
        connect(7, i4, i5, i6);
        this.mParams.horizontalBias = f;
        return this;
    }

    public ConstraintProperties centerVertically(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("9faa13f9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Float(f)});
        }
        connect(3, i, i2, i3);
        connect(4, i4, i5, i6);
        this.mParams.verticalBias = f;
        return this;
    }

    public ConstraintProperties constrainDefaultHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("cee7c063", new Object[]{this, new Integer(i)});
        }
        this.mParams.matchConstraintDefaultHeight = i;
        return this;
    }

    public ConstraintProperties constrainDefaultWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("4f27e0f8", new Object[]{this, new Integer(i)});
        }
        this.mParams.matchConstraintDefaultWidth = i;
        return this;
    }

    public ConstraintProperties constrainHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("e229b556", new Object[]{this, new Integer(i)});
        }
        ((ViewGroup.MarginLayoutParams) this.mParams).height = i;
        return this;
    }

    public ConstraintProperties constrainMaxHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("81985120", new Object[]{this, new Integer(i)});
        }
        this.mParams.matchConstraintMaxHeight = i;
        return this;
    }

    public ConstraintProperties constrainMaxWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("75f3c49b", new Object[]{this, new Integer(i)});
        }
        this.mParams.matchConstraintMaxWidth = i;
        return this;
    }

    public ConstraintProperties constrainMinHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("39c8ddf2", new Object[]{this, new Integer(i)});
        }
        this.mParams.matchConstraintMinHeight = i;
        return this;
    }

    public ConstraintProperties constrainMinWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("bdf55589", new Object[]{this, new Integer(i)});
        }
        this.mParams.matchConstraintMinWidth = i;
        return this;
    }

    public ConstraintProperties constrainWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("dc2a01a5", new Object[]{this, new Integer(i)});
        }
        ((ViewGroup.MarginLayoutParams) this.mParams).width = i;
        return this;
    }

    public ConstraintProperties dimensionRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("cb7539ce", new Object[]{this, str});
        }
        this.mParams.dimensionRatio = str;
        return this;
    }

    public ConstraintProperties elevation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("81d77614", new Object[]{this, new Float(f)});
        }
        this.mView.setElevation(f);
        return this;
    }

    public ConstraintProperties goneMargin(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("30adcccc", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        switch (i) {
            case 1:
                this.mParams.goneLeftMargin = i2;
                break;
            case 2:
                this.mParams.goneRightMargin = i2;
                break;
            case 3:
                this.mParams.goneTopMargin = i2;
                break;
            case 4:
                this.mParams.goneBottomMargin = i2;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.mParams.goneStartMargin = i2;
                break;
            case 7:
                this.mParams.goneEndMargin = i2;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public ConstraintProperties horizontalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("cf180f74", new Object[]{this, new Float(f)});
        }
        this.mParams.horizontalBias = f;
        return this;
    }

    public ConstraintProperties horizontalChainStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("a18d6a60", new Object[]{this, new Integer(i)});
        }
        this.mParams.horizontalChainStyle = i;
        return this;
    }

    public ConstraintProperties horizontalWeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("43a96d55", new Object[]{this, new Float(f)});
        }
        this.mParams.horizontalWeight = f;
        return this;
    }

    public ConstraintProperties margin(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("76273cd", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        switch (i) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.mParams).leftMargin = i2;
                break;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.mParams).rightMargin = i2;
                break;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.mParams).topMargin = i2;
                break;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.mParams).bottomMargin = i2;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.mParams.setMarginStart(i2);
                break;
            case 7:
                this.mParams.setMarginEnd(i2);
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public ConstraintProperties removeConstraints(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("3d036f42", new Object[]{this, new Integer(i)});
        }
        switch (i) {
            case 1:
                ConstraintLayout.LayoutParams layoutParams = this.mParams;
                layoutParams.leftToRight = -1;
                layoutParams.leftToLeft = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
                layoutParams.goneLeftMargin = Integer.MIN_VALUE;
                break;
            case 2:
                ConstraintLayout.LayoutParams layoutParams2 = this.mParams;
                layoutParams2.rightToRight = -1;
                layoutParams2.rightToLeft = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = -1;
                layoutParams2.goneRightMargin = Integer.MIN_VALUE;
                break;
            case 3:
                ConstraintLayout.LayoutParams layoutParams3 = this.mParams;
                layoutParams3.topToBottom = -1;
                layoutParams3.topToTop = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = -1;
                layoutParams3.goneTopMargin = Integer.MIN_VALUE;
                break;
            case 4:
                ConstraintLayout.LayoutParams layoutParams4 = this.mParams;
                layoutParams4.bottomToTop = -1;
                layoutParams4.bottomToBottom = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = -1;
                layoutParams4.goneBottomMargin = Integer.MIN_VALUE;
                break;
            case 5:
                this.mParams.baselineToBaseline = -1;
                break;
            case 6:
                ConstraintLayout.LayoutParams layoutParams5 = this.mParams;
                layoutParams5.startToEnd = -1;
                layoutParams5.startToStart = -1;
                layoutParams5.setMarginStart(-1);
                this.mParams.goneStartMargin = Integer.MIN_VALUE;
                break;
            case 7:
                ConstraintLayout.LayoutParams layoutParams6 = this.mParams;
                layoutParams6.endToStart = -1;
                layoutParams6.endToEnd = -1;
                layoutParams6.setMarginEnd(-1);
                this.mParams.goneEndMargin = Integer.MIN_VALUE;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public ConstraintProperties removeFromHorizontalChain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("718c848e", new Object[]{this});
        }
        ConstraintLayout.LayoutParams layoutParams = this.mParams;
        int i = layoutParams.leftToRight;
        int i2 = layoutParams.rightToLeft;
        if (i == -1 && i2 == -1) {
            int i3 = layoutParams.startToEnd;
            int i4 = layoutParams.endToStart;
            if (!(i3 == -1 && i4 == -1)) {
                ConstraintProperties constraintProperties = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i3));
                ConstraintProperties constraintProperties2 = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i4));
                ConstraintLayout.LayoutParams layoutParams2 = this.mParams;
                if (i3 != -1 && i4 != -1) {
                    constraintProperties.connect(7, i4, 6, 0);
                    constraintProperties2.connect(6, i, 7, 0);
                } else if (!(i == -1 && i4 == -1)) {
                    int i5 = layoutParams2.rightToRight;
                    if (i5 != -1) {
                        constraintProperties.connect(7, i5, 7, 0);
                    } else {
                        int i6 = layoutParams2.leftToLeft;
                        if (i6 != -1) {
                            constraintProperties2.connect(6, i6, 6, 0);
                        }
                    }
                }
            }
            removeConstraints(6);
            removeConstraints(7);
        } else {
            ConstraintProperties constraintProperties3 = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i));
            ConstraintProperties constraintProperties4 = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i2));
            ConstraintLayout.LayoutParams layoutParams3 = this.mParams;
            if (i != -1 && i2 != -1) {
                constraintProperties3.connect(2, i2, 1, 0);
                constraintProperties4.connect(1, i, 2, 0);
            } else if (!(i == -1 && i2 == -1)) {
                int i7 = layoutParams3.rightToRight;
                if (i7 != -1) {
                    constraintProperties3.connect(2, i7, 2, 0);
                } else {
                    int i8 = layoutParams3.leftToLeft;
                    if (i8 != -1) {
                        constraintProperties4.connect(1, i8, 1, 0);
                    }
                }
            }
            removeConstraints(1);
            removeConstraints(2);
        }
        return this;
    }

    public ConstraintProperties removeFromVerticalChain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("a756b37c", new Object[]{this});
        }
        ConstraintLayout.LayoutParams layoutParams = this.mParams;
        int i = layoutParams.topToBottom;
        int i2 = layoutParams.bottomToTop;
        if (!(i == -1 && i2 == -1)) {
            ConstraintProperties constraintProperties = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i));
            ConstraintProperties constraintProperties2 = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i2));
            ConstraintLayout.LayoutParams layoutParams2 = this.mParams;
            if (i != -1 && i2 != -1) {
                constraintProperties.connect(4, i2, 3, 0);
                constraintProperties2.connect(3, i, 4, 0);
            } else if (!(i == -1 && i2 == -1)) {
                int i3 = layoutParams2.bottomToBottom;
                if (i3 != -1) {
                    constraintProperties.connect(4, i3, 4, 0);
                } else {
                    int i4 = layoutParams2.topToTop;
                    if (i4 != -1) {
                        constraintProperties2.connect(3, i4, 3, 0);
                    }
                }
            }
        }
        removeConstraints(3);
        removeConstraints(4);
        return this;
    }

    public ConstraintProperties rotation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("7b582c53", new Object[]{this, new Float(f)});
        }
        this.mView.setRotation(f);
        return this;
    }

    public ConstraintProperties rotationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("37bf9b7", new Object[]{this, new Float(f)});
        }
        this.mView.setRotationX(f);
        return this;
    }

    public ConstraintProperties rotationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("97fc516", new Object[]{this, new Float(f)});
        }
        this.mView.setRotationY(f);
        return this;
    }

    public ConstraintProperties scaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("1fbe5983", new Object[]{this, new Float(f)});
        }
        this.mView.setScaleY(f);
        return this;
    }

    public ConstraintProperties scaleY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("25c224e2", new Object[]{this, new Float(f)});
        }
        return this;
    }

    public ConstraintProperties transformPivot(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("6f1785f5", new Object[]{this, new Float(f), new Float(f2)});
        }
        this.mView.setPivotX(f);
        this.mView.setPivotY(f2);
        return this;
    }

    public ConstraintProperties transformPivotX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("4c30fa6f", new Object[]{this, new Float(f)});
        }
        this.mView.setPivotX(f);
        return this;
    }

    public ConstraintProperties transformPivotY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("5234c5ce", new Object[]{this, new Float(f)});
        }
        this.mView.setPivotY(f);
        return this;
    }

    public ConstraintProperties translation(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("85d3e1f0", new Object[]{this, new Float(f), new Float(f2)});
        }
        this.mView.setTranslationX(f);
        this.mView.setTranslationY(f2);
        return this;
    }

    public ConstraintProperties translationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("62ed566a", new Object[]{this, new Float(f)});
        }
        this.mView.setTranslationX(f);
        return this;
    }

    public ConstraintProperties translationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("68f121c9", new Object[]{this, new Float(f)});
        }
        this.mView.setTranslationY(f);
        return this;
    }

    public ConstraintProperties translationZ(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("6ef4ed28", new Object[]{this, new Float(f)});
        }
        this.mView.setTranslationZ(f);
        return this;
    }

    public ConstraintProperties verticalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("48b511e2", new Object[]{this, new Float(f)});
        }
        this.mParams.verticalBias = f;
        return this;
    }

    public ConstraintProperties verticalChainStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("38ce624e", new Object[]{this, new Integer(i)});
        }
        this.mParams.verticalChainStyle = i;
        return this;
    }

    public ConstraintProperties verticalWeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("ca0f8c43", new Object[]{this, new Float(f)});
        }
        this.mParams.verticalWeight = f;
        return this;
    }

    public ConstraintProperties visibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("74f8a742", new Object[]{this, new Integer(i)});
        }
        this.mView.setVisibility(i);
        return this;
    }

    public ConstraintProperties addToVerticalChain(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("d4dba1ee", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        connect(3, i, i == 0 ? 3 : 4, 0);
        connect(4, i2, i2 == 0 ? 4 : 3, 0);
        if (i != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i)).connect(4, this.mView.getId(), 3, 0);
        }
        if (i2 != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i2)).connect(3, this.mView.getId(), 4, 0);
        }
        return this;
    }

    public ConstraintProperties centerHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("61b4742e", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            center(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i, 2, 0, i, 1, 0, 0.5f);
        }
        return this;
    }

    public ConstraintProperties centerHorizontallyRtl(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("9d695030", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            center(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i, 7, 0, i, 6, 0, 0.5f);
        }
        return this;
    }

    public ConstraintProperties centerVertically(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("193eb8dc", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            center(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i, 4, 0, i, 3, 0, 0.5f);
        }
        return this;
    }

    public ConstraintProperties connect(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("d5d0ad29", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        switch (i) {
            case 1:
                if (i3 == 1) {
                    ConstraintLayout.LayoutParams layoutParams = this.mParams;
                    layoutParams.leftToLeft = i2;
                    layoutParams.leftToRight = -1;
                } else if (i3 == 2) {
                    ConstraintLayout.LayoutParams layoutParams2 = this.mParams;
                    layoutParams2.leftToRight = i2;
                    layoutParams2.leftToLeft = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + sideToString(i3) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).leftMargin = i4;
                break;
            case 2:
                if (i3 == 1) {
                    ConstraintLayout.LayoutParams layoutParams3 = this.mParams;
                    layoutParams3.rightToLeft = i2;
                    layoutParams3.rightToRight = -1;
                } else if (i3 == 2) {
                    ConstraintLayout.LayoutParams layoutParams4 = this.mParams;
                    layoutParams4.rightToRight = i2;
                    layoutParams4.rightToLeft = -1;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i3) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).rightMargin = i4;
                break;
            case 3:
                if (i3 == 3) {
                    ConstraintLayout.LayoutParams layoutParams5 = this.mParams;
                    layoutParams5.topToTop = i2;
                    layoutParams5.topToBottom = -1;
                    layoutParams5.baselineToBaseline = -1;
                    layoutParams5.baselineToTop = -1;
                    layoutParams5.baselineToBottom = -1;
                } else if (i3 == 4) {
                    ConstraintLayout.LayoutParams layoutParams6 = this.mParams;
                    layoutParams6.topToBottom = i2;
                    layoutParams6.topToTop = -1;
                    layoutParams6.baselineToBaseline = -1;
                    layoutParams6.baselineToTop = -1;
                    layoutParams6.baselineToBottom = -1;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i3) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).topMargin = i4;
                break;
            case 4:
                if (i3 == 4) {
                    ConstraintLayout.LayoutParams layoutParams7 = this.mParams;
                    layoutParams7.bottomToBottom = i2;
                    layoutParams7.bottomToTop = -1;
                    layoutParams7.baselineToBaseline = -1;
                    layoutParams7.baselineToTop = -1;
                    layoutParams7.baselineToBottom = -1;
                } else if (i3 == 3) {
                    ConstraintLayout.LayoutParams layoutParams8 = this.mParams;
                    layoutParams8.bottomToTop = i2;
                    layoutParams8.bottomToBottom = -1;
                    layoutParams8.baselineToBaseline = -1;
                    layoutParams8.baselineToTop = -1;
                    layoutParams8.baselineToBottom = -1;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i3) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).bottomMargin = i4;
                break;
            case 5:
                if (i3 == 5) {
                    ConstraintLayout.LayoutParams layoutParams9 = this.mParams;
                    layoutParams9.baselineToBaseline = i2;
                    layoutParams9.bottomToBottom = -1;
                    layoutParams9.bottomToTop = -1;
                    layoutParams9.topToTop = -1;
                    layoutParams9.topToBottom = -1;
                } else if (i3 == 3) {
                    ConstraintLayout.LayoutParams layoutParams10 = this.mParams;
                    layoutParams10.baselineToTop = i2;
                    layoutParams10.bottomToBottom = -1;
                    layoutParams10.bottomToTop = -1;
                    layoutParams10.topToTop = -1;
                    layoutParams10.topToBottom = -1;
                } else if (i3 == 4) {
                    ConstraintLayout.LayoutParams layoutParams11 = this.mParams;
                    layoutParams11.baselineToBottom = i2;
                    layoutParams11.bottomToBottom = -1;
                    layoutParams11.bottomToTop = -1;
                    layoutParams11.topToTop = -1;
                    layoutParams11.topToBottom = -1;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i3) + " undefined");
                }
                this.mParams.baselineMargin = i4;
                break;
            case 6:
                if (i3 == 6) {
                    ConstraintLayout.LayoutParams layoutParams12 = this.mParams;
                    layoutParams12.startToStart = i2;
                    layoutParams12.startToEnd = -1;
                } else if (i3 == 7) {
                    ConstraintLayout.LayoutParams layoutParams13 = this.mParams;
                    layoutParams13.startToEnd = i2;
                    layoutParams13.startToStart = -1;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i3) + " undefined");
                }
                this.mParams.setMarginStart(i4);
                break;
            case 7:
                if (i3 == 7) {
                    ConstraintLayout.LayoutParams layoutParams14 = this.mParams;
                    layoutParams14.endToEnd = i2;
                    layoutParams14.endToStart = -1;
                } else if (i3 == 6) {
                    ConstraintLayout.LayoutParams layoutParams15 = this.mParams;
                    layoutParams15.endToStart = i2;
                    layoutParams15.endToEnd = -1;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i3) + " undefined");
                }
                this.mParams.setMarginEnd(i4);
                break;
            default:
                throw new IllegalArgumentException(sideToString(i) + " to " + sideToString(i3) + " unknown");
        }
        return this;
    }

    public ConstraintProperties center(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintProperties) ipChange.ipc$dispatch("f93e74fc", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Float(f)});
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i6 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else {
            if (i2 == 1 || i2 == 2) {
                connect(1, i, i2, i3);
                connect(2, i4, i5, i6);
                this.mParams.horizontalBias = f;
            } else if (i2 == 6 || i2 == 7) {
                connect(6, i, i2, i3);
                connect(7, i4, i5, i6);
                this.mParams.horizontalBias = f;
            } else {
                connect(3, i, i2, i3);
                connect(4, i4, i5, i6);
                this.mParams.verticalBias = f;
            }
            return this;
        }
    }
}
