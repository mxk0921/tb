package tb;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hfo implements h6c.c<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String R_EXT_ANCHOR = "anchor";

    /* renamed from: a  reason: collision with root package name */
    public final IRocketSubService.a f20605a;
    public boolean b;
    public JSONObject c;
    public int d;
    public final IContainerDataService<?> e;
    public WeakReference<IContainerInnerDataModel<BaseSectionModel>> f;

    static {
        t2o.a(486539573);
        t2o.a(488636470);
    }

    public hfo(cfc cfcVar, IRocketSubService.a aVar) {
        this.f20605a = aVar;
        this.e = (IContainerDataService) cfcVar.a(IContainerDataService.class);
    }

    public final void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4267a736", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                fve.e(s9m.LPM_BIZ_CODE, "current layoutManager is ".concat(layoutManager.getClass().getSimpleName()));
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean e = e(recyclerView);
            if (eue.b()) {
                fve.k("RocketOnScrollListener", "isAtR4UNow use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
            }
            if (this.b != e) {
                this.b = e;
                this.f20605a.a(e);
            }
        }
    }

    public final int b(JSONArray jSONArray, List<BaseSectionModel> list) {
        int b;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23921a00", new Object[]{this, jSONArray, list})).intValue();
        }
        Iterator<Object> it = jSONArray.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null && (b = e83.b(next.toString(), list)) >= 0) {
                i = b + 1;
                break;
            }
        }
        this.d = i;
        return i;
    }

    public final int c(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bc4e063", new Object[]{this, iArr})).intValue();
        }
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public int d() {
        IContainerInnerDataModel<BaseSectionModel> iContainerInnerDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1cb17e2", new Object[]{this})).intValue();
        }
        IContainerDataService<?> iContainerDataService = this.e;
        if (iContainerDataService == null) {
            fve.e("RocketOnScrollListener", "getRocketAnchorPosition dataService == null");
            return 0;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            fve.e("RocketOnScrollListener", "getRocketAnchorPosition containerData == null");
            return 0;
        }
        WeakReference<IContainerInnerDataModel<BaseSectionModel>> weakReference = this.f;
        if (weakReference == null) {
            iContainerInnerDataModel = null;
        } else {
            iContainerInnerDataModel = weakReference.get();
        }
        if (iContainerInnerDataModel == containerData.getBase()) {
            return this.d;
        }
        this.f = new WeakReference<>(containerData.getBase());
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            fve.e("RocketOnScrollListener", "getRocketAnchorPosition base == null");
            return 0;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            fve.e("RocketOnScrollListener", "getRocketAnchorPosition configTemp == null");
            return 0;
        }
        JSONArray jSONArray = ext.getJSONArray("jumpAnchor");
        List<BaseSectionModel> totalData = containerData.getTotalData();
        if (jSONArray == null || jSONArray.isEmpty() || totalData.isEmpty()) {
            return 0;
        }
        if (!ext.equals(this.c)) {
            this.c = ext;
            this.d = b(jSONArray, totalData);
        }
        return this.d;
    }

    public final boolean e(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43e3fcf4", new Object[]{this, recyclerView})).booleanValue();
        }
        if (c(((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPositions(null)) >= d()) {
            return true;
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    /* renamed from: g */
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
        } else if (i == 0) {
            a(recyclerView);
        }
    }

    /* renamed from: h */
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            a(recyclerView);
        }
    }

    @Override // tb.h6c.c
    public void n(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }
}
