package com.taobao.kmp.nexus.arch.openArch.service.message.context;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.powermsg.OpenArchPMBizCode;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.g1a;
import tb.mhr;
import tb.nzf;
import tb.t2o;
import tb.uhc;
import tb.v4s;
import tb.xhv;
import tb.z9u;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 O2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001PB}\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\"\b\u0002\u0010\u0012\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R<\u0010\u0012\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R$\u0010;\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001e\u001a\u0004\b<\u0010 \"\u0004\b=\u0010\"R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010\u0017\"\u0004\bH\u0010IR\"\u0010J\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010\u001c\"\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchHeartBeatContext;", "Ltb/nzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "", "apiName", v4s.PARAM_SESSION_ID, "topic", z9u.KEY_TAOKE_BIZSCENE, "", "", "liveRoomParams", "", "appearanceStatus", "Lkotlin/Function1;", "", "Ltb/xhv;", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/recordCurrentStatusCallback;", "recordCurrentStatusAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ltb/g1a;)V", "", "loadEnableHeartBeatConfig$nexus_release", "()Z", "loadEnableHeartBeatConfig", "loadEnableStopReportSwitch$nexus_release", "loadEnableStopReportSwitch", "loadHeartBeatIntervalConfig$nexus_release", "()I", "loadHeartBeatIntervalConfig", "Ljava/lang/String;", "getApiName", "()Ljava/lang/String;", "setApiName", "(Ljava/lang/String;)V", "getSessionID", "setSessionID", "getTopic", "setTopic", "getBizScene", "setBizScene", "Ljava/util/Map;", "getLiveRoomParams", "()Ljava/util/Map;", "setLiveRoomParams", "(Ljava/util/Map;)V", "Ljava/lang/Integer;", "getAppearanceStatus", "()Ljava/lang/Integer;", "setAppearanceStatus", "(Ljava/lang/Integer;)V", "Ltb/g1a;", "getRecordCurrentStatusAction", "()Ltb/g1a;", "setRecordCurrentStatusAction", "(Ltb/g1a;)V", "apiVersion", "getApiVersion", "setApiVersion", "uuid", "getUuid", "setUuid", "Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;", "bizCode", "Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;", "getBizCode", "()Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;", "setBizCode", "(Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;)V", "stopHeartBeatWhenBackground", "Z", "getStopHeartBeatWhenBackground", "setStopHeartBeatWhenBackground", "(Z)V", Constants.Name.INTERVAL, TLogTracker.LEVEL_INFO, "getInterval", "setInterval", "(I)V", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchHeartBeatContext implements nzf, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String apiName;
    private String apiVersion;
    private Integer appearanceStatus;
    private OpenArchPMBizCode bizCode;
    private String bizScene;
    private int interval;
    private Map<String, ? extends Object> liveRoomParams;
    private g1a<? super List<String>, xhv> recordCurrentStatusAction;
    private String sessionID;
    private boolean stopHeartBeatWhenBackground;
    private String topic;
    private String uuid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536555);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final OpenArchHeartBeatContext a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OpenArchHeartBeatContext) ipChange.ipc$dispatch("29d9e283", new Object[]{this, str});
            }
            return new OpenArchHeartBeatContext("mtop.taobao.content.log.live.heartbeat.report", null, str, null, null, null, null, 122, null);
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536554);
        t2o.a(1029701651);
    }

    public OpenArchHeartBeatContext() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return this.apiName;
    }

    public final String getApiVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return this.apiVersion;
    }

    public final Integer getAppearanceStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2ecafbda", new Object[]{this});
        }
        return this.appearanceStatus;
    }

    public final OpenArchPMBizCode getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchPMBizCode) ipChange.ipc$dispatch("204f1dde", new Object[]{this});
        }
        return this.bizCode;
    }

    public final String getBizScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e69425aa", new Object[]{this});
        }
        return this.bizScene;
    }

    public final int getInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34e1135", new Object[]{this})).intValue();
        }
        return this.interval;
    }

    public final Map<String, Object> getLiveRoomParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("76102cff", new Object[]{this});
        }
        return this.liveRoomParams;
    }

    public final g1a<List<String>, xhv> getRecordCurrentStatusAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("851f549b", new Object[]{this});
        }
        return this.recordCurrentStatusAction;
    }

    public final String getSessionID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ed78a5e", new Object[]{this});
        }
        return this.sessionID;
    }

    public final boolean getStopHeartBeatWhenBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8a0db37", new Object[]{this})).booleanValue();
        }
        return this.stopHeartBeatWhenBackground;
    }

    public final String getTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.topic;
    }

    @Override // tb.nzf
    public String getUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return this.uuid;
    }

    public nzf keepObj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzf) ipChange.ipc$dispatch("f9044030", new Object[]{this});
        }
        return nzf.a.a(this);
    }

    public final int loadHeartBeatIntervalConfig$nexus_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81fb18ba", new Object[]{this})).intValue();
        }
        return mhr.e0().getInt("liveMessageHeartbeatInterval", 5);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            nzf.a.b(this);
        }
    }

    public final void setApiName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26589b54", new Object[]{this, str});
        } else {
            this.apiName = str;
        }
    }

    public final void setApiVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4201f1", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.apiVersion = str;
    }

    public final void setAppearanceStatus(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9bc5198", new Object[]{this, num});
        } else {
            this.appearanceStatus = num;
        }
    }

    public final void setBizCode(OpenArchPMBizCode openArchPMBizCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2523bf8", new Object[]{this, openArchPMBizCode});
            return;
        }
        ckf.g(openArchPMBizCode, "<set-?>");
        this.bizCode = openArchPMBizCode;
    }

    public final void setBizScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76cdea0c", new Object[]{this, str});
        } else {
            this.bizScene = str;
        }
    }

    public final void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
        } else {
            this.interval = i;
        }
    }

    public final void setLiveRoomParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6adbe6f", new Object[]{this, map});
            return;
        }
        ckf.g(map, "<set-?>");
        this.liveRoomParams = map;
    }

    public final void setRecordCurrentStatusAction(g1a<? super List<String>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c10ddb", new Object[]{this, g1aVar});
        } else {
            this.recordCurrentStatusAction = g1aVar;
        }
    }

    public final void setSessionID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e577d40", new Object[]{this, str});
        } else {
            this.sessionID = str;
        }
    }

    public final void setStopHeartBeatWhenBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda43b0d", new Object[]{this, new Boolean(z)});
        } else {
            this.stopHeartBeatWhenBackground = z;
        }
    }

    public final void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.topic = str;
        }
    }

    @Override // tb.nzf
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.uuid = str;
        }
    }

    public OpenArchHeartBeatContext(String str, String str2, String str3, String str4, Map<String, ? extends Object> map, Integer num, g1a<? super List<String>, xhv> g1aVar) {
        ckf.g(map, "liveRoomParams");
        this.apiName = str;
        this.sessionID = str2;
        this.topic = str3;
        this.bizScene = str4;
        this.liveRoomParams = map;
        this.appearanceStatus = num;
        this.recordCurrentStatusAction = g1aVar;
        this.apiVersion = "1.0";
        this.bizCode = OpenArchPMBizCode.DefaultBizCode;
        this.stopHeartBeatWhenBackground = true;
        this.interval = loadHeartBeatIntervalConfig$nexus_release();
    }

    public final boolean loadEnableHeartBeatConfig$nexus_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71744823", new Object[]{this})).booleanValue();
        }
        return uhc.a.a(mhr.e0(), "liveMessageUseHeartbeat", false, 2, null);
    }

    public final boolean loadEnableStopReportSwitch$nexus_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f5e2941", new Object[]{this})).booleanValue();
        }
        return uhc.a.a(mhr.e0(), "liveMessageHeartbeatStopReport", false, 2, null);
    }

    public /* synthetic */ OpenArchHeartBeatContext(String str, String str2, String str3, String str4, Map map, Integer num, g1a g1aVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? new LinkedHashMap() : map, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : g1aVar);
    }
}
