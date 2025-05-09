package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import tb.sgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kdm implements sgc.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e3b f22594a;

    static {
        t2o.a(491782601);
        t2o.a(488636482);
    }

    public kdm(e3b e3bVar) {
        this.f22594a = e3bVar;
    }

    @Override // tb.sgc.b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
        }
    }

    public final String b(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14ce5760", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel == null) {
            return null;
        }
        return baseSectionModel.getSectionBizCode();
    }

    @Override // tb.sgc.b
    public void h(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab94fc2e", new Object[]{this, new Integer(i), view, baseSectionModel});
            return;
        }
        String b = b(baseSectionModel);
        if (!TextUtils.isEmpty(b)) {
            this.f22594a.j().i(i, view, b);
        }
    }

    @Override // tb.sgc.b
    public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
        }
    }

    @Override // tb.sgc.b
    public void o(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4bbbcc6", new Object[]{this, new Integer(i), view, baseSectionModel});
            return;
        }
        String b = b(baseSectionModel);
        if (!TextUtils.isEmpty(b)) {
            this.f22594a.j().h(i, view, b);
        }
    }
}
