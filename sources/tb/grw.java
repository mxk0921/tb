package tb;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class grw implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<IWVWebView> f20184a;

    static {
        t2o.a(989856313);
        t2o.a(989856388);
    }

    public grw(IWVWebView iWVWebView) {
        this.f20184a = new WeakReference<>(iWVWebView);
    }

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        WeakReference<IWVWebView> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        try {
            if (i == 3006) {
                WeakReference<IWVWebView> weakReference2 = this.f20184a;
                if (weakReference2 == null) {
                    return null;
                }
                IWVWebView iWVWebView = weakReference2.get();
                if (iWVWebView != null) {
                    iWVWebView.fireEvent((String) objArr[0], (String) objArr[1]);
                } else if (!v7t.h()) {
                    return null;
                } else {
                    v7t.i("WVJsPatchListener", "WVJsPatchListener is free");
                    return null;
                }
            } else if (i != 3014 || (weakReference = this.f20184a) == null) {
                return null;
            } else {
                IWVWebView iWVWebView2 = weakReference.get();
                if (iWVWebView2 != null) {
                    iWVWebView2.fireEvent("WV.Event.APP.TakeScreenshot", "{}");
                } else if (!v7t.h()) {
                    return null;
                } else {
                    v7t.i("WVJsPatchListener", "WVJsPatchListener is free");
                    return null;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
