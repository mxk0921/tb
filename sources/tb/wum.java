package tb;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class wum {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WVUCWebView f30937a;
    public final xum b;
    public boolean c;

    static {
        t2o.a(989856370);
    }

    public wum(WVUCWebView wVUCWebView, xum xumVar, boolean z) {
        ckf.g(wVUCWebView, "webview");
        ckf.g(xumVar, "prerenderRequestParams");
        this.f30937a = wVUCWebView;
        this.b = xumVar;
        this.c = z;
    }

    public final xum a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xum) ipChange.ipc$dispatch("659e4c21", new Object[]{this});
        }
        return this.b;
    }

    public final WVUCWebView b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("bc762ded", new Object[]{this});
        }
        return this.f30937a;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b70796c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof wum) {
                wum wumVar = (wum) obj;
                if (!ckf.b(this.f30937a, wumVar.f30937a) || !ckf.b(this.b, wumVar.b) || this.c != wumVar.c) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        WVUCWebView wVUCWebView = this.f30937a;
        if (wVUCWebView != null) {
            i = wVUCWebView.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        xum xumVar = this.b;
        if (xumVar != null) {
            i2 = xumVar.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        boolean z = this.c;
        if (!z) {
            i3 = z ? 1 : 0;
        }
        return i5 + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PrerenderItem(webview=" + this.f30937a + ", prerenderRequestParams=" + this.b + ", isReady=" + this.c + f7l.BRACKET_END_STR;
    }
}
