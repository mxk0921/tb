package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.ActivateWidget;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ji3 extends ActivateWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793161);
    }

    public ji3(Activity activity, ude udeVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, searchDoorContext, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(ji3 ji3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/ChannelActivateWidget");
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.ActivateWidget
    public void E2(List<ActivateTypedBean> list, ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17aaa43d", new Object[]{this, list, ja0Var});
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.ActivateWidget
    public void K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef45156", new Object[]{this});
        } else if (!o4p.h0()) {
            Q2(this.b.g(), this.b.v(), this.b.z());
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    @Override // com.taobao.search.searchdoor.sf.widgets.activate.ActivateWidget
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        if (this.b.B()) {
            this.b.N(true);
            onHistoryUpdated(this.g.o());
        } else {
            this.b.N(false);
        }
        if (getView() != 0) {
            getView().setVisibility(0);
        }
    }
}
