package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.utils.DeviceUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class at4 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601407);
        }

        public a() {
        }

        public static /* synthetic */ int c(a aVar, Context context, Number number, boolean z, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("75150e80", new Object[]{aVar, context, number, new Boolean(z), new Integer(i), obj})).intValue();
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return aVar.b(context, number, z);
        }

        public static /* synthetic */ int e(a aVar, Context context, Number number, boolean z, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("58d9b0ec", new Object[]{aVar, context, number, new Boolean(z), new Integer(i), obj})).intValue();
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return aVar.d(context, number, z);
        }

        public final int a(Context context, Number number) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ccbf3ab9", new Object[]{this, context, number})).intValue();
            }
            ckf.g(context, "context");
            ckf.g(number, "value");
            return (int) ((number.floatValue() / r6o.Companion.b(context)) + 0.5f);
        }

        public final int b(Context context, Number number, boolean z) {
            float h;
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7cf68594", new Object[]{this, context, number, new Boolean(z)})).intValue();
            }
            ckf.g(context, "context");
            ckf.g(number, "value");
            float floatValue = number.floatValue();
            DeviceUtil.Companion companion = DeviceUtil.Companion;
            if (!companion.g() || !z) {
                h = floatValue * r6o.Companion.h(context);
                f = 750.0f;
            } else {
                h = floatValue * r6o.Companion.b(context) * companion.b(context);
                f = 2.0f;
            }
            return (int) Math.ceil(h / f);
        }

        public final int d(Context context, Number number, boolean z) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6c332da8", new Object[]{this, context, number, new Boolean(z)})).intValue();
            }
            ckf.g(context, "context");
            ckf.g(number, "value");
            float floatValue = number.floatValue();
            if (z) {
                f = ngq.a(context);
            } else {
                f = r6o.Companion.b(context);
            }
            return (int) Math.ceil(floatValue * f);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601406);
    }
}
