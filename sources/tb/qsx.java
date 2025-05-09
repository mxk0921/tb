package tb;

import com.alibaba.wireless.aliprivacyext.plugins.ApWindVanePlugin;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommendation.TBRecommendPrivacy;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class qsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f26912a = new AtomicBoolean(false);

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        AtomicBoolean atomicBoolean = f26912a;
        if (!atomicBoolean.get()) {
            try {
                fsw.h("WVPrivacyManager", ApWindVanePlugin.class);
                fsw.i("TBRecommendPrivacy", TBRecommendPrivacy.class, false);
                atomicBoolean.set(true);
            } catch (Throwable unused) {
                g01.c("ApPluginManager", "register WindWane plugin failed");
            }
        }
    }
}
