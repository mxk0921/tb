package com.ta.audid.store;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.utils.RC4;
import com.ta.audid.utils.UtdidLogger;
import com.ta.utdid2.android.utils.Base64;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UtdidContentUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787080);
    }

    public static String getEncodedContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df65868e", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new String(Base64.encode(RC4.rc4(str.getBytes()), 2), "UTF-8");
        } catch (Exception e) {
            UtdidLogger.e("", e, new Object[0]);
            return "";
        }
    }
}
