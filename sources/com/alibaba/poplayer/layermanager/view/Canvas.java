package com.alibaba.poplayer.layermanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.lyv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Canvas extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(625999967);
    }

    public Canvas(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(Canvas canvas, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/poplayer/layermanager/view/Canvas");
    }

    private void prepareToAddView(PopRequest popRequest, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595d9ce8", new Object[]{this, popRequest, view, new Integer(i)});
            return;
        }
        view.setTag(R.id.layermanager_canvas_innerview_id, Integer.valueOf(i));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams != null) {
            if (lyv.j(popRequest.f.get()) && !popRequest.a()) {
                layoutParams.topMargin += lyv.g(PopLayer.getReference().getApp());
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public void addViewByLevel(PopRequest popRequest, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d3dbab", new Object[]{this, popRequest, view, new Integer(i)});
            return;
        }
        view.setImportantForAccessibility(2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int intValue = ((Integer) getChildAt(i2).getTag(R.id.layermanager_canvas_innerview_id)).intValue();
            if (intValue != i) {
                if (intValue > i) {
                    prepareToAddView(popRequest, view, i);
                    addView(view, i2);
                    return;
                }
            } else {
                return;
            }
        }
        prepareToAddView(popRequest, view, i);
        addView(view, getChildCount());
    }

    public ArrayList<View> all() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d886c582", new Object[]{this});
        }
        ArrayList<View> arrayList = new ArrayList<>();
        for (int i = 0; i < getChildCount(); i++) {
            arrayList.add(getChildAt(i));
        }
        return arrayList;
    }

    public boolean contains(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3a8d7f0", new Object[]{this, view})).booleanValue();
        }
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) == view) {
                return true;
            }
        }
        return false;
    }

    public View findViewByLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7a430c2f", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (((Integer) getChildAt(i2).getTag(R.id.layermanager_canvas_innerview_id)).intValue() == i) {
                return getChildAt(i2);
            }
        }
        return null;
    }

    public Canvas(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Canvas(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
