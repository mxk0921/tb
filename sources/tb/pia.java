package tb;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pia implements z1w<nia> {

    /* renamed from: a  reason: collision with root package name */
    public int f26112a;

    public pia(int i) {
        this.f26112a = i;
    }

    public final void b(nia niaVar, List<Float> list) {
        int i = this.f26112a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = list.get(i).floatValue();
                } else {
                    dArr2[i2] = list.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < niaVar.c(); i3++) {
                int i4 = niaVar.a()[i3];
                niaVar.a()[i3] = Color.argb(c(niaVar.b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    public final int c(double d, double[] dArr, double[] dArr2) {
        double d2;
        int i = 1;
        while (true) {
            if (i >= dArr.length) {
                d2 = dArr2[dArr2.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr[i2];
            double d4 = dArr[i];
            if (d4 >= d) {
                d2 = uvi.j(dArr2[i2], dArr2[i], uvi.b((d - d3) / (d4 - d3), vu3.b.GEO_NOT_SUPPORT, 1.0d));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }

    /* renamed from: d */
    public nia a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.u0() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.e();
        }
        while (jsonReader.F()) {
            arrayList.add(Float.valueOf((float) jsonReader.Z()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f26112a = 2;
        }
        if (z) {
            jsonReader.w();
        }
        if (this.f26112a == -1) {
            this.f26112a = arrayList.size() / 4;
        }
        int i = this.f26112a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f26112a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        nia niaVar = new nia(fArr, iArr);
        b(niaVar, arrayList);
        return niaVar;
    }
}
