package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface kic extends jic {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536600);
        }

        public static /* synthetic */ void a(kic kicVar, String str, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca65d8c9", new Object[]{kicVar, str, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                kicVar.unsubscribe(str);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unsubscribe");
            }
        }
    }

    void unsubscribe(String str);
}
