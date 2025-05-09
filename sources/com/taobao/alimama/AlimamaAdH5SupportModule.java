package com.taobao.alimama;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.o2o.ad.O2OAdH5Support;
import com.taobao.utils.Global;
import java.util.Map;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AlimamaAdH5SupportModule extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLICK_ID = "clickid";
    public static final String JS_BRIDGE_NAME = "MunionWebViewJs";
    private static final String MESSAGE = "message";
    private O2OAdH5Support mO2OAdH5Support = new O2OAdH5Support();

    static {
        t2o.a(1021313026);
    }

    public static /* synthetic */ Object ipc$super(AlimamaAdH5SupportModule alimamaAdH5SupportModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/AlimamaAdH5SupportModule");
    }

    private void notifyError(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48320cd", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            nsw nswVar = new nsw("HY_FAILED");
            nswVar.b("message", str);
            wVCallBackContext.error(nswVar);
        }
    }

    public void commitIfsEvent(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e91ef3", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        AlimamaAdvertising.instance().buildIfsExposure(Global.getApplication(), str).withArgNamespace(str2).commit();
        if (wVCallBackContext != null) {
            wVCallBackContext.success(nsw.RET_SUCCESS);
        }
    }

    public void commitTaokeInfo(String str, String str2, String str3, boolean z, Map<String, String> map, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86f3426", new Object[]{this, str, str2, str3, new Boolean(z), map, wVCallBackContext});
            return;
        }
        AlimamaAdvertising.instance().commitTaokeInfo(str, str2, str3, z, map);
        if (wVCallBackContext != null) {
            wVCallBackContext.success(nsw.RET_SUCCESS);
        }
    }

    public void genClickIdBy(String str, boolean z, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ab80d6", new Object[]{this, str, new Boolean(z), wVCallBackContext});
            return;
        }
        String handleAdUrlForClickid = AlimamaAdvertising.instance().handleAdUrlForClickid(str, z);
        if (wVCallBackContext != null) {
            nsw nswVar = new nsw();
            nswVar.k();
            if (handleAdUrlForClickid == null) {
                handleAdUrlForClickid = "";
            }
            nswVar.b("clickid", handleAdUrlForClickid);
            wVCallBackContext.success(nswVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:39|(2:153|40)|(2:159|41)|(2:187|42)|151|46|(1:48)(1:49)|50|51|53|(1:60)(1:59)|61) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0110, code lost:
        r16 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0330 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0331 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102 A[Catch: Exception -> 0x0110, TryCatch #1 {Exception -> 0x0110, blocks: (B:46:0x00fb, B:49:0x0102, B:50:0x0106), top: B:151:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0182 A[Catch: Exception -> 0x0193, TRY_LEAVE, TryCatch #8 {Exception -> 0x0193, blocks: (B:72:0x017a, B:75:0x0182), top: B:165:0x017a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb  */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r24, java.lang.String r25, android.taobao.windvane.jsbridge.WVCallBackContext r26) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.alimama.AlimamaAdH5SupportModule.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
