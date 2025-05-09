package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p9a extends phw<Integer, ConstraintLayout, acx> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f25958a;
    public Integer b;
    public final Runnable c = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            p9a.q2(p9a.this);
            p9a p9aVar = p9a.this;
            p9a.s2(p9aVar, Integer.valueOf(p9a.q2(p9aVar).intValue() - 1));
            p9a.t2(p9a.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/weex/GiraffeTimerWidget$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                p9a.this.postEvent(jml.a("timer"));
            }
        }
    }

    static {
        t2o.a(815793652);
    }

    public p9a(Activity activity, ude udeVar, acx acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(p9a p9aVar, String str, Object... objArr) {
        if (str.hashCode() == -211767613) {
            super.onComponentDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/weex/GiraffeTimerWidget");
    }

    public static /* synthetic */ Integer q2(p9a p9aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("7135b110", new Object[]{p9aVar});
        }
        return p9aVar.b;
    }

    public static /* synthetic */ Integer s2(p9a p9aVar, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("a0a8c093", new Object[]{p9aVar, num});
        }
        p9aVar.b = num;
        return num;
    }

    public static /* synthetic */ void t2(p9a p9aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63f14ea", new Object[]{p9aVar});
        } else {
            p9aVar.x2();
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "GiraffeTimerWidget";
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        ((ConstraintLayout) getView()).removeCallbacks(this.c);
    }

    /* renamed from: u2 */
    public void bindWithData(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e53c2b03", new Object[]{this, num});
        } else {
            this.b = num;
        }
    }

    /* renamed from: v2 */
    public ConstraintLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintLayout) ipChange.ipc$dispatch("47c6b9e8", new Object[]{this});
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_giraffe_timer, (ViewGroup) new FrameLayout(getActivity()), false);
        this.f25958a = (TextView) constraintLayout.findViewById(R.id.tv_time);
        return constraintLayout;
    }

    public void w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa8c74d9", new Object[]{this});
            return;
        }
        ObjectAnimator.ofFloat(getView(), "alpha", 0.0f, 1.0f).setDuration(500L).start();
        x2();
    }

    public final void x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("301d3fd1", new Object[]{this});
        } else if (this.b.intValue() <= 0) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(getView(), "alpha", 1.0f, 0.0f).setDuration(200L);
            duration.addListener(new b());
            duration.start();
        } else {
            this.f25958a.setText(String.valueOf(this.b));
            ((ConstraintLayout) getView()).postDelayed(this.c, 1000L);
        }
    }
}
