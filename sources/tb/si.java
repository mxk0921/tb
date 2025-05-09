package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.eventTrigger.afterRender")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class si extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AURAInputData f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(si siVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1339997787) {
                super.b((mi) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/eventtrigger/AURAEventTriggerAfterRender$1");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            super.b(miVar);
            ck.g().b("afterRender", "innerHandleEvent", miVar.e());
        }
    }

    static {
        t2o.a(81789104);
    }

    public static /* synthetic */ Object ipc$super(si siVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 148614476) {
            super.afterServiceExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        } else if (hashCode == 1111077198) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/eventtrigger/AURAEventTriggerAfterRender");
        }
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
            AURAInputData aURAInputData = this.f;
            if (aURAInputData == null) {
                N0("AURAEventServiceDomain", "afterRender", "eventsFields is null!");
                ck.g().b("afterRender", "innerHandleEvent", "eventFields 为空");
                return;
            }
            Serializable data = aURAInputData.getData();
            if (!(data instanceof AURARenderIO)) {
                N0("AURAEventServiceDomain", "afterRender", "input is null!");
                ck.g().b("afterRender", "innerHandleEvent", "input 为空");
                return;
            }
            AURARenderComponent renderTree = ((AURARenderIO) data).getRenderTree();
            if (renderTree == null) {
                N0("AURAEventServiceDomain", "afterRender", "renderComponent is null!");
                ck.g().b("afterRender", "innerHandleEvent", "renderComponent 为空");
                return;
            }
            AURARenderComponentData aURARenderComponentData = renderTree.data;
            if (aURARenderComponentData == null) {
                N0("AURAEventServiceDomain", "afterRender", "renderComponentData is null!");
                ck.g().b("afterRender", "innerHandleEvent", "renderComponentData 为空");
                return;
            }
            Map<String, List<Event>> map = aURARenderComponentData.events;
            if (map == null) {
                N0("AURAEventServiceDomain", "afterRender", "eventMap is null!");
                ck.g().b("afterRender", "innerHandleEvent", "eventMap 为空");
                return;
            }
            List<Event> list = map.get("afterRender");
            if (bh.a(list)) {
                N0("AURAEventServiceDomain", "afterRender", "eventList is null!");
                ck.g().b("afterRender", "innerHandleEvent", "eventList 为空");
                return;
            }
            for (Event event : list) {
                String type = event.getType();
                JSONObject fields = event.getFields();
                if (!TextUtils.isEmpty(type)) {
                    qi qiVar = new qi();
                    qiVar.n(fields);
                    qiVar.t(renderTree);
                    M0().c().c("aura.workflow.event", new AURAEventIO(type, qiVar), new a(this));
                }
            }
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
            this.f = aURAInputData;
        }
    }
}
