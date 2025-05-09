package com.taobao.taolive.uikit.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RecyclerViewScrollHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TopSmoothScroller extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806356544);
        }

        public TopSmoothScroller(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(TopSmoothScroller topSmoothScroller, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/utils/RecyclerViewScrollHelper$TopSmoothScroller");
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
            }
            return 500.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getHorizontalSnapPreference() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("75f19bf9", new Object[]{this})).intValue();
            }
            return -1;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
            }
            return -1;
        }
    }

    static {
        t2o.a(806356543);
    }

    public static void a(RecyclerView recyclerView, int i, LinearSmoothScroller linearSmoothScroller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff1226a", new Object[]{recyclerView, new Integer(i), linearSmoothScroller});
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearSmoothScroller.setTargetPosition(i);
            ((LinearLayoutManager) layoutManager).startSmoothScroll(linearSmoothScroller);
        }
    }
}
