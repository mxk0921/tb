package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class akj implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BaseSectionModel f15789a;
    public final BaseSectionModel b;
    public final r44 c = new r44();
    public final cfc d;

    static {
        t2o.a(491782502);
    }

    public akj(cfc cfcVar, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        this.f15789a = baseSectionModel2;
        this.b = baseSectionModel;
        this.d = cfcVar;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4786e35", new Object[]{this});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) this.d.a(ICardOverlayService.class);
        if (iCardOverlayService != null) {
            iCardOverlayService.hideOverlay();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        BaseItemModel item = this.f15789a.getItem();
        if (item != null && (jSONObject = item.getJSONObject(r4p.VALUE_SHOWTYPE_SIMILAR)) != null) {
            this.c.a(this.f15789a, jSONObject);
            a();
            hue.f(this.b, jSONObject);
            jve.e(view.getContext(), jSONObject.getString("targetUrl"));
        }
    }
}
