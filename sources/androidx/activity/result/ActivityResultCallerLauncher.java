package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Metadata;
import kotlin.a;
import tb.ckf;
import tb.njg;
import tb.wzi;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R'\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015¨\u0006\u001f"}, d2 = {"Landroidx/activity/result/ActivityResultCallerLauncher;", TLogTracker.LEVEL_INFO, "O", "Landroidx/activity/result/ActivityResultLauncher;", "Ltb/xhv;", wzi.LAUNCHER, "Landroidx/activity/result/contract/ActivityResultContract;", "callerContract", "callerInput", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;)V", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "launch", "(Ltb/xhv;Landroidx/core/app/ActivityOptionsCompat;)V", MiPushClient.COMMAND_UNREGISTER, "()V", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/contract/ActivityResultContract;", "getCallerContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Object;", "getCallerInput", "()Ljava/lang/Object;", "resultContract$delegate", "Ltb/njg;", "getResultContract", "resultContract", "contract", "getContract", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;
    private final ActivityResultLauncher<I> launcher;
    private final njg resultContract$delegate = a.b(new ActivityResultCallerLauncher$resultContract$2(this));
    private final ActivityResultContract<xhv, O> contract = getResultContract();

    public ActivityResultCallerLauncher(ActivityResultLauncher<I> activityResultLauncher, ActivityResultContract<I, O> activityResultContract, I i) {
        ckf.g(activityResultLauncher, wzi.LAUNCHER);
        ckf.g(activityResultContract, "callerContract");
        this.launcher = activityResultLauncher;
        this.callerContract = activityResultContract;
        this.callerInput = i;
    }

    private final ActivityResultContract<xhv, O> getResultContract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityResultContract) ipChange.ipc$dispatch("19bf71b6", new Object[]{this});
        }
        return (ActivityResultContract) this.resultContract$delegate.getValue();
    }

    public static /* synthetic */ Object ipc$super(ActivityResultCallerLauncher activityResultCallerLauncher, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/result/ActivityResultCallerLauncher");
    }

    public final ActivityResultContract<I, O> getCallerContract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityResultContract) ipChange.ipc$dispatch("fae0b708", new Object[]{this});
        }
        return this.callerContract;
    }

    public final I getCallerInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (I) ipChange.ipc$dispatch("8aa5b362", new Object[]{this});
        }
        return this.callerInput;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract<xhv, ?> getContract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityResultContract) ipChange.ipc$dispatch("9429753", new Object[]{this});
        }
        return (ActivityResultContract<xhv, O>) this.contract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
        } else {
            this.launcher.unregister();
        }
    }

    public void launch(xhv xhvVar, ActivityOptionsCompat activityOptionsCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8ae953", new Object[]{this, xhvVar, activityOptionsCompat});
            return;
        }
        ckf.g(xhvVar, "input");
        this.launcher.launch(this.callerInput, activityOptionsCompat);
    }
}
