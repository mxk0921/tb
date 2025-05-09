package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface rgc {
    void bindData(View view, BaseSectionModel<?> baseSectionModel);

    View createView(ViewGroup viewGroup, int i);

    int getViewType(BaseSectionModel<?> baseSectionModel);

    void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i);
}
