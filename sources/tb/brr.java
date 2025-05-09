package tb;

import android.content.Context;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class brr implements n5k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16581a;
    public final vd2 b = vd2.a();

    public brr(Context context) {
        this.f16581a = context;
    }

    public void a(String str, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d10499e", new Object[]{this, str, th, map});
        } else if (th != null) {
            try {
                ud2 ud2Var = new ud2();
                ud2Var.b = AggregationType.CONTENT;
                ud2Var.f29301a = "IMAGE_ERROR";
                ud2Var.d = str;
                ud2Var.i = map;
                ud2Var.k = th;
                this.b.c(this.f16581a, ud2Var);
            } catch (Exception unused) {
                fiv.c("TBNonCriticalErrorReporter", "onNonCriticalErrorHappen error", new Object[0]);
            }
        }
    }
}
