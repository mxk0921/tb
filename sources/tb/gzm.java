package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boj f20328a;
    public boj b;
    public Intent c;
    public String d;
    public jzm e;

    static {
        t2o.a(578814058);
        t2o.a(578814026);
    }

    public static gzm a(boj bojVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzm) ipChange.ipc$dispatch("4f76de03", new Object[]{bojVar});
        }
        gzm gzmVar = new gzm();
        gzmVar.f20328a = bojVar;
        gzmVar.b = bojVar;
        gzmVar.e = Nav.getProcessorMonitor();
        return gzmVar;
    }

    public gzm c(boj bojVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzm) ipChange.ipc$dispatch("bb504cb0", new Object[]{this, bojVar});
        }
        this.b.addNext(bojVar);
        this.b = bojVar;
        return this;
    }

    public final void d(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eaa3352", new Object[]{this, objArr});
        } else if (!TextUtils.isEmpty(this.d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.d);
            sb.append(" ");
            if (objArr != null) {
                for (Object obj : objArr) {
                    sb.append(obj);
                    sb.append(" ");
                }
            }
            TLog.loge("Nav", sb.toString());
        }
    }

    public gzm e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzm) ipChange.ipc$dispatch("a4f9b90d", new Object[]{this, intent});
        }
        this.c = intent;
        return this;
    }

    public gzm f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzm) ipChange.ipc$dispatch("ce73d71a", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb A[LOOP:0: B:7:0x0023->B:32:0x00eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(tb.zmj r15) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gzm.b(tb.zmj):boolean");
    }
}
