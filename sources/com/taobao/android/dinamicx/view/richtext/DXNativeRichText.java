package com.taobao.android.dinamicx.view.richtext;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.meo;
import tb.sv3;
import tb.t2o;
import tb.tv3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeRichText extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b mCheckForLongPressList;
    private boolean mHasPerformedLongPress = false;
    private meo mRichTextRender;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f7359a;
        private boolean b;
        private sv3[] c;

        static {
            t2o.a(444597200);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4c0343", new Object[]{this});
            } else {
                this.b = DXNativeRichText.this.isPressed();
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb696b4", new Object[]{this});
            } else {
                this.f7359a = DXNativeRichText.access$300(DXNativeRichText.this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            sv3[] sv3VarArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b == DXNativeRichText.this.isPressed() && DXNativeRichText.this.getParent() != null && this.f7359a == DXNativeRichText.access$100(DXNativeRichText.this)) {
                boolean z = false;
                for (sv3 sv3Var : this.c) {
                    if (z || sv3Var.b(DXNativeRichText.this)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                DXNativeRichText.access$202(DXNativeRichText.this, z);
            }
        }

        private b(sv3[] sv3VarArr) {
            this.c = sv3VarArr;
        }
    }

    static {
        t2o.a(444597198);
    }

    public DXNativeRichText(Context context) {
        super(context);
    }

    public static /* synthetic */ int access$100(DXNativeRichText dXNativeRichText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cf443f7", new Object[]{dXNativeRichText})).intValue();
        }
        return dXNativeRichText.getWindowAttachCount();
    }

    public static /* synthetic */ boolean access$202(DXNativeRichText dXNativeRichText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8261fbf1", new Object[]{dXNativeRichText, new Boolean(z)})).booleanValue();
        }
        dXNativeRichText.mHasPerformedLongPress = z;
        return z;
    }

    public static /* synthetic */ int access$300(DXNativeRichText dXNativeRichText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44773b79", new Object[]{dXNativeRichText})).intValue();
        }
        return dXNativeRichText.getWindowAttachCount();
    }

    private void checkForLongClicks(long j, sv3[] sv3VarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee642fac", new Object[]{this, new Long(j), sv3VarArr});
            return;
        }
        this.mHasPerformedLongPress = false;
        b bVar = new b(sv3VarArr);
        this.mCheckForLongPressList = bVar;
        bVar.a();
        this.mCheckForLongPressList.b();
        postDelayed(this.mCheckForLongPressList, j);
    }

    public static /* synthetic */ Object ipc$super(DXNativeRichText dXNativeRichText, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/richtext/DXNativeRichText");
    }

    private void removeLongPressCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28b2c12", new Object[]{this});
            return;
        }
        b bVar = this.mCheckForLongPressList;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
    }

    public meo getRichTextRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (meo) ipChange.ipc$dispatch("94ef363b", new Object[]{this});
        }
        return this.mRichTextRender;
    }

    public boolean handleSpanTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba22d4ed", new Object[]{this, motionEvent})).booleanValue();
        }
        meo meoVar = this.mRichTextRender;
        if (meoVar == null) {
            return false;
        }
        int r = meoVar.r(motionEvent.getX(), motionEvent.getY());
        tv3[] tv3VarArr = (tv3[]) this.mRichTextRender.q(r, r, tv3.class);
        if (tv3VarArr != null) {
            z = false;
            for (tv3 tv3Var : tv3VarArr) {
                if (z || tv3Var.a() != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    setPressed(false);
                }
            } else if (this.mHasPerformedLongPress) {
                return true;
            } else {
                removeLongPressCallbacks();
                if (z) {
                    for (tv3 tv3Var2 : tv3VarArr) {
                        if (tv3Var2.a() != null) {
                            tv3Var2.onClick(this);
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        sv3[] sv3VarArr = (sv3[]) this.mRichTextRender.q(r, r, sv3.class);
        if (sv3VarArr == null || sv3VarArr.length == 0) {
            z2 = false;
        } else {
            z2 = false;
            for (sv3 sv3Var : sv3VarArr) {
                if (z2 || sv3Var.a() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                setPressed(true);
                checkForLongClicks(ViewConfiguration.getLongPressTimeout(), sv3VarArr);
            }
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        meo meoVar = this.mRichTextRender;
        if (meoVar != null) {
            meoVar.e(canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (handleSpanTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRichTextRender(meo meoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d50d69", new Object[]{this, meoVar});
        } else {
            this.mRichTextRender = meoVar;
        }
    }

    public DXNativeRichText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXNativeRichText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DXNativeRichText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
