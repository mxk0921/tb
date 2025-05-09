package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import com.taobao.schedule.ElasticSchedulerEngine;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> m = Collections.unmodifiableSet(new HashSet<String>() { // from class: com.taobao.schedule.RemoteConfig$1
        {
            add("com.taobao.android.dinamicx.view.DXNativeLinearLayout");
            add("com.taobao.android.dinamicx.view.DXNativeFrameLayout");
            add("android.view.View");
        }
    });

    /* renamed from: a  reason: collision with root package name */
    public boolean f26379a;
    public boolean b;
    public long c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public String g;
    public String h;
    public String i;
    public volatile Set<String> j;
    public long k;
    public SharedPreferences l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static final pxn INSTANCE = new pxn();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
            } else {
                pxn.a(pxn.this);
            }
        }
    }

    public static /* synthetic */ void a(pxn pxnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7886c19", new Object[]{pxnVar});
        } else {
            pxnVar.p();
        }
    }

    public static pxn d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pxn) ipChange.ipc$dispatch("8ef7e66", new Object[0]);
        }
        return b.INSTANCE;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aea3bdaa", new Object[]{this})).booleanValue();
        }
        if (this.k > 0 && System.currentTimeMillis() - this.k <= this.c) {
            return false;
        }
        return true;
    }

    public final String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{this, str, str2});
        }
        try {
            return OrangeConfig.getInstance().getConfig("elastic_schedule", str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c901c562", new Object[]{this});
        }
        return this.g;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4721c53", new Object[]{this});
        }
        return this.h;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf4c6eaa", new Object[]{this});
        }
        return this.i;
    }

    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f56371a1", new Object[]{this, str})).booleanValue();
        }
        return this.j.contains(str);
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b733ac07", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("554fe72b", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a04214f", new Object[]{this})).booleanValue();
        }
        return this.f26379a;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("947321ad", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94702aad", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void o(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8aaea0", new Object[]{this, str, obj});
            return;
        }
        SharedPreferences sharedPreferences = this.l;
        if (sharedPreferences != null) {
            if (obj == null) {
                sharedPreferences.edit().remove(str).apply();
            } else if (obj instanceof Integer) {
                sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).apply();
            } else if (obj instanceof String) {
                sharedPreferences.edit().putString(str, (String) obj).apply();
            } else if (obj instanceof Set) {
                Set<String> set = (Set) obj;
                if (set.isEmpty()) {
                    this.l.edit().remove(str).apply();
                } else {
                    this.l.edit().putStringSet(str, set).apply();
                }
            } else if (obj instanceof Boolean) {
                sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).apply();
            } else if (obj instanceof Long) {
                sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).apply();
            } else if (obj instanceof Float) {
                sharedPreferences.edit().putFloat(str, ((Float) obj).floatValue()).apply();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0043 -> B:40:0x0043). Please submit an issue!!! */
    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[]{this});
            return;
        }
        try {
            String c2 = c("schedule_enable", null);
            if (!TextUtils.isEmpty(c2)) {
                Boolean valueOf = Boolean.valueOf(c2);
                this.f26379a = valueOf.booleanValue();
                o("schedule_enable", valueOf);
            } else {
                o("schedule_enable", null);
            }
        } catch (Exception unused) {
        }
        try {
            String c3 = c("l2_env_enable", null);
            if (!TextUtils.isEmpty(c3)) {
                Boolean valueOf2 = Boolean.valueOf(c3);
                this.b = valueOf2.booleanValue();
                o("l2_env_enable", valueOf2);
            } else {
                o("l2_env_enable", null);
            }
        } catch (Exception unused2) {
        }
        try {
            String c4 = c("request_threshold", null);
            if (!TextUtils.isEmpty(c4)) {
                Long valueOf3 = Long.valueOf(c4);
                this.c = valueOf3.longValue();
                o("request_threshold", valueOf3);
            }
        } catch (Exception unused3) {
        }
        try {
            String c5 = c("mtop_prefetch_v1", null);
            if (!TextUtils.equals(c5, this.g)) {
                this.g = c5;
                o("mtop_prefetch_v1", c5);
            }
        } catch (Exception unused4) {
        }
        try {
            String c6 = c("preload_strategy", "[{\"name\":\"mytaobao_order\",\"once\":false,\"needParams\":true,\"supportCancel\":true,\"supportUnifiedDispatch\":true,\"className\":\"com.taobao.android.order.bundle.nav.list.OrderTouchDownUtils\",\"callMethod\":\"onTouchDown\",\"cancelMethod\":\"onTouchCancel\",\"matchViews\":[\"mtb_2024_order_v2\",\"mtb_2025_order\"],\"matchTypes\":[\"touch\",\"touch_cancel\"]},{\"name\":\"order_pic_preload\",\"once\":true,\"needParams\":true,\"supportCancel\":false,\"className\":\"com.taobao.android.order.bundle.nav.list.OrderTouchDownUtils\",\"callMethod\":\"onMyTBRenderFinish\",\"matchViews\":[\"mtb_2024_order_v2\",\"mtb_2025_order\"],\"matchTypes\":[\"view_visible\"]}]");
            if (!TextUtils.equals(c6, this.h)) {
                o("preload_strategy", c6);
            }
        } catch (Exception unused5) {
        }
        try {
            String c7 = c("scheduled_task_strategy", null);
            if (!TextUtils.equals(c7, this.i)) {
                this.i = c7;
                o("scheduled_task_strategy", c7);
                ElasticSchedulerEngine.m().t().n(this.i);
            }
        } catch (Exception unused6) {
        }
        try {
            String c8 = c("view_proxy_white_list", null);
            if (!TextUtils.isEmpty(c8)) {
                HashSet hashSet = new HashSet();
                Collections.addAll(hashSet, c8.split(","));
                o("view_proxy_white_list", hashSet);
            }
        } catch (Exception unused7) {
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9638c784", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.k = currentTimeMillis;
        o("last_request_time", Long.valueOf(currentTimeMillis));
    }

    public pxn() {
        this.f26379a = false;
        this.b = false;
        this.c = 43200000L;
        this.d = true;
        this.e = false;
        this.f = true;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = new HashSet();
        this.k = -1L;
        try {
            this.e = ABGlobal.isFeatureOpened(pa8.a(), "elastic_schedule_unified");
        } catch (Throwable th) {
            la8.b("elastic.RemoteConfig", "[init]error.", th, new Object[0]);
        }
    }

    public void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{"elastic_schedule"}, new c());
        SharedPreferences sharedPreferences = context.getSharedPreferences("elastic_schedule_store", 0);
        this.l = sharedPreferences;
        this.f26379a = sharedPreferences.getBoolean("schedule_enable", false);
        this.b = this.l.getBoolean("l2_env_enable", false);
        this.c = this.l.getLong("request_threshold", 43200000L);
        this.g = this.l.getString("mtop_prefetch_v1", null);
        this.h = this.l.getString("preload_strategy", "[{\"name\":\"mytaobao_order\",\"once\":false,\"needParams\":true,\"supportCancel\":true,\"supportUnifiedDispatch\":true,\"className\":\"com.taobao.android.order.bundle.nav.list.OrderTouchDownUtils\",\"callMethod\":\"onTouchDown\",\"cancelMethod\":\"onTouchCancel\",\"matchViews\":[\"mtb_2024_order_v2\",\"mtb_2025_order\"],\"matchTypes\":[\"touch\",\"touch_cancel\"]},{\"name\":\"order_pic_preload\",\"once\":true,\"needParams\":true,\"supportCancel\":false,\"className\":\"com.taobao.android.order.bundle.nav.list.OrderTouchDownUtils\",\"callMethod\":\"onMyTBRenderFinish\",\"matchViews\":[\"mtb_2024_order_v2\",\"mtb_2025_order\"],\"matchTypes\":[\"view_visible\"]}]");
        this.i = this.l.getString("scheduled_task_strategy", null);
        Set<String> stringSet = this.l.getStringSet("view_proxy_white_list", m);
        if (stringSet != null) {
            this.j = stringSet;
        }
        this.k = this.l.getLong("last_request_time", -1L);
    }
}
