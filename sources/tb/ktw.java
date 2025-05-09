package tb;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ktw implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856392);
        t2o.a(989856388);
    }

    public void a(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224b7655", new Object[]{this, iWVWebView, str});
        }
    }

    public void b(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2ae988", new Object[]{this, iWVWebView, str});
        }
    }

    public void c(IWVWebView iWVWebView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d99fc4", new Object[]{this, iWVWebView, new Integer(i), str, str2});
        }
    }

    public ltw d(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ltw) ipChange.ipc$dispatch("16464ce6", new Object[]{this, iWVWebView, str});
        }
        return null;
    }

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        kqw kqwVar = new kqw(false);
        if (i != 1008) {
            switch (i) {
                case 1001:
                    b(iqwVar.f21515a, iqwVar.b);
                    return kqwVar;
                case 1002:
                    a(iqwVar.f21515a, iqwVar.b);
                    return kqwVar;
                case 1003:
                    kqwVar.f22859a = e(iqwVar.f21515a, iqwVar.b);
                    return kqwVar;
                case 1004:
                    break;
                case 1005:
                    c(iqwVar.f21515a, ((Integer) objArr[0]).intValue(), (String) objArr[1], (String) objArr[2]);
                    return kqwVar;
                default:
                    return null;
            }
        }
        ltw d = d(iqwVar.f21515a, iqwVar.b);
        if (d == null) {
            return kqwVar;
        }
        kqwVar.f22859a = true;
        kqwVar.b = d;
        return kqwVar;
    }

    public boolean e(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd6e8485", new Object[]{this, iWVWebView, str})).booleanValue();
        }
        return false;
    }
}
