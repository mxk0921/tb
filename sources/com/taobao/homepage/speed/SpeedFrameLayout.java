package com.taobao.homepage.speed;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SpeedFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AtomicBoolean isFirstLayout = new AtomicBoolean(true);

    static {
        t2o.a(729809105);
    }

    public SpeedFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(SpeedFrameLayout speedFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/speed/SpeedFrameLayout");
    }

    public SpeedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpeedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.homepage.speed.SpeedFrameLayout.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x003b
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r5)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r8)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r9)
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r1] = r4
            r9[r0] = r3
            r0 = 2
            r9[r0] = r5
            r5 = 3
            r9[r5] = r6
            r5 = 4
            r9[r5] = r7
            r5 = 5
            r9[r5] = r8
            java.lang.String r5 = "f167cda4"
            r2.ipc$dispatch(r5, r9)
            return
        L_0x003b:
            super.onLayout(r5, r6, r7, r8, r9)     // Catch: all -> 0x003f
            goto L_0x004e
        L_0x003f:
            r5 = move-exception
            java.lang.String r6 = "SpeedFrameLayout"
            java.lang.String r7 = "onLayout"
            tb.bqa.b(r6, r7, r5)
            boolean r6 = com.taobao.android.behavix.utils.Debuggable.isDebug()
            if (r6 != 0) goto L_0x0074
        L_0x004e:
            java.util.concurrent.atomic.AtomicBoolean r5 = com.taobao.homepage.speed.SpeedFrameLayout.isFirstLayout
            boolean r5 = r5.compareAndSet(r0, r1)
            if (r5 == 0) goto L_0x0073
            tb.f0b r5 = tb.f0b.i()
            java.lang.String r6 = "homeViewLayout"
            r5.c(r6)
            tb.f0b r5 = tb.f0b.i()
            java.lang.String r6 = "homeRenderFinish"
            r5.l(r6)
            tb.f0b r5 = tb.f0b.i()
            java.lang.String r6 = "Home_Render"
            r5.f(r6)
        L_0x0073:
            return
        L_0x0074:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.speed.SpeedFrameLayout.onLayout(boolean, int, int, int, int):void");
    }

    public SpeedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
