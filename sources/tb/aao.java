package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class aao {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(714080280);
    }

    public static String a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("299b86e6", new Object[]{mtopResponse});
        }
        String[] ret = mtopResponse.getRet();
        if (ret.length < 1) {
            return null;
        }
        String str = ret[0];
        if (StringUtils.isNotBlank(str)) {
            String[] split = str.split("::");
            if (split.length > 1) {
                return split[1];
            }
        }
        return null;
    }
}
