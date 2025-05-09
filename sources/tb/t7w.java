package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t7w {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VideoFrameFormatOESTexture = 4;
    public static final int VideoFrameFormatRGB = 1;
    public static final int VideoFrameFormatYUV = 2;
    public static final int VideoFrameFormatYUVTexture = 3;

    /* renamed from: a  reason: collision with root package name */
    public final float[] f28554a;

    static {
        t2o.a(774897831);
    }

    public t7w(int i, int i2, int i3) {
        if (i == 4) {
            this.f28554a = new float[16];
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ec5c", new Object[]{this, new Integer(i)});
        }
    }

    public void b(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7687dd", new Object[]{this, fArr});
        } else {
            System.arraycopy(fArr, 0, this.f28554a, 0, 16);
        }
    }

    public void c(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f3f6a79", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }
}
