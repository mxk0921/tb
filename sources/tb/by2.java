package tb;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class by2 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296874);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean b(int i, CameraCharacteristics cameraCharacteristics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7130fae9", new Object[]{this, new Integer(i), cameraCharacteristics})).booleanValue();
            }
            ckf.g(cameraCharacteristics, "cameraCharacteristics");
            int[] iArr = {2, 0, 1, 3};
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null && i == num.intValue()) {
                return true;
            }
            int i2 = 0;
            while (i2 < 4) {
                int i3 = iArr[i2];
                i2++;
                if (i == i3) {
                    return true;
                }
                if (num != null && num.intValue() == i3) {
                    break;
                }
            }
            return false;
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8880869", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public a() {
        }

        public final boolean a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1c51743f", new Object[]{this, context})).booleanValue();
            }
            ckf.g(context, "context");
            return eno.b(context, "openCamera2Failed", false);
        }

        public final void c(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f1c8178", new Object[]{this, context, str});
                return;
            }
            ckf.g(context, "context");
            ckf.g(str, "errorMsg");
            eno.e(context, "openCamera2Failed", true);
            mzu.n(p73.f25916a, "markOpenCamera2Failed", 19999, "errorMsg", str);
        }
    }

    static {
        t2o.a(481296873);
    }
}
