package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.subscribe.SubscribeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jir extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLSUBSCRIBE = -4209146844715361136L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u8 f22015a;

        public a(jir jirVar, u8 u8Var) {
            this.f22015a = u8Var;
        }

        @Override // tb.jir.f
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad58ffcc", new Object[]{this, jSONObject});
            } else {
                this.f22015a.callback("failure", new f8(jSONObject));
            }
        }

        @Override // tb.jir.f
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isSubscribe", (Object) "true");
            this.f22015a.callback("success", new f8(jSONObject));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u8 f22016a;

        public b(jir jirVar, u8 u8Var) {
            this.f22016a = u8Var;
        }

        @Override // tb.jir.f
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad58ffcc", new Object[]{this, jSONObject});
            } else {
                this.f22016a.callback("failure", new f8(jSONObject));
            }
        }

        @Override // tb.jir.f
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isSubscribe", (Object) "false");
            this.f22016a.callback("success", new f8(jSONObject));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f22017a;

        public c(f fVar) {
            this.f22017a = fVar;
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
                return;
            }
            new StringBuilder("subscribeLiveTopic onNext getRetCode = ").append(subScribeCenterResultDTO.getRetCode());
            if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                f fVar = this.f22017a;
                if (fVar != null) {
                    try {
                        fVar.onSuccess();
                    } catch (Throwable unused) {
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(jk.KEY_RET_CODE, (Object) subScribeCenterResultDTO.getRetCode());
                jSONObject.put(jk.KEY_RET_MSG, (Object) subScribeCenterResultDTO.getRetMsg());
                this.f22017a.a(jSONObject);
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f22018a;

        public d(f fVar) {
            this.f22018a = fVar;
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
                return;
            }
            new StringBuilder("cancelSubscribe onNext getRetCode = ").append(subScribeCenterResultDTO.getRetCode());
            if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                f fVar = this.f22018a;
                if (fVar != null) {
                    try {
                        fVar.onSuccess();
                    } catch (Throwable unused) {
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(jk.KEY_RET_CODE, (Object) subScribeCenterResultDTO.getRetCode());
                jSONObject.put(jk.KEY_RET_MSG, (Object) subScribeCenterResultDTO.getRetMsg());
                this.f22018a.a(jSONObject);
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355382);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public jir build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jir) ipChange.ipc$dispatch("99567f5b", new Object[]{this, obj});
            }
            return new jir();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface f {
        void a(JSONObject jSONObject);

        void onSuccess();
    }

    static {
        t2o.a(806355377);
    }

    public static void i(String str, String str2, String str3, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762b02c1", new Object[]{str, str2, str3, fVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            SubscribeUtils.INSTANCE.cancelSubscribe(str, str3, null, str2, new d(fVar));
        }
    }

    public static /* synthetic */ Object ipc$super(jir jirVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/TBLSubscribeAbility");
    }

    public static void j(String str, String str2, String str3, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b5569b", new Object[]{str, str2, str3, fVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            SubscribeUtils.INSTANCE.doSubscribe(str, str3, null, str2, new c(fVar));
        }
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (!(n8Var == null || n8Var.h() == null)) {
            JSONObject h = n8Var.h();
            String string = h.getString("liveId");
            String string2 = h.getString("subFrom");
            String string3 = h.getString("activityType");
            boolean parseBoolean = Boolean.parseBoolean(h.getString("isSubscribe"));
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return new d8();
            }
            if (parseBoolean) {
                j(string, string2, string3, new a(this, u8Var));
            } else {
                i(string, string2, string3, new b(this, u8Var));
            }
        }
        return new d8();
    }
}
