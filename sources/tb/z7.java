package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class z7 {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(336592901);
        }

        public z7 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z7) ipChange.ipc$dispatch("7ed922d2", new Object[]{this});
            }
            return new z7(this);
        }
    }

    static {
        t2o.a(336592899);
    }

    public z7(b bVar) {
    }
}
