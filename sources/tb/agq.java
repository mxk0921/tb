package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.global.MtopConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class agq implements asd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MtopConfig f15728a = null;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.String> a(tb.efq r23) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.agq.a(tb.efq):java.util.Map");
    }

    public final String b() {
        b2c f;
        Map<String, Integer> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36e8fda2", new Object[]{this});
        }
        d2c c2 = pa8.c();
        if (c2 == null || (f = c2.f()) == null || (c = ((ka8) f).c()) == null || c.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : c.entrySet()) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }
}
