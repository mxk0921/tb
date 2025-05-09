package androidx.core.view;

import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements g1a<ViewParent, ViewParent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public static /* synthetic */ Object ipc$super(ViewKt$ancestors$1 viewKt$ancestors$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/ViewKt$ancestors$1");
    }

    public final ViewParent invoke(ViewParent viewParent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewParent) ipChange.ipc$dispatch("3e1d98a1", new Object[]{this, viewParent}) : viewParent.getParent();
    }
}
