package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.MUSDKInstance;
import tb.c3p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class icj extends jcj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793742);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icj(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        ckf.g(templateBean, "bean");
    }

    public static /* synthetic */ Object ipc$super(icj icjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 724233032) {
            super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
            return null;
        } else if (hashCode == 855112085) {
            super.onDestroyed((MUSDKInstance) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/pk/MusPopupPkWidget");
        }
    }

    @Override // tb.m8j, tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            return;
        }
        super.onDestroyed(mUSDKInstance);
        postScopeEvent(new c3p.h(), "childPageWidget");
    }

    @Override // tb.j4p, tb.m8j, tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        super.onRenderSuccess(aVar);
        postScopeEvent(new c3p.g(), "childPageWidget");
    }
}
