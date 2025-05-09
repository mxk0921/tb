package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r28 implements IDxItemClickService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vzi f27052a;
    public final cfc b;

    static {
        t2o.a(491782300);
        t2o.a(488636551);
    }

    public r28(vzi vziVar, cfc cfcVar) {
        this.f27052a = vziVar;
        this.b = cfcVar;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b34c27", new Object[]{this});
        } else {
            this.f27052a.a("click");
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93988741", new Object[]{this});
            return;
        }
        Map<String, Object> b = this.f27052a.b("click");
        String a2 = this.b.getContainerType().a();
        gve.a("click", a2, b);
        gve.b("click", a2, b);
    }

    public final String c(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54c4fe4e", new Object[]{this, baseSectionModel, baseSubItemModel});
        }
        if (baseSubItemModel == null) {
            fve.e("DxItemClickListener", "subItem == null");
            return null;
        } else if (!baseSectionModel.slimSection()) {
            JSONObject ext = baseSubItemModel.getExt();
            if (ext != null) {
                return ext.getString("realtimeClickParam");
            }
            fve.e("DxItemClickListener", "ext == null");
            return null;
        } else if (baseSubItemModel.getJSONObject("clickParam") != null) {
            return baseSubItemModel.getJSONObject("clickParam").getString("realtimeClickParam");
        } else {
            fve.e("DxItemClickListener", "track == null");
            return null;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.a
    public void click(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1596985", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        d(baseSectionModel, baseSubItemModel);
        b();
        a();
    }

    public final void d(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bafc6037", new Object[]{this, baseSectionModel, baseSubItemModel});
            return;
        }
        String c = c(baseSectionModel, baseSubItemModel);
        if (c == null || TextUtils.isEmpty(c)) {
            fve.e("DxItemClickListener", "realTimeClickParams == null");
        } else {
            this.f27052a.e(c);
        }
    }
}
