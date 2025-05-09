package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class afa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String c = "GoodLiveInfo";

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f15709a;
    public VideoInfo b;

    static {
        t2o.a(295699279);
    }

    public afa(VideoInfo videoInfo) {
        h(videoInfo);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public String b() {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("308bb293", new Object[]{this});
        }
        VideoInfo videoInfo = this.b;
        if (videoInfo == null || (accountInfo = videoInfo.broadCaster) == null) {
            return "";
        }
        return accountInfo.accountId;
    }

    public List<VideoInfo.ExtraGoodsTabItem> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7a84d469", new Object[]{this});
        }
        VideoInfo videoInfo = this.b;
        if (videoInfo == null) {
            return null;
        }
        return videoInfo.extraGoodsTabList;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9789e5b5", new Object[]{this})).booleanValue();
        }
        return this.f15709a;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d70f5ea0", new Object[]{this});
        }
        VideoInfo videoInfo = this.b;
        if (videoInfo == null) {
            return new JSONObject();
        }
        return videoInfo.itemConfigInfo;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        VideoInfo videoInfo = this.b;
        if (videoInfo == null) {
            return "";
        }
        return videoInfo.liveId;
    }

    public JSONArray g() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("45bf5e03", new Object[]{this});
        }
        VideoInfo videoInfo = this.b;
        if (videoInfo == null || (jSONObject = videoInfo.clientInteracts) == null) {
            return new JSONArray();
        }
        return jSONObject.getJSONArray("simpleRight");
    }

    public final void h(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a679c56", new Object[]{this, videoInfo});
            return;
        }
        this.b = videoInfo;
        if (videoInfo == null) {
            hha.b(c, "init | videoInfo is null.");
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a92f5f", new Object[]{this, str});
        }
    }
}
