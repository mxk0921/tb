package com.taobao.android.riverlogger.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.inspector.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import tb.acf;
import tb.bcf;
import tb.ccf;
import tb.euj;
import tb.g8q;
import tb.kuj;
import tb.t2o;
import tb.ti3;
import tb.x24;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class InspectorNativeAgent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements x24 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9298a;

        public a(long j) {
            this.f9298a = j;
        }

        @Override // tb.x24
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81eeca1f", new Object[]{this, jSONObject});
            } else {
                InspectorNativeAgent.access$000(this.f9298a, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9299a;

        public b(long j) {
            this.f9299a = j;
        }

        @Override // com.taobao.android.riverlogger.inspector.b.a
        public void a(int i, com.taobao.android.riverlogger.inspector.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6208b6a4", new Object[]{this, new Integer(i), bVar});
                return;
            }
            HashMap hashMap = new HashMap();
            Map<String, List<String>> map = bVar.e;
            if (map != null) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    List<String> value = entry.getValue();
                    if (value.size() > 0) {
                        hashMap.put(entry.getKey(), value.get(0));
                    }
                }
            }
            InspectorNativeAgent.access$100(this.f9299a, bVar.d, hashMap, bVar.a(), bVar.f, bVar.g);
        }
    }

    static {
        t2o.a(649068581);
    }

    public static /* synthetic */ void access$000(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6061b1", new Object[]{new Long(j), jSONObject});
        } else {
            onMessageCallbackNative(j, jSONObject);
        }
    }

    public static /* synthetic */ void access$100(long j, int i, Map map, byte[] bArr, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17cfc578", new Object[]{new Long(j), new Integer(i), map, bArr, new Integer(i2), str});
        } else {
            callbackResponseNative(j, i, map, bArr, i2, str);
        }
    }

    public static void callbackMethod(int i, String str, JSONObject jSONObject, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c42ee5", new Object[]{new Integer(i), str, jSONObject, new Integer(i2)});
            return;
        }
        com.taobao.android.riverlogger.inspector.a c = ti3.c();
        if (c != null) {
            c.h(i, str, jSONObject, MessagePriority.valueOf(i2));
        }
    }

    private static native void callbackResponseNative(long j, int i, Map<String, String> map, byte[] bArr, int i2, String str);

    public static void closeSession(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb9c69", new Object[]{new Long(j), str});
            return;
        }
        g8q.a();
        closeSessionNative(j, str);
    }

    private static native void closeSessionNative(long j, String str);

    public static void connectionChanged(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e1cbdb", new Object[]{obj, new Boolean(z)});
        } else {
            ((acf) obj).b(z);
        }
    }

    public static long createSession(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5b19493", new Object[]{str, str2, str3})).longValue();
        }
        return createSessionNative(str, str2, str3);
    }

    private static native long createSessionNative(String str, String str2, String str3);

    public static JSONObject getAllSessionInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("89f3cdee", new Object[0]);
        }
        g8q.a();
        return getAllSessionInfoNative();
    }

    private static native JSONObject getAllSessionInfoNative();

    public static JSONObject getClientInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("40c69604", new Object[0]);
        }
        g8q.a();
        return getClientInfoNative();
    }

    private static native JSONObject getClientInfoNative();

    public static Iterator<Map.Entry<String, ccf>> getPlatformCommands(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("6fe4c983", new Object[]{obj});
        }
        return ((acf) obj).d().entrySet().iterator();
    }

    public static void handleCommand(String str, int i, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0cb5825", new Object[]{str, new Integer(i), str2, jSONObject});
            return;
        }
        g8q.a();
        ccf ccfVar = (ccf) handleCommandNative(str, i, str2, jSONObject);
        if (ccfVar != null) {
            ccfVar.a(jSONObject, new bcf(str, i, str2, jSONObject));
        }
    }

    private static native Object handleCommandNative(String str, int i, String str2, JSONObject jSONObject);

    public static void logAddEntry(String str, RVLLevel rVLLevel, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52d159b", new Object[]{str, rVLLevel, str2, jSONObject});
            return;
        }
        g8q.a();
        logAddEntryNative(str, rVLLevel.value, str2, jSONObject);
    }

    private static native void logAddEntryNative(String str, int i, String str2, JSONObject jSONObject);

    public static void networkDataReceived(String str, String str2, byte[] bArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e09049", new Object[]{str, str2, bArr, new Long(j)});
            return;
        }
        g8q.a();
        networkDataReceivedNative(str, str2, bArr, j);
    }

    private static native void networkDataReceivedNative(String str, String str2, byte[] bArr, long j);

    public static void networkLoadingFailed(String str, String str2, String str3, String str4, JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b513f80", new Object[]{str, str2, str3, str4, jSONObject, new Long(j)});
            return;
        }
        g8q.a();
        networkLoadingFailedNative(str, str2, str3, str4, jSONObject, j);
    }

    private static native void networkLoadingFailedNative(String str, String str2, String str3, String str4, JSONObject jSONObject, long j);

    public static void networkLoadingFinished(String str, String str2, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ef613c", new Object[]{str, str2, new Integer(i), new Long(j)});
            return;
        }
        g8q.a();
        networkLoadingFinishedNative(str, str2, i, j);
    }

    private static native void networkLoadingFinishedNative(String str, String str2, int i, long j);

    public static void networkRedirectResponseReceived(String str, String str2, kuj kujVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46833a85", new Object[]{str, str2, kujVar});
            return;
        }
        g8q.a();
        networkResponseReceivedNative(str, str2, true, null, kujVar.f22931a, kujVar.b, kujVar.c, kujVar.d, 0L, 0L, false, kujVar.e);
    }

    public static void networkRequestServedFromCache(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d313bb9d", new Object[]{str, str2});
            return;
        }
        g8q.a();
        networkRequestServedFromCacheNative(str, str2);
    }

    private static native void networkRequestServedFromCacheNative(String str, String str2);

    public static void networkRequestWillBeSent(String str, String str2, String str3, JSONObject jSONObject, euj eujVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557b4f7", new Object[]{str, str2, str3, jSONObject, eujVar});
            return;
        }
        g8q.a();
        networkRequestWillBeSentNative(str, str2, str3, eujVar.f18824a, eujVar.b, eujVar.c, eujVar.d, 0L, 0L, jSONObject, null);
    }

    private static native void networkRequestWillBeSentNative(String str, String str2, String str3, String str4, String str5, Map<String, String> map, byte[] bArr, long j, long j2, JSONObject jSONObject, JSONObject jSONObject2);

    public static void networkResponseReceived(String str, String str2, String str3, kuj kujVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d86b813", new Object[]{str, str2, str3, kujVar});
            return;
        }
        g8q.a();
        networkResponseReceivedNative(str, str2, false, str3, kujVar.f22931a, kujVar.b, kujVar.c, kujVar.d, 0L, 0L, false, kujVar.e);
    }

    private static native void networkResponseReceivedNative(String str, String str2, boolean z, String str3, String str4, int i, Map<String, String> map, boolean z2, long j, long j2, boolean z3, JSONObject jSONObject);

    public static void networkSetLoader(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73435bb6", new Object[]{str, str2, str3, str4});
            return;
        }
        g8q.a();
        networkSetLoaderNative(str, str2, str3, str4);
    }

    private static native void networkSetLoaderNative(String str, String str2, String str3, String str4);

    private static native void onMessageCallbackNative(long j, JSONObject jSONObject);

    public static void openSession(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bc093b", new Object[]{new Long(j), str});
            return;
        }
        g8q.a();
        openSessionNative(j, str);
    }

    private static native void openSessionNative(long j, String str);

    public static void registerAgent(acf acfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c71496", new Object[]{acfVar, str});
            return;
        }
        g8q.a();
        registerAgentNative(acfVar, str);
    }

    private static native void registerAgentNative(Object obj, String str);

    public static void registerInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ffbb0c", new Object[]{str, str2});
            return;
        }
        g8q.a();
        registerInfoNative(str, str2);
    }

    private static native void registerInfoNative(String str, String str2);

    private static native void releaseMessageCallbackNative(long j);

    public static void sendMessage(String str, String str2, JSONObject jSONObject, int i, long j) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f27ea5", new Object[]{str, str2, jSONObject, new Integer(i), new Long(j)});
            return;
        }
        com.taobao.android.riverlogger.inspector.a c = ti3.c();
        if (c != null) {
            if (j != 0) {
                aVar = new a(j);
            } else {
                aVar = null;
            }
            c.x(str, str2, jSONObject, MessagePriority.valueOf(i), aVar);
        } else if (j != 0) {
            releaseMessageCallbackNative(j);
        }
    }

    public static void sendRequest(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee2a88c", new Object[]{str, new Long(j)});
        } else {
            com.taobao.android.riverlogger.inspector.b.c(str, new b(j));
        }
    }

    public static void sessionClosed(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec254f", new Object[]{obj, str});
        } else {
            ((acf) obj).c(str);
        }
    }

    public static void sessionOpened(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9868b4c", new Object[]{obj, str});
        } else {
            ((acf) obj).a(str);
        }
    }

    public static void setConnected(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1250cce", new Object[]{new Boolean(z), new Boolean(z2)});
            return;
        }
        g8q.a();
        setConnectedNative(z, z2);
    }

    private static native void setConnectedNative(boolean z, boolean z2);

    public static void updateEnabled(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b1a20", new Object[]{set});
            return;
        }
        g8q.a();
        updateEnabledNative(set);
    }

    private static native void updateEnabledNative(Set<String> set);

    public static void updatePlugins(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2482b1b2", new Object[]{str, str2});
            return;
        }
        g8q.a();
        updatePluginsNative(str, str2);
    }

    private static native void updatePluginsNative(String str, String str2);

    public static void updateSessionInfo(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9b1836", new Object[]{new Long(j), str, str2});
            return;
        }
        g8q.a();
        updateSessionInfoNative(j, str, str2);
    }

    private static native void updateSessionInfoNative(long j, String str, String str2);
}
