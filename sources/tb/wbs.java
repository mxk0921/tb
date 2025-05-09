package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class wbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wbs INSTANCE = new wbs();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30596a;
        public final /* synthetic */ Uri b;

        public a(String str, Uri uri) {
            this.f30596a = str;
            this.b = uri;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.f30596a;
            String uri = this.b.toString();
            ckf.f(uri, "originUri.toString()");
            vbs.r(str, uri);
        }
    }

    static {
        t2o.a(847249546);
    }

    @JvmStatic
    public static final boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f88fc6e3", new Object[]{intent})).booleanValue();
        }
        if (!INSTANCE.a()) {
            return false;
        }
        return bqg.b(intent);
    }

    @JvmStatic
    public static final boolean d(Intent intent) {
        String dataString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa8aa90", new Object[]{intent})).booleanValue();
        }
        if (c(intent) || (intent != null && (dataString = intent.getDataString()) != null && wsq.O(dataString, "_afc_link=1", false, 2, null))) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3622e1f7", new Object[]{this})).booleanValue();
        }
        IConfigAdapter iConfigAdapter = (IConfigAdapter) p8s.b(IConfigAdapter.class);
        return ckf.b(iConfigAdapter == null ? null : iConfigAdapter.getConfigByGroupAndNameFromLocal("ariver_common_config", "enableAfcColdMode", "true"), "true");
    }

    public final String b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c2659ca", new Object[]{this, uri});
        }
        ckf.g(uri, "originUri");
        String queryParameter = uri.getQueryParameter("_ariver_appid");
        if (queryParameter == null) {
            return null;
        }
        String A3 = q9s.A3(queryParameter);
        if (wsq.a0(A3)) {
            A3 = null;
        }
        if (A3 == null) {
            return null;
        }
        Uri parse = Uri.parse(A3);
        Uri.Builder buildUpon = parse.buildUpon();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ckf.f(queryParameterNames, "originUri.queryParameterNames");
        for (String str : queryParameterNames) {
            if (!ckf.b("pha_manifest", str) && !ckf.b("_ariver_appid", str) && (!ckf.b(vms.PROTOCOL_BIZ_CODE_PHA, str) || !ckf.b("true", uri.getQueryParameter(str)))) {
                if (!parse.getQueryParameterNames().contains(str)) {
                    buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
                }
            }
        }
        return buildUpon.build().toString();
    }

    public final boolean e(Context context, Uri uri) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edb66cd7", new Object[]{this, context, uri})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(uri, "originUri");
        String queryParameter = uri.getQueryParameter("_ariver_appid");
        if (queryParameter == null) {
            return false;
        }
        String A3 = q9s.A3(queryParameter);
        if (wsq.a0(A3)) {
            A3 = null;
        }
        if (A3 == null) {
            return false;
        }
        Uri parse = Uri.parse(A3);
        Uri.Builder buildUpon = parse.buildUpon();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ckf.f(queryParameterNames, "originUri.queryParameterNames");
        for (String str : queryParameterNames) {
            if (!ckf.b("pha_manifest", str) && !ckf.b("_ariver_appid", str) && (!ckf.b(vms.PROTOCOL_BIZ_CODE_PHA, str) || !ckf.b("true", uri.getQueryParameter(str)))) {
                if (!parse.getQueryParameterNames().contains(str)) {
                    buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
                }
            }
        }
        Nav.from(context).skipPreprocess().disableTransition().disallowLoopback().toUri(buildUpon.build().toString());
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (!(iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.IDLE)) == null)) {
            executor.execute(new a(queryParameter, uri));
        }
        return true;
    }
}
