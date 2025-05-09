package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface mfz {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737397);
        }

        public static float a(mfz mfzVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aa6aa581", new Object[]{mfzVar, obj})).floatValue();
            }
            ckf.g(mfzVar, "this");
            ckf.g(obj, bmi.KEY_RECEIVER);
            return n5z.g(mfzVar.a(obj));
        }

        public static float b(mfz mfzVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8ef3d08a", new Object[]{mfzVar, obj})).floatValue();
            }
            ckf.g(mfzVar, "this");
            ckf.g(obj, bmi.KEY_RECEIVER);
            if (obj instanceof Number) {
                return ((Number) obj).floatValue();
            }
            if (obj instanceof tyu) {
                return ((tyu) obj).m0() & 65535;
            }
            if (obj instanceof fwu) {
                return (float) uiv.d(((fwu) obj).o0());
            }
            if (obj instanceof kwu) {
                return (float) uiv.h(((kwu) obj).o0());
            }
            if (obj instanceof tru) {
                return ((tru) obj).m0() & 255;
            }
            return Float.NaN;
        }
    }

    float a(Object obj);
}
