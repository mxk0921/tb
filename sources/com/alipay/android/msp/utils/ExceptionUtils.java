package com.alipay.android.msp.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.language.LanguageHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Locale;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExceptionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_001 = 1;
    public static final int ERROR_CODE_002 = 2;
    public static final int ERROR_CODE_003 = 3;
    public static final int ERROR_CODE_004 = 4;
    public static final int ERROR_CODE_005 = 5;
    public static final int ERROR_CODE_006 = 6;
    public static final int ERROR_CODE_101 = 101;
    public static final int ERROR_CODE_102 = 102;
    public static final int ERROR_CODE_103 = 103;
    public static final int ERROR_CODE_104 = 104;
    public static final int ERROR_CODE_105 = 105;
    public static final int ERROR_CODE_106 = 106;
    public static final int ERROR_CODE_107 = 107;
    public static final int ERROR_CODE_108 = 108;
    public static final int ERROR_CODE_109 = 109;
    public static final int ERROR_CODE_110 = 111;
    public static final int ERROR_CODE_201 = 201;
    public static final int ERROR_CODE_202 = 202;
    public static final int ERROR_CODE_203 = 203;
    public static final int ERROR_CODE_204 = 204;
    public static final int ERROR_CODE_205 = 205;
    public static final int ERROR_CODE_206 = 206;
    public static final int ERROR_CODE_301 = 301;
    public static final int ERROR_CODE_302 = 302;
    public static final int ERROR_CODE_303 = 303;
    public static final int ERROR_CODE_304 = 304;
    public static final int ERROR_CODE_305 = 305;
    public static final int ERROR_CODE_306 = 306;
    public static final int ERROR_CODE_307 = 307;
    public static final int ERROR_CODE_DEFAULT = 0;
    public static final String ERROR_MSG_DATA_ERROR = "数据解析异常";

    public static String createExceptionMsg(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60554e12", new Object[]{new Integer(i)}) : createExceptionMsg(null, i);
    }

    private static void logForExceptionUI(MspContext mspContext, Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32e3f3a", new Object[]{mspContext, th, new Boolean(z)});
        } else if (mspContext != null && th != null) {
            if (z) {
                mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "ExAction_".concat(th.getClass().getSimpleName()), th);
            } else {
                mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "ExAction_".concat(th.getClass().getSimpleName()), th.getMessage());
            }
        }
    }

    public static String createExceptionMsg(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a247de1c", new Object[]{str, new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            Context context = GlobalHelper.getInstance().getContext();
            if (context != null) {
                str = LanguageHelper.localizedStringForKey("mini_app_error", context.getString(R.string.mini_app_error), new Object[0]);
            } else {
                str = "人气太旺啦，稍候再试试。";
            }
        }
        sb.append(str);
        sb.append(f7l.BRACKET_START_STR);
        sb.append(String.format(Locale.getDefault(), "%d", Integer.valueOf(i)));
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void sendUiMsgWhenException(int r5, java.lang.Throwable r6) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.android.msp.utils.ExceptionUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r4
            r5[r0] = r6
            java.lang.String r6 = "5de57ea9"
            r3.ipc$dispatch(r6, r5)
            return
        L_0x001a:
            com.alipay.android.msp.core.context.MspContextManager r3 = com.alipay.android.msp.core.context.MspContextManager.getInstance()
            com.alipay.android.msp.core.context.MspContext r5 = r3.getMspContextByBizId(r5)
            boolean r3 = r6 instanceof java.io.IOException
            if (r3 == 0) goto L_0x0036
            com.alipay.android.msp.framework.exception.NetErrorException r1 = new com.alipay.android.msp.framework.exception.NetErrorException
            r1.<init>(r6)
            com.alipay.android.msp.framework.exception.NetErrorException$Channel r6 = com.alipay.android.msp.framework.exception.NetErrorException.Channel.UNKNOWN
            r1.setChannel(r6)
            logForExceptionUI(r5, r1, r0)
        L_0x0033:
            r6 = r1
            goto L_0x00a8
        L_0x0036:
            boolean r3 = r6 instanceof com.alipay.android.msp.framework.exception.NetErrorException
            if (r3 != 0) goto L_0x006e
            boolean r4 = r6 instanceof com.alipay.android.msp.framework.exception.AppErrorException
            if (r4 != 0) goto L_0x006e
            boolean r4 = r6 instanceof com.alipay.android.msp.framework.exception.DataErrorException
            if (r4 != 0) goto L_0x006e
            boolean r4 = r6 instanceof com.alipay.android.msp.framework.exception.MspServerErrorException
            if (r4 != 0) goto L_0x006e
            logForExceptionUI(r5, r6, r0)
            android.content.Context r0 = com.alipay.android.msp.utils.MspContextUtil.getContext()
            int r3 = com.taobao.taobao.R.string.mini_app_error
            java.lang.String r0 = r0.getString(r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "mini_app_error"
            java.lang.String r0 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r3, r0, r1)
            boolean r1 = r6 instanceof com.alibaba.fastjson.JSONException
            if (r1 != 0) goto L_0x0064
            boolean r1 = r6 instanceof org.json.JSONException
            if (r1 == 0) goto L_0x0068
        L_0x0064:
            java.lang.String r0 = createExceptionMsg(r0, r2)
        L_0x0068:
            com.alipay.android.msp.framework.exception.AppErrorException r1 = new com.alipay.android.msp.framework.exception.AppErrorException
            r1.<init>(r0, r6)
            goto L_0x0033
        L_0x006e:
            if (r3 == 0) goto L_0x0088
            r0 = r6
            com.alipay.android.msp.framework.exception.NetErrorException r0 = (com.alipay.android.msp.framework.exception.NetErrorException) r0
            if (r5 == 0) goto L_0x00a8
            com.alipay.android.msp.framework.statisticsv2.StatisticInfo r1 = r5.getStatisticInfo()
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = r0.getShortMessageForLog()
            java.lang.String r3 = "ne"
            r1.addError(r3, r2, r0)
            goto L_0x00a8
        L_0x0088:
            boolean r2 = r6 instanceof com.alipay.android.msp.framework.exception.AppErrorException
            if (r2 == 0) goto L_0x00a2
            java.lang.String r0 = r6.getMessage()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x00a8
            java.lang.String r2 = "(6)"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x00a8
            logForExceptionUI(r5, r6, r1)
            goto L_0x00a8
        L_0x00a2:
            boolean r1 = r6 instanceof com.alipay.android.msp.framework.exception.DataErrorException
            r0 = r0 ^ r1
            logForExceptionUI(r5, r6, r0)
        L_0x00a8:
            if (r5 == 0) goto L_0x00b1
            com.alipay.android.msp.drivers.actions.ActionsCreator r5 = com.alipay.android.msp.drivers.actions.ActionsCreator.get(r5)
            r5.createExceptionAction(r6)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.utils.ExceptionUtils.sendUiMsgWhenException(int, java.lang.Throwable):void");
    }
}
