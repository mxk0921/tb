package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ctw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a7e f17320a;
        public final /* synthetic */ Activity b;

        public a(a7e a7eVar, Activity activity) {
            this.f17320a = a7eVar;
            this.b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else if (this.f17320a.getPageLoadedCount() > 0) {
                a7e a7eVar = this.f17320a;
                if (a7eVar instanceof IWVWebView) {
                    ((IWVWebView) a7eVar).refresh();
                }
            } else {
                this.b.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17321a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ a7e c;

        public b(String str, Activity activity, a7e a7eVar) {
            this.f17321a = str;
            this.b = activity;
            this.c = a7eVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            try {
                this.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f17321a)));
                if (this.c.getPageLoadedCount() <= 0) {
                    a7e a7eVar = this.c;
                    if (a7eVar instanceof IWVWebView) {
                        ((IWVWebView) a7eVar).back();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(989856472);
    }

    public static boolean a(String str, Context context, a7e a7eVar) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e575852f", new Object[]{str, context, a7eVar})).booleanValue();
        }
        if (!a7eVar.canUseGlobalUrlConfig() && !a7eVar.canUseUrlConfig()) {
            return false;
        }
        if (ftw.f().j(str)) {
            a7eVar.setAllowAllOpen(true);
            return false;
        } else if (a7eVar.allowAllOpen()) {
            y71.commitFail(ftw.MONITOR_POINT_NEW_SECURITY_ALLOW, 5, "allowAll名单允许", str);
            return false;
        } else {
            try {
                uri = Uri.parse(str);
            } catch (Throwable th) {
                th.printStackTrace();
                uri = null;
            }
            if (uri == null) {
                return true;
            }
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (!TextUtils.isEmpty(scheme) && !TextUtils.isEmpty(host) && ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme))) {
                if (ftw.f().l(str)) {
                    if (context instanceof MutableContextWrapper) {
                        context = ((MutableContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof Activity)) {
                        return false;
                    }
                    Activity activity = (Activity) context;
                    Intent intent = new Intent("NON_WHITELIST_URL_VISIT");
                    intent.putExtra("url", str);
                    intent.putExtra("whitelistAvailable", 1);
                    intent.putExtra("from", "windvane");
                    if (context != null) {
                        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
                    }
                    AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(jrw.a(wmc.TIPS));
                    title.setMessage(jrw.a(wmc.BROWSER_EXTERNAL_PAGE_WARNING) + scheme + HttpConstant.SCHEME_SPLIT + host).setPositiveButton(jrw.a(wmc.BROWSER_OPEN), new b(str, activity, a7eVar)).setNegativeButton(jrw.a(wmc.CANCEL), new a(a7eVar, activity)).setCancelable(false).create().show();
                    StringBuilder sb = new StringBuilder("doFilter() called with: url = [");
                    sb.append(str);
                    sb.append("] block");
                    v7t.d("WVURLFilter", sb.toString());
                    return true;
                }
                v7t.a("WVURLFilter", "doFilter() called with: url = [" + str + "] allow");
            }
            return false;
        }
    }
}
