package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h86 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_POSTHEIGHTANIM = -2398747359691505742L;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Set<String> f20466a = new HashSet(4);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20467a;

        public a(h86 h86Var, String str) {
            this.f20467a = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/dinamic/DXPostHeightAnimEventHandler$1");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84781bba", new Object[]{this, animator, new Boolean(z)});
            } else {
                h86.b().remove(this.f20467a);
            }
        }
    }

    public static /* synthetic */ Set b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c8f10726", new Object[0]);
        }
        return f20466a;
    }

    public static /* synthetic */ void d(View view, View view2, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b5d549", new Object[]{view, view2, valueAnimator});
            return;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view.getLayoutParams().height = intValue;
        view.requestLayout();
        view2.getLayoutParams().height = intValue;
        view2.requestLayout();
        view2.invalidate();
    }

    public static /* synthetic */ Object ipc$super(h86 h86Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/dinamic/DXPostHeightAnimEventHandler");
    }

    public final int c(DinamicXEngine dinamicXEngine, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("636496d1", new Object[]{this, dinamicXEngine, context, new Integer(i)})).intValue();
        }
        if (dinamicXEngine != null) {
            return pb6.d(dinamicXEngine, context, i);
        }
        return pb6.c(context, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8 A[Catch: Exception -> 0x0061, TryCatch #0 {Exception -> 0x0061, blocks: (B:9:0x0025, B:11:0x005a, B:14:0x0064, B:16:0x0068, B:17:0x006e, B:20:0x0079, B:23:0x009b, B:28:0x00ce, B:31:0x00d8, B:37:0x00e6, B:38:0x00ef, B:39:0x00f8, B:40:0x0100), top: B:43:0x0025 }] */
    @Override // tb.ob5, tb.mvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r13, java.lang.Object[] r14, com.taobao.android.dinamicx.DXRuntimeContext r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.h86.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }
}
