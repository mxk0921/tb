package com.taobao.android.dinamicx.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import java.util.ArrayList;
import tb.ic5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativePageIndicator extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isLineDisplayType;
    private int itemMargin;
    private int itemRoundDiameter;
    private int itemSelectedBorderColor;
    private int itemSelectedBorderWidth;
    private int itemUnSelectedBorderColor;
    private int itemUnSelectedBorderWidth;
    private int lineItemHeight;
    private int lineItemWidth;
    private GradientDrawable selectedDrawable;
    private GradientDrawable unselectedDrawable;
    private int currentIndex = -1;
    public final a recycledPool = new a();
    private final int IMAGE_VIEW_TYPE = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<ArrayList<View>> f7354a = new SparseArray<>();
        public final SparseIntArray b = new SparseIntArray();

        static {
            t2o.a(444597177);
        }

        public View a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("848e8e32", new Object[]{this, new Integer(i)});
            }
            ArrayList<View> arrayList = this.f7354a.get(i);
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            int size = arrayList.size() - 1;
            View view = arrayList.get(size);
            arrayList.remove(size);
            return view;
        }

        public final ArrayList<View> b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("c332b9ba", new Object[]{this, new Integer(i)});
            }
            ArrayList<View> arrayList = this.f7354a.get(i);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f7354a.put(i, arrayList);
                if (this.b.indexOfKey(i) < 0) {
                    this.b.put(i, 10);
                }
            }
            return arrayList;
        }

        public void c(int i, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5dffc1b", new Object[]{this, new Integer(i), view});
                return;
            }
            ArrayList<View> b = b(i);
            if (this.b.get(i) > b.size()) {
                b.add(view);
            }
        }
    }

    static {
        t2o.a(444597176);
    }

    public DXNativePageIndicator(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(0);
        setGravity(17);
    }

    public static /* synthetic */ Object ipc$super(DXNativePageIndicator dXNativePageIndicator, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 64333381) {
            return super.getChildAt(((Number) objArr[0]).intValue());
        }
        if (hashCode == 1273305472) {
            super.removeViewAt(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 1502719299) {
            return new Integer(super.getChildCount());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/view/DXNativePageIndicator");
        }
    }

    private boolean isLineDisplayTypeDrawableInValid(GradientDrawable gradientDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f369e35a", new Object[]{this, gradientDrawable})).booleanValue();
        }
        if (!this.isLineDisplayType || gradientDrawable == null || gradientDrawable.getIntrinsicWidth() == this.lineItemWidth) {
            return false;
        }
        return true;
    }

    private void recycleView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3b0684", new Object[]{this, new Integer(i)});
        } else if (i < super.getChildCount()) {
            View childAt = super.getChildAt(i);
            super.removeViewAt(i);
            this.recycledPool.c(1, childAt);
        }
    }

    public void addChildViews(int i, int i2) {
        ImageView imageView;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb9f31a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (getChildCount() > i) {
            for (int childCount = getChildCount() - 1; childCount >= i; childCount--) {
                recycleView(childCount);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 < getChildCount()) {
                imageView = (ImageView) getChildAt(i5);
            } else {
                imageView = null;
            }
            if (imageView == null) {
                imageView = (ImageView) this.recycledPool.a(1);
                if (imageView == null) {
                    imageView = new ImageView(getContext());
                }
                addView(imageView);
            }
            if (i5 == i2) {
                imageView.setImageDrawable(this.selectedDrawable);
                this.currentIndex = i2;
            } else {
                imageView.setImageDrawable(this.unselectedDrawable);
            }
            boolean z = this.isLineDisplayType;
            if (z) {
                i3 = this.lineItemWidth;
            } else {
                i3 = this.itemRoundDiameter;
            }
            if (z) {
                i4 = this.lineItemHeight;
            } else {
                i4 = this.itemRoundDiameter;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i4);
            if (i5 != i - 1) {
                layoutParams.rightMargin = this.itemMargin;
            } else {
                layoutParams.rightMargin = 0;
            }
            imageView.setLayoutParams(layoutParams);
        }
    }

    public int getCurrentIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        return this.currentIndex;
    }

    public int getItemMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a22b91", new Object[]{this})).intValue();
        }
        return this.itemMargin;
    }

    public int getItemRoundDiameter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6551eaac", new Object[]{this})).intValue();
        }
        return this.itemRoundDiameter;
    }

    public int getItemSelectedBorderColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7815cdad", new Object[]{this})).intValue();
        }
        return this.itemSelectedBorderColor;
    }

    public int getItemSelectedBorderWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fef0e290", new Object[]{this})).intValue();
        }
        return this.itemSelectedBorderWidth;
    }

    public int getItemUnSelectedBorderColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8478914", new Object[]{this})).intValue();
        }
        return this.itemUnSelectedBorderColor;
    }

    public int getItemUnSelectedBorderWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f229df7", new Object[]{this})).intValue();
        }
        return this.itemUnSelectedBorderWidth;
    }

    public GradientDrawable getSelectedDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("3e0358d4", new Object[]{this});
        }
        return this.selectedDrawable;
    }

    public GradientDrawable getUnselectedDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("e5b6909b", new Object[]{this});
        }
        return this.unselectedDrawable;
    }

    public void setItemLineDisplayTypeSize(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3826c68", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.isLineDisplayType && i > 0 && i2 > 0 && i3 > 0) {
            this.lineItemWidth = Math.max(0, (i2 - ((i - 1) * this.itemMargin)) / i);
            this.lineItemHeight = i3;
        }
    }

    public void setItemMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7a5499", new Object[]{this, new Integer(i)});
        } else {
            this.itemMargin = i;
        }
    }

    public void setItemRoundDiameter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772f7b76", new Object[]{this, new Integer(i)});
        } else {
            this.itemRoundDiameter = i;
        }
    }

    public void setItemSelectedBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dbf95", new Object[]{this, new Integer(i)});
        } else {
            this.itemSelectedBorderColor = i;
        }
    }

    public void setItemSelectedBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da154712", new Object[]{this, new Integer(i)});
        } else {
            this.itemSelectedBorderWidth = i;
        }
    }

    public void setItemUnSelectedBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c6de0e", new Object[]{this, new Integer(i)});
        } else {
            this.itemUnSelectedBorderColor = i;
        }
    }

    public void setItemUnSelectedBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4e658b", new Object[]{this, new Integer(i)});
        } else {
            this.itemUnSelectedBorderWidth = i;
        }
    }

    public void setLineDisplayType(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8edd27", new Object[]{this, new Boolean(z)});
        } else {
            this.isLineDisplayType = z;
        }
    }

    public void setSelectedDrawable(int i) {
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6c761", new Object[]{this, new Integer(i)});
            return;
        }
        GradientDrawable gradientDrawable = this.selectedDrawable;
        if (gradientDrawable == null || isLineDisplayTypeDrawableInValid(gradientDrawable)) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1 ^ (this.isLineDisplayType ? 1 : 0));
            gradientDrawable2.setColor(i);
            boolean z = this.isLineDisplayType;
            if (z) {
                i2 = this.lineItemWidth;
            } else {
                i2 = this.itemRoundDiameter;
            }
            if (z) {
                i3 = this.lineItemHeight;
            } else {
                i3 = this.itemRoundDiameter;
            }
            gradientDrawable2.setSize(i2, i3);
            if (this.isLineDisplayType) {
                i4 = this.lineItemHeight;
            } else {
                i4 = this.itemRoundDiameter;
            }
            gradientDrawable2.setCornerRadius(i4 / 2.0f);
            gradientDrawable2.setStroke(this.itemSelectedBorderWidth, this.itemSelectedBorderColor);
            this.selectedDrawable = gradientDrawable2;
            return;
        }
        this.selectedDrawable.setColor(i);
    }

    public void setSelectedView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a6a33a", new Object[]{this, new Integer(i)});
        } else if (this.currentIndex != i && i < getChildCount()) {
            int i2 = this.currentIndex;
            if (i2 != -1) {
                ((ImageView) getChildAt(i2)).setImageDrawable(this.unselectedDrawable);
            }
            ImageView imageView = (ImageView) getChildAt(i);
            if (imageView != null) {
                imageView.setImageDrawable(this.selectedDrawable);
            } else {
                f fVar = new f("dinamicx");
                f.a aVar = new f.a("Render", "Render_Fltten_Crash", f.DXERROR_RENDER_PAGE_INDICATOR_CRASH_ERROR);
                aVar.e = "this.getChildCount(): " + getChildCount() + " index: " + i + " currentIndex: " + this.currentIndex;
                fVar.c.add(aVar);
                ic5.p(fVar);
            }
            this.currentIndex = i;
        }
    }

    public void setUnselectedDrawable(int i) {
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c239cae8", new Object[]{this, new Integer(i)});
            return;
        }
        GradientDrawable gradientDrawable = this.unselectedDrawable;
        if (gradientDrawable == null || isLineDisplayTypeDrawableInValid(gradientDrawable)) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1 ^ (this.isLineDisplayType ? 1 : 0));
            gradientDrawable2.setColor(i);
            boolean z = this.isLineDisplayType;
            if (z) {
                i2 = this.lineItemWidth;
            } else {
                i2 = this.itemRoundDiameter;
            }
            if (z) {
                i3 = this.lineItemHeight;
            } else {
                i3 = this.itemRoundDiameter;
            }
            gradientDrawable2.setSize(i2, i3);
            if (this.isLineDisplayType) {
                i4 = this.lineItemHeight;
            } else {
                i4 = this.itemRoundDiameter;
            }
            gradientDrawable2.setCornerRadius(i4 / 2.0f);
            gradientDrawable2.setStroke(this.itemUnSelectedBorderWidth, this.itemUnSelectedBorderColor);
            this.unselectedDrawable = gradientDrawable2;
            return;
        }
        this.unselectedDrawable.setColor(i);
    }

    public void setItemNormal(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb900", new Object[]{this, new Integer(i)});
        } else if (i < getChildCount()) {
            ImageView imageView = (ImageView) getChildAt(i);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleY", 0.5f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "scaleX", 0.5f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.setDuration(50L);
            animatorSet.start();
        }
    }

    public void setItemSmall(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a8072a", new Object[]{this, new Integer(i)});
        } else if (i < getChildCount()) {
            ImageView imageView = (ImageView) getChildAt(i);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 0.5f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 0.5f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.setDuration(50L);
            animatorSet.start();
        }
    }

    public DXNativePageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public DXNativePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
