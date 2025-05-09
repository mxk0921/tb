package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rx8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY_STATE = "gateway_state";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27662a = false;

    static {
        t2o.a(729808949);
    }

    public static synchronized erb a(String str, Map<String, erb> map) {
        synchronized (rx8.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (erb) ipChange.ipc$dispatch("7d66ee8c", new Object[]{str, map});
            }
            erb erbVar = map.get(str);
            if (erbVar == null) {
                erbVar = new rwj(str);
                map.put(str, erbVar);
            }
            return erbVar;
        }
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0c3e50", new Object[]{application});
            return;
        }
        try {
            AlimamaAdvertising.instance().setApplicationContext(application);
            f27662a = vm2.n();
        } catch (Throwable th) {
            bqa.c("mCreativeView", th, new String[0]);
        }
        bqa.a("mCreativeView", "是否开启广告创意组件 mCreativeView = " + f27662a);
    }
}
