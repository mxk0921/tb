package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class i9x extends BaseShopContentRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context g;
    public final ups h;
    public final FrameLayout i;
    public WeexInstance j;

    static {
        t2o.a(766509787);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9x(Context context, ups upsVar) {
        super(context, upsVar);
        ckf.g(context, "context");
        ckf.g(upsVar, "tabBarItemDataModel");
        this.g = context;
        this.h = upsVar;
        this.i = new FrameLayout(context);
    }

    public static /* synthetic */ Object ipc$super(i9x i9xVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1065519279:
                super.j();
                return null;
            case 1890078406:
                super.destroyView();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/WeexV2Container");
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        WeexInstance weexInstance = this.j;
        if (weexInstance != null) {
            weexInstance.destroy();
        }
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        kew.h(this.i);
        kew.Y(this.i);
        return this.i;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        super.j();
        if (this.j == null) {
            v();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        WeexInstance weexInstance = this.j;
        if (weexInstance != null) {
            weexInstance.onActivityPause();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        WeexInstance weexInstance = this.j;
        if (weexInstance != null) {
            weexInstance.onActivityResume();
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab121b8", new Object[]{this});
            return;
        }
        String n = this.h.n();
        WeexInstance a2 = b.a(this.g, n, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, null);
        this.j = a2;
        FrameLayout frameLayout = this.i;
        ckf.d(a2);
        frameLayout.addView(a2.getRootView());
        WeexInstance weexInstance = this.j;
        ckf.d(weexInstance);
        weexInstance.initWithURL(n);
        WeexInstance weexInstance2 = this.j;
        ckf.d(weexInstance2);
        weexInstance2.render(null);
    }
}
