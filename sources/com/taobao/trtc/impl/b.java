package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.utils.TrtcLog;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f13936a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public TrtcInnerDefines.CallState f13937a = TrtcInnerDefines.CallState.E_CALL_IDLE;
        public TrtcDefines.TrtcUserRole b = TrtcDefines.TrtcUserRole.E_ROLE_NONE;

        static {
            t2o.a(395313494);
        }
    }

    static {
        t2o.a(395313493);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae700f4", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcCall", "clear call node, " + this.f13936a);
        ((HashMap) this.f13936a).clear();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8d02fc", new Object[]{this, str});
            return;
        }
        TrtcLog.j("TrtcCall", "remove call node, remote id: " + str);
        ((HashMap) this.f13936a).remove(str);
    }

    public int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbd8f9b", new Object[]{this, str})).intValue();
        }
        TrtcLog.j("TrtcCall", "getUserRole userId: " + str);
        a aVar = (a) ((HashMap) this.f13936a).get(str);
        if (aVar != null) {
            return aVar.b.ordinal();
        }
        return 0;
    }

    public a e(String str, TrtcDefines.TrtcUserRole trtcUserRole) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("92eb4664", new Object[]{this, str, trtcUserRole});
        }
        if (((HashMap) this.f13936a).get(str) != null) {
            TrtcLog.i("TrtcCall", "call node exist, uid: " + str);
            return null;
        }
        TrtcLog.j("TrtcCall", "new call node, id: " + str);
        a aVar = new a();
        aVar.b = trtcUserRole;
        ((HashMap) this.f13936a).put(str, aVar);
        return aVar;
    }

    public void f(String str, TrtcInnerDefines.CallState callState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9764482a", new Object[]{this, str, callState});
            return;
        }
        a aVar = (a) ((HashMap) this.f13936a).get(str);
        if (aVar != null) {
            TrtcLog.j("TrtcCall", "update call node state " + aVar.f13937a + " -> " + callState);
            aVar.f13937a = callState;
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c46dc2", new Object[]{this, str})).booleanValue();
        }
        TrtcLog.j("TrtcCall", "isInCall: " + str);
        a aVar = (a) ((HashMap) this.f13936a).get(str);
        return aVar != null && aVar.f13937a == TrtcInnerDefines.CallState.E_CALL_SETUP;
    }
}
