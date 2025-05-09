package tb;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static d4w f17579a;

    static {
        t2o.a(967835650);
    }

    public static d4w c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d4w) ipChange.ipc$dispatch("b3ef62b7", new Object[0]);
        }
        if (f17579a == null) {
            synchronized (d4w.class) {
                try {
                    if (f17579a == null) {
                        f17579a = new d4w();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17579a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public heb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (heb) ipChange.ipc$dispatch("727dd6c7", new Object[]{this});
        }
        return null;
    }

    public WVUCWebView d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("bc762ded", new Object[]{this});
        }
        return null;
    }
}
