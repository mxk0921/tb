package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbicontext.ThreadMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface qfr {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(803209253);
        }

        public static ThreadMode a(qfr qfrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThreadMode) ipChange.ipc$dispatch("ab9b8400", new Object[]{qfrVar});
            }
            return ThreadMode.DefaultThread;
        }
    }

    ThreadMode a();

    void onEvent(String str, Object obj);
}
