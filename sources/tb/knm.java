package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.engine.model.Block;
import com.alibaba.android.ultron.engine.model.TemplateComponent;
import com.alibaba.android.ultron.engine.model.TemplateHierarchy;
import com.alibaba.android.ultron.engine.protocol.ComponentView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class knm implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public x6v f22783a;
    public ComponentView b;
    public knm h;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public final List<knm> i = new ArrayList();

    static {
        t2o.a(157286473);
    }

    public void a(knm knmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9391cc13", new Object[]{this, knmVar});
        } else {
            ((ArrayList) this.i).add(knmVar);
        }
    }

    /* renamed from: b */
    public knm clone() {
        x6v x6vVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (knm) ipChange.ipc$dispatch("c163a729", new Object[]{this});
        }
        knm knmVar = new knm();
        x6v x6vVar2 = this.f22783a;
        if (x6vVar2 != null) {
            x6vVar = x6vVar2.clone();
        } else {
            x6vVar = null;
        }
        knmVar.f22783a = x6vVar;
        knmVar.b = this.b;
        knmVar.c = this.c;
        knmVar.d = this.d;
        knmVar.e = this.e;
        knmVar.f = this.f;
        return knmVar;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3ce62e7", new Object[]{this});
        }
        return this.f;
    }

    public List<knm> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
        }
        return this.i;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("529e9f61", new Object[]{this});
        }
        return this.f22783a.j;
    }

    public ComponentView f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentView) ipChange.ipc$dispatch("a311a175", new Object[]{this});
        }
        return this.b;
    }

    public x6v g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x6v) ipChange.ipc$dispatch("8aff3973", new Object[]{this});
        }
        return this.f22783a;
    }

    public knm h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (knm) ipChange.ipc$dispatch("e1ff6a6c", new Object[]{this});
        }
        return this.h;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a2b7c8e", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f7f6d6c", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3929c040", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("139608d7", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d056cfe0", new Object[]{this})).booleanValue();
        }
        x6v x6vVar = this.f22783a;
        if (x6vVar == null || !x6vVar.i) {
            return false;
        }
        return true;
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f65be34", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void o(Block block, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c070faf", new Object[]{this, block, str});
            return;
        }
        x6v x6vVar = new x6v();
        this.c = true;
        this.f = block.blockTypeEnum;
        x6vVar.c = str;
        x6vVar.b = str;
        x6vVar.j = str;
        x6vVar.g = block.position;
        this.f22783a = x6vVar;
    }

    public void q(TemplateHierarchy.Node node, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f6cadd", new Object[]{this, node, str});
            return;
        }
        x6v x6vVar = new x6v();
        this.d = true;
        String str3 = node.tag;
        x6vVar.c = str3;
        x6vVar.g = node.position;
        x6vVar.b = str3;
        JSONObject jSONObject = node.style;
        if (jSONObject != null) {
            str2 = jSONObject.getString("cardGroup");
        } else {
            str2 = null;
        }
        x6vVar.h = str2;
        if (node.data != null) {
            JSONObject jSONObject2 = new JSONObject();
            x6vVar.d = jSONObject2;
            jSONObject2.putAll(node.data);
        }
        x6vVar.j = str;
        this.f22783a = x6vVar;
    }

    public void r(knm knmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b763482", new Object[]{this, knmVar});
        } else {
            this.h = knmVar;
        }
    }

    public void p(TemplateComponent templateComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9594114f", new Object[]{this, templateComponent});
            return;
        }
        this.e = true;
        x6v x6vVar = new x6v();
        x6vVar.f31184a = String.valueOf(templateComponent.id);
        String str = templateComponent.tag;
        x6vVar.c = str;
        x6vVar.b = str;
        x6vVar.g = str;
        JSONObject jSONObject = new JSONObject();
        x6vVar.d = jSONObject;
        jSONObject.putAll(templateComponent.data);
        String str2 = templateComponent.filter;
        if (!TextUtils.isEmpty(str2)) {
            x6vVar.d.put("filter", (Object) str2);
            x6vVar.i = true;
        }
        x6vVar.e = templateComponent.event;
        x6vVar.f = templateComponent.supportEvent;
        x6vVar.j = qcv.b(x6vVar);
        this.f22783a = x6vVar;
        ComponentView componentView = new ComponentView();
        componentView.name = templateComponent.frontComponentName;
        componentView.version = templateComponent.frontComponentVersion;
        Map<String, String> map = templateComponent.frontComponentAddress;
        Map<String, String> map2 = templateComponent.frontComponentMD5;
        if (!(map == null || map2 == null)) {
            String str3 = map.get("android");
            if (TextUtils.isEmpty(str3)) {
                str3 = map.get("resource");
            }
            componentView.url = str3;
            componentView.md5 = map2.get("android");
        }
        componentView.id = String.valueOf(templateComponent.templateId);
        componentView.containerType = templateComponent.type;
        HashSet hashSet = new HashSet();
        hashSet.add(x6vVar.c);
        componentView.type = hashSet;
        this.b = componentView;
    }
}
