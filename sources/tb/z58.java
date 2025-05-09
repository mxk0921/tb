package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.edlp.tabbar.EdlpTabBarActionButtonProvider;
import com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider;
import com.taobao.edlp.windvane.TBEdlpWVPlugin;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.scc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z58 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements scc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.scc.a
        public void onChanged(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af3d7442", new Object[]{this, new Boolean(z), str});
                return;
            }
            TLog.loge(a68.TAG, " ABTestChange " + z + "|" + str);
            IEdlpTabBarActionButtonProvider iEdlpTabBarActionButtonProvider = (IEdlpTabBarActionButtonProvider) aba.g().d(IEdlpTabBarActionButtonProvider.class);
            if (z) {
                if (iEdlpTabBarActionButtonProvider == null) {
                    aba.g().f(IEdlpTabBarActionButtonProvider.class, new EdlpTabBarActionButtonProvider());
                } else {
                    iEdlpTabBarActionButtonProvider.init();
                }
            } else if (iEdlpTabBarActionButtonProvider != null) {
                iEdlpTabBarActionButtonProvider.unInit();
            }
        }
    }

    static {
        t2o.a(1032847363);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        TLog.loge(a68.TAG, " high start init ");
        fsw.i("TBEdlpWVPlugin", TBEdlpWVPlugin.class, true);
        b();
        hqs.c();
        TLog.loge(a68.TAG, " high end init ");
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf09a5a", new Object[0]);
        } else {
            ((scc) n78.a(scc.class)).a(new a(), "newBarVersion_newUser");
        }
    }
}
