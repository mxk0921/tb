package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class iph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f21490a;

    public static synchronized boolean a() {
        synchronized (iph.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7f971f1f", new Object[0])).booleanValue();
            } else if (f21490a) {
                return true;
            } else {
                f21490a = true;
                l6h c = bzn.d().c("mnnpybridge");
                l6h c2 = bzn.d().c("MNN");
                l6h c3 = bzn.d().c("MNN_CL");
                l6h c4 = bzn.d().c("MNN_Express");
                l6h c5 = bzn.d().c("MNNOpenCV");
                if (!c2.i()) {
                    Log.e("MNNPyBridge", "Load Remote libMNN.so failed.");
                }
                if (!c.i()) {
                    Log.e("MNNPyBridge", "Load Remote libmnnpybridge.so failed.");
                }
                if (!c3.i()) {
                    Log.e("MNNPyBridge", "Load Remote libMNN_CL.so failed.");
                }
                if (!c4.i()) {
                    Log.e("MNNPyBridge", "Load Remote libMNN_Express.so failed.");
                }
                if (!c5.i()) {
                    Log.e("MNNPyBridge", "Load Remote libMNNOpenCV.so failed.");
                }
                if (!c2.i() && !c.i()) {
                    return false;
                }
                AliNNPython.copyPyLib(null, "MNN.zip", "");
                return true;
            }
        }
    }
}
