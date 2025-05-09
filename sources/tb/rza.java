package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.prefork.ViewFactory;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rza extends zya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements jmc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27693a;
        public final /* synthetic */ Application b;

        public a(rza rzaVar, String str, Application application) {
            this.f27693a = str;
            this.b = application;
        }

        @Override // tb.jmc
        public void a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("facf32fb", new Object[]{this, str, awesomeGetContainerInnerData});
                return;
            }
            bqa.d("HomeDinamicX3Launcher", "cache onLoadSuccess : " + str);
            dvh.g(this.f27693a, true);
            String c = dvh.c(dvh.TASK_DX_MAIN_PRERENDER);
            phg.e("launcher_load_dx_prerender_" + str);
            ViewFactory.f().h();
            ViewFactory.f().g(this.b, str);
            phg.d("launcher_load_dx_prerender_" + str);
            dvh.g(c, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements jmc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27694a;
        public final /* synthetic */ Application b;

        public b(rza rzaVar, String str, Application application) {
            this.f27694a = str;
            this.b = application;
        }

        @Override // tb.jmc
        public void a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("facf32fb", new Object[]{this, str, awesomeGetContainerInnerData});
                return;
            }
            bqa.d("HomeDinamicX3Launcher", "cache onLoadSuccess : " + str);
            dvh.g(this.f27694a, true);
            String c = dvh.c(dvh.TASK_DX_SUB_PRERENDER);
            phg.e("launcher_load_dx_prerender_" + str);
            nue.c(new wue());
            DinamicXEngine b = f18.b(null, j18.HOMEPAGE_DX_MODULE, null);
            dt8.a(b, null);
            f18.a(b);
            ViewFactory.f().h();
            ViewFactory.f().g(this.b, str);
            phg.d("launcher_load_dx_prerender_" + str);
            dvh.g(c, true);
        }
    }

    static {
        t2o.a(729809318);
    }

    public static /* synthetic */ Object ipc$super(rza rzaVar, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/launcher/HomeDinamicX3Launcher");
    }

    @Override // tb.zya
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (dvh.o()) {
            dvh.a(dvh.STAGE_APP_LAUNCH_TASKS);
        }
        String c = dvh.c(dvh.TASK_HOME_DX_REGISTER);
        this.f33099a.p("HomeDinamicX3Launcher", 4);
        super.a(application, hashMap);
        if (vxl.b().M()) {
            c(application);
        }
        h5b.e();
        if (vxl.b().x()) {
            b(application);
        }
        uqa.b("LauncherTask", "HomeDinamicX3Launcher", "HomeDinamicX3Launcher.init; 首页dinamicX 3.0自定义控件初始化");
        this.f33099a.c("HomeDinamicX3Launcher");
        dvh.g(c, true);
    }

    public final void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273c1f52", new Object[]{this, application});
            return;
        }
        try {
            bqa.d("HomeDinamicX3Launcher", "loadMainDXPrerender");
            String c = dvh.c(dvh.TASK_DX_MAIN_LOAD_DATA);
            ArrayList arrayList = new ArrayList();
            arrayList.add(yyj.e().f());
            zza.d(yyj.l().f32522a).N(arrayList, false, new a(this, c, application));
        } catch (Throwable th) {
            TLog.loge("HomeDinamicX3Launcher", "loadMainDXPrerender error", th);
        }
    }

    public final void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74debc0d", new Object[]{this, application});
            return;
        }
        phg.k("loadSubDXPrerender");
        try {
            bqa.d("HomeDinamicX3Launcher", "loadSubDXPrerender");
            String c = dvh.c(dvh.TASK_DX_SUB_LOAD_DATA);
            ArrayList arrayList = new ArrayList();
            arrayList.add(yyj.e().k());
            zza.d(yyj.l().f32522a).N(arrayList, false, new b(this, c, application));
        } catch (Throwable th) {
            TLog.loge("HomeDinamicX3Launcher", "loadSubDXPrerender error", th);
        }
        phg.j("loadSubDXPrerender");
    }
}
