package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ggr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ggr INSTANCE = new ggr();

    static {
        t2o.a(804257848);
    }

    public final InputStream a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("9f1525a4", new Object[]{this, context, str});
        }
        ckf.g(context, "context");
        ckf.g(str, "fileName");
        try {
            return AssetsDelegate.proxy_open(context.getAssets(), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Throwable, java.lang.String] */
    public final String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("413b049c", new Object[]{this, context, str});
        }
        ckf.g(context, "context");
        ckf.g(str, "fileName");
        InputStream a2 = a(context, str);
        th = 0;
        if (a2 == null) {
            return th;
        }
        try {
            return igr.INSTANCE.b(a2);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
