package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dlm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public clm f17902a;
    public String b;

    static {
        t2o.a(1022361871);
    }

    public dlm(Map<?, ?> map) {
        Map map2;
        ckf.g(map, "data");
        Object obj = map.get("header");
        clm clmVar = null;
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        this.f17902a = map2 != null ? new clm(map2) : clmVar;
        this.b = ht4.e(map, "data");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        return this.b;
    }

    public final clm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (clm) ipChange.ipc$dispatch("3e714f18", new Object[]{this});
        }
        return this.f17902a;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void d(clm clmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89535308", new Object[]{this, clmVar});
        } else {
            this.f17902a = clmVar;
        }
    }

    public final Map<String, Object> e() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        clm clmVar = this.f17902a;
        if (clmVar != null) {
            map = clmVar.y();
        } else {
            map = null;
        }
        return a.j(jpu.a("header", map), jpu.a("data", this.b));
    }
}
