package com.taobao.tinct.impl.collect;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.tinct.model.ABChangeInfo;
import com.taobao.tinct.model.CustomChangeInfo;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.h9f;
import tb.n48;
import tb.pg1;
import tb.vks;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ChangeRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "orange")
    public ConcurrentHashMap<String, OrangeChangeInfo> orangeChangeMap = new ConcurrentHashMap<>();
    @JSONField(deserialize = false, name = TBSearchChiTuJSBridge.ABTEST, serialize = false)
    public ConcurrentHashMap<Integer, ABChangeInfo> abInfoMap = new ConcurrentHashMap<>();
    @JSONField(deserialize = false, name = Baggage.Amnet.SECURITY_INSTANT, serialize = false)
    public InstantPatchChangeInfo instantPatchInfo = null;
    @JSONField(deserialize = false, name = pg1.ATOM_EXT_inline, serialize = false)
    public h9f inlinePatchInfo = null;
    @JSONField(deserialize = false, name = "ts", serialize = false)
    public ConcurrentHashMap<String, List<vks>> touchStoneInfo = new ConcurrentHashMap<>();
    @JSONField(name = "custom")
    public Map<String, CustomChangeInfo> customInfo = new ConcurrentHashMap();
    @JSONField(deserialize = false, name = "dynamic", serialize = false)
    public List<n48> dynamicChangeInfos = new ArrayList();

    @JSONField(serialize = false)
    public String getCustomTinctTag() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3eaf9362", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<vks>> entry : this.touchStoneInfo.entrySet()) {
            for (vks vksVar : entry.getValue()) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(vksVar.getTinctTag());
                z = false;
            }
        }
        for (CustomChangeInfo customChangeInfo : this.customInfo.values()) {
            if (!customChangeInfo.isExpire()) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(customChangeInfo.getTinctTag());
                z = false;
            }
        }
        h9f h9fVar = this.inlinePatchInfo;
        if (h9fVar != null && !TextUtils.isEmpty(h9fVar.getVersion())) {
            if (!z) {
                sb.append("^");
            }
            sb.append(this.inlinePatchInfo.getTinctTag());
            z = false;
        }
        if (!this.dynamicChangeInfos.isEmpty()) {
            for (n48 n48Var : this.dynamicChangeInfos) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(n48Var.getTinctTag());
                z = false;
            }
        }
        return sb.toString();
    }
}
