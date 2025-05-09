package tb;

import android.app.Application;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.c0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ss7 implements c0c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences.Editor f28247a;
    public volatile boolean b = false;
    public final Application c;

    public ss7(Application application) {
        this.c = application;
    }

    @Override // tb.c0c.a
    public /* synthetic */ c0c.a a(String str, String str2) {
        b0c.b(this, str, str2);
        return this;
    }

    @Override // tb.c0c.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("977ebe45", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // tb.c0c.a
    public c0c.a c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0c.a) ipChange.ipc$dispatch("ab23e02e", new Object[]{this, str, str2});
        }
        g();
        this.b = true;
        String string = daq.i(this.c).getString(str, null);
        if (string != null) {
            str2 = string + "," + str2;
        }
        int i = 0;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            if (str2.charAt(i2) == ',') {
                i++;
            }
        }
        if (i >= 100) {
            return this;
        }
        this.f28247a.putString(str, str2);
        return this;
    }

    @Override // tb.c0c.a
    public void commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            return;
        }
        this.f28247a.commit();
        this.f28247a = null;
        this.b = false;
    }

    @Override // tb.c0c.a
    public c0c.a d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0c.a) ipChange.ipc$dispatch("5a3e8b33", new Object[]{this, str});
        }
        throw new RuntimeException("The method that cannot be called directly: DomainUnifiedEditor.incrementInt(@NonNull String key)");
    }

    @Override // tb.c0c.a
    public /* synthetic */ c0c.a e(Map map) {
        b0c.a(this, map);
        throw null;
    }

    @Override // tb.c0c.a
    public c0c.a f(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0c.a) ipChange.ipc$dispatch("17a3c93c", new Object[]{this, str, new Long(j)});
        }
        throw new RuntimeException("The method that cannot be called directly: DomainUnifiedEditor.incrementLong(@NonNull String key, int delta)");
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b831c96b", new Object[]{this});
        } else if (this.f28247a == null) {
            this.f28247a = daq.i(this.c).edit();
        }
    }

    @Override // tb.c0c.a
    public c0c.a putBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0c.a) ipChange.ipc$dispatch("fe7facba", new Object[]{this, str, new Boolean(z)});
        }
        g();
        this.b = true;
        this.f28247a.putBoolean(str, z);
        return this;
    }

    @Override // tb.c0c.a
    public c0c.a putFloat(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0c.a) ipChange.ipc$dispatch("64e1c7c2", new Object[]{this, str, new Float(f)});
        }
        g();
        this.b = true;
        this.f28247a.putFloat(str, f);
        return this;
    }

    @Override // tb.c0c.a
    public c0c.a putInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0c.a) ipChange.ipc$dispatch("cbf49b2", new Object[]{this, str, new Integer(i)});
        }
        g();
        this.b = true;
        this.f28247a.putInt(str, i);
        return this;
    }

    @Override // tb.c0c.a
    public c0c.a putLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0c.a) ipChange.ipc$dispatch("155380dc", new Object[]{this, str, new Long(j)});
        }
        g();
        this.b = true;
        this.f28247a.putLong(str, j);
        return this;
    }

    @Override // tb.c0c.a
    public c0c.a putString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0c.a) ipChange.ipc$dispatch("9ee922e9", new Object[]{this, str, str2});
        }
        g();
        this.b = true;
        this.f28247a.putString(str, str2);
        return this;
    }
}
