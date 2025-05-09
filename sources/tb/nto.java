package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class nto {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Map<String, String> d;

    /* renamed from: a  reason: collision with root package name */
    public final ato f24945a;
    public FluidInstanceConfig b;
    public pep c;

    static {
        t2o.a(468714760);
    }

    public nto(ato atoVar) {
        this.f24945a = atoVar;
    }

    public pep a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pep) ipChange.ipc$dispatch("674b746", new Object[]{this});
        }
        if (this.c == null) {
            ir9.b("SceneParamsManager", "mSessionParams 为空");
        }
        return this.c;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d2cf6ef", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(this.b.getTabId(), "video");
    }

    public void e(FluidContext fluidContext, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf34afb", new Object[]{this, fluidContext, map});
            return;
        }
        Map b = this.c.b().b();
        if (!sz3.b(b) || !sz3.b(map)) {
            if (!sz3.b(b)) {
                try {
                    b.putAll(map);
                } catch (Exception e) {
                    FluidException.throwException(fluidContext, FluidInstance.INSTANCE_PARSE_INSTANCE_CONFIG_ERROR, "mergeTab3ExtParams", e);
                }
                map = b;
            }
            ir9.b("SceneParamsManager", "合并小红点扩展参数" + map);
            this.c.b().j(map);
        }
    }

    public final void h(FluidContext fluidContext, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62e06b2", new Object[]{this, fluidContext, str, map});
        } else if (!TextUtils.isEmpty(str)) {
            ir9.b("SceneParamsManager", "解析视频流 TAB2 父容器页面链接：" + str);
            this.c.b().i(str);
            if (xyr.c(str, fluidContext.getInstanceConfig().getTabId())) {
                i(fluidContext, str, map);
            }
            g(fluidContext, str);
        }
    }

    public final void i(FluidContext fluidContext, String str, Map map) {
        Uri parse;
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a775a80b", new Object[]{this, fluidContext, str, map});
        } else if (str != null) {
            try {
                if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) {
                    String i = vrl.i(parse);
                    if (!TextUtils.isEmpty(i)) {
                        this.c.b().o(i);
                    }
                    JSONObject g = vrl.g(parse);
                    if (!sz3.b(g)) {
                        this.c.b().j(g);
                    }
                    if (!qtm.g(Uri.parse(str)) || !d()) {
                        hashMap = null;
                    } else {
                        b();
                        if (map == null) {
                            map = nwv.C(str);
                        }
                        hashMap = new HashMap();
                        for (Map.Entry entry : ((HashMap) d).entrySet()) {
                            String str2 = (String) entry.getValue();
                            Object obj = map.get((String) entry.getKey());
                            if (obj != null) {
                                hashMap.put(str2, obj.toString());
                            }
                        }
                    }
                    this.c.d(hashMap);
                }
            } catch (Exception e) {
                FluidException.throwException(fluidContext, FluidInstance.INSTANCE_PARSE_INSTANCE_CONFIG_ERROR, "parseTab2PageUrlExtParams", e);
            }
        }
    }

    public void j(FluidContext fluidContext, FluidInstanceConfig fluidInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8dfe339", new Object[]{this, fluidContext, fluidInstanceConfig});
            return;
        }
        tq9 fluidInstanceAnalysis = ((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        fluidInstanceAnalysis.c();
        FluidInstanceAnalysis.Stage stage = FluidInstanceAnalysis.Stage.PARSE_CONFIG;
        fluidInstanceAnalysis.f(stage.name());
        ir9.b("SceneParamsManager", "解析视频流场景配置：\n视频流原始链接：" + fluidInstanceConfig.getFluidOriginUrl() + "\n视频流唤端链接：" + fluidInstanceConfig.getFluidUrl() + "\n视频流父容器 PageInterface: " + fluidInstanceConfig.getHostPageInterface());
        this.b = fluidInstanceConfig;
        Uri fluidUrl = fluidInstanceConfig.getFluidUrl();
        if (fluidUrl != null) {
            f(fluidUrl);
        }
        h(fluidContext, fluidInstanceConfig.getTab2PageUrl(), null);
        this.f24945a.b(this.b, this.c);
        this.f24945a.a(this.c);
        fluidInstanceAnalysis.e(stage.name());
        fluidInstanceAnalysis.b("succeed");
    }

    public void k(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e1b1dd", new Object[]{this, map});
            return;
        }
        pep pepVar = this.c;
        if (pepVar != null) {
            pepVar.e(map);
            this.f24945a.a(this.c);
        }
    }

    public final void g(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9595a18", new Object[]{this, fluidContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (c(parse.getQueryParameter(bps.CONFIG_LAUNCH), parse.getQueryParameter("tabid"))) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        this.c.b().m(str);
                    }
                    this.c.b().n(!"1".equals(parse.getQueryParameter("skipLoading")));
                    this.c.b().l(!"1".equals(parse.getQueryParameter("skipDelay")));
                } catch (Exception e) {
                    FluidException.throwException(fluidContext, FluidInstance.INSTANCE_PARSE_INSTANCE_CONFIG_ERROR, "parseLauncherConfig", e);
                }
            }
        }
    }

    public final void b() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("824c840c", new Object[]{this});
        } else if (d == null) {
            d = new HashMap();
            String H2 = akt.H2("ShortVideo.extParamsMap", "ug_param,itemId=triggerItemId");
            if (!(TextUtils.isEmpty(H2) || (split = H2.split(",")) == null)) {
                for (String str : split) {
                    String[] split2 = str.split("=");
                    if (split2 != null) {
                        if (split2.length == 1) {
                            Map<String, String> map = d;
                            String str2 = split2[0];
                            map.put(str2, str2);
                        } else if (split2.length == 2) {
                            d.put(split2[0], split2[1]);
                        }
                    }
                }
            }
        }
    }

    public final boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("109c83cd", new Object[]{this, str, str2})).booleanValue();
        }
        return TextUtils.equals(str, "0") && TextUtils.equals(str2, "video");
    }

    public final void f(Uri uri) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ceb6e3d", new Object[]{this, uri});
        } else if (uri != null) {
            this.c = new pep(uri);
            boolean equals = FluidInstanceConfig.CONTAINER_NAME_GG_TAG3.equals(this.b.getBizType());
            String str = this.c.j;
            if (str != null && str.contains("default")) {
                z = true;
            }
            ir9.a("SceneParamsManager", "isDefaultGuangguangTab3:" + z);
            if (equals && z) {
                this.c.b().k(true);
            }
            this.c.b().h("FullScreen");
            this.c.b().p(sj4.PLAY_SCENES);
        }
    }
}
