package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mpq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f24217a;
    public String b;

    public lpq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpq) ipChange.ipc$dispatch("81bf21cd", new Object[]{this});
        }
        b();
        return new npq(this.f24217a, this.b);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bd6235", new Object[]{this});
        } else if (this.f24217a == null) {
            throw new IllegalArgumentException("param context can not be null");
        } else if (this.b == null) {
            throw new IllegalArgumentException("param serviceName can not be null");
        }
    }

    public mpq c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpq) ipChange.ipc$dispatch("f9751f91", new Object[]{this, context});
        }
        this.f24217a = context;
        return this;
    }

    public mpq d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpq) ipChange.ipc$dispatch("34bf2652", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }
}
