package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.config.BizConfig;
import com.alibaba.poplayer.layermanager.config.ConfigItem;
import com.alibaba.poplayer.layermanager.d;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String d = eig.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, BizConfig> f18599a;
    public final pjc b;
    public volatile boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, BizConfig> f18600a = new ConcurrentHashMap();
        public final List<String> b = new CopyOnWriteArrayList();

        static {
            t2o.a(625999963);
        }

        public a(eig eigVar) {
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("cf331195", new Object[]{aVar});
            }
            return aVar.f18600a;
        }

        public static /* synthetic */ List b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("84917c06", new Object[]{aVar});
            }
            return aVar.b;
        }
    }

    static {
        t2o.a(625999962);
    }

    public eig(pjc pjcVar) {
        this.b = pjcVar;
    }

    public BizConfig b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BizConfig) ipChange.ipc$dispatch("b6cf9f28", new Object[]{this, str});
        }
        Map<String, BizConfig> map = this.f18599a;
        if (map == null || map.isEmpty()) {
            return null;
        }
        for (String str2 : this.f18599a.keySet()) {
            if (!TextUtils.isEmpty(str2) && str2.equals(str)) {
                return this.f18599a.get(str2);
            }
        }
        return this.f18599a.get("default");
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b68ab1b", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[]{this});
        } else {
            hst.b(new Runnable() { // from class: tb.dig
                @Override // java.lang.Runnable
                public final void run() {
                    eig.this.d();
                }
            });
        }
    }

    public final a g() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("28a364c6", new Object[]{this});
        }
        a aVar = new a(this);
        String d2 = ((lig) this.b).d("layer_manager_config");
        if (TextUtils.isEmpty(d2)) {
            return aVar;
        }
        String[] split = d2.split(",");
        int length = split.length;
        for (int i2 = 0; i2 < length; i2 += i) {
            String str = split[i2];
            if (!TextUtils.isEmpty(str)) {
                String trim = str.trim();
                String d3 = ((lig) this.b).d(trim);
                try {
                    BizConfig bizConfig = new BizConfig();
                    JSONObject parseObject = JSON.parseObject(d3);
                    if (parseObject != null) {
                        for (String str2 : parseObject.keySet()) {
                            bizConfig.mConfigs.put(str2, (ConfigItem) parseObject.getObject(str2, ConfigItem.class));
                        }
                    }
                    if (!bizConfig.mConfigs.isEmpty()) {
                        a.a(aVar).put(trim, bizConfig);
                        wdm.d("%s. --> complete bizId:{%s}. update", d, "layer_manager_config", trim);
                    }
                } catch (Throwable th) {
                    wdm.h("" + d + ".update key:" + trim + ",error.", th);
                }
                i = 1;
            }
        }
        try {
            String d4 = ((lig) this.b).d("directlyBlackList");
            if (!TextUtils.isEmpty(d4)) {
                for (String str3 : JSON.parseArray(d4, String.class)) {
                    if (!TextUtils.isEmpty(str3)) {
                        a.b(aVar).add(str3);
                    }
                }
            }
        } catch (Throwable th2) {
            wdm.h("" + d + ".parse directlyBlackString.error.", th2);
        }
        return aVar;
    }

    public final /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbeae968", new Object[]{this});
            return;
        }
        try {
            this.c = true;
            e(g());
        } catch (Throwable th) {
            wdm.h("updateConfig.isLaunchOptEnable.error.", th);
        }
    }

    public final void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266d48e3", new Object[]{this, aVar});
            return;
        }
        this.f18599a = a.a(aVar);
        PopLayer.getReference().getConfigMgr().setDirectlyBlackList(a.b(aVar));
        this.c = false;
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "LayerManager.ConfigMgr.onConfigChanged");
        d.t().I();
    }
}
