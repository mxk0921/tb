package com.alibaba.security.plugin.beauty;

import android.content.Context;
import android.opengl.GLES20;
import com.alibaba.security.realidentity.a;
import com.alibaba.security.realidentity.h2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.librace.MediaChainEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BeautyRenderManager implements h2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BeautyRenderManager";
    public MediaChainEngine mMediaChainEngine;
    public int mOrientation;
    public int mPreHeight;
    public int mPreWidth;

    @Override // com.alibaba.security.realidentity.h2
    public void draw(byte[] bArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5864751d", new Object[]{this, bArr, fArr});
            return;
        }
        MediaChainEngine mediaChainEngine = this.mMediaChainEngine;
        if (!(mediaChainEngine == null || bArr == null)) {
            try {
                mediaChainEngine.Q(bArr, 1, this.mPreWidth, this.mPreHeight, 0, this.mOrientation, 0, 2);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                this.mMediaChainEngine.w(fArr);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.alibaba.security.realidentity.h2
    public void onChanged(int i, int i2) {
        MediaChainEngine mediaChainEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903f4f3c", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i > 0 && (mediaChainEngine = this.mMediaChainEngine) != null) {
            int i3 = (this.mPreWidth * i) / this.mPreHeight;
            mediaChainEngine.L(0, (i2 - i3) / 2, i, i3);
        }
    }

    @Override // com.alibaba.security.realidentity.h2
    public void onCreated(Context context, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ca7278", new Object[]{this, context, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            this.mPreWidth = i;
            this.mPreHeight = i2;
            this.mOrientation = i3;
            MediaChainEngine mediaChainEngine = new MediaChainEngine(context, true);
            this.mMediaChainEngine = mediaChainEngine;
            mediaChainEngine.F(i4, i2, i, true);
            this.mMediaChainEngine.L(0, 0, i2, i);
            this.mMediaChainEngine.e(0, true);
            this.mMediaChainEngine.e(1, true);
            this.mMediaChainEngine.e(4, true);
            this.mMediaChainEngine.f(3, true, false);
            this.mMediaChainEngine.f(2, true, false);
            this.mMediaChainEngine.y(1, 0.8f);
            this.mMediaChainEngine.y(3, 0.5f);
            this.mMediaChainEngine.y(2, 1.0f);
            this.mMediaChainEngine.y(6, 1.0f);
            this.mMediaChainEngine.P(0, 0.2f);
            this.mMediaChainEngine.P(1, 0.8f);
            this.mMediaChainEngine.P(2, 0.4f);
            this.mMediaChainEngine.P(3, 0.0f);
            this.mMediaChainEngine.P(4, 0.4f);
            this.mMediaChainEngine.P(5, 0.0f);
            this.mMediaChainEngine.P(6, 0.0f);
            this.mMediaChainEngine.P(7, 0.0f);
            this.mMediaChainEngine.P(8, 0.6f);
            this.mMediaChainEngine.P(9, 0.0f);
            this.mMediaChainEngine.P(10, 0.0f);
            this.mMediaChainEngine.P(11, 0.0f);
            this.mMediaChainEngine.P(12, 0.0f);
            this.mMediaChainEngine.P(13, 0.0f);
            this.mMediaChainEngine.P(14, 0.2f);
            this.mMediaChainEngine.P(15, 0.0f);
            this.mMediaChainEngine.P(16, 0.0f);
            this.mMediaChainEngine.P(17, 0.0f);
            this.mMediaChainEngine.P(18, 0.0f);
            this.mMediaChainEngine.P(19, 0.0f);
            this.mMediaChainEngine.P(20, 0.0f);
            this.mMediaChainEngine.P(21, 0.0f);
        } catch (Throwable th) {
            a.a(TAG, "face engine init fail", th);
        }
    }

    @Override // com.alibaba.security.realidentity.h2
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        try {
            MediaChainEngine mediaChainEngine = this.mMediaChainEngine;
            if (mediaChainEngine != null) {
                mediaChainEngine.q();
                this.mMediaChainEngine = null;
            }
        } catch (Throwable unused) {
        }
    }
}
