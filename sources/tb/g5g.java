package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.a;
import com.taobao.kirinvideoengine.model.ConfigModel;
import com.taobao.kirinvideoengine.model.EngineModel;
import com.taobao.kirinvideoengine.model.MediaModel;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g5g implements g9e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final EngineModel f19737a;
    public boolean b;
    public String c;
    public String d;
    public String e;
    public final String f;

    static {
        t2o.a(352321654);
        t2o.a(352321651);
    }

    public g5g(JSONObject jSONObject, a aVar) {
        if (jSONObject != null) {
            this.f19737a = new EngineModel();
            this.f = jSONObject.getString("type");
            n(jSONObject.getJSONObject("config"));
            o(jSONObject.getJSONObject("data"), jSONObject.getJSONObject("config"), aVar);
        }
    }

    @Override // tb.g9e
    public String a() {
        MediaModel mediaModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("534d0fb9", new Object[]{this});
        }
        EngineModel engineModel = this.f19737a;
        if (engineModel == null || (mediaModel = engineModel.mediaModel) == null) {
            return null;
        }
        return mediaModel.videoSource;
    }

    @Override // tb.g9e
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55e95e49", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.g9e
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fbbbc30", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // tb.g9e
    public boolean d() {
        MediaModel mediaModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("382b6ad8", new Object[]{this})).booleanValue();
        }
        EngineModel engineModel = this.f19737a;
        if (engineModel == null || (mediaModel = engineModel.mediaModel) == null) {
            return false;
        }
        return mediaModel.autoPlay;
    }

    @Override // tb.g9e
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c975bb1", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.g9e
    public boolean f() {
        ConfigModel configModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b810f5a0", new Object[]{this})).booleanValue();
        }
        EngineModel engineModel = this.f19737a;
        if (engineModel == null || (configModel = engineModel.configModel) == null) {
            return false;
        }
        return configModel.enableVideoTBPlayer;
    }

    @Override // tb.g9e
    public org.json.JSONObject g() {
        MediaModel mediaModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("b299ddf9", new Object[]{this});
        }
        EngineModel engineModel = this.f19737a;
        if (engineModel == null || (mediaModel = engineModel.mediaModel) == null) {
            return null;
        }
        return mediaModel.videoResourceObj;
    }

    @Override // tb.g9e
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.g9e
    public String getVideoId() {
        MediaModel mediaModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        EngineModel engineModel = this.f19737a;
        if (engineModel == null || (mediaModel = engineModel.mediaModel) == null) {
            return null;
        }
        return mediaModel.videoId;
    }

    @Override // tb.g9e
    public String h() {
        MediaModel mediaModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this});
        }
        EngineModel engineModel = this.f19737a;
        if (engineModel == null || (mediaModel = engineModel.mediaModel) == null) {
            return null;
        }
        return mediaModel.contentId;
    }

    @Override // tb.g9e
    public String i() {
        MediaModel mediaModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f420c99", new Object[]{this});
        }
        EngineModel engineModel = this.f19737a;
        if (engineModel == null || (mediaModel = engineModel.mediaModel) == null) {
            return null;
        }
        return mediaModel.videoPlayScenes;
    }

    @Override // tb.g9e
    public boolean isDataValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3663cf3", new Object[]{this})).booleanValue();
        }
        EngineModel engineModel = this.f19737a;
        if (engineModel == null || engineModel.mediaModel == null) {
            return false;
        }
        return true;
    }

    @Override // tb.g9e
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33f8aa04", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.g9e
    public boolean k() {
        ConfigModel configModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c25b6f53", new Object[]{this})).booleanValue();
        }
        EngineModel engineModel = this.f19737a;
        if (engineModel == null || (configModel = engineModel.configModel) == null) {
            return false;
        }
        return configModel.enablePreDownload;
    }

    @Override // tb.g9e
    public boolean l() {
        MediaModel mediaModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43fb47a", new Object[]{this})).booleanValue();
        }
        EngineModel engineModel = this.f19737a;
        if (engineModel == null || (mediaModel = engineModel.mediaModel) == null) {
            return false;
        }
        return mediaModel.enableSurfaceView;
    }

    public EngineModel m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EngineModel) ipChange.ipc$dispatch("3f0ec7a0", new Object[]{this});
        }
        return this.f19737a;
    }

    public final void n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d427dc94", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                ConfigModel.a aVar = new ConfigModel.a();
                aVar.k(jSONObject.getBooleanValue("enablePreDownload")).j(false).l("true".equals(jSONObject.getString("enableVideoStandard")));
                this.f19737a.configModel = aVar.i();
                this.b = jSONObject.getBooleanValue("p2ff");
            } catch (Exception e) {
                txj.f("new_detail异常", "解析视频数据config异常", e);
            }
        }
    }

    public final void o(JSONObject jSONObject, JSONObject jSONObject2, a aVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe37e5f", new Object[]{this, jSONObject, jSONObject2, aVar});
        } else if (jSONObject != null) {
            try {
                this.c = jSONObject.getString("dimension");
                JSONObject jSONObject3 = jSONObject.getJSONArray("data").getJSONObject(0);
                this.d = jSONObject3.getString("videoThumbnailURL");
                MediaModel.b bVar = new MediaModel.b(jSONObject3.getString("videoId"));
                org.json.JSONObject jSONObject4 = null;
                try {
                    String string = jSONObject3.getString("videoResourceStr");
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject4 = new org.json.JSONObject(string);
                    }
                } catch (Exception e) {
                    txj.f("new_detail异常", "解析视频数据播控异常", e);
                }
                bVar.d0(jSONObject4).M(true).N(true).S(true).f0(jSONObject3.getString("url")).e0(jSONObject3.getString("videoSource")).c0(jSONObject3.getString(a7m.VIDEO_PLAY_SCENES)).W(jSONObject3.getString("source")).H("nd").Y(jSONObject3.getString("type")).J(jSONObject3.getString("contentId")).T("DWVideo");
                if (jSONObject2 != null) {
                    if (Build.VERSION.SDK_INT < 24 || "false".equals(jSONObject2.getString("enableSurfaceView"))) {
                        z = false;
                    }
                    bVar.O(z).F(jSONObject2.getBooleanValue(Constants.Name.AUTO_PLAY)).U(Boolean.valueOf(jSONObject2.getBooleanValue("muted")));
                }
                if (aVar != null) {
                    bVar.P(Boolean.valueOf(aVar.k()));
                }
                this.f19737a.mediaModel = bVar.G();
                this.e = jSONObject.getString("bottomAreaHeight");
            } catch (Exception e2) {
                txj.f("new_detail异常", "解析视频数据data异常", e2);
            }
        }
    }
}
