package com.taobao.weex.ui.flat.widget;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.flat.FlatGUIContext;
import com.taobao.weex.ui.view.border.BorderDrawable;
import com.taobao.weex.utils.WXViewInnerUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class BaseWidget implements Widget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BorderDrawable backgroundBorder;
    private int bottomOffset;
    private final FlatGUIContext context;
    private int leftOffset;
    private int rightOffset;
    private int topOffset;
    private Rect borderBox = new Rect();
    private Point offsetOfContainer = new Point();

    static {
        t2o.a(985661725);
        t2o.a(985661727);
    }

    public BaseWidget(FlatGUIContext flatGUIContext) {
        this.context = flatGUIContext;
    }

    @Override // com.taobao.weex.ui.flat.widget.Widget
    public final void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        canvas.save();
        WXViewInnerUtils.clipCanvasWithinBorderBox(this, canvas);
        Rect rect = this.borderBox;
        canvas.translate(rect.left, rect.top);
        BorderDrawable borderDrawable = this.backgroundBorder;
        if (borderDrawable != null) {
            borderDrawable.draw(canvas);
        }
        canvas.clipRect(this.leftOffset, this.topOffset, this.borderBox.width() - this.rightOffset, this.borderBox.height() - this.bottomOffset);
        canvas.translate(this.leftOffset, this.topOffset);
        onDraw(canvas);
        canvas.restore();
    }

    @Override // com.taobao.weex.ui.flat.widget.Widget
    public final BorderDrawable getBackgroundAndBorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BorderDrawable) ipChange.ipc$dispatch("a64a5314", new Object[]{this});
        }
        return this.backgroundBorder;
    }

    @Override // com.taobao.weex.ui.flat.widget.Widget
    public final Rect getBorderBox() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("8b22b099", new Object[]{this});
        }
        return this.borderBox;
    }

    @Override // com.taobao.weex.ui.flat.widget.Widget
    public final Point getLocInFlatContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("ad5411f9", new Object[]{this});
        }
        return this.offsetOfContainer;
    }

    public void invalidate() {
        View widgetContainerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        Rect rect = new Rect(this.borderBox);
        Point point = this.offsetOfContainer;
        rect.offset(point.x, point.y);
        FlatGUIContext flatGUIContext = this.context;
        if (flatGUIContext != null && (widgetContainerView = flatGUIContext.getWidgetContainerView(this)) != null) {
            widgetContainerView.invalidate(rect);
        }
    }

    @Override // com.taobao.weex.ui.flat.widget.Widget
    public void setBackgroundAndBorder(BorderDrawable borderDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16f49a4", new Object[]{this, borderDrawable});
            return;
        }
        this.backgroundBorder = borderDrawable;
        Rect rect = new Rect(this.borderBox);
        Rect rect2 = this.borderBox;
        rect.offset(-rect2.left, -rect2.top);
        borderDrawable.setBounds(rect);
        setCallback(borderDrawable);
        invalidate();
    }

    public void setCallback(Drawable drawable) {
        View widgetContainerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b0d5bf2", new Object[]{this, drawable});
            return;
        }
        FlatGUIContext flatGUIContext = this.context;
        if (flatGUIContext != null && (widgetContainerView = flatGUIContext.getWidgetContainerView(this)) != null) {
            drawable.setCallback(widgetContainerView);
        }
    }

    @Override // com.taobao.weex.ui.flat.widget.Widget
    public void setContentBox(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a009965b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.leftOffset = i;
        this.topOffset = i2;
        this.rightOffset = i3;
        this.bottomOffset = i4;
        invalidate();
    }

    @Override // com.taobao.weex.ui.flat.widget.Widget
    public void setLayout(int i, int i2, int i3, int i4, int i5, int i6, Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8405a436", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), point});
            return;
        }
        this.offsetOfContainer = point;
        this.borderBox.set(i3, i5, i + i3, i2 + i5);
        BorderDrawable borderDrawable = this.backgroundBorder;
        if (borderDrawable != null) {
            setBackgroundAndBorder(borderDrawable);
        }
        invalidate();
    }
}
