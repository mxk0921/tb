package tb;

import android.content.Context;
import com.alibaba.security.ccrc.service.build.P;
import com.alibaba.wireless.aliprivacyext.jsbridge.api.h;
import com.alibaba.wireless.aliprivacyext.jsbridge.api.i;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class nwx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<? extends osx>> f25011a;

    static {
        ArrayList arrayList = new ArrayList();
        f25011a = arrayList;
        arrayList.add(owx.class);
        arrayList.add(p7y.class);
        arrayList.add(psx.class);
        arrayList.add(n6y.class);
        arrayList.add(w9y.class);
        arrayList.add(oyx.class);
        arrayList.add(h.class);
        arrayList.add(o4y.class);
        arrayList.add(i.class);
        arrayList.add(v9y.class);
        arrayList.add(u5y.class);
    }

    public static boolean a(Context context, String str, String str2, pwx pwxVar) {
        g01.a(P.a.f2567a, "action:" + str);
        g01.a(P.a.f2567a, "params:" + str2);
        Iterator it = ((ArrayList) f25011a).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            Class cls = (Class) it.next();
            String[] name = ((c) cls.getAnnotation(c.class)).name();
            if (name != null && name.length > 0) {
                for (String str3 : name) {
                    if (str3.equals(str)) {
                        try {
                            return ((osx) cls.newInstance()).b(context, str, str2, pwxVar);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                continue;
            }
        }
    }
}
