package mtopsdk.mtop.upload.util;

import anetwork.channel.Header;
import anetwork.channel.Param;
import anetwork.channel.entity.BasicHeader;
import anetwork.channel.entity.StringParam;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class NetworkUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.NetworkUtil";

    static {
        t2o.a(595591200);
    }

    public static List<Header> createHttpHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c6f512b", new Object[]{map});
        }
        if (map == null || map.size() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null && StringUtils.isNotBlank(entry.getKey())) {
                arrayList.add(new BasicHeader(entry.getKey(), entry.getValue()));
            }
        }
        return arrayList;
    }

    public static List<Param> createHttpParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bf2dc233", new Object[]{map});
        }
        if (map == null || map.size() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new StringParam(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
