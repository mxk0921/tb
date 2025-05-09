package tb;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ldq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ldq d = new ldq();
    public final Set<String> b;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f23277a = new CopyOnWriteArrayList();
    public volatile boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f23278a;

        public a(Application application) {
            this.f23278a = application;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("LargeScreenDisplayRules");
            if (configs != null) {
                TLog.loge("TBAutoSize.SplitPolicy", "orange config: " + new JSONObject(map));
                this.f23278a.getSharedPreferences("LargeScreenDisplayRules", 0).edit().putString("fullScreenUrl", configs.get("fullScreenUrl")).putString("addComponentClassName", configs.get("addComponentClassName")).putString("deleteComponentClassName", configs.get("deleteComponentClassName")).commit();
                ldq.this.g(this.f23278a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f23279a;
        public final String b;
        public final String c;
        public final List<b> d;

        public /* synthetic */ b(int i, String str, String str2, a aVar) {
            this(i, str, str2);
        }

        public static /* synthetic */ b a(List list, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8d71daa5", new Object[]{list, new Integer(i), str, str2});
            }
            return d(list, i, str, str2);
        }

        public static /* synthetic */ List b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("3418907a", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static b d(List<b> list, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ecd7963c", new Object[]{list, new Integer(i), str, str2});
            }
            if (list == null) {
                return null;
            }
            if (1 == i && TextUtils.isEmpty(str2)) {
                return null;
            }
            if (3 == i && (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2))) {
                return null;
            }
            for (b bVar : list) {
                if (i == bVar.f23279a && TextUtils.equals(str, bVar.b) && TextUtils.equals(str2, bVar.c)) {
                    return bVar;
                }
            }
            return null;
        }

        public void c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2cdc784", new Object[]{this, bVar});
            } else {
                ((CopyOnWriteArrayList) this.d).add(bVar);
            }
        }

        public final boolean e(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab05e6e9", new Object[]{this, uri})).booleanValue();
            }
            if (((CopyOnWriteArrayList) this.d).size() == 0) {
                return true;
            }
            Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
            while (it.hasNext()) {
                if (((b) it.next()).g(uri)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean f(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c16cc3d", new Object[]{this, uri})).booleanValue();
            }
            int i = this.f23279a;
            if (1 == i) {
                if ("*".equals(this.c)) {
                    return true;
                }
                return TextUtils.equals(this.c, uri.getHost());
            } else if (2 == i) {
                if ("/*".equals(this.c)) {
                    return true;
                }
                if ((TextUtils.isEmpty(this.c) || TextUtils.equals(this.c, "/")) && (TextUtils.isEmpty(uri.getPath()) || TextUtils.equals(uri.getPath(), "/"))) {
                    return true;
                }
                return TextUtils.equals(this.c, uri.getPath());
            } else if (3 != i) {
                return false;
            } else {
                String queryParameter = uri.getQueryParameter(this.b);
                if ("*".equals(this.c)) {
                    return true;
                }
                return TextUtils.equals(queryParameter, this.c);
            }
        }

        public boolean g(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6aff5bc9", new Object[]{this, uri})).booleanValue();
            }
            if (!f(uri)) {
                return false;
            }
            return e(uri);
        }

        public b(int i, String str, String str2) {
            this.d = new CopyOnWriteArrayList();
            this.f23279a = i;
            this.b = str;
            this.c = str2;
        }
    }

    public ldq() {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.b = copyOnWriteArraySet;
        b("//meta.m.taobao.com/app/mtb/app-success-new/success");
        copyOnWriteArraySet.add("com.taobao.tao.welcome.Welcome");
        copyOnWriteArraySet.add(obq.BIZ_NAME);
        copyOnWriteArraySet.add("com.alibaba.android.split.core.missingsplits.MissingSplitsActivity");
        copyOnWriteArraySet.add("com.taobao.keepalive.screenoff.PixelActivity");
        copyOnWriteArraySet.add("android.taobao.mulitenv.MockConfigActivity");
        copyOnWriteArraySet.add("com.taobao.taobao.ddshare.DDShareActivity");
        copyOnWriteArraySet.add("com.taobao.android.purchase.aura.TBBuyActivity");
        copyOnWriteArraySet.add("com.taobao.ugc.framework.UGCContainerActivity");
        if (new File("/data/local/tmp/.autosize/.add_detail_activity").exists()) {
            copyOnWriteArraySet.add("com.taobao.android.detail.wrapper.activity.DetailActivity");
        }
    }

    public static ldq d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ldq) ipChange.ipc$dispatch("76ef6175", new Object[0]);
        }
        return d;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df637cbd", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ((CopyOnWriteArraySet) this.b).addAll(Arrays.asList(str.split(";")));
        }
    }

    public final void b(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70496e4c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(";")) {
                if (!TextUtils.isEmpty(str2)) {
                    Uri parse = Uri.parse(str2);
                    String host = parse.getHost();
                    if (!TextUtils.isEmpty(host)) {
                        b a2 = b.a(this.f23277a, 1, null, host);
                        if (a2 == null) {
                            a2 = new b(1, null, host, null);
                            ((CopyOnWriteArrayList) this.f23277a).add(a2);
                        }
                        String path = parse.getPath();
                        b a3 = b.a(b.b(a2), 2, null, path);
                        if (a3 == null) {
                            a3 = new b(2, null, path, null);
                            a2.c(a3);
                        }
                        for (String str3 : parse.getQueryParameterNames()) {
                            if (!TextUtils.isEmpty(str3)) {
                                String queryParameter = parse.getQueryParameter(str3);
                                b a4 = b.a(b.b(a3), 3, str3, queryParameter);
                                if (a4 == null) {
                                    a4 = new b(3, str3, queryParameter, null);
                                    a3.c(a4);
                                }
                                a3 = a4;
                            }
                        }
                        TLog.loge("TBAutoSize.SplitPolicy", "addFullScreenUrlTreeData success: " + str2);
                    }
                }
            }
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924522f3", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(";")) {
                ((CopyOnWriteArraySet) this.b).remove(str2);
            }
        }
    }

    public boolean e(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd6006", new Object[]{this, context, componentName})).booleanValue();
        }
        if (componentName == null) {
            return false;
        }
        if (!this.c) {
            g(context);
        }
        return ((CopyOnWriteArraySet) this.b).contains(componentName.getClassName());
    }

    public boolean f(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27f10c1e", new Object[]{this, context, uri})).booleanValue();
        }
        if (!this.c) {
            g(context);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23277a).iterator();
        while (it.hasNext()) {
            if (((b) it.next()).g(uri)) {
                return true;
            }
        }
        return false;
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a999cba", new Object[]{this, context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("LargeScreenDisplayRules", 0);
        b(sharedPreferences.getString("fullScreenUrl", null));
        a(sharedPreferences.getString("addComponentClassName", null));
        c(sharedPreferences.getString("deleteComponentClassName", null));
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            TLog.loge("TBAutoSize.SplitPolicy", "load config: " + new JSONObject(all));
        }
        this.c = true;
    }

    public void h(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46a8d727", new Object[]{this, application});
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"LargeScreenDisplayRules"}, new a(application), true);
        } catch (Throwable th) {
            TLog.loge("TBAutoSize.SplitPolicy", "registerOrangeListener: occur exception, maybe orange is not initialized!", th);
            th.printStackTrace();
        }
    }
}
