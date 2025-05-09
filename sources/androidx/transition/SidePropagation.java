package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SidePropagation extends VisibilityPropagation {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mPropagationSpeed = 3.0f;
    private int mSide = 80;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
        r4 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
        if (androidx.core.view.ViewCompat.getLayoutDirection(r7) == 1) goto L_0x006e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
        if (androidx.core.view.ViewCompat.getLayoutDirection(r7) == 1) goto L_0x006c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int distance(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            r0 = 5
            r1 = 3
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.transition.SidePropagation.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x005f
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r8)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r9)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r10)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r11)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r13)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r14)
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r15)
            r15 = 10
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r3] = r6
            r15[r2] = r7
            r7 = 2
            r15[r7] = r5
            r15[r1] = r8
            r7 = 4
            r15[r7] = r9
            r15[r0] = r10
            r7 = 6
            r15[r7] = r11
            r7 = 7
            r15[r7] = r12
            r7 = 8
            r15[r7] = r13
            r7 = 9
            r15[r7] = r14
            java.lang.String r7 = "4550ccc9"
            java.lang.Object r7 = r4.ipc$dispatch(r7, r15)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            return r7
        L_0x005f:
            int r4 = r6.mSide
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 != r5) goto L_0x0070
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            if (r7 != r2) goto L_0x006e
        L_0x006c:
            r4 = 5
            goto L_0x007c
        L_0x006e:
            r4 = 3
            goto L_0x007c
        L_0x0070:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r4 != r5) goto L_0x007c
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            if (r7 != r2) goto L_0x006c
            goto L_0x006e
        L_0x007c:
            if (r4 == r1) goto L_0x00a4
            if (r4 == r0) goto L_0x009b
            r7 = 48
            if (r4 == r7) goto L_0x0092
            r7 = 80
            if (r4 == r7) goto L_0x0089
            goto L_0x00ac
        L_0x0089:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L_0x00ac
        L_0x0092:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L_0x00ac
        L_0x009b:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L_0x00ac
        L_0x00a4:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L_0x00ac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.SidePropagation.distance(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int getMaxDistance(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1de1d17c", new Object[]{this, viewGroup})).intValue();
        }
        int i = this.mSide;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }

    public static /* synthetic */ Object ipc$super(SidePropagation sidePropagation, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/SidePropagation");
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        int i2;
        int i3;
        TransitionValues transitionValues3 = transitionValues;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("680cfbbf", new Object[]{this, viewGroup, transition, transitionValues3, transitionValues2})).longValue();
        }
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null || getViewVisibility(transitionValues3) == 0) {
            i = -1;
        } else {
            transitionValues3 = transitionValues2;
            i = 1;
        }
        int viewX = getViewX(transitionValues3);
        int viewY = getViewY(transitionValues3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (epicenter != null) {
            int centerX = epicenter.centerX();
            int centerY = epicenter.centerY();
            i3 = centerX;
            i2 = centerY;
        } else {
            i3 = (round + width) / 2;
            i2 = (round2 + height) / 2;
        }
        float distance = distance(viewGroup, viewX, viewY, i3, i2, round, round2, width, height) / getMaxDistance(viewGroup);
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i)) / this.mPropagationSpeed) * distance);
    }

    public void setPropagationSpeed(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d447dc", new Object[]{this, new Float(f)});
        } else if (f != 0.0f) {
            this.mPropagationSpeed = f;
        } else {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
    }

    public void setSide(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eabe9223", new Object[]{this, new Integer(i)});
        } else {
            this.mSide = i;
        }
    }
}
