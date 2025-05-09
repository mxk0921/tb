package androidx.activity.result;

import androidx.activity.result.ActivityResultCallerKt;
import androidx.activity.result.contract.ActivityResultContract;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a`\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000e\u001aX\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {TLogTracker.LEVEL_INFO, "O", "Landroidx/activity/result/ActivityResultCaller;", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "Ltb/xhv;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Ltb/g1a;)Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Ltb/g1a;)Landroidx/activity/result/ActivityResultLauncher;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ActivityResultCallerKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <I, O> ActivityResultLauncher<xhv> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i, ActivityResultRegistry activityResultRegistry, final g1a<O, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityResultLauncher) ipChange.ipc$dispatch("7d7af652", new Object[]{activityResultCaller, activityResultContract, i, activityResultRegistry, g1aVar});
        }
        ckf.g(activityResultCaller, "<this>");
        ckf.g(activityResultContract, "contract");
        ckf.g(activityResultRegistry, "registry");
        ckf.g(g1aVar, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, activityResultRegistry, new ActivityResultCallback() { // from class: tb.bc0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultCallerKt.registerForActivityResult$lambda$0(g1a.this, obj);
            }
        }), activityResultContract, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$0(g1a g1aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28d994e", new Object[]{g1aVar, obj});
            return;
        }
        ckf.g(g1aVar, "$callback");
        g1aVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$1(g1a g1aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be1ee8f", new Object[]{g1aVar, obj});
            return;
        }
        ckf.g(g1aVar, "$callback");
        g1aVar.invoke(obj);
    }

    public static final <I, O> ActivityResultLauncher<xhv> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i, final g1a<O, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityResultLauncher) ipChange.ipc$dispatch("ea082234", new Object[]{activityResultCaller, activityResultContract, i, g1aVar});
        }
        ckf.g(activityResultCaller, "<this>");
        ckf.g(activityResultContract, "contract");
        ckf.g(g1aVar, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, new ActivityResultCallback() { // from class: tb.cc0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultCallerKt.registerForActivityResult$lambda$1(g1a.this, obj);
            }
        }), activityResultContract, i);
    }
}
