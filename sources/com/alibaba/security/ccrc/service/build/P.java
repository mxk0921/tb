package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class P extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(P p, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/P");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return a.a(this.mContext, str, str2, new O(this, wVCallBackContext));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;

        /* renamed from: a  reason: collision with root package name */
        public static final String f2567a = "JsDispatcher";
        public static final List<Class<? extends K>> b;

        static {
            ArrayList arrayList = new ArrayList();
            b = arrayList;
            arrayList.add(Q.class);
            arrayList.add(S.class);
            arrayList.add(T.class);
            arrayList.add(U.class);
        }

        public static boolean a(Context context, String str, String str2, L l) {
            try {
                for (Class<? extends K> cls : b) {
                    M m = (M) cls.getAnnotation(M.class);
                    if (!(m == null || m.name() == null)) {
                        for (String str3 : m.name()) {
                            if (str3.equals(str)) {
                                return ((K) cls.newInstance()).a(context, str, str2, l);
                            }
                        }
                        continue;
                    }
                }
                K.a(l, K.b, null);
            } catch (Throwable th) {
                Logging.e(f2567a, "dispatch fail", th);
                K.a(l, K.d, null);
            }
            return false;
        }
    }

    private nsw a(Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsw) ipChange.ipc$dispatch("95153ef3", new Object[]{this, map, new Boolean(z)});
        }
        nsw nswVar = new nsw(z ? "HY_SUCCESS" : "HY_FAILED");
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                nswVar.a(entry.getKey(), entry.getValue());
            }
        }
        return nswVar;
    }
}
