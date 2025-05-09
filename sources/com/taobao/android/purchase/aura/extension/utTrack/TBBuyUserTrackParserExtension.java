package com.taobao.android.purchase.aura.extension.utTrack;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.Global;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.bh;
import tb.dn;
import tb.fk;
import tb.gt;
import tb.hbb;
import tb.lo;
import tb.t2o;
import tb.vm0;
import tb.y8r;
import tb.yi;
import tb.z9r;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.parse.stateTree.userTrack")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TBBuyUserTrackParserExtension extends gt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public lo c;
    public Map<String, Map<String, String>> d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UltronProtocol f9221a;

        public a(UltronProtocol ultronProtocol) {
            this.f9221a = ultronProtocol;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TBBuyUserTrackParserExtension.x(TBBuyUserTrackParserExtension.this, this.f9221a);
            TBBuyUserTrackParserExtension.B(TBBuyUserTrackParserExtension.this, this.f9221a);
        }
    }

    static {
        t2o.a(708837500);
    }

    public static /* synthetic */ void B(TBBuyUserTrackParserExtension tBBuyUserTrackParserExtension, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb5680", new Object[]{tBBuyUserTrackParserExtension, ultronProtocol});
        } else {
            tBBuyUserTrackParserExtension.J0(ultronProtocol);
        }
    }

    public static /* synthetic */ Object ipc$super(TBBuyUserTrackParserExtension tBBuyUserTrackParserExtension, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/utTrack/TBBuyUserTrackParserExtension");
    }

    public static /* synthetic */ void x(TBBuyUserTrackParserExtension tBBuyUserTrackParserExtension, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418755bf", new Object[]{tBBuyUserTrackParserExtension, ultronProtocol});
        } else {
            tBBuyUserTrackParserExtension.M0(ultronProtocol);
        }
    }

    public final void J0(UltronProtocol ultronProtocol) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37db8b0", new Object[]{this, ultronProtocol});
        } else if (this.e) {
            try {
                K0(ultronProtocol, this.d);
                AURAGlobalData aURAGlobalData = this.f20205a;
                if (aURAGlobalData != null && (map = (Map) aURAGlobalData.get("tbbuy_dataParams", Map.class)) != null) {
                    m0(map);
                }
            } catch (Throwable th) {
                vm0.e("TBBuyUserTrackParserExtension_Exception", th.getMessage());
            }
        }
    }

    public final void K0(UltronProtocol ultronProtocol, Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d8869a", new Object[]{this, ultronProtocol, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("components", JSON.toJSONString(map));
        String L = L(ultronProtocol);
        if (!TextUtils.isEmpty(L)) {
            hashMap.put("aura.userMark.dyeingInfo", L);
        }
        z9r.a("Page_NewConfirmOrder_OrderBuildResponseInfo", hashMap);
    }

    public final String L(UltronProtocol ultronProtocol) {
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79390d76", new Object[]{this, ultronProtocol});
        }
        if (!(ultronProtocol.getHierarchy() == null || ultronProtocol.getData() == null)) {
            String root = ultronProtocol.getHierarchy().getRoot();
            if (!TextUtils.isEmpty(root) && (component = ultronProtocol.getData().get(root)) != null && (component.getFeatures() instanceof JSONObject)) {
                return ((JSONObject) component.getFeatures()).getString("dyeingInfo");
            }
        }
        return null;
    }

    public final void L0(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efebcda0", new Object[]{this, renderComponent});
            return;
        }
        String containerType = renderComponent.componentView.getContainerType();
        if (TextUtils.isEmpty(containerType) || !containerType.contains("layout")) {
            Map<String, Object> fields = renderComponent.component.getFields();
            if (!bh.b(fields)) {
                String str = (String) fk.b(fields, "state", String.class, "");
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("state", str);
                }
                ((HashMap) this.d).put(renderComponent.key, hashMap);
            }
        }
    }

    public final void M0(UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01a7fbb", new Object[]{this, ultronProtocol});
            return;
        }
        try {
            Global global = ultronProtocol.getGlobal();
            if (global != null) {
                Object params = global.getParams();
                if (params instanceof JSONObject) {
                    UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.c.f(), (Map) JSON.toJavaObject((JSONObject) params, Map.class));
                }
            }
        } catch (Throwable th) {
            vm0.e("serverPageUtTracker_Exception", th.getMessage());
        }
    }

    public final void m0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4114e0c", new Object[]{this, map});
        } else if (map != null) {
            z9r.a("Page_NewConfirmOrder_OrderBuildRequestInfo", new HashMap<String, String>(map) { // from class: com.taobao.android.purchase.aura.extension.utTrack.TBBuyUserTrackParserExtension.2
                public final /* synthetic */ Map val$params;

                {
                    this.val$params = map;
                    put("requestParams", JSON.toJSONString(map));
                }
            });
        }
    }

    @Override // tb.gt, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        this.c = loVar;
        this.d = new HashMap();
        this.e = y8r.b();
    }

    @Override // tb.gt, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.gt, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.gt, tb.dcb
    public void p(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900fdd7", new Object[]{this, multiTreeNode, ultronProtocol});
        } else {
            dn.h(new a(ultronProtocol));
        }
    }

    @Override // tb.gt
    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.gt, tb.dcb
    public void w0(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51ac098", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        RenderComponent data = multiTreeNode.data();
        if (data != null && this.e) {
            try {
                L0(data);
            } catch (Throwable th) {
                vm0.e("COMPONENTS_UPDATE_EXCEPTION", th.getMessage());
            }
        }
    }
}
