package com.taobao.mytaobao.pagev2.architecture;

import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import kotlin.Metadata;
import tb.ckf;
import tb.h3j;
import tb.j3j;
import tb.n3j;
import tb.o3j;
import tb.pb6;
import tb.t2o;
import tb.uv6;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/MtbDxViewHolder;", "Lcom/taobao/mytaobao/pagev2/architecture/MtbAbsViewHolder;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbDxViewHolder extends MtbAbsViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final s b;
    public final n3j c;
    public h3j d;
    public final FrameLayout e;
    public final JSONObject f;

    static {
        t2o.a(745537903);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbDxViewHolder(j3j j3jVar, FrameLayout frameLayout, JSONObject jSONObject, String str) {
        super(frameLayout, str);
        ckf.h(j3jVar, "mtbContext");
        ckf.h(frameLayout, "flContainer");
        ckf.h(str, "identifier");
        this.e = frameLayout;
        this.f = jSONObject;
        this.b = j3jVar.a();
        this.c = j3jVar.c();
    }

    public static /* synthetic */ Object ipc$super(MtbDxViewHolder mtbDxViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/architecture/MtbDxViewHolder");
    }

    public final void c0(h3j h3jVar, Integer num) {
        JSONObject g;
        int i;
        boolean z = true;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8f5c35", new Object[]{this, h3jVar, num});
            return;
        }
        ckf.h(h3jVar, "data");
        if (!f0(this.d, h3jVar)) {
            uv6.j("VH 无diff, moduleName=" + h3jVar.f());
            return;
        }
        DXRootView d0 = d0(h3jVar);
        if (d0 != null && (g = h3jVar.g()) != null) {
            if (h3jVar.h() == 3) {
                z = false;
            }
            o3j o3jVar = new o3j(h3jVar, this.f);
            if (num != null) {
                i2 = num.intValue();
            }
            if (i2 > 0) {
                i = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else {
                i = pb6.j();
            }
            this.b.w(d0.getContext(), g, d0, -1, new DXRenderOptions.b().G(i).t(pb6.i()).C(z).E(o3jVar).q());
            this.d = h3jVar;
        }
    }

    public final h3j e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3j) ipChange.ipc$dispatch("ba705708", new Object[]{this});
        }
        return this.d;
    }

    public final boolean f0(h3j h3jVar, h3j h3jVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5917ef2d", new Object[]{this, h3jVar, h3jVar2})).booleanValue();
        }
        if (h3jVar == null) {
            return true;
        }
        if (!h3jVar2.d()) {
            return !ckf.b(h3jVar.b(), h3jVar2.b());
        }
        h3jVar2.l(false);
        return true;
    }

    public final DXRootView d0(h3j h3jVar) {
        DXRootView dXRootView;
        DXRootView dXRootView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("e34787ee", new Object[]{this, h3jVar});
        }
        DXTemplateItem c = h3jVar.c();
        if (c != null) {
            View childAt = this.e.getChildAt(0);
            if (!(childAt instanceof DXRootView)) {
                childAt = null;
            }
            DXRootView dXRootView3 = (DXRootView) childAt;
            JSONObject g = h3jVar.g();
            if (g == null || g.isEmpty()) {
                TLog.loge("mtbMainLink", "【异常】data.originData空, identify=" + b0());
                return dXRootView3;
            } else if (dXRootView3 == null) {
                DXTemplateItem b = this.c.b(c);
                if (b != null) {
                    DXResult<DXRootView> o = this.b.o(this.e.getContext(), b);
                    if (o == null || (dXRootView2 = o.f7291a) == null) {
                        StringBuilder sb = new StringBuilder("【异常】preCreateView.result空, error=");
                        sb.append(o != null ? o.a() : null);
                        sb.append(" identify=");
                        sb.append(b0());
                        TLog.loge("mtbMainLink", sb.toString());
                        return null;
                    }
                    this.e.removeAllViews();
                    dXRootView2.setId(R.id.mtbDxRootView);
                    this.e.addView(dXRootView2, -1, -2);
                    return dXRootView2;
                }
                TLog.loge("mtbMainLink", "【异常】fetchAvailableTemplate空, identify=" + b0());
                return null;
            } else {
                DXTemplateItem b2 = this.c.b(c);
                if (b2 != null) {
                    DXTemplateItem dxTemplateItem = dXRootView3.getDxTemplateItem();
                    ckf.c(dxTemplateItem, "oldDxRootView.dxTemplateItem");
                    if (ckf.b(dxTemplateItem.d(), b2.d())) {
                        return dXRootView3;
                    }
                    DXResult<DXRootView> o2 = this.b.o(this.e.getContext(), b2);
                    if (o2 == null || (dXRootView = o2.f7291a) == null) {
                        StringBuilder sb2 = new StringBuilder("【异常1】preCreateView.result空, error=");
                        sb2.append(o2 != null ? o2.a() : null);
                        sb2.append(" identify=");
                        sb2.append(b0());
                        TLog.loge("mtbMainLink", sb2.toString());
                        return null;
                    }
                    this.e.removeAllViews();
                    dXRootView.setId(R.id.mtbDxRootView);
                    this.e.addView(dXRootView, -1, -2);
                    return dXRootView;
                }
                TLog.loge("mtbMainLink", "【异常1】fetchAvailableTemplate空, identify=" + b0());
                return null;
            }
        } else {
            TLog.loge("mtbMainLink", "【异常】data.dxTemplate=null, identify=" + b0());
            return null;
        }
    }
}
