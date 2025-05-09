package tb;

import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gb5 implements hub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.hub
    public Map<String, Object> a(String str, String str2) {
        VariationSet activate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c367ff80", new Object[]{this, str, str2});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (activate = UTABTest.activate(str, str2)) != null && (r5 = activate.iterator()) != null) {
            for (Variation variation : activate) {
                hashMap.put(variation.getName(), variation.getValue(null));
            }
        }
        return hashMap;
    }
}
