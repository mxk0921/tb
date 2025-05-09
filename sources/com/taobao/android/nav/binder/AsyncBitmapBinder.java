package com.taobao.android.nav.binder;

import android.graphics.Bitmap;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AsyncBitmapBinder extends BitmapBinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile Bitmap bitmap;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View view = AsyncBitmapBinder.this.sourceView.get();
            if (view != null && AsyncBitmapBinder.access$000(AsyncBitmapBinder.this) == null) {
                synchronized (AsyncBitmapBinder.this) {
                    try {
                        if (AsyncBitmapBinder.access$000(AsyncBitmapBinder.this) == null) {
                            AsyncBitmapBinder asyncBitmapBinder = AsyncBitmapBinder.this;
                            AsyncBitmapBinder.access$002(asyncBitmapBinder, asyncBitmapBinder.screenshotOnView(view));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static {
        t2o.a(578814071);
    }

    public AsyncBitmapBinder(View view) {
        super(view);
        Coordinator.execute(new a(), 28);
    }

    public static /* synthetic */ Bitmap access$000(AsyncBitmapBinder asyncBitmapBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fd1c77d9", new Object[]{asyncBitmapBinder});
        }
        return asyncBitmapBinder.bitmap;
    }

    public static /* synthetic */ Bitmap access$002(AsyncBitmapBinder asyncBitmapBinder, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d66c74f3", new Object[]{asyncBitmapBinder, bitmap});
        }
        asyncBitmapBinder.bitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ Object ipc$super(AsyncBitmapBinder asyncBitmapBinder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nav/binder/AsyncBitmapBinder");
    }

    @Override // com.taobao.android.nav.binder.BitmapBinder
    public Bitmap getBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c5e4890a", new Object[]{this});
        }
        if (this.bitmap == null) {
            synchronized (this) {
                try {
                    if (this.bitmap == null) {
                        this.bitmap = screenshotOnView(this.sourceView.get());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.bitmap;
    }
}
