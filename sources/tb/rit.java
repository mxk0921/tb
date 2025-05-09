package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f27415a;
    public final String b;
    public boolean c;

    static {
        t2o.a(993001919);
    }

    public rit(String str) {
        this.b = str;
        this.f27415a = null;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f2af4a0", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public rit(byte[] bArr) {
        this.b = null;
        this.f27415a = bArr;
    }
}
