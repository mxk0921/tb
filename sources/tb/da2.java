package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class da2 implements JvmUncaughtCrashListener, AnrUncaughtListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17674a;

    public da2(Context context) {
        this.f17674a = context;
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a7e1f135", new Object[]{this});
        }
        try {
            HashMap hashMap = new HashMap();
            String a2 = rxv.a(this.f17674a, "build_id");
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put("bid", a2);
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.taobao.android.tcrash.AnrUncaughtListener
    public Map<String, Object> onAnrUncaught() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5dc54bb7", new Object[]{this});
        }
        return a();
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        return a();
    }
}
