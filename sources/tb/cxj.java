package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cxj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAV_TOKEN = "NewDetailToken";

    /* renamed from: a  reason: collision with root package name */
    public final a f17413a;
    public final bxj c;
    public vxj d;
    public String e;
    public String i;
    public String j;
    public String k;
    public final zgq b = new zgq("NewDetail");
    public long f = -1;
    public boolean g = false;
    public long h = -2147483648L;
    public boolean l = false;

    static {
        t2o.a(352321588);
    }

    public cxj(bxj bxjVar, Intent intent) {
        this.c = bxjVar;
        a f = f(intent);
        this.f17413a = f;
        if (f == null) {
            o2r.a("createNewDetailFeedsConfig");
            this.f17413a = new a(this, intent);
            o2r.b();
            txj.e(txj.TAG_RENDER, "初始化没有拿到nav阶段预加载好的feedsconfig");
            return;
        }
        f.P0(this);
        txj.e(txj.TAG_RENDER, "初始化拿到nav阶段预加载好的feedsconfig");
    }

    public void A(vxj vxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d753bd6f", new Object[]{this, vxjVar});
        } else {
            this.d = vxjVar;
        }
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d5af81", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39aae8a", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eac9ee5", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e3fede", new Object[]{this});
        } else {
            this.i = "";
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8fa9a7", new Object[]{this});
        } else {
            this.k = "";
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72394", new Object[]{this});
        } else {
            this.j = "";
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beab31cc", new Object[]{this})).booleanValue();
        }
        txj.a(txj.TAG_INSIDE_DETAIL, "mLastInsideTagTime currentIsInsideDetailForTag mLastInsideTagTime = " + this.f);
        if (this.f <= 0 || System.currentTimeMillis() - this.f >= 10000) {
            return false;
        }
        return true;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6573092b", new Object[]{this})).booleanValue();
        }
        if (this.g || d()) {
            return true;
        }
        return false;
    }

    public final a f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6c0df502", new Object[]{this, intent});
        }
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra(NAV_TOKEN);
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        return ygj.a(stringExtra);
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b46f4368", new Object[]{this});
        }
        String str = this.e;
        return str != null ? str : "|animCtxAndMsgIsNull";
    }

    public bxj h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bxj) ipChange.ipc$dispatch("5064cac3", new Object[]{this});
        }
        return this.c;
    }

    public Activity i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("616f3928", new Object[]{this});
        }
        return this.c.getNewDetailContext();
    }

    public a j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        return this.f17413a;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6094ecb0", new Object[]{this})).longValue();
        }
        return this.h;
    }

    public vxj l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vxj) ipChange.ipc$dispatch("b3d739c5", new Object[]{this});
        }
        return this.d;
    }

    public byj m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byj) ipChange.ipc$dispatch("75ad75a4", new Object[]{this});
        }
        return this.f17413a.N();
    }

    public zgq n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zgq) ipChange.ipc$dispatch("9e929994", new Object[]{this});
        }
        return this.b;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d36c595", new Object[]{this});
        }
        return this.i;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e62be76c", new Object[]{this});
        }
        return this.k;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e982519", new Object[]{this});
        }
        return this.j;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbaf1a83", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.l = true;
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd84c60", new Object[]{this});
        } else {
            this.g = false;
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81946015", new Object[]{this});
        } else {
            this.f = -1L;
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            this.l = false;
        }
    }

    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4ae50e", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d8183e", new Object[]{this});
        } else {
            this.g = true;
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa0caf3", new Object[]{this});
        } else {
            this.f = System.currentTimeMillis();
        }
    }

    public void z(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83906fc", new Object[]{this, new Long(j)});
        } else {
            this.h = j;
        }
    }
}
