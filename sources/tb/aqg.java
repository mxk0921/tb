package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.wireless.link.model.ActivityIdTime;
import com.taobao.wireless.link.model.SupportBrandVersion;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class aqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Map<String, String> h = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public String f15934a;
    public String b;
    public SupportBrandVersion c;
    public ActivityIdTime d;
    public SupportBrandVersion e;
    public SupportBrandVersion f;
    public cno g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f15935a;

        public a(Application application) {
            this.f15935a = application;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            aqg.a(aqg.this, str, this.f15935a);
            aqg.c(OrangeConfig.getInstance().getConfigs(str));
            irg.a("link_tag", "LinkConfigGetImp === registerListener === nameSpace为：" + str + " === 获取到的configs: " + aqg.b());
            cno.b(this.f15935a).e("link_in_common_local", aqg.b());
        }
    }

    static {
        t2o.a(1030750255);
    }

    public aqg(Application application) {
        h(application);
    }

    public static /* synthetic */ void a(aqg aqgVar, String str, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a2ca6e", new Object[]{aqgVar, str, application});
        } else {
            aqgVar.f(str, application);
        }
    }

    public static /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ Map c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e184c180", new Object[]{map});
        }
        h = map;
        return map;
    }

    public static /* synthetic */ cno d(aqg aqgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cno) ipChange.ipc$dispatch("d14d11a6", new Object[]{aqgVar});
        }
        return aqgVar.g;
    }

    public static /* synthetic */ cno e(aqg aqgVar, cno cnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cno) ipChange.ipc$dispatch("7309c1f", new Object[]{aqgVar, cnoVar});
        }
        aqgVar.g = cnoVar;
        return cnoVar;
    }

    public static String g(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b368e7c3", new Object[]{context, str, str2});
        }
        Map<String, String> map = h;
        if (map == null || map.size() == 0) {
            h = cno.b(context).c("link_in_common_local");
        }
        Map<String, String> map2 = h;
        if (map2 == null || map2.size() == 0) {
            return str2;
        }
        String str3 = h.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public final void f(String str, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be07f5ae", new Object[]{this, str, application});
        } else {
            mr4.b().a().post(new b(str, application));
        }
    }

    public final void h(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02e19a", new Object[]{this, application});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"bc_server_port"}, new a(application), false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15936a;
        public final /* synthetic */ Application b;

        public b(String str, Application application) {
            this.f15936a = str;
            this.b = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            aqg.this.f15934a = OrangeConfig.getInstance().getConfig(this.f15936a, "textTitle", "恭喜你，小助手已成功开启，奖励已到账");
            aqg.this.b = OrangeConfig.getInstance().getConfig(this.f15936a, "tbVersion", "");
            aqg.e(aqg.this, cno.b(this.b));
            try {
                aqg.this.c = (SupportBrandVersion) JSON.parseObject(OrangeConfig.getInstance().getConfig(this.f15936a, "popWhiteList", ""), SupportBrandVersion.class);
                aqg aqgVar = aqg.this;
                if (aqgVar.c != null) {
                    aqg.d(aqgVar).d("popSupportBrandVersion", aqg.this.c);
                }
            } catch (Exception e) {
                irg.a("link_tag", "LinkConfigGetImp === assistantConfig === config解析异常:" + e);
            }
            try {
                aqg.this.f = (SupportBrandVersion) JSON.parseObject(OrangeConfig.getInstance().getConfig(this.f15936a, "notificationSupportBrandVersion", ""), SupportBrandVersion.class);
                aqg aqgVar2 = aqg.this;
                if (aqgVar2.f != null) {
                    aqg.d(aqgVar2).d("notificationSupportBrandVersion", aqg.this.f);
                }
                aqg.this.e = (SupportBrandVersion) JSON.parseObject(OrangeConfig.getInstance().getConfig(this.f15936a, "supportBrandVersion", ""), SupportBrandVersion.class);
                aqg aqgVar3 = aqg.this;
                if (aqgVar3.e != null) {
                    aqg.d(aqgVar3).d("supportBrandVersion", aqg.this.e);
                }
                aqg.this.d = (ActivityIdTime) JSON.parseObject(OrangeConfig.getInstance().getConfig(this.f15936a, "activityOutTime", ""), ActivityIdTime.class);
                aqg aqgVar4 = aqg.this;
                if (aqgVar4.d != null) {
                    aqg.d(aqgVar4).d("activityOutTime", aqg.this.d);
                }
            } catch (Exception e2) {
                irg.a("link_tag", "LinkConfigGetImp === assistantConfig === config数据解析异常:" + e2);
            }
            String config = OrangeConfig.getInstance().getConfig(this.f15936a, "isShowNotification", "false");
            String config2 = OrangeConfig.getInstance().getConfig(this.f15936a, "isShowAssistant", "false");
            if (TextUtils.equals("false", config)) {
                aqg.d(aqg.this).d("isShowNotifi", "false");
                mr4.b().j = config;
            }
            if (TextUtils.equals("false", config2)) {
                md1.h().l(this.b, false);
            }
            q9k.c(this.b, true);
        }
    }
}
