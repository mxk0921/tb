package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class vn implements sbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f30116a = null;

    static {
        t2o.a(79691908);
        t2o.a(79691904);
    }

    private String g(String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbeea29b", new Object[]{this, str, agVar});
        }
        if (agVar == null) {
            return str;
        }
        return str + "|args=" + agVar;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e179e90d", new Object[0])).booleanValue();
        }
        Boolean bool = f30116a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            IpChange ipChange2 = AdapterForTLog.$ipChange;
            f30116a = Boolean.TRUE;
        } catch (ClassNotFoundException unused) {
            f30116a = Boolean.FALSE;
        }
        return f30116a.booleanValue();
    }

    @Override // tb.sbb
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            e(str, (ag) null);
        }
    }

    @Override // tb.sbb
    public void e(String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf9df276", new Object[]{this, str, agVar});
            return;
        }
        String g = g(str, agVar);
        if (h()) {
            AdapterForTLog.logd(ck.AURA_LOGGER, g);
        }
    }

    @Override // tb.sbb
    public void f(String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d89f4415", new Object[]{this, str, agVar});
            return;
        }
        String g = g(str, agVar);
        if (!h()) {
            Log.e(ck.AURA_LOGGER, g);
        } else {
            AdapterForTLog.loge(ck.AURA_LOGGER, g);
        }
    }

    @Override // tb.sbb
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            f(str, ck.b.b().a());
        }
    }

    @Override // tb.sbb
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
            return;
        }
        ck.b b = ck.b.b();
        f(str2, b.i("AURA/" + str).a());
    }
}
