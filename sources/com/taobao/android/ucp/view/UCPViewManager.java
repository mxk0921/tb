package com.taobao.android.ucp.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.l3e;
import tb.nbm;
import tb.t2o;
import tb.v82;
import tb.xad;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UCPViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Pair<String, String>, l3e> f9830a = new ConcurrentHashMap();
    public static l3e b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PopCenterShowReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(404750766);
        }

        public static /* synthetic */ Object ipc$super(PopCenterShowReceiver popCenterShowReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/view/UCPViewManager$PopCenterShowReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (UCPViewManager.a() && (jSONObject = (JSONObject) intent.getSerializableExtra("data")) != null) {
                xad xadVar = (xad) jSONObject.get("popOperation");
                if (xadVar == null || "low".equals(xadVar.o())) {
                    UCPViewManager.e(null);
                } else {
                    UCPViewManager.e(new nbm(xadVar));
                }
            }
        }
    }

    static {
        t2o.a(404750765);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return c();
    }

    public static boolean b(l3e l3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b73777f3", new Object[]{l3eVar})).booleanValue();
        }
        if (l3eVar == null || !l3eVar.isShowing() || System.currentTimeMillis() - l3eVar.b() >= 60000) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        return v82.h("enablePopCenterState", true);
    }

    public static l3e d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l3e) ipChange.ipc$dispatch("f6f33521", new Object[]{str, str2});
        }
        if (c() && b(b)) {
            return b;
        }
        return null;
    }

    public static void e(l3e l3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc6f792", new Object[]{l3eVar});
            return;
        }
        b = l3eVar;
        if (l3eVar != null) {
            for (l3e l3eVar2 : ((ConcurrentHashMap) f9830a).values()) {
                if (b(l3eVar2)) {
                    l3eVar2.a(l3eVar);
                }
            }
        }
    }
}
