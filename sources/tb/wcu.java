package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wcu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f30616a;
    public String b;
    public long c = 1;
    public Map<String, String> d;

    static {
        t2o.a(354418799);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3af58b91", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5151964b", new Object[]{this});
        }
        return this.d;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c61a6d7", new Object[]{this});
        }
        return this.f30616a;
    }

    public wcu e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wcu) ipChange.ipc$dispatch("8655d585", new Object[]{this, new Long(j)});
        }
        if (j < 1) {
            j = 1;
        }
        this.c = j;
        return this;
    }

    public wcu f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wcu) ipChange.ipc$dispatch("c84d62ed", new Object[]{this, map});
        }
        this.d = map;
        return this;
    }

    public wcu g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wcu) ipChange.ipc$dispatch("12b3a5eb", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public wcu h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wcu) ipChange.ipc$dispatch("5c266831", new Object[]{this, str});
        }
        this.f30616a = str;
        return this;
    }
}
