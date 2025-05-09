package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface k8c extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909616);
        }

        public static void a(k8c k8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f7678d8", new Object[]{k8cVar});
                return;
            }
            ckf.g(k8cVar, "this");
            z5d.a.a(k8cVar);
        }
    }

    void Z(String str);

    String u();
}
