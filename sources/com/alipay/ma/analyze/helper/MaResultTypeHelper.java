package com.alipay.ma.analyze.helper;

import android.net.Uri;
import android.text.TextUtils;
import com.alipay.ma.common.result.ResultMaType;
import com.alipay.ma.decode.DecodeResult;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MaResultTypeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe2cbc53", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 32768) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("557d0566", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ((!str.startsWith("8") || str.length() != 20) && ((!str.startsWith("10") && !str.startsWith("11")) || str.length() != 16)) {
            return false;
        }
        return true;
    }

    public static ResultMaType getMaType(DecodeResult decodeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultMaType) ipChange.ipc$dispatch("201ec69a", new Object[]{decodeResult});
        }
        int i = decodeResult.type;
        if (i == 0) {
            return ResultMaType.PRODUCT;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 1024) {
                    return ResultMaType.DM;
                }
                if (i == 2048) {
                    return ResultMaType.PDF417;
                }
                if (i == 32768) {
                    return ResultMaType.GEN3;
                }
                if (i != 65536) {
                    if (i == 131072) {
                        return ResultMaType.NARROW;
                    }
                    if (i == 262144) {
                        return ResultMaType.HMCODE;
                    }
                    if (i != 524288) {
                        return null;
                    }
                    return ResultMaType.WXTINYCODE;
                } else if (isARCode(i, decodeResult.subType)) {
                    return ResultMaType.ARCODE;
                } else {
                    return null;
                }
            } else if (b(decodeResult.strCode)) {
                return ResultMaType.MEDICINE;
            } else {
                return ResultMaType.EXPRESS;
            }
        } else if (c(decodeResult.strCode)) {
            return ResultMaType.TB_ANTI_FAKE;
        } else {
            if (a(decodeResult.subType)) {
                return ResultMaType.GEN3;
            }
            return ResultMaType.QR;
        }
    }

    public static boolean isARCode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ab46093", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        ResultMaType resultMaType = ResultMaType.ARCODE;
        if (i == resultMaType.getType() && i2 == resultMaType.getDiscernType()) {
            return true;
        }
        return false;
    }

    public static boolean c(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdb1af31", new Object[]{str})).booleanValue();
        }
        return !TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && !TextUtils.isEmpty(parse.getHost()) && TextUtils.equals("s.tb.cn", parse.getHost().toLowerCase());
    }
}
