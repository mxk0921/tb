package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile qms f26830a = null;

    static {
        t2o.a(329253033);
    }

    public static qms a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qms) ipChange.ipc$dispatch("8b83293a", new Object[0]);
        }
        if (f26830a == null) {
            synchronized (qms.class) {
                try {
                    if (f26830a == null) {
                        f26830a = new qms();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f26830a;
    }

    public void b(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700b526f", new Object[]{this, mtopBusiness});
        } else if (c() && cns.f()) {
            HashMap hashMap = new HashMap();
            hashMap.put(aka.KEY_GREY, "true");
            mtopBusiness.headers((Map<String, String>) hashMap);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8178b864", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
