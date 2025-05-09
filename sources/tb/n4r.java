package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class n4r implements l8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432001);
        t2o.a(336592916);
    }

    @Override // tb.l8
    public String a(y7 y7Var) {
        zq zqVar;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c91e1658", new Object[]{this, y7Var});
        }
        String str = null;
        if (y7Var != null) {
            zqVar = y7Var.g();
        } else {
            zqVar = null;
        }
        if (zqVar != null) {
            str = zqVar.getBusinessID();
        }
        String str2 = "AbilityKit";
        if (str == null || ckf.b(str, str2)) {
            c2v instance = c2v.getInstance();
            ckf.f(instance, "UTPageHitHelper.getInstance()");
            str = instance.getCurrentPageName();
        }
        if (TextUtils.isEmpty(str)) {
            if (!(zqVar == null || (context = zqVar.getContext()) == null)) {
                str2 = context.getClass().getName();
            }
            str = str2;
        }
        ckf.d(str);
        return str;
    }
}
