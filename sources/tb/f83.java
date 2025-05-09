package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BaseSectionModel<?> f19095a;
    public final WeakReference<View> b;

    static {
        t2o.a(486539532);
    }

    public f83(BaseSectionModel<?> baseSectionModel, View view) {
        this.f19095a = baseSectionModel;
        this.b = new WeakReference<>(view);
    }

    public BaseSectionModel<?> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("c3db1ffd", new Object[]{this});
        }
        return this.f19095a;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b.get();
    }
}
