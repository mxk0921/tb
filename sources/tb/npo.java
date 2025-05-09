package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class npo implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long CRITICAL_DURATION_MILLS = 15000;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24881a;
    public final String b;

    public npo(Context context, String str) {
        this.f24881a = context;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0131  */
    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> onJvmUncaughtCrash(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.npo.onJvmUncaughtCrash(java.lang.Thread, java.lang.Throwable):java.util.Map");
    }
}
