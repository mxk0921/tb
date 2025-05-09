package com.taobao.message.sp.category.transformer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Transformer;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UpdateDownloadProgressTransformer implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "updateProgress";

    static {
        t2o.a(550502421);
        t2o.a(537919673);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        if (!NAME.equals(action.getName()) || action.getData() == null) {
            return sharedState;
        }
        HashMap hashMap = new HashMap();
        Map map = (Map) action.getData();
        boolean z = ValueUtil.getBoolean(map, "complete");
        int integer = ValueUtil.getInteger(map, "progress");
        if (z) {
            hashMap.put("title", DisplayUtil.localizedString(R.string.mp_message));
        } else {
            hashMap.put("title", DisplayUtil.localizedString(R.string.mp_the_full_version_is_being) + integer + f7l.MOD);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("headView", hashMap);
        return sharedState.updateRuntimeData(hashMap2);
    }
}
