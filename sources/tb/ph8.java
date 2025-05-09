package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ph8 implements reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299817);
        t2o.a(589299812);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x04f1  */
    @Override // tb.reb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String c(tb.w4j r20) {
        /*
            Method dump skipped, instructions count: 1527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ph8.c(tb.w4j):java.lang.String");
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.ErrorCodeMappingAfterFilter";
    }
}
