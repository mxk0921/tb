package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.gl4;
import tb.i04;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", gl4.CONFIG_ENTRY, "", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class DefaultSpecialEffectsController$retainMatchingViews$1 extends Lambda implements g1a<Map.Entry<String, View>, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Collection<String> $names;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$retainMatchingViews$1(Collection<String> collection) {
        super(1);
        this.$names = collection;
    }

    public static /* synthetic */ Object ipc$super(DefaultSpecialEffectsController$retainMatchingViews$1 defaultSpecialEffectsController$retainMatchingViews$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/DefaultSpecialEffectsController$retainMatchingViews$1");
    }

    public final Boolean invoke(Map.Entry<String, View> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b9b35035", new Object[]{this, entry});
        }
        ckf.g(entry, gl4.CONFIG_ENTRY);
        return Boolean.valueOf(i04.R(this.$names, ViewCompat.getTransitionName(entry.getValue())));
    }
}
