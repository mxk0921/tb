package tb;

import android.content.Context;
import android.view.View;
import com.taobao.android.weex.WeexExternalEventCheckException;
import com.taobao.android.weex.WeexInstanceImpl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface xid {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(boolean z, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
    }

    String A();

    void B(Context context, WeexInstanceImpl weexInstanceImpl);

    void C();

    void D();

    HashMap<String, String> F(int i);

    void a();

    void b(int i, int i2);

    void c(hde hdeVar);

    void d();

    void dispatchExternalEvent(l5x l5xVar) throws WeexExternalEventCheckException;

    void e();

    void f();

    HashMap<String, String> g(int i);

    void h(float f, float f2);

    void i();

    int j();

    void l();

    void m(String str, Object obj);

    void o(b bVar);

    View onCreateView();

    void onDestroyView();

    void onDetach();

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void onViewAppear();

    void onViewDisappear();

    int p();

    Map<String, String> q(int i);

    void r(HashMap<String, String> hashMap);

    void s();

    void t(ide ideVar);

    void u();

    void updateViewport();

    void v();

    void w(boolean z, w6a w6aVar, a aVar);

    void x();

    void y(hde hdeVar);
}
