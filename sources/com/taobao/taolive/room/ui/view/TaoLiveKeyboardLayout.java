package com.taobao.taolive.room.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.d9m;
import tb.hw0;
import tb.kyd;
import tb.pvs;
import tb.s4g;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoLiveKeyboardLayout extends RelativeLayout implements kyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean mHasKeybord;
    private Object mInputFrame;
    private Rect mRect;
    private RecyclerView rvParent;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            } else if (TaoLiveKeyboardLayout.access$000(TaoLiveKeyboardLayout.this) == null || (TaoLiveKeyboardLayout.access$000(TaoLiveKeyboardLayout.this).getScrollState() == 0 && TaoLiveKeyboardLayout.access$000(TaoLiveKeyboardLayout.this).getChildCount() == 1)) {
                TaoLiveKeyboardLayout.access$100(TaoLiveKeyboardLayout.this);
            }
        }
    }

    static {
        t2o.a(779093291);
        t2o.a(806356132);
    }

    public TaoLiveKeyboardLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ RecyclerView access$000(TaoLiveKeyboardLayout taoLiveKeyboardLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("749c8561", new Object[]{taoLiveKeyboardLayout});
        }
        return taoLiveKeyboardLayout.rvParent;
    }

    public static /* synthetic */ void access$100(TaoLiveKeyboardLayout taoLiveKeyboardLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bb5b59", new Object[]{taoLiveKeyboardLayout});
        } else {
            taoLiveKeyboardLayout.tryShowInputFrame();
        }
    }

    private RecyclerView findParentTraversalByPredict() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("2f5f9435", new Object[]{this});
        }
        ViewParent parent = getParent();
        while (parent != null && !predict(parent)) {
            parent = parent.getParent();
        }
        if (parent != null) {
            return (RecyclerView) parent;
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKeyboardLayout taoLiveKeyboardLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/ui/view/TaoLiveKeyboardLayout");
        }
    }

    private boolean predict(ViewParent viewParent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6966ff6c", new Object[]{this, viewParent})).booleanValue();
        }
        return viewParent instanceof RecyclerView;
    }

    private void tryShowInputFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc636842", new Object[]{this});
            return;
        }
        getWindowVisibleDisplayFrame(this.mRect);
        int height = getRootView().getHeight();
        Rect rect = this.mRect;
        int i = rect.bottom - rect.top;
        int d = hw0.d(getContext());
        int i2 = height - i;
        if (i2 > height / 5) {
            if (s4g.f27790a) {
                this.mHasKeybord = true;
                if (this.mInputFrame != null) {
                    d9m.o().iInputFrameShowContentView(this.mInputFrame, (i2 - this.mRect.top) - d);
                }
            }
        } else if (this.mHasKeybord) {
            this.mHasKeybord = false;
            if (this.mInputFrame != null) {
                d9m.o().iInputFrameHideContentView(this.mInputFrame);
                d9m.o().iInputFrameHideKeyBoard(this.mInputFrame);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.rvParent == null) {
            this.rvParent = findParentTraversalByPredict();
        }
    }

    public void onCreateView(Object obj, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2e1341", new Object[]{this, obj, viewStub});
            return;
        }
        this.mInputFrame = obj;
        d9m.o().absInputFrameOnCreateView(this.mInputFrame, viewStub);
    }

    @Override // tb.kyd
    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        d9m.o().absInputFrameOnDestroy(this.mInputFrame);
        this.mInputFrame = null;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (!pvs.q0()) {
            tryShowInputFrame();
        }
        super.onMeasure(i, i2);
    }

    @Override // tb.kyd
    public void setAbsInputFrame2(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54663962", new Object[]{this, obj});
        } else {
            this.mInputFrame = obj;
        }
    }

    public TaoLiveKeyboardLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TaoLiveKeyboardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRect = new Rect();
        if (pvs.q0()) {
            getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new a());
        }
    }
}
