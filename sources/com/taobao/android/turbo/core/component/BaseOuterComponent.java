package com.taobao.android.turbo.core.component;

import android.content.Context;
import android.view.View;
import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.tpu;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b&\u0018\u0000 )*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003*+,BA\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\r\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/taobao/android/turbo/core/component/BaseOuterComponent;", "MODEL", "Landroid/view/View;", "VIEW", "Lcom/taobao/android/turbo/core/component/BaseComponent;", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;", OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE, "", "componentId", "Landroid/content/Context;", "context", "", "host", "pageURL", "engineId", "Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;", "serviceDelegate", "<init>", "(Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;)V", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent$b;", "message", "Ltb/xhv;", "handleOuterMessage", "(Lcom/taobao/android/turbo/core/component/BaseOuterComponent$b;)V", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;", "getComponentType", "()Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;", "Ljava/lang/String;", "getComponentId", "()Ljava/lang/String;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/Object;", "getHost", "()Ljava/lang/Object;", "getPageURL", "getEngineId", "Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;", "getServiceDelegate", "()Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;", "Companion", "a", "OuterComponentType", TplMsg.VALUE_T_NATIVE_RETURN, "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class BaseOuterComponent<MODEL, VIEW extends View> extends BaseComponent<MODEL, VIEW> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_ID_INTERACT_CONTAINER = "interactContainer";
    public static final a Companion = new a(null);
    private static final String TAG = "BaseOuterComponent";
    private final String componentId;
    private final OuterComponentType componentType;
    private final Context context;
    private final String engineId;
    private final Object host;
    private final String pageURL;
    private final BaseServiceDelegate serviceDelegate;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Companion", "a", "DRAWER", "TAB", "INTERACT_CONTAINER", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum OuterComponentType {
        DRAWER("drawer"),
        TAB("tab"),
        INTERACT_CONTAINER(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion = new a(null);
        private final String value;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(919601240);
            }

            public a() {
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public final OuterComponentType a(String str) {
                OuterComponentType[] values;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (OuterComponentType) ipChange.ipc$dispatch("d465d0fa", new Object[]{this, str});
                }
                ckf.g(str, "value");
                for (OuterComponentType outerComponentType : OuterComponentType.values()) {
                    if (ckf.b(outerComponentType.getValue(), str)) {
                        return outerComponentType;
                    }
                }
                return null;
            }
        }

        OuterComponentType(String str) {
            this.value = str;
        }

        public static /* synthetic */ Object ipc$super(OuterComponentType outerComponentType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType");
        }

        public static OuterComponentType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("465ebbbb", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(OuterComponentType.class, str);
            }
            return (OuterComponentType) valueOf;
        }

        public final String getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.value;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601238);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ARGS = "messageArgs";
        public static final a Companion = new a(null);
        public static final String NAME = "messageName";
        public static final String SOURCE_COMPONENT_ID = "sourceId";
        public static final String SOURCE_COMPONENT_TYPE = "sourceType";
        public static final String TARGET_COMPONENT_ID = "targetId";
        public static final String TARGET_COMPONENT_TYPE = "targetType";

        /* renamed from: a  reason: collision with root package name */
        public final String f9738a;
        public final JSONObject b;
        public final OuterComponentType c;
        public final String d;
        public final OuterComponentType e;
        public final String f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(919601242);
            }

            public a() {
            }

            public final JSONObject b(b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (JSONObject) ipChange.ipc$dispatch("baf6cd19", new Object[]{this, bVar});
                }
                ckf.g(bVar, "outerMessage");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) b.NAME, bVar.b());
                jSONObject.put((JSONObject) b.ARGS, (String) bVar.a());
                jSONObject.put((JSONObject) "sourceType", bVar.d().toString());
                jSONObject.put((JSONObject) b.SOURCE_COMPONENT_ID, bVar.c());
                jSONObject.put((JSONObject) "targetType", bVar.f().toString());
                jSONObject.put((JSONObject) "targetId", bVar.e());
                return jSONObject;
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public final b a(JSONObject jSONObject) {
                boolean z = true;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (b) ipChange.ipc$dispatch("14185e8a", new Object[]{this, jSONObject});
                }
                ckf.g(jSONObject, "messageJSONObject");
                Object obj = jSONObject.get(b.NAME);
                Object obj2 = jSONObject.get(b.ARGS);
                Object obj3 = jSONObject.get("sourceType");
                Object obj4 = jSONObject.get(b.SOURCE_COMPONENT_ID);
                Object obj5 = jSONObject.get("targetType");
                Object obj6 = jSONObject.get("targetId");
                if (obj instanceof String) {
                    if (obj2 != null) {
                        z = obj2 instanceof JSONObject;
                    }
                    if (z && (obj3 instanceof String) && (obj4 instanceof String) && (obj5 instanceof String) && (obj6 instanceof String)) {
                        OuterComponentType.a aVar = OuterComponentType.Companion;
                        OuterComponentType a2 = aVar.a((String) obj3);
                        OuterComponentType a3 = aVar.a((String) obj5);
                        if (a2 != null && a3 != null) {
                            return new b((String) obj, (JSONObject) obj2, a2, (String) obj4, a3, (String) obj6);
                        }
                        tpu.a.b(tpu.Companion, BaseOuterComponent.TAG, "sourceTypeEnum为空或targetTypeEnum为空", null, 4, null);
                        return null;
                    }
                }
                tpu.a.b(tpu.Companion, BaseOuterComponent.TAG, "将JSONObject格式的消息转换为外部消息，messageJSONObject参数无效", null, 4, null);
                return null;
            }
        }

        static {
            t2o.a(919601241);
        }

        public b(String str, JSONObject jSONObject, OuterComponentType outerComponentType, String str2, OuterComponentType outerComponentType2, String str3) {
            ckf.g(str, "name");
            ckf.g(outerComponentType, "sourceComponentType");
            ckf.g(str2, "sourceComponentId");
            ckf.g(outerComponentType2, "targetComponentType");
            ckf.g(str3, "targetComponentId");
            this.f9738a = str;
            this.b = jSONObject;
            this.c = outerComponentType;
            this.d = str2;
            this.e = outerComponentType2;
            this.f = str3;
        }

        public final JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this});
            }
            return this.b;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return this.f9738a;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("936f6a32", new Object[]{this});
            }
            return this.d;
        }

        public final OuterComponentType d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OuterComponentType) ipChange.ipc$dispatch("7835accf", new Object[]{this});
            }
            return this.c;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f36a1ba8", new Object[]{this});
            }
            return this.f;
        }

        public final OuterComponentType f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OuterComponentType) ipChange.ipc$dispatch("5560a499", new Object[]{this});
            }
            return this.e;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "{name=" + this.f9738a + "，sourceType=" + this.c + "，sourceId=" + this.d + "，targetType=" + this.e + "，targetId=" + this.f + '}';
        }
    }

    static {
        t2o.a(919601237);
    }

    public BaseOuterComponent(OuterComponentType outerComponentType, String str, Context context, Object obj, String str2, String str3, BaseServiceDelegate baseServiceDelegate) {
        ckf.g(outerComponentType, OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE);
        ckf.g(str, "componentId");
        ckf.g(context, "context");
        ckf.g(str2, "pageURL");
        ckf.g(str3, "engineId");
        ckf.g(baseServiceDelegate, "serviceDelegate");
        this.componentType = outerComponentType;
        this.componentId = str;
        this.context = context;
        this.host = obj;
        this.pageURL = str2;
        this.engineId = str3;
        this.serviceDelegate = baseServiceDelegate;
    }

    public static /* synthetic */ Object ipc$super(BaseOuterComponent baseOuterComponent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/component/BaseOuterComponent");
    }

    public final String getComponentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5df1a77", new Object[]{this});
        }
        return this.componentId;
    }

    public final OuterComponentType getComponentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OuterComponentType) ipChange.ipc$dispatch("76b607ea", new Object[]{this});
        }
        return this.componentType;
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.context;
    }

    public final String getEngineId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ca44c66", new Object[]{this});
        }
        return this.engineId;
    }

    public final Object getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d73a922d", new Object[]{this});
        }
        return this.host;
    }

    public final String getPageURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bea690f", new Object[]{this});
        }
        return this.pageURL;
    }

    public final BaseServiceDelegate getServiceDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseServiceDelegate) ipChange.ipc$dispatch("7b535739", new Object[]{this});
        }
        return this.serviceDelegate;
    }

    public void handleOuterMessage(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be86f4e7", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        tpu.a aVar = tpu.Companion;
        aVar.c(TAG, "处理外部消息，message=" + bVar + "，this=" + this);
    }
}
