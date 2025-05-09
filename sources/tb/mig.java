package tb;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.media.MediaConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mig {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f24061a = JsonReader.a.a("nm", "ind", "refId", "ty", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT, "sw", "sh", "sc", "ks", PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", pod.IP, k68.KEY_OP, "tm", "cl", MediaConstant.DEFINITION_HD);
    public static final JsonReader.a b = JsonReader.a.a("d", "a");
    public static final JsonReader.a c = JsonReader.a.a("ty", "nm");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24062a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f24062a = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24062a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Layer a(JsonReader jsonReader, kkh kkhVar) throws IOException {
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.g();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        Layer.MatteType matteType2 = matteType;
        Layer.LayerType layerType = null;
        String str = null;
        vx0 vx0Var = null;
        sx0 sx0Var = null;
        tx0 tx0Var = null;
        jx0 jx0Var = null;
        ag2 ag2Var = null;
        e08 e08Var = null;
        long j = 0;
        long j2 = -1;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f2 = 1.0f;
        float f3 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        float f4 = 0.0f;
        String str2 = "UNSET";
        String str3 = null;
        while (jsonReader.F()) {
            switch (jsonReader.C0(f24061a)) {
                case 0:
                    str2 = jsonReader.i0();
                    break;
                case 1:
                    j = jsonReader.c0();
                    break;
                case 2:
                    str = jsonReader.i0();
                    break;
                case 3:
                    int c0 = jsonReader.c0();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (c0 >= layerType.ordinal()) {
                        break;
                    } else {
                        layerType = Layer.LayerType.values()[c0];
                        break;
                    }
                case 4:
                    j2 = jsonReader.c0();
                    break;
                case 5:
                    i = (int) (jsonReader.c0() * fxv.e());
                    break;
                case 6:
                    i2 = (int) (jsonReader.c0() * fxv.e());
                    break;
                case 7:
                    i3 = Color.parseColor(jsonReader.i0());
                    break;
                case 8:
                    vx0Var = wx0.g(jsonReader, kkhVar);
                    break;
                case 9:
                    int c02 = jsonReader.c0();
                    if (c02 < Layer.MatteType.values().length) {
                        matteType2 = Layer.MatteType.values()[c02];
                        int i6 = a.f24062a[matteType2.ordinal()];
                        if (i6 == 1) {
                            kkhVar.a("Unsupported matte type: Luma");
                        } else if (i6 == 2) {
                            kkhVar.a("Unsupported matte type: Luma Inverted");
                        }
                        kkhVar.r(1);
                        break;
                    } else {
                        kkhVar.a("Unsupported matte type: " + c02);
                        break;
                    }
                case 10:
                    jsonReader.e();
                    while (jsonReader.F()) {
                        arrayList.add(r5i.a(jsonReader, kkhVar));
                    }
                    kkhVar.r(arrayList.size());
                    jsonReader.w();
                    break;
                case 11:
                    jsonReader.e();
                    while (jsonReader.F()) {
                        tp4 a2 = up4.a(jsonReader, kkhVar);
                        if (a2 != null) {
                            arrayList2.add(a2);
                        }
                    }
                    jsonReader.w();
                    break;
                case 12:
                    jsonReader.g();
                    while (jsonReader.F()) {
                        int C0 = jsonReader.C0(b);
                        if (C0 == 0) {
                            sx0Var = yx0.d(jsonReader, kkhVar);
                        } else if (C0 != 1) {
                            jsonReader.D0();
                            jsonReader.E0();
                        } else {
                            jsonReader.e();
                            if (jsonReader.F()) {
                                tx0Var = ux0.a(jsonReader, kkhVar);
                            }
                            while (jsonReader.F()) {
                                jsonReader.E0();
                            }
                            jsonReader.w();
                        }
                    }
                    jsonReader.A();
                    break;
                case 13:
                    jsonReader.e();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.F()) {
                        jsonReader.g();
                        while (jsonReader.F()) {
                            int C02 = jsonReader.C0(c);
                            if (C02 == 0) {
                                int c03 = jsonReader.c0();
                                if (c03 == 29) {
                                    ag2Var = bg2.b(jsonReader, kkhVar);
                                } else if (c03 == 25) {
                                    e08Var = new f08().b(jsonReader, kkhVar);
                                }
                            } else if (C02 != 1) {
                                jsonReader.D0();
                                jsonReader.E0();
                            } else {
                                arrayList3.add(jsonReader.i0());
                            }
                        }
                        jsonReader.A();
                    }
                    jsonReader.w();
                    kkhVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    f2 = (float) jsonReader.Z();
                    break;
                case 15:
                    f3 = (float) jsonReader.Z();
                    break;
                case 16:
                    i4 = (int) (jsonReader.c0() * fxv.e());
                    break;
                case 17:
                    i5 = (int) (jsonReader.c0() * fxv.e());
                    break;
                case 18:
                    f = (float) jsonReader.Z();
                    break;
                case 19:
                    f4 = (float) jsonReader.Z();
                    break;
                case 20:
                    jx0Var = yx0.f(jsonReader, kkhVar, false);
                    break;
                case 21:
                    str3 = jsonReader.i0();
                    break;
                case 22:
                    z = jsonReader.L();
                    break;
                default:
                    jsonReader.D0();
                    jsonReader.E0();
                    break;
            }
        }
        jsonReader.A();
        ArrayList arrayList4 = new ArrayList();
        if (f > 0.0f) {
            arrayList4.add(new w4g(kkhVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f)));
        }
        if (f4 <= 0.0f) {
            f4 = kkhVar.f();
        }
        arrayList4.add(new w4g(kkhVar, valueOf, valueOf, null, f, Float.valueOf(f4)));
        arrayList4.add(new w4g(kkhVar, valueOf2, valueOf2, null, f4, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            kkhVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList2, kkhVar, str2, j, layerType, j2, str, arrayList, vx0Var, i, i2, i3, f2, f3, i4, i5, sx0Var, tx0Var, arrayList4, matteType2, jx0Var, z, ag2Var, e08Var);
    }

    public static Layer b(kkh kkhVar) {
        Rect b2 = kkhVar.b();
        return new Layer(Collections.emptyList(), kkhVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new vx0(), 0, 0, 0, 0.0f, 0.0f, b2.width(), b2.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null);
    }
}
