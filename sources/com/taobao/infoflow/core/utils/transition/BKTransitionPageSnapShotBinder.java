package com.taobao.infoflow.core.utils.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;
import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BKTransitionPageSnapShotBinder extends BitmapBinder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BKTransitionPageSnapShotBinder";
    private volatile Bitmap mPageSnapShotBitmap;

    static {
        t2o.a(486539751);
    }

    public BKTransitionPageSnapShotBinder(Drawable drawable) {
        super(drawable);
    }

    public static /* synthetic */ Object ipc$super(BKTransitionPageSnapShotBinder bKTransitionPageSnapShotBinder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/utils/transition/BKTransitionPageSnapShotBinder");
    }

    @Override // com.taobao.android.nav.binder.BitmapBinder
    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        if (this.mPageSnapShotBitmap == null) {
            fve.e(TAG, "无极缩放 TranAnimBack activitySnapShot , getBitmap is null.");
        } else {
            fve.e(TAG, "无极缩放 TranAnimBack activitySnapShot , getBitmap success.");
        }
        return this.mPageSnapShotBitmap;
    }

    public void setPageSnapShotBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ccc563", new Object[]{this, bitmap});
        } else {
            this.mPageSnapShotBitmap = bitmap;
        }
    }
}
