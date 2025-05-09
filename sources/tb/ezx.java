package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.UploaderManager;
import com.uploader.implement.a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ezx implements i5y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18908a;
    public final kxx b;
    public s7y c;
    public final long d;
    public final a.b.C0850b e;
    public final int f = hashCode();
    public final v8y g;
    public final String h;
    public final a i;

    public ezx(a aVar, kxx kxxVar, String str, long j, long j2, boolean z) throws Exception {
        byte[] bArr;
        this.i = aVar;
        this.b = kxxVar;
        this.f18908a = z;
        a.b.C0850b j3 = aVar.f14547a.j();
        this.e = j3;
        if (j3 != null) {
            a.b bVar = aVar.f14547a;
            this.h = (String) bVar.a().first;
            this.d = bVar.m();
            String b = b(j, j2, str);
            File file = kxxVar.b;
            long j4 = kxxVar.j;
            byte[] bytes = b.getBytes("UTF-8");
            if (j < kxxVar.f) {
                bArr = "\r\n\r\n".getBytes();
            } else {
                bArr = null;
            }
            this.g = new v8y(file, j4, j, j2, null, bytes, bArr, kxxVar.k);
            return;
        }
        throw new RuntimeException("currentUploadTarget is null");
    }

    @Override // tb.i5y
    public /* synthetic */ wtx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (wtx) ipChange.ipc$dispatch("7798d648", new Object[]{this}) : d();
    }

    @Override // tb.i5y
    public v8y b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v8y) ipChange.ipc$dispatch("ffc8a2a1", new Object[]{this}) : this.g;
    }

    public s7y d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s7y) ipChange.ipc$dispatch("6efbcc2e", new Object[]{this});
        }
        s7y s7yVar = this.c;
        if (s7yVar != null) {
            return s7yVar;
        }
        a.b.C0850b bVar = this.e;
        s7y s7yVar2 = new s7y(bVar.f14550a, bVar.b, true, bVar.d, bVar.c);
        this.c = s7yVar2;
        return s7yVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        r15 = r20 - r12.available();
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0052 A[SYNTHETIC] */
    @Override // tb.i5y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<tb.f6y, java.lang.Integer> a(java.util.Map<java.lang.String, java.lang.String> r17, byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ezx.a(java.util.Map, byte[], int, int):android.util.Pair");
    }

    public final String b(long j, long j2, String str) throws Exception {
        StringBuilder sb;
        String str2;
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f7d642e", new Object[]{this, new Long(j), new Long(j2), str});
        }
        if (this.f18908a) {
            String str3 = this.i.b.a().b;
            String utdid = this.i.b.getUtdid();
            String appVersion = this.i.b.getAppVersion();
            String valueOf = String.valueOf(this.d + (System.currentTimeMillis() / 1000));
            String a2 = bux.a();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("host", "arup.alibaba.com");
            hashMap2.put("content-type", "application/offset+octet-stream");
            hashMap2.put("x-arup-version", "2.3.4");
            hashMap2.put("x-arup-device-id", utdid);
            hashMap2.put("x-arup-appkey", str3);
            hashMap2.put("x-arup-appversion", appVersion);
            hashMap2.put("x-arup-file-count", Integer.toString(1));
            String userId = this.i.b.getUserId();
            if (!TextUtils.isEmpty(userId)) {
                hashMap2.put("x-arup-userinfo", userId);
            }
            hashMap2.put("x-arup-timestamp", valueOf);
            if ("patch".equals(str)) {
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append(this.b.d);
                sb2.append("=");
                sb2.append(j);
                str2 = "application/offset+octet-stream";
                hashMap2.put("x-arup-req-offset", sb2.toString());
                sb2.setLength(0);
                sb2.append(this.b.d);
                sb2.append("=");
                sb2.append(String.valueOf(this.b.f));
                hashMap = hashMap2;
                hashMap.put("x-arup-req-offset-file-length", sb2.toString());
            } else {
                hashMap = hashMap2;
                str2 = "application/offset+octet-stream";
            }
            StringBuilder sb3 = new StringBuilder(128);
            sb3.append(this.b.e);
            sb3.append("&");
            sb3.append(this.h);
            sb3.append("&");
            sb3.append(str3);
            sb3.append("&");
            sb3.append(appVersion);
            sb3.append("&");
            sb3.append(utdid);
            sb3.append("&");
            sb3.append(valueOf);
            String signature = this.i.b.signature(sb3.toString());
            if (TextUtils.isEmpty(signature)) {
                if (rtx.d(16)) {
                    rtx.a(16, "FileUploadActionRequest", this.f + " compute upload sign failed.");
                }
                throw new Exception("compute api sign failed.");
            }
            hashMap.put("x-arup-sign", signature);
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put("x-arup-network-type", a2);
            }
            hashMap.put("x-arup-conn-seq-no", fzx.c());
            sb = new StringBuilder(128);
            sb.append(str);
            sb.append(" /f/");
            sb.append(this.b.e);
            sb.append("/");
            sb.append(this.h);
            sb.append(" HTTP/1.1\r\n");
            for (Map.Entry entry : hashMap.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(":");
                sb.append(fzx.f((String) entry.getValue()));
                sb.append("\r\n");
            }
            sb.append("\r\n");
        } else {
            str2 = "application/offset+octet-stream";
            sb = null;
        }
        if (j < this.b.f) {
            if (sb == null) {
                sb = new StringBuilder(128);
            }
            sb.append("--");
            sb.append(fzx.f(this.b.d));
            sb.append("--\r\n");
            Map<String, String> map = this.b.h;
            if (map != null && map.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry2 : this.b.h.entrySet()) {
                    String key = entry2.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        jSONObject.put(key, entry2.getValue());
                    }
                }
                sb.append("x-arup-meta:");
                sb.append(fzx.f(jSONObject.toString()));
                sb.append("\r\n");
            }
            sb.append("x-arup-file-md5:");
            sb.append(fzx.f(this.b.g));
            sb.append("\r\nx-arup-file-crc64:");
            sb.append(fzx.f(this.b.l));
            sb.append("\r\nx-arup-file-name:");
            sb.append(fzx.f(this.b.c));
            sb.append("\r\nx-arup-range:");
            sb.append(j);
            sb.append(",");
            sb.append(j2);
            sb.append("\r\nx-arup-file-length:");
            sb.append(String.valueOf(this.b.f));
            sb.append("\r\nx-arup-mime-type:");
            if (!TextUtils.isEmpty(this.b.m)) {
                str2 = this.b.m;
            }
            sb.append(fzx.f(str2));
            sb.append("\r\nx-arup-task-type:");
            sb.append(this.b.n);
            sb.append("\r\nx-arup-concur-task-count:");
            sb.append(UploaderManager.b());
            sb.append("\r\nx-arup-phase-index:");
            sb.append(this.b.p);
            sb.append("\r\n\r\n");
        }
        if (sb == null) {
            return null;
        }
        if (rtx.d(2)) {
            String sb4 = sb.toString();
            String str4 = "";
            int i = 0;
            while (true) {
                int indexOf = sb4.indexOf("\r\n", i);
                if (indexOf == -1) {
                    break;
                }
                str4 = str4 + sb4.substring(i, indexOf) + "\n";
                i = indexOf + 2;
            }
            rtx.a(2, "FileUploadActionRequest", this.f + " create upload header:" + str4);
        }
        return sb.toString();
    }

    public final f6y c(Map<String, String> map, byte[] bArr, int i, int i2) {
        utx utxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f6y) ipChange.ipc$dispatch("b7b3029", new Object[]{this, map, bArr, new Integer(i), new Integer(i2)});
        }
        Map<String, String> hashMap = map == null ? new HashMap<>() : map;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i, i2)));
        hashMap.put("divided_length", Integer.toString(i2));
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    } else if (!TextUtils.isEmpty(readLine)) {
                        int length = readLine.length();
                        int indexOf = readLine.indexOf(":");
                        if (indexOf > 1) {
                            String substring = readLine.substring(0, indexOf);
                            if (indexOf < length) {
                                hashMap.put(substring.trim(), fzx.d(readLine.substring(indexOf + 1, length)));
                            }
                        } else {
                            int indexOf2 = readLine.indexOf(" ");
                            if (indexOf2 > 1) {
                                String substring2 = readLine.substring(0, indexOf2);
                                if (indexOf2 < length) {
                                    String substring3 = readLine.substring(indexOf2 + 1, length);
                                    hashMap.put("response_code", substring2);
                                    hashMap.put("response_msg", substring3);
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    if (rtx.d(16)) {
                        rtx.b(16, "FileUploadActionRequest", this.f + " decode response header failed", e);
                    }
                    try {
                        bufferedReader.close();
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        if (hashMap.get("x-arup-process") != null) {
            utxVar = new utx(2, hashMap);
        } else if (hashMap.get("x-arup-offset") != null) {
            utxVar = new utx(3, hashMap);
        } else if (hashMap.get("x-arup-file-status") != null) {
            utxVar = new utx(4, hashMap);
        } else if (hashMap.get("x-arup-error-code") != null) {
            utxVar = new utx(5, hashMap);
        } else if (hashMap.get("x-arup-session-status") == null) {
            return null;
        } else {
            utxVar = new utx(6, hashMap);
        }
        hashMap.put("divided_length", Integer.toString(i2));
        if (rtx.d(4)) {
            rtx.a(4, "FileUploadActionRequest", this.f + " decode actionResponse header:" + hashMap.toString());
        }
        return utxVar;
    }
}
