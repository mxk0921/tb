package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface wpd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509634);
        }

        public static void a(wpd wpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a82ac34", new Object[]{wpdVar});
            } else {
                ckf.g(wpdVar, "this");
            }
        }

        public static void b(wpd wpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27e5549", new Object[]{wpdVar});
            } else {
                ckf.g(wpdVar, "this");
            }
        }

        public static boolean e(wpd wpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("909417c", new Object[]{wpdVar})).booleanValue();
            }
            ckf.g(wpdVar, "this");
            return wpdVar.a();
        }

        public static void f(wpd wpdVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adc1f332", new Object[]{wpdVar, new Float(f)});
            } else {
                ckf.g(wpdVar, "this");
            }
        }

        public static void c(wpd wpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9b23085", new Object[]{wpdVar});
                return;
            }
            ckf.g(wpdVar, "this");
            wpdVar.g(true);
        }

        public static void d(wpd wpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b13b46ac", new Object[]{wpdVar});
                return;
            }
            ckf.g(wpdVar, "this");
            wpdVar.g(false);
        }
    }

    boolean a();

    void destroyView();

    void g(boolean z);

    View getContentView();

    void h(float f);

    boolean i();

    void j();

    void k();

    void onPause();

    void onResume();
}
