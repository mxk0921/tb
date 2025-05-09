package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lcm extends wu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e3b f23259a;
    public final IContainerDataService b;
    public final IMainFeedsViewService c;

    static {
        t2o.a(491782600);
    }

    public lcm(e3b e3bVar, IContainerDataService iContainerDataService, IMainFeedsViewService iMainFeedsViewService) {
        this.f23259a = e3bVar;
        this.b = iContainerDataService;
        this.c = iMainFeedsViewService;
    }

    public static /* synthetic */ Object ipc$super(lcm lcmVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1389471316) {
            super.d(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        } else if (hashCode == -1172900388) {
            super.b();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/taobao/subservice/biz/pop/lifecycle/PopDataObserver");
        }
    }

    @Override // tb.wu
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            return;
        }
        vfm.f("PopDataObserver ", "onChanged");
        super.b();
    }

    @Override // tb.wu
    public void d(int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2e59ac", new Object[]{this, new Integer(i), new Integer(i2), obj});
            return;
        }
        vfm.f("PopDataObserver ", "onItemRangeChangedPayload, posStart=" + i + ", itemCount=" + i2);
        super.d(i, i2, obj);
    }

    public final View j(int i) {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cee7a66c", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || (iMainFeedsViewService = this.c) == null) {
            return null;
        }
        return iMainFeedsViewService.findItemViewByPosition(i);
    }

    public final String k(int i) {
        List totalData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e02178d0", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && (totalData = this.b.getContainerData().getTotalData()) != null && !totalData.isEmpty() && i < totalData.size()) {
            return ((BaseSectionModel) totalData.get(i)).getSectionBizCode();
        }
        return null;
    }

    @Override // tb.wu
    public void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        vfm.f("PopDataObserver ", "onItemRangeChanged, posStart=" + i + ", itemCount=" + i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            String k = k(i4);
            if (!TextUtils.isEmpty(k)) {
                this.f23259a.j().h(i4, j(i4), k);
            }
        }
    }
}
