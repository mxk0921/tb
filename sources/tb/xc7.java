package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ActionModel;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.DescModel;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.RuleModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xc7 implements aed {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, RuleModel> f31295a;
    public HashMap<String, ActionModel> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements zf8<RuleModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(xc7 xc7Var) {
        }

        /* renamed from: b */
        public RuleModel a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RuleModel) ipChange.ipc$dispatch("8e6bec0", new Object[]{this, obj});
            }
            return new RuleModel((JSONObject) obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements zf8<ActionModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(xc7 xc7Var) {
        }

        /* renamed from: b */
        public ActionModel a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActionModel) ipChange.ipc$dispatch("d2fafdfa", new Object[]{this, obj});
            }
            return new ActionModel((JSONObject) obj);
        }
    }

    static {
        t2o.a(912262474);
        t2o.a(912262488);
    }

    public xc7(Context context) {
    }

    @Override // tb.aed
    public ActionModel a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionModel) ipChange.ipc$dispatch("41df8d46", new Object[]{this, str});
        }
        if (!ar3.d(this.b) && !TextUtils.isEmpty(str)) {
            return new ActionModel(this.b.get(str));
        }
        return null;
    }

    @Override // tb.aed
    public RuleModel b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleModel) ipChange.ipc$dispatch("acecc774", new Object[]{this, str, str2});
        }
        if (!ar3.d(this.f31295a) && !TextUtils.isEmpty(str2)) {
            return this.f31295a.get(str2);
        }
        return null;
    }

    @Override // tb.aed
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4ab3347", new Object[]{this});
        }
        return "ID";
    }

    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1712ad", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            this.b = uf7.b(jSONObject, new b(this));
        }
    }

    public DescModel e(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DescModel) ipChange.ipc$dispatch("8a5a43aa", new Object[]{this, jSONArray});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        DescModel descModel = new DescModel();
        descModel.components = new ArrayList<>();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            descModel.components.add(new ComponentModel((JSONObject) it.next(), this));
        }
        return descModel;
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fa7173", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            this.f31295a = uf7.b(jSONObject, new a(this));
        }
    }
}
