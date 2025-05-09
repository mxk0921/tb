package tb;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface c8c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766510109);
        }

        public static void b(c8c c8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3f07bb3", new Object[]{c8cVar});
            } else {
                ckf.g(c8cVar, "this");
            }
        }

        public static void c(c8c c8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd20fcbe", new Object[]{c8cVar});
            } else {
                ckf.g(c8cVar, "this");
            }
        }

        public static void d(c8c c8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cca0b02b", new Object[]{c8cVar});
            } else {
                ckf.g(c8cVar, "this");
            }
        }

        public static void e(c8c c8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63cd892", new Object[]{c8cVar});
            } else {
                ckf.g(c8cVar, "this");
            }
        }

        public static void f(c8c c8cVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b53afafd", new Object[]{c8cVar, new Integer(i)});
            } else {
                ckf.g(c8cVar, "this");
            }
        }

        public static int a(c8c c8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2c250e03", new Object[]{c8cVar})).intValue();
            }
            ckf.g(c8cVar, "this");
            return 0;
        }
    }

    void a();

    View b(Context context, Fragment fragment);

    int c();

    void d(int i);

    void e();

    void onDestroyView();

    void onPause();

    void onResume();
}
