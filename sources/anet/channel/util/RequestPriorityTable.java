package anet.channel.util;

import anet.channel.request.Request;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import java.util.HashMap;
import java.util.Map;
import tb.pg1;
import tb.ryp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RequestPriorityTable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, Integer> extPriorityMap;

    public static int lookup(Request request) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4172f533", new Object[]{request})).intValue();
        }
        if (request == null) {
            throw new NullPointerException("url is null!");
        } else if (request.getHeaders().containsKey("x-pv")) {
            return 1;
        } else {
            String trySolveFileExtFromUrlPath = HttpHelper.trySolveFileExtFromUrlPath(request.getHttpUrl().path());
            if (trySolveFileExtFromUrlPath == null || (num = extPriorityMap.get(trySolveFileExtFromUrlPath)) == null) {
                return 6;
            }
            return num.intValue();
        }
    }

    static {
        t2o.a(607125955);
        HashMap hashMap = new HashMap();
        extPriorityMap = hashMap;
        hashMap.put("tpatch", 3);
        extPriorityMap.put("so", 3);
        extPriorityMap.put("json", 3);
        extPriorityMap.put("html", 4);
        extPriorityMap.put("htm", 4);
        extPriorityMap.put("css", 5);
        extPriorityMap.put("js", 5);
        extPriorityMap.put("webp", 6);
        extPriorityMap.put("png", 6);
        extPriorityMap.put(ryp.FILE_TYPE_IMAGE_JPG, 6);
        extPriorityMap.put(pg1.ATOM_do, 6);
        extPriorityMap.put(WeexZipModule.NAME, Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        extPriorityMap.put("bin", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        extPriorityMap.put("apk", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
    }
}
