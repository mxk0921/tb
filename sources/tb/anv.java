package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class anv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final d f15890a = (d) xck.a(d.class, "com.taobao.android.upp.UppProtocolImpl");

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("68af63ee", new Object[0]);
            }
            return f15890a;
        }
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("848388e4", new Object[0]);
        }
        return a.a();
    }
}
