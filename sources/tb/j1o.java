package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class j1o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final j1o f = new j1o();

    /* renamed from: a  reason: collision with root package name */
    public List<String> f21702a;
    public List<String> b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (j1o.this) {
                try {
                    if (!j1o.access$000(j1o.this)) {
                        String access$100 = j1o.access$100(j1o.this);
                        nhh.f("RepeatExposurePageMgr", "getConfigFromSp", access$100);
                        j1o.access$200(j1o.this, access$100);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements UTClientConfigMgr.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public String getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
            }
            return "repeatExposure";
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public void onChange(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
                return;
            }
            synchronized (j1o.this) {
                j1o.access$002(j1o.this, true);
                nhh.f("RepeatExposurePageMgr", "getConfigFromServer", str);
                j1o.access$200(j1o.this, str);
                j1o.access$300(j1o.this, str);
            }
        }
    }

    static {
        t2o.a(962593135);
    }

    public static /* synthetic */ boolean access$000(j1o j1oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6736349d", new Object[]{j1oVar})).booleanValue();
        }
        return j1oVar.e;
    }

    public static /* synthetic */ boolean access$002(j1o j1oVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98d16761", new Object[]{j1oVar, new Boolean(z)})).booleanValue();
        }
        j1oVar.e = z;
        return z;
    }

    public static /* synthetic */ String access$100(j1o j1oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a29831e8", new Object[]{j1oVar});
        }
        return j1oVar.b();
    }

    public static /* synthetic */ void access$200(j1o j1oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b3260e1", new Object[]{j1oVar, str});
        } else {
            j1oVar.a(str);
        }
    }

    public static /* synthetic */ void access$300(j1o j1oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61362c40", new Object[]{j1oVar, str});
        } else {
            j1oVar.c(str);
        }
    }

    public static j1o getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j1o) ipChange.ipc$dispatch("7ca850f2", new Object[0]);
        }
        return f;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        try {
            List<String> list = this.f21702a;
            if (list != null) {
                list.clear();
            }
            List<String> list2 = this.b;
            if (list2 != null) {
                list2.clear();
            }
        } catch (Exception unused) {
        }
        this.c = false;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.d) {
            this.d = true;
            zdt.c().f(new a());
            UTClientConfigMgr.c().e(new b());
        }
    }

    public boolean isRepeatExposurePage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6198890", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !str.startsWith("http")) {
            try {
                List<String> list = this.f21702a;
                if (list != null && list.contains(str)) {
                    return true;
                }
                List<String> list2 = this.b;
                if (list2 != null) {
                    if (list2.contains(str)) {
                        return false;
                    }
                }
                return this.c;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad98c5a", new Object[]{this});
        }
        Context b2 = wu3.c().b();
        if (b2 == null) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = b2.getSharedPreferences("ut_repeatExposure", 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString("repeatExposure", null);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void c(String str) {
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c5a12da", new Object[]{this, str});
            return;
        }
        Context b2 = wu3.c().b();
        if (b2 != null) {
            try {
                SharedPreferences sharedPreferences = b2.getSharedPreferences("ut_repeatExposure", 0);
                if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
                    edit.putString("repeatExposure", str);
                    edit.apply();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5028c023", new Object[]{this, str});
            return;
        }
        try {
            d();
            HashMap hashMap = (HashMap) JSON.parseObject(str, Map.class);
            List<String> list = (List) hashMap.get(TplMsg.VALUE_T_NATIVE_RETURN);
            this.f21702a = list;
            i = list != null ? list.size() : 0;
            try {
                this.b = (List) hashMap.get("w");
                List list2 = (List) hashMap.get("a");
                if (list2 == null || list2.size() != 1 || !TplMsg.VALUE_T_NATIVE_RETURN.equalsIgnoreCase((String) list2.get(0))) {
                    this.c = false;
                } else {
                    this.c = true;
                }
            } catch (Exception unused) {
                i = i;
                d();
                if (i < 1) {
                }
                k1o.getInstance().start();
            }
        } catch (Exception unused2) {
        }
        if (i < 1 || this.c) {
            k1o.getInstance().start();
        } else {
            k1o.getInstance().stop();
        }
    }
}
