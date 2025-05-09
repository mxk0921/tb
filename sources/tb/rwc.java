package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface rwc {
    void a();

    void b();

    void c();

    View d(Context context, JSONObject jSONObject);

    void destroy();

    void e(int i);

    void f(IMultiTabPerformanceListener iMultiTabPerformanceListener);

    String getContainerType();

    String getTabBarButtonShowState();

    void onPause();

    void onPullRefresh();

    void onResume();

    void onStart();

    void onStop();
}
