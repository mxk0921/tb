package android.taobao.windvane.export.prerender;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.ckf;
import tb.icn;
import tb.lcn;
import tb.obk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TMSPrerenderService$setup$1 implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSPrerenderService$setup$1 INSTANCE = new TMSPrerenderService$setup$1();

    @Override // tb.obk
    public final void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
        } else if (ckf.b("themis_prerender_config", str)) {
            String customConfig = OrangeConfig.getInstance().getCustomConfig("themis_prerender_config", null);
            if (TextUtils.isEmpty(customConfig)) {
                lcn.a(RVLLevel.Info, "Themis/Performance/Prerender").j("orangeUpdate").a("msg", "configValue is empty").f();
                return;
            }
            TMSPrerenderService tMSPrerenderService = TMSPrerenderService.INSTANCE;
            if (TextUtils.equals(customConfig, TMSPrerenderService.a(tMSPrerenderService))) {
                lcn.a(RVLLevel.Info, "Themis/Performance/Prerender").j("orangeUpdate").a("msg", "configValue is same").f();
                return;
            }
            icn j = lcn.a(RVLLevel.Info, "Themis/Performance/Prerender").j("orangeUpdate");
            synchronized (tMSPrerenderService) {
                try {
                    try {
                        TMSPrerenderService.c(tMSPrerenderService, customConfig);
                        TMSPrerenderService.d(tMSPrerenderService, (TMSPrerenderModel) JSON.parseObject(customConfig, TMSPrerenderModel.class));
                        TMSPrerenderModel b = TMSPrerenderService.b(tMSPrerenderService);
                        if (b != null && b.getAutoStart()) {
                            tMSPrerenderService.f(TMSPrerenderService$setup$1$1$1.INSTANCE);
                        }
                        j.a("updateSuccess", Boolean.TRUE);
                    } catch (Exception unused) {
                        j.a("updateFail", Boolean.FALSE);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            j.f();
        }
    }
}
