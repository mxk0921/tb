package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.weex.WXEnvironment;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cuw implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17334a = "";

    static {
        t2o.a(85983241);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dab3ef7", new Object[]{this, str});
        } else {
            this.f17334a = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea521bf", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f17334a)) {
            hashMap.put(WXEnvironment.WEEX_CURRENT_KEY, this.f17334a);
        }
        return hashMap;
    }
}
