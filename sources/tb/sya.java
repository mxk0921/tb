package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sya {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_REPLAY_UPDATE = "isReplayUpdate";

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28361a = d4s.e("enableSaveReplayPlayerInfo", true);
    public final boolean b = d4s.e("enableUrlSaveReplayPlayerInfo", true);
    public final ux9 c;
    public q1o d;

    static {
        t2o.a(779093502);
    }

    public sya(ux9 ux9Var) {
        this.c = ux9Var;
    }

    public static boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c45a8488", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return h(str).equals(h(str2));
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd307b73", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(h1p.HTTP_PREFIX)) {
            return str.substring(7);
        }
        if (str.startsWith(h1p.HTTPS_PREFIX)) {
            return str.substring(8);
        }
        return str;
    }

    public String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf937943", new Object[]{this, str, map});
        }
        if (!this.f28361a || map == null) {
            return null;
        }
        q1o f = f();
        this.d = null;
        if (f == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str) && (str.contains("replayCurrentPosition") || str.contains(yj4.PARAM_HOLD_REPLAY_URL))) {
            return qnv.c(qnv.c(str, "replayCurrentPosition", String.valueOf(f.c)), yj4.PARAM_HOLD_REPLAY_URL, f.f26450a);
        }
        map.put("replayCurrentPosition", String.valueOf(f.c));
        map.put(yj4.PARAM_HOLD_REPLAY_URL, Uri.encode(f.f26450a));
        return qnv.a(str, map);
    }

    public void b(View view, VideoInfo videoInfo, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3612c2", new Object[]{this, view, videoInfo, new Long(j)});
        } else if (this.f28361a && this.b && view != null) {
            q1o q1oVar = new q1o();
            q1oVar.c = j;
            if (videoInfo != null) {
                q1oVar.f26450a = videoInfo.replayUrl;
                q1oVar.b = videoInfo.bizCode;
            }
            view.setTag(R.id.taolive_player_replay_info, q1oVar);
            o3s.b("HoldReplayBackPlayer", "addReplayInfoUrlInView");
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7efdaeba", new Object[]{this, str});
        }
        if (!this.f28361a || !this.b || TextUtils.isEmpty(str)) {
            return null;
        }
        j();
        HashMap hashMap = new HashMap();
        o3s.b("HoldReplayBackPlayer", "addReplayInfoUrlQueryParams");
        return a(str, hashMap);
    }

    public String d(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d62f1caf", new Object[]{this, view, str});
        }
        if (this.f28361a && this.b && !TextUtils.isEmpty(str) && view != null) {
            int i = R.id.taolive_player_replay_info;
            Object tag = view.getTag(i);
            if (tag instanceof q1o) {
                this.d = (q1o) tag;
                view.setTag(i, null);
                return a(str, new HashMap());
            }
            o3s.b("HoldReplayBackPlayer", "addReplayInfoUrlQueryParams");
        }
        return str;
    }

    public final q1o f() {
        q1o q1oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q1o) ipChange.ipc$dispatch("7a2dcaeb", new Object[]{this});
        }
        ux9 ux9Var = this.c;
        if ((ux9Var instanceof cdr) && (q1oVar = ((cdr) ux9Var).l0) != null) {
            this.d = q1oVar;
            o3s.b("HoldReplayBackPlayer", "获取回放信息:" + q1oVar.toString());
        }
        return this.d;
    }

    public q1o g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q1o) ipChange.ipc$dispatch("77bcb811", new Object[]{this});
        }
        if (!this.f28361a) {
            return null;
        }
        ux9 ux9Var = this.c;
        if ((ux9Var instanceof cdr) && ((cdr) ux9Var).w0() != null) {
            RecModel V0 = ((cdr) this.c).w0();
            if (tz3.b(V0.initParams)) {
                return null;
            }
            this.d = new q1o();
            String str = V0.initParams.get("replayCurrentPosition");
            q1o q1oVar = this.d;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            q1oVar.c = Long.parseLong(str);
            this.d.f26450a = Uri.decode(V0.initParams.get(yj4.PARAM_HOLD_REPLAY_URL));
            o3s.b("HoldReplayBackPlayer", "获取回放信息:" + this.d.toString());
        }
        return this.d;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22e4603", new Object[]{this});
        } else if (this.f28361a) {
            ux9 ux9Var = this.c;
            if (ux9Var instanceof cdr) {
                if (((cdr) ux9Var).w0() != null) {
                    RecModel V0 = ((cdr) this.c).w0();
                    if (!tz3.b(V0.initParams)) {
                        V0.initParams.remove("replayCurrentPosition");
                        V0.initParams.remove(yj4.PARAM_HOLD_REPLAY_URL);
                    } else {
                        return;
                    }
                }
                this.d = null;
                ((cdr) this.c).l0 = null;
                o3s.b("HoldReplayBackPlayer", "移除回放信息");
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed5791a", new Object[]{this});
        } else if (this.f28361a && (this.c instanceof cdr)) {
            q1o q1oVar = new q1o();
            if (this.c.x() != null) {
                q1oVar.c = this.c.x().getCurrentPosition();
                q1oVar.d = this.c.x();
            }
            VideoInfo c0 = up6.c0(this.c);
            if (c0 != null) {
                q1oVar.f26450a = c0.replayUrl;
                q1oVar.b = c0.bizCode;
            }
            ((cdr) this.c).l0 = q1oVar;
            o3s.b("HoldReplayBackPlayer", "保存回放信息:" + q1oVar.toString());
        }
    }
}
