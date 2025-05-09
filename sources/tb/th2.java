package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class th2 extends vh2 implements MSOAServiceListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final BootImageInteractBaseView d;
    public boolean e;

    static {
        t2o.a(573571122);
    }

    public th2(Context context, BootImageInfo bootImageInfo, BootImageInteractBaseView bootImageInteractBaseView) {
        super(context, bootImageInfo);
        this.d = bootImageInteractBaseView;
    }

    public static /* synthetic */ Object ipc$super(th2 th2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/biz/interact/presenter/BootImageInteractAddCartPresenter");
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7b6a10", new Object[]{this, str, str2});
            return;
        }
        try {
            tm1.a("BootImageInteractAddCartPresenter", "互动加购失败：retCode=" + str + ";retMsg=" + str2);
        } catch (Throwable th) {
            tm1.b("BootImageInteractAddCartPresenter", "SmallPopView. commitFail .error", th);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c67153", new Object[]{this});
            return;
        }
        try {
            tm1.a("BootImageInteractAddCartPresenter", "互动加购成功");
        } catch (Throwable th) {
            tm1.b("BootImageInteractAddCartPresenter", "SmallPopView. commitSuccess .error", th);
        }
    }

    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
    public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
            return;
        }
        try {
            tm1.a("BootImageInteractAddCartPresenter", "addCart msoaServiceListener onFail s= " + str + " s1=" + str2 + " b=" + z);
            d(str, str2);
            this.e = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
    public void onSuccess(Map<String, Object> map) {
        BootImageInteractBaseView bootImageInteractBaseView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            return;
        }
        try {
            tm1.a("BootImageInteractAddCartPresenter", "addCart msoaServiceListener onSuccess");
            this.e = false;
            if (!b() && (bootImageInteractBaseView = this.d) != null) {
                bootImageInteractBaseView.stopInteract();
            }
            e();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63f1b68", new Object[]{this});
            return;
        }
        try {
            if (this.b == null) {
                tm1.a("BootImageInteractAddCartPresenter", "addCart mBootImageInfo == null");
                return;
            }
            tm1.a("BootImageInteractAddCartPresenter", "addCart加购请求开始 mBootImageInfo == " + this.b);
            if (this.e) {
                tm1.a("BootImageInteractAddCartPresenter", "加购请求中");
                return;
            }
            HashMap hashMap = new HashMap(3);
            hashMap.put("itemId", this.b.cardItemId);
            hashMap.put("showSku", Boolean.FALSE);
            hashMap.put(q2q.KEY_SKU_ID, this.b.cardSkuId);
            rrh.e().o(new vrh("msoa.taobao.cart.open", "msoa.taobao.cart.open.add", "1.0", "splashInteract", hashMap), this);
            this.e = true;
        } catch (Throwable th) {
            tm1.a("BootImageInteractAddCartPresenter", "addCart加购请求errro");
            th.printStackTrace();
        }
    }
}
