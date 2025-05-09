package com.alibaba.triver.bundle.nav;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.triver.base.taobao.TriverRemoteManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import com.taobao.themis.kernel.TMSTBOpenStart;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.taobao.impl.TBTMSSDK;
import com.taobao.themis.taobao.impl.TMS;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import java.io.Serializable;
import mtopsdk.common.util.SymbolExpUtil;
import tb.abs;
import tb.h8s;
import tb.nj7;
import tb.nks;
import tb.no8;
import tb.p8s;
import tb.ris;
import tb.rks;
import tb.vxm;
import tb.wbs;
import tb.xnj;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TriverNavProcessor implements xnj, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TriverNavProcessor";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2930a;

        public a(Context context) {
            this.f2930a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBTMSSDK.initTBTMS(this.f2930a);
            }
        }
    }

    private static boolean jumpThemis(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d58d3e22", new Object[]{intent, zmjVar})).booleanValue() : !TMS.startApp(intent, zmjVar, null);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return TAG;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        try {
            return triverHook(zmjVar, intent);
        } catch (Throwable th) {
            Log.e(TAG, th.getMessage());
            return true;
        }
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean triverHook(zmj zmjVar, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25720a95", new Object[]{this, zmjVar, intent})).booleanValue();
        }
        Context d = zmjVar.d();
        if (!(intent == null || intent.getData() == null)) {
            abs.c(d);
            no8 f = h8s.f(d, "enableAsyncInitTask");
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService == null || !f.d()) {
                TBTMSSDK.initTBTMS(d);
            } else {
                iExecutorService.getExecutor(ExecutorType.NORMAL).execute(new a(d));
            }
            if (wbs.c(intent) || (data = intent.getData()) == null || !data.isHierarchical() || (nks.e(data) && intent.getBooleanExtra("disableHook", false))) {
                return true;
            }
            if (data.toString().startsWith("tbopen://") && ris.g()) {
                return true;
            }
            if (windmillJumpToTRiver(d, data)) {
                return false;
            }
            if (TMSSwitchUtils.isEnterTMS(d, data)) {
                return jumpThemis(intent, zmjVar);
            }
            if (nks.e(data)) {
                if (nks.f(data.toString())) {
                    if (!nks.d(data.toString())) {
                        String j = ris.j();
                        Nav.from(d).toUri(j + "&debugUrl=" + Uri.encode(data.toString()));
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("widgetPreviewUrl", data.toString());
                        Nav.from(d).withExtras(bundle).toUri("http://alibaba.miniapp.widget.preview");
                    }
                    return false;
                }
                if (ris.b(rks.a(data))) {
                    intent.setData(data.buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
                }
                jumpTriverAndCheckRemote(d, intent);
                return false;
            }
        }
        return true;
    }

    private static String decodeWML(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14b76a92", new Object[]{context, uri});
        }
        try {
            return SecurityGuardManager.getInstance(context.getApplicationContext()).getStaticDataEncryptComp().staticSafeDecrypt(16, "rap_code_key", uri.getQueryParameter("_wml_code")).split(SymbolExpUtil.SYMBOL_VERTICALBAR)[0];
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean jumpThemis(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f305d740", new Object[]{uri, context})).booleanValue() : !TMS.INSTANCE.startApp(uri, context);
    }

    public static void jumpTriverAndCheckRemote(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e33b61", new Object[]{context, intent});
            return;
        }
        TriverRemoteManager instance = TriverRemoteManager.getInstance();
        ITriverRemoteProxy.DependenceMode dependenceMode = ITriverRemoteProxy.DependenceMode.TRIVER_ONLY;
        boolean hasInstalled = instance.hasInstalled(dependenceMode);
        boolean z = !hasInstalled;
        if (!hasInstalled) {
            intent.putExtra("showRemoteLoading", true);
            vxm.b.e().j("TRIVER_remote_start", SystemClock.uptimeMillis());
        }
        TriverRemoteManager.getInstance().installWithRemoUI("NAV", intent.getData().toString(), dependenceMode, context, new b(z, context, intent));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements ITriverRemoteProxy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f2931a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Intent c;

        public b(boolean z, Context context, Intent intent) {
            this.f2931a = z;
            this.b = context;
            this.c = intent;
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            if (nks.c(this.c.getData()) || TMSTBOpenStart.getIsTBOpenStart()) {
                Nav.from(this.b).toUri("http://m.taobao.com/index.htm");
            }
            TLog.loge("Triver", TriverNavProcessor.TAG, str);
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onSuccess() {
            try {
                if (this.f2931a) {
                    vxm.b.e().j("TRIVER_remote_end", SystemClock.uptimeMillis());
                }
                Class.forName("com.alibaba.triver.bundle.nav.TriverNavProcessorImpl").getDeclaredMethod("triverHook", Context.class, Intent.class).invoke(null, this.b, this.c);
            } catch (Throwable th) {
                TLog.loge("Triver", TriverNavProcessor.TAG, th);
            }
        }
    }

    private static boolean windmillJumpToTRiver(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d54726f", new Object[]{context, uri})).booleanValue();
        }
        try {
            if (uri.getQueryParameterNames().contains("_wml_code") && !uri.getQueryParameterNames().contains("processByTRiver")) {
                String decodeWML = decodeWML(context, uri);
                String queryParameter = uri.getQueryParameter("_ariver_appid");
                if (!TextUtils.isEmpty(queryParameter)) {
                    decodeWML = queryParameter;
                }
                if (ris.a(decodeWML) && !TextUtils.isEmpty(decodeWML)) {
                    Uri.Builder appendQueryParameter = Uri.parse("https://m.duanqu.com").buildUpon().appendQueryParameter("_ariver_appid", decodeWML);
                    for (String str : uri.getQueryParameterNames()) {
                        if (!"_wml_code".equals(str)) {
                            appendQueryParameter.appendQueryParameter(str, uri.getQueryParameter(str));
                        }
                    }
                    appendQueryParameter.appendQueryParameter("processByTRiver", "true");
                    Nav.from(context).toUri(appendQueryParameter.build());
                    return true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    @Deprecated
    public boolean triverHook(Context context, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc07567", new Object[]{this, context, intent})).booleanValue();
        }
        if (!(intent == null || intent.getData() == null)) {
            TBTMSSDK.initTBTMS(context);
            if (wbs.c(intent) || (data = intent.getData()) == null || !data.isHierarchical() || (nks.e(data) && intent.getBooleanExtra("disableHook", false))) {
                return true;
            }
            if (data.toString().startsWith("tbopen://") && ris.g()) {
                return true;
            }
            if (windmillJumpToTRiver(context, data)) {
                return false;
            }
            if (TMSSwitchUtils.isEnterTMS(context, data)) {
                return jumpThemis(data, context);
            }
            if (nks.e(data)) {
                if (nks.f(data.toString())) {
                    if (!nks.d(data.toString())) {
                        String j = ris.j();
                        Nav.from(context).toUri(j + "&debugUrl=" + Uri.encode(data.toString()));
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("widgetPreviewUrl", data.toString());
                        Nav.from(context).withExtras(bundle).toUri("http://alibaba.miniapp.widget.preview");
                    }
                    return false;
                }
                if (ris.b(rks.a(data))) {
                    intent.setData(data.buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
                }
                jumpTriverAndCheckRemote(context, intent);
                return false;
            }
        }
        return true;
    }
}
