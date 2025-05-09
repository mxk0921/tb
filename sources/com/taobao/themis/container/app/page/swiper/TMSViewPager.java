package com.taobao.themis.container.app.page.swiper;

import android.content.Context;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/container/app/page/swiper/TMSViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "acceptTouchEvent", "Ltb/xhv;", "setAcceptTouchEvent", "(Z)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Z", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean acceptTouchEvent = true;

    static {
        t2o.a(835715137);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSViewPager(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(TMSViewPager tMSViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/container/app/page/swiper/TMSViewPager");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.acceptTouchEvent) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.acceptTouchEvent) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void setAcceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74ac08", new Object[]{this, new Boolean(z)});
        } else {
            this.acceptTouchEvent = z;
        }
    }
}
