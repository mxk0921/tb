package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter.SizeChartViewAdapter;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter.SizeChartViewColumnAdapter;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.SizeChartItemModel;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m0q extends kd7<n0q> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final RelativeLayout h;
    public final RecyclerView i;
    public final RecyclerView j;
    public final View k;
    public final TextView l;
    public ArrayList<SizeChartItemModel> m;
    public SizeChartViewColumnAdapter n;
    public SizeChartViewAdapter o;
    public static final int DEFAULT_WIDTH = mr7.a(75.0f);
    public static final int DEFAULT_FIRST_COLUMN_WIDTH = mr7.a(90.0f);
    public static final int DEFAULT_HEIGHT = mr7.a(38.0f);
    public static final int DEFAULT_TEXT_SIZE = mr7.a(10.0f);
    public static final int DEFAULT_TEXT_PADDING = mr7.a(5.0f);

    static {
        t2o.a(912262398);
    }

    public m0q(Context context) {
        super(context);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_measures_layout, (ViewGroup) null);
        this.h = relativeLayout;
        this.j = (RecyclerView) relativeLayout.findViewById(R.id.titleColumn);
        this.i = (RecyclerView) relativeLayout.findViewById(R.id.dataColumn);
        this.k = relativeLayout.findViewById(R.id.shadow);
        this.l = (TextView) relativeLayout.findViewById(R.id.container_title);
    }

    public static /* synthetic */ Object ipc$super(m0q m0qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/SizeChartViewHolder");
    }

    /* renamed from: e */
    public void h(n0q n0qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6556ad59", new Object[]{this, n0qVar});
        }
    }

    /* renamed from: k */
    public boolean m(n0q n0qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("713253dd", new Object[]{this, n0qVar})).booleanValue();
        }
        return false;
    }

    public final void z(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2d89ef", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setOverScrollMode(2);
    }

    /* renamed from: x */
    public View j(n0q n0qVar) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("13d6b4cd", new Object[]{this, n0qVar});
        }
        ArrayList<SizeChartItemModel> arrayList = n0qVar.k;
        this.m = arrayList;
        if (arrayList == null || arrayList.size() == 0) {
            return new View(this.f22590a);
        }
        if (!TextUtils.isEmpty(n0qVar.l)) {
            this.l.setText(n0qVar.l);
            this.l.setVisibility(0);
        }
        int size = this.m.get(0).rowData.size();
        int i = (size + 1) * DEFAULT_HEIGHT;
        int i2 = (this.m.get(0).maxLength * DEFAULT_TEXT_SIZE) + (DEFAULT_TEXT_PADDING * 2);
        int i3 = DEFAULT_FIRST_COLUMN_WIDTH;
        if (i3 > i2) {
            i2 = i3;
        }
        SizeChartViewColumnAdapter sizeChartViewColumnAdapter = new SizeChartViewColumnAdapter(this.f22590a, this.m.get(0));
        this.n = sizeChartViewColumnAdapter;
        sizeChartViewColumnAdapter.U(i2);
        this.j.setLayoutManager(new LinearLayoutManager(this.f22590a, 1, false));
        z(this.j, i2, i);
        this.j.setAdapter(this.n);
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 1; i4 < this.m.size(); i4++) {
            SizeChartItemModel sizeChartItemModel = this.m.get(i4);
            if (!(sizeChartItemModel == null || (list = sizeChartItemModel.rowData) == null)) {
                int size2 = list.size();
                for (int i5 = size2; i5 < size; i5++) {
                    sizeChartItemModel.rowData.add("");
                }
                for (int i6 = size2 - 1; i6 >= size; i6--) {
                    sizeChartItemModel.rowData.remove(i6);
                }
            }
            arrayList2.add(sizeChartItemModel);
        }
        this.o = new SizeChartViewAdapter(this.f22590a, arrayList2);
        if (!arrayList2.isEmpty()) {
            int width = ((((WindowManager) this.f22590a.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth() - i2) - this.k.getLayoutParams().width) / arrayList2.size();
            int i7 = DEFAULT_WIDTH;
            if (width < i7) {
                width = i7;
            }
            int size3 = arrayList2.size();
            int width2 = this.i.getWidth();
            if (width2 > 0 && size3 * width < width2) {
                width = width2 / size3;
            }
            this.o.P(width);
        }
        this.o.N(i);
        this.i.setLayoutManager(new LinearLayoutManager(this.f22590a, 0, false));
        z(this.i, -2, i);
        this.i.setAdapter(this.o);
        return this.h;
    }
}
