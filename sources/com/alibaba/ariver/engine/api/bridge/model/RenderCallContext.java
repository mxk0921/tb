package com.alibaba.ariver.engine.api.bridge.model;

import com.alibaba.ariver.engine.api.Render;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RenderCallContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_CALL = "call";
    public static final String TYPE_CALLBACK = "callback";

    /* renamed from: a  reason: collision with root package name */
    public String f2429a;
    public String b;
    public JSONObject c;
    public String d;
    public final Render e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f2430a = "native_" + System.currentTimeMillis();
        public String b;
        public JSONObject c;
        public String d;
        public final Render e;
        public boolean f;

        public Builder(Render render) {
            this.e = render;
        }

        public static /* synthetic */ String access$000(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("90435fdf", new Object[]{builder});
            }
            return builder.f2430a;
        }

        public static /* synthetic */ String access$100(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6003937e", new Object[]{builder});
            }
            return builder.b;
        }

        public static /* synthetic */ JSONObject access$200(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("dacfef03", new Object[]{builder});
            }
            return builder.c;
        }

        public static /* synthetic */ String access$300(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ff83fabc", new Object[]{builder});
            }
            return builder.d;
        }

        public static /* synthetic */ boolean access$400(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fde8ce9", new Object[]{builder})).booleanValue();
            }
            return builder.f;
        }

        public static /* synthetic */ Render access$500(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Render) ipChange.ipc$dispatch("5ec846a", new Object[]{builder});
            }
            return builder.e;
        }

        public Builder action(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("613fa019", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public RenderCallContext build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RenderCallContext) ipChange.ipc$dispatch("aeeca822", new Object[]{this});
            }
            return new RenderCallContext(this);
        }

        public Builder eventId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8e9edd9a", new Object[]{this, str});
            }
            this.f2430a = str;
            return this;
        }

        public Builder keep(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c8451e38", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public Builder param(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6bedaa4", new Object[]{this, jSONObject});
            }
            this.c = jSONObject;
            return this;
        }

        public Builder type(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("63f82c95", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }
    }

    public RenderCallContext(Builder builder) {
        this.f2429a = Builder.access$000(builder);
        this.b = Builder.access$100(builder);
        JSONObject access$200 = Builder.access$200(builder);
        this.c = access$200;
        if (access$200 == null) {
            this.c = new JSONObject();
        }
        this.d = Builder.access$300(builder);
        this.f = Builder.access$400(builder);
        this.e = Builder.access$500(builder);
    }

    public static Builder newBuilder(Render render) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("61f97164", new Object[]{render});
        }
        return new Builder(render);
    }

    public String getAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this});
        }
        return this.b;
    }

    public String getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd90ef3a", new Object[]{this});
        }
        return this.f2429a;
    }

    public boolean getKeep() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7866a306", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public JSONObject getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed69b2fe", new Object[]{this});
        }
        return this.c;
    }

    public Render getTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Render) ipChange.ipc$dispatch("d351cb42", new Object[]{this});
        }
        return this.e;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.d;
    }

    public void setAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb72d5c9", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setEventId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9080e4", new Object[]{this, str});
        } else {
            this.f2429a = str;
        }
    }

    public void setKeep(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c23086", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void setParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6d4cde", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }
}
