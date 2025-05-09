package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class shx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final agu f28064a;
    public FloatWindow b;
    public bp9 c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    static {
        t2o.a(435159067);
    }

    public shx(agu aguVar) {
        this.f28064a = aguVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("331b7fe2", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1823cc35", new Object[]{this})).booleanValue();
        }
        if (!this.e || this.f) {
            return false;
        }
        return true;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.f28064a == null || this.b == null || this.c == null) {
            return false;
        }
        return true;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93919b7f", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4037dbee", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }
}
