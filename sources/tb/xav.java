package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.nit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xav {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, xav> g = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final nit f31258a;
    public volatile List<String> b;
    public final LruCache<String, String> c = new LruCache<>(16);
    public final LruCache<String, bs2> d = new LruCache<>(4);
    public final Object e = new Object();
    public final String f;

    static {
        t2o.a(83886138);
    }

    public xav(Context context, String str) {
        String str2 = str + "_ultron_template_cache";
        this.f31258a = new nit.b().h(context.getApplicationContext()).i(str2 + ".db").l(str2).k(1).j(16777216L).g();
        this.f = str;
    }

    public static xav d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xav) ipChange.ipc$dispatch("6b04a237", new Object[]{context, str});
        }
        Map<String, xav> map = g;
        xav xavVar = (xav) ((HashMap) map).get(str);
        if (xavVar == null) {
            synchronized (xav.class) {
                try {
                    xavVar = (xav) ((HashMap) map).get(str);
                    if (xavVar == null) {
                        xavVar = new xav(context, str);
                        ((HashMap) map).put(str, xavVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return xavVar;
    }

    public static xav e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xav) ipChange.ipc$dispatch("9a04af14", new Object[]{str});
        }
        return (xav) ((HashMap) g).get(str);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c7946f", new Object[]{this, str});
            return;
        }
        synchronized (this.e) {
            this.d.remove(str);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b934808", new Object[]{this, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.e) {
                    if (this.b != null) {
                        this.b.remove(str);
                    }
                    this.c.remove(str);
                }
                this.f31258a.c(str);
            }
        } catch (Throwable th) {
            UnifyLog.m(this.f, "UltronTemplateManager", "deleteTemplateById", Log.getStackTraceString(th));
        }
    }

    public bs2 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bs2) ipChange.ipc$dispatch("625b2ed1", new Object[]{this, str});
        }
        return this.d.get(str);
    }

    public JSONObject f(String str) {
        String str2;
        byte[] d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("27e24613", new Object[]{this, str});
        }
        try {
            synchronized (this.e) {
                str2 = this.c.get(str);
            }
            if (str2 == null && (d = this.f31258a.d(str)) != null && d.length > 0) {
                str2 = new String(d, Charset.forName("UTF-8"));
                synchronized (this.e) {
                    this.c.put(str, str2);
                }
            }
            return JSON.parseObject(str2);
        } catch (Throwable th) {
            UnifyLog.m(this.f, "UltronTemplateManager", "getTemplateById exception", Log.getStackTraceString(th));
            return null;
        }
    }

    public List<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ff12f38", new Object[]{this});
        }
        if (this.b == null) {
            List<String> f = this.f31258a.f();
            synchronized (this.e) {
                try {
                    if (this.b == null) {
                        this.b = f;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.b == null) {
            return Collections.emptyList();
        }
        return this.b;
    }

    public void h(String str, bs2 bs2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ba8b00", new Object[]{this, str, bs2Var});
        } else if (!TextUtils.isEmpty(str) && bs2Var != null) {
            synchronized (this.e) {
                this.d.put(str, bs2Var);
            }
        }
    }

    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2864432", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                synchronized (this.e) {
                    if (this.b != null && !this.b.contains(str)) {
                        this.b.add(str);
                    }
                    if (this.c.get(str) == null) {
                        this.c.put(str, str2);
                    }
                }
                this.f31258a.i(str, str2.getBytes(Charset.forName("UTF-8")));
            } catch (Throwable th) {
                UnifyLog.m(this.f, "UltronTemplateManager", "saveTemplate", Log.getStackTraceString(th));
            }
        }
    }
}
