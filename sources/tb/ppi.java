package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ppi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, lmi> f26225a = new HashMap();

    static {
        t2o.a(83886258);
    }

    public void a(String str, Object obj) {
        lmi lmiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1b0074", new Object[]{this, str, obj});
        } else if (!TextUtils.isEmpty(str) && (lmiVar = (lmi) ((HashMap) this.f26225a).get(str)) != null) {
            lmiVar.c(obj);
        }
    }

    public synchronized void b(lmi lmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab8c86a", new Object[]{this, lmiVar});
            return;
        }
        String b = lmiVar.b();
        if (!TextUtils.isEmpty(b)) {
            ((HashMap) this.f26225a).put(b, lmiVar);
        }
    }
}
