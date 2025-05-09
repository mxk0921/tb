package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final eix f17090a;

    static {
        t2o.a(729809230);
    }

    public cix(eix eixVar) {
        this.f17090a = eixVar;
    }

    public final void a(boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd3c2bd", new Object[]{this, new Boolean(z), str});
            return;
        }
        hrg.e(fdv.F_DATA_PROCESS, "WindvaneRequestPolicy", "shouldHappen addRequestPolicyMonitor  needRequest: " + z + "reason" + str);
        if (z) {
            str2 = "windvane_request_need";
        } else {
            str2 = "windvane_request_not_need";
        }
        if (str == null) {
            str = "";
        }
        ddv.j("windvane_request_filter", "1.0", str2, "", str);
    }

    public final void b(boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b75bebf", new Object[]{this, new Boolean(z), str});
            return;
        }
        hrg.e(fdv.F_DATA_PROCESS, "WindvaneRequestPolicy", "shouldHappen addRequestPolicyMonitorFail needRequest: " + z + "reason" + str);
        if (z) {
            str2 = "windvane_request_need";
        } else {
            str2 = "windvane_request_not_need";
        }
        if (str == null) {
            str = "";
        }
        ddv.i("windvane_request_filter", "1.0", str2, "-999", str, null, null);
    }

    public final String d(AwesomeGetContainerData awesomeGetContainerData, String str) {
        IContainerInnerDataModel<SectionModel> base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbebd09c", new Object[]{this, awesomeGetContainerData, str});
        }
        if (awesomeGetContainerData == null || (base = awesomeGetContainerData.getBase()) == null || (ext = base.getExt()) == null || !ext.containsKey(str)) {
            return null;
        }
        return ext.getString(str);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe941aa", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.f17090a.a());
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c2a48aa", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.f17090a.b());
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b40e80f", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(i2b.HOMEPAGE_HTAO, b3b.c());
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb7e146", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("main", b3b.c());
    }

    public final boolean i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b99a4bab", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int indexOf = this.f17090a.f().indexOf(this.f17090a.b());
        List<SectionModel> e = this.f17090a.e();
        if (e == null) {
            return false;
        }
        SectionModel sectionModel = null;
        SectionModel sectionModel2 = null;
        for (int i2 = 1; i2 <= i; i2++) {
            int i3 = indexOf - i2;
            if (i3 >= 0) {
                sectionModel = e.get(i3);
            }
            int i4 = indexOf + i2;
            if (i4 <= e.size() - 1) {
                sectionModel2 = e.get(i4);
            }
            if (nex.a(sectionModel) || nex.a(sectionModel2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65c44d0f", new Object[]{this})).booleanValue();
        }
        int indexOf = this.f17090a.f().indexOf(this.f17090a.b());
        if (indexOf > 0 && this.f17090a.c().contains(this.f17090a.f().get(indexOf - 1))) {
            return true;
        }
        if (indexOf >= this.f17090a.f().size() - 1 || !this.f17090a.c().contains(this.f17090a.f().get(indexOf + 1))) {
            return false;
        }
        return true;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6688279c", new Object[]{this})).booleanValue();
        }
        if (this.f17090a.g() <= 0 || this.f17090a.h() <= 0 || System.currentTimeMillis() > this.f17090a.h() + this.f17090a.g()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2738a665", new Object[]{this})).booleanValue();
        }
        eix eixVar = this.f17090a;
        if (eixVar == null) {
            hrg.e(fdv.F_DATA_PROCESS, "WindvaneRequestPolicy", "scene is null");
            return true;
        }
        String d = eixVar.d();
        if (TextUtils.isEmpty(d)) {
            hrg.e(fdv.F_DATA_PROCESS, "WindvaneRequestPolicy", "containerId is empty");
            return true;
        } else if (zza.d(d) == null) {
            return true;
        } else {
            String d2 = d(zza.d(d).u(d), "wvNeighborCardEnable");
            hrg.e(fdv.F_DATA_PROCESS, "WindvaneRequestPolicy", "containerId：" + d + ", value : " + d2);
            return d2 == null || !Boolean.parseBoolean(d2);
        }
    }

    public boolean l(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c122306f", new Object[]{this, new Boolean(z), new Integer(i)})).booleanValue();
        }
        if (!f()) {
            a(false, "no item key");
            fve.e("WindvaneRequestPolicy", "shouldHappen !isCurrentItemKeyValid return false");
            return false;
        } else if (!e()) {
            a(false, "no item id");
            fve.e("WindvaneRequestPolicy", "shouldHappen !isCurrentItemIdValid return false");
            return false;
        } else if (!k()) {
            a(false, "windvane not expired");
            fve.e("WindvaneRequestPolicy", "shouldHappen !isWindvaneExpired return false");
            return false;
        } else if (!h() && !g()) {
            a(false, "not main edition");
            fve.e("WindvaneRequestPolicy", "shouldHappen !isMainEdition && !isInternational return false");
            return false;
        } else if (!a3b.o(f4b.h("v5WindvaneEnable", "true"))) {
            a(false, "degrade");
            fve.e("WindvaneRequestPolicy", "shouldHappen !enableWindvane return false");
            return false;
        } else if (this.f17090a.c().contains(this.f17090a.b())) {
            b(false, "current exposed");
            fve.e("WindvaneRequestPolicy", "shouldHappen !containsItemKey return false");
            return false;
        } else if (z && i > 0 && i(i)) {
            return false;
        } else {
            if (!a3b.o(f4b.h("enableWindvaneNearbyFilter", "true")) || !c() || !j()) {
                a(true, "");
                return true;
            }
            b(false, "next or prev exposed");
            fve.e("WindvaneRequestPolicy", "shouldHappen isNearbyItemExposed return false");
            return false;
        }
    }
}
