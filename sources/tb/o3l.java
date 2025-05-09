package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.fragment.FloatVesselFragment;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.vessel.utils.VesselType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o3l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_OPENFLOATDIALOG = "openFloatDialog";
    public static final String EVENT_TYPE_OPENFLOATDIALOG_ALTERNATIVE = "open_common_float_dialog";
    public static final String EVENT_TYPE_OPENWEEXFLOAT = "openWeexFloat";
    public static final String NEED_ADDRESS_ID_KEY = "needAddressId";

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f25125a;
    public final ze7 b;
    public String c;
    public JSONObject d;
    public final a e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(912261899);
        t2o.a(912261826);
    }

    public o3l(Context context, ze7 ze7Var, a aVar) {
        if (context instanceof FragmentActivity) {
            this.f25125a = (FragmentActivity) context;
        }
        this.b = ze7Var;
        this.e = aVar;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe99883c", new Object[]{this});
        } else if (this.d != null && Boolean.TRUE.toString().equals(this.d.getString(NEED_ADDRESS_ID_KEY))) {
            String a2 = ((TTDetailPageManager.f) this.e).a();
            if (!TextUtils.isEmpty(a2)) {
                this.c = c(this.c, "addressId", a2);
            }
        }
    }

    public final String c(String str, String str2, String str3) {
        String str4;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("702ddd24", new Object[]{this, str, str2, str3});
        }
        if (str == null || str2 == null || str3 == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        for (String str5 : queryParameterNames) {
            boolean equals = str2.equals(str5);
            if (equals) {
                z = true;
            }
            if (equals) {
                str4 = str3;
            } else {
                str4 = parse.getQueryParameter(str5);
            }
            clearQuery.appendQueryParameter(str5, str4);
        }
        if (!z) {
            clearQuery.appendQueryParameter(str2, str3);
        }
        return clearQuery.toString();
    }

    public final String d(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("671c7840", new Object[]{this, str, map});
        }
        if (TextUtils.isEmpty(str) || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : map.keySet()) {
            if (map.get(str2) != null && (buildUpon.build() == null || buildUpon.build().getQuery() == null || !buildUpon.build().getQuery().contains(str2))) {
                buildUpon.appendQueryParameter(str2, map.get(str2));
            }
        }
        return buildUpon.toString();
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        FragmentActivity fragmentActivity;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (fragmentActivity = this.f25125a) == null || tq4.e(fragmentActivity) || (a2 = irVar.a()) == null) {
            return false;
        }
        String string = a2.getString("url");
        this.c = string;
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        this.d = a2;
        if (!TextUtils.isEmpty(a2.getString(ICallService.KEY_NEED_LOGIN))) {
            try {
                if (Boolean.parseBoolean(this.d.getString(ICallService.KEY_NEED_LOGIN).toLowerCase()) && !hjh.c()) {
                    hjh.d(true);
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ttid", nj7.c());
        hashMap.put("detail_v", "3.3.2");
        b();
        this.c = d(this.c, hashMap);
        FloatVesselFragment floatVesselFragment = new FloatVesselFragment();
        floatVesselFragment.Q2(this.b);
        floatVesselFragment.T2(((TTDetailPageManager.f) this.e).a());
        floatVesselFragment.R2(EVENT_TYPE_OPENFLOATDIALOG_ALTERNATIVE);
        floatVesselFragment.K2(VesselType.Weex, this.c, this.d);
        floatVesselFragment.show(this.f25125a.getSupportFragmentManager(), "");
        return true;
    }
}
