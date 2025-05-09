package tb;

import android.graphics.Paint;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ilt {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792334);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final float a(String str, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5e82c01", new Object[]{this, str, paint})).floatValue();
            }
            ckf.g(paint, "paint");
            if (str == null) {
                return 0.0f;
            }
            return paint.measureText(str);
        }

        public a() {
        }
    }

    static {
        t2o.a(815792333);
    }
}
