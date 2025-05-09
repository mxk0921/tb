package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class onq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<RecyclerViewHolder> f25517a = new ArrayList();
    public final ViewGroup b;
    public final rew c;

    static {
        t2o.a(157286762);
    }

    public onq(ViewGroup viewGroup, rew rewVar) {
        this.b = viewGroup;
        this.c = rewVar;
    }

    public abstract List<IDMComponent> a();

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49229de7", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            if (viewGroup.getChildCount() > 0) {
                this.b.removeAllViews();
            }
            if (((ArrayList) this.f25517a).size() > 0) {
                ((ArrayList) this.f25517a).clear();
            }
            List<IDMComponent> a2 = a();
            if (!(a2 == null || a2.isEmpty())) {
                for (IDMComponent iDMComponent : a2) {
                    RecyclerViewHolder c = this.c.c(this.b, this.c.f(iDMComponent));
                    View view = c.itemView;
                    if (view != null) {
                        this.b.addView(view);
                        ((ArrayList) this.f25517a).add(c);
                        if (iDMComponent.getStatus() == 0) {
                            view.setVisibility(8);
                        } else {
                            view.setVisibility(0);
                        }
                    }
                    this.c.b(c, iDMComponent);
                }
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979ad0a7", new Object[]{this});
            return;
        }
        List<IDMComponent> a2 = a();
        for (int i = 0; i < a2.size(); i++) {
            RecyclerViewHolder recyclerViewHolder = (RecyclerViewHolder) ((ArrayList) this.f25517a).get(i);
            IDMComponent iDMComponent = a2.get(i);
            this.c.b(recyclerViewHolder, iDMComponent);
            if (iDMComponent.getStatus() == 0) {
                recyclerViewHolder.itemView.setVisibility(8);
            } else {
                recyclerViewHolder.itemView.setVisibility(0);
            }
        }
    }
}
