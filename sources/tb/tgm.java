package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.pop.PopData;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static IPopData<PopSectionModel> a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopData) ipChange.ipc$dispatch("d6f3a100", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        try {
            return (IPopData) JSON.parseObject(JSON.toJSONString(obj), PopData.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
