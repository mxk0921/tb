package tb;

import android.net.Uri;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.ResultCode;
import com.taobao.alimama.click.interact.InteractRequest;
import com.taobao.alimama.click.interact.InteractResponse;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rff {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Queue<String> i = new ConcurrentLinkedQueue();
    public static final List<String> j = new Vector();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f27341a;
    public final Map<String, String> b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public String g;
    public String h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f27342a;

        static {
            t2o.a(1017118767);
            t2o.a(1018167315);
        }

        public b() {
            this.f27342a = SystemClock.uptimeMillis();
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
                return;
            }
            rff.d().remove(rff.c(rff.this));
            UserTrackLogs.trackAdLog("interact_request_temp_fail", "error_code=" + str, "error_msg=" + str2, "url=" + Uri.encode(rff.e(rff.this)), rff.a(rff.this));
            i4g.a("interact_request_temp_fail", "error_code=" + str, "error_msg=" + str2, "url=" + Uri.encode(rff.e(rff.this)), rff.a(rff.this));
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            rff.d().remove(rff.c(rff.this));
            UserTrackLogs.trackAdLog("interact_request_fail", "error_code=" + str, "error_msg=" + str2, "url=" + Uri.encode(rff.e(rff.this)), rff.a(rff.this));
            i4g.a("interact_request_fail", "error_code=" + str, "error_msg=" + str2, "url=" + Uri.encode(rff.e(rff.this)), rff.a(rff.this));
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            try {
                InteractResponse interactResponse = (InteractResponse) obj;
                if (!(interactResponse == null || interactResponse.getData() == null)) {
                    String str2 = interactResponse.getData().result;
                    String str3 = "";
                    if (vzo.l(str2)) {
                        try {
                            String str4 = "redirecturl=" + URLEncoder.encode(str2, "UTF-8");
                            StringBuilder sb = new StringBuilder();
                            sb.append(str4);
                            sb.append(",rttime=" + String.valueOf(SystemClock.uptimeMillis() - this.f27342a));
                            str3 = sb.toString();
                        } catch (UnsupportedEncodingException e) {
                            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
                        }
                    }
                    UserTrackLogs.trackAdLog("interact_request_success", rff.a(rff.this), str3);
                    i4g.a("interact_request_success", rff.a(rff.this), str3);
                    if (rff.b().size() >= 1000) {
                        rff.b().poll();
                    }
                    rff.b().offer(rff.c(rff.this));
                    rff.d().remove(rff.c(rff.this));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    static {
        t2o.a(1017118765);
    }

    public rff(String str, Map<String, String> map, Map<String, String> map2) {
        this.c = str;
        this.f27341a = map;
        this.b = map2;
    }

    public static /* synthetic */ String a(rff rffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("800b1b5", new Object[]{rffVar});
        }
        return rffVar.h;
    }

    public static /* synthetic */ Queue b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("e2a0e399", new Object[0]);
        }
        return i;
    }

    public static /* synthetic */ String c(rff rffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99daeb7", new Object[]{rffVar});
        }
        return rffVar.f;
    }

    public static /* synthetic */ List d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6ee5f86c", new Object[0]);
        }
        return j;
    }

    public static /* synthetic */ String e(rff rffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3aabb9", new Object[]{rffVar});
        }
        return rffVar.c;
    }

    public static InteractRequest f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractRequest) ipChange.ipc$dispatch("2af5a2ea", new Object[]{str, str2});
        }
        InteractRequest interactRequest = new InteractRequest();
        interactRequest.cna = "";
        interactRequest.e = str;
        interactRequest.ext = "";
        interactRequest.referer = "";
        interactRequest.utdid = MunionDeviceUtil.getUtdid();
        interactRequest.accept = MunionDeviceUtil.getAccept("");
        interactRequest.useragent = MunionDeviceUtil.getUserAgent();
        interactRequest.API_NAME = str2;
        return interactRequest;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2405f36", new Object[]{this});
        }
        if (!h()) {
            UserTrackLogs.trackAdLog("interact_invoke_verify_fail", vzo.c(this.f27341a));
            return ResultCode.INVALID_URL.name();
        }
        Map<String, String> map = this.b;
        if (map != null && !map.isEmpty()) {
            this.c = n0j.b(this.c, this.b);
        }
        String o = vzo.o(this.c);
        this.f = o;
        this.f27341a.put("url_hash", o);
        String c = vzo.c(this.f27341a);
        this.h = c;
        UserTrackLogs.trackAdLog("interact_invoke_success", c);
        i4g.a("interact_invoke_success", this.h);
        if (this.e) {
            if (((Vector) j).contains(this.f)) {
                UserTrackLogs.trackAdLog("interact_invoke_disk_duplicated", this.h);
                i4g.a("interact_invoke_disk_duplicated", this.h);
                return ResultCode.DUPLICATED.name();
            } else if (xhe.f().g(this.g, this.f)) {
                UserTrackLogs.trackAdLog("interact_invoke_disk_duplicated", this.h);
                i4g.a("interact_invoke_disk_duplicated", this.h);
                return ResultCode.DUPLICATED.name();
            } else if (((ConcurrentLinkedQueue) i).contains(this.f)) {
                UserTrackLogs.trackAdLog("interact_invoke_duplicated", this.h);
                i4g.a("interact_invoke_duplicated", this.h);
                return ResultCode.DUPLICATED.name();
            }
        }
        InteractRequest f = f(this.c, this.d);
        UserTrackLogs.trackAdLog("interact_invoke_request_success", this.h);
        i4g.a("interact_invoke_request_success", this.h);
        o6j o6jVar = new o6j(null, jsj.RETRY_FIVE_TIMES, f, InteractResponse.class);
        o6jVar.k(new b());
        gsj.a().c(o6jVar);
        ((Vector) j).add(this.f);
        return ResultCode.COMMITED.name();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rff.h():boolean");
    }
}
