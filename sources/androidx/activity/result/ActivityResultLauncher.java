package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H'¢\u0006\u0004\b\f\u0010\u0004R\u001e\u0010\u0010\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/ActivityResultLauncher;", TLogTracker.LEVEL_INFO, "", "<init>", "()V", "input", "Ltb/xhv;", "launch", "(Ljava/lang/Object;)V", "Landroidx/core/app/ActivityOptionsCompat;", "options", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", MiPushClient.COMMAND_UNREGISTER, "Landroidx/activity/result/contract/ActivityResultContract;", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "contract", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ActivityResultLauncher<I> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract ActivityResultContract<I, ?> getContract();

    public void launch(I i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17150c16", new Object[]{this, i});
        } else {
            launch(i, null);
        }
    }

    public abstract void launch(I i, ActivityOptionsCompat activityOptionsCompat);

    public abstract void unregister();
}
