package tb;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cuy extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f17335a;
    public yey<?>.b b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            ckf.g(animation, "animation");
            cuy.a(cuy.this);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            } else {
                ckf.g(animation, "animation");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            } else {
                ckf.g(animation, "animation");
            }
        }
    }

    static {
        t2o.a(689963155);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuy(Context context) {
        super(context);
        ckf.d(context);
    }

    public static final /* synthetic */ void a(cuy cuyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b67b5a", new Object[]{cuyVar});
        } else {
            super.dismiss();
        }
    }

    public static /* synthetic */ Object ipc$super(cuy cuyVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1373052399:
                super.dismiss();
                return null;
            case -340027132:
                super.show();
                return null;
            case 1683598447:
                super.setContentView((View) objArr[0]);
                return null;
            case 1770587104:
                super.setContentView(((Number) objArr[0]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/pop/PopDialog");
        }
    }

    public void b(yey<?>.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8399221c", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "popAnimation");
        this.b = bVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        yey<?>.b bVar = this.b;
        if (bVar != null) {
            View view = this.f17335a;
            ckf.d(view);
            bVar.b(view, new a());
            return;
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "ev");
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        super.setContentView(view);
        this.f17335a = view;
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        yey<?>.b bVar = this.b;
        if (bVar != null) {
            View view = this.f17335a;
            ckf.d(view);
            bVar.c(view, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuy(Context context, int i) {
        super(context, i);
        ckf.d(context);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
            return;
        }
        super.setContentView(i);
        this.f17335a = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null);
    }
}
