package tb;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewHolder;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uh8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vgc f29373a;
    public final RecyclerView b;

    static {
        t2o.a(486539670);
    }

    public uh8(RecyclerView recyclerView, vgc vgcVar) {
        this.b = recyclerView;
        this.f29373a = vgcVar;
    }

    public final boolean a(List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fbb0f9b", new Object[]{this, list})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        return TextUtils.equals(list.get(0).getSectionBizCode(), "error");
    }

    public void b(List<BaseSectionModel> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843dc38f", new Object[]{this, list, new Boolean(z)});
        } else if (a(list)) {
            rgc b = this.f29373a.b("error");
            if (b instanceof x2c) {
                x2c x2cVar = (x2c) b;
                RecycleViewHolder recycleViewHolder = (RecycleViewHolder) this.b.findViewHolderForAdapterPosition(0);
                if (recycleViewHolder != null && recycleViewHolder.b0() != null) {
                    x2cVar.c(z);
                }
            }
        }
    }
}
