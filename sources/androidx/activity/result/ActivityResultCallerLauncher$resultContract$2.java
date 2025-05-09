package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0005*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", TLogTracker.LEVEL_INFO, "O", "invoke", "()Landroidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ActivityResultCallerLauncher$resultContract$2 extends Lambda implements d1a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityResultCallerLauncher$resultContract$2(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
        super(0);
        this.this$0 = activityResultCallerLauncher;
    }

    public static /* synthetic */ Object ipc$super(ActivityResultCallerLauncher$resultContract$2 activityResultCallerLauncher$resultContract$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/result/ActivityResultCallerLauncher$resultContract$2");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
    @Override // tb.d1a
    public final AnonymousClass1 invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnonymousClass1) ipChange.ipc$dispatch("32fe4347", new Object[]{this});
        }
        final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.this$0;
        return new ActivityResultContract<xhv, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1");
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, O] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, O] */
            @Override // androidx.activity.result.contract.ActivityResultContract
            public O parseResult(int i, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("5868e1e9", new Object[]{this, new Integer(i), intent});
                }
                return activityResultCallerLauncher.getCallerContract().parseResult(i, intent);
            }

            public Intent createIntent(Context context, xhv xhvVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Intent) ipChange2.ipc$dispatch("d3dfca0d", new Object[]{this, context, xhvVar});
                }
                ckf.g(context, "context");
                ckf.g(xhvVar, "input");
                return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
            }
        };
    }
}
