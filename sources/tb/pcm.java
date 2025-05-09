package tb;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pcm extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f26013a;

    static {
        t2o.a(916455592);
    }

    public static /* synthetic */ Object ipc$super(pcm pcmVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1683598447) {
            super.setContentView((View) objArr[0]);
            return null;
        } else if (hashCode == 1770587104) {
            super.setContentView(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/turbo/service/pop/PopDialog");
        }
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
        this.f26013a = view;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
            return;
        }
        super.setContentView(i);
        this.f26013a = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null);
    }
}
