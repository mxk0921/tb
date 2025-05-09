package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ip0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f21488a;
    public float d;
    public float b = 0.0f;
    public float c = Float.MAX_VALUE;
    public int e = -1;
    public final float[] f = {1.9f, 1.8f, 1.7f, 1.5f, 1.4f, 1.2f, 1.0f, 0.9f, 0.8f};
    public final float[] g = {2.4f, 2.2f, 2.0f, 1.8f, 1.5f, 1.3f, 1.2f, 1.0f, 0.9f};

    @Deprecated
    public void a() {
        float[] fArr;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ef8c8a", new Object[]{this});
            return;
        }
        b();
        if (this.f21488a >= 8) {
            fArr = this.f;
        } else {
            fArr = this.g;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= fArr.length) {
                i2 = 9;
                break;
            } else if (this.b >= fArr[i2]) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = 10 - i2;
        int i4 = this.f21488a;
        if (i4 >= 16) {
            i = 10;
        } else if (i4 >= 8) {
            i = 9;
        } else if (i4 >= 6) {
            i = 8;
        } else if (i4 >= 4) {
            i = 6;
        } else if (i4 >= 2) {
            i = 4;
        }
        this.e = (int) ((i3 * 0.6f) + (i * 0.4f));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ip0.b():void");
    }
}
