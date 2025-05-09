package com.taobao.infoflow.core.utils.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;
import com.taobao.android.task.Coordinator;
import tb.fve;
import tb.s2e;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TransitionRunningFrameBinder extends BitmapBinder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TransitionRunningFrameBinder";
    private volatile Bitmap mRunningBitmap;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s2e f10693a;

        public a(s2e s2eVar) {
            this.f10693a = s2eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TransitionRunningFrameBinder.access$002(TransitionRunningFrameBinder.this, this.f10693a.g());
            }
        }
    }

    static {
        t2o.a(486539762);
    }

    public TransitionRunningFrameBinder(Drawable drawable) {
        super(drawable);
    }

    public static /* synthetic */ Bitmap access$002(TransitionRunningFrameBinder transitionRunningFrameBinder, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d52fd59d", new Object[]{transitionRunningFrameBinder, bitmap});
        }
        transitionRunningFrameBinder.mRunningBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ Object ipc$super(TransitionRunningFrameBinder transitionRunningFrameBinder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/utils/transition/TransitionRunningFrameBinder");
    }

    @Override // com.taobao.android.nav.binder.BitmapBinder
    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        if (this.mRunningBitmap == null) {
            fve.e(TAG, "TikTest anim_item_running_frame , getBitmap is null.");
        } else {
            fve.e(TAG, "TikTest anim_item_running_frame , getBitmap success.");
        }
        return this.mRunningBitmap;
    }

    public void setReuseSupport(s2e s2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd3159f", new Object[]{this, s2eVar});
        } else if (s2eVar != null) {
            Coordinator.execute(new a(s2eVar), 28);
        }
    }
}
