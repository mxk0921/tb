package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final vfl f29983a = new vfl();

        static {
            t2o.a(502268310);
        }

        public static /* synthetic */ vfl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vfl) ipChange.ipc$dispatch("c51d59c8", new Object[0]);
            }
            return f29983a;
        }
    }

    static {
        t2o.a(502268308);
        t2o.a(502268295);
    }

    public static vfl b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vfl) ipChange.ipc$dispatch("3b8a7da2", new Object[0]);
        }
        return b.a();
    }

    public JSONObject a(JSONObject jSONObject, prj prjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("22699bfd", new Object[]{this, jSONObject, prjVar});
        }
        tfs.e("ND_VideoControllerManager", "nd decideVideoResources 调用码率决策的方法，决策前播控,videoResourceObj:" + jSONObject);
        JSONObject c = VideoControllerManager.c(jSONObject, prjVar, false, true);
        tfs.e("ND_VideoControllerManager", "nd decideVideoResources 调用码率决策的方法，决策后播控,decideVideoResObj:" + c);
        return c;
    }

    public vfl() {
    }
}
