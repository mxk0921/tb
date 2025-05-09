package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f26880a = Arrays.asList("tbopen", "taobao", "alitaobao", "aliflowcustoms", "alitaobao4android", "alitaobaoclient", "alitaobaolink");
    public static final String[] b = {"http", "https"};
    public static final String[] c = {"h5.m.taobao.com", "m.taobao.com", "copyhomecache.m.taobao.com", "my.m.taobao.com", "i.taobao.com"};
    public static final String[] d = {"/index.htm", "/myTaobao.htm", "/my_taobao.htm", "/awp/mtb/mtb.htm"};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f26881a;
        public final /* synthetic */ Intent b;

        public a(Activity activity, Intent intent) {
            this.f26881a = activity;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ah0.c(19999, "screen_state_point", jsg.q(this.f26881a) + "", this.b.getData() + "", null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f26882a;
        public final /* synthetic */ Activity b;

        public b(Intent intent, Activity activity) {
            this.f26882a = intent;
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean bool;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TbFcLinkInit.instance().doLinkMap.size() <= 0 || (bool = TbFcLinkInit.instance().doLinkMap.get(this.f26882a.getData())) == null || !bool.booleanValue()) {
                vp9.a("linkx", "LinkHandleUtils === linkIn = 正常页面回调执行海关逻辑,子线程执行");
                AfcCustomSdk.h().f(this.b, this.f26882a);
            } else {
                vp9.a("linkx", "LinkHandleUtils === linkIn = 冷启/极速版,海关的逻辑放在了初始化执行，此处不再执行");
                TbFcLinkInit.instance().doLinkMap.remove(this.f26882a.getData());
            }
        }
    }

    public static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c45a3b2", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        String path = uri.getPath();
        String host = uri.getHost();
        if (!Arrays.asList(b).contains(scheme) || !Arrays.asList(c).contains(host) || !Arrays.asList(d).contains(path)) {
            return false;
        }
        return true;
    }

    public static Intent d(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("8a39b304", new Object[]{intent, str});
        }
        if (LauncherRuntime.i(intent)) {
            return intent;
        }
        Uri parse = Uri.parse(intent.getData().getQueryParameter("h5Url"));
        Bundle bundle = new Bundle();
        bundle.putString("out_link", str);
        if (!a(parse)) {
            bundle.putString("black_page", str);
        }
        intent.putExtra("afc_bundle", bundle);
        vp9.a("linkx", "LinkHandleUtils === putIntentData2Apm " + intent);
        return intent;
    }

    public static void c(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edae55", new Object[]{activity, intent});
            return;
        }
        TLog.loge("linkManager", "afc_link", new Throwable());
        try {
            zsa.b.a(new a(activity, intent));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (qg0.d(intent) && "HOT".equals(TbFcLinkInit.launchType)) {
            vp9.b("linkx", "LinkHandleUtils === linkIn = 热启 补偿afc_id");
            AfcLifeCycleCenter.instance().dealWithData(activity, intent);
        }
        TbFcLinkInit.instance().isAfcLink = true;
        bht.f16396a = new WeakReference<>(activity);
        if (intent != null) {
            AfcLifeCycleCenter.jumpUrl = intent.getDataString();
            vp9.b("linkx", "LinkHandleUtils === linkIn = jumpUrl为：" + AfcLifeCycleCenter.jumpUrl);
        }
        qg0.g(AfcUtils.c(activity));
        if (TbFcLinkInit.instance().linkAhead) {
            zsa.b.a(new b(intent, activity));
        } else {
            vp9.a("linkx", "LinkHandleUtils === linkIn = 正常执行海关逻辑,主线程执行");
            AfcCustomSdk.h().f(activity, intent);
        }
        TLog.loge("linkManager", "afc_link", "intent = " + intent + " ==== " + AfcUtils.c(activity));
    }

    public static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9de3c286", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        return f26880a.contains(uri.getScheme()) && TextUtils.equals(uri.getHost(), "m.taobao.com") && TextUtils.equals(uri.getPath(), "/tbopen/index.html");
    }

    static {
        t2o.a(744489035);
    }
}
