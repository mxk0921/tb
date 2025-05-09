package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.qos.QoSHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d7n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final QoSHandler f17641a = new c7n(Looper.getMainLooper());

        public static /* synthetic */ QoSHandler a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (QoSHandler) ipChange.ipc$dispatch("ee5b8850", new Object[0]);
            }
            return f17641a;
        }
    }

    public static QoSHandler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QoSHandler) ipChange.ipc$dispatch("e234ac02", new Object[0]);
        }
        return a.a();
    }
}
