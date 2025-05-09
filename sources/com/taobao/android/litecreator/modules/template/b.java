package com.taobao.android.litecreator.modules.template;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.alibaba.ability.localization.Localization;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.template.UserAvatarRequester;
import com.taobao.android.litecreator.modules.template.a;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.login4android.Login;
import com.taobao.taobao.R;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.cg9;
import tb.fno;
import tb.ia1;
import tb.p78;
import tb.t2o;
import tb.unr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static TBLocationDTO d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f8308a = false;
    public final Set<String> b = new HashSet();
    public boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8309a;
        public final /* synthetic */ e b;

        public a(Context context, e eVar) {
            this.f8309a = context;
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.a(b.this, this.f8309a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.litecreator.modules.template.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class RunnableC0443b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f8310a;

        public RunnableC0443b(e eVar) {
            this.f8310a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e eVar = this.f8310a;
            if (eVar != null) {
                ((a.b) eVar).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements unr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f8311a;

        public c(e eVar) {
            this.f8311a = eVar;
        }

        @Override // tb.unr
        public void onLocationChanged(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                return;
            }
            if (tBLocationDTO != null) {
                b.d = tBLocationDTO;
                b.b(b.this).clear();
            }
            e eVar = this.f8311a;
            if (eVar == null) {
                return;
            }
            if (tBLocationDTO == null) {
                ((a.b) eVar).a();
            } else {
                ((a.b) eVar).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements UserAvatarRequester.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UserAvatarRequester.b f8312a;

        public d(b bVar, UserAvatarRequester.b bVar2) {
            this.f8312a = bVar2;
        }

        @Override // com.taobao.android.litecreator.modules.template.UserAvatarRequester.b
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            } else {
                this.f8312a.onFail(str, str2);
            }
        }

        @Override // com.taobao.android.litecreator.modules.template.UserAvatarRequester.b
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            fno.p("user_avatar_path", str);
            this.f8312a.onSuccess(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
    }

    static {
        t2o.a(511705294);
    }

    public static /* synthetic */ void a(b bVar, Context context, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cedcd344", new Object[]{bVar, context, eVar});
        } else {
            bVar.e(context, eVar);
        }
    }

    public static /* synthetic */ Set b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("18ec44c", new Object[]{bVar});
        }
        return bVar.b;
    }

    public static void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913a9cd7", new Object[]{map});
        } else if (map != null) {
            if (map.containsKey("key") && TextUtils.equals(SubstituteConstants.KEY_SUBSTITUTE_PAY_AVATAR, map.get("key"))) {
                String i = fno.i("user_avatar_path");
                if (cg9.l(i)) {
                    map.put("result", i);
                }
            } else if (map.containsKey("key") && TextUtils.equals(map.get("key"), "user_name")) {
                map.put("result", Login.getDisplayNick());
            } else if (map.containsValue("city") || map.containsValue("longitude") || map.containsValue("latitude")) {
                TBLocationDTO tBLocationDTO = d;
                if (tBLocationDTO == null) {
                    tBLocationDTO = TBLocationClient.d();
                }
                if (tBLocationDTO != null) {
                    j(map, tBLocationDTO);
                }
            }
        }
    }

    public static void j(Map<String, String> map, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37daafb1", new Object[]{map, tBLocationDTO});
        } else if (map.containsKey("biz") && TextUtils.equals(map.get("biz"), "str_value")) {
            if (map.containsKey("key") && TextUtils.equals(map.get("key"), "city")) {
                map.put("result", tBLocationDTO.getCityName());
            } else if (map.containsKey("key") && TextUtils.equals(map.get("key"), "longitude")) {
                map.put("result", tBLocationDTO.getLongitude());
            } else if (map.containsKey("key") && TextUtils.equals(map.get("key"), "latitude")) {
                map.put("result", tBLocationDTO.getLatitude());
            }
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c4d95d1", new Object[]{this, str});
        } else {
            ((HashSet) this.b).remove(str);
        }
    }

    public void d(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4718e697", new Object[]{this, context, str, map});
        } else if (map != null) {
            if (map.containsKey("key") && TextUtils.equals(SubstituteConstants.KEY_SUBSTITUTE_PAY_AVATAR, map.get("key"))) {
                this.f8308a = true;
            } else if (!map.containsKey("biz")) {
            } else {
                if (!map.containsValue("city") && !map.containsValue("longitude") && !map.containsValue("latitude")) {
                    return;
                }
                if (!TBLocationClient.f()) {
                    ((HashSet) this.b).add(str);
                } else if (TBLocationClient.d() == null && !this.c) {
                    k(context, null);
                    this.c = true;
                }
            }
        }
    }

    public final void e(Context context, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d85799", new Object[]{this, context, eVar});
            return;
        }
        TBLocationOption tBLocationOption = new TBLocationOption();
        tBLocationOption.setTimeout(TBLocationOption.Timeout.FIVE_SECONDS);
        TBLocationClient.g(context).h(tBLocationOption, new c(eVar), null);
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da41d8a", new Object[]{this, str})).booleanValue();
        }
        return ((HashSet) this.b).contains(str);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9e08f", new Object[]{this})).booleanValue();
        }
        return this.f8308a;
    }

    public void i(Context context, UserAvatarRequester.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94433a6", new Object[]{this, context, bVar});
        } else {
            new UserAvatarRequester().d(context, new d(this, bVar));
        }
    }

    public void k(Context context, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84b226f", new Object[]{this, context, eVar});
        } else if (TBLocationClient.f()) {
            e(context, eVar);
        } else {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (ActivityCompat.shouldShowRequestPermissionRationale(activity, p78.ACCESS_FINE_LOCATION)) {
                    ia1.b(activity);
                    return;
                }
            }
            com.taobao.runtimepermission.a.c(context, new String[]{p78.ACCESS_FINE_LOCATION}).w(Localization.q(R.string.gg_pub_template_uses_location)).z(new RunnableC0443b(eVar)).A(new a(context, eVar)).x(true).t("guangguang").m();
        }
    }
}
