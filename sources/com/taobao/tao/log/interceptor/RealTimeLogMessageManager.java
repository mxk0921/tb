package com.taobao.tao.log.interceptor;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.interceptor.RealTimeLogMessageManager;
import tb.api;
import tb.ckn;
import tb.e6s;
import tb.j5s;
import tb.nqi;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RealTimeLogMessageManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static nqi f12493a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class ServerMessage {
        public int command;
        public String data;

        static {
            t2o.a(767557663);
        }
    }

    static {
        t2o.a(767557662);
    }

    public static void c(ServerMessage serverMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e655a4c8", new Object[]{serverMessage});
            return;
        }
        int i = serverMessage.command;
        if (i == 4) {
            i(ckn.c(j5s.j().h(), serverMessage.data));
        } else if (i == 7) {
            k();
        }
    }

    public static /* synthetic */ void f(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5315073", new Object[]{new Integer(i), str});
            return;
        }
        try {
            ServerMessage serverMessage = new ServerMessage();
            serverMessage.command = i;
            serverMessage.data = str;
            api apiVar = new api();
            apiVar.f15918a = j5s.j().h();
            apiVar.c = j5s.j().g;
            apiVar.b = JSON.toJSONString(serverMessage);
            f12493a.c(apiVar);
        } catch (Exception e) {
            Log.e("RealTimeMessageManager", "sendCommand exception", e);
        }
    }

    public static void g(final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871df4b1", new Object[]{bArr});
        } else if (bArr != null) {
            e6s.d().c(new Runnable() { // from class: tb.dkn
                @Override // java.lang.Runnable
                public final void run() {
                    RealTimeLogMessageManager.e(bArr);
                }
            });
        }
    }

    public static void h(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6774a423", new Object[]{new Integer(i), str});
        } else if (f12493a != null) {
            String.format("Send {command: %d, data: %S} to server", Integer.valueOf(i), str);
            e6s.d().c(new Runnable() { // from class: tb.ekn
                @Override // java.lang.Runnable
                public final void run() {
                    RealTimeLogMessageManager.f(i, str);
                }
            });
        }
    }

    public static void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84f477d", new Object[]{new Integer(i)});
            return;
        }
        new StringBuilder("Send Config ACK, reason: ").append(i);
        h(5, String.valueOf(i));
    }

    public static void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656724a7", new Object[]{new Integer(i)});
            return;
        }
        new StringBuilder("Send real time stop, reason: ").append(i);
        h(8, String.valueOf(i));
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d85ed21", new Object[0]);
            return;
        }
        new StringBuilder("Send Status: ").append(ckn.c);
        h(8, String.valueOf(ckn.c));
    }

    public static void l(nqi nqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ecb087", new Object[]{nqiVar});
        } else if (f12493a == null) {
            f12493a = nqiVar;
        }
    }

    public static /* synthetic */ void e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3021ba", new Object[]{bArr});
            return;
        }
        try {
            byte[] decode = Base64.decode(bArr, 0);
            if (decode == null) {
                Log.e("RealTimeMessageManager", "Failed to decode data");
            } else if (decode.length != 0) {
                ServerMessage serverMessage = (ServerMessage) JSON.parseObject(decode, ServerMessage.class, new Feature[0]);
                if (serverMessage == null) {
                    Log.e("RealTimeMessageManager", "Failed to parse date to ServerMessage: ".concat(new String(decode)));
                } else {
                    c(serverMessage);
                }
            }
        } catch (Exception e) {
            Log.e("RealTimeMessageManager", "handleServerMessage error.", e);
        }
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("609fd215", new Object[]{context})).booleanValue();
        }
        try {
        } catch (Exception e) {
            Log.e("RealTimeMessageManager", "Init messenger exception", e);
        }
        if (f12493a != null) {
            api apiVar = new api();
            apiVar.f15918a = context;
            apiVar.c = j5s.j().g;
            f12493a.b(apiVar);
            return true;
        }
        Log.e("RealTimeMessageManager", "messageSender is null");
        return false;
    }
}
