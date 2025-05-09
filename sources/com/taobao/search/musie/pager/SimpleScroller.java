package com.taobao.search.musie.pager;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SimpleScroller extends LinearSmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f11589a;

    static {
        t2o.a(815792756);
    }

    public SimpleScroller(Context context, int i) {
        super(context);
        this.f11589a = i;
    }

    public static /* synthetic */ Object ipc$super(SimpleScroller simpleScroller, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1154160711) {
            return new Integer(super.calculateDyToMakeVisible((View) objArr[0], ((Number) objArr[1]).intValue()));
        }
        if (hashCode == 1508002586) {
            return new Integer(super.calculateDxToMakeVisible((View) objArr[0], ((Number) objArr[1]).intValue()));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/pager/SimpleScroller");
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int calculateDxToMakeVisible(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59e24b1a", new Object[]{this, view, new Integer(i)})).intValue();
        }
        return super.calculateDxToMakeVisible(view, i) + this.f11589a;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int calculateDyToMakeVisible(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb34e7b9", new Object[]{this, view, new Integer(i)})).intValue();
        }
        ckf.g(view, "view");
        return super.calculateDyToMakeVisible(view, i) + this.f11589a;
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
