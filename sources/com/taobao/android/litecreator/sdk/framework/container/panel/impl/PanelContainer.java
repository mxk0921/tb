package com.taobao.android.litecreator.sdk.framework.container.panel.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/taobao/android/litecreator/sdk/framework/container/panel/impl/PanelContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Landroid/view/View;", "exceptViewList", "Ltb/xhv;", "setExceptViewList", "(Ljava/util/List;)V", "onShow", "()V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "Landroid/graphics/Rect;", "mRectList", "Ljava/util/List;", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class PanelContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<? extends View> exceptViewList;
    private final List<Rect> mRectList = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
            }
            PanelContainer.this.getViewTreeObserver().removeOnPreDrawListener(this);
            List<View> access$getExceptViewList$p = PanelContainer.access$getExceptViewList$p(PanelContainer.this);
            if (access$getExceptViewList$p != null) {
                for (View view : access$getExceptViewList$p) {
                    if (view != null) {
                        int[] iArr = new int[2];
                        view.getLocationInWindow(iArr);
                        List access$getMRectList$p = PanelContainer.access$getMRectList$p(PanelContainer.this);
                        int i = iArr[0];
                        access$getMRectList$p.add(new Rect(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight()));
                    }
                }
            }
            return true;
        }
    }

    static {
        t2o.a(511705514);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelContainer(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ List access$getExceptViewList$p(PanelContainer panelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c7ffc6bc", new Object[]{panelContainer});
        }
        return panelContainer.exceptViewList;
    }

    public static final /* synthetic */ List access$getMRectList$p(PanelContainer panelContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fe619ef5", new Object[]{panelContainer});
        }
        return panelContainer.mRectList;
    }

    public static final /* synthetic */ void access$setExceptViewList$p(PanelContainer panelContainer, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13d3328", new Object[]{panelContainer, list});
        } else {
            panelContainer.exceptViewList = list;
        }
    }

    public static /* synthetic */ Object ipc$super(PanelContainer panelContainer, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/container/panel/impl/PanelContainer");
    }

    public final void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        this.mRectList.clear();
        getViewTreeObserver().addOnPreDrawListener(new a());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent == null) {
            return false;
        }
        for (Rect rect : this.mRectList) {
            if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setExceptViewList(List<? extends View> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a964e296", new Object[]{this, list});
            return;
        }
        ckf.g(list, "exceptViewList");
        this.exceptViewList = list;
    }
}
