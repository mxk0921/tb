package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface jzw {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(850395160);
        }

        public static void a(jzw jzwVar, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a36e2a9e", new Object[]{jzwVar, motionEvent});
            } else {
                ckf.g(jzwVar, "this");
            }
        }

        public static void b(jzw jzwVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94a8dbee", new Object[]{jzwVar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)});
            } else {
                ckf.g(jzwVar, "this");
            }
        }
    }

    void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);

    void dispatchTouchEvent(MotionEvent motionEvent);
}
