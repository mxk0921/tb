package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.threads.AdThreadExecutor;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.utils.Global;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.tp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class os0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Queue<String> f25606a = new ConcurrentLinkedQueue();
    public static final Map<String, wrj> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25607a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Map f;

        public a(String str, String str2, String str3, boolean z, String str4, Map map) {
            this.f25607a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
            this.f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                os0.a(os0.this, this.f25607a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f25608a;
        public final String b;
        public final String c;

        static {
            t2o.a(1020264476);
            t2o.a(1018167315);
        }

        public b(String str, String str2) {
            this.f25608a = str;
            this.b = "url=" + Uri.encode(str2);
            this.c = "url_hash=" + str;
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("ud_committer_request_tmp_fail", this.b, this.c, "error_code=" + str, "error_msg=" + str2);
            i4g.a("ud_committer_request_tmp_fail", this.b, this.c, "error_code=" + str, "error_msg=" + str2);
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("ud_committer_request_fail", this.b, this.c, "error_code=" + str, "error_msg=" + str2);
            i4g.a("ud_committer_request_fail", this.b, this.c, "error_code=" + str, "error_msg=" + str2);
            os0.b().remove(this.f25608a);
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            UserTrackLogs.trackAdLog("ud_committer_request_success", this.b, this.c);
            i4g.a("ud_committer_request_success", this.b, this.c);
            os0.b().remove(this.f25608a);
            if (os0.c().size() >= 1000) {
                os0.c().poll();
            }
            os0.c().offer(this.f25608a);
        }
    }

    static {
        t2o.a(1020264474);
    }

    public static /* synthetic */ void a(os0 os0Var, String str, String str2, String str3, boolean z, String str4, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d13795b", new Object[]{os0Var, str, str2, str3, new Boolean(z), str4, map});
        } else {
            os0Var.d(str, str2, str3, z, str4, map);
        }
    }

    public static /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Queue c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("e2a0e399", new Object[0]);
        }
        return f25606a;
    }

    public void e(String str, String str2, String str3, boolean z, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75580fe0", new Object[]{this, str, str2, str3, new Boolean(z), str4, map});
        } else {
            AdThreadExecutor.execute(new a(str, str2, str3, z, str4, map));
        }
    }

    public final void d(String str, String str2, String str3, boolean z, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07b7830", new Object[]{this, str, str2, str3, new Boolean(z), str4, map});
            return;
        }
        Uri.Builder buildUpon = Uri.parse("https://ef-dongfeng.tanx.com/ud-sdk-monitor").buildUpon();
        String str5 = "0";
        if (TextUtils.isEmpty(str3)) {
            str3 = str5;
        }
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("itemid", str3);
        if (TextUtils.isEmpty(str2)) {
            str2 = str5;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("sellerid", str2);
        if (z) {
            str5 = "1";
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("ismall", str5).appendQueryParameter("url", Uri.encode(str)).appendQueryParameter("clickid", yov.c(str, "clickid")).appendQueryParameter("utdid", l2.a(MunionDeviceUtil.getUtdid(Global.getApplication()))).appendQueryParameter(wll.ALI_TRACK_ID, str4);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                appendQueryParameter3.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        String uri = appendQueryParameter3.build().toString();
        String o = vzo.o(str);
        String str6 = "url=" + Uri.encode(str);
        String str7 = "url_hash=" + o;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(o)) {
            i4g.a("ud_committer_invalid_url", "msg=url_is_empty_or_hash_error", str6, str7);
        } else if (((ConcurrentLinkedQueue) f25606a).contains(o)) {
            UserTrackLogs.trackAdLog("ud_committer_request_duplicated", str6, str7);
            i4g.a("ud_committer_request_duplicated", str6, str7);
        } else {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) b;
            wrj wrjVar = (wrj) concurrentHashMap.get(o);
            if (wrjVar != null) {
                wrjVar.a();
                i4g.a("ud_committer_request_pending_retry_now", str6, str7);
                return;
            }
            UserTrackLogs.trackAdLog("ud_committer_request", str6, str7);
            i4g.a("ud_committer_request", str6, str7);
            tp0.a aVar = new tp0.a(uri, jsj.RETRY_FIVE_TIMES);
            aVar.o(true);
            aVar.p(3);
            aVar.n(20000);
            aVar.q(30000);
            aVar.m(HttpRequest.HEADER_ACCEPT, MunionDeviceUtil.getAccept(Global.getApplication(), null));
            tp0 tp0Var = new tp0(aVar);
            tp0Var.k(new b(o, str));
            concurrentHashMap.put(o, gsj.a().c(tp0Var));
        }
    }
}
