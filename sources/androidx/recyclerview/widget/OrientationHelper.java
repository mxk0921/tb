package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class OrientationHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_SIZE = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;
    private int mLastTotalSpace;
    public final RecyclerView.LayoutManager mLayoutManager;
    public final Rect mTmpRect;

    public static OrientationHelper createHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("e615008a", new Object[]{layoutManager});
        }
        return new OrientationHelper(layoutManager) { // from class: androidx.recyclerview.widget.OrientationHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/recyclerview/widget/OrientationHelper$1");
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getDecoratedEnd(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("4154f6c4", new Object[]{this, view})).intValue();
                }
                return this.mLayoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getDecoratedMeasurement(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("36e345c3", new Object[]{this, view})).intValue();
                }
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.mLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getDecoratedMeasurementInOther(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("a55aa32e", new Object[]{this, view})).intValue();
                }
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.mLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getDecoratedStart(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("3b9eef1d", new Object[]{this, view})).intValue();
                }
                return this.mLayoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getEnd() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("ddee639f", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getWidth();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getEndAfterPadding() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("72158454", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getWidth() - this.mLayoutManager.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getEndPadding() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("92aab526", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getMode() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("56d77213", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getWidthMode();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getModeInOther() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("ba66f40c", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getHeightMode();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getStartAfterPadding() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("a9d8c75b", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getTotalSpace() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("e68e0092", new Object[]{this})).intValue();
                }
                return (this.mLayoutManager.getWidth() - this.mLayoutManager.getPaddingLeft()) - this.mLayoutManager.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getTransformedEndWithDecoration(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("ad5c04e2", new Object[]{this, view})).intValue();
                }
                this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
                return this.mTmpRect.right;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getTransformedStartWithDecoration(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("9688587b", new Object[]{this, view})).intValue();
                }
                this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
                return this.mTmpRect.left;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public void offsetChild(View view, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("58e848c1", new Object[]{this, view, new Integer(i)});
                } else {
                    view.offsetLeftAndRight(i);
                }
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public void offsetChildren(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aac1aea", new Object[]{this, new Integer(i)});
                } else {
                    this.mLayoutManager.offsetChildrenHorizontal(i);
                }
            }
        };
    }

    public static OrientationHelper createOrientationHelper(RecyclerView.LayoutManager layoutManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("7d160719", new Object[]{layoutManager, new Integer(i)});
        }
        if (i == 0) {
            return createHorizontalHelper(layoutManager);
        }
        if (i == 1) {
            return createVerticalHelper(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static OrientationHelper createVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("1c512a5c", new Object[]{layoutManager});
        }
        return new OrientationHelper(layoutManager) { // from class: androidx.recyclerview.widget.OrientationHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/recyclerview/widget/OrientationHelper$2");
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getDecoratedEnd(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("4154f6c4", new Object[]{this, view})).intValue();
                }
                return this.mLayoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getDecoratedMeasurement(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("36e345c3", new Object[]{this, view})).intValue();
                }
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.mLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getDecoratedMeasurementInOther(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("a55aa32e", new Object[]{this, view})).intValue();
                }
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.mLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getDecoratedStart(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("3b9eef1d", new Object[]{this, view})).intValue();
                }
                return this.mLayoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getEnd() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("ddee639f", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getHeight();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getEndAfterPadding() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("72158454", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getHeight() - this.mLayoutManager.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getEndPadding() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("92aab526", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getMode() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("56d77213", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getHeightMode();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getModeInOther() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("ba66f40c", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getWidthMode();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getStartAfterPadding() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("a9d8c75b", new Object[]{this})).intValue();
                }
                return this.mLayoutManager.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getTotalSpace() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("e68e0092", new Object[]{this})).intValue();
                }
                return (this.mLayoutManager.getHeight() - this.mLayoutManager.getPaddingTop()) - this.mLayoutManager.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getTransformedEndWithDecoration(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("ad5c04e2", new Object[]{this, view})).intValue();
                }
                this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
                return this.mTmpRect.bottom;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public int getTransformedStartWithDecoration(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("9688587b", new Object[]{this, view})).intValue();
                }
                this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
                return this.mTmpRect.top;
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public void offsetChild(View view, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("58e848c1", new Object[]{this, view, new Integer(i)});
                } else {
                    view.offsetTopAndBottom(i);
                }
            }

            @Override // androidx.recyclerview.widget.OrientationHelper
            public void offsetChildren(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aac1aea", new Object[]{this, new Integer(i)});
                } else {
                    this.mLayoutManager.offsetChildrenVertical(i);
                }
            }
        };
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public RecyclerView.LayoutManager getLayoutManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("d43bcd1c", new Object[]{this});
        }
        return this.mLayoutManager;
    }

    public abstract int getMode();

    public abstract int getModeInOther();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public int getTotalSpaceChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e6e2662", new Object[]{this})).intValue();
        }
        if (Integer.MIN_VALUE == this.mLastTotalSpace) {
            return 0;
        }
        return getTotalSpace() - this.mLastTotalSpace;
    }

    public abstract int getTransformedEndWithDecoration(View view);

    public abstract int getTransformedStartWithDecoration(View view);

    public abstract void offsetChild(View view, int i);

    public abstract void offsetChildren(int i);

    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
        } else {
            this.mLastTotalSpace = getTotalSpace();
        }
    }

    private OrientationHelper(RecyclerView.LayoutManager layoutManager) {
        this.mLastTotalSpace = Integer.MIN_VALUE;
        this.mTmpRect = new Rect();
        this.mLayoutManager = layoutManager;
    }
}
