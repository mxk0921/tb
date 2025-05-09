package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nei {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MEDIA_INFO_MEDIA_DATA = "mediaData";
    public static final String MEDIA_INFO_REPLAY_URL = "replayUrl";

    /* renamed from: a  reason: collision with root package name */
    public final boolean f24681a;
    public final JSONObject b;
    public final boolean c;

    static {
        t2o.a(779093128);
    }

    public nei() {
        this.f24681a = false;
        this.c = false;
        this.b = null;
    }

    public static nei a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nei) ipChange.ipc$dispatch("55688de2", new Object[0]);
        }
        return new nei();
    }

    public static nei b(MediaData mediaData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nei) ipChange.ipc$dispatch("94b6f5d0", new Object[]{mediaData});
        }
        return new nei(mediaData);
    }

    public static nei c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nei) ipChange.ipc$dispatch("8b41e72b", new Object[]{str});
        }
        return new nei(str);
    }

    public MediaData d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("8f7a415f", new Object[]{this});
        }
        return (MediaData) this.b.get(MEDIA_INFO_MEDIA_DATA);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40487ce7", new Object[]{this});
        }
        return this.b.getString("replayUrl");
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46a9900c", new Object[]{this})).booleanValue();
        }
        return this.f24681a;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public nei(String str) {
        JSONObject jSONObject = new JSONObject();
        this.b = jSONObject;
        this.f24681a = true;
        if (!yqq.e(str)) {
            jSONObject.put("replayUrl", (Object) str);
            this.c = true;
            return;
        }
        this.c = false;
    }

    public nei(MediaData mediaData) {
        ArrayList<MediaData.QualityLiveItem> arrayList;
        JSONObject jSONObject = new JSONObject();
        this.b = jSONObject;
        this.f24681a = false;
        if (mediaData == null || (arrayList = mediaData.liveUrlList) == null || arrayList.isEmpty()) {
            this.c = false;
            return;
        }
        jSONObject.put(MEDIA_INFO_MEDIA_DATA, (Object) mediaData);
        this.c = true;
    }
}
