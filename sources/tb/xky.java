package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface xky extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909642);
        }

        public static void a(xky xkyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("364ef57b", new Object[]{xkyVar});
                return;
            }
            ckf.g(xkyVar, "this");
            z5d.a.a(xkyVar);
        }

        public static void b(xky xkyVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f84ca37", new Object[]{xkyVar, iTMSPage});
                return;
            }
            ckf.g(xkyVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(xkyVar, iTMSPage);
        }

        public static void c(xky xkyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92bdae33", new Object[]{xkyVar});
                return;
            }
            ckf.g(xkyVar, "this");
            z5d.a.c(xkyVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(String str);
    }

    void b();

    void c(b bVar);
}
