package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcStreamProcessorImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum ProcessTaskStats {
        E_STARTING,
        E_SUCCESS;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ProcessTaskStats processTaskStats, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/impl/TrtcStreamProcessorImpl$ProcessTaskStats");
        }

        public static ProcessTaskStats valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ProcessTaskStats) ipChange.ipc$dispatch("7356dba0", new Object[]{str});
            }
            return (ProcessTaskStats) Enum.valueOf(ProcessTaskStats.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum ProcessType {
        E_NONE,
        E_PUB,
        E_SUB;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ProcessType processType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/impl/TrtcStreamProcessorImpl$ProcessType");
        }

        public static ProcessType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ProcessType) ipChange.ipc$dispatch("10bcaa2", new Object[]{str});
            }
            return (ProcessType) Enum.valueOf(ProcessType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f13931a;
        public String b;
        public ProcessType c;
        public int d;
        public String e;

        static {
            t2o.a(395313586);
        }
    }

    static {
        t2o.a(395313583);
        t2o.a(395313399);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d18d4ec", new Object[]{this, aVar});
            return;
        }
        TrtcLog.j("StreamProcess", "update result: type: " + aVar.c + ", input id:" + aVar.f13931a + ", remote id:" + aVar.b + ", code: " + aVar.d + ", msg: " + aVar.e);
        throw null;
    }
}
