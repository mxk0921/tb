package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cpv implements Handler.Callback, g2i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SHOW_TIP_VIEW = 18;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f17224a;
    public final Handler b = new Handler(this);
    public boolean c;
    public dpv d;

    static {
        t2o.a(85983275);
        t2o.a(85983268);
    }

    public cpv(Activity activity) {
        this.f17224a = activity;
    }

    @Override // tb.g2i
    public void a(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be11bc0e", new Object[]{this, wXSDKInstance, view});
            return;
        }
        if (this.d == null) {
            this.d = new dpv(wXSDKInstance.getContext(), view);
        }
        if (this.c) {
            this.b.sendEmptyMessage(18);
        }
    }

    @Override // tb.g2i
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2686804e", new Object[]{this, str});
        } else if (bpv.h(str)) {
            this.c = true;
        }
    }

    @Override // tb.g2i
    public Handler getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        return this.b;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        dpv dpvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what != 18 || (dpvVar = this.d) == null) {
            return false;
        }
        dpvVar.f(null, "检测到该网址为外部网站，外部网站打开可能存在安全隐患，请注意保护您的个人隐私", wtw.a(this.f17224a));
        return true;
    }
}
