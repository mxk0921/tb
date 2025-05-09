package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.edlp.tabbar.EdlpTabBarActionButtonProvider;
import com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a9f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f15612a = new AtomicBoolean(true);
    public static final AtomicBoolean b = new AtomicBoolean(true);

    static {
        t2o.a(1032847369);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2283682", new Object[0]);
        } else if (TextUtils.isEmpty(Login.getUserId())) {
            TLog.loge(a68.TAG, " userId is null ");
        }
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330d99c5", new Object[]{application});
        } else if (f15612a.getAndSet(false)) {
            TLog.loge(a68.TAG, "globalInit");
            ir7.e();
            cjh.a(application);
            if (aba.g().d(IEdlpTabBarActionButtonProvider.class) == null) {
                aba.g().f(IEdlpTabBarActionButtonProvider.class, new EdlpTabBarActionButtonProvider());
            }
            IEdlpTabBarActionButtonProvider iEdlpTabBarActionButtonProvider = (IEdlpTabBarActionButtonProvider) aba.g().d(IEdlpTabBarActionButtonProvider.class);
            if (!(iEdlpTabBarActionButtonProvider == null || iEdlpTabBarActionButtonProvider.d() == null)) {
                String str = iEdlpTabBarActionButtonProvider.d().f;
                TLog.loge(a68.TAG, "zCachePackageName|" + str);
                if (!TextUtils.isEmpty(str)) {
                    yox.n(Collections.singletonList(str));
                }
            }
            TLog.loge(a68.TAG, "end globalInit");
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60fa11a", new Object[]{str});
            return;
        }
        TLog.loge(a68.TAG, "unInit|" + str);
        b.set(false);
    }
}
