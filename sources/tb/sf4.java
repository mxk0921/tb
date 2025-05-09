package tb;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.sf4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sf4 extends ol8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final float g = new Random(System.currentTimeMillis()).nextFloat();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final /* synthetic */ void b(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44b4dc20", new Object[]{this, map});
            } else {
                sf4.v(sf4.this, map);
            }
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            final Map<String, String> configs = OrangeConfig.getInstance().getConfigs("metrickit");
            if (configs != null) {
                sf4.u(sf4.this).post(new Runnable() { // from class: tb.rf4
                    @Override // java.lang.Runnable
                    public final void run() {
                        sf4.a.this.b(configs);
                    }
                });
            }
        }
    }

    public sf4(Handler handler) {
        super(handler);
    }

    public static /* synthetic */ Object ipc$super(sf4 sf4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/config/ConfigEventSource");
    }

    public static /* synthetic */ Handler u(sf4 sf4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1d575f33", new Object[]{sf4Var});
        }
        return sf4Var.j();
    }

    public static /* synthetic */ void v(sf4 sf4Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9ef533", new Object[]{sf4Var, map});
        } else {
            sf4Var.w(map);
        }
    }

    @Override // tb.ol8
    public int[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f6d4687e", new Object[]{this});
        }
        return new int[]{3};
    }

    @Override // tb.ol8
    public void q(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"metrickit"}, new a(), true);
        }
    }

    public final void w(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee60e9f", new Object[]{this, map});
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                if ("on".equals(entry.getValue())) {
                    hashMap.put(entry.getKey(), Boolean.TRUE);
                    TLog.loge("ConfigEventSource", entry.getKey() + "=true");
                }
                if ("off".equals(entry.getValue())) {
                    hashMap.put(entry.getKey(), Boolean.FALSE);
                    TLog.loge("ConfigEventSource", entry.getKey() + "=false");
                }
                if (entry.getValue().startsWith("long_")) {
                    long f = rrl.f(entry.getValue().replace("long_", ""), 9223372036854775806L);
                    if (f != 9223372036854775806L) {
                        hashMap2.put(entry.getKey(), Long.valueOf(f));
                        TLog.loge("ConfigEventSource", entry.getKey() + "=" + f);
                    }
                }
                if (entry.getValue().startsWith("0") || entry.getValue().startsWith("1")) {
                    float c = rrl.c(entry.getValue(), -1.0f);
                    if (c >= 0.0f && c <= 1.0f) {
                        hashMap.put(entry.getKey(), Boolean.valueOf(this.g < c));
                        StringBuilder sb = new StringBuilder();
                        sb.append(entry.getKey());
                        sb.append("=");
                        sb.append(this.g < c);
                        TLog.loge("ConfigEventSource", sb.toString());
                    }
                }
            }
        }
        l1r.i(hashMap, hashMap2);
        l1r.b(map);
    }
}
