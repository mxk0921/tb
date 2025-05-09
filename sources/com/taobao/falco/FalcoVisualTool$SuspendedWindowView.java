package com.taobao.falco;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.vz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoVisualTool$SuspendedWindowView extends LinearLayout implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int height;
    private final int mBackgroundColor = Color.argb(204, 0, 0, 0);
    private FalcoVisualTool$ColorSectionView mColorSection;
    private final int mColorSectionHeight;
    private final Context mContext;
    private final int mCornerRadius;
    private FalcoVisualTool$DetailSectionView mDetailSection;
    private vz8.f mDoubleClickListener;
    private FalcoVisualTool$DragSectionView mDragSection;
    private final int mDragSectionHeight;
    private long mLastTouchDownTime;
    private float mLastTouchDownX;
    private float mLastTouchDownY;
    public final int width;

    public FalcoVisualTool$SuspendedWindowView(Context context) {
        super(context);
        this.mContext = context;
        this.width = vz8.h(context, 300);
        this.height = vz8.h(context, 350);
        this.mCornerRadius = vz8.h(context, 12);
        this.mColorSectionHeight = vz8.h(context, 50);
        this.mDragSectionHeight = vz8.h(context, 18);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.mBackgroundColor);
        gradientDrawable.setCornerRadius(this.mCornerRadius);
        setBackground(gradientDrawable);
        setClipToPadding(true);
        FalcoVisualTool$ColorSectionView falcoVisualTool$ColorSectionView = new FalcoVisualTool$ColorSectionView(this.mContext, 4);
        this.mColorSection = falcoVisualTool$ColorSectionView;
        addView(falcoVisualTool$ColorSectionView, new LinearLayout.LayoutParams(-1, this.mColorSectionHeight));
        ScrollView scrollView = new ScrollView(this.mContext);
        scrollView.setHorizontalScrollBarEnabled(false);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOnTouchListener(this);
        FalcoVisualTool$DetailSectionView falcoVisualTool$DetailSectionView = new FalcoVisualTool$DetailSectionView(this.mContext);
        this.mDetailSection = falcoVisualTool$DetailSectionView;
        scrollView.addView(falcoVisualTool$DetailSectionView, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        addView(scrollView, layoutParams);
        FalcoVisualTool$DragSectionView falcoVisualTool$DragSectionView = new FalcoVisualTool$DragSectionView(this.mContext);
        this.mDragSection = falcoVisualTool$DragSectionView;
        addView(falcoVisualTool$DragSectionView, new LinearLayout.LayoutParams(-1, this.mDragSectionHeight));
        setOnTouchListener(this);
    }

    public static /* synthetic */ Object ipc$super(FalcoVisualTool$SuspendedWindowView falcoVisualTool$SuspendedWindowView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoVisualTool$SuspendedWindowView");
    }

    public void addColorBlock(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b817a6", new Object[]{this, new Long(j), str, str2});
        } else {
            this.mColorSection.addItem(j, str, str2);
        }
    }

    public void addDetailItem(int i, String str, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da19ab64", new Object[]{this, new Integer(i), str, map});
        } else {
            this.mDetailSection.addItem(i, str, map);
        }
    }

    public void clearAllColorBlock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e56fa5", new Object[]{this});
        } else {
            this.mColorSection.clearAll();
        }
    }

    public boolean containColorBlockTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d32c52f", new Object[]{this, str})).booleanValue();
        }
        return this.mColorSection.containTitle(str);
    }

    public String getDetailItemContent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8834055a", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.mDetailSection.getItemContent(i, i2);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        vz8.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            long abs = Math.abs(currentTimeMillis - this.mLastTouchDownTime);
            int abs2 = (int) Math.abs(rawX - this.mLastTouchDownX);
            int abs3 = (int) Math.abs(rawY - this.mLastTouchDownY);
            this.mLastTouchDownTime = currentTimeMillis;
            this.mLastTouchDownX = rawX;
            this.mLastTouchDownY = rawY;
            if (abs < 400 && abs2 < 50 && abs3 < 50 && (fVar = this.mDoubleClickListener) != null) {
                ((vz8.c) fVar).a(view);
            }
        }
        return false;
    }

    public void setCustomDoubleClickListener(vz8.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6fca616", new Object[]{this, fVar});
        } else {
            this.mDoubleClickListener = fVar;
        }
    }

    public void setCustomDraggingListener(vz8.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177934ce", new Object[]{this, gVar});
        } else {
            this.mDragSection.setCustomDraggingListener(gVar);
        }
    }

    public void setItemVisibility(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737f516e", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mDetailSection.setItemVisibility(i, i2);
        }
    }

    public void updateDetailItem(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa01ade", new Object[]{this, new Integer(i), new Integer(i2), str});
        } else {
            this.mDetailSection.updateItem(i, i2, str);
        }
    }

    public void setItemVisibility(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6b4f55", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.mDetailSection.setItemVisibility(i, i2, i3);
        }
    }
}
