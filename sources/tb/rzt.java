package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rzt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ozt f27702a;
    public final boolean b;

    static {
        t2o.a(962592884);
    }

    public rzt() {
        this.b = false;
        ozt oztVar = new ozt();
        this.f27702a = oztVar;
        oztVar.e("v6-adashx.ut.taobao.com");
        oztVar.h(1);
        try {
            Context g = o2w.k().g();
            String i = u51.i(g, "utanalytics_tnet_host_port_ipv6");
            if (!TextUtils.isEmpty(i)) {
                this.b = true;
            }
            b(i);
            String a2 = iaq.a(g, "utanalytics_tnet_host_port_ipv6");
            if (!TextUtils.isEmpty(a2)) {
                this.b = true;
            }
            b(a2);
        } catch (Throwable unused) {
        }
    }

    public ozt a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozt) ipChange.ipc$dispatch("14131e1c", new Object[]{this});
        }
        if (this.b) {
            return this.f27702a;
        }
        if (pzt.d().h()) {
            return null;
        }
        return this.f27702a;
    }

    public final synchronized void b(String str) {
        String trim;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str) && (indexOf = (trim = str.trim()).indexOf(":")) != -1) {
            String substring = trim.substring(0, indexOf);
            int parseInt = Integer.parseInt(trim.substring(indexOf + 1, trim.length()));
            if (!TextUtils.isEmpty(substring) && parseInt > 0) {
                this.f27702a.e(substring);
                this.f27702a.f(parseInt);
            }
        }
    }
}
