package tb;

import android.content.Intent;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bsx implements Callable<r5b> {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f16610a;

    public bsx(Intent intent) {
        this.f16610a = intent;
    }

    @Override // java.util.concurrent.Callable
    public r5b call() throws Exception {
        byte[] bArr;
        String str;
        Intent intent = this.f16610a;
        if (intent == null) {
            return null;
        }
        long j = 0;
        try {
            j = intent.getLongExtra("msg_id", 0L);
        } catch (Exception e) {
            twx.b("PassByMsgIntentParser", "parserMsgId", e);
        }
        try {
            bArr = intent.getByteArrayExtra("msg_content");
        } catch (Exception e2) {
            twx.b("PassByMsgIntentParser", "parseMsgContent", e2);
            bArr = null;
        }
        Inflater inflater = new Inflater();
        inflater.setInput(bArr);
        byte[] bArr2 = new byte[256];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
        while (!inflater.finished()) {
            try {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
            } catch (DataFormatException unused) {
                inflater.end();
                str = null;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        }
        inflater.end();
        str = byteArrayOutputStream.toString("utf-8");
        if (str == null) {
            return null;
        }
        String optString = new JSONObject(str).optString("data");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        r5b r5bVar = new r5b();
        r5bVar.c(j);
        r5bVar.b(optString);
        return r5bVar;
    }
}
