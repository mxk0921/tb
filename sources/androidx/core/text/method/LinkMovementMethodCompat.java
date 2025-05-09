package androidx.core.text.method;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LinkMovementMethodCompat extends LinkMovementMethod {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static LinkMovementMethodCompat sInstance;

    private LinkMovementMethodCompat() {
    }

    public static LinkMovementMethodCompat getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkMovementMethodCompat) ipChange.ipc$dispatch("60aa1ed1", new Object[0]);
        }
        if (sInstance == null) {
            sInstance = new LinkMovementMethodCompat();
        }
        return sInstance;
    }

    public static /* synthetic */ Object ipc$super(LinkMovementMethodCompat linkMovementMethodCompat, String str, Object... objArr) {
        if (str.hashCode() == 1600562927) {
            return new Boolean(super.onTouchEvent((TextView) objArr[0], (Spannable) objArr[1], (MotionEvent) objArr[2]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/text/method/LinkMovementMethodCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        if (r0 <= r2.getLineRight(r1)) goto L_0x0078;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.widget.TextView r6, android.text.Spannable r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = androidx.core.text.method.LinkMovementMethodCompat.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = "5f66a6ef"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r0] = r6
            r6 = 2
            r3[r6] = r7
            r6 = 3
            r3[r6] = r8
            java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x0022:
            boolean r1 = androidx.core.os.BuildCompat.isAtLeastV()
            if (r1 != 0) goto L_0x0078
            int r1 = r8.getAction()
            if (r1 == r0) goto L_0x0030
            if (r1 != 0) goto L_0x0078
        L_0x0030:
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r6.getTotalPaddingLeft()
            int r0 = r0 - r2
            int r2 = r6.getTotalPaddingTop()
            int r1 = r1 - r2
            int r2 = r6.getScrollX()
            int r0 = r0 + r2
            int r2 = r6.getScrollY()
            int r1 = r1 + r2
            android.text.Layout r2 = r6.getLayout()
            if (r1 < 0) goto L_0x0070
            int r3 = r2.getHeight()
            if (r1 <= r3) goto L_0x005b
            goto L_0x0070
        L_0x005b:
            int r1 = r2.getLineForVertical(r1)
            float r0 = (float) r0
            float r3 = r2.getLineLeft(r1)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0070
            float r1 = r2.getLineRight(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
        L_0x0070:
            android.text.Selection.removeSelection(r7)
            boolean r6 = android.text.method.Touch.onTouchEvent(r6, r7, r8)
            return r6
        L_0x0078:
            boolean r6 = super.onTouchEvent(r6, r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.method.LinkMovementMethodCompat.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
