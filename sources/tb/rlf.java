package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import java.util.Map;
import tb.qlf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rlf extends j4p implements qlf.b, smd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int A;
    public Integer v;
    public boolean w = true;
    public boolean x = true;
    public boolean y = false;
    public int z;

    static {
        t2o.a(815793432);
        t2o.a(815793431);
        t2o.a(993001662);
    }

    public rlf(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
        int w = o4p.w();
        this.A = (int) ((zuo.e() / 750.0f) * w);
    }

    public static /* synthetic */ Object ipc$super(rlf rlfVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -696042374:
                super.b(((Number) objArr[0]).intValue());
                return null;
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 761104299:
                super.K2((Map) objArr[0]);
                return null;
            case 1268056981:
                super.bindWithData((MuiseBean) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/newsearch/widgets/IpTopHeaderWidget");
        }
    }

    @Override // tb.j4p, tb.auc
    public void K0(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224521ba", new Object[]{this, new Boolean(z), new Float(f)});
            return;
        }
        ((FrameLayout) getView()).setAlpha(f);
        postEvent(hml.a((int) ((1.0f - f) * ((FrameLayout) getView()).getMeasuredHeight())));
    }

    @Override // tb.j4p, tb.m8j
    public void K2(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5d87ab", new Object[]{this, map});
            return;
        }
        super.K2(map);
        map.put("offsetTop", String.valueOf(p1p.d(this.z)));
        map.put("offsetBottom", String.valueOf(p1p.d(this.A)));
    }

    @Override // tb.smd
    public Integer W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4246d547", new Object[]{this});
        }
        return this.v;
    }

    @Override // tb.j4p, tb.auc
    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95530d", new Object[]{this});
            return;
        }
        this.x = true;
        s3();
    }

    @Override // tb.j4p, tb.auc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
            return;
        }
        super.b(i);
        this.z = i;
    }

    @Override // tb.smd
    public Integer f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2027a5aa", new Object[]{this});
        }
        return null;
    }

    @Override // tb.smd
    public int g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e18dc9c", new Object[]{this})).intValue();
        }
        return ((FrameLayout) getView()).getMeasuredHeight();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    @Override // tb.j4p, tb.auc
    public kr1 getBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("9c30dbef", new Object[]{this});
        }
        return new qlf(this, this, getView(), this.A);
    }

    @Override // tb.j4p, tb.auc
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726a97c8", new Object[]{this});
            return;
        }
        this.x = false;
        s3();
    }

    @Override // tb.smd
    public boolean h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36698c09", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.smd
    public Integer i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("209ec8de", new Object[]{this});
        }
        return null;
    }

    @Override // tb.m8j, tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        this.w = false;
        s3();
    }

    @Override // tb.m8j, tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        this.w = true;
        s3();
    }

    @Override // tb.j4p, tb.auc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40808c", new Object[]{this});
        } else if (this.c.x() != null && !this.c.x().isDestroyed()) {
            this.c.x().sendInstanceMessage("trigger", null);
        }
    }

    public final void s3() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7451cf", new Object[]{this});
            return;
        }
        if (this.x && this.w) {
            z = true;
        }
        if (z != this.y) {
            this.y = z;
            if (z) {
                S0();
            } else {
                j2();
            }
        }
    }

    @Override // tb.j4p, tb.m8j
    /* renamed from: v2 */
    public void bindWithData(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b950395", new Object[]{this, muiseBean});
            return;
        }
        super.bindWithData(muiseBean);
        if (muiseBean != null) {
            JSONObject d = h19.d(muiseBean.model, "style");
            if (d != null) {
                this.v = Integer.valueOf(SFPromotionBean.b(d.getString("statusBarStyle")));
            }
            s3();
        }
    }

    @Override // tb.smd
    public boolean x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5083ab1", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
