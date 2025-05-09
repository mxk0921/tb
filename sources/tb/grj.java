package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class grj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f20180a;
    public float b;
    public int c = -1;

    static {
        t2o.a(503317465);
    }

    public grj(View view) {
        this.f20180a = view;
    }

    public final boolean a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt != null && (i5 = i2 + scrollX) >= childAt.getLeft() && i5 < childAt.getRight() * childAt.getScaleX() && (i6 = i3 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom()) {
                    i4 = childCount;
                    if (a(childAt, true, i, (int) ((i5 - childAt.getLeft()) / childAt.getScaleX()), i6 - childAt.getTop())) {
                        return true;
                    }
                } else {
                    i4 = childCount;
                }
                childCount = i4 - 1;
            }
        } else if (view instanceof SeekBar) {
            return true;
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r3 != 3) goto L_0x0080;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.grj.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "e7b587fe"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r11
            r2[r0] = r12
            java.lang.Object r12 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L_0x001c:
            int r3 = r12.getActionMasked()
            if (r3 == 0) goto L_0x0064
            r4 = -1
            if (r3 == r0) goto L_0x0061
            if (r3 == r2) goto L_0x002b
            r12 = 3
            if (r3 == r12) goto L_0x0061
            goto L_0x0080
        L_0x002b:
            android.view.View r2 = r11.f20180a
            boolean r2 = r11.c(r2)
            if (r2 == 0) goto L_0x0034
            return r1
        L_0x0034:
            int r2 = r11.c
            if (r2 != r4) goto L_0x0039
            return r1
        L_0x0039:
            int r2 = r12.findPointerIndex(r2)
            if (r2 >= 0) goto L_0x0040
            return r1
        L_0x0040:
            float r3 = r12.getX(r2)
            float r12 = r12.getY(r2)
            float r2 = r11.b
            float r2 = r3 - r2
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0080
            android.view.View r6 = r11.f20180a
            int r8 = (int) r2
            int r9 = (int) r3
            int r10 = (int) r12
            r7 = 0
            r5 = r11
            boolean r12 = r5.a(r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x0080
            r11.b = r3
            return r1
        L_0x0061:
            r11.c = r4
            goto L_0x0080
        L_0x0064:
            android.view.View r2 = r11.f20180a
            boolean r2 = r11.c(r2)
            if (r2 == 0) goto L_0x006d
            return r1
        L_0x006d:
            int r2 = r12.getPointerId(r1)
            r11.c = r2
            int r2 = r12.findPointerIndex(r2)
            if (r2 >= 0) goto L_0x007a
            return r1
        L_0x007a:
            float r12 = r12.getX()
            r11.b = r12
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.grj.b(android.view.MotionEvent):boolean");
    }

    public final boolean c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a1b4452", new Object[]{this, view})).booleanValue();
        }
        if (view instanceof ied) {
            ied iedVar = (ied) view;
            if (iedVar.canPullIntercept(ied.PULL_HORIZONTAL_DRAG) || iedVar.canPullIntercept(ied.PULL_VERTICAL_DRAG)) {
                return true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (c(childAt)) {
                        return true;
                    }
                    if (childAt instanceof ied) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
