package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y2k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f31807a;
    public String b;

    public x2k a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x2k) ipChange.ipc$dispatch("bab45b4a", new Object[]{this});
        }
        c();
        return new z2k(this.f31807a, this.b);
    }

    public a3k b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3k) ipChange.ipc$dispatch("c1681d2", new Object[]{this});
        }
        c();
        return new z2k(this.f31807a, this.b);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bd6235", new Object[]{this});
        } else if (this.f31807a == null) {
            throw new IllegalArgumentException("param context can not be null");
        } else if (this.b == null) {
            throw new IllegalArgumentException("param serviceName can not be null");
        }
    }

    public y2k d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y2k) ipChange.ipc$dispatch("91261c0e", new Object[]{this, context});
        }
        this.f31807a = context;
        return this;
    }

    public y2k e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y2k) ipChange.ipc$dispatch("21b32fad", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }
}
