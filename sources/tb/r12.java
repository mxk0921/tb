package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.TabModel;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltb/r12;", "Ltb/j12;", "Lcom/taobao/android/turbo/model/TabModel;", "tabModel", "<init>", "(Lcom/taobao/android/turbo/model/TabModel;)V", "", "isEnableShareButton", "()Z", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class r12 extends j12<TabModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(916455466);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r12(TabModel tabModel) {
        super(tabModel);
        ckf.g(tabModel, "tabModel");
    }

    public static /* synthetic */ Object ipc$super(r12 r12Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/base/subpage/config/BaseTabConfig");
    }

    public abstract boolean isEnableShareButton();
}
