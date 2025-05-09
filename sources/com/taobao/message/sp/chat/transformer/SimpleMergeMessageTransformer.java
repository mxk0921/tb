package com.taobao.message.sp.chat.transformer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.ItemState;
import com.taobao.message.lab.comfrm.inner2.MergeTransformer;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.observable.RuntimeIncUpdateMap;
import com.taobao.message.sp.framework.model.SimpleMsgCode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleMergeMessageTransformer implements MergeTransformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(551551005);
        t2o.a(537919631);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.MergeTransformer
    public SharedState transform(Action action, SharedState sharedState, List<ItemState> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("f1ca3b8b", new Object[]{this, action, sharedState, list});
        }
        if (!StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
            return sharedState;
        }
        RuntimeIncUpdateMap copy = RuntimeIncUpdateMap.copy((RuntimeIncUpdateMap) sharedState.getRuntimeData("messageViewDataMap", RuntimeIncUpdateMap.class, new RuntimeIncUpdateMap(0)));
        for (ItemState itemState : list) {
            copy.put(((SimpleMsgCode) itemState.getIndex()).getClientId(), (String) ((Map) itemState.getData("messageViewData", Map.class, new HashMap())));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("messageViewDataMap", copy);
        return sharedState.updateRuntimeData(hashMap);
    }
}
