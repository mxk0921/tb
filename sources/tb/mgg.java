package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.kernel.adapter.IMonitorAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mgg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public String c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f24025a = false;
    public final Map<String, String> d = new ConcurrentHashMap();
    public final Map<String, String> e = new ConcurrentHashMap();
    public volatile boolean f = false;

    static {
        t2o.a(839909842);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e46cf0a", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((ConcurrentHashMap) this.e).put(str, str2);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a916c0", new Object[]{this, str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        c(str, currentTimeMillis + "");
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("915e108a", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((ConcurrentHashMap) this.d).put(str, str2);
        }
    }

    public void d(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a28c1da", new Object[]{this, bbsVar});
        } else if (!this.f) {
            this.f = true;
            JSONObject w = vbs.w(bbsVar);
            w.putAll(this.d);
            w.putAll(this.e);
            if (!TextUtils.isEmpty(this.b)) {
                this.f24025a = true;
            }
            w.put("hasError", (Object) Boolean.valueOf(this.f24025a));
            w.put("errorCode", (Object) this.b);
            w.put("errorMsg", (Object) this.c);
            if (CommonExtKt.j()) {
                String d = ncs.d(bbsVar);
                mcs.e(mcs.MODULE_MONITOR, mcs.EVENT_ON_COMMIT_LAUNCH_MONITOR, d, ncs.d(bbsVar) + "_monitor", w);
            }
            try {
                ((IMonitorAdapter) p8s.g(IMonitorAdapter.class)).trackStat(TLogAdapterImpl.TLOG_MODULE, "Launch", w, new JSONObject());
                TMSLogger.b("TMSLaunchMonitor", "TMS Launch monitor commit: " + w.toJSONString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c87e7886", new Object[]{this, str})).booleanValue();
        }
        Map<String, String> map = this.d;
        if (map == null) {
            return false;
        }
        return ((ConcurrentHashMap) map).containsKey(str);
    }

    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84af4295", new Object[]{this, str});
        }
        return (String) ((ConcurrentHashMap) this.e).get(str);
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("be642870", new Object[]{this});
        }
        return this.d;
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de70807", new Object[]{this, str});
        }
        Map<String, String> map = this.d;
        if (map == null) {
            return null;
        }
        return (String) ((ConcurrentHashMap) map).get(str);
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710bac24", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d624632", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }
}
