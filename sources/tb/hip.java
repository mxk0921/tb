package tb;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hip {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f20672a;
        public final String b;

        static {
            t2o.a(665845762);
        }

        public a(String str, String str2) {
            this.f20672a = str;
            this.b = str2;
        }
    }

    static {
        t2o.a(665845761);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f7dd4092", new Object[0]);
        }
        String str = null;
        if (!qjp.b()) {
            return new a(null, null);
        }
        Application application = Globals.getApplication();
        String b = br0.b(application);
        if (br0.i(application)) {
            try {
                ClipboardManager clipboardManager = (ClipboardManager) application.getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    str = clipboardManager.getPrimaryClip().getDescription().getLabel().toString();
                }
            } catch (Throwable unused) {
            }
        }
        return new a(b, str);
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51935b7e", new Object[]{context, str});
            return;
        }
        try {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(blo.TAO_FLAG, str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c(ClipboardManager clipboardManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a64cb79", new Object[]{clipboardManager});
            return;
        }
        try {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, ""));
        } catch (Exception unused) {
            TLog.loge("setPrimaryClip", "clear clip failed");
        }
    }
}
