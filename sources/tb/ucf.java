package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ucf extends ocf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321865);
    }

    public ucf(cxj cxjVar, dh7 dh7Var, DetailDataManager detailDataManager, List<sxj> list) {
        super(cxjVar, dh7Var, detailDataManager, list);
    }

    public static /* synthetic */ Object ipc$super(ucf ucfVar, String str, Object... objArr) {
        if (str.hashCode() == -567691052) {
            super.b((VerticalAbsViewHolder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/instancelistener/listview/InstanceTppListViewManagerListener");
    }

    @Override // tb.ocf, com.taobao.android.detail2.core.framework.view.manager.ListViewManager.h
    public void b(VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de29b8d4", new Object[]{this, verticalAbsViewHolder});
        } else {
            super.b(verticalAbsViewHolder);
        }
    }
}
