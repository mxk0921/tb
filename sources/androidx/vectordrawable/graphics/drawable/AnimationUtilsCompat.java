package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AnimationUtilsCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private AnimationUtilsCompat() {
    }

    public static Interpolator loadInterpolator(Context context, int i) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("500616a4", new Object[]{context, new Integer(i)});
        }
        return AnimationUtils.loadInterpolator(context, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.view.animation.Interpolator createInterpolatorFromXml(android.content.Context r7, android.content.res.Resources r8, android.content.res.Resources.Theme r9, org.xmlpull.v1.XmlPullParser r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 3
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "fc911ab1"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r7
            r5[r2] = r8
            r5[r1] = r9
            r5[r0] = r10
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            android.view.animation.Interpolator r7 = (android.view.animation.Interpolator) r7
            return r7
        L_0x001f:
            int r8 = r10.getDepth()
            r9 = 0
        L_0x0024:
            int r3 = r10.next()
            if (r3 != r0) goto L_0x0030
            int r4 = r10.getDepth()
            if (r4 <= r8) goto L_0x00e6
        L_0x0030:
            if (r3 == r2) goto L_0x00e6
            if (r3 == r1) goto L_0x0035
            goto L_0x0024
        L_0x0035:
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r10)
            java.lang.String r3 = r10.getName()
            java.lang.String r4 = "linearInterpolator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x004c
            android.view.animation.LinearInterpolator r9 = new android.view.animation.LinearInterpolator
            r9.<init>()
            goto L_0x0024
        L_0x004c:
            java.lang.String r4 = "accelerateInterpolator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x005b
            android.view.animation.AccelerateInterpolator r3 = new android.view.animation.AccelerateInterpolator
            r3.<init>(r7, r9)
        L_0x0059:
            r9 = r3
            goto L_0x0024
        L_0x005b:
            java.lang.String r4 = "decelerateInterpolator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0069
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>(r7, r9)
            goto L_0x0059
        L_0x0069:
            java.lang.String r4 = "accelerateDecelerateInterpolator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0077
            android.view.animation.AccelerateDecelerateInterpolator r9 = new android.view.animation.AccelerateDecelerateInterpolator
            r9.<init>()
            goto L_0x0024
        L_0x0077:
            java.lang.String r4 = "cycleInterpolator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0085
            android.view.animation.CycleInterpolator r3 = new android.view.animation.CycleInterpolator
            r3.<init>(r7, r9)
            goto L_0x0059
        L_0x0085:
            java.lang.String r4 = "anticipateInterpolator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0093
            android.view.animation.AnticipateInterpolator r3 = new android.view.animation.AnticipateInterpolator
            r3.<init>(r7, r9)
            goto L_0x0059
        L_0x0093:
            java.lang.String r4 = "overshootInterpolator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00a2
            android.view.animation.OvershootInterpolator r3 = new android.view.animation.OvershootInterpolator
            r3.<init>(r7, r9)
            goto L_0x0059
        L_0x00a2:
            java.lang.String r4 = "anticipateOvershootInterpolator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00b0
            android.view.animation.AnticipateOvershootInterpolator r3 = new android.view.animation.AnticipateOvershootInterpolator
            r3.<init>(r7, r9)
            goto L_0x0059
        L_0x00b0:
            java.lang.String r4 = "bounceInterpolator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00bf
            android.view.animation.BounceInterpolator r9 = new android.view.animation.BounceInterpolator
            r9.<init>()
            goto L_0x0024
        L_0x00bf:
            java.lang.String r4 = "pathInterpolator"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ce
            androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat r3 = new androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat
            r3.<init>(r7, r9, r10)
            goto L_0x0059
        L_0x00ce:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unknown interpolator name: "
            r8.<init>(r9)
            java.lang.String r9 = r10.getName()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x00e6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.createInterpolatorFromXml(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser):android.view.animation.Interpolator");
    }
}
