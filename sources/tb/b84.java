package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.util.Scancode;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType;

        static {
            int[] iArr = new int[MaType.values().length];
            $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType = iArr;
            try {
                iArr[MaType.PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType[MaType.QR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taobao$scancode$v2$result$MaType[MaType.GEN3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(760217649);
    }

    public static void a(Activity activity, String str, ScancodeResult scancodeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106e1501", new Object[]{activity, str, scancodeResult});
        } else if (activity != null && scancodeResult != null && !TextUtils.isEmpty(str)) {
            Intent intent = new Intent(str);
            intent.putExtra(Scancode.GATEWAY_CALLBACK_RESULT_PARAM, scancodeResult);
            activity.sendBroadcast(intent);
        }
    }

    public static void b(Object obj, String str, MaType maType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91ea7b53", new Object[]{obj, str, maType});
            return;
        }
        HashMap hashMap = new HashMap();
        if (maType == null) {
            hashMap.put(SessionConstants.ECODE, str);
            hashMap.put("codetype", "");
            rso.p(obj, hashMap);
            return;
        }
        int i = a.$SwitchMap$com$taobao$taobao$scancode$v2$result$MaType[maType.ordinal()];
        if (i == 1) {
            hashMap.put(SessionConstants.ECODE, str);
            hashMap.put("codetype", "GoodsBarcode");
            rso.p(obj, hashMap);
        } else if (i != 2) {
            if (i != 3) {
                hashMap.put(SessionConstants.ECODE, str);
                hashMap.put("codetype", "");
                rso.p(obj, hashMap);
                return;
            }
            hashMap.put(SessionConstants.ECODE, str);
            hashMap.put("codetype", "QR_CODE");
            rso.p(obj, hashMap);
        } else if (str.contains("ma.taobao.com") || str.contains("tb.cn") || str.contains("ma.m.taobao.com")) {
            hashMap.put("mecode", str);
            hashMap.put("codetype", "QR_CODE");
            rso.p(obj, hashMap);
        } else {
            hashMap.put(SessionConstants.ECODE, str);
            hashMap.put("codetype", "QR_CODE");
            rso.p(obj, hashMap);
        }
    }
}
