package com.taobao.android.trade.component.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.sb4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class Component {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f9685a;
    public JSONObject b;
    public Component c;
    public String d;
    public Status e = Status.NORMAL;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum LinkageType {
        REQUEST,
        REFRESH;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LinkageType linkageType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/component/data/Component$LinkageType");
        }

        public static LinkageType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinkageType) ipChange.ipc$dispatch("b6740d47", new Object[]{str});
            }
            return (LinkageType) Enum.valueOf(LinkageType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum Status {
        NORMAL,
        DISABLE,
        HIDDEN;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static Status getComponentStatusByDesc(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("cffe4ee5", new Object[]{str});
            }
            if (str == null || str.isEmpty()) {
                return NORMAL;
            }
            if ("disable".equals(str)) {
                return DISABLE;
            }
            if ("hidden".equals(str)) {
                return HIDDEN;
            }
            return NORMAL;
        }

        public static /* synthetic */ Object ipc$super(Status status, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/component/data/Component$Status");
        }

        public static Status valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Status) ipChange.ipc$dispatch("9e6d5ade", new Object[]{str});
            }
            return (Status) Enum.valueOf(Status.class, str);
        }
    }

    static {
        t2o.a(758120450);
    }

    public Component() {
        IpChange ipChange = LinkageType.$ipChange;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c2f5b9b7", new Object[]{this});
        }
        return this.f9685a;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("db245331", new Object[]{this});
        }
        return this.f9685a;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.f9685a;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this});
        }
        return this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.f9685a.getString("id");
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        String i = i();
        String e = e();
        if (i == null || e == null) {
            return null;
        }
        return i + "_" + e;
    }

    public Component g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("bc3f0e30", new Object[]{this});
        }
        return this.c;
    }

    public Status h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Status) ipChange.ipc$dispatch("fde957e8", new Object[]{this});
        }
        return this.e;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        JSONObject jSONObject = this.f9685a;
        if (jSONObject != null) {
            return jSONObject.getString("tag");
        }
        return "unknown";
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.d;
    }

    public final void k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97d2839", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.f9685a = jSONObject;
            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            if (jSONObject2 != null) {
                this.b = jSONObject2;
                this.e = Status.getComponentStatusByDesc(this.f9685a.getString("status"));
                this.f9685a.getString("tag");
                this.d = this.f9685a.getString("type");
                return;
            }
            throw new IllegalArgumentException();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58ef56d", new Object[]{this})).booleanValue();
        }
        return this.f9685a.getBooleanValue("submit");
    }

    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5b5d50", new Object[]{this, jSONObject});
        } else {
            k(jSONObject);
        }
    }

    public void n(LinkageType linkageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97f63fa", new Object[]{this, linkageType});
        }
    }

    public void o(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6e8786", new Object[]{this, component});
        } else {
            this.c = component;
        }
    }

    public Component(JSONObject jSONObject, sb4 sb4Var) {
        IpChange ipChange = LinkageType.$ipChange;
        k(jSONObject);
    }
}
