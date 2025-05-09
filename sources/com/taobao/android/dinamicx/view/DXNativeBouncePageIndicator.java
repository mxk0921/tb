package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeBouncePageIndicator extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int currentIndex;
    private int itemMargin;
    private int itemRoundDiameter;
    private int itemSelectedBorderColor;
    private int itemSelectedBorderWidth;
    private int itemUnSelectedBorderColor;
    private int itemUnSelectedBorderWidth;
    private int maxDisplayCount;
    private int pageCount;
    private int previousIndex;
    private GradientDrawable selectedDrawable;
    private GradientDrawable unselectedDrawable;
    private int leftRange = -1;
    private int rightRange = -1;
    public DXNativePageIndicator dxNativePageIndicator = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXNativeBouncePageIndicator dXNativeBouncePageIndicator = DXNativeBouncePageIndicator.this;
            dXNativeBouncePageIndicator.scrollTo((DXNativeBouncePageIndicator.access$000(dXNativeBouncePageIndicator) + DXNativeBouncePageIndicator.access$100(DXNativeBouncePageIndicator.this)) * DXNativeBouncePageIndicator.access$200(DXNativeBouncePageIndicator.this), DXNativeBouncePageIndicator.this.getScrollY());
        }
    }

    static {
        t2o.a(444597162);
    }

    public DXNativeBouncePageIndicator(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ int access$000(DXNativeBouncePageIndicator dXNativeBouncePageIndicator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e70e13a3", new Object[]{dXNativeBouncePageIndicator})).intValue();
        }
        return dXNativeBouncePageIndicator.itemMargin;
    }

    public static /* synthetic */ int access$100(DXNativeBouncePageIndicator dXNativeBouncePageIndicator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d85fa324", new Object[]{dXNativeBouncePageIndicator})).intValue();
        }
        return dXNativeBouncePageIndicator.itemRoundDiameter;
    }

    public static /* synthetic */ int access$200(DXNativeBouncePageIndicator dXNativeBouncePageIndicator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9b132a5", new Object[]{dXNativeBouncePageIndicator})).intValue();
        }
        return dXNativeBouncePageIndicator.leftRange;
    }

    private void checkRangeChange(int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30768957", new Object[]{this, new Integer(i)});
        } else if (!inRange(i) && (i2 = this.maxDisplayCount) < (i3 = this.pageCount)) {
            int i5 = i2 - 1;
            int i6 = i3 - i2;
            if (i >= i5) {
                i4 = Math.min(i6, Math.max((i - i5) + 1, this.leftRange - 1));
            } else {
                i4 = Math.max(0, Math.min(i - 1, this.leftRange - 1));
            }
            int i7 = (this.maxDisplayCount + i4) - 1;
            int i8 = this.leftRange;
            if (i4 != i8 || i7 != this.rightRange) {
                if (i8 == -1 && this.rightRange == -1) {
                    z = true;
                } else {
                    z = false;
                }
                this.leftRange = i4;
                this.rightRange = i7;
                if (z) {
                    post(new a());
                } else {
                    smoothScrollTo((this.itemMargin + this.itemRoundDiameter) * i4, getScrollY());
                }
                int i9 = this.leftRange;
                if (i9 == 0) {
                    setInitWindowDisplay(0);
                } else if (this.rightRange == this.pageCount - 1) {
                    setLastWindowDisplay(i9);
                } else {
                    setMiddleWindowDisplay(i9);
                }
            }
        }
    }

    private boolean inRange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29ee0348", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i <= this.leftRange || i >= this.rightRange) {
            return false;
        }
        return true;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setHorizontalScrollBarEnabled(false);
        DXNativePageIndicator dXNativePageIndicator = new DXNativePageIndicator(context);
        this.dxNativePageIndicator = dXNativePageIndicator;
        addView(dXNativePageIndicator);
        this.currentIndex = this.dxNativePageIndicator.getCurrentIndex();
    }

    public static /* synthetic */ Object ipc$super(DXNativeBouncePageIndicator dXNativeBouncePageIndicator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/DXNativeBouncePageIndicator");
    }

    public void addChildViews(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb9f31a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.pageCount = i;
        this.dxNativePageIndicator.addChildViews(i, i2);
        this.currentIndex = this.dxNativePageIndicator.getCurrentIndex();
        checkRangeChange(i2);
    }

    public int getCurrentIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        return this.dxNativePageIndicator.getCurrentIndex();
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

    public int getMaxDisplayCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b295f5b5", new Object[]{this})).intValue();
        }
        return this.maxDisplayCount;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public void setCurrentIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90cb73e1", new Object[]{this, new Integer(i)});
        } else {
            this.currentIndex = i;
        }
    }

    public void setInitWindowDisplay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842c681c", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.maxDisplayCount + i;
        while (i < i2) {
            this.dxNativePageIndicator.setItemNormal(i);
            if (i == i2 - 1) {
                this.dxNativePageIndicator.setItemSmall(i);
            }
            i++;
        }
    }

    public void setItemMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7a5499", new Object[]{this, new Integer(i)});
            return;
        }
        this.dxNativePageIndicator.setItemMargin(i);
        this.itemMargin = i;
    }

    public void setItemRoundDiameter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772f7b76", new Object[]{this, new Integer(i)});
            return;
        }
        this.dxNativePageIndicator.setItemRoundDiameter(i);
        this.itemRoundDiameter = i;
    }

    public void setItemSelectedBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dbf95", new Object[]{this, new Integer(i)});
            return;
        }
        this.dxNativePageIndicator.setItemSelectedBorderColor(i);
        this.itemSelectedBorderColor = i;
    }

    public void setItemSelectedBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da154712", new Object[]{this, new Integer(i)});
            return;
        }
        this.dxNativePageIndicator.setItemSelectedBorderWidth(i);
        this.itemSelectedBorderWidth = i;
    }

    public void setItemUnSelectedBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c6de0e", new Object[]{this, new Integer(i)});
            return;
        }
        this.dxNativePageIndicator.setItemUnSelectedBorderColor(i);
        this.itemUnSelectedBorderColor = i;
    }

    public void setItemUnSelectedBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4e658b", new Object[]{this, new Integer(i)});
        } else {
            this.itemUnSelectedBorderWidth = i;
        }
    }

    public void setLastWindowDisplay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804b8022", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.maxDisplayCount + i;
        this.dxNativePageIndicator.setItemSmall(i);
        while (true) {
            i++;
            if (i < i2) {
                this.dxNativePageIndicator.setItemNormal(i);
            } else {
                return;
            }
        }
    }

    public void setMaxDisplayCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7c648d", new Object[]{this, new Integer(i)});
        } else {
            this.maxDisplayCount = i;
        }
    }

    public void setMiddleWindowDisplay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48ece1", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.maxDisplayCount + i;
        this.dxNativePageIndicator.setItemSmall(i);
        while (true) {
            i++;
            if (i < i2) {
                this.dxNativePageIndicator.setItemNormal(i);
                if (i == i2 - 1) {
                    this.dxNativePageIndicator.setItemSmall(i);
                }
            } else {
                return;
            }
        }
    }

    public void setSelectedDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6c761", new Object[]{this, new Integer(i)});
        } else {
            this.dxNativePageIndicator.setSelectedDrawable(i);
        }
    }

    public void setSelectedView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a6a33a", new Object[]{this, new Integer(i)});
        } else if (i < this.pageCount) {
            this.previousIndex = this.dxNativePageIndicator.getCurrentIndex();
            this.dxNativePageIndicator.setSelectedView(i);
            int currentIndex = this.dxNativePageIndicator.getCurrentIndex();
            this.currentIndex = currentIndex;
            checkRangeChange(currentIndex);
        }
    }

    public void setUnselectedDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c239cae8", new Object[]{this, new Integer(i)});
        } else {
            this.dxNativePageIndicator.setUnselectedDrawable(i);
        }
    }

    public DXNativeBouncePageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public DXNativeBouncePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
