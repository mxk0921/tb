package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.util.Map;
import tb.ngd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j27 implements jgd, ngd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21713a;

    public j27(String str) {
        this.f21713a = str;
    }

    @Override // tb.ngd
    public void a(ngd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c269554", new Object[]{this, aVar});
        }
    }

    @Override // tb.ngd
    public void b(String str, Map<String, Object> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb808d0", new Object[]{this, str, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("args:");
        if (map != null) {
            str2 = map.toString();
        } else {
            str2 = "null";
        }
        sb.append(str2);
        info(sb.toString());
    }

    @Override // tb.ngd
    public void c(String str, Map<String, Object> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e42e39c", new Object[]{this, str, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("args:");
        if (map != null) {
            str2 = map.toString();
        } else {
            str2 = "null";
        }
        sb.append(str2);
        info(sb.toString());
    }

    @Override // tb.jgd
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32f8497", new Object[]{this, str});
        } else {
            Log.e(this.f21713a, str);
        }
    }

    @Override // tb.jgd
    public void debug(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("966c00a4", new Object[]{this, str});
        } else {
            Log.e(this.f21713a, str);
        }
    }

    @Override // tb.ngd
    public void e(String str, Map<String, Object> map, RSoException rSoException) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867f18d4", new Object[]{this, str, map, rSoException});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("args:");
        if (map != null) {
            str2 = map.toString();
        } else {
            str2 = "null";
        }
        sb.append(str2);
        error(sb.toString(), rSoException);
    }

    @Override // tb.jgd
    public void error(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
        } else {
            Log.e(this.f21713a, str);
        }
    }

    @Override // tb.jgd
    public void info(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dfc8bf", new Object[]{this, str});
        } else {
            Log.e(this.f21713a, str);
        }
    }

    @Override // tb.jgd
    public void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{this, str, th});
        } else {
            Log.e(this.f21713a, str, th);
        }
    }

    @Override // tb.jgd
    public void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{this, str, th});
        } else {
            Log.e(this.f21713a, str, th);
        }
    }
}
