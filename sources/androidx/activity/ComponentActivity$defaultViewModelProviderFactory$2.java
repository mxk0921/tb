package androidx.activity;

import android.app.Application;
import androidx.lifecycle.SavedStateViewModelFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/SavedStateViewModelFactory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ComponentActivity$defaultViewModelProviderFactory$2 extends Lambda implements d1a<SavedStateViewModelFactory> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ComponentActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivity$defaultViewModelProviderFactory$2(ComponentActivity componentActivity) {
        super(0);
        this.this$0 = componentActivity;
    }

    public static /* synthetic */ Object ipc$super(ComponentActivity$defaultViewModelProviderFactory$2 componentActivity$defaultViewModelProviderFactory$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/ComponentActivity$defaultViewModelProviderFactory$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final SavedStateViewModelFactory invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SavedStateViewModelFactory) ipChange.ipc$dispatch("92458c35", new Object[]{this});
        }
        Application application = this.this$0.getApplication();
        ComponentActivity componentActivity = this.this$0;
        return new SavedStateViewModelFactory(application, componentActivity, componentActivity.getIntent() != null ? this.this$0.getIntent().getExtras() : null);
    }
}
