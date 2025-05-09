package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static i2v b = null;

    /* renamed from: a  reason: collision with root package name */
    public final h2v f21062a = new h2v();

    static {
        t2o.a(962593317);
    }

    public static i2v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i2v) ipChange.ipc$dispatch("5416c7cc", new Object[0]);
        }
        if (b == null) {
            synchronized (i2v.class) {
                try {
                    if (b == null) {
                        b = new i2v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Deprecated
    public h2v getUTPluginConfigMgr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h2v) ipChange.ipc$dispatch("bee0cfb1", new Object[]{this});
        }
        return this.f21062a;
    }

    @Deprecated
    public synchronized void registerPlugin(g2v g2vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736cca4b", new Object[]{this, g2vVar});
        } else {
            this.f21062a.registerPlugin(g2vVar);
        }
    }

    public synchronized void unregisterPlugin(g2v g2vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37d4c24", new Object[]{this, g2vVar});
        } else {
            this.f21062a.unregisterPlugin(g2vVar);
        }
    }

    public synchronized void registerPlugin(g2v g2vVar, boolean z, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b265cb", new Object[]{this, g2vVar, new Boolean(z), list, list2});
        } else if (g2vVar == null) {
            nhh.i("UTPluginMgr", "registerPlugin listener is null");
        } else if (TextUtils.isEmpty(g2vVar.getPluginName())) {
            nhh.i("UTPluginMgr", "registerPlugin listenerName is null");
        } else {
            g2vVar.setUTPluginParam(false, z, list, list2);
            registerPlugin(g2vVar);
        }
    }
}
