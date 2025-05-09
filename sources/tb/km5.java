package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class km5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HSEARCHBARDATA = 6862667776971334459L;

    static {
        t2o.a(729809045);
    }

    public static /* synthetic */ Object ipc$super(km5 km5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserHSearchBarData");
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f46ca1f1", new Object[]{this});
        }
        JSONObject d = e0p.d();
        if (d == null) {
            fve.e("DXDataParserHSearchBarData", "searchBarData == null");
            return new JSONObject();
        } else if (d.getBooleanValue("slimSection")) {
            return d;
        } else {
            JSONObject jSONObject = d.getJSONObject("subSection");
            if (jSONObject != null) {
                return jSONObject.getJSONObject("home");
            }
            fve.e("DXDataParserHSearchBarData", "subSection == null");
            return new JSONObject();
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            fve.e("DXDataParserHSearchBarData", "入参不是string");
            return null;
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) c4b.i().h(IHomeSearchBarService.class);
        if (iHomeSearchBarService == null) {
            fve.e("DXDataParserHSearchBarData", "homeSearchBarManager为空");
            return a3b.k(a(), (String) obj);
        }
        String str = (String) obj;
        Object valueFromSearchBarData = iHomeSearchBarService.getValueFromSearchBarData(str);
        if (valueFromSearchBarData != null) {
            return valueFromSearchBarData;
        }
        Object k = a3b.k(a(), str);
        AppMonitor.Alarm.commitFail("Page_Home", u3b.MONITOR_POINT, null, "getSearchBarDaraEmpty", "path: " + obj);
        return k;
    }
}
