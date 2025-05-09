package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class mei {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23990a;

    static {
        t2o.a(779093127);
    }

    public mei(String str) {
        this.f23990a = str;
    }

    public abstract void a(Intent intent, Uri uri);

    public void b(Intent intent, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90254854", new Object[]{this, intent, uri});
        } else {
            a(intent, uri);
        }
    }

    public void c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83865c71", new Object[]{this, uri});
        } else {
            b(null, uri);
        }
    }
}
