package com.taobao.message.lab.comfrm.support.dinamic;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.weex.common.Constants;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CommonRecyclerRefreshHandler extends BaseDXRecyclerRefreshHanlder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919773);
    }

    public static /* synthetic */ Object ipc$super(CommonRecyclerRefreshHandler commonRecyclerRefreshHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/dinamic/CommonRecyclerRefreshHandler");
    }

    @Override // com.taobao.message.lab.comfrm.support.dinamic.BaseDXRecyclerRefreshHanlder
    public DeltaItem getDeltaItem(Map<String, Object> map, Diff diff, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeltaItem) ipChange.ipc$dispatch("3dddeae8", new Object[]{this, map, diff, map2});
        }
        if (map2 == null) {
            return null;
        }
        String string = ValueUtil.getString(map2, "zone", null);
        String string2 = ValueUtil.getString(map2, "instance", null);
        String string3 = ValueUtil.getString(map2, "dataListKey", null);
        if ("runtime".equals(string)) {
            return diff.getRuntimeDiff(string2, string3);
        }
        if (Constants.Value.ORIGINAL.equals(string)) {
            return diff.getOriginalDiff(string2, string3);
        }
        return null;
    }
}
