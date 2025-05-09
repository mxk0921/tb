package com.alipay.mobile.verifyidentity.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APRecyclingBitmapDrawable extends BitmapDrawable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CountingBitmapDrawable";

    /* renamed from: a  reason: collision with root package name */
    public int f4459a = 0;
    public int b = 0;
    public boolean c;

    public APRecyclingBitmapDrawable(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    public static /* synthetic */ Object ipc$super(APRecyclingBitmapDrawable aPRecyclingBitmapDrawable, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/ui/APRecyclingBitmapDrawable");
    }

    public final synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f4459a <= 0 && this.b <= 0 && this.c && b()) {
            toString();
            getBitmap().recycle();
        }
    }

    public final synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Bitmap bitmap = getBitmap();
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        return true;
    }

    public void setIsCached(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3676a27f", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this) {
            try {
                if (z) {
                    this.f4459a++;
                } else {
                    this.f4459a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a();
    }

    public void setIsDisplayed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2a2b38", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this) {
            try {
                if (z) {
                    this.b++;
                    this.c = true;
                } else {
                    this.b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a();
    }
}
