package tb;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.weex.performance.CartWeexPerformance;
import com.taobao.android.megadesign.view.LoadingView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface j2e {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151012);
        }

        public static /* synthetic */ void a(j2e j2eVar, String str, JSONObject jSONObject, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89b413c5", new Object[]{j2eVar, str, jSONObject, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                j2eVar.f(str, jSONObject);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchEvent");
            }
        }
    }

    void a();

    void b(String str, String str2, JSONObject jSONObject);

    boolean c();

    void d(Activity activity);

    void destroy();

    boolean e();

    void f(String str, JSONObject jSONObject);

    void g();

    Activity getActivity();

    String getInstanceId();

    LoadingView getLoadingView();

    ViewGroup getRootView();

    CartWeexPerformance h();

    BaseICartFragmentProxy i();

    boolean j();

    void k(BaseICartFragmentProxy baseICartFragmentProxy);

    boolean l();

    void m();

    String name();

    void onActivityResult(int i, int i2, Intent intent);

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
