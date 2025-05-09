package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface x9b extends t4c {
    public static final a Companion = a.$$INSTANCE;
    public static final String TMS_AFC_FLAG = "isAFCColdLaunch";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String TMS_AFC_FLAG = "isAFCColdLaunch";

        static {
            t2o.a(839909549);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909550);
        }

        public static void a(x9b x9bVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f994ac38", new Object[]{x9bVar, bbsVar});
                return;
            }
            ckf.g(x9bVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(x9bVar, bbsVar);
        }

        public static void b(x9b x9bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfea543", new Object[]{x9bVar});
                return;
            }
            ckf.g(x9bVar, "this");
            t4c.a.b(x9bVar);
        }
    }
}
