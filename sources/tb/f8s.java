package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.ut.device.UTDevice;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class f8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f8s INSTANCE = new f8s();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Integer> f19107a = new ConcurrentHashMap<>();

    static {
        t2o.a(839909957);
    }

    public final int a(Context context, String str) {
        double abs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85087523", new Object[]{this, context, str})).intValue();
        }
        ckf.g(context, "context");
        ckf.g(str, "bucketName");
        ConcurrentHashMap<String, Integer> concurrentHashMap = f19107a;
        Integer num = concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        String utdid = UTDevice.getUtdid(context);
        if (utdid == null || utdid.length() == 0) {
            return -1;
        }
        if (q9s.a0()) {
            abs = Math.abs((ckf.p(utdid, str).hashCode() % 49993) % 100);
        } else {
            abs = Math.abs((utdid.hashCode() % 49993) % 100);
        }
        int i = (int) abs;
        concurrentHashMap.put(str, Integer.valueOf(i));
        TMSLogger.b("TMSBucket", "bucketName: " + str + " BucketId: " + i);
        return i;
    }
}
