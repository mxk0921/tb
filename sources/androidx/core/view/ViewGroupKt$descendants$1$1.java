package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.sbp;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "child", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewGroupKt$descendants$1$1 extends Lambda implements g1a<View, Iterator<? extends View>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ViewGroupKt$descendants$1$1 INSTANCE = new ViewGroupKt$descendants$1$1();

    public ViewGroupKt$descendants$1$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(ViewGroupKt$descendants$1$1 viewGroupKt$descendants$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/ViewGroupKt$descendants$1$1");
    }

    public final Iterator<View> invoke(View view) {
        sbp<View> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("2e182724", new Object[]{this, view});
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (children = ViewGroupKt.getChildren(viewGroup)) == null) {
            return null;
        }
        return children.iterator();
    }
}
