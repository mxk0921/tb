package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nzt implements e1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ozt f25055a;
    public int b = 0;

    static {
        t2o.a(962592928);
        t2o.a(962592943);
    }

    public nzt() {
        try {
            ozt oztVar = new ozt();
            this.f25055a = oztVar;
            oztVar.e("s-adashx.ut.taobao.com");
            oztVar.h(2);
            a(u51.i(o2w.k().g(), uzt.TAG_STATIC_TNET_HOST_PORT));
            a(iaq.a(o2w.k().g(), uzt.TAG_STATIC_TNET_HOST_PORT));
        } catch (Throwable unused) {
        }
    }

    public final void a(String str) {
        String trim;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (indexOf = (trim = str.trim()).indexOf(":")) != -1) {
            String substring = trim.substring(0, indexOf);
            int parseInt = Integer.parseInt(trim.substring(indexOf + 1, trim.length()));
            if (!TextUtils.isEmpty(substring) && parseInt > 0) {
                this.f25055a.e(substring);
                this.f25055a.f(parseInt);
            }
        }
    }

    @Override // tb.e1e
    public ozt b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozt) ipChange.ipc$dispatch("f80b62d6", new Object[]{this});
        }
        if (this.b >= rqo.e().f()) {
            return null;
        }
        return this.f25055a;
    }

    @Override // tb.e1e
    public void c(qe2 qe2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff5b6f3", new Object[]{this, qe2Var});
        } else if (qe2Var.a()) {
            this.b = 0;
        } else {
            this.b++;
        }
    }
}
