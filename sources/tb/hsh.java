package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.instance.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import com.taobao.mytaobao.ultron.MTBOrderDataProvider;
import com.taobao.mytaobao.ultron.MTBPresenter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hsh implements a.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public epb f20863a;

    static {
        t2o.a(745538034);
        t2o.a(157286653);
    }

    public hsh(epb epbVar) {
        this.f20863a = epbVar;
    }

    @Override // com.alibaba.android.ultron.vfw.instance.a.h
    public void a(List<IDMComponent> list, et6 et6Var, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe35e52", new Object[]{this, list, et6Var, u55Var});
            return;
        }
        sc.b(sc.processMainData);
        if (!(u55Var == null || list == null)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            epb epbVar = this.f20863a;
            if (epbVar != null) {
                ((MTBPresenter) epbVar).s(list);
            }
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null) {
                    String h = ParseModule.h(iDMComponent);
                    if ("footer".equals(h)) {
                        arrayList2.add(iDMComponent);
                    } else if ("header".equals(h)) {
                        arrayList.add(iDMComponent);
                    } else if (TextUtils.equals("orderModule", iDMComponent.getTag())) {
                        eb4.c(iDMComponent, MTBOrderDataProvider.g());
                    }
                }
                arrayList3.add(iDMComponent);
            }
            et6Var.q(arrayList);
            et6Var.o(arrayList2);
            et6Var.l(arrayList3);
        }
        sc.c(sc.processMainData);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1884d003", new Object[]{this});
        } else {
            this.f20863a = null;
        }
    }
}
