package com.taobao.prefork;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bqa;
import tb.d7r;
import tb.ddv;
import tb.f0b;
import tb.mxl;
import tb.pmn;
import tb.s0j;
import tb.t2o;
import tb.vxl;
import tb.xti;
import tb.yyj;
import tb.zza;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ViewFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ViewFactory";
    public static volatile ViewFactory b = new ViewFactory();
    public static CreateViewThread c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f11478a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements d7r.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.d7r.a
        public void a(Context context, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a153e24", new Object[]{this, context, configuration});
                return;
            }
            if (ViewFactory.a() != null) {
                try {
                    ViewFactory.a().interrupt();
                } catch (Throwable unused) {
                }
            }
            if (ViewFactory.b() != null) {
                try {
                    ViewFactory.b().d();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    static {
        t2o.a(729809220);
        try {
            d7r.i(new a());
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ CreateViewThread a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CreateViewThread) ipChange.ipc$dispatch("f55a9a61", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ ViewFactory b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewFactory) ipChange.ipc$dispatch("f5030885", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58bc884", new Object[]{str});
        } else {
            i(str);
        }
    }

    public static ViewFactory f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewFactory) ipChange.ipc$dispatch("52caa6eb", new Object[0]);
        }
        if (b == null) {
            synchronized (ViewFactory.class) {
                try {
                    if (b == null) {
                        b = new ViewFactory();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96279097", new Object[]{this});
        } else {
            ((ConcurrentHashMap) this.f11478a).clear();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        d();
        b = null;
    }

    public void g(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d478bc89", new Object[]{this, application, str});
        } else if (!TBDeviceUtils.G(application)) {
            i(str);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6b9b10", new Object[]{this});
            return;
        }
        DTemplateManager.t("homepage").s(64);
        DTemplateManager.t("guess").s(64);
        xti.a().l(64);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        CreateViewThread createViewThread = new CreateViewThread("async-render-thread");
        c = createViewThread;
        createViewThread.start();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CreateViewThread extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements pmn {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f11479a;

            public a(String str) {
                this.f11479a = str;
            }

            @Override // tb.pmn
            public void a(List<String> list, List<String> list2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd86ffe0", new Object[]{this, list, list2});
                    return;
                }
                f0b.j(this.f11479a).c("loadPreRenderCache");
                if (list != null && list.size() > 0) {
                    CreateViewThread.a(CreateViewThread.this);
                }
            }
        }

        static {
            t2o.a(729809222);
        }

        public CreateViewThread(String str) {
            super(str);
        }

        public static /* synthetic */ void a(CreateViewThread createViewThread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88809361", new Object[]{createViewThread});
            } else {
                createViewThread.b();
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be50ac85", new Object[]{this});
                return;
            }
            bqa.d(mxl.TAG, "preRenderTemplates searchBar");
            ViewFactory.c(yyj.e().f());
            ViewFactory.c(yyj.e().k());
            bqa.d(ViewFactory.TAG, "finish preRender");
        }

        public static /* synthetic */ Object ipc$super(CreateViewThread createViewThread, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/prefork/ViewFactory$CreateViewThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            f0b.i().p(ViewFactory.TAG, 3);
            bqa.d(ViewFactory.TAG, "CreateViewThread run");
            try {
                Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(Looper.getMainLooper());
                if (obj instanceof ThreadLocal) {
                    ((ThreadLocal) obj).set(Looper.getMainLooper());
                }
                bqa.d(ViewFactory.TAG, "myLooper:" + Looper.myLooper());
                try {
                    c();
                } catch (Exception e) {
                    bqa.b(ViewFactory.TAG, "runInner", e);
                }
                f0b.i().c(ViewFactory.TAG);
            } catch (Exception unused) {
                bqa.d(ViewFactory.TAG, "设置MainLooper失败，异步创建view中止");
                ddv.g("设置MainLooper失败", "GUESS_YOU_LIKE");
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c917c992", new Object[]{this});
                return;
            }
            try {
                Process.setThreadPriority(0);
            } catch (Throwable unused) {
            }
            DTemplateManager.t("homepage").s(64);
            DTemplateManager.t("guess").s(64);
            xti.a().l(64);
            if (vxl.j() || vxl.a()) {
                b();
                return;
            }
            String f = yyj.e().f();
            String k = yyj.e().k();
            f0b.j(k).p("loadPreRenderCache", 3);
            zza.d(f).M(new ArrayList<String>(1, f, k) { // from class: com.taobao.prefork.ViewFactory.CreateViewThread.1
                public final /* synthetic */ String val$mainContainerId;
                public final /* synthetic */ String val$subContainerId;

                {
                    this.val$mainContainerId = f;
                    this.val$subContainerId = k;
                    add(f);
                    add(k);
                }
            }, new a(k));
        }
    }

    public static void i(String str) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1eb7b1", new Object[]{str});
            return;
        }
        AwesomeGetContainerData u = zza.d(str).u(str);
        if (u != null && (awesomeGetContainerInnerData = u.base) != null && awesomeGetContainerInnerData.isCacheData) {
            List<SectionModel> totalData = u.getTotalData();
            if (totalData.isEmpty()) {
                bqa.d("GlobalTrace", "preRenderCards failed, data is empty, cid=" + str);
                return;
            }
            mxl.k(str, totalData, s0j.MTS_SUB_STAGE_LOAD_CACHE, 0);
        }
    }
}
