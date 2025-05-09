package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.b;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class anx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993002161);
    }

    public static a a(Context context, cnx cnxVar, MUSInstanceConfig mUSInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("fb0ffe", new Object[]{context, cnxVar, mUSInstanceConfig});
        }
        if (mUSInstanceConfig == null) {
            mUSInstanceConfig = new MUSInstanceConfig();
        }
        if (TextUtils.isEmpty(mUSInstanceConfig.a())) {
            mUSInstanceConfig.p("taobao://tbsearch");
        }
        a c = b.f().c(context, mUSInstanceConfig);
        if ((context instanceof oxb) && ((oxb) context).E1()) {
            c.addInstanceEnv("darkMode", "true");
        }
        if (cnxVar != null) {
            c.setTag(SFMuiseSDK.MUISE_EVENT_LISTENER, cnxVar);
        }
        if (context instanceof cpc) {
            ((cpc) context).v0(c);
        }
        if (j3p.g() != null && j3p.g().f().h().e) {
            c.setTag("enableSlidePreciseExpose", "true");
        }
        ScreenType g = ScreenType.g(context);
        if (g != null) {
            c.addInstanceEnv(k7m.KEY_SCREEN_STYLE, ScreenType.h(g.c()));
        }
        return c;
    }
}
