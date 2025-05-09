package tb;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class mpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24210a;
    public final Uri b;
    public final Context c;
    public boolean d;

    static {
        t2o.a(847249435);
    }

    public mpj(String str, Uri uri, Context context) {
        ckf.g(str, "url");
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        ckf.g(context, "context");
        this.f24210a = str;
        this.b = uri;
        this.c = context;
    }

    public final Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.c;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12fd1a83", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final Uri c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d7589ef4", new Object[]{this});
        }
        return this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f24210a;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fa1741", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }
}
