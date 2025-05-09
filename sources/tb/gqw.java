package tb;

import android.taobao.windvane.embed.EmbedViewDemo;
import android.taobao.windvane.embed.Empty;
import com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class gqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20174a = false;

    static {
        t2o.a(989855831);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        synchronized (gqw.class) {
            try {
                if (!f20174a) {
                    f20174a = true;
                    try {
                        IpChange ipChange2 = TRWidgetWVEmbedView.$ipChange;
                        fqw.g("widget", TRWidgetWVEmbedView.class, true);
                        fqw.g("demo", EmbedViewDemo.class, true);
                        fqw.g("empty", Empty.class, true);
                    } catch (Exception e) {
                        RVLLevel rVLLevel = RVLLevel.Error;
                        lcn.f(rVLLevel, "WindVane/WVEmbedInitializer", "failed to register widget component. " + e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
