package tb;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ServiceConnection;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wln implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f30769a;

    public wln(Context context) {
        this.f30769a = context;
    }

    public final String a() throws NoSuchFieldException, IllegalAccessException {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d60dd0ea", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        Context context = this.f30769a;
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            application = (Application) context.getApplicationContext();
        }
        yck b = yck.h(application).b("mLoadedApk");
        try {
            sb.append(b(b));
        } catch (Throwable th) {
            ehh.d(th);
        }
        try {
            sb.append(c(b));
        } catch (Throwable th2) {
            ehh.d(th2);
        }
        return sb.toString();
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        Throwable a2 = ust.a(th);
        if (!(a2 instanceof AndroidRuntimeException) && !(a2 instanceof IllegalArgumentException)) {
            return null;
        }
        String message = a2.getMessage();
        if (!"can't deliver broadcast".equals(message) && !"regist too many Broadcast Receivers".equals(message)) {
            return null;
        }
        try {
            String a3 = a();
            if (TextUtils.isEmpty(a3)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("receivers&services", a3);
            return hashMap;
        } catch (Throwable th2) {
            ehh.d(th2);
            return null;
        }
    }

    public final String b(yck yckVar) throws NoSuchFieldException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8743d619", new Object[]{this, yckVar});
        }
        StringBuilder sb = new StringBuilder();
        Map map = (Map) yckVar.b("mReceivers").g();
        HashMap hashMap = new HashMap();
        synchronized (map) {
            hashMap.putAll(map);
        }
        HashMap hashMap2 = new HashMap();
        for (Map map2 : hashMap.values()) {
            for (BroadcastReceiver broadcastReceiver : map2.keySet()) {
                String name = broadcastReceiver.getClass().getName();
                Integer num = (Integer) hashMap2.get(name);
                if (num != null) {
                    hashMap2.put(name, Integer.valueOf(num.intValue() + 1));
                } else {
                    hashMap2.put(name, 1);
                }
            }
        }
        sb.append("receivers:");
        sb.append(hashMap2);
        sb.append("\n");
        return sb.toString();
    }

    public final String c(yck yckVar) throws NoSuchFieldException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da099bd", new Object[]{this, yckVar});
        }
        StringBuilder sb = new StringBuilder();
        Map map = (Map) yckVar.b("mServices").g();
        HashMap hashMap = new HashMap();
        synchronized (map) {
            hashMap.putAll(map);
        }
        HashMap hashMap2 = new HashMap();
        for (Map map2 : hashMap.values()) {
            for (int i = 0; i < map2.size(); i++) {
                for (ServiceConnection serviceConnection : map2.keySet()) {
                    String name = serviceConnection.getClass().getName();
                    Integer num = (Integer) hashMap2.get(name);
                    if (num != null) {
                        hashMap2.put(name, Integer.valueOf(num.intValue() + 1));
                    } else {
                        hashMap2.put(name, 1);
                    }
                }
            }
        }
        sb.append("services:");
        sb.append(hashMap2);
        sb.append("\n");
        return sb.toString();
    }
}
