package com.flybird;

import android.content.Context;
import android.graphics.Canvas;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import tb.pgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBBodyFrameLayout extends FBFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Callable<Void> b = null;

    public FBBodyFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(FBBodyFrameLayout fBBodyFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/FBBodyFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        Callable<Void> callable = this.b;
        if (callable != null) {
            this.b = null;
            try {
                callable.call();
            } catch (Throwable th) {
                pgh.f("FBBodyFrameLayout", "dispatchDraw error on task", th);
            }
        }
    }

    public void setOnNextDispatchDraw(Callable<Void> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8511fdf8", new Object[]{this, callable});
        } else {
            this.b = callable;
        }
    }
}
