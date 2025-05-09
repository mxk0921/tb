package tb;

import android.graphics.Bitmap;
import android.view.View;
import com.taobao.android.weex.WeexExternalEventCheckException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface q6x {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(Bitmap bitmap, int i, int i2, double d, double d2, double d3, double d4);
    }

    void a();

    void b(int i, int i2);

    void c(hde hdeVar);

    void d();

    void dispatchExternalEvent(l5x l5xVar) throws WeexExternalEventCheckException;

    void e();

    xid f();

    @Deprecated
    HashMap<String, String> g();

    View getRenderView();

    void h(a aVar);

    void i(String str, Map<String, Object> map, b bVar);

    void j(boolean z);

    @Deprecated
    HashMap<String, String> k();

    void offScreenRendering();

    void onScreenRendering();

    void registerReportInfoListener(ade adeVar);

    void scrollToDecelerate(int i);

    void setGestureConsumptionView(View view);

    void setGestureEventListener(pce pceVar);

    void setGestureStateListener(w6a w6aVar);

    void setScrollEnabled(boolean z);

    void setWeexScrollListener(dde ddeVar);

    void updateViewport();
}
