package tb;

import android.view.View;
import android.view.ViewGroup;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface dbd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void onSuccess(List<IPopData> list);
    }

    void a(ViewGroup viewGroup, View view, int i);

    void b();

    View c(View view, int i, IPopData iPopData);

    View d(ViewGroup viewGroup, IPopData iPopData, e3b e3bVar);

    View e(View view, long j);

    View f(View view, String str, IPopData iPopData);

    boolean g(View view, IPopData iPopData);

    void h(e3b e3bVar, List<IPopData> list, a aVar);

    void onAppToBackground();
}
