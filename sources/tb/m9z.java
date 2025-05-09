package tb;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface m9z {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737363);
        }

        public static n9z a(m9z m9zVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n9z) ipChange.ipc$dispatch("95491265", new Object[]{m9zVar});
            }
            ckf.g(m9zVar, "this");
            return null;
        }
    }

    n9z a();

    kdb b();

    AbilityHubAdapter e();
}
