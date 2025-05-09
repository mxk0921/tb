package androidx.activity;

import androidx.lifecycle.ViewModelProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ActivityViewModelLazyKt$viewModels$factoryPromise$2 extends Lambda implements d1a<ViewModelProvider.Factory> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityViewModelLazyKt$viewModels$factoryPromise$2(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    public static /* synthetic */ Object ipc$super(ActivityViewModelLazyKt$viewModels$factoryPromise$2 activityViewModelLazyKt$viewModels$factoryPromise$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final ViewModelProvider.Factory invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewModelProvider.Factory) ipChange.ipc$dispatch("7bf7f036", new Object[]{this}) : this.$this_viewModels.getDefaultViewModelProviderFactory();
    }
}
