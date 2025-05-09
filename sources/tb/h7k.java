package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalItemAnimator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h7k extends AnimatorListenerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.ViewHolder f20454a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;
    public final /* synthetic */ NormalItemAnimator d;

    public h7k(NormalItemAnimator normalItemAnimator, RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = normalItemAnimator;
        this.f20454a = viewHolder;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public static /* synthetic */ Object ipc$super(h7k h7kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/Normal/NormalItemAnimator$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.d.dispatchRemoveFinished(this.f20454a);
        this.d.j.remove(this.f20454a);
        this.d.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
        } else {
            this.d.dispatchRemoveStarting(this.f20454a);
        }
    }
}
