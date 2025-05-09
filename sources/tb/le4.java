package tb;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.BackupFastSp;
import tb.je4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class le4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final je4 f23289a;
    public final SharedPreferences b;

    static {
        t2o.a(408944642);
    }

    public le4(String str, String str2, String str3, SharedPreferences sharedPreferences) {
        this.f23289a = new je4(str, str2, str3);
        this.b = sharedPreferences;
    }

    public static le4 c(String str, String str2, je4.a<SharedPreferences> aVar) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (le4) ipChange.ipc$dispatch("132245f6", new Object[]{str, str2, aVar});
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        SharedPreferences call = aVar.call();
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        if (call instanceof BackupFastSp) {
            str3 = "fast_sp";
        } else {
            str3 = "system_sp";
        }
        q19.b().commit(str, str2, str3, "true", "create", elapsedRealtimeNanos2 - elapsedRealtimeNanos);
        return new le4(str, str2, str3, call);
    }

    public je4 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (je4) ipChange.ipc$dispatch("b269ae7b", new Object[]{this});
        }
        return this.f23289a;
    }

    public SharedPreferences b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[]{this});
        }
        return this.b;
    }
}
