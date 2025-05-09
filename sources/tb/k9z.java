package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface k9z extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909560);
        }

        public static void a(k9z k9zVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4b3afe0", new Object[]{k9zVar, bbsVar});
                return;
            }
            ckf.g(k9zVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(k9zVar, bbsVar);
        }

        public static void b(k9z k9zVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8d45bab", new Object[]{k9zVar});
                return;
            }
            ckf.g(k9zVar, "this");
            t4c.a.b(k9zVar);
        }
    }

    void handleAdUrl(String str);
}
