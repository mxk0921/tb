package tb;

import android.text.TextUtils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wy8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31009a;
    public final long b;
    public long c = -1;

    public wy8(String str, long j) {
        this.f31009a = TextUtils.isEmpty(str) ? "default" : str;
        this.b = j;
    }

    public void a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e3c5512", new Object[]{this, map});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.c;
        if (j == -1 || currentTimeMillis - j > this.b) {
            this.c = currentTimeMillis;
            try {
                tx8 tx8Var = new tx8();
                if (map != null) {
                    tx8Var.f(map);
                }
                nzb.b().c(this.f31009a, tx8Var);
            } catch (Exception e) {
                ALog.e("falco.DiagnosisLogReporter", "sceneTrigger", null, "error", e.toString());
            }
        } else {
            ALog.e("falco.DiagnosisLogReporter", "sceneTrigger", null, "error", "Reporting frequency limit");
        }
    }
}
