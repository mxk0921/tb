package com.taobao.android.nav.binder;

import android.graphics.Bitmap;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SyncBitmapBinder extends BitmapBinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814074);
    }

    public SyncBitmapBinder(View view) {
        super(view);
    }

    public static /* synthetic */ Object ipc$super(SyncBitmapBinder syncBitmapBinder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nav/binder/SyncBitmapBinder");
    }

    @Override // com.taobao.android.nav.binder.BitmapBinder
    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        View view = this.sourceView.get();
        if (view == null) {
            return null;
        }
        return screenshotOnView(view);
    }
}
