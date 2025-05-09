package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.MetaListPresenter;
import com.taobao.android.searchbaseframe.meta.list.BaseMetaListAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class iox extends MetaListPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993002086);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iox(bsi bsiVar) {
        super(bsiVar);
        ckf.g(bsiVar, "metaConfig");
    }

    public static /* synthetic */ Object ipc$super(iox ioxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/refact/XslListPresenter");
    }

    @Override // com.taobao.android.meta.structure.list.MetaListPresenter, tb.xw1
    public void T0() {
        BaseMetaListAdapter baseMetaListAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f412b3", new Object[]{this});
            return;
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter instanceof BaseMetaListAdapter) {
            baseMetaListAdapter = (BaseMetaListAdapter) adapter;
        } else {
            baseMetaListAdapter = null;
        }
        if (baseMetaListAdapter != null) {
            baseMetaListAdapter.p0();
        }
    }
}
