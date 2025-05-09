package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class tar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f28603a = false;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        t2o.a(502267976);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba252b", new Object[]{this});
        } else if (!this.f28603a) {
            this.f28603a = true;
            this.b = Color.parseColor("#EEEEEE");
            this.c = Color.parseColor("#DDDDDD");
            this.d = Color.parseColor("#777777");
            this.e = Color.parseColor("#383838");
            this.f = Color.parseColor("#888888");
            this.g = Color.parseColor("#808080");
            this.h = Color.parseColor("#AAAAAA");
            this.i = Color.parseColor("#949494");
            this.j = Color.parseColor("#333333");
        }
    }

    public void b(int i, v2m v2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82dfc36c", new Object[]{this, new Integer(i), v2mVar});
            return;
        }
        a();
        if (Color.alpha(i) < 255) {
            v2mVar.b();
            return;
        }
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        double d = fArr[0];
        if (d >= 0.1d || fArr[1] >= 0.1d) {
            float f = fArr[1];
            float f2 = fArr[2];
            int i2 = (d > 0.625d ? 1 : (d == 0.625d ? 0 : -1));
            if (i2 > 0 && f > 0.5d && f2 > 0.85d) {
                fArr[1] = f * 0.8f;
                v2mVar.a(Color.HSVToColor(fArr));
            } else if (d < 0.5555555555555556d && f < 0.25d && f2 > 0.85d) {
                fArr[2] = f2 - 0.1f;
                v2mVar.a(Color.HSVToColor(fArr));
            } else if (d < 0.4583333333333333d && f > 0.7d && f2 > 0.9d) {
                v2mVar.b();
            } else if (i2 <= 0 || f >= 0.5d || f2 <= 0.9d) {
                v2mVar.b();
            } else {
                v2mVar.b();
            }
        } else {
            float f3 = fArr[2];
            if (c(0, 20, f3)) {
                v2mVar.a(this.b);
            } else if (c(21, 36, f3)) {
                v2mVar.a(this.c);
            } else if (c(37, 43, f3)) {
                v2mVar.a(this.h);
            } else if (c(44, 57, f3)) {
                v2mVar.a(this.i);
            } else if (c(58, 63, f3)) {
                v2mVar.a(this.f);
            } else if (c(64, 74, f3)) {
                v2mVar.a(this.g);
            } else if (c(84, 87, f3)) {
                v2mVar.a(this.d);
            } else if (c(88, 93, f3)) {
                v2mVar.a(this.e);
            } else if (c(94, 99, f3)) {
                v2mVar.a(this.j);
            } else {
                v2mVar.f29747a = false;
            }
        }
    }

    public final boolean c(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5841b36", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)})).booleanValue();
        }
        double d = f;
        if (d < i / 100.0d || d > i2 / 100.0d) {
            return false;
        }
        return true;
    }
}
