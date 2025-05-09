package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.desktop.common.request.CommonMtopRequest;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class asg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f15975a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements nwc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.nwc
        public void onError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            hgh.d("LinkRouterService onError retMsg: " + str2);
        }

        @Override // tb.nwc
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            hgh.d("LinkRouterService onSuccess response: " + str);
            asg.a(asg.this, str);
        }
    }

    static {
        t2o.a(437256195);
    }

    public static /* synthetic */ void a(asg asgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf84a02", new Object[]{asgVar, str});
        } else {
            asgVar.e(str);
        }
    }

    public final boolean b(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5de3550", new Object[]{this, hashMap})).booleanValue();
        }
        if (!hashMap.containsKey("currentLocale") || Locale.CHINESE.getLanguage().equals((String) hashMap.get("currentLocale"))) {
            return true;
        }
        return false;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50ee13f6", new Object[]{this});
        }
        s3l.b(this.f15975a);
        String a2 = k3l.a(this.f15975a);
        hgh.d("LinkRouterService deviceOaid: " + a2);
        return a2;
    }

    public void d(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337c2205", new Object[]{this, context, hashMap});
            return;
        }
        try {
            this.f15975a = context;
            if (!b9l.j(context)) {
                hgh.d("LinkRouterService orange not enable");
            } else if (!b(hashMap)) {
                hgh.d("LinkRouterService language limit");
            } else if (!qj7.n()) {
                hgh.d("LinkRouterService not oppo brand");
            } else if (!qj7.i()) {
                hgh.d("LinkRouterService not first install");
            } else {
                f(c());
            }
        } catch (Throwable th) {
            hgh.d("LinkRouterService error: " + th.getMessage());
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6faf31", new Object[]{this, str});
            return;
        }
        String string = JSON.parseObject(str).getString("h5Url");
        if (!TextUtils.isEmpty(string)) {
            Nav.from(this.f15975a).toUri(string);
            hgh.d("LinkRouterService nav success url: " + string);
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723582e8", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("deviceId", str);
        hashMap.put(k7m.KEY_DEVICE_TYPE, "2");
        new CommonMtopRequest().a(xd7.DESKTOP_ROUTER_LINK_API, "1.0", hashMap, false, new a(), null);
    }
}
