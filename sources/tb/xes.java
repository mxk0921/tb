package tb;

import android.app.Application;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b;
import com.taobao.themis.widget.kernal.TMSWidgetEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class xes {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xes INSTANCE = new xes();

    /* renamed from: a  reason: collision with root package name */
    public static TMSWidgetEngine f31340a;
    public static boolean b;
    public static boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements h51 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.h51
        public void a(AppModel appModel, AppInfoStrategy appInfoStrategy) {
            AppInfoModel appInfoModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad55cbb9", new Object[]{this, appModel, appInfoStrategy});
                return;
            }
            if (xes.a().v() != null) {
                String str = null;
                if (!(appModel == null || (appInfoModel = appModel.getAppInfoModel()) == null)) {
                    str = appInfoModel.getDeveloperVersion();
                }
                if (o9s.b(str, xes.a().v()) > 0) {
                    xes.b(xes.INSTANCE);
                }
            }
            xes.c(false);
        }

        @Override // tb.h51
        public void b(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4804eec", new Object[]{this, str, str2, jSONObject});
            } else {
                xes.c(false);
            }
        }
    }

    static {
        t2o.a(852492367);
        Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
        ckf.f(applicationContext, "getNotNull(\n            …     ).applicationContext");
        f31340a = new TMSWidgetEngine(applicationContext, null, 2, null);
        mcs.e(mcs.MODULE_GLOBAL_WIDGET_ENGINE, mcs.EVENT_ON_INIT, mcs.GLOBAL_EVENT_ROOT_ID, mcs.d(mcs.GLOBAL_EVENT_ROOT_ID), new JSONObject());
        TMSWidgetEngine.A(f31340a, true, null, null, null, null, null, 62, null);
    }

    public static final /* synthetic */ TMSWidgetEngine a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSWidgetEngine) ipChange.ipc$dispatch("6146d4d8", new Object[0]);
        }
        return f31340a;
    }

    public static final /* synthetic */ void b(xes xesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42cf9fe", new Object[]{xesVar});
        } else {
            xesVar.e();
        }
    }

    public static final /* synthetic */ void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611a0a59", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public final TMSWidgetEngine d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSWidgetEngine) ipChange.ipc$dispatch("e11cda36", new Object[]{this});
        }
        if (f31340a.y() >= q9s.INSTANCE.y3()) {
            mcs.e(mcs.MODULE_GLOBAL_WIDGET_ENGINE, "ON_REPLACE_ENGINE", mcs.GLOBAL_EVENT_ROOT_ID, mcs.d(mcs.GLOBAL_EVENT_ROOT_ID), new JSONObject());
            e();
        }
        TMSWidgetEngine.A(f31340a, true, null, null, null, null, null, 62, null);
        return f31340a;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4c0d35", new Object[]{this});
        } else if (!c) {
            c = true;
            Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
            ckf.f(applicationContext, "getNotNull(IEnvironmentS….java).applicationContext");
            TMSWidgetEngine tMSWidgetEngine = new TMSWidgetEngine(applicationContext, null, 2, null);
            TMSWidgetEngine.A(tMSWidgetEngine, true, null, null, null, null, null, 62, null);
            TMSWidgetEngine tMSWidgetEngine2 = f31340a;
            f31340a = tMSWidgetEngine;
            tMSWidgetEngine2.D();
            c = false;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1782b4d", new Object[]{this});
        } else if (!b) {
            mcs.e(mcs.MODULE_GLOBAL_WIDGET_ENGINE, "ON_CHECK_UPDATE", mcs.GLOBAL_EVENT_ROOT_ID, mcs.d(mcs.GLOBAL_EVENT_ROOT_ID), new JSONObject());
            b = true;
            g(new a());
        }
    }

    public final void g(h51 h51Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5164507", new Object[]{this, h51Var});
            return;
        }
        AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam = new AbsAppInfoRequestConfig.BasicRequestParam();
        basicRequestParam.appId = "3000000069082854";
        b bVar = new b(basicRequestParam);
        bVar.e = null;
        bVar.f13591a = AppInfoScene.ONLINE;
        bVar.c = AbsAppInfoRequestConfig.AppInfoRequestScene.ASYNCLOAD;
        n51.i().j(bVar, true, h51Var);
    }
}
