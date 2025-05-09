package tb;

import com.alibaba.ability.impl.file.FileAbility;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class op {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Long f25538a = -1L;
    public long b = -1;
    public long c = -1;

    static {
        t2o.a(374341650);
    }

    public static op a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (op) ipChange.ipc$dispatch("dcafb5d3", new Object[0]);
        }
        op opVar = new op();
        opVar.f25538a = Long.valueOf((long) FileAbility.MAX_FILE_SIZE);
        opVar.b = 0L;
        opVar.c = 0L;
        return opVar;
    }

    public void b(op opVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207a3232", new Object[]{this, opVar});
            return;
        }
        if (opVar.f25538a.longValue() >= 0) {
            this.f25538a = opVar.f25538a;
        }
        long j = opVar.b;
        if (j >= 0) {
            this.b = j;
        }
        long j2 = opVar.c;
        if (j2 >= 0) {
            this.c = j2;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuffer stringBuffer = new StringBuffer("AVFSCacheConfig{limitSize=");
        stringBuffer.append(pp.a(this.f25538a.longValue()));
        stringBuffer.append(", fileMemMaxSize=");
        stringBuffer.append(pp.a(this.b));
        stringBuffer.append(", sqliteMemMaxSize=");
        stringBuffer.append(pp.a(this.c));
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
