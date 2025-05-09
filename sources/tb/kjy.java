package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.highlightcomment.SwitchData;
import com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kjy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ITaoLiveKtCommentSend f22715a;
    public WeakReference<a39> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final kjy f22716a = new kjy();

        static {
            t2o.a(295698677);
        }

        public static /* synthetic */ kjy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kjy) ipChange.ipc$dispatch("bc6e5a83", new Object[0]);
            }
            return f22716a;
        }
    }

    static {
        t2o.a(295698675);
    }

    public static kjy e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kjy) ipChange.ipc$dispatch("2784105d", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ xhv f(final SwitchData switchData, WeakReference weakReference, final niy niyVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7aa4a6b7", new Object[]{switchData, weakReference, niyVar, map});
        }
        if (map != null) {
            try {
                switchData.canSend = Boolean.valueOf(TextUtils.equals("true", (String) map.get("canSend")));
                switchData.reasonType = (String) map.get("reasonType");
                switchData.reason = (String) map.get("reason");
                switchData.shadingWord = (String) map.get("shadingWord");
                switchData.remainCommentCnt = (String) map.get("remainCommentCnt");
            } catch (Exception e) {
                o3s.b("HighLightCommentManager", e.getMessage());
            }
        } else {
            switchData.canSend = Boolean.FALSE;
        }
        View view = (View) weakReference.get();
        if (view == null) {
            return null;
        }
        view.post(new Runnable() { // from class: tb.jjy
            @Override // java.lang.Runnable
            public final void run() {
                kjy.g(niy.this, switchData);
            }
        });
        return null;
    }

    public static /* synthetic */ void g(niy niyVar, SwitchData switchData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995b6f48", new Object[]{niyVar, switchData});
        } else {
            niyVar.a(switchData);
        }
    }

    public void c() {
        a39 a39Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6660e2c3", new Object[]{this});
            return;
        }
        WeakReference<a39> weakReference = this.b;
        if (weakReference != null && (a39Var = weakReference.get()) != null && a39Var.isShowing()) {
            a39Var.dismiss();
        }
    }

    public void d(final niy niyVar, final WeakReference<View> weakReference) {
        ITaoLiveKtCommentSend iTaoLiveKtCommentSend;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcfa8be", new Object[]{this, niyVar, weakReference});
            return;
        }
        h();
        final SwitchData switchData = new SwitchData();
        if (qjy.a() && (iTaoLiveKtCommentSend = this.f22715a) != null) {
            iTaoLiveKtCommentSend.fetchHighLightCommentSwitch(new g1a() { // from class: tb.hjy
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv f;
                    f = kjy.f(SwitchData.this, weakReference, niyVar, (Map) obj);
                    return f;
                }
            });
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509fcfc5", new Object[]{this});
        } else if (d9m.f() != null) {
            this.f22715a = d9m.f().getCommentSender();
        }
    }

    public boolean i(SwitchData switchData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd5ef01", new Object[]{this, switchData})).booleanValue();
        }
        if (switchData == null) {
            return false;
        }
        if (switchData.canSend.booleanValue() || "FREQUENCY_LIMIT".equals(switchData.reasonType)) {
            return true;
        }
        return false;
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef715c5", new Object[]{this, new Boolean(z)});
            return;
        }
        h();
        ITaoLiveKtCommentSend iTaoLiveKtCommentSend = this.f22715a;
        if (iTaoLiveKtCommentSend != null) {
            iTaoLiveKtCommentSend.updateHighLightCommentSwitch(z);
        }
    }

    public kjy() {
    }

    public void j(Context context, TBLiveDataModel tBLiveDataModel, SwitchData switchData) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c15485e6", new Object[]{this, context, tBLiveDataModel, switchData});
        } else if (tBLiveDataModel != null && switchData != null && context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
            }
            WeakReference<a39> weakReference = this.b;
            a39 a39Var = weakReference != null ? weakReference.get() : null;
            if (a39Var == null || !a39Var.isShowing()) {
                a39Var = new a39(context, tBLiveDataModel, false);
                this.b = new WeakReference<>(a39Var);
            }
            a39Var.l(true);
            a39Var.m((JSONObject) fkx.h(switchData));
            try {
                a39Var.show();
            } catch (Exception e) {
                o3s.b("HighLightCommentManager", e.getMessage());
            }
            HashMap hashMap = new HashMap();
            if (TextUtils.equals(switchData.reasonType, "NO_FOLLOW")) {
                str = "关注并设为最爱主播";
            } else {
                str = "设为最爱主播";
            }
            hashMap.put("btn_name", str);
            qjy.e("ArrestComment_GuideLayer", hashMap);
        }
    }
}
