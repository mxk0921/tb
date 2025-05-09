package tb;

import android.taobao.windvane.export.cache.memory.MemoryResWarmupManager;
import android.taobao.windvane.export.cache.memory.model.ResourceItemModel;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class jca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME_SPACE = "themis_prewarm_config";
    public static final String TAG = "GlobalResourceWarmupTask";

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f21915a = new AtomicBoolean(false);

    static {
        t2o.a(989855771);
    }

    public static /* synthetic */ AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]);
        }
        return f21915a;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        v7t.i(TAG, "init");
        OrangeConfig.getInstance().registerListener(new String[]{NAME_SPACE}, new a(), true);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            List<ResourceItemModel> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (jca.NAME_SPACE.equals(str)) {
                v7t.i(jca.TAG, "onConfigUpdate");
                String customConfig = OrangeConfig.getInstance().getCustomConfig(jca.NAME_SPACE, null);
                if (!TextUtils.isEmpty(customConfig)) {
                    try {
                        list = JSON.parseArray(customConfig, ResourceItemModel.class);
                    } catch (Throwable th) {
                        v7t.e(jca.TAG, "parse config error", th, new Object[0]);
                        list = null;
                    }
                    if (list == null) {
                        v7t.d(jca.TAG, "parse config error");
                    } else if (jca.a().compareAndSet(false, true)) {
                        for (ResourceItemModel resourceItemModel : list) {
                            if (resourceItemModel != null) {
                                MemoryResWarmupManager.j(resourceItemModel, null);
                            }
                        }
                    }
                }
            }
        }
    }
}
