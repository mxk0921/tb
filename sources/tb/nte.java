package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nte extends oa4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912261435);
    }

    public nte(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ Object ipc$super(nte nteVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/IndustryDividerComponent");
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        if (view != null && view.getId() == R.id.ll_industry_divider) {
            return view;
        }
        PreRenderManager g = PreRenderManager.g(this.mContext);
        if (g != null) {
            return g.j(this.mContext, R.layout.tt_detail_industry_divider, null, true);
        }
        return LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_industry_divider, (ViewGroup) null);
    }
}
