package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.UltronConfigRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.UltronServerConfigResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.feg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qll {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final c c;

    /* renamed from: a  reason: collision with root package name */
    public final e7v f26812a = new e7v();
    public final List<String> b = new ArrayList();
    public final Map<String, b> d = new HashMap();
    public final Map<String, String> e = new ConcurrentHashMap();
    public final Map<String, String> f = new ConcurrentHashMap();
    public final Map<String, String> g = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            StringBuilder sb = new StringBuilder("onError, msg=");
            if (netResponse == null) {
                str = "null";
            } else {
                str = netResponse.getRetMsg();
            }
            sb.append(str);
            hha.b("PageConfigProvider", sb.toString());
            qll.b(qll.this, "SERVER_FAILED");
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            StringBuilder sb = new StringBuilder("onSystemError, pageCode=");
            if (netResponse == null) {
                str = "null";
            } else {
                str = netResponse.getRetMsg();
            }
            sb.append(str);
            hha.b("PageConfigProvider", sb.toString());
            qll.b(qll.this, "SERVER_FAILED");
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            Map<String, String> a2 = qll.a(qll.this).a(netBaseOutDo);
            if (a2 == null || a2.isEmpty()) {
                hha.c("PageConfigProvider", "onSuccess, result is empty.");
                qll.b(qll.this, "SERVER_EMPTY");
                return;
            }
            for (String str : qll.c(qll.this)) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = a2.get(str);
                    if (str2 instanceof String) {
                        hha.b("PageConfigProvider", "onSuccess, pageCode=" + str);
                        String str3 = str2;
                        qll.d(qll.this).put(str, str3);
                        qll.e(qll.this, str, str3, 1, "SERVER_SUCCESS");
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static final int SOURCE_ASSETS_CACHE = 3;
        public static final int SOURCE_FILE_CACHE = 2;
        public static final int SOURCE_SERVER = 1;

        /* renamed from: a  reason: collision with root package name */
        public final String f26814a;
        public teg b;

        static {
            t2o.a(295699224);
        }

        public b(String str, int i) {
            this.f26814a = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    static {
        t2o.a(295699222);
    }

    public qll(c cVar) {
        this.c = cVar;
    }

    public static /* synthetic */ e7v a(qll qllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7v) ipChange.ipc$dispatch("ba355384", new Object[]{qllVar});
        }
        return qllVar.f26812a;
    }

    public static /* synthetic */ void b(qll qllVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb00d6b", new Object[]{qllVar, str});
        } else {
            qllVar.i(str);
        }
    }

    public static /* synthetic */ List c(qll qllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9125a425", new Object[]{qllVar});
        }
        return qllVar.b;
    }

    public static /* synthetic */ Map d(qll qllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1de92ad8", new Object[]{qllVar});
        }
        return qllVar.g;
    }

    public static /* synthetic */ void e(qll qllVar, String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2fac615", new Object[]{qllVar, str, str2, new Integer(i), str3});
        } else {
            qllVar.k(str, str2, i, str3);
        }
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e61f09dd", new Object[]{this, str});
        }
        Application application = v2s.o().f().getApplication();
        if (application == null) {
            return null;
        }
        String path = application.getCacheDir().getPath();
        try {
            String a2 = rg9.a(path, str + q2s.JSON);
            if (!TextUtils.isEmpty(a2)) {
                return a2.replace("#{", "${");
            }
            return null;
        } catch (IOException e) {
            hha.b("PageConfigProvider", "getFileCacheConfig | e=" + e.getMessage());
            return null;
        }
    }

    public teg g(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (teg) ipChange.ipc$dispatch("9462bd8c", new Object[]{this, context, str, new Boolean(z)});
        }
        b bVar = (b) ((HashMap) this.d).get(str);
        if (bVar == null && z) {
            l(str, "GET_CONFIG");
            bVar = (b) ((HashMap) this.d).get(str);
        }
        if (bVar == null && z && yga.f() && TextUtils.equals(str, GLRenderType.GOODS_LIST.pageCode)) {
            j(context, str, "GET_CONFIG");
            bVar = (b) ((HashMap) this.d).get(str);
        }
        if (bVar == null) {
            return null;
        }
        return bVar.b;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45611e2", new Object[]{this});
            return;
        }
        UltronConfigRequest ultronConfigRequest = new UltronConfigRequest();
        ultronConfigRequest.pageCodes = this.b;
        if (pfa.D()) {
            ultronConfigRequest.domainCode = "taolivegoodsDT";
        }
        new c74(new a()).K(ultronConfigRequest, UltronServerConfigResponse.class);
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9900f22a", new Object[]{this, str});
            return;
        }
        hha.b("PageConfigProvider", "getFileCacheConfigs.");
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            l((String) it.next(), str);
        }
    }

    public final void j(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405fdd83", new Object[]{this, context, str, str2});
        } else if (!TextUtils.isEmpty(str) && context != null) {
            String a2 = wt2.a(context, GLRenderType.GOODS_LIST.pageCode + q2s.JSON);
            if (!TextUtils.isEmpty(a2)) {
                ((ConcurrentHashMap) this.e).put(str, a2);
                k(str, a2, 3, str2);
                hha.b("PageConfigProvider", "hitAssetsFileCacheConfig | pageCode=" + str + " reason=" + str2);
            }
        }
    }

    public final void k(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92f1e3d", new Object[]{this, str, str2, new Integer(i), str3});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            hha.b("PageConfigProvider", "hitConfig | param empty.");
        } else {
            if (!((HashMap) this.d).containsKey(str)) {
                hha.b("PageConfigProvider", "hitConfig | pageCode=" + str + "  source=" + i + " reason=" + str3);
                b bVar = new b(str2, i);
                ((HashMap) this.d).put(str, bVar);
                ((feg.a) this.c).a(str, bVar);
                ffg.c(str, i, str3);
            } else {
                hha.b("PageConfigProvider", "hitConfig already | pageCode=" + str + "  source=" + i + " reason=" + str3);
            }
            if (i == 1) {
                n(str, str2);
            }
        }
    }

    public final void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac0f428", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            String f = f(str);
            if (!TextUtils.isEmpty(f)) {
                ((ConcurrentHashMap) this.f).put(str, f);
                k(str, f, 2, str2);
                hha.b("PageConfigProvider", "hitSingleFileCacheConfig | pageCode=" + str + " reason=" + str2);
            }
        }
    }

    public void m(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212c6088", new Object[]{this, list});
            return;
        }
        hha.b("PageConfigProvider", "init | mPageCodes=" + this.b);
        if (list != null) {
            ((ArrayList) this.b).addAll(list);
            h();
        }
    }

    public final void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d273f4c8", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            g7v.a(str2, str);
        }
    }

    public void o(String str, teg tegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236a8202", new Object[]{this, str, tegVar});
            return;
        }
        b bVar = (b) ((HashMap) this.d).get(str);
        if (bVar != null) {
            bVar.b = tegVar;
        }
    }
}
