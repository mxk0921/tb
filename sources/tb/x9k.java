package tb;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x9k {
    public static final String DEFAULT_NOTIFICATION_CHANNEL_ID = "Heytap PUSH";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f31234a;

        public a(Context context) {
            this.f31234a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!plp.b().e()) {
                String string = this.f31234a.getString(R.string.system_default_channel);
                if (TextUtils.isEmpty(string)) {
                    string = "System Default Channel";
                }
                plp.b().g(x9k.this.b(this.f31234a, x9k.DEFAULT_NOTIFICATION_CHANNEL_ID, string, 3));
            }
        }
    }

    static {
        t2o.a(612368405);
    }

    public void c(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            wrt.a(new a(context));
        }
    }

    public final boolean b(Context context, String str, String str2, int i) {
        NotificationManager notificationManager;
        if (context == null || (notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)) == null) {
            return false;
        }
        notificationManager.createNotificationChannel(aig.a(str, str2, i));
        return true;
    }
}
