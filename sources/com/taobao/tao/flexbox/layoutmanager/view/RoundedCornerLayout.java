package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import java.util.ArrayList;
import java.util.List;
import tb.mx7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RoundedCornerLayout extends FrameLayout implements mx7.b.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Path path;
    private List<FlatViewGroup.e> sizeChangedCallbacks;
    private List<FlatViewGroup.f> visibilityChangedCallbacks;

    static {
        t2o.a(503317476);
        t2o.a(503317223);
    }

    public RoundedCornerLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(RoundedCornerLayout roundedCornerLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/RoundedCornerLayout");
        }
    }

    public void addSizeChangedCallback(FlatViewGroup.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c7ca8f", new Object[]{this, eVar});
            return;
        }
        if (this.sizeChangedCallbacks == null) {
            this.sizeChangedCallbacks = new ArrayList();
        }
        if (!this.sizeChangedCallbacks.contains(eVar)) {
            this.sizeChangedCallbacks.add(eVar);
        }
    }

    public void addVisibilityChangedCallback(FlatViewGroup.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f316d9b1", new Object[]{this, fVar});
            return;
        }
        if (this.visibilityChangedCallbacks == null) {
            this.visibilityChangedCallbacks = new ArrayList();
        }
        if (!this.visibilityChangedCallbacks.contains(fVar)) {
            this.visibilityChangedCallbacks.add(fVar);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        removeAllViews();
        Path path = this.path;
        if (path != null) {
            path.reset();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        Path path = this.path;
        if (path != null && !path.isEmpty()) {
            canvas.clipPath(this.path);
        }
        super.dispatchDraw(canvas);
    }

    @Override // tb.mx7.b.a
    public void onBoundChanged(mx7.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c45ad660", new Object[]{this, bVar});
        } else if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && bVar == getBackground()) {
            this.path = bVar.d(this.path, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        Drawable background = getBackground();
        if (background != null && (background instanceof mx7.b) && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            this.path = ((mx7.b) background).d(this.path, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        List<FlatViewGroup.e> list = this.sizeChangedCallbacks;
        if (list != null) {
            for (FlatViewGroup.e eVar : list) {
                eVar.onSizeChanged(i, i2, i3, i4);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        List<FlatViewGroup.f> list = this.visibilityChangedCallbacks;
        if (list != null) {
            for (FlatViewGroup.f fVar : list) {
                fVar.onVisibilityChanged(view, i);
            }
        }
    }

    public void removeSizeChangedCallback(FlatViewGroup.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8409bcf2", new Object[]{this, eVar});
            return;
        }
        List<FlatViewGroup.e> list = this.sizeChangedCallbacks;
        if (list != null) {
            list.remove(eVar);
        }
    }

    public void removeVisibilityChangedCallback(FlatViewGroup.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a94f94", new Object[]{this, fVar});
            return;
        }
        List<FlatViewGroup.f> list = this.visibilityChangedCallbacks;
        if (list != null) {
            list.remove(fVar);
        }
    }
}
