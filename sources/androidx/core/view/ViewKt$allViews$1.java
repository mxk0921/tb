package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import org.ifaa.android.manager.face.IFAAFaceManager;
import tb.ar4;
import tb.dkf;
import tb.sbp;
import tb.u1a;
import tb.vbp;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/vbp;", "Landroid/view/View;", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {IFAAFaceManager.STATUS_FACE_MOUTH_OCCLUSION, IFAAFaceManager.STATUS_FACE_OFFSET_RIGHT}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements u1a<vbp<? super View>, ar4<? super xhv>, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, ar4<? super ViewKt$allViews$1> ar4Var) {
        super(2, ar4Var);
        this.$this_allViews = view;
    }

    public static /* synthetic */ Object ipc$super(ViewKt$allViews$1 viewKt$allViews$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/ViewKt$allViews$1");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
        }
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, ar4Var);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vbp vbpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("241f63cb", new Object[]{this, obj});
        }
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vbp vbpVar2 = (vbp) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = vbpVar2;
            this.label = 1;
            if (vbpVar2.a(view, this) == d) {
                return d;
            }
            vbpVar = vbpVar2;
        } else if (i == 1) {
            vbpVar = (vbp) this.L$0;
            b.b(obj);
        } else if (i == 2) {
            b.b(obj);
            return xhv.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            sbp<View> descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            if (vbpVar.d(descendants, this) == d) {
                return d;
            }
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(vbp<? super View> vbpVar, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d1c4479a", new Object[]{this, vbpVar, ar4Var}) : ((ViewKt$allViews$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
