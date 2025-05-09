package tb;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kay {
    public static String a(Context context, String str, String str2) {
        int identifier;
        if (TextUtils.isEmpty(str2) || (identifier = context.getResources().getIdentifier(str2, "string", str)) == 0) {
            return null;
        }
        try {
            return context.getResources().getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String b(Context context, String str, String str2, String str3) {
        try {
            byte[] c = c(str3.getBytes("utf-8"));
            return a(context, str, str2 + lva.c(c));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            Log.e("ResourcesUtils", "getResources exception:" + e.getMessage());
            return null;
        }
    }

    public static byte[] c(byte[] bArr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256").digest(bArr);
    }
}
