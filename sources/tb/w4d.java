package tb;

import android.view.View;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import tb.x28;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface w4d {
    public static final int EVENT_ID = 19999;
    public static final String PAGE_NAME = "Page_Home";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
    }

    void a();

    void b(View view, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, a aVar, View view2, x28.f fVar);

    void c(String str, View view);

    void hideOverlay();
}
