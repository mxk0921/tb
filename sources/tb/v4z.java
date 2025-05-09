package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface v4z {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737152);
        }

        public static int a(v4z v4zVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e062281", new Object[]{v4zVar, new Float(f)})).intValue();
            }
            ckf.g(v4zVar, "this");
            float c = v4zVar.c(f);
            if (Float.isInfinite(c)) {
                return Integer.MAX_VALUE;
            }
            return iai.d(c);
        }

        public static float b(v4z v4zVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b5d4646c", new Object[]{v4zVar, new Float(f)})).floatValue();
            }
            ckf.g(v4zVar, "this");
            return f * v4zVar.b();
        }
    }

    float b();

    float c(float f);

    int f(float f);
}
