package tb;

import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \t2\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Ltb/kj9;", "Ltb/d7c;", "", "pageName", MspDBHelper.BizEntry.COLUMN_NAME_PID, "url", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class kj9 implements d7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final HashMap<String, d7c> f = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final String f22700a;
    public final qwl b;
    public long c;
    public boolean d;
    public final boolean e = rbl.Companion.c();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R8\u0010\u0006\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltb/kj9$a;", "", "Ljava/util/HashMap;", "", "Ltb/d7c;", "Lkotlin/collections/HashMap;", "instanceMap", "Ljava/util/HashMap;", "taobao_rate_sdk_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(758120539);
        }

        public a() {
        }

        @JvmStatic
        public final kj9 a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kj9) ipChange.ipc$dispatch("1ef0692f", new Object[]{this, str, str2, str3, str4});
            }
            ckf.g(str, "pageName");
            ckf.g(str2, MspDBHelper.BizEntry.COLUMN_NAME_PID);
            ckf.g(str3, "url");
            ckf.g(str4, "name");
            kj9 kj9Var = new kj9(str, str2, str3, str4);
            kj9.f().put(kj9Var.i(), kj9Var);
            return kj9Var;
        }

        @JvmStatic
        public final kj9 b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kj9) ipChange.ipc$dispatch("a1251d83", new Object[]{this});
            }
            kj9 a2 = a("RatePublishPage", vgn.PID, "http://taobao.com/jstracker/ratePublish.html", "RatePublishFirstFrameTrackManager");
            a2.l(rbl.Companion.d());
            return a2;
        }

        @JvmStatic
        public final d7c c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d7c) ipChange.ipc$dispatch("b6b42a7d", new Object[]{this, str});
            }
            if (kj9.f().containsKey(str)) {
                return (d7c) kj9.f().get(str);
            }
            return null;
        }

        @JvmStatic
        public final void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee70b29e", new Object[]{this, str});
                return;
            }
            ckf.g(str, "id");
            kj9.f().remove(str);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(758120538);
        t2o.a(758120540);
    }

    public kj9(String str, String str2, String str3, String str4) {
        ckf.g(str, "pageName");
        ckf.g(str2, MspDBHelper.BizEntry.COLUMN_NAME_PID);
        ckf.g(str3, "url");
        ckf.g(str4, "name");
        this.f22700a = "";
        this.b = new qwl(str, str2, str3).o(str4);
        String uuid = UUID.randomUUID().toString();
        ckf.f(uuid, "UUID.randomUUID().toString()");
        this.f22700a = uuid;
    }

    public static final /* synthetic */ HashMap f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e29a598a", new Object[0]);
        }
        return f;
    }

    @JvmStatic
    public static final kj9 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kj9) ipChange.ipc$dispatch("a1251d83", new Object[0]);
        }
        return Companion.b();
    }

    @JvmStatic
    public static final d7c j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d7c) ipChange.ipc$dispatch("b6b42a7d", new Object[]{str});
        }
        return Companion.c(str);
    }

    @JvmStatic
    public static final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee70b29e", new Object[]{str});
        } else {
            Companion.d(str);
        }
    }

    @Override // tb.d7c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d84f8f8", new Object[]{this});
        } else if (!this.d && this.e) {
            qwl qwlVar = this.b;
            if (qwlVar != null) {
                tcu.s(qwlVar);
            }
            this.d = true;
        }
    }

    @Override // tb.d7c
    public void b(Map<String, String> map) {
        qwl qwlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1cc9ef", new Object[]{this, map});
        } else if (map != null && (qwlVar = this.b) != null) {
            qwlVar.l(map);
        }
    }

    @Override // tb.d7c
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79659dae", new Object[]{this, str});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        g(str, System.currentTimeMillis() - this.c);
    }

    @Override // tb.d7c
    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ee9b84", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    @Override // tb.d7c
    public void e(String str) {
        qwl qwlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4a0fd0", new Object[]{this, str});
            return;
        }
        ckf.g(str, "msg");
        if (this.e && (qwlVar = this.b) != null) {
            qwlVar.g(str);
        }
    }

    public void g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34e8ed6", new Object[]{this, str, new Long(j)});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        if (this.e && j >= 0 && !this.d) {
            qwl qwlVar = this.b;
            if (qwlVar != null) {
                qwlVar.j(str, j);
            }
            m(str, j);
        }
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.f22700a;
    }

    public void l(float f2) {
        qwl qwlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4f07ed", new Object[]{this, new Float(f2)});
        } else if (this.e && (qwlVar = this.b) != null) {
            qwlVar.h(f2);
        }
    }

    public final void m(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0766e7", new Object[]{this, str, new Long(j)});
        } else if (!TextUtils.isEmpty(str)) {
            String[] e = vhn.e(new HashMap(vhn.sCommonArgs));
            if (e == null) {
                pd0.e().a("rate_performance", 2201, "rate_cost", str, String.valueOf(j), new String[0]);
            } else {
                pd0.e().a("rate_performance", 2201, "rate_cost", str, String.valueOf(j), (String[]) Arrays.copyOf(e, e.length));
            }
        }
    }
}
