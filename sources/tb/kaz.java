package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.LayoutDirection;
import tb.v4z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface kaz extends v4z {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598736938);
        }

        public static int a(kaz kazVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("706789cd", new Object[]{kazVar, new Float(f)})).intValue();
            }
            ckf.g(kazVar, "this");
            return v4z.a.a(kazVar, f);
        }

        public static float b(kaz kazVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7259939c", new Object[]{kazVar, new Float(f)})).floatValue();
            }
            ckf.g(kazVar, "this");
            return v4z.a.b(kazVar, f);
        }
    }

    LayoutDirection getLayoutDirection();
}
