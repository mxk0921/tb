package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sxw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f28349a;
    public final VideoInfo b;
    public FrameLayout c;
    public final ukr d;
    public final String e;
    public DXRootView f;

    static {
        t2o.a(295700006);
    }

    public sxw(String str, Context context, ux9 ux9Var, VideoInfo videoInfo, ukr ukrVar) {
        this.e = str;
        this.f28349a = context;
        this.b = videoInfo;
        this.d = ukrVar;
    }

    public static boolean b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764b7912", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null || (videoInfo.newRoomType & 256) != 256) {
            return false;
        }
        return true;
    }

    public void c(ViewStub viewStub, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8e5f97", new Object[]{this, viewStub, new Boolean(z)});
        } else if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.taolive_room_interactive_system_component_flexalocal);
            this.c = (FrameLayout) viewStub.inflate();
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea00e3", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                if (this.f != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("watchNum", (Object) str);
                    ll6.e(this.d, this.f, jSONObject, this.e);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            DXRootView b = ll6.b(this.d, this.f28349a, "taolive_watch_num");
            this.f = b;
            if (b != null) {
                this.c.addView(b);
                int b2 = hw0.b(this.f28349a, 3.0f);
                this.c.setPadding(b2, 0, b2, 0);
                JSONObject jSONObject = new JSONObject();
                VideoInfo videoInfo = this.b;
                if (videoInfo != null) {
                    if (b(videoInfo)) {
                        str = this.b.taolivePvFormat;
                    } else {
                        str = this.b.viewCountFormat;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = "0";
                    }
                    jSONObject.put("watchNum", (Object) str);
                }
                ll6.e(this.d, this.f, jSONObject, this.e);
            }
        } catch (Exception unused) {
        }
    }
}
