package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.aura.service.render.layout.AURARenderContainerAdapter;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class rn extends bp<UMFLinkageTrigger, AURANextRPCIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.service.submit";
    public static final String FLOW_DATA_KEY_LINKAGE_TRIGGER = "auraSubmitServiceLinkageTrigger";
    public static final String KEY_MSG = "msg";

    static {
        t2o.a(81789138);
    }

    public static /* synthetic */ Object ipc$super(rn rnVar, String str, Object... objArr) {
        if (str.hashCode() == -576780562) {
            super.B((AURAInputData) objArr[0], (pt) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/service/AURASubmitService");
    }

    public final void L(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6d54cf", new Object[]{this, context, str});
        } else if (!TextUtils.isEmpty(str) && (context instanceof Activity)) {
            eo.b((Activity) context, str);
        }
    }

    public final void m0(JSONObject jSONObject, boolean z, RenderComponent renderComponent, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4213f0e", new Object[]{this, jSONObject, new Boolean(z), renderComponent, str, str2});
            return;
        }
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        jSONObject.put("component", (Object) renderComponent);
        jSONObject.put("msg", (Object) str);
        jSONObject.put("errorType", (Object) str2);
    }

    public final void J0(RecyclerView recyclerView, RenderComponent renderComponent, int i) {
        AURARenderComponent aURARenderComponent;
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e55eb5", new Object[]{this, recyclerView, renderComponent, new Integer(i)});
        } else if (renderComponent != null) {
            String key = renderComponent.getKey();
            if (!TextUtils.isEmpty(key)) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter instanceof AURARenderContainerAdapter) {
                    List<AURARenderComponent> i2 = ((AURARenderContainerAdapter) adapter).i();
                    if (!i2.isEmpty()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i2.size()) {
                                aURARenderComponent = null;
                                break;
                            }
                            aURARenderComponent = i2.get(i3);
                            if (aURARenderComponent != null && !TextUtils.isEmpty(aURARenderComponent.key) && aURARenderComponent.key.equals(key)) {
                                break;
                            }
                            i3++;
                        }
                        if (i3 != i2.size()) {
                            if (aURARenderComponent != null) {
                                while (aURARenderComponent != null) {
                                    AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
                                    if (aURARenderComponentData == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null || !"sticky".equals(aURARenderComponentLayout.type)) {
                                        aURARenderComponent = aURARenderComponent.parent;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            if (recyclerView.getChildLayoutPosition(recyclerView.getChildAt(0)) < i3) {
                                int i4 = i + i3;
                                if (i4 < i2.size()) {
                                    i3 = i4;
                                }
                            } else {
                                i3 = Math.max(i3 - i, 0);
                            }
                            recyclerView.smoothScrollToPosition(i3);
                        }
                    }
                }
            }
        }
    }

    public final JSONObject K0(AURAInputData<UMFLinkageTrigger> aURAInputData) {
        RenderComponent data;
        Component component;
        JSONObject validate;
        Map<String, Object> fields;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("32e96c3", new Object[]{this, aURAInputData});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.TRUE);
        for (TreeNode<RenderComponent> treeNode : aURAInputData.getData().getStateTree().postOrdered()) {
            if (treeNode != null && (treeNode.data() instanceof RenderComponent) && (component = (data = treeNode.data()).getComponent()) != null && (validate = component.getValidate()) != null && (fields = component.getFields()) != null && !fields.isEmpty() && (jSONArray = validate.getJSONArray("fields")) != null && !jSONArray.isEmpty() && (jSONArray2 = validate.getJSONArray("regex")) != null && !jSONArray2.isEmpty() && (jSONArray3 = validate.getJSONArray("msg")) != null && !jSONArray3.isEmpty() && jSONArray.size() == jSONArray2.size() && jSONArray2.size() == jSONArray3.size()) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    Object obj = jSONArray.get(i);
                    Object obj2 = jSONArray2.get(i);
                    Object obj3 = jSONArray3.get(i);
                    if ((obj instanceof String) && (obj2 instanceof String) && (obj3 instanceof String)) {
                        Object obj4 = fields.get(obj);
                        if (obj4 == null) {
                            m0(jSONObject, false, data, (String) obj3, "validate_failed");
                            return jSONObject;
                        }
                        try {
                            if (!(obj4 instanceof String)) {
                                str = obj4.toString();
                            } else {
                                str = (String) obj4;
                            }
                            if (!Pattern.compile((String) obj2).matcher(str).find()) {
                                m0(jSONObject, false, data, (String) obj3, "validate_failed");
                                return jSONObject;
                            }
                        } catch (Exception unused) {
                            m0(jSONObject, false, data, (String) obj3, "validate_exception");
                            return jSONObject;
                        }
                    }
                }
                continue;
            }
        }
        return jSONObject;
    }

    @Override // tb.bp
    public void B(AURAInputData<UMFLinkageTrigger> aURAInputData, pt<AURANextRPCIO> ptVar) {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9f06ee", new Object[]{this, aURAInputData, ptVar});
            return;
        }
        super.B(aURAInputData, ptVar);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTime", (Object) (System.currentTimeMillis() + ""));
        aURAInputData.getFlowData().update(FLOW_DATA_KEY_LINKAGE_TRIGGER, aURAInputData.getData());
        List<ycb> f = r().f(ycb.class);
        JSONObject K0 = K0(aURAInputData);
        if (!(K0.getBoolean("success") != null ? K0.getBoolean("success").booleanValue() : false)) {
            RenderComponent renderComponent = (RenderComponent) K0.getObject("component", RenderComponent.class);
            if (K0.getString("msg") != null) {
                str = K0.getString("msg");
            } else {
                str = "Validate data failed";
            }
            for (ycb ycbVar : f) {
                if (ycbVar.w(renderComponent, K0)) {
                    z = true;
                }
            }
            if (!z) {
                L(x().f(), str);
                Object obj = aURAInputData.getGlobalData().get("render_view", Object.class);
                if (obj instanceof RecyclerView) {
                    J0((RecyclerView) obj, renderComponent, 3);
                }
            }
            ptVar.a();
            return;
        }
        wcb wcbVar = (wcb) r().e(wcb.class);
        if (wcbVar == null) {
            ptVar.b(new mi(0, "AURASubmitServiceDomain", "no_submit_linkage", "Can't find submit linkage"));
            return;
        }
        for (ycb ycbVar2 : f) {
            ycbVar2.g0();
        }
        jSONObject.put("beforeRequestTime", (Object) (System.currentTimeMillis() + ""));
        aURAInputData.getGlobalData().update("linkagePerformance", jSONObject);
        ptVar.c(yk.a(new AURANextRPCIO(wcbVar.X(), wcbVar.k()), aURAInputData));
    }
}
