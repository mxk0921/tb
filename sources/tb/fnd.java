package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface fnd extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909645);
        }

        public static void a(fnd fndVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5621c234", new Object[]{fndVar});
                return;
            }
            ckf.g(fndVar, "this");
            z5d.a.a(fndVar);
        }

        public static void b(fnd fndVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("677b6fee", new Object[]{fndVar, iTMSPage});
                return;
            }
            ckf.g(fndVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(fndVar, iTMSPage);
        }

        public static void c(fnd fndVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("878a207c", new Object[]{fndVar});
                return;
            }
            ckf.g(fndVar, "this");
            z5d.a.c(fndVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(Bitmap bitmap);
    }

    void E(b bVar);
}
