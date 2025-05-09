package tb;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sa7 extends xe implements cod {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public anl b;
    public Context c;
    public i8x d;

    static {
        t2o.a(502268076);
        t2o.a(502268078);
    }

    public static /* synthetic */ Object ipc$super(sa7 sa7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/biz/weexadapter/DelegateSecondPageAdapterForTNode");
    }

    @Override // tb.xe
    public void a(Object obj, String str) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98b0527", new Object[]{this, obj, str});
            return;
        }
        i8x j = j();
        if (obj instanceof String) {
            uri = Uri.parse((String) obj);
        } else {
            uri = null;
        }
        j.i(uri, str);
    }

    @Override // tb.xe
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dd52081", new Object[]{this});
        }
        return null;
    }

    @Override // tb.cod
    public void back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58bdee", new Object[]{this});
        } else {
            ye.b(this.c, this.b);
        }
    }

    @Override // tb.xe
    public View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.c = context;
        return j().f(context);
    }

    @Override // tb.xe
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            j().h();
        }
    }

    @Override // tb.xe
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            j().j();
        }
    }

    @Override // tb.xe
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            j().g();
        }
    }

    @Override // tb.xe
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209251a0", new Object[]{this});
        } else {
            j().e();
        }
    }

    @Override // tb.xe
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ac292d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final i8x j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i8x) ipChange.ipc$dispatch("7e0e3ea7", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new i8x(this);
        }
        return this.d;
    }

    public void k(anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f7010f", new Object[]{this, anlVar});
        } else {
            this.b = anlVar;
        }
    }
}
