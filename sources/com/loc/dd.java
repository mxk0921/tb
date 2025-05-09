package com.loc;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dd {
    public static boolean a(byte[] bArr) {
        String str;
        String concat;
        if (bArr == null) {
            return false;
        }
        try {
            ek ekVar = new ek();
            ekVar.b.put("Content-Type", UploadConstants.FILE_CONTENT_TYPE);
            ekVar.b.put("aps_c_src", Base64.encodeToString(ek.a().getBytes(), 2));
            ekVar.b.put("aps_c_key", Base64.encodeToString(ek.b().getBytes(), 2));
            ekVar.d = bArr;
            if (cu.f5639a) {
                concat = "http://cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
            } else {
                if (cu.b) {
                    str = h1p.HTTPS_PREFIX;
                } else {
                    str = h1p.HTTP_PREFIX;
                }
                concat = str.concat("cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&");
            }
            ekVar.f5667a = concat;
            el a2 = dy.b().a(ekVar);
            byte[] bArr2 = (a2 == null || a2.f5668a != 200) ? null : a2.c;
            if (bArr2 != null) {
                return "true".equals(new String(bArr2, StandardCharsets.UTF_8));
            }
            return false;
        } catch (Exception e) {
            ej.a(e);
            return false;
        }
    }
}
