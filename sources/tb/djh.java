package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class djh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long RECOVER_PREVIEW_TIME = 10000;
    public static final String SOURCE_TYPE_KEY = "_tbScancodeApproach_";
    public static final String SOURCE_TYPE_PHOTO = "photo";
    public static final String SOURCE_TYPE_SCAN = "scan";

    /* renamed from: a  reason: collision with root package name */
    public static final String f17860a = djh.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17861a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(Context context, String str, String str2) {
            this.f17861a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                djh.a(this.f17861a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(760217728);
    }

    public static /* synthetic */ void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c002b8c5", new Object[]{context, str, str2});
        } else {
            c(context, str, str2);
        }
    }

    public static void c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644aaebc", new Object[]{context, str, str2});
        } else if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent = new Intent("com.taobao.taobao.scancode.login.CheckerBroadcast");
                if (TextUtils.equals(str2, "scanHistory")) {
                    str2 = q5c.HISTORY;
                }
                intent.putExtra("approach", str2);
                intent.putExtra("url", str);
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent);
            } catch (Throwable th) {
                Log.e(f17860a, "sending broadcast failed.", th);
            }
        }
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81dbe4f8", new Object[]{context, str})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if (!p1g.d(str)) {
                StringBuilder sb = new StringBuilder("the url[");
                sb.append(str);
                sb.append("] is not a http url");
                return false;
            }
            Uri parse = Uri.parse(str);
            if (!TextUtils.equals(parse.getQueryParameter("tbScanOpenType"), "Notification")) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(SOURCE_TYPE_KEY);
            if (TextUtils.equals("scanHistory", queryParameter) || TextUtils.equals("photo", queryParameter) || TextUtils.equals("scan", queryParameter)) {
                StringBuilder sb2 = new StringBuilder("filter the url[");
                sb2.append(str);
                sb2.append("]...");
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    c(context, str, queryParameter);
                } else {
                    new Handler(Looper.getMainLooper()).post(new a(context, str, queryParameter));
                }
                return true;
            }
            String str2 = f17860a;
            Log.e(str2, "the url[" + str + "] has been from a unknown source[" + queryParameter + "].");
            return false;
        } catch (Throwable th) {
            String str3 = f17860a;
            Log.e(str3, "some exceptions happened when filtering url[" + str + "]", th);
            return false;
        }
    }
}
