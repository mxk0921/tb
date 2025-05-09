package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p7b implements jn2<n7b> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CONNECT_TIMEOUT = 15000;
    public static final int DEFAULT_READ_TIMEOUT = 10000;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25918a;
    public n7b b;

    static {
        t2o.a(620757020);
        t2o.a(620757013);
    }

    public synchronized n7b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n7b) ipChange.ipc$dispatch("8056a9da", new Object[]{this});
        } else if (this.f25918a) {
            return this.b;
        } else {
            this.f25918a = true;
            if (this.b == null) {
                this.b = new l17();
            }
            this.b.b(15000);
            this.b.c(10000);
            return this.b;
        }
    }

    public p7b b(n7b n7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p7b) ipChange.ipc$dispatch("3d479439", new Object[]{this, n7bVar});
        }
        fpm.e(true ^ this.f25918a, "HttpLoaderBuilder has been built, not allow with() now");
        this.b = n7bVar;
        return this;
    }
}
