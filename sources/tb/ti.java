package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.eventTrigger")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ti extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789106);
    }

    public static /* synthetic */ Object ipc$super(ti tiVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 148614476) {
            super.afterServiceExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        } else if (hashCode == 1111077198) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/eventtrigger/AURAEventTriggerCommon");
        }
    }

    @Override // tb.ms
    public boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ms, tb.xab
    public void afterServiceExecute(yk ykVar, cg cgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbad4c", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        super.afterServiceExecute(ykVar, cgVar, z);
        if (cgVar.b().equals(pm.RENDER_SERVICE_CODE) && !z) {
            al.n(M0().d(), "onAfterRender");
        }
    }

    @Override // tb.ms, tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, cgVar);
        if (cgVar.b().equals(pm.RENDER_SERVICE_CODE)) {
            if (aURAInputData == null) {
                N0("AURAEventServiceDomain", "AURAEventTriggerCommon", "eventsFields is null!");
                ck.g().b("AURAEventTriggerCommon", "innerHandleEvent", "eventFields 为空");
                return;
            }
            Serializable data = aURAInputData.getData();
            if (!(data instanceof AURARenderIO)) {
                N0("AURAEventServiceDomain", "AURAEventTriggerCommon", "input is null!");
                ck.g().b("AURAEventTriggerCommon", "innerHandleEvent", "input 为空");
                return;
            }
            AURARenderComponent renderTree = ((AURARenderIO) data).getRenderTree();
            if (renderTree == null) {
                N0("AURAEventServiceDomain", "AURAEventTriggerCommon", "renderComponent is null!");
                ck.g().b("AURAEventTriggerCommon", "innerHandleEvent", "renderComponent 为空");
                return;
            }
            AURARenderComponentData aURARenderComponentData = renderTree.data;
            if (aURARenderComponentData == null) {
                N0("AURAEventServiceDomain", "AURAEventTriggerCommon", "renderComponentData is null!");
                ck.g().b("AURAEventTriggerCommon", "innerHandleEvent", "renderComponentData 为空");
                return;
            }
            Map<String, List<Event>> map = aURARenderComponentData.events;
            if (map == null) {
                N0("AURAEventServiceDomain", "AURAEventTriggerCommon", "eventMap is null!");
                ck.g().b("AURAEventTriggerCommon", "innerHandleEvent", "eventMap 为空");
                return;
            }
            AURAFlowData K0 = K0();
            if (K0 == null || !"aura.workflow.instanceSyncData".equals(K0.getFlowCode())) {
                al.m(M0().d(), map);
            } else {
                al.m(M0().d(), map);
            }
        }
    }

    @Override // tb.ms, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        al.o(M0().d());
    }
}
