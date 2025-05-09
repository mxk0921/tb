package tb;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.ptr.views.recycler.accessories.FixedViewAdapter;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mvy extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465763);
    }

    public static /* synthetic */ Object ipc$super(mvy mvyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/ScrollComponentV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "7074635219724537701";
    }

    public final List<IDMComponent> J(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f8f6c301", new Object[]{this, recyclerView});
        }
        if ((recyclerView.getAdapter() instanceof FixedViewAdapter) && (((FixedViewAdapter) recyclerView.getAdapter()).N() instanceof RecyclerViewAdapter)) {
            return ((RecyclerViewAdapter) ((FixedViewAdapter) recyclerView.getAdapter()).N()).getData();
        }
        hav.g("ScrollComponentV2Subscriber", "getComponentsList", "invalid recyclerView");
        return null;
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        JSONObject fields;
        RecyclerView Z;
        LinearLayoutManager linearLayoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        o5e n = b8vVar.n();
        if (n instanceof a) {
            Object f = b8vVar.f();
            if ((f instanceof DMEvent) && (fields = ((DMEvent) f).getFields()) != null) {
                String string = fields.getString("targetPosition");
                if (!TextUtils.isEmpty(string)) {
                    IDMComponent d = b8vVar.d();
                    if (d instanceof DMComponent) {
                        String key = d.getKey();
                        if (!(TextUtils.isEmpty(key) || (Z = ((a) n).G().Z()) == null || (linearLayoutManager = (LinearLayoutManager) Z.getLayoutManager()) == null)) {
                            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                            List<IDMComponent> J = J(Z);
                            if (J != null && J.size() > findLastVisibleItemPosition) {
                                for (int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                                    if (key.equals(J.get(findFirstVisibleItemPosition).getKey())) {
                                        if ("top".equals(string)) {
                                            linearLayoutManager.scrollToPositionWithOffset(findFirstVisibleItemPosition, 0);
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
