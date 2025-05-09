package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter.QualityViewAdapter;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.QualityViewModel;
import com.taobao.taobao.R;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n7n extends kd7<QualityViewModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final RecyclerView h;
    public final View i;
    public final TextView j;
    public final TextView k;
    public final View l;

    static {
        t2o.a(912262393);
    }

    public n7n(Context context) {
        super(context);
        View inflate = LayoutInflater.from(this.f22590a).inflate(R.layout.tt_detail_desc_quality, (ViewGroup) null);
        this.l = inflate;
        this.k = (TextView) inflate.findViewById(R.id.tv_desc_quality_title);
        this.i = inflate.findViewById(R.id.ll_quality_desc);
        this.j = (TextView) inflate.findViewById(R.id.tv_quality_desc);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_quality_image_container);
        this.h = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f22590a);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public static /* synthetic */ Object ipc$super(n7n n7nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/QualityViewHolder");
    }

    /* renamed from: e */
    public boolean m(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2a5f77f", new Object[]{this, qualityViewModel})).booleanValue();
        }
        return false;
    }

    /* renamed from: w */
    public void h(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f12b0fb", new Object[]{this, qualityViewModel});
            return;
        }
        if (!TextUtils.isEmpty(qualityViewModel.m)) {
            this.k.setText(qualityViewModel.m);
        }
        if (!TextUtils.isEmpty(qualityViewModel.n)) {
            this.k.setTextColor(w14.a(qualityViewModel.n));
        }
        List<String> list = qualityViewModel.k;
        if (list == null || list.isEmpty()) {
            this.i.setVisibility(8);
        } else {
            this.j.setText(gt4.b(list, "    "));
            this.i.setVisibility(0);
        }
        this.h.setAdapter(new QualityViewAdapter(this.f22590a, qualityViewModel));
    }

    /* renamed from: x */
    public View j(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5c24086f", new Object[]{this, qualityViewModel});
        }
        return this.l;
    }
}
