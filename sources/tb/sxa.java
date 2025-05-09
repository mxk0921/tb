package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.data_highway.jni.DataHighwayJava;
import com.taobao.highway.jsbridge.HighwayJSBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f28336a = false;

    static {
        t2o.a(1034944561);
    }

    public static synchronized boolean a() {
        synchronized (sxa.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6946a0e8", new Object[0])).booleanValue();
            } else if (f28336a) {
                return true;
            } else {
                DataHighwayJava.setMTOP(new i5j());
                rxa.d().g();
                f28336a = true;
                fsw.h("HighwayJSBridge", HighwayJSBridge.class);
                return true;
            }
        }
    }
}
