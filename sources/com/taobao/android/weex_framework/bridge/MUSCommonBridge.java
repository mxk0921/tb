package com.taobao.android.weex_framework.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bxh;
import tb.dxh;
import tb.gpc;
import tb.r3x;
import tb.t2o;
import tb.vvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSCommonBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements gpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9968a;

        public a(long j) {
            this.f9968a = j;
        }

        @Override // tb.gpc.a
        public void a(dxh dxhVar) {
            byte[] bArr;
            Map<String, List<String>> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebddd68c", new Object[]{this, dxhVar});
                return;
            }
            HashMap hashMap = new HashMap();
            if (!(dxhVar == null || (map = dxhVar.f) == null)) {
                for (String str : ((HashMap) map).keySet()) {
                    List list = (List) ((HashMap) dxhVar.f).get(str);
                    if (list != null) {
                        hashMap.put(str, list.get(0));
                    }
                }
            }
            int parseInt = Integer.parseInt(dxhVar.f18133a);
            if (parseInt == 200) {
                dxhVar.d = "";
            }
            byte[] bArr2 = dxhVar.b;
            if (bArr2 == null) {
                bArr = new byte[1];
            } else {
                bArr = bArr2;
            }
            MUSCommonNativeBridge.a(bArr, parseInt, dxhVar.d, hashMap, this.f9968a);
        }

        @Override // tb.gpc.a
        public void onHeadersReceived(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6683fc51", new Object[]{this, new Integer(i), map});
            }
        }

        @Override // tb.gpc.a
        public void onHttpResponseProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c1a5c7", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.gpc.a
        public void onHttpStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5005ca2", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(982516056);
    }

    public static boolean isDebugApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da19bb52", new Object[0])).booleanValue();
        }
        return vvh.m();
    }

    public static void sendRequest(String str, Map<String, String> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8351117", new Object[]{str, map, new Long(j)});
            return;
        }
        a aVar = new a(j);
        bxh bxhVar = new bxh();
        bxhVar.c = str;
        ((ConcurrentHashMap) bxhVar.b).putAll(map);
        bxhVar.d = "GET";
        r3x.f().a(bxhVar, aVar);
    }
}
