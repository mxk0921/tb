package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.realtime.RealtimeRearrangeImpl;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ghd f20077a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(x3w x3wVar, List<x3w> list, String str, JSONObject jSONObject, nkn nknVar);

        void b(int i, String str, nkn nknVar);
    }

    static {
        t2o.a(352321894);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ghd ghdVar = this.f20077a;
        if (ghdVar != null) {
            ((RealtimeRearrangeImpl) ghdVar).g();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6623ee", new Object[]{this, aVar});
            return;
        }
        ghd ghdVar = this.f20077a;
        if (ghdVar != null) {
            ((RealtimeRearrangeImpl) ghdVar).n(aVar);
        }
    }

    public void d(ghd ghdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5619efbf", new Object[]{this, ghdVar});
        } else {
            this.f20077a = ghdVar;
        }
    }

    public void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66d604c4", new Object[]{this, bVar});
            return;
        }
        ghd ghdVar = this.f20077a;
        if (ghdVar != null) {
            ((RealtimeRearrangeImpl) ghdVar).o(bVar);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public boolean g(String str, nkn nknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37da6e80", new Object[]{this, str, nknVar})).booleanValue();
        }
        ghd ghdVar = this.f20077a;
        if (ghdVar != null) {
            return ((RealtimeRearrangeImpl) ghdVar).p(str, nknVar);
        }
        return false;
    }
}
