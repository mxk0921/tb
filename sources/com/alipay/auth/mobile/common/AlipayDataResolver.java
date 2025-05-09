package com.alipay.auth.mobile.common;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlipayDataResolver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f3786a;

    public AlipayDataResolver(Context context) {
        this.f3786a = context.getContentResolver();
    }

    public int getAlipayAuthLoginSupportVersion(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93056fe5", new Object[]{this, new Integer(i)})).intValue();
        }
        try {
            Cursor query = this.f3786a.query(Uri.parse("content://com.alipay.ali.authlogin/auth_login_sdk_version"), null, null, null, null);
            if (query == null) {
                LoggerUtils.d("AlipayDataResolver", "getAlipayAuthLoginSupportVersion cursor == null");
                return i;
            }
            if (query.moveToFirst()) {
                i2 = Integer.valueOf(query.getString(0)).intValue();
            } else {
                i2 = i;
            }
            query.close();
            LoggerUtils.d("AlipayDataResolver", "getAlipayAuthLoginSupportVersion result=" + i2);
            return i2;
        } catch (Exception e) {
            LoggerUtils.e("AlipayDataResolver", "getAlipayAuthLoginSupportVersion error", e);
            return i;
        }
    }
}
