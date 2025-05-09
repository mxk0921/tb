package tb;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vkh {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f30070a = JsonReader.a.a("w", "h", pod.IP, k68.KEY_OP, "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final JsonReader.a b = JsonReader.a.a("id", "layers", "w", "h", "p", "u");
    public static final JsonReader.a c = JsonReader.a.a("list");
    public static final JsonReader.a d = JsonReader.a.a("cm", "tm", "dr");

    public static kkh a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList;
        HashMap hashMap;
        JsonReader jsonReader2 = jsonReader;
        float e = fxv.e();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<mu9> sparseArrayCompat = new SparseArrayCompat<>();
        kkh kkhVar = new kkh();
        jsonReader.g();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (jsonReader.F()) {
            switch (jsonReader2.C0(f30070a)) {
                case 0:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    i = jsonReader.c0();
                    continue;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    jsonReader2 = jsonReader;
                case 1:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    i2 = jsonReader.c0();
                    continue;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    jsonReader2 = jsonReader;
                case 2:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f = (float) jsonReader.Z();
                    continue;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    jsonReader2 = jsonReader;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) jsonReader.Z()) - 0.01f;
                    continue;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    jsonReader2 = jsonReader;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) jsonReader.Z();
                    continue;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    jsonReader2 = jsonReader;
                case 5:
                    String[] split = jsonReader.i0().split("\\.");
                    if (!fxv.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        kkhVar.a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    e(jsonReader2, kkhVar, arrayList2, longSparseArray);
                    break;
                case 7:
                    b(jsonReader2, kkhVar, hashMap2, hashMap3);
                    break;
                case 8:
                    d(jsonReader2, hashMap4);
                    break;
                case 9:
                    c(jsonReader2, kkhVar, sparseArrayCompat);
                    break;
                case 10:
                    f(jsonReader2, arrayList3);
                    break;
                default:
                    jsonReader.D0();
                    jsonReader.E0();
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        kkhVar.s(new Rect(0, 0, (int) (i * e), (int) (i2 * e)), f, f2, f3, arrayList2, longSparseArray, hashMap2, hashMap3, sparseArrayCompat, hashMap4, arrayList3);
        return kkhVar;
    }

    public static void b(JsonReader jsonReader, kkh kkhVar, Map<String, List<Layer>> map, Map<String, olh> map2) throws IOException {
        jsonReader.e();
        while (jsonReader.F()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.g();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.F()) {
                int C0 = jsonReader.C0(b);
                if (C0 == 0) {
                    str = jsonReader.i0();
                } else if (C0 == 1) {
                    jsonReader.e();
                    while (jsonReader.F()) {
                        Layer a2 = mig.a(jsonReader, kkhVar);
                        longSparseArray.put(a2.d(), a2);
                        arrayList.add(a2);
                    }
                    jsonReader.w();
                } else if (C0 == 2) {
                    i = jsonReader.c0();
                } else if (C0 == 3) {
                    i2 = jsonReader.c0();
                } else if (C0 == 4) {
                    str2 = jsonReader.i0();
                } else if (C0 != 5) {
                    jsonReader.D0();
                    jsonReader.E0();
                } else {
                    str3 = jsonReader.i0();
                }
            }
            jsonReader.A();
            if (str2 != null) {
                olh olhVar = new olh(i, i2, str, str2, str3);
                map2.put(olhVar.d(), olhVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.w();
    }

    public static void c(JsonReader jsonReader, kkh kkhVar, SparseArrayCompat<mu9> sparseArrayCompat) throws IOException {
        jsonReader.e();
        while (jsonReader.F()) {
            mu9 a2 = nu9.a(jsonReader, kkhVar);
            sparseArrayCompat.put(a2.hashCode(), a2);
        }
        jsonReader.w();
    }

    public static void d(JsonReader jsonReader, Map<String, gu9> map) throws IOException {
        jsonReader.g();
        while (jsonReader.F()) {
            if (jsonReader.C0(c) != 0) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                jsonReader.e();
                while (jsonReader.F()) {
                    gu9 a2 = su9.a(jsonReader);
                    map.put(a2.b(), a2);
                }
                jsonReader.w();
            }
        }
        jsonReader.A();
    }

    public static void e(JsonReader jsonReader, kkh kkhVar, List<Layer> list, LongSparseArray<Layer> longSparseArray) throws IOException {
        jsonReader.e();
        int i = 0;
        while (jsonReader.F()) {
            Layer a2 = mig.a(jsonReader, kkhVar);
            if (a2.f() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(a2);
            longSparseArray.put(a2.d(), a2);
            if (i > 4) {
                zhh.d("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.w();
    }

    public static void f(JsonReader jsonReader, List<h4i> list) throws IOException {
        jsonReader.e();
        while (jsonReader.F()) {
            jsonReader.g();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (jsonReader.F()) {
                int C0 = jsonReader.C0(d);
                if (C0 == 0) {
                    str = jsonReader.i0();
                } else if (C0 == 1) {
                    f = (float) jsonReader.Z();
                } else if (C0 != 2) {
                    jsonReader.D0();
                    jsonReader.E0();
                } else {
                    f2 = (float) jsonReader.Z();
                }
            }
            jsonReader.A();
            list.add(new h4i(str, f, f2));
        }
        jsonReader.w();
    }
}
