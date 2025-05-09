package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.alipay.ma.analyze.api.MaAnalyzeAPI;
import com.alipay.ma.decode.DecodeResult;
import com.alipay.ma.decode.DecodeType;
import com.alipay.ma.decode.MaDecode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, byh> f31660a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType;

        static {
            int[] iArr = new int[MaType.values().length];
            $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType = iArr;
            try {
                iArr[MaType.QR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType[MaType.DM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType[MaType.EXPRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType[MaType.PRODUCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType[MaType.MEDICINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType[MaType.TB_ANTI_FAKE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType[MaType.TB_4G.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        t2o.a(760217779);
    }

    public static MaResult[] a(long j, boolean z, DecodeResult[] decodeResultArr, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("f2fd6c6c", new Object[]{new Long(j), new Boolean(z), decodeResultArr, new Boolean(z2)});
        }
        rwl.b("decode", j, z, z2);
        if (!z) {
            return null;
        }
        ArrayList arrayList = new ArrayList(decodeResultArr.length);
        for (DecodeResult decodeResult : decodeResultArr) {
            MaResult j2 = j(decodeResult);
            if (j2 != null) {
                arrayList.add(j2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (MaResult[]) arrayList.toArray(new MaResult[arrayList.size()]);
    }

    public static MaResult b(eyh eyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("6c540717", new Object[]{eyhVar});
        }
        HashMap<String, byh> hashMap = f31660a;
        if (hashMap.isEmpty()) {
            hashMap.put(wxh.class.getName(), new wxh());
            hashMap.put(cyh.class.getName(), new cyh());
            hashMap.put(dyh.class.getName(), new dyh());
            hashMap.put(ayh.class.getName(), new ayh());
        }
        for (String str : hashMap.keySet()) {
            MaResult a2 = f31660a.get(str).a(eyhVar);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public static boolean c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a073020a", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    public static MaResult d(Bitmap bitmap, MaType... maTypeArr) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("a21d2c4b", new Object[]{bitmap, maTypeArr});
        }
        if (bitmap == null) {
            return null;
        }
        int i = 0;
        for (DecodeType decodeType : l(maTypeArr)) {
            i |= decodeType.getCodeType();
        }
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult[] codeDecodePictureWithQr = MaDecode.codeDecodePictureWithQr(bitmap, i, false);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        new StringBuilder("decode: uri = , costTime = ").append(currentTimeMillis2);
        if (codeDecodePictureWithQr != null) {
            z = true;
        }
        rwl.a("decode", currentTimeMillis2, z);
        return k(codeDecodePictureWithQr);
    }

    public static MaResult e(String str, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("b80d010e", new Object[]{str, new Integer(i)});
        }
        int i2 = i(i);
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult[] decode = MaAnalyzeAPI.decode(str, Globals.getApplication(), i2);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder sb = new StringBuilder("decode: path = ");
        sb.append(str);
        sb.append("costTime = ");
        sb.append(currentTimeMillis2);
        if (decode == null) {
            z = false;
        }
        rwl.a("decode", currentTimeMillis2, z);
        return k(decode);
    }

    public static MaResult f(String str, int i, Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("470d5b8e", new Object[]{str, new Integer(i), context});
        }
        int i2 = i(i);
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult[] decode = MaAnalyzeAPI.decode(str, context, i2);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder sb = new StringBuilder("decode: uri = ");
        sb.append(str);
        sb.append(", costTime = ");
        sb.append(currentTimeMillis2);
        if (decode == null) {
            z = false;
        }
        rwl.a("decode", currentTimeMillis2, z);
        return k(decode);
    }

    public static MaResult[] g(Bitmap bitmap, int i, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("69b7186a", new Object[]{bitmap, new Integer(i), new Boolean(z)});
        }
        int i2 = i(i);
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult[] decode = MaAnalyzeAPI.decode(bitmap, i2, false, z);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        new StringBuilder("decodeInBatch: costTime = ").append(currentTimeMillis2);
        if (decode == null || decode.length == 0) {
            z2 = false;
        }
        return a(currentTimeMillis2, z2, decode, z);
    }

    public static MaResult[] h(YuvImage yuvImage, Rect rect, MaType... maTypeArr) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult[]) ipChange.ipc$dispatch("4669fb48", new Object[]{yuvImage, rect, maTypeArr});
        }
        DecodeType[] l = l(maTypeArr);
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult[] decode = MaAnalyzeAPI.decode(yuvImage, rect, l);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (decode == null || decode.length == 0) {
            z = false;
        }
        return a(currentTimeMillis2, z, decode, false);
    }

    public static int i(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d050fe4", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 36607) {
            return DecodeType.ALLQRCODE.getCodeType() | DecodeType.ALLBARCODE.getCodeType();
        }
        if (c(i, 2)) {
            i2 = DecodeType.EXPRESS.getCodeType();
        }
        if (c(i, 1)) {
            i2 |= DecodeType.EAN13.getCodeType();
        }
        if (c(i, 2)) {
            i2 |= DecodeType.EAN8.getCodeType();
        }
        if (c(i, 4)) {
            i2 |= DecodeType.UPCA.getCodeType();
        }
        if (c(i, 8)) {
            i2 |= DecodeType.UPCE.getCodeType();
        }
        if (c(i, 2)) {
            i2 |= DecodeType.EAN8.getCodeType();
        }
        if (c(i, 128)) {
            i2 |= DecodeType.EAN14.getCodeType();
        }
        if (c(i, 16)) {
            i2 |= DecodeType.CODE39.getCodeType();
        }
        if (c(i, 64)) {
            i2 |= DecodeType.ITF.getCodeType();
        }
        if (c(i, 48)) {
            i2 |= DecodeType.FASTMAIL.getCodeType();
        }
        if (c(i, 255)) {
            i2 |= DecodeType.ONECODE.getCodeType();
        }
        c(i, 127);
        if (c(i, 512)) {
            i2 |= DecodeType.QRCODE.getCodeType();
        }
        if (c(i, 1024)) {
            return i2 | DecodeType.DMCODE.getCodeType();
        }
        return i2;
    }

    public static MaResult j(DecodeResult decodeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("131e73a", new Object[]{decodeResult});
        }
        if (decodeResult == null) {
            return null;
        }
        gso.c("MaDecodeV2_get result:" + decodeResult.resultMaType + decodeResult.toString(), new Object[0]);
        MaResult b = b(m(decodeResult));
        if (b == null) {
            gso.b("MaDecodeV2 has decode result but no parse data", new Object[0]);
            return null;
        }
        gso.c("MaDecodeV2_transform to biz result :" + b.toString(), new Object[0]);
        return b;
    }

    public static MaResult k(DecodeResult[] decodeResultArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("ef2aa837", new Object[]{decodeResultArr});
        }
        if (decodeResultArr == null || decodeResultArr.length == 0) {
            return null;
        }
        return j(decodeResultArr[0]);
    }

    public static DecodeType[] l(MaType[] maTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeType[]) ipChange.ipc$dispatch("f7683320", new Object[]{maTypeArr});
        }
        if (maTypeArr == null || maTypeArr.length == 0) {
            return new DecodeType[0];
        }
        ArrayList arrayList = new ArrayList();
        for (MaType maType : maTypeArr) {
            switch (a.$SwitchMap$com$taobao$taobao$scancode$v2$result$MaType[maType.ordinal()]) {
                case 1:
                    arrayList.add(DecodeType.QRCODE);
                    break;
                case 2:
                    arrayList.add(DecodeType.DMCODE);
                    break;
                case 3:
                    arrayList.add(DecodeType.EXPRESS);
                    break;
                case 4:
                    arrayList.add(DecodeType.PRODUCT);
                    break;
                case 5:
                    arrayList.add(DecodeType.MEDICINE);
                    break;
                case 6:
                    arrayList.add(DecodeType.MEDICINE);
                    break;
            }
        }
        return (DecodeType[]) arrayList.toArray(new DecodeType[0]);
    }

    public static eyh m(DecodeResult decodeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyh) ipChange.ipc$dispatch("1223fc15", new Object[]{decodeResult});
        }
        eyh eyhVar = new eyh();
        eyhVar.f18888a = decodeResult.type;
        eyhVar.b = decodeResult.subType;
        eyhVar.c = decodeResult.strCode;
        eyhVar.d = decodeResult.decodeBytes;
        eyhVar.e = decodeResult.hiddenData;
        eyhVar.g = decodeResult.x;
        eyhVar.h = decodeResult.y;
        eyhVar.i = decodeResult.width;
        eyhVar.j = decodeResult.height;
        eyhVar.k = decodeResult.xCorner;
        eyhVar.l = decodeResult.yCorner;
        eyhVar.f = vxh.a(eyhVar);
        return eyhVar;
    }
}
