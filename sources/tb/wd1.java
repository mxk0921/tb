package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.widget.XRateFlowLayout;
import com.taobao.detail.rate.widget.delegate.tag.AssociationTagItemView;
import com.taobao.detail.rate.widget.delegate.tag.bean.AssociationTagItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wd1 extends gss<AssociationTagItem> implements ouk<AssociationTagItem> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context c;
    public final k25 d;
    public final HashMap<Integer, hyd> e = new HashMap<>();
    public int f = -1;

    public wd1(Context context, List<AssociationTagItem> list, k25 k25Var) {
        super(list);
        this.c = context;
        this.d = k25Var;
    }

    public static /* synthetic */ Object ipc$super(wd1 wd1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/widget/delegate/tag/adapter/AssociationTagAdapter");
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcb922d", new Object[]{this, new Integer(i)});
        } else if (this.f != i) {
            h(i, true);
        } else {
            this.b.a(i, c(i));
        }
    }

    /* renamed from: g */
    public View d(XRateFlowLayout xRateFlowLayout, int i, AssociationTagItem associationTagItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6ea7006b", new Object[]{this, xRateFlowLayout, new Integer(i), associationTagItem});
        }
        AssociationTagItemView associationTagItemView = new AssociationTagItemView(this.c);
        associationTagItemView.bindData(this.d, c(i), i, this);
        this.e.put(Integer.valueOf(i), associationTagItemView);
        return associationTagItemView;
    }

    public final void h(int i, boolean z) {
        boolean z2;
        ouk<T> oukVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571ab46", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.f = i;
        for (Map.Entry<Integer, hyd> entry : this.e.entrySet()) {
            hyd value = entry.getValue();
            int intValue = entry.getKey().intValue();
            if (i == intValue) {
                z2 = true;
            } else {
                z2 = false;
            }
            value.setSelectedStatus(z2);
            if (i == intValue && (oukVar = this.b) != 0 && z) {
                oukVar.a(i, c(i));
            }
        }
    }

    /* renamed from: i */
    public void a(int i, AssociationTagItem associationTagItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907514be", new Object[]{this, new Integer(i), associationTagItem});
        } else {
            f(i);
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d08d8c5", new Object[]{this, new Integer(i)});
        } else {
            h(i, false);
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf63d35", new Object[]{this, new Integer(i)});
        } else {
            j(i);
        }
    }
}
