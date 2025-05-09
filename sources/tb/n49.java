package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.s5c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class n49 implements s5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static n49 c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Boolean> f24503a = new ConcurrentHashMap();
    public final List<s5c> b = new ArrayList();

    public n49(Context context) {
        if (n1r.c(context)) {
            try {
                e(new xmm(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (n1r.b(context)) {
            e(new z07());
        } else {
            e(new s5c.a());
        }
    }

    public static n49 d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n49) ipChange.ipc$dispatch("6916bf31", new Object[]{context});
        }
        if (c == null) {
            synchronized (n49.class) {
                try {
                    if (c == null) {
                        c = new n49(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    @Override // tb.s5c
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4723202a", new Object[]{this, str});
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            s5c s5cVar = (s5c) it.next();
            if (s5cVar.c(str) && !TextUtils.isEmpty(s5cVar.a(str))) {
                return s5cVar.a(str);
            }
        }
        return null;
    }

    @Override // tb.s5c
    public boolean b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc95f1c", new Object[]{this, context, str, str2})).booleanValue();
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            s5c s5cVar = (s5c) it.next();
            if (s5cVar.c(str)) {
                return s5cVar.b(context, str, str2);
            }
        }
        return false;
    }

    @Override // tb.s5c
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fefed0e", new Object[]{this, str})).booleanValue();
        }
        if (((ConcurrentHashMap) this.f24503a).containsKey(str)) {
            return ((Boolean) ((ConcurrentHashMap) this.f24503a).get(str)).booleanValue();
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            if (((s5c) it.next()).c(str)) {
                ((ConcurrentHashMap) this.f24503a).put(str, Boolean.TRUE);
                Log.e("FeatureSourceChain", "canUseHistoryFeature...");
                return true;
            }
        }
        ((ConcurrentHashMap) this.f24503a).put(str, Boolean.FALSE);
        return false;
    }

    public void e(s5c s5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86876f8", new Object[]{this, s5cVar});
        } else {
            this.b.add(s5cVar);
        }
    }
}
