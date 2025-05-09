package tb;

import android.text.TextUtils;
import anet.channel.util.HttpUrl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.stat.FullTraceStatistic;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ctf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXCLUDE_BIZ_CODES = "jankContinuous_exclude_biz_codes";
    public static final String KEY_JANK_CHECK_INTERVAL = "jankContinuous_check_interval";
    public static final String KEY_JANK_THRESHOLD = "jankContinuous_threshold";
    public static final String KEY_WHITE_LIST = "jankContinuous_host_whitelist";

    /* renamed from: a  reason: collision with root package name */
    public List<String> f17307a;
    public List<String> b;
    public float c;
    public long d;
    public boolean e;
    public final btf f;
    public final btf g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FullTraceStatistic f17308a;
        public final /* synthetic */ String b;

        public a(FullTraceStatistic fullTraceStatistic, String str) {
            this.f17308a = fullTraceStatistic;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if ("mtop".equals(this.f17308a.reqType)) {
                ctf.a(ctf.this).h(this.b);
                ctf.b(ctf.this).h(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FullTraceStatistic f17309a;
        public final /* synthetic */ String b;

        public b(FullTraceStatistic fullTraceStatistic, String str) {
            this.f17309a = fullTraceStatistic;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f17309a.ret != 0 || ctf.c(ctf.this).contains(this.f17309a.bizErrorCode)) {
                FullTraceStatistic fullTraceStatistic = this.f17309a;
                if (fullTraceStatistic.bizRspCbEnd - fullTraceStatistic.bizReqStart > 3000) {
                    str = "slow";
                } else {
                    str = "normal";
                }
            } else {
                str = "failed";
            }
            String path = HttpUrl.parse(this.f17309a.url).path();
            if (!TextUtils.isEmpty(path)) {
                String[] split = path.split("/");
                if (split.length > 2) {
                    path = split[2];
                }
            } else {
                path = null;
            }
            ctf.a(ctf.this).g(this.b, path, str);
            ctf.b(ctf.this).g(this.b, path, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17310a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public c(String str, String str2, long j) {
            this.f17310a = str;
            this.b = str2;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ctf.a(ctf.this).e(this.f17310a, this.b, this.c);
            ctf.b(ctf.this).e(this.f17310a, this.b, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17311a;
        public final /* synthetic */ long b;

        public d(String str, long j) {
            this.f17311a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ctf.a(ctf.this).f(this.f17311a, this.b);
            ctf.b(ctf.this).f(this.f17311a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ctf.a(ctf.this).c();
            ctf.b(ctf.this).c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ctf.a(ctf.this).d();
            ctf.b(ctf.this).d();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ctf f17314a = new ctf(null);

        public static /* synthetic */ ctf a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ctf) ipChange.ipc$dispatch("61886e47", new Object[0]);
            }
            return f17314a;
        }
    }

    public /* synthetic */ ctf(a aVar) {
        this();
    }

    public static /* synthetic */ btf a(ctf ctfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btf) ipChange.ipc$dispatch("ca71c76b", new Object[]{ctfVar});
        }
        return ctfVar.f;
    }

    public static /* synthetic */ btf b(ctf ctfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btf) ipChange.ipc$dispatch("91a1138a", new Object[]{ctfVar});
        }
        return ctfVar.g;
    }

    public static /* synthetic */ List c(ctf ctfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e01e4343", new Object[]{ctfVar});
        }
        return ctfVar.b;
    }

    public static ctf j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ctf) ipChange.ipc$dispatch("b52b7a21", new Object[0]);
        }
        return g.a();
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccae71fc", new Object[]{this, str});
        } else {
            crt.m(new e());
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e98f7a", new Object[]{this, str});
        } else {
            crt.m(new f());
        }
    }

    public void f(String str, FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7c1ec0", new Object[]{this, str, fullTraceStatistic});
        } else if (this.e && !SceneIdentifier.isAppBackground()) {
            crt.m(new b(fullTraceStatistic, str));
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b692a0a2", new Object[]{this, str, str2});
        } else {
            crt.m(new c(str, str2, System.currentTimeMillis()));
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4ec39e", new Object[]{this, str});
        } else {
            crt.m(new d(str, System.currentTimeMillis()));
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e0c41f6", new Object[]{this});
        }
        try {
            return UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
        } catch (Throwable unused) {
            return null;
        }
    }

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("787ae35e", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3b2ddd8", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29b5a5c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                this.b = arrayList;
            } catch (Throwable unused) {
            }
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e90452e", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                this.f17307a = arrayList;
            } catch (Throwable unused) {
            }
        }
    }

    public void o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9259ca6", new Object[]{this, new Long(j)});
        } else if (j < 0) {
            this.e = false;
        } else {
            this.d = j;
        }
    }

    public void p(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d4c8e4", new Object[]{this, new Float(f2)});
        } else {
            this.c = f2;
        }
    }

    public void q(String str, FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7d19d9", new Object[]{this, str, fullTraceStatistic});
        } else if (this.e && !SceneIdentifier.isAppBackground()) {
            crt.m(new a(fullTraceStatistic, str));
        }
    }

    public ctf() {
        this.f17307a = new ArrayList();
        this.b = new ArrayList();
        this.e = true;
        this.f17307a.add(MtopUnitStrategy.GUIDE_ONLINE_DOMAIN);
        this.f17307a.add(MtopUnitStrategy.TRADE_ONLINE_DOMAIN);
        this.b.add("SUCCESS");
        this.b.add("NO_DATA");
        this.b.add("UserFuqiNotEnoughError");
        this.b.add("WateringTimeLimitError");
        this.b.add("ExceedFrequencyLimit");
        this.b.add("TeamWateringTimeLimitError");
        this.b.add("UserHasNoSeedError");
        this.b.add("FAIL_SYS_SESSION_EXPIRED");
        this.b.add(q5j.TRAFFIC_LIMIT_STATUS);
        this.b.add("FAIL_SYS_FLOWLIMIT");
        this.b.add("FAIL_SYS_USER_VALIDATE");
        this.c = 0.3f;
        this.d = 10L;
        this.f = new btf("Global_MTopReq");
        this.g = new btf("Page_MTopReq");
    }
}
