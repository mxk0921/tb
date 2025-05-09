package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pkv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f26149a;
    public static final gdh b = fih.getLog(pkv.class, (gdh) null);

    static {
        t2o.a(950009857);
    }

    public static synchronized pkv getInstance(Context context) {
        synchronized (pkv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pkv) ipChange.ipc$dispatch("9b6b77a4", new Object[]{context});
            }
            gdh gdhVar = b;
            gdhVar.d(">>>> getInstance");
            if (f26149a == null) {
                gdhVar.d(">>>> new UpdateInitializer().initTaoUpdate()");
                f26149a = context;
            }
            return new pkv();
        }
    }

    @Deprecated
    public void triggerBundleDownload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179aa813", new Object[]{this, str});
        } else {
            kjv.getInstance().addUpdateInfo(str);
        }
    }

    public void triggerDynamicDeployment(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d857cba7", new Object[]{this, str, str2});
        } else {
            triggerBundleDownload(str2);
        }
    }

    public void update(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafc9c04", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            kjv.getInstance().startUpdate(z, false);
        }
    }
}
