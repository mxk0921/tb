package com.alibaba.android.aura.service.render.widget.roundcornerlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.j4e;
import tb.t2o;
import tb.um;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURARoundCornerLayout extends FrameLayout implements j4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final um mRoundCornerLayoutHelper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Canvas f2143a;

        public a(Canvas canvas) {
            this.f2143a = canvas;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AURARoundCornerLayout.access$001(AURARoundCornerLayout.this, this.f2143a);
            }
        }
    }

    static {
        t2o.a(80740621);
        t2o.a(80740629);
    }

    public AURARoundCornerLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void access$001(AURARoundCornerLayout aURARoundCornerLayout, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa23d0f", new Object[]{aURARoundCornerLayout, canvas});
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public static /* synthetic */ Object ipc$super(AURARoundCornerLayout aURARoundCornerLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/widget/roundcornerlayout/AURARoundCornerLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else {
            this.mRoundCornerLayoutHelper.a(canvas, new a(canvas));
        }
    }

    @Override // tb.j4e
    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            setRadius(f, f, f, f);
        }
    }

    public AURARoundCornerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6855c89b", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else {
            this.mRoundCornerLayoutHelper.h(f, f2, f3, f4);
        }
    }

    public AURARoundCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRoundCornerLayoutHelper = new um(this);
    }

    public void setRadius(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eb9878", new Object[]{this, new Integer(i), new Float(f)});
        } else if (i == 0) {
            setRadius(f, f, 0.0f, 0.0f);
        } else if (i == 1) {
            setRadius(0.0f, 0.0f, f, f);
        }
    }
}
