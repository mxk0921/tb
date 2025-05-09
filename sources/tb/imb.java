package tb;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface imb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(cfx cfxVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void onCancel();

        void onShow();
    }

    ViewGroup a();

    void b(List<IDMComponent> list);

    void c(int i);

    void d();

    TUrlImageView e();

    void f(boolean z);

    void g(b bVar);

    List<IDMComponent> getComponents();

    et6 getDataSource();

    void h(b bVar);

    boolean hasInit();

    RecyclerView i();

    void init();

    boolean isFullScreen();

    boolean isShowing();

    void j(a aVar);

    void k(cfx cfxVar);

    void l(et6 et6Var);

    int m();

    void scrollToTop();
}
