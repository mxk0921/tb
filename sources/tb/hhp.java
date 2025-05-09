package tb;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hhp implements z1w<ghp> {
    public static final hhp INSTANCE = new hhp();

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f20648a = JsonReader.a.a("c", "v", bmv.MSGTYPE_INTERVAL, o.b);

    /* renamed from: b */
    public ghp a(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.u0() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.e();
        }
        jsonReader.g();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f20648a);
            if (C0 == 0) {
                z = jsonReader.L();
            } else if (C0 == 1) {
                list = cxf.f(jsonReader, f);
            } else if (C0 == 2) {
                list2 = cxf.f(jsonReader, f);
            } else if (C0 != 3) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                list3 = cxf.f(jsonReader, f);
            }
        }
        jsonReader.A();
        if (jsonReader.u0() == JsonReader.Token.END_ARRAY) {
            jsonReader.w();
        }
        if (list == null || list2 == null || list3 == null) {
            zhh.b("Shape data was missing information.");
            return new ghp(new PointF(), false, Collections.emptyList());
        } else if (list.isEmpty()) {
            return new ghp(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new xy4(uvi.a(list.get(i2), list3.get(i2)), uvi.a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new xy4(uvi.a(list.get(i3), list3.get(i3)), uvi.a(pointF3, list2.get(0)), pointF3));
            }
            return new ghp(pointF, z, arrayList);
        }
    }
}
