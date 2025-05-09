package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.RequestType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y8o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31911a;
    public final String b;
    public Map<String, String> c;
    public RequestType d;

    static {
        t2o.a(996147219);
    }

    public y8o(String str) {
        this.b = null;
        this.c = null;
        this.d = RequestType.Normal;
        this.f31911a = str;
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("65ea693f", new Object[]{this});
        }
        return this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2335b484", new Object[]{this});
        }
        return this.b;
    }

    public RequestType c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestType) ipChange.ipc$dispatch("6222596", new Object[]{this});
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return null;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f31911a;
    }

    public void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f0be2f", new Object[]{this, map});
        } else {
            this.c = map;
        }
    }

    public void g(RequestType requestType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce2acfe", new Object[]{this, requestType});
        } else {
            this.d = requestType;
        }
    }

    public y8o(String str, String str2) {
        this.b = null;
        this.c = null;
        this.d = RequestType.Normal;
        this.f31911a = str;
        this.b = str2;
    }

    public y8o(String str, Map<String, String> map) {
        this.b = null;
        this.c = null;
        this.d = RequestType.Normal;
        this.f31911a = str;
        this.c = map;
    }
}
