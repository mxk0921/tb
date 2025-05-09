package tb;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.nav.Nav;
import com.taobao.android.tb3dspaceprocessor.T3DNattiveJS;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.log.TLog;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gts implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE = "TB3DSpace";
    public static int b = -1;
    public static edq c;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f20226a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            try {
                gts.e(null);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            } else if (bdqVar != null && bdqVar.h() == gts.a()) {
                JSONObject jSONObject = new JSONObject();
                int i = bdqVar.i();
                if (i != 5) {
                    if (i == 6) {
                        try {
                            jSONObject.put("success", "false");
                            WVStandardEventCenter.postNotificationToJS("T3DNativeJSAPI", jSONObject.toString());
                            return;
                        } catch (JSONException unused) {
                            return;
                        }
                    }
                }
                TLog.loge("3dprocessor", "TaoBaoLife", "Tb3DSpace INSTALLED");
                gts.c(null, "");
                jSONObject.put("success", "true");
                WVStandardEventCenter.postNotificationToJS("T3DNativeJSAPI", jSONObject.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f20228a;
        public final /* synthetic */ ucq b;

        public c(WVCallBackContext wVCallBackContext, ucq ucqVar) {
            this.f20228a = wVCallBackContext;
            this.b = ucqVar;
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
            } else if (this.f20228a != null) {
                TLog.loge("3dprocessor", "TaoBaoLife", "addOnSuccessListener fail ");
                this.f20228a.error("start download add listener failed.");
                this.b.e(gts.c);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("success", "false");
                    WVStandardEventCenter.postNotificationToJS("T3DNativeJSAPI", jSONObject.toString());
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements gvk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f20229a;

        public d(WVCallBackContext wVCallBackContext) {
            this.f20229a = wVCallBackContext;
        }

        /* renamed from: b */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
                return;
            }
            gts.b(num.intValue());
            if (this.f20229a != null) {
                TLog.loge("3dprocessor", "TaoBaoLife", "addOnSuccessListener success ");
                this.f20229a.success("start install..");
            }
        }
    }

    public gts() {
        new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return b;
    }

    public static /* synthetic */ int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550b9d", new Object[]{new Integer(i)})).intValue();
        }
        b = i;
        return i;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9c69819", new Object[0])).booleanValue();
        }
        String str = TaoPackageInfo.sTTID;
        new StringBuilder("process: channel id ").append(str);
        if ("212200".equals(str)) {
            Log.e("TaoBaoLife", "this is google play channel.");
            return true;
        }
        ucq h = com.taobao.appbundle.a.Companion.a().h();
        if (h == null) {
            return true;
        }
        return BundleInfoManager.instance().getDynamicFeatureInfo("TB3DSpace") != null && h.f().contains("TB3DSpace");
    }

    public static synchronized void e(WVCallBackContext wVCallBackContext) {
        synchronized (gts.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cfe8d8f", new Object[]{wVCallBackContext});
                return;
            }
            c = new b();
            ucq h = com.taobao.appbundle.a.Companion.a().h();
            if (h != null) {
                h.g(c);
                h.c(xcq.c().l("TB3DSpace").n()).c(new d(wVCallBackContext)).b(new c(wVCallBackContext, h));
            }
        }
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "tb3dspaceprocessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri data;
        String str;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (intent == null || zmjVar == null || (data = intent.getData()) == null) {
            return true;
        }
        try {
            str = data.getQueryParameter("appUrl");
        } catch (Throwable th) {
            TLog.loge("3dprocessor", "TaoBaoLife", "process: geturlparameter illegal " + th);
            str = "";
        }
        try {
            z = "true".equals(data.getQueryParameter("forceinstallt3d"));
        } catch (Throwable th2) {
            TLog.loge("3dprocessor", "TaoBaoLife", "process: throwable" + th2);
            z = false;
        }
        try {
            z2 = "true".equals(data.getQueryParameter("isToH5"));
        } catch (Throwable th3) {
            Log.e("TaoBaoLife", "process: isToH5 " + th3);
            z2 = false;
        }
        if (TextUtils.isEmpty(str) || zmjVar.d() == null) {
            return true;
        }
        fsw.h("T3DNativeJSAPI", T3DNattiveJS.class);
        if (!d()) {
            TLog.loge("3dprocessor", "TaoBaoLife", "process: bundle not install");
            if (z) {
                try {
                    String encode = URLEncoder.encode(str, "UTF-8");
                    Nav.from(zmjVar.d()).toUri("https://go/installxrspace3d?appUrl=" + encode);
                    return false;
                } catch (UnsupportedEncodingException e) {
                    new StringBuilder("onCreate: UnsupportedEncodingException").append(e);
                    return false;
                }
            } else {
                Nav.from(zmjVar.d()).toUri(str);
                this.f20226a.postDelayed(new a(), 2000L);
                return false;
            }
        } else if (Globals.getApplication() == null) {
            return true;
        } else {
            if (z2) {
                Nav.from(zmjVar.d()).toUri(str);
                return false;
            }
            c(zmjVar, str);
            return false;
        }
    }

    public static boolean c(zmj zmjVar, String str) {
        try {
            Class<?> cls = Class.forName("com.tmall.wireless.web3d.acennr.InitAceNNR");
            cls.getMethod("init", Application.class, Map.class).invoke(null, Globals.getApplication(), new HashMap());
            Boolean bool = (Boolean) cls.getMethod("isInit", new Class[0]).invoke(null, new Object[0]);
            if (bool == null || !bool.booleanValue()) {
                if (zmjVar != null) {
                    Nav.from(zmjVar.d()).toUri(str);
                }
                return false;
            }
            Class<?> cls2 = Class.forName("com.taobao.android.acennr.downloader.Downloader");
            Object invoke = cls2.getMethod("Instance", new Class[0]).invoke(null, new Object[0]);
            Method method = cls2.getMethod("registerImplement", Class.forName("com.taobao.android.acennr.downloader.IDownloader"));
            Class<?> cls3 = Class.forName("com.taobao.android.xr_resource.downloader.XRAceDownloader");
            method.invoke(invoke, cls3.getField("INSTANCE").get(cls3));
            if (zmjVar != null) {
                Nav.from(zmjVar.d()).toUri(str);
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("TaoBaoLife", "process: method or class not found " + th);
            return false;
        }
    }
}
