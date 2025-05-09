package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x5l implements z3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final w3d f31159a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qt9 f31160a;

        public a(qt9 qt9Var) {
            this.f31160a = qt9Var;
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            }
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            x5l.g(x5l.this, true);
            sjr.g().c(uyg.EVENT_ACTION_FOLLOW, this.f31160a.f26917a, x5l.h(x5l.this).getUniStr());
            Context context = x5l.h(x5l.this).getContext();
            if (x5l.i(x5l.h(x5l.this))) {
                kiv.a(context, "关注成功", true);
            } else {
                kiv.c(context, "关注成功");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qt9 f31161a;

        public b(qt9 qt9Var) {
            this.f31161a = qt9Var;
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            }
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            sjr.g().c(uyg.EVENT_ACTION_UNFOLLOW, this.f31161a.f26917a, x5l.h(x5l.this).getUniStr());
            Context context = x5l.h(x5l.this).getContext();
            if (x5l.i(x5l.h(x5l.this))) {
                kiv.a(context, "取消关注成功", false);
            } else {
                kiv.c(context, "取消关注成功");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements ISmallWindowStrategy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q4q f31162a;

        public c(x5l x5lVar, q4q q4qVar) {
            this.f31162a = q4qVar;
        }

        @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
        public void onSmallWindowClick(View view, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("265e0e99", new Object[]{this, view, str, str2, str3});
                return;
            }
            q4q q4qVar = this.f31162a;
            if (q4qVar != null) {
                q4qVar.onSmallWindowClick(view, str, str2, str3);
            }
        }
    }

    static {
        t2o.a(779093050);
        t2o.a(806355746);
    }

    public x5l(w3d w3dVar) {
        this.f31159a = w3dVar;
    }

    public static /* synthetic */ void g(x5l x5lVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555077e", new Object[]{x5lVar, new Boolean(z)});
        } else {
            x5lVar.k(z);
        }
    }

    public static /* synthetic */ w3d h(x5l x5lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w3d) ipChange.ipc$dispatch("3929e75a", new Object[]{x5lVar});
        }
        return x5lVar.f31159a;
    }

    public static /* synthetic */ boolean i(w3d w3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d7f98be", new Object[]{w3dVar})).booleanValue();
        }
        return j(w3dVar);
    }

    public static boolean j(w3d w3dVar) {
        cba globalContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa5eddc9", new Object[]{w3dVar})).booleanValue();
        }
        if (w3dVar == null || (globalContext = w3dVar.getGlobalContext()) == null || globalContext.r() == null || globalContext.r().abilityCompontent == null || !((ibt) globalContext.r().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedToast)) {
            return false;
        }
        return true;
    }

    @Override // tb.z3d
    public VideoInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("5c4fa617", new Object[]{this});
        }
        w3d w3dVar = this.f31159a;
        if (w3dVar == null || w3dVar.getTBLiveBizDataModel() == null) {
            return null;
        }
        return this.f31159a.getTBLiveBizDataModel().mVideoInfo;
    }

    @Override // tb.z3d
    public void b(String str, String str2, String str3) {
        w3d w3dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ad806b", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && (w3dVar = this.f31159a) != null && w3dVar.getRecModel() != null && !TextUtils.isEmpty(this.f31159a.getRecModel().accountId) && str.equals(this.f31159a.getRecModel().accountId)) {
            qt9 qt9Var = new qt9();
            qt9Var.f26917a = this.f31159a.getRecModel().accountId;
            qt9Var.c = this.f31159a.getRecModel().liveId;
            if (v2s.o().k() != null) {
                v2s.o().k().f(qt9Var, new a(qt9Var));
            }
        }
    }

    @Override // tb.z3d
    public void c(String str, String str2, String str3) {
        w3d w3dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59b963a", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && (w3dVar = this.f31159a) != null && w3dVar.getRecModel() != null && !TextUtils.isEmpty(this.f31159a.getRecModel().accountId) && str.equals(this.f31159a.getRecModel().accountId)) {
            qt9 qt9Var = new qt9();
            qt9Var.f26917a = this.f31159a.getRecModel().accountId;
            qt9Var.c = this.f31159a.getRecModel().liveId;
            v2s.o().k().h(qt9Var, new b(qt9Var));
        }
    }

    @Override // tb.z3d
    public void d(q4q q4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9493fec", new Object[]{this, q4qVar});
            return;
        }
        w3d w3dVar = this.f31159a;
        if (w3dVar == null) {
            return;
        }
        if (q4qVar != null) {
            w3dVar.setSmallWindowClickListener(new c(this, q4qVar));
        } else {
            w3dVar.setSmallWindowClickListener(null);
        }
    }

    @Override // tb.z3d
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30597a8f", new Object[]{this});
            return;
        }
        w3d w3dVar = this.f31159a;
        if (w3dVar != null) {
            w3dVar.reportRequest();
        }
    }

    @Override // tb.z3d
    public Object f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("28725e7", new Object[]{this});
        }
        w3d w3dVar = this.f31159a;
        if (w3dVar != null) {
            return w3dVar.getUtParams();
        }
        return null;
    }

    public final void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aae8c41", new Object[]{this, new Boolean(z)});
        } else {
            l(z);
        }
    }

    public void l(boolean z) {
        TBLiveBizDataModel tBLiveBizDataModel;
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8416e2d", new Object[]{this, new Boolean(z)});
            return;
        }
        w3d w3dVar = this.f31159a;
        if (w3dVar != null && (tBLiveBizDataModel = w3dVar.getTBLiveBizDataModel()) != null && (videoInfo = tBLiveBizDataModel.mVideoInfo) != null && !videoInfo.isOfficialType() && (accountInfo = tBLiveBizDataModel.mVideoInfo.broadCaster) != null) {
            accountInfo.follow = z;
            if (!z) {
                accountInfo.topFollow = false;
            }
        }
    }

    @Override // tb.z3d
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        w3d w3dVar = this.f31159a;
        if (w3dVar != null) {
            w3dVar.mute(z);
        }
    }

    @Override // tb.z3d
    public void needPresentAvatarPage(Map<String, String> map) {
        w3d w3dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27bd5651", new Object[]{this, map});
        } else if (map != null && (w3dVar = this.f31159a) != null) {
            w3dVar.needPresentAvatarPage(map);
        }
    }

    @Override // tb.z3d
    public void setContainerOffset(JSONObject jSONObject) {
        w3d w3dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03b86d7", new Object[]{this, jSONObject});
            return;
        }
        x5t.d("OpenPlatformListener", "沉浸式设置，OpenPlatformListener收到setContainerOffset，offsetMap = " + jSONObject);
        if (!tz3.b(jSONObject) && (w3dVar = this.f31159a) != null) {
            w3dVar.setContainerOffset(jSONObject);
        }
    }

    @Override // tb.z3d
    public void updateUserTrackData(Map<String, String> map) {
        w3d w3dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829410bd", new Object[]{this, map});
        } else if (map != null && (w3dVar = this.f31159a) != null) {
            w3dVar.updateUserTrackData(map);
        }
    }
}
