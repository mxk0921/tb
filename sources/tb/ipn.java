package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent;
import com.taobao.tao.flexbox.layoutmanager.core.b;
import com.taobao.tao.flexbox.layoutmanager.core.e;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ipn extends b.b0<TNodeRecyclerView, ListViewComponent.l> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316927);
    }

    public static /* synthetic */ Object ipc$super(ipn ipnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/list/RecordAttributeHandler");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.b
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* renamed from: m */
    public void c(e eVar, TNodeRecyclerView tNodeRecyclerView, ListViewComponent.l lVar, n.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c35ba0af", new Object[]{this, eVar, tNodeRecyclerView, lVar, fVar});
        } else if (eVar instanceof ListViewComponent) {
            o((ListViewComponent) eVar);
        }
    }

    public void o(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff9569e", new Object[]{this, listViewComponent});
        } else if (listViewComponent != null && listViewComponent.P1() != null) {
            try {
                for (Map.Entry<String, String> entry : n(listViewComponent.getNode()).entrySet()) {
                    listViewComponent.P1().putExtra(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                tfs.e("RecordAttributeHandler", "updateExtra error" + th.getMessage());
            }
        }
    }

    public final Map<String, String> n(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("346ab7d3", new Object[]{this, nVar});
        }
        HashMap hashMap = new HashMap();
        String I = nwv.I(nVar.H(vhd.KEY_RECORD_EXTRA), null);
        if (!TextUtils.isEmpty(I)) {
            for (String str : I.split(";")) {
                String[] split = str.split(":");
                if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }
}
