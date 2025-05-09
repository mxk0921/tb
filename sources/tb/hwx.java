package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.aliprivacyext.http.MTopHelper;
import com.alibaba.wireless.aliprivacyext.http.model.request.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class hwx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements g7b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f20936a;

        public a(Context context) {
            this.f20936a = context;
        }

        @Override // tb.g7b
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17e6aa22", new Object[]{this, aVar});
                return;
            }
            g01.a("PrivacyProfileManager", "syncResultToServer on success");
            TLog.loge("AliPrivacy", "PrivacyProfileManager", "syncResultToServer on success");
            hwx.c(hwx.this, this.f20936a, "innerAd");
            hwx.c(hwx.this, this.f20936a, "outerAd");
        }

        @Override // tb.g7b
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c33635a7", new Object[]{this, aVar});
                return;
            }
            g01.c("PrivacyProfileManager", "syncResultToServer on error");
            TLog.loge("AliPrivacy", "PrivacyProfileManager", "syncResultToServer error with errorCode: " + aVar.getClass() + ", " + aVar.getRetMsg());
            hwx.c(hwx.this, this.f20936a, "innerAd");
            hwx.c(hwx.this, this.f20936a, "outerAd");
        }
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context == null || context.getApplicationContext() == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return hxm.n(context, str);
    }

    public static /* synthetic */ void c(hwx hwxVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa502a4d", new Object[]{hwxVar, context, str});
        } else {
            hwxVar.e(context, str);
        }
    }

    public static boolean d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        if (context != null && context.getApplicationContext() != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return hxm.J(context, str, str2);
        }
        return false;
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        String a2 = a(context, "innerAd");
        String a3 = a(context, "outerAd");
        g01.a("PrivacyProfileManager", "privacyProfileConsume innerAdResult: " + a2 + " outerAdResult: " + a3);
        if (!TextUtils.isEmpty(a2) || !TextUtils.isEmpty(a3)) {
            f(context, a2, a3);
        }
        String a4 = a(context, "recommend");
        g01.a("PrivacyProfileManager", "privacyProfileConsume recommendResult: " + a4);
        if (a4 != null) {
            rsx.a(context, Boolean.parseBoolean(a4));
            e(context, "recommend");
        }
    }

    public final void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
        } else if (context != null && context.getApplicationContext() != null && !TextUtils.isEmpty(str)) {
            hxm.u(context, str);
        }
    }

    public final void f(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{this, context, str, str2});
            return;
        }
        a aVar = new a(context);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("tagSource", "internalTag");
            hashMap.put("tagValue", str);
            arrayList.add(hashMap);
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("tagSource", "externalTag");
            hashMap2.put("tagValue", str2);
            arrayList.add(hashMap2);
        }
        d dVar = new d();
        dVar.tagValues = mwx.e(arrayList);
        g01.a("PrivacyProfileManager", "syncResultToServer: " + dVar.tagValues);
        MTopHelper.b(context, dVar, aVar);
    }
}
