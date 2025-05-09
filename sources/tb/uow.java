package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uow implements gce {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(980418584);
        t2o.a(982516047);
    }

    @Override // tb.gce
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63093a8b", new Object[]{this, map});
            return;
        }
        String str = map.get("page_url");
        String str2 = map.get(gce.KEY_CRASH_INFO_JS_VERSION);
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        if (TextUtils.isEmpty(str)) {
            crashCaughtHeader.addHeaderInfo("wx2_current_url", "default");
        } else {
            crashCaughtHeader.addHeaderInfo("wx2_current_url", str);
        }
        crashCaughtHeader.addHeaderInfo(gce.KEY_CRASH_INFO_JS_VERSION, str2);
    }

    @Override // tb.gce
    public void b(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d9f13c", new Object[]{this, str, str2, str3, str4, str5, str6, jSONObject, str7});
            return;
        }
        try {
            ud2 ud2Var = new ud2();
            ud2Var.b = AggregationType.CONTENT;
            ud2Var.f29301a = "WEEX2_JS_ERROR";
            ud2Var.c = str;
            ud2Var.d = str2;
            ud2Var.e = str3;
            ud2Var.f = str4;
            ud2Var.g = str5;
            ud2Var.h = str6;
            ud2Var.i = jSONObject;
            ud2Var.j = str7;
            vd2.a().c(f5x.f19038a, ud2Var);
        } catch (Throwable th) {
            dwh.i(th);
        }
    }

    @Override // tb.gce
    public void c(WeexErrorType weexErrorType, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880a943b", new Object[]{this, weexErrorType, str, str2, str3});
            return;
        }
        try {
            ud2 d = d(weexErrorType.errCode, str2, str3, str);
            d.l = Thread.currentThread();
            vd2.a().c(f5x.f19038a, d);
        } catch (Throwable th) {
            dwh.g(TLogTracker.SCENE_EXCEPTION, "weex report exception error", th);
        }
    }

    public final ud2 d(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ud2) ipChange.ipc$dispatch("50804d73", new Object[]{this, new Integer(i), str, str2, str3});
        }
        ud2 ud2Var = new ud2();
        ud2Var.b = AggregationType.CONTENT;
        ud2Var.f29301a = "WEEX2_JS_ERROR";
        ud2Var.c = String.valueOf(i);
        ud2Var.f = str;
        ud2Var.h = str2;
        if (TextUtils.isEmpty(str2)) {
            ud2Var.h = str;
        }
        ud2Var.h = ud2Var.h.replace("\n", "_*n*_");
        HashMap hashMap = new HashMap();
        ud2Var.i = hashMap;
        hashMap.put("groupKey", str3);
        return ud2Var;
    }
}
