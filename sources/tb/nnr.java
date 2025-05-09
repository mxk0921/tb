package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.b;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nnr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24851a;
    public final WeexInstance b;

    static {
        t2o.a(1027604504);
    }

    public nnr(Context context, String str) {
        this(context, str, true);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("16d4539a", new Object[]{this});
        }
        return c(true);
    }

    public View b(WeexValue weexValue, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fe3e6362", new Object[]{this, weexValue, new Boolean(z)});
        }
        if (z) {
            this.b.render(weexValue);
        }
        return this.b.getRootView();
    }

    public View c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cdf16dbe", new Object[]{this, new Boolean(z)});
        }
        return b(null, z);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f24851a;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.b;
        if (weexInstance != null) {
            weexInstance.destroy();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.b;
        if (weexInstance != null) {
            weexInstance.onActivityPause();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.b;
        if (weexInstance != null) {
            weexInstance.onActivityResume();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.b;
        if (weexInstance != null) {
            weexInstance.onActivityStart();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.b;
        if (weexInstance != null) {
            weexInstance.onActivityStop();
        }
    }

    public nnr(Context context, String str, boolean z) {
        this.f24851a = str;
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        weexInstanceConfig.s(weexUnicornConfig);
        WeexInstance a2 = b.a(context, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
        this.b = a2;
        if (z) {
            a2.initWithURL(str);
        }
    }
}
