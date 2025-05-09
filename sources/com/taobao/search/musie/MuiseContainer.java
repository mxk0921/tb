package com.taobao.search.musie;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.sif;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MuiseContainer extends FrameLayout implements sif {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout dynamicContainer;
    private FrameLayout innerCardContainer;
    private View.OnTouchListener interceptListener;
    private LinearLayout parentContainer;
    private View placeHolderView;

    static {
        t2o.a(815792653);
        t2o.a(993001955);
    }

    public MuiseContainer(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.parentContainer = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        this.placeHolderView = view;
        view.setBackgroundColor(-1);
        this.placeHolderView.setId(R.id.placeholder_img);
        frameLayout.addView(this.placeHolderView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.dynamicContainer = frameLayout2;
        frameLayout2.setId(R.id.dynamic_container);
        frameLayout.addView(this.dynamicContainer, new FrameLayout.LayoutParams(-1, -2));
        this.parentContainer.addView(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.innerCardContainer = frameLayout3;
        this.parentContainer.addView(frameLayout3, new FrameLayout.LayoutParams(-1, -2));
        addView(this.parentContainer);
    }

    public static /* synthetic */ Object ipc$super(MuiseContainer muiseContainer, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MuiseContainer");
    }

    public FrameLayout getInnerCardContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("df3b341", new Object[]{this});
        }
        return this.innerCardContainer;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        View.OnTouchListener onTouchListener = this.interceptListener;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // tb.sif
    public void setOnInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c5b00b", new Object[]{this, onTouchListener});
        } else {
            this.interceptListener = onTouchListener;
        }
    }
}
