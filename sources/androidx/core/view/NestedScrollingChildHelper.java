package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NestedScrollingChildHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mIsNestedScrollingEnabled;
    private ViewParent mNestedScrollingParentNonTouch;
    private ViewParent mNestedScrollingParentTouch;
    private int[] mTempNestedScrollConsumed;
    private final View mView;

    public NestedScrollingChildHelper(View view) {
        this.mView = view;
    }

    private boolean dispatchNestedScrollInternal(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent nestedScrollingParentForType;
        int i6;
        int i7;
        int[] iArr3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51b4f4e5", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, new Integer(i5), iArr2})).booleanValue();
        }
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.mView.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] tempNestedScrollConsumed = getTempNestedScrollConsumed();
            tempNestedScrollConsumed[0] = 0;
            tempNestedScrollConsumed[1] = 0;
            iArr3 = tempNestedScrollConsumed;
        } else {
            iArr3 = iArr2;
        }
        ViewParentCompat.onNestedScroll(nestedScrollingParentForType, this.mView, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.mView.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    private ViewParent getNestedScrollingParentForType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("9c1aa483", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return this.mNestedScrollingParentTouch;
        }
        if (i != 1) {
            return null;
        }
        return this.mNestedScrollingParentNonTouch;
    }

    private int[] getTempNestedScrollConsumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("3309b0e7", new Object[]{this});
        }
        if (this.mTempNestedScrollConsumed == null) {
            this.mTempNestedScrollConsumed = new int[2];
        }
        return this.mTempNestedScrollConsumed;
    }

    private void setNestedScrollingParentForType(int i, ViewParent viewParent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a4c6a9", new Object[]{this, new Integer(i), viewParent});
        } else if (i == 0) {
            this.mNestedScrollingParentTouch = viewParent;
        } else if (i == 1) {
            this.mNestedScrollingParentNonTouch = viewParent;
        }
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb2ad7c6", new Object[]{this, new Integer(i), new Integer(i2), iArr, iArr2})).booleanValue() : dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2320a5d7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr})).booleanValue() : dispatchNestedScrollInternal(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean hasNestedScrollingParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1f74419", new Object[]{this})).booleanValue() : hasNestedScrollingParent(0);
    }

    public boolean isNestedScrollingEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c534e78", new Object[]{this})).booleanValue();
        }
        return this.mIsNestedScrollingEnabled;
    }

    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            ViewCompat.stopNestedScroll(this.mView);
        }
    }

    public void onStopNestedScroll(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a4d786", new Object[]{this, view});
        } else {
            ViewCompat.stopNestedScroll(this.mView);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9739c0a8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.mIsNestedScrollingEnabled) {
            ViewCompat.stopNestedScroll(this.mView);
        }
        this.mIsNestedScrollingEnabled = z;
    }

    public boolean startNestedScroll(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ced332fa", new Object[]{this, new Integer(i)})).booleanValue() : startNestedScroll(i, 0);
    }

    public void stopNestedScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299bf94d", new Object[]{this});
        } else {
            stopNestedScroll(0);
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent nestedScrollingParentForType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcc718c6", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
        }
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedFling(nestedScrollingParentForType, this.mView, f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent nestedScrollingParentForType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd6a38f5", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedPreFling(nestedScrollingParentForType, this.mView, f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent nestedScrollingParentForType;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a309385", new Object[]{this, new Integer(i), new Integer(i2), iArr, iArr2, new Integer(i3)})).booleanValue();
        }
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.mView.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            iArr = getTempNestedScrollConsumed();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        ViewParentCompat.onNestedPreScroll(nestedScrollingParentForType, this.mView, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.mView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40f48794", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, new Integer(i5)})).booleanValue() : dispatchNestedScrollInternal(i, i2, i3, i4, iArr, i5, null);
    }

    public boolean hasNestedScrollingParent(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf1b192", new Object[]{this, new Integer(i)})).booleanValue() : getNestedScrollingParentForType(i) != null;
    }

    public boolean startNestedScroll(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b939ed1", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (hasNestedScrollingParent(i2)) {
            return true;
        }
        if (isNestedScrollingEnabled()) {
            View view = this.mView;
            for (ViewParent parent = this.mView.getParent(); parent != null; parent = parent.getParent()) {
                if (ViewParentCompat.onStartNestedScroll(parent, view, this.mView, i, i2)) {
                    setNestedScrollingParentForType(i2, parent);
                    ViewParentCompat.onNestedScrollAccepted(parent, view, this.mView, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public void stopNestedScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3a356", new Object[]{this, new Integer(i)});
            return;
        }
        ViewParent nestedScrollingParentForType = getNestedScrollingParentForType(i);
        if (nestedScrollingParentForType != null) {
            ViewParentCompat.onStopNestedScroll(nestedScrollingParentForType, this.mView, i);
            setNestedScrollingParentForType(i, null);
        }
    }

    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d607729e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, new Integer(i5), iArr2});
        } else {
            dispatchNestedScrollInternal(i, i2, i3, i4, iArr, i5, iArr2);
        }
    }
}
