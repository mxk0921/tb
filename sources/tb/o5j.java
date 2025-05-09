package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class o5j extends cy1<o5j> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String g;
    public final String h;
    public final boolean i;
    public long j;
    public Map<String, String> k;

    static {
        t2o.a(794820628);
    }

    public o5j(String str, String str2, String str3, String str4, boolean z) {
        super(str, str2, str3);
        this.h = str4;
        this.i = z;
    }

    public static /* synthetic */ Object ipc$super(o5j o5jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/common/kit/tracker/model/MtopModel");
    }

    public static o5j j(String str, String str2, boolean z, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o5j) ipChange.ipc$dispatch("974b53d", new Object[]{str, str2, new Boolean(z), str3, str4});
        }
        return new o5j(str, str3, str4, str2, z);
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.h;
    }

    public Map<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.k;
    }

    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e5df7bb", new Object[]{this})).longValue();
        }
        return this.j;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.g;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public o5j p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o5j) ipChange.ipc$dispatch("9c70e1e4", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public o5j q(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o5j) ipChange.ipc$dispatch("55e42b64", new Object[]{this, map});
        }
        this.k = map;
        return this;
    }

    public o5j r(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o5j) ipChange.ipc$dispatch("1d8aa1e", new Object[]{this, new Float(f)});
        }
        this.b = f;
        return this;
    }

    public o5j s(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o5j) ipChange.ipc$dispatch("2d11d01f", new Object[]{this, new Long(j)});
        }
        this.j = j;
        return this;
    }

    public o5j t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o5j) ipChange.ipc$dispatch("4fde3dd", new Object[]{this, str});
        }
        this.g = str;
        return this;
    }
}
