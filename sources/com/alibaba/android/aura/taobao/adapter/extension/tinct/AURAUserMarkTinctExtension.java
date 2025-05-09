package com.alibaba.android.aura.taobao.adapter.extension.tinct;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.adb;
import tb.bh;
import tb.ck;
import tb.gt;
import tb.nbq;
import tb.po;
import tb.t2o;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.userMarkTinct")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AURAUserMarkTinctExtension extends gt implements adb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789210);
        t2o.a(81789101);
    }

    public static /* synthetic */ Object ipc$super(AURAUserMarkTinctExtension aURAUserMarkTinctExtension, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/tinct/AURAUserMarkTinctExtension");
    }

    @Override // tb.adb
    public Map<String, String> a0(po poVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ac4d0198", new Object[]{this, poVar});
        }
        AURAGlobalData aURAGlobalData = this.f20205a;
        if (aURAGlobalData == null) {
            ck.g().d("getUserTrackArgs globalData is null!!");
            return null;
        }
        String str = (String) aURAGlobalData.get("aura.userMark.dyeingInfo.globalData.key", String.class);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new HashMap<String, String>(str) { // from class: com.alibaba.android.aura.taobao.adapter.extension.tinct.AURAUserMarkTinctExtension.1
            public final /* synthetic */ String val$dyeingInfo;

            {
                this.val$dyeingInfo = str;
                put("aura.userMark.dyeingInfo", str);
            }
        };
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
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51ac098", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        RenderComponent data = multiTreeNode.data();
        if (!(data == null || (component = data.getComponent()) == null)) {
            Object features = component.getFeatures();
            if (features instanceof JSONObject) {
                JSONObject jSONObject = ((JSONObject) features).getJSONObject("dyeingInfo");
                if (!bh.b(jSONObject)) {
                    String string = jSONObject.getString("changeCode");
                    String string2 = jSONObject.getString("page");
                    JSONArray jSONArray = jSONObject.getJSONArray("config");
                    if (!(TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bh.a(jSONArray))) {
                        this.f20205a.update("aura.userMark.dyeingInfo.globalData.key", jSONObject.toJSONString());
                        for (int i = 0; i < jSONArray.size(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String string3 = jSONObject2.getString("businessCode");
                            if (!TextUtils.isEmpty(string3)) {
                                String string4 = jSONObject2.getString("groupCode");
                                if (TextUtils.isEmpty(string4)) {
                                    string4 = "aura_default";
                                }
                                String string5 = jSONObject2.getString("isGray");
                                if (TextUtils.isEmpty(string5)) {
                                    string5 = "true";
                                }
                                nbq.d(string4, string2, string3, string, Boolean.valueOf(string5).booleanValue());
                            }
                        }
                    }
                }
            }
        }
    }
}
