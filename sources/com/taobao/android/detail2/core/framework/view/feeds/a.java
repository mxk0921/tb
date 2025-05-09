package com.taobao.android.detail2.core.framework.view.feeds;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements DetailVerticalRecyclerView.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321945);
        t2o.a(352321958);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2f49e4", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d7a127", new Object[]{this, new Float(f)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a222b", new Object[]{this, new Float(f)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
    public void d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a992a38", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb463c7", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
    public void onTouch(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8aab07c", new Object[]{this, motionEvent});
        }
    }
}
