package tb;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.taobao.TBActionBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.search.searchdoor.shop.widget.bar.ShopSearchBarPresenter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kqp extends sxh<LinearLayout, jqp, ShopSearchBarPresenter, s4p, Void> implements jrk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793317);
        t2o.a(815793297);
    }

    public kqp(Activity activity, ude udeVar, s4p s4pVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, s4pVar, viewGroup, vfwVar);
        u2().setTextChangeListener(this);
        attachToContainer();
    }

    public static /* synthetic */ Object ipc$super(kqp kqpVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 593843865) {
            super.onCtxDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/shop/widget/bar/ShopSearchBarWidget");
        }
    }

    public void A2(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            u2().handleIntent(intent, t2(), false);
        }
    }

    public void B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8a3e4f", new Object[]{this});
        } else {
            t2().T();
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return kqp.class.getSimpleName();
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        t2().S();
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        if (FestivalMgr.i().v("global")) {
            y2();
        } else {
            x2();
        }
    }

    /* renamed from: v2 */
    public ShopSearchBarPresenter q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopSearchBarPresenter) ipChange.ipc$dispatch("7b22e04d", new Object[]{this});
        }
        return new ShopSearchBarPresenter();
    }

    /* renamed from: w2 */
    public jqp s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqp) ipChange.ipc$dispatch("1caf4425", new Object[]{this});
        }
        return new jqp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    public final void x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b11b6f", new Object[]{this});
            return;
        }
        FestivalMgr.i().E(this.mActivity, getView(), TBActionBar.ActionBarStyle.NORMAL);
        t2().w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    public final void y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76acf4b7", new Object[]{this});
            return;
        }
        FestivalMgr.i().E(this.mActivity, getView(), TBActionBar.ActionBarStyle.NORMAL);
        t2().O();
    }

    public void z2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d91382d", new Object[]{this, str});
        } else {
            postEvent(i0p.a(str));
        }
    }
}
