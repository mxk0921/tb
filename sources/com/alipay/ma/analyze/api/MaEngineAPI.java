package com.alipay.ma.analyze.api;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import com.alipay.ma.EngineType;
import com.alipay.ma.MaBuryRecord;
import com.alipay.ma.MaLogger;
import com.alipay.ma.decode.DecodeResult;
import com.alipay.ma.decode.DecodeType;
import com.alipay.ma.decode.MaDecode;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MaEngineAPI {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MaEngineAPI";
    public static boolean sEngineSoLoaded;

    /* renamed from: a  reason: collision with root package name */
    public DecodeType f3859a;
    public int classicFrameCount = 0;
    public String extraRecognizeType;
    public int mAvgGray;
    public EngineType recognizeType;

    public int calAverageGrey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76553f68", new Object[]{this})).intValue();
        }
        return MaDecode.getLastFrameAverageGray();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f3859a = null;
        MaDecode.decodeUnInit();
    }

    public int getAvgGray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("901f5919", new Object[]{this})).intValue();
        }
        return this.mAvgGray;
    }

    public float getMaLimitFactor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84600f77", new Object[]{this})).floatValue();
        }
        return MaDecode.getLimitZoomFactorJ();
    }

    public float getMaProportion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f299a3b", new Object[]{this})).floatValue();
        }
        return MaDecode.getMaProportionJ();
    }

    public int getMaProportionSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77b5f5f9", new Object[]{this})).intValue();
        }
        return MaDecode.getMaProportionSourceJ();
    }

    public float[] getQRSizeAndCednter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("2d9db1e4", new Object[]{this});
        }
        float[] fArr = new float[4];
        MaDecode.getQrSizeAndCenterJ(fArr);
        return fArr;
    }

    public boolean init(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48838558", new Object[]{this, context, map})).booleanValue();
        }
        MaDecode.decodeInit();
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj != null) {
                    MaDecode.setReaderParamsJ(str, obj.toString());
                }
            }
        }
        this.f3859a = null;
        return true;
    }

    public void setSubScanType(EngineType engineType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c8ae0b", new Object[]{this, engineType});
            return;
        }
        this.recognizeType = engineType;
        this.extraRecognizeType = null;
    }

    public void setSubScanType(EngineType engineType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd508b15", new Object[]{this, engineType, str});
            return;
        }
        this.recognizeType = engineType;
        this.extraRecognizeType = str;
    }

    public DecodeResult[] doProcess(byte[] bArr, Rect rect, Point point, int i, int i2, float f) {
        Rect rect2;
        DecodeType decodeType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeResult[]) ipChange.ipc$dispatch("68864de4", new Object[]{this, bArr, rect, point, new Integer(i), new Integer(i2), new Float(f)});
        }
        DecodeResult[] decodeResultArr = null;
        if (bArr == null) {
            MaLogger.d(TAG, "doProcess mData == null");
            MaBuryRecord.reportUnusualScanCase(1, "mData is null");
            return null;
        }
        this.classicFrameCount++;
        if (rect != null) {
            if (rect.left < 0) {
                rect.left = 0;
            }
            if (rect.top < 0) {
                rect.top = 0;
            }
            int i3 = rect.right;
            int i4 = point.x;
            if (i3 > i4) {
                rect.right = i4;
            }
            int i5 = rect.bottom;
            int i6 = point.y;
            if (i5 > i6) {
                rect.bottom = i6;
            }
            rect2 = rect;
        } else {
            rect2 = null;
        }
        if (rect2 == null) {
            MaBuryRecord.reportUnusualScanCase(3, "scanRect is null");
            MaLogger.d(TAG, "doProcess maResults = null");
        } else {
            EngineType engineType = this.recognizeType;
            if (engineType == EngineType.DEFAULT) {
                decodeType = DecodeType.DEFAULTCODE;
            } else if (engineType == EngineType.ALL) {
                decodeType = DecodeType.ALLCODE;
            } else if (engineType == EngineType.QRCODE) {
                decodeType = DecodeType.ALLQRCODE;
            } else if (engineType == EngineType.BAR) {
                decodeType = DecodeType.ALLBARCODE;
            } else if (engineType == EngineType.LOTTERY) {
                decodeType = DecodeType.ALLLOTTERYCODE;
            } else {
                decodeType = this.extraRecognizeType == null ? DecodeType.DEFAULTCODE : null;
            }
            if (this.f3859a == null) {
                this.f3859a = decodeType;
                MaLogger.d(TAG, "doProcess: recognizeType=" + this.recognizeType + ", typeSet=" + this.extraRecognizeType);
            }
            DecodeResult[] decodeScanMode = MaAnalyzeAPI.decodeScanMode(bArr, point.x, point.y, i, rect2, DecodeType.getCode(decodeType, this.extraRecognizeType), f);
            if (decodeScanMode != null) {
                if (decodeScanMode.length == 0) {
                    MaBuryRecord.reportUnusualScanCase(4, "maResults.length is 0");
                    MaLogger.d(TAG, "doProcess maResults.length == 0");
                } else {
                    MaLogger.d(TAG, "total get " + decodeScanMode.length + " codes");
                    for (DecodeResult decodeResult : decodeScanMode) {
                        MaLogger.d(TAG, decodeResult.toString());
                    }
                }
            }
            decodeResultArr = decodeScanMode;
        }
        if (decodeResultArr == null) {
            this.mAvgGray = calAverageGrey();
        } else {
            this.mAvgGray = -1;
        }
        return decodeResultArr;
    }
}
