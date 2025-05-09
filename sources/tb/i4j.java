package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.request.mtop.DefaultMtopAdapter;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class i4j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BACK_OPERATION_API = "mtop.taobao.afc.refine.operate";
    public static final String BACK_OPERATION_API_VERSION = "1.0";
    public static final int DEFAULT_OUT_TIME = 5;
    public static final String LINK_INFO_API = "mtop.taobao.baichuan.afc.linkinforapidly";
    public static final String LINK_INFO_API_NEW = "mtop.taobao.afc.linkinfo.get";
    public static final String LINK_INFO_API_NEW_VERSION = "2.0";
    public static final String LINK_INFO_API_VERSION = "1.0";
    public static final String LOCAL_ROUTE_REPORT_API = "mtop.taobao.afc.localRoute.report";
    public static final String LOCAL_ROUTE_REPORT_API_VERSION = "1.0";

    /* renamed from: a  reason: collision with root package name */
    public static i4j f21091a;

    static {
        t2o.a(467664964);
    }

    public static synchronized i4j b() {
        synchronized (i4j.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i4j) ipChange.ipc$dispatch("d9b2c9e4", new Object[0]);
            }
            i4j i4jVar = f21091a;
            if (i4jVar != null) {
                return i4jVar;
            }
            try {
                int i = MtopRequest.f15411a;
                f21091a = new DefaultMtopAdapter();
            } catch (ClassNotFoundException unused) {
            }
            return f21091a;
        }
    }

    public static final String c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71169801", new Object[]{str, new Long(j)});
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("&&");
        sb.append(j);
        sb.append("&&_$#%151Safe");
        return AfcUtils.l(sb.toString());
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4071db1", new Object[]{this, map});
            return;
        }
        String str = map.get("appKey");
        if (str == null) {
            str = map.get("appkey");
        }
        long currentTimeMillis = System.currentTimeMillis();
        map.put("t", String.valueOf(currentTimeMillis));
        map.put("requestId", c(str, currentTimeMillis));
    }

    public abstract void d(String str, String str2, Map<String, String> map, boolean z, i6j i6jVar, Handler handler, int i);
}
