package com.taobao.trtc.signal;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.ArtcSignalChannelHandler;
import com.taobao.trtc.accs.TrtcAccsHandler;
import com.taobao.trtc.utils.TrtcLog;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import tb.omu;
import tb.pmu;
import tb.qmu;
import tb.t2o;
import tb.viu;
import tb.wiu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcSignalChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String c;

    /* renamed from: a  reason: collision with root package name */
    public static final String f13972a = "accs";
    public static final String b = TrtcAccsHandler.TRTC_ACCS_SERVICE;
    public static qmu d = null;
    public static pmu e = null;

    static {
        t2o.a(395313632);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b2572b", new Object[]{str, str2});
            return;
        }
        if (str.equals(f13972a)) {
            d = new wiu();
            e = new viu();
        }
        c = str2;
        TrtcAccsHandler.m(e);
    }

    public static void b(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b672c2", new Object[]{bArr, str});
        } else {
            nativeOnTrtcSignalRecv(new String(bArr));
        }
    }

    public static void c(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a6fad0", new Object[]{bArr, str});
            return;
        }
        TrtcLog.i("TrtcSignalChannel", "<<<<<< recvSignalData, len: " + bArr.length);
        if (!omu.n(bArr, str)) {
            b(bArr, str);
        }
    }

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56eb4ddc", new Object[]{new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcSignalChannel", "set is grtn: " + z);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec0ab50", new Object[0]);
            return;
        }
        d = null;
        e = null;
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b37585c0", new Object[]{str});
            return;
        }
        c = str;
        TrtcLog.j("TrtcSignalChannel", "update local user id: " + str);
    }

    private static native void nativeOnTrtcSignalRecv(String str);

    public static String sendSignalData(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f4d0eee", new Object[]{bArr, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("userId", c);
        hashMap.put("serviceId", b);
        qmu qmuVar = d;
        if (qmuVar == null) {
            return "default";
        }
        String a2 = ((wiu) qmuVar).a(bArr, hashMap);
        TrtcLog.i("TrtcSignalChannel", ">>>>>> sendSignalData, channelId: " + ((String) hashMap.get("channelId")) + ", deviceId: " + ((String) hashMap.get("deviceId")) + ", sequenceId: " + ((String) hashMap.get(ArtcSignalChannelHandler.ArgsKey.KEY_SEQUENCE_ID)) + ", commandId: " + ((String) hashMap.get(ArtcSignalChannelHandler.ArgsKey.KEY_TYPE_ID)) + ", userId: " + ((String) hashMap.get("userId")) + ", dataId: " + a2);
        return a2;
    }

    public static String sendSignalData(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("95fc050b", new Object[]{str, str2}) : sendSignalData(str.getBytes(StandardCharsets.UTF_8), str2);
    }
}
