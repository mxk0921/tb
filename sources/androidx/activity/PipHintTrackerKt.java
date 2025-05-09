package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import tb.ar4;
import tb.dkf;
import tb.sp9;
import tb.xhv;
import tb.yp9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/app/Activity;", "Landroid/view/View;", "view", "Ltb/xhv;", "trackPipAnimationHintView", "(Landroid/app/Activity;Landroid/view/View;Ltb/ar4;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PipHintTrackerKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final /* synthetic */ Rect access$trackPipAnimationHintView$positionInWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("8c3a2596", new Object[]{view});
        }
        return trackPipAnimationHintView$positionInWindow(view);
    }

    public static final Object trackPipAnimationHintView(final Activity activity, View view, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d6ba052b", new Object[]{activity, view, ar4Var});
        }
        Object a2 = ((ChannelFlow) yp9.d(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null))).a(new sp9() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sp9
            public /* bridge */ /* synthetic */ Object emit(Object obj, ar4 ar4Var2) {
                return emit((Rect) obj, (ar4<? super xhv>) ar4Var2);
            }

            public final Object emit(Rect rect, ar4<? super xhv> ar4Var2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("f763f781", new Object[]{this, rect, ar4Var2});
                }
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return xhv.INSTANCE;
            }
        }, ar4Var);
        return a2 == dkf.d() ? a2 : xhv.INSTANCE;
    }

    private static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("83f144d6", new Object[]{view});
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
