package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yum implements m94 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(768606246);
        t2o.a(768606240);
    }

    @Override // tb.m94
    public void a(i94 i94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13bf6a64", new Object[]{this, i94Var});
            return;
        }
        yzm e = i94Var.e();
        String str = i94Var.c().f22492a;
        String version = e.getVersion();
        int i = i94Var.c().b;
        int code = e.getCode();
        if (TextUtils.isEmpty(str)) {
            i94Var.g(new jy8(this, new IllegalArgumentException("parameters invalid"))).f();
        } else if (!TextUtils.equals(str, version) || i != code) {
            i94Var.g(new k6h()).f();
        } else {
            i94Var.g(new r0m()).f();
        }
    }

    @Override // tb.m94
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "PrerequisiteCheck";
    }
}
