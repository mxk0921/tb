package androidx.activity;

import android.window.BackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¨\u0006\f"}, d2 = {"Landroidx/activity/Api34Impl;", "", "()V", "createOnBackEvent", "Landroid/window/BackEvent;", "touchX", "", "touchY", "progress", "swipeEdge", "", "backEvent", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class Api34Impl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Api34Impl INSTANCE = new Api34Impl();

    private Api34Impl() {
    }

    public final BackEvent createOnBackEvent(float f, float f2, float f3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BackEvent) ipChange.ipc$dispatch("f560272f", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Integer(i)});
        }
        return new BackEvent(f, f2, f3, i);
    }

    public final float progress(BackEvent backEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7339887f", new Object[]{this, backEvent})).floatValue();
        }
        ckf.g(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int swipeEdge(BackEvent backEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a2704ec", new Object[]{this, backEvent})).intValue();
        }
        ckf.g(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float touchX(BackEvent backEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("476ae24b", new Object[]{this, backEvent})).floatValue();
        }
        ckf.g(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float touchY(BackEvent backEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c53aa8c", new Object[]{this, backEvent})).floatValue();
        }
        ckf.g(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
