package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class v2 extends pwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793185);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(String str, String str2, String str3, String str4, String str5, Map<String, String> map, MethodEnum methodEnum) {
        super(o4p.g(), str3, methodEnum);
        ckf.g(methodEnum, "requestMethod");
        g4p g4pVar = this.f20426a;
        g4pVar.f19724a = "mtop.relationrecommend.mtoprecommend.recommend";
        g4pVar.b = "1.0";
        d("main-activate", 1);
        if (map != null) {
            eca.c(map);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    a(key, value);
                }
            }
        }
        a("area", "active_page");
        a("src", "c2c");
        a("code", "jhy_ai_search");
        a("channelSrp", "aiUniversalSearch");
        if (!o4p.u2()) {
            a(ia0.PARAM_SEARCH_HINT, "on");
        } else {
            a(ia0.PARAM_SEARCH_HINT, "off");
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            a("placeholder", str);
            a(ia0.PARAM_SEARCH_BAR_SEARCH_TEXT, str2);
        }
        if (!TextUtils.isEmpty(str4)) {
            a("tab", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            a(ia0.PARAM_SEARCHDOOR_FROM, str5);
        }
        TBLocationDTO c = a4p.c();
        if (c != null) {
            a("longitude", c.longitude);
            a("latitude", c.latitude);
            a(r4p.KEY_CITY_CODE, c.cityCode);
        }
        m3p m3pVar = m3p.INSTANCE;
        Application application = Globals.getApplication();
        ckf.f(application, "getApplication(...)");
        String b = m3pVar.b(application);
        if (!TextUtils.isEmpty(b)) {
            a(r4p.KEY_GLOBAL_LBS, b);
        }
        a("vm", "nw");
    }

    public static /* synthetic */ Object ipc$super(v2 v2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/AIActivateTppRequest");
    }

    @Override // tb.h5p
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2fddb55", new Object[]{this, str, str2});
        } else {
            a(str, str2);
        }
    }

    @Override // tb.n8u
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2140d8f1", new Object[]{this});
            return;
        }
        g4p g4pVar = this.f20426a;
        if (g4pVar.f == null) {
            g4pVar.f = new HashMap();
        }
        ScreenType.a(this.f20426a.f);
    }
}
