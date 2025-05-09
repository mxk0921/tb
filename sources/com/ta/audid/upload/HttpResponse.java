package com.ta.audid.upload;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.utils.MD5Utils;
import com.ta.audid.utils.UtdidLogger;
import com.ta.utdid2.android.utils.Base64;
import com.taobao.message.sp.framework.model.SimpleProfile;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HttpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int httpResponseCode = -1;
    public long timestamp = 0;
    public String signature = "";
    public byte[] data = null;
    public long rt = 0;

    static {
        t2o.a(966787081);
    }

    public static boolean checkSignature(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a9c6eaf", new Object[]{str, str2})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                UtdidLogger.sd("", "result", str, SimpleProfile.KEY_SIGNATURE, str2);
                if (str2.equals(Base64.encodeToString(MD5Utils.getHmacMd5Hex(str).getBytes(), 2))) {
                    UtdidLogger.d("", "signature is ok");
                    return true;
                }
                UtdidLogger.d("", "signature is error");
            }
        } catch (Exception e) {
            UtdidLogger.d("", e);
        }
        return false;
    }
}
