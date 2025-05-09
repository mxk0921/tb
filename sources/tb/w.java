package tb;

import android.text.TextUtils;
import com.alibaba.ut.abtest.event.EventType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class w implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static w c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30377a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30378a;

        public a(String str) {
            this.f30378a = str;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> configs;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                configs = OrangeConfig.getInstance().getConfigs("v4_abtest_config");
            } catch (Throwable th) {
                try {
                    ku0.j("ABOrangeService.checkExperimentUpdate", th);
                    if (w.a(w.this) == null) {
                        return;
                    }
                } catch (Throwable th2) {
                    if (w.a(w.this) != null) {
                        w.a(w.this).set(false);
                    }
                    throw th2;
                }
            }
            if (configs == null) {
                ogh.n("ABOrangeService", "【实验数据】数据文件配置为空。");
                if (w.a(w.this) != null) {
                    w.a(w.this).set(false);
                    return;
                }
                return;
            }
            String str = configs.get("abtest_config");
            if (TextUtils.isEmpty(str)) {
                ogh.n("ABOrangeService", "【实验数据】数据文件配置为空。");
                if (w.a(w.this) != null) {
                    w.a(w.this).set(false);
                    return;
                }
                return;
            }
            po8 po8Var = (po8) uwf.a(str, po8.class);
            if (!(po8Var == null || po8Var.indexData == null)) {
                n.j().g().a(new bj8(EventType.ExperimentV5Data, po8Var.indexData, this.f30378a));
                if (w.a(w.this) == null) {
                    return;
                }
                w.a(w.this).set(false);
                return;
            }
            ogh.i("ABOrangeService", "实验数据索引数据为空或格式错误。");
            ku0.g(ku0.SERVICE_ALARM, "experiment_index_json_illegal", "0", "", false);
            if (w.a(w.this) != null) {
                w.a(w.this).set(false);
            }
        }
    }

    public static /* synthetic */ AtomicBoolean a(w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("4768048", new Object[]{wVar});
        }
        return wVar.b;
    }

    public static w d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("9562de95", new Object[0]);
        }
        if (c == null) {
            synchronized (w.class) {
                try {
                    if (c == null) {
                        c = new w();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34e545f", new Object[]{this, str});
            return;
        }
        ogh.e("ABOrangeService", "checkExperimentUpdate, monitorPoint=" + str + ", isExperimentChecking=" + this.b);
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean == null || atomicBoolean.compareAndSet(false, true)) {
            ydt.b(new a(str));
        }
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        ogh.e("ABOrangeService", "onConfigUpdate. namespace=" + str + ", map=" + map);
        if (TextUtils.equals(str, "v4_abtest_config")) {
            b("notify_v5");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        ogh.e("ABOrangeService", "destory");
        synchronized (this) {
            try {
                if (!this.f30377a) {
                    ogh.l("ABOrangeService", "The ABOrangeService is not bind.");
                    return;
                }
                try {
                    OrangeConfig.getInstance().unregisterListener(new String[]{"v4_abtest_config"}, this);
                } catch (Exception e) {
                    ogh.h("ABOrangeService", "v4_abtest_config/v31_beta_abtest_config destroy fail ", e);
                }
                this.f30377a = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        ogh.e("ABOrangeService", "initialize");
        synchronized (this) {
            try {
                if (this.f30377a) {
                    ogh.l("ABOrangeService", "The ABOrangeService has been initialized.");
                    return;
                }
                OrangeConfig.getInstance().registerListener(new String[]{"v4_abtest_config"}, this, true);
                this.f30377a = true;
                b("initialize_v5");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
