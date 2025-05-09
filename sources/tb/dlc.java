package tb;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.taobao.live.home.base.RecyclerArrayAdapter;
import com.taobao.live.home.business.BaseListRequest;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface dlc {
    ax1 a();

    int b();

    RecyclerView.LayoutManager c(Context context, RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter);

    BaseListRequest createRequest();

    int d();

    void e(List<IMTOPDataObject> list);

    RecyclerView.ItemDecoration f();

    RecyclerArrayAdapter<IMTOPDataObject> g();

    int h();

    boolean i(RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter);

    void onPageError(String str);
}
