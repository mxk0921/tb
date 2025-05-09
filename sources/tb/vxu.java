package tb;

import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<UMDimKey, Object> CONTAINER_DIM_MAP;
    public static final Map<UMTagKey, String> CONTAINER_TAG_MAP;

    /* renamed from: a  reason: collision with root package name */
    public static final UMLinkLogInterface f30325a = hdv.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopRequest f30326a;

        public a(MtopRequest mtopRequest) {
            this.f30326a = mtopRequest;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                UnifyLog.d("UltronMtopRequest", this.f30326a.toString(), new Object[0]);
            } catch (Throwable th) {
                com.taobao.android.ultron.common.utils.UnifyLog.e("UMLLUtils", "logMtopReq", th.getMessage());
            }
        }
    }

    public static /* synthetic */ String a(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("142507c", new Object[]{mtopRequest});
        }
        return g(mtopRequest);
    }

    public static /* synthetic */ UMLinkLogInterface b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMLinkLogInterface) ipChange.ipc$dispatch("57d35e3b", new Object[0]);
        }
        return f30325a;
    }

    public static void c(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac904302", new Object[]{mtopRequest});
        } else {
            d(null, mtopRequest);
        }
    }

    public static void d(fsb fsbVar, MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54dde148", new Object[]{fsbVar, mtopRequest});
        } else if (mtopRequest != null) {
            pav.k(new a(mtopRequest));
        }
    }

    public static void e(fsb fsbVar, MtopResponse mtopResponse, MtopRequest mtopRequest, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("790bd4f9", new Object[]{fsbVar, mtopResponse, mtopRequest, new Boolean(z), map});
        } else if (fsbVar != null && mtopResponse != null) {
            pav.k(new b(fsbVar, mtopResponse, mtopRequest, map, z));
        }
    }

    public static void f(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce5d57a", new Object[]{str, str2, str3, str4, map, str5, str6});
            return;
        }
        try {
            f30325a.commitFailure(str, str2, "1.0", str3, str4, map, str5, str6);
        } catch (Throwable th) {
            com.taobao.android.ultron.common.utils.UnifyLog.e("UMLLUtils", "logError", th.getMessage());
        }
    }

    public static String g(MtopRequest mtopRequest) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcee6c46", new Object[]{mtopRequest});
        }
        if (mtopRequest == null || (map = mtopRequest.dataParams) == null || map.isEmpty()) {
            return "";
        }
        return JSON.toJSONString(map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fsb f30327a;
        public final /* synthetic */ MtopResponse b;
        public final /* synthetic */ MtopRequest c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ boolean e;

        public b(fsb fsbVar, MtopResponse mtopResponse, MtopRequest mtopRequest, Map map, boolean z) {
            this.f30327a = fsbVar;
            this.b = mtopResponse;
            this.c = mtopRequest;
            this.d = map;
            this.e = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0110 A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:6:0x001b, B:8:0x0043, B:11:0x004a, B:32:0x00fd, B:33:0x010c, B:35:0x0110, B:37:0x011b, B:39:0x0122, B:41:0x0126, B:42:0x012a, B:43:0x0138, B:45:0x0152, B:47:0x0159, B:49:0x015d, B:50:0x0161), top: B:55:0x001b }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0138 A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:6:0x001b, B:8:0x0043, B:11:0x004a, B:32:0x00fd, B:33:0x010c, B:35:0x0110, B:37:0x011b, B:39:0x0122, B:41:0x0126, B:42:0x012a, B:43:0x0138, B:45:0x0152, B:47:0x0159, B:49:0x015d, B:50:0x0161), top: B:55:0x001b }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 394
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.vxu.b.run():void");
        }
    }

    static {
        t2o.a(83886316);
        HashMap hashMap = new HashMap(1);
        CONTAINER_TAG_MAP = hashMap;
        HashMap hashMap2 = new HashMap(1);
        CONTAINER_DIM_MAP = hashMap2;
        hashMap.put(UMTagKey.TAG_1, "ultron_container");
        hashMap2.put(UMDimKey.TAG_1, "ultron_container");
    }
}
