package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleStatusService;
import com.taobao.android.tscheduleprotocol.MultiProcessScheduleProtocol;
import com.taobao.android.tscheduleprotocol.RenderScheduleProtocol;
import com.taobao.android.tscheduleprotocol.TScheduleHTTPProtocol;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vms {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROTOCOL_BIZ_CODE_H5 = "h5";
    public static final String PROTOCOL_BIZ_CODE_MINIAPP = "miniApp";
    public static final String PROTOCOL_BIZ_CODE_PHA = "pha";
    public static final String PROTOCOL_TYPE_MULTI = "multiProcess";
    public static final String PROTOCOL_TYPE_RENDER = "render";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f30112a;
    public final Map<String, String> b;
    public final Map<String, RenderScheduleProtocol> c;
    public final Map<String, MultiProcessScheduleProtocol> d;
    public TScheduleHTTPProtocol e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static final vms instance = new vms();

        static {
            t2o.a(329252956);
        }
    }

    static {
        t2o.a(329252954);
    }

    public static vms c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vms) ipChange.ipc$dispatch("c0b3a7c0", new Object[0]);
        }
        return b.instance;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e2aeb5f", new Object[]{this});
            return;
        }
        try {
            Map<String, RenderScheduleProtocol> map = this.c;
            if (map != null && !((HashMap) map).isEmpty()) {
                for (RenderScheduleProtocol renderScheduleProtocol : ((HashMap) this.c).values()) {
                    renderScheduleProtocol.clearPreloadedInstances();
                }
            }
            TScheduleStatusService.f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized TScheduleHTTPProtocol b() {
        try {
            if (this.e == null) {
                Object newInstance = Class.forName("com.alibaba.triver.kit.alibaba.prefetch.HeaderGetter").newInstance();
                if (newInstance instanceof TScheduleHTTPProtocol) {
                    this.e = (TScheduleHTTPProtocol) newInstance;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    public synchronized MultiProcessScheduleProtocol d(String str) {
        MultiProcessScheduleProtocol multiProcessScheduleProtocol;
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MultiProcessScheduleProtocol multiProcessScheduleProtocol2 = (MultiProcessScheduleProtocol) ((HashMap) this.d).get(str);
        if (multiProcessScheduleProtocol2 == null) {
            String str2 = (String) ((HashMap) this.b).get(str);
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            try {
                Object newInstance = Class.forName(str2).newInstance();
                if (newInstance instanceof MultiProcessScheduleProtocol) {
                    multiProcessScheduleProtocol = (MultiProcessScheduleProtocol) newInstance;
                    try {
                        ((HashMap) this.d).put(str, multiProcessScheduleProtocol);
                        multiProcessScheduleProtocol2 = multiProcessScheduleProtocol;
                    } catch (Throwable th2) {
                        th = th2;
                        zdh.b("TS.protocol", "new instance error", th);
                        if (multiProcessScheduleProtocol == null) {
                            ((HashMap) this.b).remove(str);
                            zdh.a("TS.protocol", "create multiprocess instance faild, clear class");
                        }
                        multiProcessScheduleProtocol2 = multiProcessScheduleProtocol;
                        return multiProcessScheduleProtocol2;
                    }
                }
                if (multiProcessScheduleProtocol2 == null) {
                    ((HashMap) this.b).remove(str);
                    zdh.a("TS.protocol", "create multiprocess instance faild, clear class");
                }
            } catch (Throwable th3) {
                th = th3;
                multiProcessScheduleProtocol = multiProcessScheduleProtocol2;
            }
        }
        return multiProcessScheduleProtocol2;
    }

    public synchronized RenderScheduleProtocol e(String str) {
        RenderScheduleProtocol renderScheduleProtocol;
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        RenderScheduleProtocol renderScheduleProtocol2 = (RenderScheduleProtocol) ((HashMap) this.c).get(str);
        if (renderScheduleProtocol2 == null) {
            String str2 = (String) ((HashMap) this.f30112a).get(str);
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            try {
                Object newInstance = Class.forName(str2).newInstance();
                if (newInstance instanceof RenderScheduleProtocol) {
                    renderScheduleProtocol = (RenderScheduleProtocol) newInstance;
                    try {
                        ((HashMap) this.c).put(str, renderScheduleProtocol);
                        renderScheduleProtocol2 = renderScheduleProtocol;
                    } catch (Throwable th2) {
                        th = th2;
                        zdh.b("TS.protocol", "new instance error", th);
                        if (renderScheduleProtocol == null) {
                            ((HashMap) this.f30112a).remove(str);
                            zdh.a("TS.protocol", "create render instance protocol faild, clear class");
                        }
                        renderScheduleProtocol2 = renderScheduleProtocol;
                        return renderScheduleProtocol2;
                    }
                }
                if (renderScheduleProtocol2 == null) {
                    ((HashMap) this.f30112a).remove(str);
                    zdh.a("TS.protocol", "create render instance protocol faild, clear class");
                }
            } catch (Throwable th3) {
                th = th3;
                renderScheduleProtocol = renderScheduleProtocol2;
            }
        }
        return renderScheduleProtocol2;
    }

    public void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ed194b", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.equals((String) ((HashMap) this.b).get(str), str2)) {
            ((HashMap) this.b).put(str, str2);
            ((HashMap) this.d).remove(str);
            kaj.e(str, str2);
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ec256b", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.equals((String) ((HashMap) this.f30112a).get(str), str2)) {
            ((HashMap) this.f30112a).put(str, str2);
            ((HashMap) this.c).remove(str);
            kaj.f(str, str2);
        }
    }

    public void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2413404", new Object[]{this, str, str2});
            return;
        }
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.d).remove(str);
    }

    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134fee4", new Object[]{this, str, str2});
            return;
        }
        ((HashMap) this.f30112a).put(str, str2);
        ((HashMap) this.c).remove(str);
    }

    public vms() {
        this.f30112a = new HashMap(4);
        this.b = new HashMap(4);
        this.c = new HashMap(4);
        this.d = new HashMap(4);
    }
}
