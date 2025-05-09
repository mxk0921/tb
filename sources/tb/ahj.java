package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.ResultCode;
import com.taobao.alimama.common.NetRetryType;
import com.taobao.alimama.common.TrackType;
import com.taobao.alimama.threads.AdThreadExecutor;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.tp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ahj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Queue<String> f = new ConcurrentLinkedQueue();
    public static final Map<String, wrj> g = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f15738a;
    public final String b;
    public Map<String, String> c;
    public final String d;
    public final boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ahj.a(ahj.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1017118793);
            t2o.a(1018167315);
        }

        public b() {
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            TrackType trackType;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
                return;
            }
            StringBuilder sb = new StringBuilder("type=");
            sb.append(TrackType.IFS.getValue());
            UserTrackLogs.trackAdLog("ifs_request_temp_fail", ahj.b(ahj.this), "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(ahj.d(ahj.this)), sb.toString());
            i4g.a("ifs_request_temp_fail", ahj.b(ahj.this), "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(ahj.d(ahj.this)), "type=" + trackType.getValue());
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            TrackType trackType;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            StringBuilder sb = new StringBuilder("type=");
            sb.append(TrackType.IFS.getValue());
            UserTrackLogs.trackAdLog("ifs_request_fail", ahj.b(ahj.this), "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(ahj.d(ahj.this)), sb.toString());
            i4g.a("ifs_request_fail", ahj.b(ahj.this), "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(ahj.d(ahj.this)), "type=" + trackType.getValue());
            d4g.e().c("Munion_Ifs_Send_Exposure", str, str2, "");
            ahj.g().remove(ahj.f(ahj.this));
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            TrackType trackType;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            StringBuilder sb = new StringBuilder("type=");
            sb.append(TrackType.IFS.getValue());
            UserTrackLogs.trackAdLog("ifs_request_success", ahj.b(ahj.this), "retryType=" + vzo.h(z, ahj.c(ahj.this)), sb.toString());
            i4g.a("ifs_request_success", ahj.b(ahj.this), "ifs=" + Uri.encode(ahj.d(ahj.this)), "retryType=" + vzo.h(z, ahj.c(ahj.this)), "type=" + trackType.getValue());
            d4g.e().d("Munion_Ifs_Send_Exposure", ahj.b(ahj.this));
            xhe.f().j(ahj.e(ahj.this), ahj.f(ahj.this));
            ahj.g().remove(ahj.f(ahj.this));
            if (ahj.h().size() >= 1000) {
                ahj.h().poll();
            }
            ahj.h().offer(ahj.f(ahj.this));
        }

        public /* synthetic */ b(ahj ahjVar, a aVar) {
            this();
        }
    }

    static {
        t2o.a(1017118791);
    }

    public ahj(String str, Map<String, String> map) {
        this.f15738a = str;
        this.c = map;
        this.b = l(str);
        Map<String, String> map2 = this.c;
        if (map2 != null) {
            this.d = map2.get("namespace");
        }
    }

    public static /* synthetic */ void a(ahj ahjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20aff8b3", new Object[]{ahjVar});
        } else {
            ahjVar.i();
        }
    }

    public static /* synthetic */ String b(ahj ahjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("641d374f", new Object[]{ahjVar});
        }
        return ahjVar.j();
    }

    public static /* synthetic */ boolean c(ahj ahjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa39c7d4", new Object[]{ahjVar})).booleanValue();
        }
        return ahjVar.e;
    }

    public static /* synthetic */ String d(ahj ahjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46c05651", new Object[]{ahjVar});
        }
        return ahjVar.f15738a;
    }

    public static /* synthetic */ String e(ahj ahjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3811e5d2", new Object[]{ahjVar});
        }
        return ahjVar.d;
    }

    public static /* synthetic */ String f(ahj ahjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29637553", new Object[]{ahjVar});
        }
        return ahjVar.b;
    }

    public static /* synthetic */ Map g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("211cf3f3", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ Queue h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("9fca7b1f", new Object[0]);
        }
        return f;
    }

    public static String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82bccd6e", new Object[]{str});
        }
        return vzo.o(str);
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b37aab", new Object[]{this});
        } else if (((ConcurrentLinkedQueue) f).contains(this.b)) {
            UserTrackLogs.trackAdLog("ifs_invoke_duplicated", j());
            i4g.a("ifs_invoke_duplicated", j());
        } else {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) g;
            wrj wrjVar = (wrj) concurrentHashMap.get(this.b);
            if (wrjVar != null) {
                if (!wrjVar.a()) {
                    UserTrackLogs.trackAdLog("ifs_request_pending_fail", j());
                }
                i4g.a("ifs_request_pending", j());
                return;
            }
            tp0.a aVar = new tp0.a(this.f15738a, jsj.RETRY_FIVE_TIMES);
            aVar.o(true);
            aVar.p(3);
            aVar.n(20000);
            aVar.q(30000);
            aVar.k(this.c);
            aVar.l(TrackType.IFS.getValue());
            aVar.m(HttpRequest.HEADER_ACCEPT, MunionDeviceUtil.getAccept(Global.getApplication(), null));
            tp0 tp0Var = new tp0(aVar);
            tp0Var.k(new b(this, null));
            wrj c = gsj.a().c(tp0Var);
            if (c != null) {
                concurrentHashMap.put(this.b, c);
            }
        }
    }

    public final String j() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("657166ca", new Object[]{this});
        }
        if (aw4.e(this.f15738a)) {
            str = "1";
        } else {
            str = "0";
        }
        String str2 = "useCache=" + str + ",ifs_hash=" + this.b;
        String c = vzo.c(this.c);
        if (TextUtils.isEmpty(c)) {
            return str2;
        }
        return str2 + "," + c;
    }

    public String k() {
        NetRetryType netRetryType;
        TrackType trackType;
        NetRetryType netRetryType2;
        NetRetryType netRetryType3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2405f36", new Object[]{this});
        }
        try {
            Uri parse = Uri.parse(this.f15738a);
            String queryParameter = parse.getQueryParameter(MspDBHelper.BizEntry.COLUMN_NAME_PID);
            String queryParameter2 = parse.getQueryParameter("mmAdArgs");
            String path = parse.getPath();
            String host = parse.getHost();
            if (this.c == null) {
                this.c = new HashMap();
            }
            if (queryParameter != null) {
                this.c.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, queryParameter);
            }
            if (queryParameter2 != null) {
                this.c.put("mmAdArgs", queryParameter2);
            }
            if (host != null) {
                this.c.put("host", host);
            }
            if (path != null) {
                this.c.put("path", path);
            }
        } catch (Exception e) {
            TaoLog.Loge("NEW_IfsCommitter", "commitEvent fail, and error: " + e.getMessage());
        }
        String j = j();
        StringBuilder sb = new StringBuilder("retryType=");
        if (this.e) {
            netRetryType = NetRetryType.DISK;
        } else {
            netRetryType = NetRetryType.NONE;
        }
        sb.append(netRetryType.getValue());
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("type=");
        sb3.append(TrackType.IFS.getValue());
        UserTrackLogs.trackAdLog("ifs_invoke_success", j, sb2, sb3.toString());
        String j2 = j();
        String str = "ifs=" + Uri.encode(this.f15738a);
        StringBuilder sb4 = new StringBuilder("retryType=");
        if (this.e) {
            netRetryType2 = NetRetryType.DISK;
        } else {
            netRetryType2 = NetRetryType.NONE;
        }
        sb4.append(netRetryType2.getValue());
        i4g.a("ifs_invoke_success", j2, str, sb4.toString(), "type=" + trackType.getValue());
        if (TextUtils.isEmpty(this.f15738a) || TextUtils.isEmpty(this.b)) {
            i4g.a("ifs_invalid_url", "msg=url_is_empty_or_hash_error", j());
            return ResultCode.INVALID_URL.name();
        }
        String host2 = Uri.parse(this.f15738a).getHost();
        if (host2 == null || (!host2.endsWith("tanx.com") && !host2.endsWith("goofish.com"))) {
            i4g.a("ifs_invalid_url", "msg=domain_not_right", j());
            return ResultCode.INVALID_URL.name();
        } else if (xhe.f().g(this.d, this.b)) {
            UserTrackLogs.trackAdLog("ifs_invoke_disk_duplicated", j(), "memory_cnt=" + xhe.f().d());
            i4g.a("ifs_invoke_disk_duplicated", j(), "memory_cnt=" + xhe.f().d());
            return ResultCode.DUPLICATED.name();
        } else if (((ConcurrentLinkedQueue) f).contains(this.b)) {
            UserTrackLogs.trackAdLog("ifs_invoke_duplicated", j());
            i4g.a("ifs_invoke_duplicated", j());
            return ResultCode.DUPLICATED.name();
        } else {
            String j3 = j();
            StringBuilder sb5 = new StringBuilder("retryType=");
            if (this.e) {
                netRetryType3 = NetRetryType.DISK;
            } else {
                netRetryType3 = NetRetryType.NONE;
            }
            sb5.append(netRetryType3.getValue());
            UserTrackLogs.trackAdLog("ifs_invoke_request", j3, sb5.toString(), "type=" + trackType.getValue());
            AdThreadExecutor.execute(new a());
            return ResultCode.COMMITED.name();
        }
    }

    public ahj(String str, Map<String, String> map, boolean z) {
        this(str, map);
        this.e = z;
    }
}
