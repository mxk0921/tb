package com.taobao.pexode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ate;
import tb.bui;
import tb.ow6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PexodeOptions {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Bitmap.Config CONFIG = Bitmap.Config.ARGB_8888;
    public static boolean sEnabledCancellability = true;
    public boolean allowDegrade2NoAshmem;
    public boolean allowDegrade2NoInBitmap;
    public boolean allowDegrade2System;
    public volatile boolean cancelled;
    private volatile long cancelledPtr;
    public boolean enableAshmem;
    public boolean forceSkipCache;
    public boolean forceStaticIfAnimation;
    public boolean fromLocal;
    public Bitmap inBitmap;
    public boolean incrementalDecode;
    public boolean justDecodeBounds;
    public int lastSampleSize;
    public ate mIncrementalStaging;
    public boolean outAlpha;
    public bui outMimeType;
    public Rect outPadding;
    public TypedValue resourceValue;
    public int sampleSize;
    public byte[] tempHeaderBuffer;
    private BitmapFactory.Options uponSysOptions;
    public int outWidth = -1;
    public int outHeight = -1;
    public boolean outIcc = false;

    static {
        t2o.a(618659850);
    }

    private native void nativeRequestCancel(long j);

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            if (this.tempHeaderBuffer != null) {
                ow6.f().k(this.tempHeaderBuffer);
            }
            super.finalize();
        } catch (Throwable unused) {
        }
    }

    public synchronized boolean requestCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbda0df4", new Object[]{this})).booleanValue();
        }
        if (sEnabledCancellability) {
            this.cancelled = true;
            BitmapFactory.Options options = this.uponSysOptions;
            if (options != null) {
                options.requestCancelDecode();
                return true;
            } else if (this.cancelledPtr != 0) {
                nativeRequestCancel(this.cancelledPtr);
                this.cancelledPtr = 0L;
                return true;
            } else {
                ate ateVar = this.mIncrementalStaging;
                if (ateVar != null) {
                    ateVar.c();
                }
            }
        }
        return false;
    }

    public synchronized void setUponSysOptions(BitmapFactory.Options options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a5c2d2", new Object[]{this, options});
        } else {
            this.uponSysOptions = options;
        }
    }

    public boolean isSizeAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2948849", new Object[]{this})).booleanValue();
        }
        return this.outWidth > 0 && this.outHeight > 0;
    }
}
