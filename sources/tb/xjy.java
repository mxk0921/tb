package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface xjy extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909562);
        }

        public static void a(xjy xjyVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47ded99e", new Object[]{xjyVar, bbsVar});
                return;
            }
            ckf.g(xjyVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(xjyVar, bbsVar);
        }

        public static void b(xjy xjyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51ea03a9", new Object[]{xjyVar});
                return;
            }
            ckf.g(xjyVar, "this");
            t4c.a.b(xjyVar);
        }
    }

    String getRealUrl();

    void setRealUrl(String str);
}
