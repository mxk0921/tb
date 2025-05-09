package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p85 implements ltb, ctb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f25939a;
    public q95 b;
    public k85 c;
    public boolean d;
    public boolean e;
    public DWLifecycleType f = DWLifecycleType.BEFORE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DWInteractiveVideoObject f25940a;

        public a(DWInteractiveVideoObject dWInteractiveVideoObject) {
            this.f25940a = dWInteractiveVideoObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!p85.a(p85.this)) {
                if (p85.b(p85.this) != null) {
                    p85.b(p85.this).f(this.f25940a);
                    p85.b(p85.this).t();
                }
                if (p85.c(p85.this) != null && p85.c(p85.this).getVideo() != null && p85.d(p85.this) != null) {
                    p85.c(p85.this).getVideo().l(p85.d(p85.this));
                    p85.d(p85.this).f(this.f25940a);
                    p85.d(p85.this).t();
                }
            }
        }
    }

    static {
        t2o.a(452985096);
        t2o.a(452985042);
        t2o.a(452985037);
    }

    public p85(DWContext dWContext, h85 h85Var) {
        this.f25939a = dWContext;
        this.b = new q95(dWContext, h85Var);
        this.c = new k85(dWContext, h85Var);
        dWContext.getVideo().l(this.b);
    }

    public static /* synthetic */ boolean a(p85 p85Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af83939e", new Object[]{p85Var})).booleanValue();
        }
        return p85Var.e;
    }

    public static /* synthetic */ q95 b(p85 p85Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q95) ipChange.ipc$dispatch("cc16aebc", new Object[]{p85Var});
        }
        return p85Var.b;
    }

    public static /* synthetic */ DWContext c(p85 p85Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("7a3dbbb3", new Object[]{p85Var});
        }
        return p85Var.f25939a;
    }

    public static /* synthetic */ k85 d(p85 p85Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k85) ipChange.ipc$dispatch("e435787a", new Object[]{p85Var});
        }
        return p85Var.c;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.e = true;
        q95 q95Var = this.b;
        if (q95Var != null) {
            q95Var.j();
            this.b = null;
        }
        k85 k85Var = this.c;
        if (k85Var != null) {
            k85Var.j();
            this.c = null;
        }
    }

    public final void f(DWInteractiveVideoObject dWInteractiveVideoObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7c45aa", new Object[]{this, dWInteractiveVideoObject});
        } else if (dWInteractiveVideoObject != null) {
            new Handler(Looper.getMainLooper()).post(new a(dWInteractiveVideoObject));
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc6828", new Object[]{this});
        } else if (this.f25939a.mInteractiveId != -1 && !this.d) {
            this.d = true;
            h();
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7dc576", new Object[]{this});
        } else {
            this.f25939a.queryInteractiveData(this, false);
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127138cd", new Object[]{this, new Boolean(z)});
        } else if (this.f == DWLifecycleType.MID) {
            if (z && !this.d) {
                g();
            }
            q95 q95Var = this.b;
            if (q95Var != null) {
                q95Var.q(z);
            }
            k85 k85Var = this.c;
            if (k85Var != null) {
                k85Var.q(z);
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684668ab", new Object[]{this});
            return;
        }
        q95 q95Var = this.b;
        if (q95Var != null) {
            q95Var.r();
        }
    }

    @Override // tb.ltb
    public void onError(DWResponse dWResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
        }
    }

    @Override // tb.ctb
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.f = dWLifecycleType;
        i(this.f25939a.isShowInteractive());
    }

    @Override // tb.ltb
    public void onSuccess(DWResponse dWResponse) {
        DWInteractiveVideoObject dWInteractiveVideoObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
            return;
        }
        JSONObject jSONObject = null;
        try {
            dWInteractiveVideoObject = g95.b(dWResponse);
        } catch (JSONException e) {
            e.printStackTrace();
            dWInteractiveVideoObject = null;
        }
        try {
            if (dWResponse.data.has("taokeRelation")) {
                jSONObject = dWResponse.data.getJSONObject("taokeRelation");
            }
            if (jSONObject != null) {
                HashMap hashMap = new HashMap();
                String optString = jSONObject.optString(BaseOuterComponent.b.SOURCE_COMPONENT_ID);
                if (!TextUtils.isEmpty(optString)) {
                    hashMap.put("taoke_sourceId", optString);
                }
                String string = jSONObject.getString("bizType");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put("taoke_bizType", string);
                }
                hashMap.put("taoke_accountId", Long.toString(this.f25939a.mUserId));
                if (!TextUtils.isEmpty(this.f25939a.mContentId)) {
                    hashMap.put("taoke_contentId", this.f25939a.mContentId);
                }
                this.f25939a.addUtParams(hashMap);
            }
        } catch (JSONException unused) {
        }
        f(dWInteractiveVideoObject);
    }
}
