package com.alibaba.ability.impl.http_request;

import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsHTTPRequestAbility;
import com.taobao.android.abilityidl.ability.HTTPRequestFailResult;
import com.taobao.android.abilityidl.ability.HTTPRequestResponseResult;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.ckf;
import tb.iih;
import tb.t2o;
import tb.uj3;
import tb.xbc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class HttpRequestAbility extends AbsHTTPRequestAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f1948a = "HttpRequestAbility";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements NetworkCallBack.FinishListener, NetworkCallBack.ResponseCodeListener, NetworkCallBack.ProgressListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f1949a;
        public final ByteArrayOutputStream b = new ByteArrayOutputStream();
        public Map<String, ? extends Object> c;
        public final xbc d;
        public final String e;

        static {
            t2o.a(109051907);
            t2o.a(607125966);
            t2o.a(607125969);
            t2o.a(607125968);
        }

        public a(xbc xbcVar, String str) {
            ckf.g(xbcVar, "callback");
            ckf.g(str, "dataType");
            this.d = xbcVar;
            this.e = str;
        }

        public final boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("183c4b0d", new Object[]{this, bArr})).booleanValue();
            }
            ckf.g(bArr, "data");
            try {
                Charset.forName("UTF-8").newDecoder().decode(ByteBuffer.wrap(bArr));
                return true;
            } catch (CharacterCodingException unused) {
                return false;
            }
        }

        public final void b(xbc xbcVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47a8de21", new Object[]{this, xbcVar, str, str2});
                return;
            }
            ckf.g(xbcVar, "callback");
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            HTTPRequestFailResult hTTPRequestFailResult = new HTTPRequestFailResult();
            hTTPRequestFailResult.errorCode = str;
            hTTPRequestFailResult.errorMsg = str2;
            xbcVar.d1(hTTPRequestFailResult);
            xbcVar.onClose();
            iih.INSTANCE.a("HttpRequestAbility.NetCallback", "[onFinished] send request fail! errorCode:".concat(str));
        }

        public final void c(xbc xbcVar, int i, String str, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5654be", new Object[]{this, xbcVar, new Integer(i), str, map});
                return;
            }
            ckf.g(xbcVar, "callback");
            ckf.g(str, AgooConstants.MESSAGE_BODY);
            HTTPRequestResponseResult hTTPRequestResponseResult = new HTTPRequestResponseResult();
            hTTPRequestResponseResult.status = Integer.valueOf(i);
            hTTPRequestResponseResult.body = str;
            hTTPRequestResponseResult.headers = map;
            xbcVar.H0(hTTPRequestResponseResult);
            xbcVar.onClose();
            iih iihVar = iih.INSTANCE;
            iihVar.a("HttpRequestAbility.NetCallback", "[onFinished] send request success! errorCode:" + i + ", headers:" + map);
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
                return;
            }
            ckf.g(progressEvent, "event");
            this.f1949a += progressEvent.getSize();
            this.b.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            String str;
            String str2;
            Base64.Encoder encoder;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            ckf.g(finishEvent, "event");
            int httpCode = finishEvent.getHttpCode();
            byte[] byteArray = this.b.toByteArray();
            ckf.f(byteArray, "outputStream.toByteArray()");
            int length = byteArray.length;
            Charset charset = uj3.UTF_8;
            String str3 = new String(byteArray, charset);
            iih iihVar = iih.INSTANCE;
            iihVar.a("HttpRequestAbility.NetCallback", "[onFinished] [1] event:" + finishEvent + ", totalSize: " + this.f1949a + "  ,bodySize:" + length + " ,bodyBytedata: " + str3);
            try {
                if (this.f1949a <= 0) {
                    str = "";
                } else if (httpCode == 200 || httpCode == 206) {
                    if (ckf.b(this.e, "BASE64")) {
                        encoder = Base64.getEncoder();
                        str2 = encoder.encodeToString(byteArray);
                        ckf.f(str2, "Base64.getEncoder().encodeToString(body)");
                        if (str2.length() == 0) {
                            b(this.d, "DECODE_ERROR", "BASE64 encode fail");
                            return;
                        }
                    } else if (!ckf.b(this.e, "UTF8")) {
                        b(this.d, "DECODE_ERROR", "unknown data type");
                        return;
                    } else if (!a(byteArray)) {
                        b(this.d, "DECODE_ERROR", "invalid UTF8 data");
                        return;
                    } else {
                        str2 = new String(byteArray, charset);
                    }
                    c(this.d, httpCode, str2, this.c);
                    return;
                } else if (httpCode < 0) {
                    b(this.d, "REQUEST_ERROR", "http request fail");
                    return;
                } else if (!a(byteArray)) {
                    b(this.d, "DECODE_ERROR", "data can not parse");
                    return;
                } else {
                    str = new String(byteArray, charset);
                }
                if (httpCode < 0) {
                    b(this.d, "REQUEST_ERROR", "http request fail");
                } else {
                    c(this.d, httpCode, str, this.c);
                }
            } catch (Throwable th) {
                iih iihVar2 = iih.INSTANCE;
                iihVar2.a("HttpRequestAbility.NetCallback", "send http request decode error:" + th);
                b(this.d, "REQUEST_ERROR", "http request fail");
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, ? extends List<String>> map, Object obj) {
            ArrayList arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            ckf.g(map, "header");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> list = (List) entry.getValue();
                if (key != null) {
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (String str : list) {
                            arrayList.add(str);
                        }
                    } else {
                        arrayList = null;
                    }
                    linkedHashMap.put(key, arrayList);
                }
            }
            this.c = linkedHashMap;
            iih iihVar = iih.INSTANCE;
            iihVar.a("HttpRequestAbility.NetCallback", "[onResponseCode] code:" + i);
            return false;
        }
    }

    static {
        t2o.a(109051906);
    }

    public static /* synthetic */ Object ipc$super(HttpRequestAbility httpRequestAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/http_request/HttpRequestAbility");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:7:0x002e, B:10:0x0034, B:15:0x003e, B:16:0x0040, B:20:0x0050, B:23:0x005b, B:25:0x0061, B:27:0x006b, B:28:0x0070, B:30:0x0076, B:32:0x007e, B:35:0x008c, B:39:0x009b, B:42:0x00a4, B:47:0x00b2, B:50:0x00b8, B:54:0x00c1, B:56:0x00c5, B:58:0x00cd, B:59:0x00d5, B:61:0x00db, B:63:0x00f1, B:64:0x0102, B:65:0x011a, B:67:0x012d, B:68:0x0135, B:70:0x013b, B:71:0x0153, B:73:0x0158, B:75:0x015c, B:76:0x0175, B:77:0x01b2), top: B:81:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:7:0x002e, B:10:0x0034, B:15:0x003e, B:16:0x0040, B:20:0x0050, B:23:0x005b, B:25:0x0061, B:27:0x006b, B:28:0x0070, B:30:0x0076, B:32:0x007e, B:35:0x008c, B:39:0x009b, B:42:0x00a4, B:47:0x00b2, B:50:0x00b8, B:54:0x00c1, B:56:0x00c5, B:58:0x00cd, B:59:0x00d5, B:61:0x00db, B:63:0x00f1, B:64:0x0102, B:65:0x011a, B:67:0x012d, B:68:0x0135, B:70:0x013b, B:71:0x0153, B:73:0x0158, B:75:0x015c, B:76:0x0175, B:77:0x01b2), top: B:81:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:7:0x002e, B:10:0x0034, B:15:0x003e, B:16:0x0040, B:20:0x0050, B:23:0x005b, B:25:0x0061, B:27:0x006b, B:28:0x0070, B:30:0x0076, B:32:0x007e, B:35:0x008c, B:39:0x009b, B:42:0x00a4, B:47:0x00b2, B:50:0x00b8, B:54:0x00c1, B:56:0x00c5, B:58:0x00cd, B:59:0x00d5, B:61:0x00db, B:63:0x00f1, B:64:0x0102, B:65:0x011a, B:67:0x012d, B:68:0x0135, B:70:0x013b, B:71:0x0153, B:73:0x0158, B:75:0x015c, B:76:0x0175, B:77:0x01b2), top: B:81:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:7:0x002e, B:10:0x0034, B:15:0x003e, B:16:0x0040, B:20:0x0050, B:23:0x005b, B:25:0x0061, B:27:0x006b, B:28:0x0070, B:30:0x0076, B:32:0x007e, B:35:0x008c, B:39:0x009b, B:42:0x00a4, B:47:0x00b2, B:50:0x00b8, B:54:0x00c1, B:56:0x00c5, B:58:0x00cd, B:59:0x00d5, B:61:0x00db, B:63:0x00f1, B:64:0x0102, B:65:0x011a, B:67:0x012d, B:68:0x0135, B:70:0x013b, B:71:0x0153, B:73:0x0158, B:75:0x015c, B:76:0x0175, B:77:0x01b2), top: B:81:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012d A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:7:0x002e, B:10:0x0034, B:15:0x003e, B:16:0x0040, B:20:0x0050, B:23:0x005b, B:25:0x0061, B:27:0x006b, B:28:0x0070, B:30:0x0076, B:32:0x007e, B:35:0x008c, B:39:0x009b, B:42:0x00a4, B:47:0x00b2, B:50:0x00b8, B:54:0x00c1, B:56:0x00c5, B:58:0x00cd, B:59:0x00d5, B:61:0x00db, B:63:0x00f1, B:64:0x0102, B:65:0x011a, B:67:0x012d, B:68:0x0135, B:70:0x013b, B:71:0x0153, B:73:0x0158, B:75:0x015c, B:76:0x0175, B:77:0x01b2), top: B:81:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0158 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:7:0x002e, B:10:0x0034, B:15:0x003e, B:16:0x0040, B:20:0x0050, B:23:0x005b, B:25:0x0061, B:27:0x006b, B:28:0x0070, B:30:0x0076, B:32:0x007e, B:35:0x008c, B:39:0x009b, B:42:0x00a4, B:47:0x00b2, B:50:0x00b8, B:54:0x00c1, B:56:0x00c5, B:58:0x00cd, B:59:0x00d5, B:61:0x00db, B:63:0x00f1, B:64:0x0102, B:65:0x011a, B:67:0x012d, B:68:0x0135, B:70:0x013b, B:71:0x0153, B:73:0x0158, B:75:0x015c, B:76:0x0175, B:77:0x01b2), top: B:81:0x002e }] */
    @Override // com.taobao.android.abilityidl.ability.AbsHTTPRequestAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void send(tb.kdb r12, tb.nqa r13, tb.xbc r14) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.http_request.HttpRequestAbility.send(tb.kdb, tb.nqa, tb.xbc):void");
    }
}
