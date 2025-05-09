package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final fix f17854a;

    static {
        t2o.a(487588009);
    }

    public dix(fix fixVar) {
        this.f17854a = fixVar;
    }

    public final void a(boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd3c2bd", new Object[]{this, new Boolean(z), str});
            return;
        }
        jrg.e(fdv.F_DATA_PROCESS, "WindvaneRequestPolicy", "shouldHappen addRequestPolicyMonitor  needRequest: " + z + "reason" + str);
        if (z) {
            str2 = "windvane_request_need";
        } else {
            str2 = "windvane_request_not_need";
        }
        if (str == null) {
            str = "";
        }
        edv.b("windvane_request_filter", "1.0", str2, "", str);
    }

    public final void b(boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b75bebf", new Object[]{this, new Boolean(z), str});
            return;
        }
        jrg.e(fdv.F_DATA_PROCESS, "WindvaneRequestPolicy", "shouldHappen addRequestPolicyMonitorFail needRequest: " + z + "reason" + str);
        if (z) {
            str2 = "windvane_request_need";
        } else {
            str2 = "windvane_request_not_need";
        }
        if (str == null) {
            str = "";
        }
        edv.a("windvane_request_filter", "1.0", str2, "-999", str, null, null);
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe941aa", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.f17854a.a());
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c2a48aa", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.f17854a.b());
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b40e80f", new Object[]{this})).booleanValue();
        }
        return o78.p(rj7.a());
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb7e146", new Object[]{this})).booleanValue();
        }
        return o78.s(rj7.a());
    }

    public final boolean g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b99a4bab", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int indexOf = this.f17854a.e().indexOf(this.f17854a.b());
        List<SectionModel> d = this.f17854a.d();
        if (d == null) {
            return false;
        }
        SectionModel sectionModel = null;
        SectionModel sectionModel2 = null;
        for (int i2 = 1; i2 <= i; i2++) {
            int i3 = indexOf - i2;
            if (i3 >= 0) {
                sectionModel = d.get(i3);
            }
            int i4 = indexOf + i2;
            if (i4 <= d.size() - 1) {
                sectionModel2 = d.get(i4);
            }
            if (nex.a(sectionModel) || nex.a(sectionModel2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65c44d0f", new Object[]{this})).booleanValue();
        }
        int indexOf = this.f17854a.e().indexOf(this.f17854a.b());
        if (indexOf > 0 && this.f17854a.c().contains(this.f17854a.e().get(indexOf - 1))) {
            return true;
        }
        if (indexOf >= this.f17854a.e().size() - 1 || !this.f17854a.c().contains(this.f17854a.e().get(indexOf + 1))) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6688279c", new Object[]{this})).booleanValue();
        }
        if (this.f17854a.f() <= 0 || this.f17854a.g() <= 0 || System.currentTimeMillis() > this.f17854a.g() + this.f17854a.f()) {
            return true;
        }
        return false;
    }

    public boolean j(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c122306f", new Object[]{this, new Boolean(z), new Integer(i)})).booleanValue();
        }
        if (!d()) {
            a(false, "no item key");
            return false;
        } else if (!c()) {
            a(false, "no item id");
            return false;
        } else if (!i()) {
            a(false, "windvane not expired");
            return false;
        } else if (!f() && !e()) {
            a(false, "not main edition");
            return false;
        } else if (this.f17854a.c().contains(this.f17854a.b())) {
            b(false, "current exposed");
            return false;
        } else if (z && i > 0 && g(i)) {
            return false;
        } else {
            if (h()) {
                b(false, "next or prev exposed");
                return false;
            }
            a(true, "");
            return true;
        }
    }
}
