package com.taobao.mytaobao.homepage.busniess.acds;

import android.text.TextUtils;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DealInfo implements IMTOPDataObject, Serializable {
    public static final String KEY_HAS_PAID = "hasPaid";
    public static final String KEY_TO_COMMENT = "toComment";
    public static final String KEY_TO_CONFIRM = "toConfirmBiz";
    public static final String KEY_TO_PAY = "toPayBiz";
    public static final String KEY_TO_REFUND = "refundBiz";
    private static final long serialVersionUID = 4591266114586077726L;
    public String hasPaid;
    public String refundBiz;
    public String toComment;
    public String toConfirmBiz;
    public String toPayBiz;

    static {
        t2o.a(745537729);
        t2o.a(589299906);
    }

    public static DealInfo createZeroCount() {
        DealInfo dealInfo = new DealInfo();
        dealInfo.hasPaid = "0";
        dealInfo.toComment = "0";
        dealInfo.toConfirmBiz = "0";
        dealInfo.refundBiz = "0";
        dealInfo.toPayBiz = "0";
        return dealInfo;
    }

    public boolean isSameBiz(DealInfo dealInfo, boolean z, String... strArr) {
        if (dealInfo == null || strArr == null) {
            return z;
        }
        boolean z2 = true;
        for (String str : strArr) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1880185434:
                    if (str.equals(KEY_TO_PAY)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1263537394:
                    if (str.equals(KEY_TO_CONFIRM)) {
                        c = 1;
                        break;
                    }
                    break;
                case -712816796:
                    if (str.equals(KEY_TO_COMMENT)) {
                        c = 2;
                        break;
                    }
                    break;
                case -470855045:
                    if (str.equals(KEY_TO_REFUND)) {
                        c = 3;
                        break;
                    }
                    break;
                case 696814726:
                    if (str.equals(KEY_HAS_PAID)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    z2 = TextUtils.equals(this.toPayBiz, dealInfo.toPayBiz);
                    break;
                case 1:
                    z2 = TextUtils.equals(this.toConfirmBiz, dealInfo.toConfirmBiz);
                    break;
                case 2:
                    z2 = TextUtils.equals(this.toComment, dealInfo.toComment);
                    break;
                case 3:
                    z2 = TextUtils.equals(this.refundBiz, dealInfo.refundBiz);
                    break;
                case 4:
                    z2 = TextUtils.equals(this.hasPaid, dealInfo.hasPaid);
                    break;
            }
            if (!z2) {
                return z2;
            }
        }
        return z2;
    }

    public boolean isSameBiz(DealInfo dealInfo, String... strArr) {
        return isSameBiz(dealInfo, false, strArr);
    }
}
