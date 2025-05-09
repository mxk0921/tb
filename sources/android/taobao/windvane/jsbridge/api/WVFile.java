package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONObject;
import tb.itw;
import tb.kpw;
import tb.nsw;
import tb.opw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVFile extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long FILE_MAX_SIZE = 5242880;

    static {
        t2o.a(989856277);
    }

    private boolean canWriteFile(long j, String str, boolean z) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fd71b1c", new Object[]{this, new Long(j), str, new Boolean(z)})).booleanValue();
        }
        if (z) {
            j2 = j + str.length();
        } else {
            j2 = str.length();
        }
        if (j2 > FILE_MAX_SIZE) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(WVFile wVFile, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVFile");
    }

    public final void read(String str, WVCallBackContext wVCallBackContext) {
        String optString;
        String optString2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89f5164", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                optString = jSONObject.optString("fileName");
                optString2 = jSONObject.optString("share", "false");
                if (optString == null || optString.contains(File.separator)) {
                    throw new Exception();
                }
            } catch (Exception unused) {
                wVCallBackContext.error(new nsw("HY_PARAM_ERR"));
                return;
            }
        } else {
            optString = "";
            optString2 = optString;
        }
        String b = opw.e().b(false);
        if (b == null) {
            nsw nswVar = new nsw();
            nswVar.b("error", "GET_DIR_FAILED");
            wVCallBackContext.error(nswVar);
            return;
        }
        if (!"true".equalsIgnoreCase(optString2)) {
            String str3 = b + File.separator;
            str2 = str3 + itw.b(this.mWebView.getUrl());
        } else {
            str2 = (b + File.separator) + "wvShareFiles";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str2 + File.separator + optString));
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            String str4 = new String(bArr, "UTF-8");
            fileInputStream.close();
            nsw nswVar2 = new nsw();
            nswVar2.b("data", str4);
            wVCallBackContext.success(nswVar2);
        } catch (FileNotFoundException unused2) {
            nsw nswVar3 = new nsw();
            nswVar3.b("error", "FILE_NOT_FOUND");
            wVCallBackContext.error(nswVar3);
        } catch (Exception e) {
            nsw nswVar4 = new nsw();
            nswVar4.b("error", "READ_FILE_FAILED");
            wVCallBackContext.error(nswVar4);
            e.printStackTrace();
        }
    }

    public final void write(String str, WVCallBackContext wVCallBackContext) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b41006d", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                optString = jSONObject.optString("mode", "write");
                optString2 = jSONObject.optString("data");
                optString3 = jSONObject.optString("fileName");
                optString4 = jSONObject.optString("share", "false");
                if (optString == null || optString3 == null || optString3.contains(File.separator)) {
                    throw new Exception();
                }
            } catch (Exception unused) {
                nsw nswVar = new nsw();
                nswVar.b("error", "PARAMS_ERROR");
                wVCallBackContext.error(nswVar);
                return;
            }
        } else {
            optString = "";
            optString4 = optString;
            optString2 = optString4;
            optString3 = optString2;
        }
        String b = opw.e().b(false);
        if (b == null) {
            nsw nswVar2 = new nsw();
            nswVar2.b("error", "GET_DIR_FAILED");
            wVCallBackContext.error(nswVar2);
            return;
        }
        if (!"true".equalsIgnoreCase(optString4)) {
            String str3 = b + File.separator;
            str2 = str3 + itw.b(this.mWebView.getUrl());
        } else {
            str2 = (b + File.separator) + "wvShareFiles";
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2 + File.separator + optString3);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException unused2) {
                nsw nswVar3 = new nsw();
                nswVar3.b("error", "MAKE_FILE_FAILED");
                wVCallBackContext.error(nswVar3);
                return;
            }
        } else if ("write".equalsIgnoreCase(optString)) {
            nsw nswVar4 = new nsw();
            nswVar4.b("error", "FILE_EXIST");
            wVCallBackContext.error(nswVar4);
            return;
        }
        try {
            boolean equalsIgnoreCase = "append".equalsIgnoreCase(optString);
            if (!canWriteFile(file2.length(), optString2, equalsIgnoreCase)) {
                nsw nswVar5 = new nsw();
                nswVar5.b("error", "FILE_TOO_LARGE");
                wVCallBackContext.error(nswVar5);
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2, equalsIgnoreCase);
            fileOutputStream.write(optString2.getBytes());
            fileOutputStream.close();
            wVCallBackContext.success();
        } catch (Exception e) {
            nsw nswVar6 = new nsw();
            nswVar6.b("error", "WRITE_FILE_FAILED");
            wVCallBackContext.error(nswVar6);
            e.printStackTrace();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("read".equals(str)) {
            read(str2, wVCallBackContext);
        } else if (!"write".equals(str)) {
            return false;
        } else {
            write(str2, wVCallBackContext);
        }
        return true;
    }
}
