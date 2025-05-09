package tb;

import android.text.TextUtils;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qy3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f26996a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final qy3 f26997a = new qy3();

        static {
            t2o.a(625999918);
        }

        public static /* synthetic */ qy3 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qy3) ipChange.ipc$dispatch("8a851d09", new Object[0]);
            }
            return f26997a;
        }
    }

    static {
        t2o.a(625999917);
    }

    public static qy3 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qy3) ipChange.ipc$dispatch("99c1292e", new Object[0]);
        }
        return a.a();
    }

    public boolean a(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75d370b5", new Object[]{this, baseConfigItem})).booleanValue();
        }
        if (!hst.a()) {
            wdm.a("ColdLaunchFrequency.checkColdLaunched.set.not on MainThread!!! cur thread name = " + Thread.currentThread().getName());
        }
        if (baseConfigItem == null) {
            return false;
        }
        if (!baseConfigItem.onlyColdLaunch) {
            return true;
        }
        return !this.f26996a.contains(baseConfigItem.indexID);
    }

    public void c(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3a2490", new Object[]{this, baseConfigItem});
            return;
        }
        if (!hst.a()) {
            wdm.a("ColdLaunchFrequency.updateColdLaunched.set.not on MainThread!!! cur thread name = " + Thread.currentThread().getName());
        }
        if (baseConfigItem != null && !TextUtils.isEmpty(baseConfigItem.indexID) && baseConfigItem.onlyColdLaunch) {
            this.f26996a.add(baseConfigItem.indexID);
        }
    }
}
