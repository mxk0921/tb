package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class bum {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16640a;
    public List<dum> b;
    public String c;

    static {
        t2o.a(815793750);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24310680", new Object[]{this});
        }
        String str = this.c;
        if (str != null) {
            return str;
        }
        ckf.y("mode");
        throw null;
    }

    public final List<dum> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("863c8b18", new Object[]{this});
        }
        List<dum> list = this.b;
        if (list != null) {
            return list;
        }
        ckf.y("subList");
        throw null;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d84f5a17", new Object[]{this});
        }
        String str = this.f16640a;
        if (str != null) {
            return str;
        }
        ckf.y("subListType");
        throw null;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66f09f6", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.c = str;
    }

    public final void e(List<dum> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2426f9b4", new Object[]{this, list});
            return;
        }
        ckf.g(list, "<set-?>");
        this.b = list;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("495317a7", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.f16640a = str;
    }
}
