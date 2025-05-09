package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.m;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import java.util.Map;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface i2c extends krb, t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(846200834);
        }

        public static void a(i2c i2cVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dfe80a1", new Object[]{i2cVar, bbsVar});
                return;
            }
            ckf.g(i2cVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(i2cVar, bbsVar);
        }

        public static void b(i2c i2cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c434fbe", new Object[]{i2cVar});
                return;
            }
            ckf.g(i2cVar, "this");
            t4c.a.b(i2cVar);
        }
    }

    void M(Map<String, Long> map, TMSRumTarget tMSRumTarget);

    void S(Map<String, ? extends Object> map, TMSRumTarget tMSRumTarget);

    void T(m mVar);

    m V();
}
