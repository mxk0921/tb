package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.taobao.android.dressup.base.infoflow.IDressUpHostService;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface g1c extends sod, f1c {
    IDressUpHostService getDressHostService();

    List<ISubService> getInfoFlowHostServices();

    void setRecyclerView(RecyclerView recyclerView);
}
