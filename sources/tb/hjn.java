package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hjn implements bhd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final hjn f20684a = new hjn();

        public static /* synthetic */ hjn a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hjn) ipChange.ipc$dispatch("91a15d05", new Object[0]);
            }
            return f20684a;
        }
    }

    public static hjn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hjn) ipChange.ipc$dispatch("55e555ca", new Object[0]);
        }
        return b.a();
    }

    public void b(bhd bhdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f955c4e2", new Object[]{this, bhdVar});
        }
    }

    public hjn() {
    }
}
