package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.alibaba.poplayer.trigger.adapter.TriggerControllerInfoManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tbpoplayer.watermask.WaterMaskInfo;
import com.taobao.tbpoplayer.watermask.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q71 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626571);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79fcf76", new Object[0]);
            return;
        }
        AppMonitor.register(xhl.MONITOR_MODULE, "Screenshot", MeasureSet.create(), DimensionSet.create().addDimension("clickFalcoId").addDimension("uid").addDimension("pageName").addDimension("pageUrl").addDimension("localTime").addDimension(Constants.KEY_USER_ID).addDimension("screenUuid").addDimension("isReportLog"), true);
        AppMonitor.register(xhl.MONITOR_MODULE, "watermarkLoad", MeasureSet.create(), DimensionSet.create().addDimension("pageName").addDimension("pageUrl").addDimension("uid").addDimension("matchId").addDimension("alpha").addDimension("from").addDimension("timeSinceLaunch").addDimension("hitOpt"), true);
        AppMonitor.register(xhl.MONITOR_MODULE, "watermarkSdkInit", MeasureSet.create(), DimensionSet.create().addDimension("success").addDimension("failReason").addDimension("timeSinceLaunch").addDimension("hitOpt"), true);
        AppMonitor.register(xhl.MONITOR_MODULE, "watermarkRequestNewInfo", MeasureSet.create(), DimensionSet.create().addDimension("needRequest").addDimension("cancel").addDimension("hitOpt"), true);
        AppMonitor.register(xhl.MONITOR_MODULE, "watermarkRequestNewInfoResult", MeasureSet.create(), DimensionSet.create().addDimension("success").addDimension("failReason").addDimension("mtopData").addDimension("hitOpt"), true);
        AppMonitor.register(xhl.MONITOR_MODULE, "watermarkTrigger", MeasureSet.create(), DimensionSet.create().addDimension("success").addDimension("failReason").addDimension("pageUri").addDimension("pageUrl").addDimension("config").addDimension("hitOpt"), true);
        AppMonitor.register(xhl.MONITOR_MODULE, "watermarkViewInit", MeasureSet.create(), DimensionSet.create().addDimension("success").addDimension("failReason").addDimension("pageUri").addDimension("pageUrl").addDimension("hitOpt"), true);
        AppMonitor.register(xhl.MONITOR_MODULE, "watermarkViewAdd", MeasureSet.create(), DimensionSet.create().addDimension("success").addDimension("failReason").addDimension("pageUri").addDimension("pageUrl").addDimension("hitOpt"), true);
        AppMonitor.register(xhl.MONITOR_MODULE, "destroy", MeasureSet.create(), DimensionSet.create(), true);
    }

    public static void b(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136b6e3c", new Object[]{new Boolean(z), str});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("success", String.valueOf(z));
        create.setValue("pageUri", TriggerControllerInfoManager.instance().getCurUri());
        create.setValue("pageUrl", TriggerControllerInfoManager.instance().getCurActivityInfo());
        create.setValue("failReason", str);
        create.setValue("hitOpt", String.valueOf(a9l.w().S(Globals.getApplication())));
        AppMonitor.Stat.commit(xhl.MONITOR_MODULE, "watermarkViewAdd", create, MeasureValueSet.create());
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b55ef5fb", new Object[0]);
        } else {
            AppMonitor.Stat.commit(xhl.MONITOR_MODULE, "destroy", DimensionValueSet.create(), MeasureValueSet.create());
        }
    }

    public static void d(WaterMaskInfo.Scene scene, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9156b31f", new Object[]{scene, new Integer(i)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("pageName", c2v.getInstance().getCurrentPageName());
        create.setValue("pageUri", TriggerControllerInfoManager.instance().getCurUri());
        create.setValue("pageUrl", TriggerControllerInfoManager.instance().getCurActivityInfo());
        create.setValue("uid", Login.getUserId());
        if (scene != null) {
            str = scene.matchId;
        } else {
            str = KeepModel.STRATEGY_BLACK_LIST;
        }
        create.setValue("matchId", str);
        create.setValue("alpha", String.valueOf(i));
        create.setValue("timeSinceLaunch", String.valueOf(System.currentTimeMillis() - a.m().k()));
        create.setValue("hitOpt", String.valueOf(a9l.w().S(Globals.getApplication())));
        AppMonitor.Stat.commit(xhl.MONITOR_MODULE, "watermarkLoad", create, MeasureValueSet.create());
    }

    public static void e(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcb30d1", new Object[]{new Boolean(z), new Boolean(z2)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("needRequest", String.valueOf(z));
        create.setValue("cancel", String.valueOf(z2));
        create.setValue("hitOpt", String.valueOf(a9l.w().S(Globals.getApplication())));
        AppMonitor.Stat.commit(xhl.MONITOR_MODULE, "watermarkRequestNewInfo", create, MeasureValueSet.create());
    }

    public static void f(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3f41da", new Object[]{new Boolean(z), str, str2});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("success", String.valueOf(z));
        create.setValue("failReason", str);
        create.setValue("mtopData", str2);
        create.setValue("hitOpt", String.valueOf(a9l.w().S(Globals.getApplication())));
        AppMonitor.Stat.commit(xhl.MONITOR_MODULE, "watermarkRequestNewInfoResult", create, MeasureValueSet.create());
    }

    public static void g(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e526bf56", new Object[]{str, str2, str3, str4, str5, str6, str7, new Boolean(z)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("clickFalcoId", str);
        create.setValue("uid", str2);
        create.setValue("pageName", str3);
        create.setValue("pageUrl", str4);
        create.setValue("localTime", str5);
        create.setValue(Constants.KEY_USER_ID, str6);
        create.setValue("screenUuid", str7);
        create.setValue("isReportLog", String.valueOf(z));
        AppMonitor.Stat.commit(xhl.MONITOR_MODULE, "Screenshot", create, MeasureValueSet.create());
    }

    public static void h(boolean z, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525c7d8c", new Object[]{new Boolean(z), str, new Long(j)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("success", String.valueOf(z));
        create.setValue("failReason", str);
        create.setValue("timeSinceLaunch", String.valueOf(System.currentTimeMillis() - j));
        create.setValue("hitOpt", String.valueOf(a9l.w().S(Globals.getApplication())));
        AppMonitor.Stat.commit(xhl.MONITOR_MODULE, "watermarkSdkInit", create, MeasureValueSet.create());
    }

    public static void i(boolean z, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d7f988", new Object[]{new Boolean(z), str, str2, str3, str4});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("success", String.valueOf(z));
        create.setValue("failReason", str);
        create.setValue("pageUri", str2);
        create.setValue("pageUrl", str3);
        create.setValue("config", str4);
        create.setValue("hitOpt", String.valueOf(a9l.w().S(Globals.getApplication())));
        AppMonitor.Stat.commit(xhl.MONITOR_MODULE, "watermarkTrigger", create, MeasureValueSet.create());
    }

    public static void j(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca080bf7", new Object[]{new Boolean(z), str});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("success", String.valueOf(z));
        create.setValue("pageUri", TriggerControllerInfoManager.instance().getCurUri());
        create.setValue("pageUrl", TriggerControllerInfoManager.instance().getCurActivityInfo());
        create.setValue("failReason", str);
        create.setValue("hitOpt", String.valueOf(a9l.w().S(Globals.getApplication())));
        AppMonitor.Stat.commit(xhl.MONITOR_MODULE, "watermarkViewInit", create, MeasureValueSet.create());
    }
}
