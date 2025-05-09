package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightbuy.message.module.LightBuyMUSModule;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class aog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LIGHT_BUY = "LightBuyControl";

    /* renamed from: a  reason: collision with root package name */
    public final Context f15900a;
    public final cog b = cog.f();
    public final hog c = hog.c();

    static {
        t2o.a(708837381);
    }

    public aog(Context context) {
        ck.g().f("LightBuyControl onInit", ck.b.b().l(KEY_LIGHT_BUY).g("info", "LightBuyControl onInit").a());
        this.f15900a = context;
        LightBuyMUSModule.registerModule();
        fsw.i(PayPasswrdValidateBridge.PLUGIN_NAME, PayPasswrdValidateBridge.class, true);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ck.g().f("LightBuyControl onDestroy", ck.b.b().i("LightBuy/common").l(KEY_LIGHT_BUY).g("info", "LightBuyControl onDestroy").a());
        this.b.i(this.f15900a);
        hog.c().b();
    }

    public cog b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cog) ipChange.ipc$dispatch("49652c7d", new Object[]{this});
        }
        return this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Context context = this.f15900a;
        if (context instanceof Activity) {
            this.c.e((Activity) context);
        }
    }
}
