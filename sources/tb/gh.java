package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AURAPluginContainerNodeModel f19982a;
    public final ExecutorService b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f19983a;
        public final /* synthetic */ String b;
        public final /* synthetic */ vcb c;

        public a(Context context, String str, vcb vcbVar) {
            this.f19983a = context;
            this.b = str;
            this.c = vcbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AURAPluginContainerNodeModel aURAPluginContainerNodeModel = (AURAPluginContainerNodeModel) JSON.parseObject(cxu.b(this.f19983a, this.b), AURAPluginContainerNodeModel.class);
                gh.a(gh.this, aURAPluginContainerNodeModel);
                vcb vcbVar = this.c;
                if (vcbVar != null) {
                    vcbVar.a(aURAPluginContainerNodeModel);
                }
                rbb g = ck.g();
                g.c("AURAConfigLoader", "asyncLoad", gh.b(gh.this) + "|异步加载成功:" + this.b);
            } catch (Throwable th) {
                rbb g2 = ck.g();
                g2.b("AURAConfigLoader", "asyncLoad", gh.b(gh.this) + "|异步加载配置失败:" + this.b + ",error=" + th.getMessage());
            }
        }
    }

    static {
        t2o.a(79691954);
    }

    public gh(String str) {
        this.c = str;
        this.b = dn.d(2, 4, 1L, TimeUnit.MINUTES, str);
    }

    public static /* synthetic */ AURAPluginContainerNodeModel a(gh ghVar, AURAPluginContainerNodeModel aURAPluginContainerNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("37ad7e6", new Object[]{ghVar, aURAPluginContainerNodeModel});
        }
        ghVar.f19982a = aURAPluginContainerNodeModel;
        return aURAPluginContainerNodeModel;
    }

    public static /* synthetic */ String b(gh ghVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("329fe153", new Object[]{ghVar});
        }
        return ghVar.c;
    }

    public void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f87d6e9", new Object[]{this, context, str});
        } else {
            d(context, str, null);
        }
    }

    public void d(Context context, String str, vcb<AURAPluginContainerNodeModel> vcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9d4dfe", new Object[]{this, context, str, vcbVar});
        } else if (!TextUtils.isEmpty(str)) {
            this.b.execute(new a(context, str, vcbVar));
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (!this.b.isShutdown()) {
            this.b.shutdownNow();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        e();
        this.f19982a = null;
    }

    public AURAPluginContainerNodeModel g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("e71b8fb8", new Object[]{this});
        }
        return this.f19982a;
    }
}
