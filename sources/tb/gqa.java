package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gqa extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long HSHOWPOP = 3196545303523394880L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IPopViewService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u8 f20168a;
        public final /* synthetic */ String b;
        public final /* synthetic */ g3b c;

        public a(gqa gqaVar, u8 u8Var, String str, g3b g3bVar) {
            this.f20168a = u8Var;
            this.b = str;
            this.c = g3bVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService.a
        public void a(String str, Object obj, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64db83b", new Object[]{this, str, obj, jSONObject});
            } else if (this.f20168a != null) {
                IPopData<PopSectionModel> a2 = tgm.a(obj);
                if (a2 == null) {
                    vfm.f("HShowPopAbility", "pop data invalid");
                } else if (TextUtils.equals(a2.getBusinessID(), this.b)) {
                    vfm.f("HShowPopAbility", "receive message: " + str);
                    if (TextUtils.equals(str, "sourceCallback") && jSONObject != null) {
                        String string = jSONObject.getString("sourceMethod");
                        if (!TextUtils.isEmpty(string)) {
                            this.f20168a.callback(string, new f8());
                            vfm.f("HShowPopAbility", "dx callback, method name: " + string);
                        }
                    } else if (yhm.c(str)) {
                        this.c.c(this);
                        vfm.f("HShowPopAbility", "remove pop message listener");
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729808999);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public gqa build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gqa) ipChange.ipc$dispatch("fb6099b8", new Object[]{this, obj});
            }
            return new gqa();
        }
    }

    static {
        t2o.a(729808997);
    }

    public static /* synthetic */ Object ipc$super(gqa gqaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/ability/HShowPopAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (n8Var == null || tk6Var == null) {
            vfm.f("HShowPopAbility", "ability params invalid");
            return null;
        } else if (tk6Var.p() == null) {
            vfm.f("HShowPopAbility", "dx runtime is null");
            return null;
        } else {
            JSONObject g = n8Var.g(u59.KEY_POPDATA);
            if (g == null) {
                vfm.f("HShowPopAbility", "popData is null");
                return null;
            }
            IPopData<PopSectionModel> a2 = tgm.a(g);
            if (a2 == null || !a2.valid()) {
                vfm.f("HShowPopAbility", "popData is inValid");
                return null;
            }
            int trigger = a2.getPopConfig().getTrigger();
            String businessID = a2.getBusinessID();
            g3b g3bVar = new g3b();
            g3bVar.a(new a(this, u8Var, businessID, g3bVar));
            g3bVar.d(trigger, g);
            vfm.f("HShowPopAbility", "trigger pop show: " + businessID);
            return new f8();
        }
    }
}
