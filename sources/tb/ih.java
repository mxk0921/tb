package tb;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.component.lifeCycle.createItem")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ih extends ms implements kcb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GLOBAL_DATA_CREATED_ITEMS = "global_data_created_items";
    public static final String TAG = "AURACreateItemEventTriggerExtension";
    public lo f;
    public AURAGlobalData g;

    static {
        t2o.a(81789007);
        t2o.a(80740550);
    }

    public static /* synthetic */ Object ipc$super(ih ihVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1162528052:
                super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
                return null;
            case -25033014:
                super.onCreate((lo) objArr[0], (yi) objArr[1]);
                return null;
            case 1111077198:
                super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/common/render/lifecycle/AURACreateItemEventTriggerExtension");
        }
    }

    @Override // tb.kcb
    public void E(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df0d417", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else if (aURARenderComponent != null) {
            P0(aURARenderComponent);
        }
    }

    @Override // tb.kcb
    public void N(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3c8047", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        }
    }

    public final void P0(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a186e745", new Object[]{this, aURARenderComponent});
            return;
        }
        String str = aURARenderComponent.key;
        if (!TextUtils.isEmpty(str)) {
            List<String> Q0 = Q0();
            if (Q0 == null) {
                ck.g().b(TAG, "createItemIfNeeded", "mItemCreatedKeys创建失败");
            } else if (!Q0.contains(str) && (aURARenderComponentData = aURARenderComponent.data) != null) {
                Map<String, List<Event>> map = aURARenderComponentData.events;
                if (!bh.b(map)) {
                    List<Event> list = map.get("createItem");
                    if (!bh.a(list)) {
                        for (Event event : list) {
                            qi qiVar = new qi();
                            qiVar.n(event.getFields());
                            qiVar.t(aURARenderComponent);
                            qiVar.o(event.getTag());
                            pi.b(this.f.c(), event.getType(), qiVar);
                        }
                        Q0.add(aURARenderComponent.key);
                    }
                }
            }
        }
    }

    public final List<String> Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3248b7f2", new Object[]{this});
        }
        List<String> list = (List) this.g.get(GLOBAL_DATA_CREATED_ITEMS, List.class);
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    @Override // tb.ms, tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, cgVar);
        if (pm.RENDER_SERVICE_CODE.equals(cgVar.b())) {
            this.g.update(GLOBAL_DATA_CREATED_ITEMS, Q0());
        }
    }

    @Override // tb.ms, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.f = loVar;
    }

    @Override // tb.ms, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.g = aURAGlobalData;
    }

    @Override // tb.ms, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
