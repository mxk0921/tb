package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent.SubPageModel;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00028\u00008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltb/j12;", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;", "MODEL", "", "subPageModel", "<init>", "(Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;)V", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;", "getSubPageModel", "()Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class j12<MODEL extends BaseSubPageComponent.SubPageModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final MODEL subPageModel;

    static {
        t2o.a(919601361);
    }

    public j12(MODEL model) {
        ckf.g(model, "subPageModel");
        this.subPageModel = model;
    }

    public final MODEL getSubPageModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MODEL) ((BaseSubPageComponent.SubPageModel) ipChange.ipc$dispatch("aef4ce15", new Object[]{this}));
        }
        return this.subPageModel;
    }
}
