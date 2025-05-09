package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17315a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    static {
        t2o.a(1022361748);
    }

    public cth(Map<?, ?> map) {
        ckf.g(map, "data");
        this.f17315a = ht4.e(map, TBImageFlowMonitor.RESPONSE_CODE_MEASURE);
        this.b = ht4.e(map, jk.KEY_MAPPING_CODE);
        this.c = ht4.e(map, "errorMsg");
        this.d = ht4.e(map, jk.KEY_RET_CODE);
        this.e = ht4.e(map, "apiName");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return this.e;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d754d74", new Object[]{this});
        }
        return this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45f50135", new Object[]{this});
        }
        return this.f17315a;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this});
        }
        return this.d;
    }
}
