package tb;

import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.IJsApiSucceedCallBack;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class spw implements urb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IWVWebView f28213a;
    public Object b;
    public Method c;
    public String d;
    public String e;
    public String f;
    public IJsApiFailedCallBack h;
    public IJsApiSucceedCallBack i;
    public String g = "";
    public String j = "";
    public String k = "";
    public volatile boolean l = true;

    static {
        t2o.a(989856222);
        t2o.a(989856196);
    }

    public spw() {
        d();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this});
        }
        return this.j;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca44cc4f", new Object[]{this});
        }
        return getCurId() + "-" + this.g;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ea03b9", new Object[]{this});
            return;
        }
        this.k = "" + urb.id.addAndGet(1);
    }

    @Override // tb.urb
    public String getCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this});
        }
        return "Bridge_" + this.k;
    }
}
