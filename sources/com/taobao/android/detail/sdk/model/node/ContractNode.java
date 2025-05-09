package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.bg8;
import tb.t2o;
import tb.vf7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ContractNode extends DetailNode {
    public List<Map<String, Object>> componentData;
    public Version version;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Version implements Serializable {
        public int categoryId;
        public boolean enableClick;
        public boolean limit;
        public String nativeDesc;
        public boolean noShopCart;
        public String planId;
        public String secondJumpTitle;
        public List<?> skuId;
        public String versionCode;
        public String versionEntry;
        public String versionName;

        static {
            t2o.a(706740229);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements bg8<Map<String, Object>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.detail.sdk.model.node.ContractNode$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0349a implements bg8<Object> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0349a(a aVar) {
            }

            @Override // tb.bg8
            public Object a(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("cbc0bfdc", new Object[]{this, obj});
                }
                return obj;
            }
        }

        public a(ContractNode contractNode) {
        }

        /* renamed from: b */
        public Map<String, Object> a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ce4739cb", new Object[]{this, obj});
            }
            return vf7.b((JSONObject) obj, new C0349a(this));
        }
    }

    static {
        t2o.a(706740226);
    }

    public ContractNode() {
        super(new JSONObject());
    }

    public ContractNode(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.componentData = vf7.a(jSONObject.getJSONArray("componentData"), new a(this));
        } catch (Throwable unused) {
        }
        try {
            this.version = (Version) jSONObject.getObject("version", Version.class);
        } catch (Throwable unused2) {
        }
    }
}
