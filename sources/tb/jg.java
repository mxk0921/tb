package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.nodemodel.branch.AURANodeBranchModel;
import com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncProcessor;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jg extends zt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81788970);
    }

    public jg(nbb nbbVar) {
        this.f32997a = new mg(nbbVar);
        this.b = nbbVar;
    }

    public static /* synthetic */ Object ipc$super(jg jgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/asyncModule/management/AURAAsyncModuleDispatcher");
    }

    @Override // tb.zt
    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f18e3d", new Object[]{this, aURARenderComponent});
        } else if (this.b.a(new AURANodeBranchModel("aura.branch.asyncComponent.trigger.afterParser", false, "default"))) {
            b(aURARenderComponent);
        } else if (this.b.a(new AURANodeBranchModel("aura.branch.asyncComponent.trigger.lowdevicePreload", false, "default")) && this.b.a(new AURANodeBranchModel("aura.branch.deviceEvaluation.low", false, "default"))) {
            b(aURARenderComponent);
        }
    }

    @Override // tb.zt
    public void b(AURARenderComponent aURARenderComponent) {
        Map<String, List<Event>> map;
        List<Event> list;
        TreeNode<RenderComponent> treeNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b4ce0e", new Object[]{this, aURARenderComponent});
        } else if (aURARenderComponent != null && !TextUtils.isEmpty(aURARenderComponent.key)) {
            String str = aURARenderComponent.key;
            if (this.f32997a.b(str) != null) {
                this.f32997a.c(str);
                return;
            }
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData != null && (map = aURARenderComponentData.events) != null && (list = map.get(AsyncProcessor.EVENT_LIST_NAME)) != null && !list.isEmpty() && (treeNode = aURARenderComponent.mirror) != null) {
                c(treeNode.data());
                this.f32997a.c(str);
            }
        }
    }

    @Override // tb.zt
    public void c(RenderComponent renderComponent) {
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f084742", new Object[]{this, renderComponent});
        } else if (renderComponent != null && (component = renderComponent.component) != null && component.getEvents() != null && !TextUtils.isEmpty(renderComponent.key)) {
            String str = renderComponent.key;
            List<Event> list = renderComponent.component.getEvents().get(AsyncProcessor.EVENT_LIST_NAME);
            if (!(list == null || list.isEmpty())) {
                for (Event event : list) {
                    if (!(event == null || event.getFields() == null)) {
                        try {
                            AsyncModule asyncModule = (AsyncModule) JSON.toJavaObject(event.getFields(), AsyncModule.class);
                            if (asyncModule != null) {
                                this.f32997a.a(str, event.getType(), renderComponent, asyncModule);
                            }
                        } catch (Exception e) {
                            ck.g().b("AURAAsyncModuleDispatcher", "onParse", e.toString());
                        }
                    }
                }
            }
        }
    }

    @Override // tb.zt
    public void d(AURARenderComponent aURARenderComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e5213b", new Object[]{this, aURARenderComponent, new Integer(i)});
        } else if (this.b.a(new AURANodeBranchModel("aura.branch.asyncComponent.trigger.scroll", false, "default"))) {
            b(aURARenderComponent);
        } else if (this.b.a(new AURANodeBranchModel("aura.branch.asyncComponent.trigger.lowdeviceScroll", false, "default")) && this.b.a(new AURANodeBranchModel("aura.branch.deviceEvaluation.low", false, "default"))) {
            b(aURARenderComponent);
        }
    }
}
