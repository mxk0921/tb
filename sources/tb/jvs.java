package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.random.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jvs {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1003487254);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6de04218", new Object[]{this});
            }
            String str = "" + ju6.a();
            int i = 0;
            while (true) {
                str = str + "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(Random.Default.nextInt(0, 35));
                if (i == 10) {
                    return str;
                }
                i++;
            }
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45ee8900", new Object[]{this})).booleanValue();
            }
            String appKey = mhr.t().getAppKey();
            if (ckf.b("21380790", appKey) || ckf.b("21646297", appKey)) {
                return true;
            }
            return false;
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487253);
    }
}
