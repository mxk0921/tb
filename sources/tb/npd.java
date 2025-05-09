package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface npd extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909648);
        }

        public static void a(npd npdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef1fa061", new Object[]{npdVar});
                return;
            }
            ckf.g(npdVar, "this");
            z5d.a.a(npdVar);
        }

        public static void b(npd npdVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e15c79d", new Object[]{npdVar, iTMSPage});
                return;
            }
            ckf.g(npdVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(npdVar, iTMSPage);
        }

        public static void c(npd npdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99777519", new Object[]{npdVar});
                return;
            }
            ckf.g(npdVar, "this");
            z5d.a.c(npdVar);
        }
    }

    IShareAdapter.b K();

    void l1(IShareAdapter.b bVar);
}
