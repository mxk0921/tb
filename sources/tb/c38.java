package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.log.TLog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class c38 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c38 INSTANCE = new c38();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16814a;

    static {
        t2o.a(745537911);
    }

    public final void a(Activity activity, s3j s3jVar, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7806e087", new Object[]{this, activity, s3jVar, dinamicXEngine});
            return;
        }
        ckf.h(activity, "aty");
        if (dinamicXEngine != null && s3jVar != null && !f16814a) {
            f16814a = true;
            uv6.b("corePreloadDx", 0);
            b(activity, s3jVar, dinamicXEngine);
            uv6.c("corePreloadDx", 0);
        }
    }

    public final void b(Activity activity, s3j s3jVar, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46372e1", new Object[]{this, activity, s3jVar, dinamicXEngine});
            return;
        }
        try {
            List<h3j> b = s3jVar.b();
            if (b != null) {
                for (h3j h3jVar : b) {
                    if (ckf.b(h3jVar.a(), "dinamicx")) {
                        DXTemplateItem u = dinamicXEngine.u(h3jVar.c());
                        dinamicXEngine.B0(activity, u, h3jVar.g(), -1, new DXRenderOptions.b().E(new o3j(h3jVar, s3jVar.c())).q());
                        uv6.i("mtbMainLink", "dx预渲染： " + u.f7343a);
                    }
                }
            }
        } catch (Throwable th) {
            TLog.loge("mtbMainLink", "dx预渲染报错，throw:" + th);
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c23fe410", new Object[]{this})).booleanValue();
        }
        return f16814a;
    }
}
