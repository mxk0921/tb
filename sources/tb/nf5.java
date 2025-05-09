package tb;

import android.animation.Animator;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nf5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CARTELEVATORAPPEAR = -5036983208148355497L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f24699a;
        public final /* synthetic */ long b;
        public final /* synthetic */ kmb c;

        /* compiled from: Taobao */
        /* renamed from: tb.nf5$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C1007a implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1007a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                a.this.f24699a.setVisibility(8);
                kmb kmbVar = a.this.c;
                if (kmbVar != null) {
                    cb4.a0(kmbVar.d(), "elevator", false);
                    a.this.c.e().E(4);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }
        }

        public a(View view, long j, kmb kmbVar) {
            this.f24699a = view;
            this.b = j;
            this.c = kmbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f24699a.getVisibility() == 0) {
                this.f24699a.animate().alpha(0.0f).setDuration(this.b).setListener(new C1007a()).start();
            }
        }
    }

    static {
        t2o.a(478150703);
    }

    public static /* synthetic */ Object ipc$super(nf5 nf5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/DXCartElevatorAppearEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        View D = dXRuntimeContext.D();
        if (D != null) {
            if (objArr != null && objArr.length > 0) {
                try {
                    j = Long.parseLong(String.valueOf(objArr[0]));
                } catch (Exception e) {
                    UnifyLog.e("DXCartElevatorAppearEventHandler", "parse json error:" + e.getMessage());
                }
                long j2 = j * 1000;
                D.postDelayed(new a(D, j2, yn2.b(dXRuntimeContext)), j2);
            }
            j = 10;
            long j22 = j * 1000;
            D.postDelayed(new a(D, j22, yn2.b(dXRuntimeContext)), j22);
        }
    }
}
