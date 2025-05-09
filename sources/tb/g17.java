package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g17 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f19675a = new Object();
    public StringBuilder b;
    public Formatter c;

    static {
        t2o.a(367001632);
    }

    public void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{this, str, str2, objArr});
        } else {
            c(str2, objArr);
        }
    }

    public void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{this, str, str2, objArr});
        } else {
            Log.e(str, c(str2, objArr));
        }
    }

    public final String c(String str, Object... objArr) {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bb8d953", new Object[]{this, str, objArr});
        }
        synchronized (this.f19675a) {
            try {
                StringBuilder sb = this.b;
                if (sb == null) {
                    this.b = new StringBuilder(250);
                } else {
                    sb.setLength(0);
                }
                if (this.c == null) {
                    this.c = new Formatter(this.b, Locale.getDefault());
                }
                this.c.format(str, objArr);
                substring = this.b.substring(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        return substring;
    }

    public void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{this, str, str2, objArr});
        } else {
            c(str2, objArr);
        }
    }

    public boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a546af9", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= 6) {
            return true;
        }
        return false;
    }

    public void f(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{this, str, str2, objArr});
        } else {
            c(str2, objArr);
        }
    }
}
