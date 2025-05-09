package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ch5 implements zub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zub f17058a = g.c();

    static {
        t2o.a(444596662);
        t2o.a(444596664);
    }

    @Override // tb.zub
    public void a(String[] strArr, rpb rpbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba07db59", new Object[]{this, strArr, rpbVar, new Boolean(z)});
            return;
        }
        zub zubVar = this.f17058a;
        if (zubVar != null) {
            zubVar.a(strArr, rpbVar, z);
        }
    }

    @Override // tb.zub
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        zub zubVar = this.f17058a;
        if (zubVar == null) {
            return str3;
        }
        String config = zubVar.getConfig(str, str2, str3);
        if (eb5.C()) {
            h36.v("DXOrange key: " + str2 + " value： " + config);
        }
        hc6.d(str, str2, config);
        return config;
    }
}
